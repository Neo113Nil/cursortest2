package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class ED extends AbstractRunnableC0846Vt {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ E1 A02;
    public final /* synthetic */ EnumC1229eU A03;

    public ED(E1 e1, EnumC1229eU enumC1229eU, int i, int i2) {
        this.A02 = e1;
        this.A03 = enumC1229eU;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        C1159dL c1159dL;
        Handler handler;
        C0781Te c0781Te;
        C1159dL c1159dL2;
        C0781Te c0781Te2;
        DI di;
        Handler handler2;
        C1159dL c1159dL3;
        C0781Te c0781Te3;
        Handler handler3;
        C1159dL c1159dL4;
        C1159dL c1159dL5;
        C0781Te c0781Te4;
        DQ dq;
        Handler handler4;
        C1159dL c1159dL6;
        C1159dL c1159dL7;
        Handler handler5;
        C0781Te c0781Te5;
        C0781Te c0781Te6;
        DW dw;
        C1159dL c1159dL8;
        C0781Te c0781Te7;
        DO r0;
        if (this.A03 == EnumC1229eU.A07) {
            this.A02.A0M(UZ.A0y);
            c1159dL8 = this.A02.A0B;
            c1159dL8.A0F().A3b();
            c0781Te7 = this.A02.A0C;
            r0 = E1.A0J;
            c0781Te7.A02(r0);
            return;
        }
        if (this.A03 == EnumC1229eU.A03) {
            this.A02.A0M(UZ.A0t);
            this.A02.A04 = true;
            c0781Te6 = this.A02.A0C;
            dw = E1.A0H;
            c0781Te6.A02(dw);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1229eU.A06) {
            this.A02.A0M(UZ.A0s);
            c1159dL7 = this.A02.A0B;
            c1159dL7.A0F().A3T();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            c0781Te5 = this.A02.A0C;
            c0781Te5.A02(new C01253d(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC1229eU.A0A) {
            c1159dL4 = this.A02.A0B;
            if (U7.A1u(c1159dL4)) {
                c1159dL6 = this.A02.A0B;
                c1159dL6.A0B().AFs();
            }
            this.A02.A0M(UZ.A0w);
            c1159dL5 = this.A02.A0B;
            c1159dL5.A0F().A3i();
            c0781Te4 = this.A02.A0C;
            dq = E1.A0I;
            c0781Te4.A02(dq);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC1229eU.A05) {
            this.A02.A0M(UZ.A0v);
            c1159dL3 = this.A02.A0B;
            c1159dL3.A0F().A3X();
            c0781Te3 = this.A02.A0C;
            final int i = this.A00;
            c0781Te3.A02(new DY(i) { // from class: com.facebook.ads.redexgen.X.3Y
            });
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC1229eU.A04) {
            this.A02.A0M(UZ.A0u);
            c1159dL2 = this.A02.A0B;
            c1159dL2.A0F().A3U();
            c0781Te2 = this.A02.A0C;
            di = E1.A0L;
            c0781Te2.A02(di);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC1229eU.A09) {
            this.A02.A0M(UZ.A0s);
            c1159dL = this.A02.A0B;
            c1159dL.A0F().A3d();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            c0781Te = this.A02.A0C;
            c0781Te.A02(new C01253d(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
