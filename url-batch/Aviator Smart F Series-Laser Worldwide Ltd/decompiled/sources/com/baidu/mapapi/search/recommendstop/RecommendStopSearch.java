package com.baidu.mapapi.search.recommendstop;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.a;
import com.baidu.platform.a.g.b;

/* loaded from: classes2.dex */
public class RecommendStopSearch extends a {

    /* renamed from: b, reason: collision with root package name */
    private boolean f7195b = false;

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.platform.a.g.a f7194a = new b();

    private RecommendStopSearch() {
    }

    public static RecommendStopSearch newInstance() {
        BMapManager.init();
        return new RecommendStopSearch();
    }

    public void destroy() {
        if (this.f7195b) {
            return;
        }
        this.f7195b = true;
        com.baidu.platform.a.g.a aVar = this.f7194a;
        if (aVar != null) {
            aVar.destroy();
        }
        BMapManager.destroy();
    }

    public boolean requestRecommendStop(RecommendStopSearchOption recommendStopSearchOption) {
        if (this.f7194a == null) {
            throw new IllegalStateException("BDMapSDKException: RecommendStopSearch is null, please call newInstance() first.");
        }
        if (recommendStopSearchOption == null || recommendStopSearchOption.getLocation() == null) {
            throw new IllegalStateException("BDMapSDKException: option or location can not be null");
        }
        return this.f7194a.a(recommendStopSearchOption);
    }

    public void setOnGetRecommendStopResultListener(OnGetRecommendStopResultListener onGetRecommendStopResultListener) {
        com.baidu.platform.a.g.a aVar = this.f7194a;
        if (aVar == null) {
            throw new IllegalStateException("BDMapSDKException: RecommendStopSearch is null, please call newInstance() first.");
        }
        if (onGetRecommendStopResultListener == null) {
            throw new IllegalStateException("BDMapSDKException: OnGetRecommendStopResultListener can not be null");
        }
        aVar.a(onGetRecommendStopResultListener);
    }
}
