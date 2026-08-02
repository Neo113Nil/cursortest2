package com.instagram.common.viewpoint.core;

import android.os.Handler;

/* loaded from: assets/audience_network.dex */
public class EF extends AbstractRunnableC0840Vt {
    public final /* synthetic */ E1 A00;

    public EF(E1 e1) {
        this.A00 = e1;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        boolean z;
        C0775Te c0775Te;
        Handler handler;
        int i;
        z = this.A00.A04;
        if (!z) {
            c0775Te = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            c0775Te.A02(new DY(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.3Q
            });
            handler = this.A00.A08;
            i = this.A00.A01;
            handler.postDelayed(this, i);
        }
    }
}
