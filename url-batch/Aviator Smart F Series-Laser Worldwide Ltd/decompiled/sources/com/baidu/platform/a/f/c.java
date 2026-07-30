package com.baidu.platform.a.f;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.mapapi.search.poi.PoiIndoorOption;
import com.baidu.platform.comapi.map.MapBundleKey;

/* loaded from: classes2.dex */
public class c extends com.baidu.platform.base.g {
    public c(PoiIndoorOption poiIndoorOption) {
        a(poiIndoorOption);
    }

    private void a(PoiIndoorOption poiIndoorOption) {
        this.f8720d.a("qt", "indoor_s");
        this.f8720d.a("x", "0");
        this.f8720d.a("y", "0");
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        String str = poiIndoorOption.bid;
        if (str != null && !str.equals("")) {
            this.f8720d.a(MapBundleKey.MapObjKey.OBJ_BID, str);
        }
        String str2 = poiIndoorOption.wd;
        if (str2 != null && !str2.equals("")) {
            this.f8720d.a("wd", str2);
        }
        String str3 = poiIndoorOption.floor;
        if (str3 != null && !str3.equals("")) {
            this.f8720d.a("floor", str3);
        }
        this.f8720d.a("current", poiIndoorOption.currentPage + "");
        this.f8720d.a("pageSize", poiIndoorOption.pageSize + "");
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.s();
    }
}
