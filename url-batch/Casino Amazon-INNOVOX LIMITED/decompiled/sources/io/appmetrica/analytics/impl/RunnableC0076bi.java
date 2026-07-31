package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0076bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ V f1185a;
    public final /* synthetic */ C0231hi b;

    public RunnableC0076bi(C0231hi c0231hi, V v) {
        this.b = c0231hi;
        this.f1185a = v;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).a(this.f1185a);
    }
}
