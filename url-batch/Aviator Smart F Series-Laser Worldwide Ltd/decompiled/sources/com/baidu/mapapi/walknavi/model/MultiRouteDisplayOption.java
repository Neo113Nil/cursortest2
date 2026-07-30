package com.baidu.mapapi.walknavi.model;

import com.baidu.mapapi.map.BitmapDescriptor;

/* loaded from: classes2.dex */
public class MultiRouteDisplayOption {

    /* renamed from: a, reason: collision with root package name */
    private BitmapDescriptor f7632a;

    /* renamed from: b, reason: collision with root package name */
    private BitmapDescriptor f7633b;

    /* renamed from: c, reason: collision with root package name */
    private int f7634c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f7635d = 0;

    /* renamed from: e, reason: collision with root package name */
    private int f7636e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f7637f = 0;

    public int getFocusColor() {
        return this.f7636e;
    }

    public BitmapDescriptor getFocusRouteBitmapDescriptor() {
        return this.f7632a;
    }

    public int getFocusRouteWidth() {
        return this.f7634c;
    }

    public int getNoFocusColor() {
        return this.f7637f;
    }

    public BitmapDescriptor getNoFocusRouteBitmapDescriptor() {
        return this.f7633b;
    }

    public int getNoFocusRouteWidth() {
        return this.f7635d;
    }

    public void setFocusColor(int i8) {
        this.f7636e = i8;
    }

    public void setFocusRouteBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        this.f7632a = bitmapDescriptor;
    }

    public void setFocusRouteWidth(int i8) {
        this.f7634c = i8;
    }

    public void setNoFocusColor(int i8) {
        this.f7637f = i8;
    }

    public void setNoFocusRouteBitmapDescriptor(BitmapDescriptor bitmapDescriptor) {
        this.f7633b = bitmapDescriptor;
    }

    public void setNoFocusRouteWidth(int i8) {
        this.f7635d = i8;
    }
}
