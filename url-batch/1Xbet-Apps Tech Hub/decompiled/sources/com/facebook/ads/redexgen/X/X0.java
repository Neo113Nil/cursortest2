package com.facebook.ads.redexgen.X;

/* loaded from: assets/audience_network.dex */
public final class X0 implements InterfaceC0406Bj {
    public final long A00;
    public final C0405Bi A01;

    public X0(long j) {
        this(j, 0L);
    }

    public X0(long j, long j2) {
        this.A00 = j;
        this.A01 = new C0405Bi(j2 == 0 ? C0407Bk.A03 : new C0407Bk(0L, j2));
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final long A6k() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final C0405Bi A7l(long j) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.X.InterfaceC0406Bj
    public final boolean A95() {
        return false;
    }
}
