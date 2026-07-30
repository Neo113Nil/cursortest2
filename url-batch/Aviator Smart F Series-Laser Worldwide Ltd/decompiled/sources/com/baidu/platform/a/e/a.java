package com.baidu.platform.a.e;

import com.baidu.mapapi.search.geocode.GeoCodeOption;
import com.baidu.mapapi.search.geocode.OnGetGeoCoderResultListener;
import com.baidu.mapapi.search.geocode.ReverseGeoCodeOption;
import com.baidu.platform.base.SearchType;
import com.baidu.platform.base.g;

/* loaded from: classes2.dex */
public class a extends com.baidu.platform.base.b implements d {

    /* renamed from: g, reason: collision with root package name */
    OnGetGeoCoderResultListener f8594g = null;

    @Override // com.baidu.platform.a.e.d
    public boolean a(GeoCodeOption geoCodeOption) {
        b bVar = new b();
        g cVar = new c(geoCodeOption);
        bVar.a(SearchType.GEO_CODER);
        if (geoCodeOption != null) {
            bVar.b(geoCodeOption.getAddress());
        }
        return a(cVar, this.f8594g, bVar);
    }

    @Override // com.baidu.platform.a.e.d
    public void destroy() {
        this.f8690c.lock();
        this.f8594g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.e.d
    public boolean a(ReverseGeoCodeOption reverseGeoCodeOption) {
        e eVar = new e();
        f fVar = new f(reverseGeoCodeOption);
        eVar.a(SearchType.REVERSE_GEO_CODER);
        return a(fVar, this.f8594g, eVar);
    }

    @Override // com.baidu.platform.a.e.d
    public void a(OnGetGeoCoderResultListener onGetGeoCoderResultListener) {
        this.f8690c.lock();
        this.f8594g = onGetGeoCoderResultListener;
        this.f8690c.unlock();
    }
}
