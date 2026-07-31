package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f1061a;
    public final /* synthetic */ C0231hi b;

    public Th(C0231hi c0231hi, boolean z) {
        this.b = c0231hi;
        this.f1061a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).setDataSendingEnabled(this.f1061a);
    }
}
