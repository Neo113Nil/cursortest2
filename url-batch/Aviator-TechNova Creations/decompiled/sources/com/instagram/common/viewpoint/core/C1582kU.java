package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1582kU implements InterfaceC0517Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C0450Gg A02;
    public C0451Gh A03;

    public C1582kU(C0451Gh c0451Gh, C0450Gg c0450Gg) {
        this.A03 = c0451Gh;
        this.A02 = c0450Gg;
    }

    public final void A00(long j) {
        this.A00 = j;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0517Iw
    public final InterfaceC0466Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C1622lK(this.A03, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0517Iw
    public final long AGd(InterfaceC1625lN interfaceC1625lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0517Iw
    public final void AJR(long j) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC01484a.A0L(jArr, j, true, true)];
    }
}
