package cabinet;

public class CustomerDTO {

    CustomerDAO dao = new CustomerDAO();

    private int no;
    private String Sno;
    private String id;
    private String name;
    private String phone;
    private String regD;
    private String exD;
    private int period;
    private String warning;


    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }
    public String getSno() {
        return Sno;
    }

    public void setSno(String Sno) {
        this.Sno = Sno;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRegD() {
        return regD;
    }

    public void setRegD(String regD) {
        this.regD = regD;
    }

    public String getExD() {
        return exD;
    }

    public void setExD(String exD) {
        this.exD = exD;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }

    public CustomerDTO() {
    }

    public CustomerDTO(int no, String Sno, String id, String name,String phone,
                       String regD, String exD, int period, String warning ) {
        super();
        this.no=no;
        this.Sno=Sno;
        this.id=id;
        this.name=name;
        this.phone=phone;
        this.regD=regD;
        this.exD=exD;
        this.period=period;
        this.warning=warning;
    }

}
