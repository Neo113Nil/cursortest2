package io.appmetrica.analytics.location.impl;

import io.appmetrica.analytics.locationapi.internal.CacheArguments;

/* loaded from: classes3.dex */
public final class j implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f40436a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f40437b;

    public j(k kVar, i iVar) {
        this.f40437b = kVar;
        this.f40436a = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p pVar = this.f40437b.f40440c;
        i iVar = this.f40436a;
        pVar.f40457a = iVar;
        CacheArguments cacheArguments = iVar.f40435b;
        pVar.f40458b.updateCacheControl(cacheArguments.getRefreshPeriod(), cacheArguments.getOutdatedTimeInterval());
    }
}
