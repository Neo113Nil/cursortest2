package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f7719a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f7720b;

    public Y0(C0966s1 c0966s1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f7720b = c0966s1;
        this.f7719a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7720b.f9216a.getClass();
        C1069w0 c1069w0 = C1069w0.f9490e;
        c1069w0.f().a(this.f7719a);
    }
}
