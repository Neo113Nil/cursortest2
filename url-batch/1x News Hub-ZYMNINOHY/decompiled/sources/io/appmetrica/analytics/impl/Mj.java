package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Mj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f6346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f6347b;

    public Mj(AdRevenue adRevenue, boolean z) {
        this.f6346a = adRevenue;
        this.f6347b = z;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportAdRevenue(this.f6346a, this.f6347b);
    }
}
