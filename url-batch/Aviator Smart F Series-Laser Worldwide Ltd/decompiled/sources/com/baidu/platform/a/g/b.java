package com.baidu.platform.a.g;

import com.baidu.mapapi.search.recommendstop.OnGetRecommendStopResultListener;
import com.baidu.mapapi.search.recommendstop.RecommendStopSearchOption;
import com.baidu.platform.base.SearchType;

/* loaded from: classes2.dex */
public class b extends com.baidu.platform.base.b implements a {

    /* renamed from: g, reason: collision with root package name */
    private OnGetRecommendStopResultListener f8618g = null;

    @Override // com.baidu.platform.a.g.a
    public boolean a(RecommendStopSearchOption recommendStopSearchOption) {
        c cVar = new c();
        cVar.a(SearchType.RECOMMEND_STOP);
        return a(new d(recommendStopSearchOption), this.f8618g, cVar);
    }

    @Override // com.baidu.platform.a.g.a
    public void destroy() {
        this.f8690c.lock();
        this.f8618g = null;
        this.f8690c.unlock();
    }

    @Override // com.baidu.platform.a.g.a
    public void a(OnGetRecommendStopResultListener onGetRecommendStopResultListener) {
        this.f8690c.lock();
        this.f8618g = onGetRecommendStopResultListener;
        this.f8690c.unlock();
    }
}
