package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f6712a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6713b;

    public Th(C0651li c0651li, Revenue revenue) {
        this.f6713b = c0651li;
        this.f6712a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6713b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportRevenue(this.f6712a);
    }
}
