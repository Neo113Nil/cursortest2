package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.bi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC2522bi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f38730a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2992ti f38731b;

    public RunnableC2522bi(C2992ti c2992ti, Revenue revenue) {
        this.f38731b = c2992ti;
        this.f38730a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C2992ti c2992ti = this.f38731b;
        C2992ti.a(c2992ti.f39864a, c2992ti.f39867d, c2992ti.f39868e).reportRevenue(this.f38730a);
    }
}
