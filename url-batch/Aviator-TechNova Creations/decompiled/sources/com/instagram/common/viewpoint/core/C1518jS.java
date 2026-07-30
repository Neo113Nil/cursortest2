package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.jS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C1518jS implements InterfaceC0466Gw {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C0558Kl A04;

    public C1518jS(C0558Kl c0558Kl, int i, long j, long j2) {
        this.A04 = c0558Kl;
        this.A00 = i;
        this.A03 = j;
        this.A01 = (j2 - j) / c0558Kl.A02;
        this.A02 = A00(this.A01);
    }

    private long A00(long j) {
        return AbstractC01484a.A0U(j * this.A00, 1000000L, this.A04.A04);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final long A7l() {
        return this.A02;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final C0465Gv A8t(long j) {
        long A0T = AbstractC01484a.A0T((this.A04.A04 * j) / (this.A00 * 1000000), 0L, this.A01 - 1);
        long j2 = this.A03 + (this.A04.A02 * A0T);
        long A00 = A00(A0T);
        C0467Gx c0467Gx = new C0467Gx(A00, j2);
        if (A00 >= j || A0T == this.A01 - 1) {
            return new C0465Gv(c0467Gx);
        }
        long j3 = 1 + A0T;
        return new C0465Gv(c0467Gx, new C0467Gx(A00(j3), this.A03 + (this.A04.A02 * j3)));
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0466Gw
    public final boolean AAa() {
        return true;
    }
}
