package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes.dex */
public final class Oh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f10756a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0644gi f10757b;

    public Oh(C0644gi c0644gi, Revenue revenue) {
        this.f10757b = c0644gi;
        this.f10756a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0644gi c0644gi = this.f10757b;
        C0644gi.a(c0644gi.f11935a, c0644gi.f11938d, c0644gi.f11939e).reportRevenue(this.f10756a);
    }
}
