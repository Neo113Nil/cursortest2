package com.baidu.platform.a.f;

import com.baidu.mapapi.search.poi.OnGetPoiSearchResultListener;
import com.baidu.mapapi.search.poi.PoiBoundSearchOption;
import com.baidu.mapapi.search.poi.PoiCitySearchOption;
import com.baidu.mapapi.search.poi.PoiDetailSearchOption;
import com.baidu.mapapi.search.poi.PoiIndoorOption;
import com.baidu.mapapi.search.poi.PoiNearbySearchOption;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class f extends com.baidu.platform.base.b implements a {

    /* renamed from: g, reason: collision with root package name */
    private OnGetPoiSearchResultListener f8600g = null;

    @Override // com.baidu.platform.a.f.a
    public boolean a(PoiNearbySearchOption poiNearbySearchOption) {
        g gVar = new g(poiNearbySearchOption.mPageNum, poiNearbySearchOption.mPageCapacity);
        gVar.a(SearchType.POI_NEAR_BY_SEARCH);
        return a(new h(poiNearbySearchOption), this.f8600g, gVar);
    }

    @Override // com.baidu.platform.a.f.a
    public void destroy() {
        this.f8690c.lock();
        this.f8600g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.f.a
    public boolean a(PoiCitySearchOption poiCitySearchOption) {
        g gVar = new g(poiCitySearchOption.mPageNum, poiCitySearchOption.mPageCapacity);
        gVar.a(SearchType.POI_IN_CITY_SEARCH);
        return a(new h(poiCitySearchOption), this.f8600g, gVar);
    }

    @Override // com.baidu.platform.a.f.a
    public boolean a(PoiBoundSearchOption poiBoundSearchOption) {
        g gVar = new g(poiBoundSearchOption.mPageNum, poiBoundSearchOption.mPageCapacity);
        gVar.a(SearchType.POI_IN_BOUND_SEARCH);
        return a(new h(poiBoundSearchOption), this.f8600g, gVar);
    }

    @Override // com.baidu.platform.a.f.a
    public boolean a(PoiDetailSearchOption poiDetailSearchOption) {
        d dVar = new d();
        if (poiDetailSearchOption != null) {
            dVar.a(poiDetailSearchOption.isSearchByUids());
        }
        dVar.a(SearchType.POI_DETAIL_SEARCH);
        return a(new e(poiDetailSearchOption), this.f8600g, dVar);
    }

    @Override // com.baidu.platform.a.f.a
    public boolean a(PoiIndoorOption poiIndoorOption) {
        b bVar = new b();
        bVar.a(SearchType.INDOOR_POI_SEARCH);
        return a(new c(poiIndoorOption), this.f8600g, bVar);
    }

    @Override // com.baidu.platform.a.f.a
    public void a(OnGetPoiSearchResultListener onGetPoiSearchResultListener) {
        this.f8690c.lock();
        this.f8600g = onGetPoiSearchResultListener;
        this.f8690c.unlock();
    }
}
