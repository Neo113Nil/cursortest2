package B2;

/* loaded from: classes.dex */
public final class a {
    private Float accuracy;
    private Boolean bg;
    private Double lat;
    private Double log;
    private Long timeStamp;
    private Integer type;

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final Boolean getBg() {
        return this.bg;
    }

    public final Double getLat() {
        return this.lat;
    }

    public final Double getLog() {
        return this.log;
    }

    public final Long getTimeStamp() {
        return this.timeStamp;
    }

    public final Integer getType() {
        return this.type;
    }

    public final void setAccuracy(Float f7) {
        this.accuracy = f7;
    }

    public final void setBg(Boolean bool) {
        this.bg = bool;
    }

    public final void setLat(Double d7) {
        this.lat = d7;
    }

    public final void setLog(Double d7) {
        this.log = d7;
    }

    public final void setTimeStamp(Long l7) {
        this.timeStamp = l7;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public String toString() {
        return "LocationPoint{lat=" + this.lat + ", log=" + this.log + ", accuracy=" + this.accuracy + ", type=" + this.type + ", bg=" + this.bg + ", timeStamp=" + this.timeStamp + '}';
    }
}
