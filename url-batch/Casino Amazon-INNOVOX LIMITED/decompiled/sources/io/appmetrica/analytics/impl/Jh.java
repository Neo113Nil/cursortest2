package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Jh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f908a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Throwable c;
    public final /* synthetic */ C0231hi d;

    public Jh(C0231hi c0231hi, String str, String str2, Throwable th) {
        this.d = c0231hi;
        this.f908a = str;
        this.b = str2;
        this.c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.d;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportError(this.f908a, this.b, this.c);
    }
}
