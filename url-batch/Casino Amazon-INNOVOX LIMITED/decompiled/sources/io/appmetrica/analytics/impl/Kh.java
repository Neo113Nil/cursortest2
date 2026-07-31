package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Kh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f921a;
    public final /* synthetic */ C0231hi b;

    public Kh(C0231hi c0231hi, Throwable th) {
        this.b = c0231hi;
        this.f921a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportUnhandledException(this.f921a);
    }
}
