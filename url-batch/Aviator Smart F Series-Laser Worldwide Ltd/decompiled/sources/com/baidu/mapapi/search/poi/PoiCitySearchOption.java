package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.model.LatLng;
import com.baidu.mapapi.model.LatLngBounds;
import com.baidu.mapapi.search.base.LanguageType;
import com.baidu.mapapi.search.base.a;

/* loaded from: classes2.dex */
public class PoiCitySearchOption {

    /* renamed from: a, reason: collision with root package name */
    private boolean f6891a;

    /* renamed from: b, reason: collision with root package name */
    private LatLng f6892b;

    /* renamed from: c, reason: collision with root package name */
    private int f6893c;

    /* renamed from: d, reason: collision with root package name */
    private LatLngBounds f6894d;

    /* renamed from: e, reason: collision with root package name */
    private LatLngBounds f6895e;

    /* renamed from: f, reason: collision with root package name */
    private String f6896f;
    public String mCity = null;
    public String mKeyword = null;
    public int mPageNum = 0;
    public int mPageCapacity = 10;
    public boolean mIsReturnAddr = true;
    public String mTag = "";
    public int mScope = 1;
    public boolean mIsCityLimit = true;
    public PoiFilter mPoiFilter = null;
    public boolean mIsExtendAdcode = true;
    public a mInputLanguageType = null;
    public LanguageType mLanguageType = LanguageType.LanguageTypeChinese;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6897g = false;
    public PoiServerType mServerType = PoiServerType.POI_SERVER_TYPE_DEFAULT;

    public PoiCitySearchOption city(String str) {
        this.mCity = str;
        return this;
    }

    public PoiCitySearchOption cityLimit(boolean z7) {
        this.mIsCityLimit = z7;
        return this;
    }

    public PoiCitySearchOption customExtra(String str) {
        this.f6896f = str;
        return this;
    }

    public PoiCitySearchOption extendAdcode(boolean z7) {
        this.mIsExtendAdcode = z7;
        return this;
    }

    public LatLng getCenter() {
        return this.f6892b;
    }

    public String getCustomExtra() {
        return this.f6896f;
    }

    public int getFilterDistance() {
        return this.f6893c;
    }

    public LatLngBounds getSearchBound() {
        return this.f6895e;
    }

    public LatLngBounds getViewBound() {
        return this.f6894d;
    }

    public PoiCitySearchOption inputLanguage(a aVar) {
        this.mInputLanguageType = aVar;
        return this;
    }

    public boolean isExtendAdcode() {
        return this.mIsExtendAdcode;
    }

    public boolean isExtendChildPoi() {
        return this.f6897g;
    }

    public PoiCitySearchOption isReturnAddr(boolean z7) {
        this.mIsReturnAddr = z7;
        return this;
    }

    public boolean isShowPhoto() {
        return this.f6891a;
    }

    public PoiCitySearchOption keyword(String str) {
        this.mKeyword = str;
        return this;
    }

    public PoiCitySearchOption language(LanguageType languageType) {
        this.mLanguageType = languageType;
        return this;
    }

    public PoiCitySearchOption pageCapacity(int i8) {
        this.mPageCapacity = i8;
        return this;
    }

    public PoiCitySearchOption pageNum(int i8) {
        this.mPageNum = i8;
        return this;
    }

    public PoiCitySearchOption poiFilter(PoiFilter poiFilter) {
        this.mPoiFilter = poiFilter;
        return this;
    }

    public PoiCitySearchOption scope(int i8) {
        this.mScope = i8;
        return this;
    }

    public PoiCitySearchOption serverType(PoiServerType poiServerType) {
        this.mServerType = poiServerType;
        return this;
    }

    public PoiCitySearchOption setCenter(LatLng latLng) {
        this.f6892b = latLng;
        return this;
    }

    public PoiCitySearchOption setExtendChildPoi(boolean z7) {
        this.f6897g = z7;
        return this;
    }

    public PoiCitySearchOption setFilterDistance(int i8) {
        this.f6893c = i8;
        return this;
    }

    public PoiCitySearchOption setSearchBound(LatLngBounds latLngBounds) {
        this.f6895e = latLngBounds;
        return this;
    }

    public PoiCitySearchOption setShowPhoto(boolean z7) {
        this.f6891a = z7;
        return this;
    }

    public PoiCitySearchOption setViewBound(LatLngBounds latLngBounds) {
        this.f6894d = latLngBounds;
        return this;
    }

    public PoiCitySearchOption tag(String str) {
        this.mTag = str;
        return this;
    }
}
