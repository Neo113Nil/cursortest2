package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes.dex */
public final class Mj implements Xa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f7156a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7157b;

    public Mj(AdRevenue adRevenue, boolean z) {
        this.f7156a = adRevenue;
        this.f7157b = z;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya) {
        ya.reportAdRevenue(this.f7156a, this.f7157b);
    }
}
