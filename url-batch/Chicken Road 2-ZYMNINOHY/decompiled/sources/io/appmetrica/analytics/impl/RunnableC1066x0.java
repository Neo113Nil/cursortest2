package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.x0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1066x0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1092y0 f12989a;

    public RunnableC1066x0(C1092y0 c1092y0) {
        this.f12989a = c1092y0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0501b4.l().f11457c.a().executeDelayed(new RunnableC1015v1(this.f12989a.f13045a), TimeUnit.SECONDS.toMillis(5L));
    }
}
