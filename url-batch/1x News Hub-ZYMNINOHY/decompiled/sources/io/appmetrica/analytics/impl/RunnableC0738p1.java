package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.p1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0738p1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8049a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f8050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f8051c;

    public RunnableC0738p1(C0815s1 c0815s1, String str, Throwable th) {
        this.f8051c = c0815s1;
        this.f8049a = str;
        this.f8050b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f8051c).reportError(this.f8049a, this.f8050b);
    }
}
