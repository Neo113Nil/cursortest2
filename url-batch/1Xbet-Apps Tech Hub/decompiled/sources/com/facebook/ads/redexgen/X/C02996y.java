package com.facebook.ads.redexgen.X;

import android.os.Handler;

/* renamed from: com.facebook.ads.redexgen.X.6y, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C02996y extends MI {
    public final /* synthetic */ K2 A00;

    public C02996y(K2 k2) {
        this.A00 = k2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.X.AbstractC03238a
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(MJ mj) {
        boolean z;
        boolean z2;
        boolean A0D;
        Handler handler;
        int i;
        boolean z3;
        boolean A0D2;
        z = this.A00.A03;
        if (!z) {
            return;
        }
        z2 = this.A00.A02;
        if (!z2) {
            return;
        }
        this.A00.A03 = false;
        A0D = this.A00.A0D(Q5.A04);
        if (!A0D) {
            z3 = this.A00.A04;
            if (!z3) {
                A0D2 = this.A00.A0D(Q5.A03);
                if (!A0D2) {
                    return;
                }
                this.A00.A03();
                this.A00.A06(true, true);
                return;
            }
        }
        this.A00.A04 = false;
        handler = this.A00.A05;
        K4 k4 = new K4(this);
        i = this.A00.A00;
        handler.postDelayed(k4, i);
    }
}
