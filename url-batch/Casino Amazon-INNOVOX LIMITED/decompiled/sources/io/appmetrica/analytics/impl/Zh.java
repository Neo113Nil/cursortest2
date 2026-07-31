package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Rn f1147a;
    public final /* synthetic */ C0231hi b;

    public Zh(C0231hi c0231hi, Rn rn) {
        this.b = c0231hi;
        this.f1147a = rn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).a(this.f1147a);
    }
}
