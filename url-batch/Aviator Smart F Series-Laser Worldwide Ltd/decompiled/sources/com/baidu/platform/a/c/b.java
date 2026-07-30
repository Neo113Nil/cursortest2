package com.baidu.platform.a.c;

import com.baidu.mapapi.search.building.BuildingSearchOption;
import com.baidu.mapapi.search.building.OnGetBuildingSearchResultListener;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.b {

    /* renamed from: g, reason: collision with root package name */
    private OnGetBuildingSearchResultListener f8590g;

    public boolean a(BuildingSearchOption buildingSearchOption) {
        a aVar = new a();
        aVar.a(SearchType.BUILDING_SEARCH);
        return a(new c(buildingSearchOption), this.f8590g, aVar);
    }

    public void destroy() {
        this.f8690c.lock();
        this.f8590g = null;
        this.f8690c.unlock();
    }

    public void a(OnGetBuildingSearchResultListener onGetBuildingSearchResultListener) {
        this.f8690c.lock();
        this.f8590g = onGetBuildingSearchResultListener;
        this.f8690c.unlock();
    }
}
