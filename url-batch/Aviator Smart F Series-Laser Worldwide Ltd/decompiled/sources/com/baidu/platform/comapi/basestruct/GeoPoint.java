package com.baidu.platform.comapi.basestruct;

/* loaded from: classes2.dex */
public class GeoPoint {

    /* renamed from: a, reason: collision with root package name */
    private double f8787a;

    /* renamed from: b, reason: collision with root package name */
    private double f8788b;

    public GeoPoint(int i8, int i9) {
        this.f8787a = i8;
        this.f8788b = i9;
    }

    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        GeoPoint geoPoint = (GeoPoint) obj;
        return Math.abs(this.f8787a - geoPoint.f8787a) <= 1.0E-6d && Math.abs(this.f8788b - geoPoint.f8788b) <= 1.0E-6d;
    }

    public double getLatitude() {
        return this.f8787a;
    }

    public double getLatitudeE6() {
        return this.f8787a;
    }

    public double getLongitude() {
        return this.f8788b;
    }

    public double getLongitudeE6() {
        return this.f8788b;
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public void setLatitude(double d8) {
        this.f8787a = d8;
    }

    public void setLatitudeE6(double d8) {
        this.f8787a = d8;
    }

    public void setLongitude(double d8) {
        this.f8788b = d8;
    }

    public void setLongitudeE6(double d8) {
        this.f8788b = d8;
    }

    public String toString() {
        return "GeoPoint: Latitude: " + this.f8787a + ", Longitude: " + this.f8788b;
    }

    public GeoPoint(double d8, double d9) {
        this.f8787a = d8;
        this.f8788b = d9;
    }

    public void setLatitude(int i8) {
        this.f8787a = i8;
    }

    public void setLongitude(int i8) {
        this.f8788b = i8;
    }
}
