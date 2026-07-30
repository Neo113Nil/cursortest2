package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1027bC implements View.OnClickListener {
    public final /* synthetic */ JS A00;

    public ViewOnClickListenerC1027bC(JS js) {
        this.A00 = js;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1117ce interfaceC1117ce;
        InterfaceC1117ce interfaceC1117ce2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1117ce = this.A00.A02;
            if (interfaceC1117ce != null) {
                interfaceC1117ce2 = this.A00.A02;
                interfaceC1117ce2.AJF();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
