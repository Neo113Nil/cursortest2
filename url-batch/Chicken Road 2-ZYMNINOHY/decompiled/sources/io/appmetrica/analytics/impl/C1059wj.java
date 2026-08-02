package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* renamed from: io.appmetrica.analytics.impl.wj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1059wj implements Qa {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f12950a;

    public C1059wj(Revenue revenue) {
        this.f12950a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Ra ra) {
        ra.reportRevenue(this.f12950a);
    }
}
