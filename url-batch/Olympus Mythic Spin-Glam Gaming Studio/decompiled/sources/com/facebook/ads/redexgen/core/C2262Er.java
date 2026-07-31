package com.facebook.ads.redexgen.core;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.Er, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2262Er extends AbstractRunnableC2705Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C2255Ek A02;
    public final /* synthetic */ EnumC3160fm A03;

    public C2262Er(C2255Ek c2255Ek, EnumC3160fm enumC3160fm, int i, int i2) {
        this.A02 = c2255Ek;
        this.A03 = enumC3160fm;
        this.A00 = i;
        this.A01 = i2;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2705Wc
    public final void A07() {
        C3218gi c3218gi;
        Handler handler;
        UM um;
        C3218gi c3218gi2;
        UM um2;
        C2240Dv c2240Dv;
        Handler handler2;
        C3218gi c3218gi3;
        UM um3;
        Handler handler3;
        C3218gi c3218gi4;
        C3218gi c3218gi5;
        UM um4;
        E3 e3;
        Handler handler4;
        C3218gi c3218gi6;
        C3218gi c3218gi7;
        Handler handler5;
        UM um5;
        UM um6;
        E9 e9;
        C3218gi c3218gi8;
        UM um7;
        E1 e1;
        if (this.A03 == EnumC3160fm.A07) {
            this.A02.A0M(VH.A0y);
            c3218gi8 = this.A02.A0B;
            c3218gi8.A0F().A3j();
            um7 = this.A02.A0C;
            e1 = C2255Ek.A0J;
            um7.A02(e1);
            return;
        }
        if (this.A03 == EnumC3160fm.A03) {
            this.A02.A0M(VH.A0t);
            this.A02.A04 = true;
            um6 = this.A02.A0C;
            e9 = C2255Ek.A0H;
            um6.A02(e9);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC3160fm.A06) {
            this.A02.A0M(VH.A0s);
            c3218gi7 = this.A02.A0B;
            c3218gi7.A0F().A3b();
            this.A02.A04 = true;
            handler5 = this.A02.A08;
            handler5.removeCallbacksAndMessages(null);
            um5 = this.A02.A0C;
            um5.A02(new C4K(this.A01, this.A01));
            this.A02.A0L(this.A01);
            return;
        }
        if (this.A03 == EnumC3160fm.A0A) {
            c3218gi4 = this.A02.A0B;
            if (C2668Up.A1z(c3218gi4)) {
                c3218gi6 = this.A02.A0B;
                c3218gi6.A0B().AGc();
            }
            this.A02.A0M(VH.A0w);
            c3218gi5 = this.A02.A0B;
            c3218gi5.A0F().A3q();
            um4 = this.A02.A0C;
            e3 = C2255Ek.A0I;
            um4.A02(e3);
            handler4 = this.A02.A08;
            handler4.removeCallbacksAndMessages(null);
            this.A02.A0I();
            return;
        }
        if (this.A03 == EnumC3160fm.A05) {
            this.A02.A0M(VH.A0v);
            c3218gi3 = this.A02.A0B;
            c3218gi3.A0F().A3f();
            um3 = this.A02.A0C;
            final int i = this.A00;
            um3.A02(new EB(i) { // from class: com.facebook.ads.redexgen.X.4B
            });
            handler3 = this.A02.A08;
            handler3.removeCallbacksAndMessages(null);
            this.A02.A0L(this.A00);
            return;
        }
        if (this.A03 == EnumC3160fm.A04) {
            this.A02.A0M(VH.A0u);
            c3218gi2 = this.A02.A0B;
            c3218gi2.A0F().A3c();
            um2 = this.A02.A0C;
            c2240Dv = C2255Ek.A0L;
            um2.A02(c2240Dv);
            handler2 = this.A02.A08;
            handler2.removeCallbacksAndMessages(null);
            return;
        }
        if (this.A03 == EnumC3160fm.A09) {
            this.A02.A0M(VH.A0s);
            c3218gi = this.A02.A0B;
            c3218gi.A0F().A3l();
            this.A02.A04 = true;
            handler = this.A02.A08;
            handler.removeCallbacksAndMessages(null);
            um = this.A02.A0C;
            um.A02(new C4K(this.A00, this.A01));
            this.A02.A0L(this.A00);
        }
    }
}
