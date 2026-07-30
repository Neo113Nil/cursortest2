package com.baidu.platform.a.d;

import com.baidu.mapapi.search.district.DistrictSearchOption;
import com.baidu.mapapi.search.district.OnGetDistricSearchResultListener;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class d extends com.baidu.platform.base.b implements e {

    /* renamed from: g, reason: collision with root package name */
    private OnGetDistricSearchResultListener f8593g = null;

    @Override // com.baidu.platform.a.d.e
    public boolean a(DistrictSearchOption districtSearchOption) {
        b bVar = new b();
        bVar.a(SearchType.DISTRICT_SEARCH);
        return a(new a(districtSearchOption), this.f8593g, bVar);
    }

    @Override // com.baidu.platform.a.d.e
    public void destroy() {
        this.f8690c.lock();
        this.f8593g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.d.e
    public void a(OnGetDistricSearchResultListener onGetDistricSearchResultListener) {
        this.f8690c.lock();
        this.f8593g = onGetDistricSearchResultListener;
        this.f8690c.unlock();
    }
}
