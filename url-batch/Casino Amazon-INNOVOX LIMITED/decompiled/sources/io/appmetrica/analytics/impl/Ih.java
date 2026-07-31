package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Ih implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f891a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ C0231hi c;

    public Ih(C0231hi c0231hi, String str, Throwable th) {
        this.c = c0231hi;
        this.f891a = str;
        this.b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.c;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportError(this.f891a, this.b);
    }
}
