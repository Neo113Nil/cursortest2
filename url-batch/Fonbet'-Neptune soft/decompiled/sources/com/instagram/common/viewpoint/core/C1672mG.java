package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.mG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1672mG implements EN {
    public long A00;
    public long A01;
    public C1672mG A02;
    public EM A03;

    public C1672mG(long j, int i) {
        A02(j, i);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C1672mG A01() {
        this.A03 = null;
        C1672mG c1672mG = this.A02;
        this.A02 = null;
        return c1672mG;
    }

    public final void A02(long j, int i) {
        C3M.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i + j;
    }

    public final void A03(EM em, C1672mG c1672mG) {
        this.A03 = em;
        this.A02 = c1672mG;
    }

    @Override // com.instagram.common.viewpoint.core.EN
    public final EM A6m() {
        return (EM) C3M.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.EN
    public final C1672mG AC3() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
