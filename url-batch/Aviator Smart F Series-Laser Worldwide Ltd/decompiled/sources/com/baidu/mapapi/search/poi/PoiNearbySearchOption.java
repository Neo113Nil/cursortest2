package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.base.a;

/* loaded from: classes2.dex */
public class PoiNearbySearchOption {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6923a;

    /* renamed from: b, reason: collision with root package name */
    private String f6924b;
    public String mKeyword = null;
    public LatLng mLocation = null;
    public int mRadius = -1;
    public int mPageNum = 0;
    public int mPageCapacity = 10;
    public PoiSortType sortType = PoiSortType.comprehensive;
    public String mTag = "";
    public int mScope = 1;
    public boolean mRadiusLimit = false;
    public PoiFilter mPoiFilter = null;
    public boolean mIsExtendAdcode = true;
    public a mInputLanguageType = null;
    public LanguageType mLanguageType = LanguageType.LanguageTypeChinese;

    /* renamed from: c, reason: collision with root package name */
    private boolean f6925c = false;
    public PoiServerType mServerType = PoiServerType.POI_SERVER_TYPE_DEFAULT;

    public PoiNearbySearchOption customExtra(String str) {
        this.f6924b = str;
        return this;
    }

    public PoiNearbySearchOption extendAdcode(boolean z7) {
        this.mIsExtendAdcode = z7;
        return this;
    }

    public String getCustomExtra() {
        return this.f6924b;
    }

    public PoiNearbySearchOption inputLanguage(a aVar) {
        this.mInputLanguageType = aVar;
        return this;
    }

    public boolean isExtendAdcode() {
        return this.mIsExtendAdcode;
    }

    public boolean isExtendChildPoi() {
        return this.f6925c;
    }

    public boolean isShowPhoto() {
        return this.f6923a;
    }

    public PoiNearbySearchOption keyword(String str) {
        this.mKeyword = str;
        return this;
    }

    public PoiNearbySearchOption language(LanguageType languageType) {
        this.mLanguageType = languageType;
        return this;
    }

    public PoiNearbySearchOption location(LatLng latLng) {
        this.mLocation = latLng;
        return this;
    }

    public PoiNearbySearchOption pageCapacity(int i8) {
        this.mPageCapacity = i8;
        return this;
    }

    public PoiNearbySearchOption pageNum(int i8) {
        this.mPageNum = i8;
        return this;
    }

    public PoiNearbySearchOption poiFilter(PoiFilter poiFilter) {
        this.mPoiFilter = poiFilter;
        return this;
    }

    public PoiNearbySearchOption radius(int i8) {
        this.mRadius = i8;
        return this;
    }

    public PoiNearbySearchOption radiusLimit(boolean z7) {
        this.mRadiusLimit = z7;
        return this;
    }

    public PoiNearbySearchOption scope(int i8) {
        this.mScope = i8;
        return this;
    }

    public PoiNearbySearchOption serverType(PoiServerType poiServerType) {
        this.mServerType = poiServerType;
        return this;
    }

    public PoiNearbySearchOption setExtendChildPoi(boolean z7) {
        this.f6925c = z7;
        return this;
    }

    public PoiNearbySearchOption setShowPhoto(boolean z7) {
        this.f6923a = z7;
        return this;
    }

    public PoiNearbySearchOption sortType(PoiSortType poiSortType) {
        if (poiSortType != null) {
            this.sortType = poiSortType;
        }
        return this;
    }

    public PoiNearbySearchOption tag(String str) {
        this.mTag = str;
        return this;
    }
}
