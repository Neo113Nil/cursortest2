package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class W0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0963t1 f11155a;

    public W0(C0963t1 c0963t1) {
        this.f11155a = c0963t1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0963t1.a(this.f11155a).sendEventsBuffer();
    }
}
