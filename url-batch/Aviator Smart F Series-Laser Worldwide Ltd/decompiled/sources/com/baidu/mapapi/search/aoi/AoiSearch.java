package com.baidu.mapapi.search.aoi;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.a.b;

/* loaded from: classes2.dex */
public class AoiSearch extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f6611b = false;

    /* renamed from: a, reason: collision with root package name */
    private final b f6610a = new b();

    public static AoiSearch newInstance() {
        BMapManager.init();
        return new AoiSearch();
    }

    public void destroy() {
        if (this.f6611b) {
            return;
        }
        this.f6611b = true;
        this.f6610a.destroy();
        BMapManager.destroy();
    }

    public boolean requestAoi(AoiSearchOption aoiSearchOption) {
        if (this.f6610a == null) {
            throw new IllegalStateException("BDMapSDKException: AoiSearch is null, please call newInstance() first.");
        }
        if (aoiSearchOption == null || aoiSearchOption.getLatLngList() == null || aoiSearchOption.getLatLngList().size() <= 0) {
            throw new IllegalStateException("BDMapSDKException: option or location can not be null");
        }
        return this.f6610a.a(aoiSearchOption);
    }

    public void setOnGetAoiSearchResultListener(OnGetAoiSearchResultListener onGetAoiSearchResultListener) {
        b bVar = this.f6610a;
        if (bVar == null) {
            throw new IllegalStateException("BDMapSDKException: AoiSearch is null, please call newInstance first.");
        }
        if (onGetAoiSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        bVar.a(onGetAoiSearchResultListener);
    }
}
