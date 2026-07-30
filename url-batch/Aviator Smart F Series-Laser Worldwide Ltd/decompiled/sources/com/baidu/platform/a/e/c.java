package com.baidu.platform.a.e;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.geocode.GeoCodeOption;
import com.baidu.platform.base.g;

/* loaded from: classes2.dex */
public class c extends g {
    public c(GeoCodeOption geoCodeOption) {
        a(geoCodeOption);
    }

    private void a(GeoCodeOption geoCodeOption) {
        this.f8720d.a("city", geoCodeOption.mCity);
        this.f8720d.a("address", geoCodeOption.mAddress);
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a("ret_coordtype", "bd09ll");
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.g();
    }
}
