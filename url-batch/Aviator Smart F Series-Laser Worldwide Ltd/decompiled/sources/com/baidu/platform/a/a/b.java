package com.baidu.platform.a.a;

import com.baidu.mapapi.search.aoi.AoiSearchOption;
import com.baidu.mapapi.search.aoi.OnGetAoiSearchResultListener;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.b {

    /* renamed from: g, reason: collision with root package name */
    private OnGetAoiSearchResultListener f8586g;

    public boolean a(AoiSearchOption aoiSearchOption) {
        a aVar = new a();
        aVar.a(SearchType.AOI_SEARCH);
        return a(new c(aoiSearchOption), this.f8586g, aVar);
    }

    public void destroy() {
        this.f8690c.lock();
        this.f8586g = null;
        this.f8690c.unlock();
    }

    public void a(OnGetAoiSearchResultListener onGetAoiSearchResultListener) {
        this.f8690c.lock();
        this.f8586g = onGetAoiSearchResultListener;
        this.f8690c.unlock();
    }
}
