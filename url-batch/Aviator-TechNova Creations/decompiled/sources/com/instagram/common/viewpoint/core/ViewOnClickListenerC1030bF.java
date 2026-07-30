package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bF, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1030bF implements View.OnClickListener {
    public final /* synthetic */ JR A00;

    public ViewOnClickListenerC1030bF(JR jr) {
        this.A00 = jr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1117ce interfaceC1117ce;
        InterfaceC1117ce interfaceC1117ce2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC1117ce = this.A00.A07;
            if (interfaceC1117ce != null) {
                interfaceC1117ce2 = this.A00.A07;
                interfaceC1117ce2.A9d();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
