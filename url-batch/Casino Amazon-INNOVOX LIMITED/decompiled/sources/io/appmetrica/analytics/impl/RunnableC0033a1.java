package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0033a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f1154a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0033a1(C0541u1 c0541u1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.b = c0541u1;
        this.f1154a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f1507a.getClass();
        C0640y0 c0640y0 = C0640y0.e;
        c0640y0.f().a(this.f1154a);
    }
}
