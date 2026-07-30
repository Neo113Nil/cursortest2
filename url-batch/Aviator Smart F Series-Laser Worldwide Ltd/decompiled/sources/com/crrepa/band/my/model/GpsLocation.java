package com.crrepa.band.my.model;

import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class GpsLocation {
    public static final double INVALID_POINT = 200.0d;
    public static final double PAUSE_POINT = 0.0d;
    private double latitude;
    private double longitude;

    public GpsLocation(double d8, double d9) {
        this.latitude = d8;
        this.longitude = d9;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public boolean isInvalid() {
        double d8 = this.latitude;
        return d8 == this.longitude && d8 == 200.0d;
    }

    public boolean isPause() {
        double d8 = this.latitude;
        return d8 == this.longitude && d8 == i.DOUBLE_EPSILON;
    }

    public void setLatitude(double d8) {
        this.latitude = d8;
    }

    public void setLongitude(double d8) {
        this.longitude = d8;
    }
}
