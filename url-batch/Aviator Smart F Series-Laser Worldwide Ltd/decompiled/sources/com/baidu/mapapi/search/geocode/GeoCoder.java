package com.baidu.mapapi.search.geocode;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.e.d;

/* loaded from: classes2.dex */
public class GeoCoder extends a {

    /* renamed from: a, reason: collision with root package name */
    private d f6863a = new com.baidu.platform.a.e.a();

    /* renamed from: b, reason: collision with root package name */
    private boolean f6864b;

    private GeoCoder() {
    }

    public static GeoCoder newInstance() {
        BMapManager.init();
        return new GeoCoder();
    }

    public void destroy() {
        if (this.f6864b) {
            return;
        }
        this.f6864b = true;
        this.f6863a.destroy();
        BMapManager.destroy();
    }

    public boolean geocode(GeoCodeOption geoCodeOption) {
        d dVar = this.f6863a;
        if (dVar == null) {
            throw new IllegalStateException("BDMapSDKException: GeoCoder is null, please call newInstance() first.");
        }
        if (geoCodeOption == null || geoCodeOption.mAddress == null || geoCodeOption.mCity == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or address or city can not be null");
        }
        return dVar.a(geoCodeOption);
    }

    public boolean reverseGeoCode(ReverseGeoCodeOption reverseGeoCodeOption) {
        if (this.f6863a == null) {
            throw new IllegalStateException("BDMapSDKException: GeoCoder is null, please call newInstance() first.");
        }
        if (reverseGeoCodeOption == null || reverseGeoCodeOption.getLocation() == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or mLocation can not be null");
        }
        return this.f6863a.a(reverseGeoCodeOption);
    }

    public void setOnGetGeoCodeResultListener(OnGetGeoCoderResultListener onGetGeoCoderResultListener) {
        d dVar = this.f6863a;
        if (dVar == null) {
            throw new IllegalStateException("BDMapSDKException: GeoCoder is null, please call newInstance() first.");
        }
        if (onGetGeoCoderResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        dVar.a(onGetGeoCoderResultListener);
    }
}
