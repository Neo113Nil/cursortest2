package com.baidu.mapapi.search.district;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.d.d;
import com.baidu.platform.a.d.e;

/* loaded from: classes2.dex */
public class DistrictSearch extends a {

    /* renamed from: a, reason: collision with root package name */
    private e f6856a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f6857b = false;

    DistrictSearch() {
        this.f6856a = null;
        this.f6856a = new d();
    }

    public static DistrictSearch newInstance() {
        BMapManager.init();
        return new DistrictSearch();
    }

    public void destroy() {
        if (this.f6857b) {
            return;
        }
        this.f6857b = true;
        this.f6856a.destroy();
        BMapManager.destroy();
    }

    public boolean searchDistrict(DistrictSearchOption districtSearchOption) {
        String str;
        if (this.f6856a == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (districtSearchOption == null || (str = districtSearchOption.mCityName) == null || str.equals("")) {
            throw new IllegalArgumentException("BDMapSDKException: option or city name can not be null or empty.");
        }
        return this.f6856a.a(districtSearchOption);
    }

    public void setOnDistrictSearchListener(OnGetDistricSearchResultListener onGetDistricSearchResultListener) {
        e eVar = this.f6856a;
        if (eVar == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (onGetDistricSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        eVar.a(onGetDistricSearchResultListener);
    }
}
