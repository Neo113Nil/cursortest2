package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.t1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0516t1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f1492a;
    public final /* synthetic */ C0541u1 b;

    public RunnableC0516t1(C0541u1 c0541u1, Throwable th) {
        this.b = c0541u1;
        this.f1492a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).reportUnhandledException(this.f1492a);
    }
}
