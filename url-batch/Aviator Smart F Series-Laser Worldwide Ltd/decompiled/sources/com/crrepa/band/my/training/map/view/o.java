package com.crrepa.band.my.training.map.view;

import com.crrepa.band.my.training.model.MapType;

/* loaded from: classes3.dex */
public class o {
    private float accuracy;
    private double altitude;
    private double latitude;
    private double longitude;
    private MapType mapType;
    private float speed;

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

    public MapType getMapType() {
        return this.mapType;
    }

    public float getSpeed() {
        return this.speed;
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

    public void setMapType(MapType mapType) {
        this.mapType = mapType;
    }

    public void setSpeed(float f8) {
        this.speed = f8;
    }

    public String toString() {
        return "MapLocation{accuracy=" + this.accuracy + ", latitude=" + this.latitude + ", longitude=" + this.longitude + ", speed=" + this.speed + ", altitude=" + this.altitude + ", mapType=" + this.mapType + '}';
    }
}
