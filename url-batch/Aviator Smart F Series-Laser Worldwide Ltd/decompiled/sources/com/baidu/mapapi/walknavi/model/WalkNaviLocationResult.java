package com.baidu.mapapi.walknavi.model;

/* loaded from: classes2.dex */
public class WalkNaviLocationResult {
    private int curRouteShapeIdx;
    private float gpsDirection;
    private double gpsLatitude;
    private double gpsLongitude;
    private float gpsSpeed;
    private float postDirection;
    private double postLatitude;
    private double postLongitude;
    private float postSpeed;

    public int getCurRouteShapeIdx() {
        return this.curRouteShapeIdx;
    }

    public float getGpsDirection() {
        return this.gpsDirection;
    }

    public double getGpsLatitude() {
        return this.gpsLatitude;
    }

    public double getGpsLongitude() {
        return this.gpsLongitude;
    }

    public float getGpsSpeed() {
        return this.gpsSpeed;
    }

    public float getPostDirection() {
        return this.postDirection;
    }

    public double getPostLatitude() {
        return this.postLatitude;
    }

    public double getPostLongitude() {
        return this.postLongitude;
    }

    public float getPostSpeed() {
        return this.postSpeed;
    }

    public void setCurRouteShapeIdx(int i8) {
        this.curRouteShapeIdx = i8;
    }

    public void setGpsDirection(float f8) {
        this.gpsDirection = f8;
    }

    public void setGpsLatitude(double d8) {
        this.gpsLatitude = d8;
    }

    public void setGpsLongitude(double d8) {
        this.gpsLongitude = d8;
    }

    public void setGpsSpeed(float f8) {
        this.gpsSpeed = f8;
    }

    public void setPostDirection(float f8) {
        this.postDirection = f8;
    }

    public void setPostLatitude(double d8) {
        this.postLatitude = d8;
    }

    public void setPostLongitude(double d8) {
        this.postLongitude = d8;
    }

    public void setPostSpeed(float f8) {
        this.postSpeed = f8;
    }

    public String toString() {
        return "WalkNaviLocationResult{curRouteShapeIdx=" + this.curRouteShapeIdx + ", gpsDirection=" + this.gpsDirection + ", gpsSpeed=" + this.gpsSpeed + ", gpsLongitude=" + this.gpsLongitude + ", gpsLatitude=" + this.gpsLatitude + ", postDirection=" + this.postDirection + ", postSpeed=" + this.postSpeed + ", postLongitude=" + this.postLongitude + ", postLatitude=" + this.postLatitude + '}';
    }
}
