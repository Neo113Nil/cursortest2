package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class FI implements InterfaceC1044bZ {
    public final /* synthetic */ FH A00;

    public FI(FH fh) {
        this.A00 = fh;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1044bZ
    public final void AFm(View view) {
        if (this.A00.A09) {
            this.A00.A07 = false;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1044bZ
    public final void AFo(View view) {
        AbstractC0506Ir abstractC0506Ir = (AbstractC0506Ir) view;
        abstractC0506Ir.A1R();
        if (this.A00.A09) {
            this.A00.A07 = true;
        }
        if (this.A00.A04.A0Z() && ((Integer) abstractC0506Ir.getTag(-1593835536)).intValue() == 0) {
            this.A00.A04.A0U();
        }
    }
}
