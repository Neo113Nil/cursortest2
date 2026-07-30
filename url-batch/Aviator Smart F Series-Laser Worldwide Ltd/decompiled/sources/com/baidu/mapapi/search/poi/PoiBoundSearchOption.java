package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.base.a;

/* loaded from: classes2.dex */
public class PoiBoundSearchOption {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6888a;

    /* renamed from: b, reason: collision with root package name */
    private String f6889b;
    public LatLngBounds mBound = null;
    public boolean mIsExtendAdcode = true;
    public String mKeyword = null;
    public int mPageNum = 0;
    public int mPageCapacity = 10;
    public String mTag = "";
    public int mScope = 1;
    public PoiFilter mPoiFilter = null;
    public a mInputLanguageType = null;
    public LanguageType mLanguageType = LanguageType.LanguageTypeChinese;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6890c = false;
    public PoiServerType mServerType = PoiServerType.POI_SERVER_TYPE_DEFAULT;

    public PoiBoundSearchOption bound(LatLngBounds latLngBounds) {
        this.mBound = latLngBounds;
        return this;
    }

    public PoiBoundSearchOption customExtra(String str) {
        this.f6889b = str;
        return this;
    }

    public PoiBoundSearchOption extendAdcode(boolean z7) {
        this.mIsExtendAdcode = z7;
        return this;
    }

    public String getCustomExtra() {
        return this.f6889b;
    }

    public PoiBoundSearchOption inputLanguage(a aVar) {
        this.mInputLanguageType = aVar;
        return this;
    }

    public boolean isExtendAdcode() {
        return this.mIsExtendAdcode;
    }

    public boolean isExtendChildPoi() {
        return this.f6890c;
    }

    public boolean isShowPhoto() {
        return this.f6888a;
    }

    public PoiBoundSearchOption keyword(String str) {
        this.mKeyword = str;
        return this;
    }

    public PoiBoundSearchOption language(LanguageType languageType) {
        this.mLanguageType = languageType;
        return this;
    }

    public PoiBoundSearchOption pageCapacity(int i8) {
        this.mPageCapacity = i8;
        return this;
    }

    public PoiBoundSearchOption pageNum(int i8) {
        this.mPageNum = i8;
        return this;
    }

    public PoiBoundSearchOption poiFilter(PoiFilter poiFilter) {
        this.mPoiFilter = poiFilter;
        return this;
    }

    public PoiBoundSearchOption scope(int i8) {
        this.mScope = i8;
        return this;
    }

    public PoiBoundSearchOption serverType(PoiServerType poiServerType) {
        this.mServerType = poiServerType;
        return this;
    }

    public PoiBoundSearchOption setExtendChildPoi(boolean z7) {
        this.f6890c = z7;
        return this;
    }

    public PoiBoundSearchOption setShowPhoto(boolean z7) {
        this.f6888a = z7;
        return this;
    }

    public PoiBoundSearchOption tag(String str) {
        this.mTag = str;
        return this;
    }
}
