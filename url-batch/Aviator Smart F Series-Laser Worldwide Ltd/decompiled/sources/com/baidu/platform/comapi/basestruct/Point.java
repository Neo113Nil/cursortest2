package com.baidu.platform.comapi.basestruct;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class Point implements Serializable {
    public double doubleX;
    public double doubleY;

    /* renamed from: x, reason: collision with root package name */
    public int f8789x;

    /* renamed from: y, reason: collision with root package name */
    public int f8790y;

    public Point() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return getDoubleX() == point.getDoubleX() && getIntX() == point.getIntX() && getDoubleY() == point.getDoubleY() && getIntY() == point.getIntY() && getDoubleY() == point.getDoubleY();
    }

    public double getDoubleX() {
        return this.doubleX;
    }

    public double getDoubleY() {
        return this.doubleY;
    }

    public int getIntX() {
        return this.f8789x;
    }

    public int getIntY() {
        return this.f8790y;
    }

    public int getmPtx() {
        return this.f8789x;
    }

    public int getmPty() {
        return this.f8790y;
    }

    public int hashCode() {
        return ((getIntX() + 31) * 31) + getIntY();
    }

    public void setDoubleX(double d8) {
        this.doubleX = d8;
    }

    public void setDoubleY(double d8) {
        this.doubleY = d8;
    }

    public void setIntX(int i8) {
        this.f8789x = i8;
    }

    public void setIntY(int i8) {
        this.f8790y = i8;
    }

    public void setTo(double d8, double d9) {
        setDoubleX(d8);
        setDoubleY(d9);
    }

    public void setmPtx(int i8) {
        this.f8789x = i8;
    }

    public void setmPty(int i8) {
        this.f8790y = i8;
    }

    public String toQuery() {
        return String.format("(%d,%d)", Integer.valueOf(getIntX()), Integer.valueOf(getIntY()));
    }

    public String toString() {
        return "Point [x=" + getDoubleX() + ", y=" + getDoubleY() + "]";
    }

    public Point(int i8, int i9) {
        this.f8789x = i8;
        this.f8790y = i9;
        this.doubleX = i8;
        this.doubleY = i9;
    }

    public Point(double d8, double d9) {
        this.f8789x = (int) d8;
        this.f8790y = (int) d9;
        this.doubleX = d8;
        this.doubleY = d9;
    }

    public void setTo(Point point) {
        if (point != null) {
            setDoubleX(point.getDoubleX());
            setDoubleY(point.getDoubleY());
        }
    }

    public Point(Point point) {
        if (point != null) {
            this.doubleX = point.getDoubleX();
            this.doubleY = point.getDoubleY();
            this.f8789x = point.getIntX();
            this.f8790y = point.getIntY();
        }
    }
}
