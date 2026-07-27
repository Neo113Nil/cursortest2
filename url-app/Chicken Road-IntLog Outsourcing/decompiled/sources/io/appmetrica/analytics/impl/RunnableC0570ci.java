package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0570ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f8002a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f8003b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0802li f8004c;

    public RunnableC0570ci(C0802li c0802li, AdRevenue adRevenue, boolean z) {
        this.f8004c = c0802li;
        this.f8002a = adRevenue;
        this.f8003b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0802li c0802li = this.f8004c;
        C0802li.a(c0802li.f8739a, c0802li.f8742d, c0802li.f8743e).reportAdRevenue(this.f8002a, this.f8003b);
    }
}
