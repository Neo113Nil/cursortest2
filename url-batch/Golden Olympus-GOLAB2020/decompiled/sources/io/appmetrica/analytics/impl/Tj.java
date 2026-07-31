package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes3.dex */
public final class Tj implements InterfaceC2778lb {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f38325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f38326b;

    public Tj(AdRevenue adRevenue, boolean z4) {
        this.f38325a = adRevenue;
        this.f38326b = z4;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC2778lb
    public final void a(InterfaceC2804mb interfaceC2804mb) {
        interfaceC2804mb.reportAdRevenue(this.f38325a, this.f38326b);
    }
}
