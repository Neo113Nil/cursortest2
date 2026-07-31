package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes3.dex */
public final class Sh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f1046a;
    public final /* synthetic */ C0231hi b;

    public Sh(C0231hi c0231hi, ECommerceEvent eCommerceEvent) {
        this.b = c0231hi;
        this.f1046a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0231hi c0231hi = this.b;
        C0231hi.a(c0231hi.f1292a, c0231hi.d, c0231hi.e).reportECommerce(this.f1046a);
    }
}
