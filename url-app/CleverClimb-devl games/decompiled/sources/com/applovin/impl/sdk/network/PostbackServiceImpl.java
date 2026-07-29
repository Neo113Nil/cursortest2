package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.d.q;
import com.applovin.impl.sdk.j;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinPostbackService;

/* loaded from: classes.dex */
public class PostbackServiceImpl implements AppLovinPostbackService {

    /* renamed from: a, reason: collision with root package name */
    private final j f3323a;

    public PostbackServiceImpl(j jVar) {
        this.f3323a = jVar;
    }

    @Override // com.applovin.sdk.AppLovinPostbackService
    public void dispatchPostbackAsync(String str, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(f.b(this.f3323a).a(str).a(false).a(), appLovinPostbackListener);
    }

    public void dispatchPostbackRequest(f fVar, q.a aVar, AppLovinPostbackListener appLovinPostbackListener) {
        this.f3323a.C().a(new com.applovin.impl.sdk.d.j(fVar, aVar, this.f3323a, appLovinPostbackListener), aVar);
    }

    public void dispatchPostbackRequest(f fVar, AppLovinPostbackListener appLovinPostbackListener) {
        dispatchPostbackRequest(fVar, q.a.POSTBACKS, appLovinPostbackListener);
    }
}
