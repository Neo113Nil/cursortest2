package com.baidu.platform.a.h;

import androidx.exifinterface.media.ExifInterface;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.route.TransitRoutePlanOption;

/* loaded from: classes2.dex */
public class o extends com.baidu.platform.base.g {
    public o(TransitRoutePlanOption transitRoutePlanOption) {
        a(transitRoutePlanOption);
    }

    private void a(TransitRoutePlanOption transitRoutePlanOption) {
        this.f8720d.a("qt", "bus");
        this.f8720d.a("sy", transitRoutePlanOption.mPolicy.getInt() + "");
        this.f8720d.a("ie", "utf-8");
        this.f8720d.a("lrn", "20");
        this.f8720d.a("version", ExifInterface.GPS_MEASUREMENT_3D);
        this.f8720d.a("rp_format", BodyData.TYPE_JSON);
        this.f8720d.a("rp_filter", "mobile");
        this.f8720d.a("ic_info", "2");
        this.f8720d.a("exptype", "depall");
        this.f8720d.a("sn", a(transitRoutePlanOption.mFrom));
        this.f8720d.a("en", a(transitRoutePlanOption.mTo));
        String str = transitRoutePlanOption.mCityName;
        if (str != null) {
            this.f8720d.a("c", str);
        }
        if (TransitRoutePlanOption.TransitPolicy.EBUS_NO_SUBWAY == transitRoutePlanOption.mPolicy) {
            this.f8720d.a("f", "[0,2,4,7,5,8,9,10,11]");
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.A();
    }
}
