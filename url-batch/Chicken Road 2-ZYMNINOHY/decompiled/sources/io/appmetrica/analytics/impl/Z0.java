package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f11332a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11333b;

    public Z0(C0963t1 c0963t1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f11333b = c0963t1;
        this.f11332a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11333b.f12756a.getClass();
        C1092y0 c1092y0 = C1092y0.f13042e;
        c1092y0.f().a(this.f11332a);
    }
}
