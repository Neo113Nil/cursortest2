package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;

/* renamed from: com.facebook.ads.redexgen.X.Gp, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0932Gp implements InterfaceC1378Yf {
    public final /* synthetic */ AbstractC0926Gj A00;

    public C0932Gp(AbstractC0926Gj abstractC0926Gj) {
        this.A00 = abstractC0926Gj;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1378Yf
    public final void AEZ(int i) {
        this.A00.A0d();
        if (this.A00.A01 != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.topMargin = i;
            this.A00.A01.setLayoutParams(layoutParams);
        }
    }
}
