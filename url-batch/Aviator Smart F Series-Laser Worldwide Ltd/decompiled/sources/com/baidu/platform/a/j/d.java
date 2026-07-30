package com.baidu.platform.a.j;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.baidu.ar.util.SystemInfoUtil;
import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.sug.SuggestionSearchOption;
import com.baidu.mapsdkplatform.comapi.util.CoordTrans;
import com.baidu.platform.base.g;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.actions.SearchIntents;

/* loaded from: classes2.dex */
public class d extends g {
    public d(SuggestionSearchOption suggestionSearchOption) {
        a(suggestionSearchOption);
    }

    private void a(SuggestionSearchOption suggestionSearchOption) {
        this.f8720d.a(SearchIntents.EXTRA_QUERY, suggestionSearchOption.mKeyword);
        this.f8720d.a(TtmlNode.TAG_REGION, suggestionSearchOption.mCity);
        if (suggestionSearchOption.mLocation != null) {
            LatLng latLng = suggestionSearchOption.mLocation;
            LatLng latLng2 = new LatLng(latLng.latitude, latLng.longitude);
            if (SDKInitializer.getCoordType() == CoordType.GCJ02) {
                latLng2 = CoordTrans.gcjToBaidu(latLng2);
            }
            this.f8720d.a("location", latLng2.latitude + SystemInfoUtil.COMMA + latLng2.longitude);
        }
        if (suggestionSearchOption.mCityLimit.booleanValue()) {
            this.f8720d.a("city_limit", "true");
        } else {
            this.f8720d.a("city_limit", "false");
        }
        if (suggestionSearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        }
        if (suggestionSearchOption.mHotWord) {
            this.f8720d.a("hotword", "true");
        } else {
            this.f8720d.a("hotword", "false");
        }
        this.f8720d.a(TypedValues.TransitionType.S_FROM, "android_map_sdk");
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a("extensions_adcode", suggestionSearchOption.isExtendAdcode() ? "true" : "false");
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        return cVar.d();
    }
}
