package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class V0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f6778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0815s1 f6779b;

    public V0(C0815s1 c0815s1, Revenue revenue) {
        this.f6779b = c0815s1;
        this.f6778a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0815s1.a(this.f6779b).reportRevenue(this.f6778a);
    }
}
