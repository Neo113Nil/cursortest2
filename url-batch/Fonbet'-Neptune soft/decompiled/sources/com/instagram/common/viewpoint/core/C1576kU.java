package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1576kU implements InterfaceC0511Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C0444Gg A02;
    public C0445Gh A03;

    public C1576kU(C0445Gh c0445Gh, C0444Gg c0444Gg) {
        this.A03 = c0445Gh;
        this.A02 = c0444Gg;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0511Iw
    public final InterfaceC0460Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C1616lK(this.A03, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0511Iw
    public final long AGd(InterfaceC1619lN interfaceC1619lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0511Iw
    public final void AJR(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC01424a.A0L(jArr, j, true, true)];
    }
}
