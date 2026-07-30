package com.baidu.platform.core.busline;

import android.text.TextUtils;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.busline.BusLineSearchOption;
import com.baidu.platform.base.g;

/* loaded from: classes2.dex */
public class b extends g {
    public b(BusLineSearchOption busLineSearchOption) {
        a(busLineSearchOption);
    }

    private void a(BusLineSearchOption busLineSearchOption) {
        this.f8720d.a("uid", busLineSearchOption.mUid);
        if (!TextUtils.isEmpty(busLineSearchOption.mStartUid)) {
            this.f8720d.a("suid", busLineSearchOption.mStartUid);
        }
        if (!TextUtils.isEmpty(busLineSearchOption.mEndUid)) {
            this.f8720d.a("euid", busLineSearchOption.mEndUid);
        }
        if (busLineSearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        }
        if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
            this.f8720d.a("ret_coordtype", "gcj02ll");
        } else {
            this.f8720d.a("ret_coordtype", "bd09ll");
        }
        Integer num = busLineSearchOption.mCity;
        if (num != null) {
            this.f8720d.a("city_id", num.toString());
        }
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.n();
    }
}
