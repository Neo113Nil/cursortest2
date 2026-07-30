package com.crrepa.band.my.training.model;

/* loaded from: classes3.dex */
public class LocationCityInfo {
    public static final int AMAP_LOCATION_TYPE = 1;
    public static final int GOOGLE_LOCATION_TYPE = 2;
    private String city;
    private String country;
    private double latitude;
    private int locationType;
    private double longitude;
    private int woeid;

    public LocationCityInfo(int i8) {
        this.locationType = i8;
    }

    public String getCity() {
        return this.city;
    }

    public String getCountry() {
        return this.country;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public int getLocationType() {
        return this.locationType;
    }

    public double getLongitude() {
        return this.longitude;
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

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLocationType(int i8) {
        this.locationType = i8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }

    public void setWoeid(int i8) {
        this.woeid = i8;
    }
}
