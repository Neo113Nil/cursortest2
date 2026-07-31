package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes3.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f38449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38450b;

    public W0(C2872p1 c2872p1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f38450b = c2872p1;
        this.f38449a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f38450b.f39593a.getClass();
        C2974t0 c2974t0 = C2974t0.f39820e;
        c2974t0.f().a(this.f38449a);
    }
}
