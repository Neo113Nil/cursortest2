package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes3.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f38385a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38386b;

    public V0(C2872p1 c2872p1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f38386b = c2872p1;
        this.f38385a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38386b.f39593a.getClass();
        C2974t0 c2974t0 = C2974t0.f39820e;
        c2974t0.f().a(this.f38385a);
    }
}
