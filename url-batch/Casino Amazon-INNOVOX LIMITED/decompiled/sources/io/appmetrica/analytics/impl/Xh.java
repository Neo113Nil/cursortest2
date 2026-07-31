package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Xh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f1117a;
    public final /* synthetic */ byte[] b;
    public final /* synthetic */ C0231hi c;

    public Xh(C0231hi c0231hi, String str, byte[] bArr) {
        this.c = c0231hi;
        this.f1117a = str;
        this.b = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.c;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).setSessionExtra(this.f1117a, this.b);
    }
}
