package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0789r1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f8194a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f8195b;

    public RunnableC0789r1(C0815s1 c0815s1, Throwable th) {
        this.f8195b = c0815s1;
        this.f8194a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f8195b).reportUnhandledException(this.f8194a);
    }
}
