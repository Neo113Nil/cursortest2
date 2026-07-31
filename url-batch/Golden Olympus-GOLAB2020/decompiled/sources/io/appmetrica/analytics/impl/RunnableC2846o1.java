package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.o1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2846o1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f39536a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f39537b;

    public RunnableC2846o1(C2872p1 c2872p1, Throwable th) {
        this.f39537b = c2872p1;
        this.f39536a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f39537b).reportUnhandledException(this.f39536a);
    }
}
