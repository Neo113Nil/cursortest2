package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes3.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f1109a;
    public final /* synthetic */ C0541u1 b;

    public X0(C0541u1 c0541u1, Revenue revenue) {
        this.b = c0541u1;
        this.f1109a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0541u1.a(this.b).reportRevenue(this.f1109a);
    }
}
