package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f6764a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0651li f6765b;

    public Uh(C0651li c0651li, AdRevenue adRevenue) {
        this.f6765b = c0651li;
        this.f6764a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f6765b;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportAdRevenue(this.f6764a);
    }
}
