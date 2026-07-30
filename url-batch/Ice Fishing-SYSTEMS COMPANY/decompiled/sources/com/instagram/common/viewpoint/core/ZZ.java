package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public class ZZ implements View.OnClickListener {
    public final /* synthetic */ C1400Zb A00;

    public ZZ(C1400Zb c1400Zb) {
        this.A00 = c1400Zb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1404Zf interfaceC1404Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1404Zf = this.A00.A04;
            interfaceC1404Zf.AAp();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
