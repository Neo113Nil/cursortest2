package com.google.maps.android.geometry;

import androidx.annotation.NonNull;

/* loaded from: classes4.dex */
public class Point {

    /* renamed from: x, reason: collision with root package name */
    public final double f15120x;

    /* renamed from: y, reason: collision with root package name */
    public final double f15121y;

    public Point(double d8, double d9) {
        this.f15120x = d8;
        this.f15121y = d9;
    }

    @NonNull
    public String toString() {
        return "Point{x=" + this.f15120x + ", y=" + this.f15121y + '}';
    }
}
