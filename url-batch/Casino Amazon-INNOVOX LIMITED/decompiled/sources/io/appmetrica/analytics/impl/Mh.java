package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Mh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0231hi f957a;

    public Mh(C0231hi c0231hi) {
        this.f957a = c0231hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.f957a;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).pauseSession();
    }
}
