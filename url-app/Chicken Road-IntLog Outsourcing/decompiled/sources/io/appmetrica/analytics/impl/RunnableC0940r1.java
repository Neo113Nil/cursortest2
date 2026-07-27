package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0940r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f9128a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0966s1 f9129b;

    public RunnableC0940r1(C0966s1 c0966s1, Throwable th) {
        this.f9129b = c0966s1;
        this.f9128a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0966s1.a(this.f9129b).reportUnhandledException(this.f9128a);
    }
}
