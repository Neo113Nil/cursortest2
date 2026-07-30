package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPWorldClockInfo {
    private String city;
    private byte id;
    private int jetLag;
    private double latitude;
    private double longitude;
    private int timeZone;

    public String getCity() {
        return this.city;
    }

    public byte getId() {
        return this.id;
    }

    public int getJetLag() {
        return this.jetLag;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int getTimeZone() {
        return this.timeZone;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setId(byte b8) {
        this.id = b8;
    }

    public void setJetLag(int i8) {
        this.jetLag = i8;
    }

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }

    public void setTimeZone(int i8) {
        this.timeZone = i8;
    }

    public String toString() {
        return "CRPWorldClockInfo{id=" + ((int) this.id) + ", timeZone=" + this.timeZone + ", longitude=" + this.longitude + ", latitude=" + this.latitude + ", jetLag=" + this.jetLag + ", city='" + this.city + "'}";
    }
}
