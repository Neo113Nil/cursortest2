package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Aj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f10059a;

    public Aj(AdRevenue adRevenue) {
        this.f10059a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportAdRevenue(this.f10059a);
    }
}
