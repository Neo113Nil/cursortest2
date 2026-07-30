package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.search.base.LanguageType;

/* loaded from: classes2.dex */
public class PoiDetailSearchOption {

    /* renamed from: e, reason: collision with root package name */
    private boolean f6902e;

    /* renamed from: a, reason: collision with root package name */
    private String f6898a = "";

    /* renamed from: b, reason: collision with root package name */
    private boolean f6899b = true;

    /* renamed from: c, reason: collision with root package name */
    private String f6900c = "";

    /* renamed from: d, reason: collision with root package name */
    private boolean f6901d = false;
    public LanguageType mLanguageType = LanguageType.LanguageTypeChinese;
    public PoiServerType mServerType = PoiServerType.POI_SERVER_TYPE_DEFAULT;

    public PoiDetailSearchOption extendAdcode(boolean z7) {
        this.f6899b = z7;
        return this;
    }

    public String getUid() {
        return this.f6898a;
    }

    public String getUids() {
        return this.f6900c;
    }

    public boolean isExtendAdcode() {
        return this.f6899b;
    }

    public boolean isSearchByUids() {
        return this.f6901d;
    }

    public boolean isShowPhoto() {
        return this.f6902e;
    }

    public PoiDetailSearchOption language(LanguageType languageType) {
        this.mLanguageType = languageType;
        return this;
    }

    public PoiDetailSearchOption poiUid(String str) {
        this.f6901d = false;
        this.f6898a = str;
        return this;
    }

    public PoiDetailSearchOption poiUids(String str) {
        this.f6901d = true;
        this.f6900c = str;
        return this;
    }

    public PoiDetailSearchOption serverType(PoiServerType poiServerType) {
        this.mServerType = poiServerType;
        return this;
    }

    public PoiDetailSearchOption setShowPhoto(boolean z7) {
        this.f6902e = z7;
        return this;
    }
}
