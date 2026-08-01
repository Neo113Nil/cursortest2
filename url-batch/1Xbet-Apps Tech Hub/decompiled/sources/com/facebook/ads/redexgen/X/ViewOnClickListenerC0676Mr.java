package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0676Mr implements View.OnClickListener {
    public final /* synthetic */ C0681Mw A00;

    public ViewOnClickListenerC0676Mr(C0681Mw c0681Mw) {
        this.A00 = c0681Mw;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0680Mv interfaceC0680Mv;
        InterfaceC0680Mv interfaceC0680Mv2;
        if (K0.A02(this)) {
            return;
        }
        try {
            interfaceC0680Mv = this.A00.A04;
            if (interfaceC0680Mv == null) {
                return;
            }
            interfaceC0680Mv2 = this.A00.A04;
            interfaceC0680Mv2.AAr();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
