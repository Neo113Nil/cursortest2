package com.crrepa.band.my.profile.strava.model;

/* loaded from: classes2.dex */
public class GPXContentBean {
    private final double altitude;
    private double latitude;
    private double longitude;
    private final float speed;
    private final long timestamp;

    public GPXContentBean(double d8, double d9, double d10, long j8, float f8) {
        this.latitude = d8;
        this.longitude = d9;
        this.altitude = d10;
        this.timestamp = j8;
        this.speed = f8;
    }

    public double getAltitude() {
        return this.altitude;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public float getSpeed() {
        return this.speed;
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }
}
