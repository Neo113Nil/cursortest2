package com.facebook.ads.redexgen.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2311Gp implements InterfaceC2757Yf {
    public final /* synthetic */ AbstractC2305Gj A00;

    public C2311Gp(AbstractC2305Gj abstractC2305Gj) {
        this.A00 = abstractC2305Gj;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2757Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
