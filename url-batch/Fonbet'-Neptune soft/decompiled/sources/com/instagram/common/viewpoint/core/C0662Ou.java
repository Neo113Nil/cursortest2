package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ou, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0662Ou implements X5 {
    public final X4 A00;
    public final X5 A01;

    public C0662Ou(X5 x5, int i, int i2) {
        this.A01 = x5;
        this.A00 = new X4(i, i2);
    }

    @Override // com.instagram.common.viewpoint.core.X5
    public final void AGO(String str) {
        boolean A08;
        this.A00.A04(str);
        if (this.A00.A02() == null) {
            return;
        }
        A08 = X7.A08(this.A00);
        if (A08) {
            this.A01.AGO(this.A00.A02());
        }
    }

    @Override // com.instagram.common.viewpoint.core.X5
    public final void flush() {
        boolean A08;
        this.A00.A03();
        while (this.A00.A02() != null) {
            A08 = X7.A08(this.A00);
            if (A08) {
                this.A01.AGO(this.A00.A02());
            }
            this.A00.A03();
        }
    }
}
