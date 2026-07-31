package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes3.dex */
public final class Qh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f1017a;
    public final /* synthetic */ C0231hi b;

    public Qh(C0231hi c0231hi, AdRevenue adRevenue) {
        this.b = c0231hi;
        this.f1017a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportAdRevenue(this.f1017a);
    }
}
