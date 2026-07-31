package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0102ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0231hi f1201a;

    public RunnableC0102ci(C0231hi c0231hi) {
        this.f1201a = c0231hi;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.f1201a;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).sendEventsBuffer();
    }
}
