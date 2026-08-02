package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC0419ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f7146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7147b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0651li f7148c;

    public RunnableC0419ci(C0651li c0651li, AdRevenue adRevenue, boolean z) {
        this.f7148c = c0651li;
        this.f7146a = adRevenue;
        this.f7147b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0651li c0651li = this.f7148c;
        C0651li.a(c0651li.f7831a, c0651li.f7834d, c0651li.f7835e).reportAdRevenue(this.f7146a, this.f7147b);
    }
}
