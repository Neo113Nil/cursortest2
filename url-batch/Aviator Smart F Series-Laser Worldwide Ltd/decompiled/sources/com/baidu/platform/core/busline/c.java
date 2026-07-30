package com.baidu.platform.core.busline;

import com.baidu.mapapi.search.busline.BusLineSearchOption;
import com.baidu.mapapi.search.busline.OnGetBusLineSearchResultListener;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class c extends com.baidu.platform.base.b implements IBusLineSearch {

    /* renamed from: g, reason: collision with root package name */
    OnGetBusLineSearchResultListener f10617g = null;

    @Override // com.baidu.platform.core.busline.IBusLineSearch
    public boolean a(BusLineSearchOption busLineSearchOption) {
        a aVar = new a();
        aVar.a(SearchType.BUS_LINE_DETAIL);
        return a(new b(busLineSearchOption), this.f10617g, aVar);
    }

    @Override // com.baidu.platform.core.busline.IBusLineSearch
    public void destroy() {
        this.f8690c.lock();
        this.f10617g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.core.busline.IBusLineSearch
    public void a(OnGetBusLineSearchResultListener onGetBusLineSearchResultListener) {
        this.f8690c.lock();
        this.f10617g = onGetBusLineSearchResultListener;
        this.f8690c.unlock();
    }
}
