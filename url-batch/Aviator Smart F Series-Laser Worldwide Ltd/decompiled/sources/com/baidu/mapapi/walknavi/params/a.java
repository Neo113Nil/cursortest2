package com.baidu.mapapi.walknavi.params;

import android.text.TextUtils;
import com.baidu.mapapi.PermissionUtils;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.model.LatLng;
import com.baidu.platform.comapi.basestruct.GeoPoint;
import com.github.mikephil.charting.utils.i;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    protected String f7697b;

    /* renamed from: c, reason: collision with root package name */
    protected LatLng f7698c;

    /* renamed from: g, reason: collision with root package name */
    protected String f7702g;

    /* renamed from: a, reason: collision with root package name */
    protected RouteNodeType f7696a = RouteNodeType.LOCATION;

    /* renamed from: d, reason: collision with root package name */
    protected int f7699d = -1;

    /* renamed from: e, reason: collision with root package name */
    protected String f7700e = "";

    /* renamed from: f, reason: collision with root package name */
    protected String f7701f = "";

    public String getBuildingID() {
        return this.f7701f;
    }

    public int getCitycode() {
        return this.f7699d;
    }

    public String getFloorID() {
        return this.f7700e;
    }

    public String getKeyword() {
        return this.f7697b;
    }

    public LatLng getLocation() {
        return this.f7698c;
    }

    public RouteNodeType getType() {
        return this.f7696a;
    }

    public String getUid() {
        return this.f7702g;
    }

    public abstract void setBuildingID(String str);

    public void setCitycode(int i8) {
        this.f7699d = i8;
    }

    public abstract void setFloorID(String str);

    public abstract void setKeyword(String str);

    public abstract void setLocation(LatLng latLng);

    public abstract void setType(RouteNodeType routeNodeType);

    public void setUid(String str) {
        this.f7702g = str;
    }

    public String toQuery() {
        com.baidu.platform.comapi.h.h.f.a aVar = new com.baidu.platform.comapi.h.h.f.a();
        aVar.f();
        aVar.a("type").a(this.f7696a.getNativeType());
        aVar.a("uid").b(this.f7702g);
        if (this.f7697b != null) {
            aVar.a("keyword").b(this.f7697b);
        } else {
            aVar.a("keyword").b("");
        }
        aVar.a("keyword2").b("");
        LatLng latLng = this.f7698c;
        if (latLng == null) {
            aVar.a("xy").b("");
        } else if (latLng.longitude == i.DOUBLE_EPSILON || latLng.latitude == i.DOUBLE_EPSILON) {
            aVar.a("xy").b("");
        } else {
            GeoPoint ll2mc = CoordUtil.ll2mc(latLng);
            aVar.a("xy").b(String.format("%d,%d", Integer.valueOf((int) ll2mc.getLongitudeE6()), Integer.valueOf((int) ll2mc.getLatitudeE6())));
        }
        RouteNodeType routeNodeType = this.f7696a;
        if (routeNodeType == RouteNodeType.KEYWORD || (routeNodeType == RouteNodeType.LOCATION && PermissionUtils.getInstance().isIndoorNaviAuthorized())) {
            if (!TextUtils.isEmpty(this.f7700e)) {
                aVar.a("floor").b(this.f7700e);
            }
            if (!TextUtils.isEmpty(this.f7701f)) {
                aVar.a("building").b(this.f7701f);
            }
            if (this.f7699d != -1) {
                aVar.a("city").a(this.f7699d);
            }
        }
        aVar.d();
        return aVar.toString();
    }
}
