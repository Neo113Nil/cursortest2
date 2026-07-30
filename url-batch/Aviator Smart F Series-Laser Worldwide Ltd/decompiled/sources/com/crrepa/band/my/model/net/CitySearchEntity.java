package com.crrepa.band.my.model.net;

/* loaded from: classes2.dex */
public class CitySearchEntity {
    private String city;
    private String country;
    private double lat;
    private double lon;
    private String qualifiedName;
    private int woeid;

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public double getLat() {
        return this.lat;
    }

    public double getLon() {
        return this.lon;
    }

    public String getQualifiedName() {
        return this.qualifiedName;
    }

    public int getWoeid() {
        return this.woeid;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setCountry(String str) {
        this.country = str;
    }

    public void setLat(double d8) {
        this.lat = d8;
    }

    public void setLon(double d8) {
        this.lon = d8;
    }

    public void setQualifiedName(String str) {
        this.qualifiedName = str;
    }

    public void setWoeid(int i8) {
        this.woeid = i8;
    }
}
