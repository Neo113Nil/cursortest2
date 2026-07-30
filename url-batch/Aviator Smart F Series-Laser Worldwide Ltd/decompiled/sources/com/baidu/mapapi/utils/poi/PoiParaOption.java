package com.baidu.mapapi.utils.poi;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class PoiParaOption {

    /* renamed from: a, reason: collision with root package name */
    String f7555a;

    /* renamed from: b, reason: collision with root package name */
    String f7556b;

    /* renamed from: c, reason: collision with root package name */
    LatLng f7557c;

    /* renamed from: d, reason: collision with root package name */
    int f7558d;

    public PoiParaOption center(LatLng latLng) {
        this.f7557c = latLng;
        return this;
    }

    public LatLng getCenter() {
        return this.f7557c;
    }

    public String getKey() {
        return this.f7556b;
    }

    public int getRadius() {
        return this.f7558d;
    }

    public String getUid() {
        return this.f7555a;
    }

    public PoiParaOption key(String str) {
        this.f7556b = str;
        return this;
    }

    public PoiParaOption radius(int i8) {
        this.f7558d = i8;
        return this;
    }

    public PoiParaOption uid(String str) {
        this.f7555a = str;
        return this;
    }
}
