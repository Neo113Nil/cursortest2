package com.baidu.platform.a.f;

import android.util.Log;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.poi.PoiDetailSearchOption;
import com.baidu.mapapi.search.poi.PoiServerType;

/* loaded from: classes2.dex */
public class e extends com.baidu.platform.base.g {

    /* renamed from: e, reason: collision with root package name */
    private PoiServerType f8599e = PoiServerType.POI_SERVER_TYPE_DEFAULT;

    e(PoiDetailSearchOption poiDetailSearchOption) {
        a(poiDetailSearchOption);
    }

    private void a(PoiDetailSearchOption poiDetailSearchOption) {
        if (poiDetailSearchOption == null) {
            Log.e(e.class.getSimpleName(), "Option is null");
            return;
        }
        this.f8599e = poiDetailSearchOption.mServerType;
        if (!poiDetailSearchOption.isSearchByUids()) {
            poiDetailSearchOption.poiUids(poiDetailSearchOption.getUid());
        }
        if (poiDetailSearchOption.mLanguageType == LanguageType.LanguageTypeEnglish) {
            this.f8720d.a("language", "en");
        }
        this.f8720d.a("photo_show", poiDetailSearchOption.isShowPhoto() ? "true" : "false");
        this.f8720d.a("uids", poiDetailSearchOption.getUids());
        this.f8720d.a("extensions_adcode", poiDetailSearchOption.isExtendAdcode() ? "true" : "false");
        this.f8720d.a("output", BodyData.TYPE_JSON);
        this.f8720d.a("scope", "2");
    }

    @Override // com.baidu.platform.base.g
    public String a(com.baidu.platform.domain.c cVar) {
        if (this.f8599e == PoiServerType.POI_SERVER_TYPE_ABROAD) {
            return cVar.a();
        }
        return cVar.c();
    }
}
