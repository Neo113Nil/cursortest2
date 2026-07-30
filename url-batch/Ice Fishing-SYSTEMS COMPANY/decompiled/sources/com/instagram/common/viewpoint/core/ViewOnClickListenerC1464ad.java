package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.ad, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1464ad implements View.OnClickListener {
    public final /* synthetic */ M6 A00;

    public ViewOnClickListenerC1464ad(M6 m62) {
        this.A00 = m62;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1839gi c1839gi;
        InterfaceC1481au interfaceC1481au;
        InterfaceC1481au interfaceC1481au2;
        if (WU.A02(this)) {
            return;
        }
        try {
            c1839gi = this.A00.A09;
            c1839gi.A0F().A9w();
            interfaceC1481au = this.A00.A06;
            if (interfaceC1481au != null) {
                interfaceC1481au2 = this.A00.A06;
                interfaceC1481au2.ADO();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
