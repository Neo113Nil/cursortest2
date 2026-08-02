package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0764q1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f8113a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8114b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f8115c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f8116d;

    public RunnableC0764q1(C0815s1 c0815s1, String str, String str2, Throwable th) {
        this.f8116d = c0815s1;
        this.f8113a = str;
        this.f8114b = str2;
        this.f8115c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f8116d).reportError(this.f8113a, this.f8114b, this.f8115c);
    }
}
