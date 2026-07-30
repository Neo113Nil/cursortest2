package com.crrepa.band.my.model.db;

/* loaded from: classes2.dex */
public class LocationCity {
    public static final int LOCATION_AMAP = 1;
    public static final int LOCATION_GOOGLE = 2;
    private String city;
    private String country;
    private Long id;
    private Double latitude;
    private Double longitude;
    private Integer type;
    private Integer woeid;

    public LocationCity(Long l8, String str, String str2, Double d8, Double d9, Integer num, Integer num2) {
        this.id = l8;
        this.city = str;
        this.country = str2;
        this.latitude = d8;
        this.longitude = d9;
        this.woeid = num;
        this.type = num2;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public Long getId() {
        return this.id;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public Integer getType() {
        return this.type;
    }

    public Integer getWoeid() {
        return this.woeid;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setId(Long l8) {
        this.id = l8;
    }

    public void setLatitude(Double d8) {
        this.latitude = d8;
    }

    public void setLongitude(Double d8) {
        this.longitude = d8;
    }

    public void setType(Integer num) {
        this.type = num;
    }

    public void setWoeid(Integer num) {
        this.woeid = num;
    }

    public LocationCity() {
    }
}
