package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Hj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f10379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f10380b;

    public Hj(AdRevenue adRevenue, boolean z) {
        this.f10379a = adRevenue;
        this.f10380b = z;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportAdRevenue(this.f10379a, this.f10380b);
    }
}
