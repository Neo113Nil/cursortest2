package com.baidu.mapapi.map.entity;

/* loaded from: classes2.dex */
public class BackgroundNaviLocEntity {

    /* renamed from: b, reason: collision with root package name */
    private float f6505b;

    /* renamed from: c, reason: collision with root package name */
    private float f6506c;

    /* renamed from: f, reason: collision with root package name */
    private float f6509f;

    /* renamed from: g, reason: collision with root package name */
    private float f6510g;

    /* renamed from: a, reason: collision with root package name */
    private int f6504a = -1;

    /* renamed from: d, reason: collision with root package name */
    private double f6507d = -1.0d;

    /* renamed from: e, reason: collision with root package name */
    private double f6508e = -1.0d;

    /* renamed from: h, reason: collision with root package name */
    private double f6511h = -1.0d;

    /* renamed from: i, reason: collision with root package name */
    private double f6512i = -1.0d;

    public int getCurRouteShapeIdx() {
        return this.f6504a;
    }

    public float getGpsDirection() {
        return this.f6505b;
    }

    public double getGpsLatitude() {
        return this.f6508e;
    }

    public double getGpsLongitude() {
        return this.f6507d;
    }

    public float getGpsSpeed() {
        return this.f6506c;
    }

    public float getPostDirection() {
        return this.f6509f;
    }

    public double getPostLatitude() {
        return this.f6512i;
    }

    public double getPostLongitude() {
        return this.f6511h;
    }

    public float getPostSpeed() {
        return this.f6510g;
    }

    public boolean isValid() {
        return (this.f6508e == -1.0d || this.f6507d == -1.0d || this.f6512i == -1.0d || this.f6511h == -1.0d) ? false : true;
    }

    public void setCurRouteShapeIdx(int i8) {
        this.f6504a = i8;
    }

    public void setGpsDirection(float f8) {
        this.f6505b = f8;
    }

    public void setGpsLatitude(double d8) {
        this.f6508e = d8;
    }

    public void setGpsLongitude(double d8) {
        this.f6507d = d8;
    }

    public void setGpsSpeed(float f8) {
        this.f6506c = f8;
    }

    public void setPostDirection(float f8) {
        this.f6509f = f8;
    }

    public void setPostLatitude(double d8) {
        this.f6512i = d8;
    }

    public void setPostLongitude(double d8) {
        this.f6511h = d8;
    }

    public void setPostSpeed(float f8) {
        this.f6510g = f8;
    }
}
