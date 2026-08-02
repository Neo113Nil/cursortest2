package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0472a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f11407a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11408b;

    public RunnableC0472a1(C0963t1 c0963t1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f11408b = c0963t1;
        this.f11407a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11408b.f12756a.getClass();
        C1092y0 c1092y0 = C1092y0.f13042e;
        c1092y0.f().a(this.f11407a);
    }
}
