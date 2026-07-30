package com.baidu.mapapi.search.building;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.c.b;

/* loaded from: classes2.dex */
public class BuildingSearch extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6718b = false;

    /* renamed from: a, reason: collision with root package name */
    private final b f6717a = new b();

    public static BuildingSearch newInstance() {
        BMapManager.init();
        return new BuildingSearch();
    }

    public void destroy() {
        if (this.f6718b) {
            return;
        }
        this.f6718b = true;
        this.f6717a.destroy();
        BMapManager.destroy();
    }

    public boolean requestBuilding(BuildingSearchOption buildingSearchOption) {
        if (this.f6717a == null) {
            throw new IllegalStateException("BDMapSDKException: BuildingSearch is null, please call newInstance() first.");
        }
        if (buildingSearchOption == null || buildingSearchOption.getLatLng() == null) {
            throw new IllegalStateException("BDMapSDKException: option or location can not be null");
        }
        return this.f6717a.a(buildingSearchOption);
    }

    public void setOnGetBuildingSearchResultListener(OnGetBuildingSearchResultListener onGetBuildingSearchResultListener) {
        b bVar = this.f6717a;
        if (bVar == null) {
            throw new IllegalStateException("BDMapSDKException: BuildingSearch is null, please call newInstance first.");
        }
        if (onGetBuildingSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        bVar.a(onGetBuildingSearchResultListener);
    }
}
