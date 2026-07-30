package com.baidu.mapapi.bikenavi.params;

import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.baidu.platform.comapi.walknavi.h.b;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public class BikeRouteNodeInfo {

    /* renamed from: b, reason: collision with root package name */
    protected String f5423b;

    /* renamed from: d, reason: collision with root package name */
    private LatLng f5425d;

    /* renamed from: e, reason: collision with root package name */
    private String f5426e;

    /* renamed from: a, reason: collision with root package name */
    protected a f5422a = a.LOCATION;

    /* renamed from: c, reason: collision with root package name */
    protected int f5424c = -1;

    public static b create() {
        return new b();
    }

    public int getCityCode() {
        return 0;
    }

    public String getKeyword() {
        return this.f5423b;
    }

    public LatLng getLocation() {
        return this.f5425d;
    }

    public a getType() {
        return this.f5422a;
    }

    public String getUid() {
        return this.f5426e;
    }

    public void setCityCode(int i8) {
        this.f5424c = i8;
    }

    public void setKeyword(String str) {
        this.f5423b = str;
    }

    public void setLocation(LatLng latLng) {
        this.f5425d = latLng;
    }

    public void setType(a aVar) {
        this.f5422a = aVar;
    }

    public void setUid(String str) {
        this.f5426e = str;
    }

    public String toQuery() {
        com.baidu.platform.comapi.h.h.f.a aVar = new com.baidu.platform.comapi.h.h.f.a();
        aVar.f();
        aVar.a("type").a(this.f5422a.a());
        aVar.a("uid").b(this.f5426e);
        if (this.f5423b != null) {
            aVar.a("keyword").b(this.f5423b);
        } else {
            aVar.a("keyword").b("");
        }
        aVar.a("keyword2").b("");
        LatLng latLng = this.f5425d;
        if (latLng == null) {
            aVar.a("xy").b("");
        } else if (latLng.longitude == i.DOUBLE_EPSILON || latLng.latitude == i.DOUBLE_EPSILON) {
            aVar.a("xy").b("");
        } else {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            aVar.a("xy").b(String.format("%d,%d", Integer.valueOf((int) ll2mc.getLongitudeE6()), Integer.valueOf((int) ll2mc.getLatitudeE6())));
        }
        aVar.d();
        return aVar.toString();
    }
}
