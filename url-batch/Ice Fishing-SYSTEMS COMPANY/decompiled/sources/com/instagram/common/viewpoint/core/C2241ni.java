package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2241ni implements InterfaceC0891Ez {
    public long A00;
    public long A01;
    public C2241ni A02;
    public C0890Ey A03;

    public C2241ni(long j9, int i) {
        A02(j9, i);
    }

    public final int A00(long j9) {
        return ((int) (j9 - this.A01)) + this.A03.A00;
    }

    public final C2241ni A01() {
        this.A03 = null;
        C2241ni c2241ni = this.A02;
        this.A02 = null;
        return c2241ni;
    }

    public final void A02(long j9, int i) {
        AbstractC06233y.A08(this.A03 == null);
        this.A01 = j9;
        this.A00 = i + j9;
    }

    public final void A03(C0890Ey c0890Ey, C2241ni c2241ni) {
        this.A03 = c0890Ey;
        this.A02 = c2241ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Ez
    public final C0890Ey A6u() {
        return (C0890Ey) AbstractC06233y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0891Ez
    public final C2241ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
