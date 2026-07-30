package com.baidu.ar.marker.model;

import java.util.List;

/* loaded from: classes.dex */
public class Segments {

    /* renamed from: a, reason: collision with root package name */
    public Existance f2819a;

    /* renamed from: b, reason: collision with root package name */
    public int f2820b;

    /* renamed from: c, reason: collision with root package name */
    public List<double[]> f2821c;

    public Existance getExistance() {
        return this.f2819a;
    }

    public List<double[]> getPoints() {
        return this.f2821c;
    }

    public int getPointsCount() {
        return this.f2820b;
    }

    public void setExistance(Existance existance) {
        this.f2819a = existance;
    }

    public void setPoints(List<double[]> list) {
        this.f2821c = list;
    }

    public void setPointsCount(int i8) {
        this.f2820b = i8;
    }

    public String toString() {
        return "Segments{existance=" + this.f2819a.toString() + ", pointsCount=" + this.f2820b + ", points=" + this.f2821c + '}';
    }
}
