package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f7541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0802li f7542b;

    public Th(C0802li c0802li, Revenue revenue) {
        this.f7542b = c0802li;
        this.f7541a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f7542b;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportRevenue(this.f7541a);
    }
}
