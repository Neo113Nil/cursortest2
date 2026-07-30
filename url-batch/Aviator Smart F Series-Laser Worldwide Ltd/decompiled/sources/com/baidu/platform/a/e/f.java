package com.baidu.platform.a.e;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.base.g;

/* loaded from: classes2.dex */
public class f extends g {
    public f(ReverseGeoCodeOption reverseGeoCodeOption) {
        a(reverseGeoCodeOption);
    }

    private void a(ReverseGeoCodeOption reverseGeoCodeOption) {
        if (reverseGeoCodeOption.getLocation() != null) {
            LatLng latLng = new LatLng(reverseGeoCodeOption.getLocation().latitude, reverseGeoCodeOption.getLocation().longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng = CoordTrans.gcjToBaidu(latLng);
            }
            this.f8720d.a("location", latLng.latitude + SystemInfoUtil.COMMA + latLng.longitude);
        }
        if (reverseGeoCodeOption.getLanguage() == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        } else {
            this.f8720d.a("language", "zh-CN");
        }
        this.f8720d.a("coordtype", "bd09ll");
        this.f8720d.a("page_index", String.valueOf(reverseGeoCodeOption.getPageNum()));
        this.f8720d.a("page_size", String.valueOf(reverseGeoCodeOption.getPageSize()));
        this.f8720d.a("pois", "1");
        this.f8720d.a("extensions_poi", "1");
        this.f8720d.a("extensions_town", "true");
        if (reverseGeoCodeOption.getExtensionsRoad()) {
            this.f8720d.a("extensions_road", "true");
        } else {
            this.f8720d.a("extensions_road", "false");
        }
        String poiType = reverseGeoCodeOption.getPoiType();
        if (!TextUtils.isEmpty(poiType)) {
            this.f8720d.a("poi_types", poiType);
        }
        this.f8720d.a("entire_poi", String.valueOf(reverseGeoCodeOption.getEntirePoi()));
        this.f8720d.a("sort_strategy", reverseGeoCodeOption.getSortStrategy().getDescription());
        this.f8720d.a("output", "jsonaes");
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        this.f8720d.a("latest_admin", String.valueOf(reverseGeoCodeOption.getLatestAdmin()));
        this.f8720d.a("radius", String.valueOf(reverseGeoCodeOption.getRadius()));
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.i();
    }
}
