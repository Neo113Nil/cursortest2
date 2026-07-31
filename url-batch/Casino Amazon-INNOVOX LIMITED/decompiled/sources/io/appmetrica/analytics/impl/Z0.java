package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes3.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f1137a;
    public final /* synthetic */ C0541u1 b;

    public Z0(C0541u1 c0541u1, ECommerceEvent eCommerceEvent) {
        this.b = c0541u1;
        this.f1137a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).reportECommerce(this.f1137a);
    }
}
