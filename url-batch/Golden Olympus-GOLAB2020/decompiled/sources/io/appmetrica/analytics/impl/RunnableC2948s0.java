package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2948s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2974t0 f39761a;

    public RunnableC2948s0(C2974t0 c2974t0) {
        this.f39761a = c2974t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C3082x4.l().f40118c.a().executeDelayed(new RunnableC2923r1(this.f39761a.f39823a), TimeUnit.SECONDS.toMillis(5L));
    }
}
