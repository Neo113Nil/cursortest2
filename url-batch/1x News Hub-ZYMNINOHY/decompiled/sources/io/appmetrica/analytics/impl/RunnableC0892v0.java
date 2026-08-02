package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0892v0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0918w0 f8475a;

    public RunnableC0892v0(C0918w0 c0918w0) {
        this.f8475a = c0918w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0585j4.l().f7594c.a().executeDelayed(new RunnableC0867u1(this.f8475a.f8539a), TimeUnit.SECONDS.toMillis(5L));
    }
}
