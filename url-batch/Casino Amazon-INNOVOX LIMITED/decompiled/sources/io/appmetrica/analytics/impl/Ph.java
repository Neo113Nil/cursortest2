package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes3.dex */
public final class Ph implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f1002a;
    public final /* synthetic */ C0231hi b;

    public Ph(C0231hi c0231hi, Revenue revenue) {
        this.b = c0231hi;
        this.f1002a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportRevenue(this.f1002a);
    }
}
