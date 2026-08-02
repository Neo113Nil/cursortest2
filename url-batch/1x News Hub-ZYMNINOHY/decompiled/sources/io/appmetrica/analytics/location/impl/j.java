package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f8741a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f8742b;

    public j(k kVar, i iVar) {
        this.f8742b = kVar;
        this.f8741a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f8742b.f8745c;
        i iVar = this.f8741a;
        pVar.f8760a = iVar;
        CacheArguments cacheArguments = iVar.f8740b;
        pVar.f8761b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
