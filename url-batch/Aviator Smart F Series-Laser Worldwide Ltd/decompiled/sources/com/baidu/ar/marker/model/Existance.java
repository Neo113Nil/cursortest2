package com.baidu.ar.marker.model;

import java.util.Arrays;

/* loaded from: classes.dex */
public class Existance {

    /* renamed from: a, reason: collision with root package name */
    public String f2815a;

    /* renamed from: b, reason: collision with root package name */
    public double[] f2816b;

    /* renamed from: c, reason: collision with root package name */
    public String f2817c;

    /* renamed from: d, reason: collision with root package name */
    public String f2818d;

    public String getDirectionType() {
        return this.f2818d;
    }

    public double[] getLatlng() {
        return this.f2816b;
    }

    public String getStreetName() {
        return this.f2817c;
    }

    public String getType() {
        return this.f2815a;
    }

    public void setDirectionType(String str) {
        this.f2818d = str;
    }

    public void setLatlng(double[] dArr) {
        this.f2816b = dArr;
    }

    public void setStreetName(String str) {
        this.f2817c = str;
    }

    public void setType(String str) {
        this.f2815a = str;
    }

    public String toString() {
        return "Existance{type='" + this.f2815a + "', latlng=" + Arrays.toString(this.f2816b) + ", streetName='" + this.f2817c + "', directionType='" + this.f2818d + "'}";
    }
}
