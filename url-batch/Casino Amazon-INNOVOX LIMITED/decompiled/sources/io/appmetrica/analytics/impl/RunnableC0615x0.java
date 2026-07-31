package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0615x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0640y0 f1556a;

    public RunnableC0615x0(C0640y0 c0640y0) {
        this.f1556a = c0640y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0088c4.l().c.a().executeDelayed(new RunnableC0591w1(this.f1556a.f1574a), TimeUnit.SECONDS.toMillis(5L));
    }
}
