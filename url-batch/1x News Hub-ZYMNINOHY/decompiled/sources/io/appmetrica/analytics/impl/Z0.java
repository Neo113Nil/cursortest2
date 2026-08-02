package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* loaded from: classes.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f6922a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6923b;

    public Z0(C0815s1 c0815s1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f6923b = c0815s1;
        this.f6922a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f6923b.f8278a.getClass();
        C0918w0 c0918w0 = C0918w0.f8537e;
        c0918w0.f().a(this.f6922a);
    }
}
