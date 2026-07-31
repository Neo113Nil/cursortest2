package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes3.dex */
public final class Yh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f1133a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ C0231hi c;

    public Yh(C0231hi c0231hi, AdRevenue adRevenue, boolean z) {
        this.c = c0231hi;
        this.f1133a = adRevenue;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.c;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportAdRevenue(this.f1133a, this.b);
    }
}
