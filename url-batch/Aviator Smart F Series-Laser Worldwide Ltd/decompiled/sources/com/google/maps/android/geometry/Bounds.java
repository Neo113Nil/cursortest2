package com.google.maps.android.geometry;

/* loaded from: classes4.dex */
public class Bounds {
    public final double maxX;
    public final double maxY;
    public final double midX;
    public final double midY;
    public final double minX;
    public final double minY;

    public Bounds(double d8, double d9, double d10, double d11) {
        this.minX = d8;
        this.minY = d10;
        this.maxX = d9;
        this.maxY = d11;
        this.midX = (d8 + d9) / 2.0d;
        this.midY = (d10 + d11) / 2.0d;
    }

    public boolean contains(double d8, double d9) {
        return this.minX <= d8 && d8 <= this.maxX && this.minY <= d9 && d9 <= this.maxY;
    }

    public boolean intersects(double d8, double d9, double d10, double d11) {
        return d8 < this.maxX && this.minX < d9 && d10 < this.maxY && this.minY < d11;
    }

    public boolean contains(Point point) {
        return contains(point.f15120x, point.f15121y);
    }

    public boolean intersects(Bounds bounds) {
        return intersects(bounds.minX, bounds.maxX, bounds.minY, bounds.maxY);
    }

    public boolean contains(Bounds bounds) {
        return bounds.minX >= this.minX && bounds.maxX <= this.maxX && bounds.minY >= this.minY && bounds.maxY <= this.maxY;
    }
}
