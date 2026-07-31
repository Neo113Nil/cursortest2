package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.fi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0179fi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1258a;
    public final /* synthetic */ C0231hi b;

    public RunnableC0179fi(C0231hi c0231hi, String str) {
        this.b = c0231hi;
        this.f1258a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportEvent(this.f1258a);
    }
}
