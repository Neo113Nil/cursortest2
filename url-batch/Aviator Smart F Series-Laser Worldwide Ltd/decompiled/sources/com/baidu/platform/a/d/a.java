package com.baidu.platform.a.d;

import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.district.DistrictSearchOption;
import com.baidu.platform.base.g;

/* loaded from: classes2.dex */
public class a extends g {
    a(DistrictSearchOption districtSearchOption) {
        a(districtSearchOption);
    }

    private void a(DistrictSearchOption districtSearchOption) {
        if (districtSearchOption == null) {
            return;
        }
        this.f8720d.a("qt", "con");
        this.f8720d.a("rp_format", BodyData.TYPE_JSON);
        this.f8720d.a("rp_filter", "mobile");
        this.f8720d.a("area_res", "true");
        this.f8720d.a("addr_identify", "1");
        this.f8720d.a("ie", "utf-8");
        this.f8720d.a("pn", "0");
        this.f8720d.a("rn", "10");
        this.f8720d.a("c", districtSearchOption.mCityName);
        String str = districtSearchOption.mDistrictName;
        if (str == null || str.equals("")) {
            this.f8720d.a("wd", districtSearchOption.mCityName);
        } else {
            this.f8720d.a("wd", districtSearchOption.mDistrictName);
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.p();
    }
}
