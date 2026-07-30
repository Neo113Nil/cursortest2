package com.crrepa.ble.spp.hisilicon.write.map.bean;

/* loaded from: classes3.dex */
public class LocationBean {
    private double latitude;
    private double longitude;

    public LocationBean(double d8, double d9) {
        this.latitude = d8;
        this.longitude = d9;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }

    public String toString() {
        return "LocationBean{longitude=" + this.longitude + ", latitude=" + this.latitude + '}';
    }
}
