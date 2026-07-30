package com.baidu.mapapi.search.poi;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.f.f;

/* loaded from: classes2.dex */
public class PoiSearch extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6937b = false;

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.platform.a.f.a f6936a = new f();

    PoiSearch() {
    }

    public static PoiSearch newInstance() {
        BMapManager.init();
        return new PoiSearch();
    }

    public void destroy() {
        if (this.f6937b) {
            return;
        }
        this.f6937b = true;
        this.f6936a.destroy();
        BMapManager.destroy();
    }

    public boolean searchInBound(PoiBoundSearchOption poiBoundSearchOption) {
        com.baidu.platform.a.f.a aVar = this.f6936a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiBoundSearchOption == null || poiBoundSearchOption.mBound == null || poiBoundSearchOption.mKeyword == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or bound or keyworld can not be null");
        }
        return aVar.a(poiBoundSearchOption);
    }

    public boolean searchInCity(PoiCitySearchOption poiCitySearchOption) {
        com.baidu.platform.a.f.a aVar = this.f6936a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiCitySearchOption == null || poiCitySearchOption.mCity == null || poiCitySearchOption.mKeyword == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or city or keyworld can not be null");
        }
        return aVar.a(poiCitySearchOption);
    }

    public boolean searchNearby(PoiNearbySearchOption poiNearbySearchOption) {
        com.baidu.platform.a.f.a aVar = this.f6936a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiNearbySearchOption == null || poiNearbySearchOption.mLocation == null || poiNearbySearchOption.mKeyword == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or location or keyworld can not be null");
        }
        if (poiNearbySearchOption.mRadius <= 0) {
            return false;
        }
        return aVar.a(poiNearbySearchOption);
    }

    public boolean searchPoiDetail(PoiDetailSearchOption poiDetailSearchOption) {
        if (this.f6936a == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiDetailSearchOption == null || poiDetailSearchOption.getUid() == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or uid can not be null");
        }
        return this.f6936a.a(poiDetailSearchOption);
    }

    public boolean searchPoiIndoor(PoiIndoorOption poiIndoorOption) {
        com.baidu.platform.a.f.a aVar = this.f6936a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (poiIndoorOption == null || poiIndoorOption.bid == null || poiIndoorOption.wd == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or indoor bid or keyword can not be null");
        }
        return aVar.a(poiIndoorOption);
    }

    public void setOnGetPoiSearchResultListener(OnGetPoiSearchResultListener onGetPoiSearchResultListener) {
        com.baidu.platform.a.f.a aVar = this.f6936a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (onGetPoiSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        aVar.a(onGetPoiSearchResultListener);
    }
}
