package com.baidu.platform.a.h;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.CoordUtil;
import com.baidu.mapapi.search.route.IndoorRoutePlanOption;
import com.baidu.platform.comapi.basestruct.GeoPoint;

/* loaded from: classes2.dex */
public class g extends com.baidu.platform.base.g {
    g(IndoorRoutePlanOption indoorRoutePlanOption) {
        a(indoorRoutePlanOption);
    }

    private void a(IndoorRoutePlanOption indoorRoutePlanOption) {
        this.f8720d.a("qt", "indoornavi");
        this.f8720d.a("rp_format", BodyData.TYPE_JSON);
        this.f8720d.a("version", "1");
        GeoPoint ll2mc = CoordUtil.ll2mc(indoorRoutePlanOption.mFrom.getLocation());
        if (ll2mc != null) {
            this.f8720d.a("sn", (String.format("%f,%f", Double.valueOf(ll2mc.getLongitudeE6()), Double.valueOf(ll2mc.getLatitudeE6())) + b5.b.VERTICAL + indoorRoutePlanOption.mFrom.getFloor()).replaceAll(cn.hutool.core.text.l.SPACE, ""));
        }
        GeoPoint ll2mc2 = CoordUtil.ll2mc(indoorRoutePlanOption.mTo.getLocation());
        if (ll2mc2 != null) {
            this.f8720d.a("en", (String.format("%f,%f", Double.valueOf(ll2mc2.getLongitudeE6()), Double.valueOf(ll2mc2.getLatitudeE6())) + b5.b.VERTICAL + indoorRoutePlanOption.mTo.getFloor()).replaceAll(cn.hutool.core.text.l.SPACE, ""));
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.z();
    }
}
