package com.instagram.common.viewpoint.core;

import androidx.work.WorkRequest;

/* renamed from: com.facebook.ads.redexgen.X.kW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1578kW implements InterfaceC0460Gw {
    public final /* synthetic */ C1577kV A00;

    public C1578kW(C1577kV c1577kV) {
        this.A00 = c1577kV;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final long A7l() {
        AbstractC0514Iz abstractC0514Iz;
        long j;
        abstractC0514Iz = this.A00.A0B;
        j = this.A00.A07;
        return abstractC0514Iz.A05(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final C0459Gv A8t(long j) {
        AbstractC0514Iz abstractC0514Iz;
        long j2;
        long j3;
        long targetGranule;
        long targetGranule2;
        long j4;
        long j5;
        abstractC0514Iz = this.A00.A0B;
        long A06 = abstractC0514Iz.A06(j);
        j2 = this.A00.A09;
        j3 = this.A00.A08;
        targetGranule = this.A00.A09;
        long j6 = (j3 - targetGranule) * A06;
        targetGranule2 = this.A00.A07;
        long j7 = (j2 + (j6 / targetGranule2)) - WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS;
        j4 = this.A00.A09;
        j5 = this.A00.A08;
        long estimatedPosition = AbstractC01424a.A0T(j7, j4, j5 - 1);
        return new C0459Gv(new C0461Gx(j, estimatedPosition));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0460Gw
    public final boolean AAa() {
        return true;
    }
}
