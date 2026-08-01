package com.facebook.ads.redexgen.X;

import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.am, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1065am extends AbstractC0763Qa {
    public final /* synthetic */ C1063ak A00;

    public C1065am(C1063ak c1063ak) {
        this.A00 = c1063ak;
    }

    @Override // com.facebook.ads.redexgen.X.AbstractC0763Qa
    public final void A03() {
        LN ln;
        LN ln2;
        C0457Dz c0457Dz;
        C1051aY c1051aY;
        C0457Dz c0457Dz2;
        F6 f6;
        C0764Qb c0764Qb;
        LN ln3;
        F6 f62;
        InterfaceC0565If interfaceC0565If;
        F6 f63;
        F6 f64;
        F6 f65;
        C1R A0x;
        C0457Dz c0457Dz3;
        C0764Qb c0764Qb2;
        ln = this.A00.A05;
        if (!ln.A07()) {
            ln2 = this.A00.A05;
            ln2.A05();
            c0457Dz = this.A00.A03;
            InterfaceC1082b3 A0E = c0457Dz.A0E();
            c1051aY = this.A00.A01;
            A0E.A3g(c1051aY != null);
            c0457Dz2 = this.A00.A03;
            c0457Dz2.A0E().A2g();
            f6 = this.A00.A02;
            C2C.A00(f6.A0M());
            NL nl = new NL();
            c0764Qb = this.A00.A0A;
            NL A03 = nl.A03(c0764Qb);
            ln3 = this.A00.A05;
            NL A02 = A03.A02(ln3);
            f62 = this.A00.A02;
            Map<String, String> A05 = A02.A04(f62.A0N()).A05();
            interfaceC0565If = this.A00.A04;
            f63 = this.A00.A02;
            interfaceC0565If.A9S(f63.A11(), A05);
            f64 = this.A00.A02;
            if (f64 == null) {
                A0x = null;
            } else {
                f65 = this.A00.A02;
                A0x = f65.A0x();
            }
            c0457Dz3 = this.A00.A03;
            C1R.A07(A0x, c0457Dz3);
            c0764Qb2 = this.A00.A0A;
            c0764Qb2.A0V();
        }
    }
}
