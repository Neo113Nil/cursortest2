package com.instagram.common.viewpoint.core;

import androidx.work.WorkRequest;

/* renamed from: com.facebook.ads.redexgen.X.kW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1584kW implements InterfaceC0466Gw {
    public final /* synthetic */ C1583kV A00;

    public C1584kW(C1583kV c1583kV) {
        this.A00 = c1583kV;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final long A7l() {
        AbstractC0520Iz abstractC0520Iz;
        long j;
        abstractC0520Iz = this.A00.A0B;
        j = this.A00.A07;
        return abstractC0520Iz.A05(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final C0465Gv A8t(long j) {
        AbstractC0520Iz abstractC0520Iz;
        long j2;
        long j3;
        long targetGranule;
        long targetGranule2;
        long j4;
        long j5;
        abstractC0520Iz = this.A00.A0B;
        long A06 = abstractC0520Iz.A06(j);
        j2 = this.A00.A09;
        j3 = this.A00.A08;
        targetGranule = this.A00.A09;
        long j6 = (j3 - targetGranule) * A06;
        targetGranule2 = this.A00.A07;
        long j7 = (j2 + (j6 / targetGranule2)) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        j4 = this.A00.A09;
        j5 = this.A00.A08;
        long estimatedPosition = AbstractC01484a.A0T(j7, j4, j5 - 1);
        return new C0465Gv(new C0467Gx(j, estimatedPosition));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final boolean AAa() {
        return true;
    }
}
