package com.baidu.mapapi.map;

import android.os.Bundle;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* loaded from: classes2.dex */
public final class Dot extends Overlay {

    /* renamed from: g, reason: collision with root package name */
    LatLng f5775g;

    /* renamed from: h, reason: collision with root package name */
    int f5776h;

    /* renamed from: i, reason: collision with root package name */
    int f5777i;

    Dot() {
        this.type = com.baidu.mapsdkplatform.comapi.map.d.dot;
    }

    @Override // com.baidu.mapapi.map.Overlay
    Bundle a(Bundle bundle) {
        super.a(bundle);
        GeoPoint ll2mc = CoordUtil.ll2mc(this.f5775g);
        bundle.putDouble("location_x", ll2mc.getLongitudeE6());
        bundle.putDouble("location_y", ll2mc.getLatitudeE6());
        bundle.putInt("radius", this.f5777i);
        Overlay.d(this.f5776h, bundle);
        return bundle;
    }

    public LatLng getCenter() {
        return this.f5775g;
    }

    public int getColor() {
        return this.f5776h;
    }

    public int getRadius() {
        return this.f5777i;
    }

    public void setCenter(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("BDMapSDKException: dot center can not be null");
        }
        this.f5775g = latLng;
        this.listener.d(this);
    }

    public void setColor(int i8) {
        this.f5776h = i8;
        this.listener.d(this);
    }

    public void setRadius(int i8) {
        if (i8 > 0) {
            this.f5777i = i8;
            this.listener.d(this);
        }
    }
}
