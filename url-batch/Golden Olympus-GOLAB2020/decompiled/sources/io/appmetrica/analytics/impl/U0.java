package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes3.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f38340a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2872p1 f38341b;

    public U0(C2872p1 c2872p1, ECommerceEvent eCommerceEvent) {
        this.f38341b = c2872p1;
        this.f38340a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2872p1.a(this.f38341b).reportECommerce(this.f38340a);
    }
}
