package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f13134a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f13135b;

    public j(k kVar, i iVar) {
        this.f13135b = kVar;
        this.f13134a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f13135b.f13138c;
        i iVar = this.f13134a;
        pVar.f13155a = iVar;
        CacheArguments cacheArguments = iVar.f13133b;
        pVar.f13156b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
