package com.facebook.ads.redexgen.X;

/* renamed from: com.facebook.ads.redexgen.X.Cn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0425Cn {
    public int A00;
    public long A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final InterfaceC0420Cg A05;
    public final C0540Hg A06 = new C0540Hg(new byte[64]);
    public final C0553Ht A07;

    public C0425Cn(InterfaceC0420Cg interfaceC0420Cg, C0553Ht c0553Ht) {
        this.A05 = interfaceC0420Cg;
        this.A07 = c0553Ht;
    }

    private void A00() {
        this.A06.A08(8);
        this.A03 = this.A06.A0F();
        this.A02 = this.A06.A0F();
        this.A06.A08(6);
        this.A00 = this.A06.A04(8);
    }

    private void A01() {
        this.A01 = 0L;
        if (this.A03) {
            this.A06.A08(4);
            this.A06.A08(1);
            long pts = this.A06.A04(15) << 15;
            long A04 = (this.A06.A04(3) << 30) | pts;
            this.A06.A08(1);
            long pts2 = this.A06.A04(15);
            long j = A04 | pts2;
            this.A06.A08(1);
            if (!this.A04 && this.A02) {
                this.A06.A08(4);
                long pts3 = this.A06.A04(3);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A06.A08(1);
                this.A07.A07((pts3 << 30) | (this.A06.A04(15) << 15) | this.A06.A04(15));
                this.A04 = true;
            }
            this.A01 = this.A07.A07(j);
        }
    }

    public final void A02() {
        this.A04 = false;
        this.A05.AEv();
    }

    public final void A03(C0541Hh c0541Hh) throws C03519d {
        c0541Hh.A0c(this.A06.A00, 0, 3);
        this.A06.A07(0);
        A00();
        c0541Hh.A0c(this.A06.A00, 0, this.A00);
        this.A06.A07(0);
        A01();
        this.A05.ADj(this.A01, true);
        this.A05.A4O(c0541Hh);
        this.A05.ADi();
    }
}
