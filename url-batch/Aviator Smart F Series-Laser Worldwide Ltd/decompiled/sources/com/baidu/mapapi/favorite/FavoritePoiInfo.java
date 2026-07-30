package com.baidu.mapapi.favorite;

import com.baidu.mapapi.model.LatLng;

/* loaded from: classes2.dex */
public class FavoritePoiInfo {

    /* renamed from: a, reason: collision with root package name */
    String f5441a;

    /* renamed from: b, reason: collision with root package name */
    String f5442b;

    /* renamed from: c, reason: collision with root package name */
    LatLng f5443c;

    /* renamed from: d, reason: collision with root package name */
    String f5444d;

    /* renamed from: e, reason: collision with root package name */
    String f5445e;

    /* renamed from: f, reason: collision with root package name */
    String f5446f;

    /* renamed from: g, reason: collision with root package name */
    long f5447g;

    public FavoritePoiInfo addr(String str) {
        this.f5444d = str;
        return this;
    }

    public FavoritePoiInfo cityName(String str) {
        this.f5445e = str;
        return this;
    }

    public String getAddr() {
        return this.f5444d;
    }

    public String getCityName() {
        return this.f5445e;
    }

    public String getID() {
        return this.f5441a;
    }

    public String getPoiName() {
        return this.f5442b;
    }

    public LatLng getPt() {
        return this.f5443c;
    }

    public long getTimeStamp() {
        return this.f5447g;
    }

    public String getUid() {
        return this.f5446f;
    }

    public FavoritePoiInfo poiName(String str) {
        this.f5442b = str;
        return this;
    }

    public FavoritePoiInfo pt(LatLng latLng) {
        this.f5443c = latLng;
        return this;
    }

    public FavoritePoiInfo uid(String str) {
        this.f5446f = str;
        return this;
    }
}
