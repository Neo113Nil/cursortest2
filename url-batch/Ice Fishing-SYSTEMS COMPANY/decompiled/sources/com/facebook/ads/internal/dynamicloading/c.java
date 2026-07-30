package com.facebook.ads.internal.dynamicloading;

import com.facebook.ads.AudienceNetworkAds;

/* loaded from: classes.dex */
public final class c implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ AudienceNetworkAds.InitListener f23666n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Throwable f23667u;

    public c(AudienceNetworkAds.InitListener initListener, Throwable th) {
        this.f23666n = initListener;
        this.f23667u = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AudienceNetworkAds.InitResult createErrorInitResult;
        createErrorInitResult = DynamicLoaderFactory.createErrorInitResult(this.f23667u);
        this.f23666n.onInitialized(createErrorInitResult);
    }
}
