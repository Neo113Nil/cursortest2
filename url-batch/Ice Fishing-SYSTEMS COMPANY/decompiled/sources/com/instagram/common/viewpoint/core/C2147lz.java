package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.lz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2147lz implements JY {
    public long A00 = -1;
    public long A01 = -1;
    public HI A02;
    public HJ A03;

    public C2147lz(HJ hj, HI hi) {
        this.A03 = hj;
        this.A02 = hi;
    }

    public final void A00(long j9) {
        this.A00 = j9;
    }

    @Override // com.instagram.common.viewpoint.core.JY
    public final HY A5Z() {
        AbstractC06233y.A08(this.A00 != -1);
        return new C2187mp(this.A03, this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.JY
    public final long AHN(InterfaceC2190ms interfaceC2190ms) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.instagram.common.viewpoint.core.JY
    public final void AKC(long j9) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[C5C.A0L(jArr, j9, true, true)];
    }
}
