package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ei, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0153ei implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0231hi f1239a;

    public RunnableC0153ei(C0231hi c0231hi) {
        this.f1239a = c0231hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.f1239a;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).clearAppEnvironment();
    }
}
