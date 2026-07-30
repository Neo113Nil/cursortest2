package com.crrepa.ble.conn.bean;

/* loaded from: classes3.dex */
public class CRPMuslimLocationInfo {
    private double latitude;
    private double longitude;
    private int timezone;

    public CRPMuslimLocationInfo(double d8, double d9, int i8) {
        this.latitude = d8;
        this.longitude = d9;
        this.timezone = i8;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int getTimezone() {
        return this.timezone;
    }

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }

    public void setTimezone(int i8) {
        this.timezone = i8;
    }

    public String toString() {
        return "CRPMuslimLocationInfo{latitude=" + this.latitude + ", longitude=" + this.longitude + ", timezone=" + this.timezone + '}';
    }
}
