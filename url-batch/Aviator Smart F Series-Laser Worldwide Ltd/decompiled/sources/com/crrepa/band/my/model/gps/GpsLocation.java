package com.crrepa.band.my.model.gps;

import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class GpsLocation {
    public static final double INVALID_POINT = 200.0d;
    public static final double PAUSE_POINT = 0.0d;
    private float accuracy;
    private double altitude;
    private boolean googleMap;
    private double latitude;
    private double longitude;
    private float speed;
    private long timestamp;

    public GpsLocation(boolean z7) {
        this.googleMap = z7;
    }

    public float getAccuracy() {
        return this.accuracy;
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

    public boolean isGoogleMap() {
        return this.googleMap;
    }

    public boolean isPause() {
        double d8 = this.latitude;
        return d8 == this.longitude && d8 == i.DOUBLE_EPSILON;
    }

    public void setAccuracy(float f8) {
        this.accuracy = f8;
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
}
