package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Xx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0900Xx implements View.OnClickListener {
    public final /* synthetic */ C0641Nr A00;

    public ViewOnClickListenerC0900Xx(C0641Nr c0641Nr) {
        this.A00 = c0641Nr;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0888Xl interfaceC0888Xl;
        YQ yq;
        InterfaceC0888Xl interfaceC0888Xl2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0888Xl = this.A00.A01;
            if (interfaceC0888Xl != null) {
                yq = this.A00.A02;
                if (yq.A02()) {
                    interfaceC0888Xl2 = this.A00.A01;
                    interfaceC0888Xl2.ACC(this.A00);
                }
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
