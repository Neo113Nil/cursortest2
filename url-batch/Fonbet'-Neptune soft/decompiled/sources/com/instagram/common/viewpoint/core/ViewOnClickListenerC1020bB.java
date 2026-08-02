package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bB, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1020bB implements View.OnClickListener {
    public final /* synthetic */ JS A00;

    public ViewOnClickListenerC1020bB(JS js) {
        this.A00 = js;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1111ce interfaceC1111ce;
        InterfaceC1111ce interfaceC1111ce2;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1111ce = this.A00.A02;
            if (interfaceC1111ce != null) {
                interfaceC1111ce2 = this.A00.A02;
                interfaceC1111ce2.A9d();
            }
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
