package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Nh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f974a;
    public final /* synthetic */ C0231hi b;

    public Nh(C0231hi c0231hi, String str) {
        this.b = c0231hi;
        this.f974a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).setUserProfileID(this.f974a);
    }
}
