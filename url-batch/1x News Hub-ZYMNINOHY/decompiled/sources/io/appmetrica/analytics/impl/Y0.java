package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* loaded from: classes.dex */
public final class Y0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f6881a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6882b;

    public Y0(C0815s1 c0815s1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f6882b = c0815s1;
        this.f6881a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6882b.f8278a.getClass();
        C0918w0 c0918w0 = C0918w0.f8537e;
        c0918w0.f().a(this.f6881a);
    }
}
