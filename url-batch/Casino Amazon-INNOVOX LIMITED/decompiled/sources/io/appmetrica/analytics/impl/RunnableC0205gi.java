package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.gi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0205gi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1274a;
    public final /* synthetic */ String b;
    public final /* synthetic */ C0231hi c;

    public RunnableC0205gi(C0231hi c0231hi, String str, String str2) {
        this.c = c0231hi;
        this.f1274a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.c;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportEvent(this.f1274a, this.b);
    }
}
