package com.facebook.ads.redexgen.X;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class S1 implements OP {
    public final /* synthetic */ S0 A00;

    public S1(S0 s0) {
        this.A00 = s0;
    }

    @Override // com.facebook.ads.redexgen.X.OP
    public final void ADR(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.facebook.ads.redexgen.X.OP
    public final void ADT(View view) {
        AbstractC0825Sk abstractC0825Sk = (AbstractC0825Sk) view;
        abstractC0825Sk.A15();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0825Sk.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
