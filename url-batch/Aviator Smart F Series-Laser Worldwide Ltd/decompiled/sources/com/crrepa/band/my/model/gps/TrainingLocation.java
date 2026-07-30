package com.crrepa.band.my.model.gps;

/* loaded from: classes2.dex */
public class TrainingLocation {
    public static final double PAUSE_POINT = 0.0d;
    private double altitude;
    private double latitude;
    private double longitude;
    private float speed;
    private long timestamp;

    public TrainingLocation(double d8, double d9, double d10, long j8, float f8) {
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

    public void setAltitude(double d8) {
        this.altitude = d8;
    }

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }

    public void setSpeed(float f8) {
        this.speed = f8;
    }

    public void setTimestamp(long j8) {
        this.timestamp = j8;
    }

    public String toString() {
        return "TrainingLocation{latitude=" + this.latitude + ", longitude=" + this.longitude + ", altitude=" + this.altitude + ", timestamp=" + this.timestamp + ", speed=" + this.speed + '}';
    }
}
