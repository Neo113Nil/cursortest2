package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38180a;

    public R0(C2872p1 c2872p1) {
        this.f38180a = c2872p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38180a).sendEventsBuffer();
    }
}
