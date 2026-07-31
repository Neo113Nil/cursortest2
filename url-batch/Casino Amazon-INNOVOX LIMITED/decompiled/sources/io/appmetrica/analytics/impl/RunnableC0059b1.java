package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0059b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f1173a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0059b1(C0541u1 c0541u1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.b = c0541u1;
        this.f1173a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.f1507a.getClass();
        C0640y0 c0640y0 = C0640y0.e;
        c0640y0.f().a(this.f1173a);
    }
}
