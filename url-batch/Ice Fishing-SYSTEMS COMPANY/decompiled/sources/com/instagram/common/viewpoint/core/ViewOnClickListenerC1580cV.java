package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1580cV implements View.OnClickListener {
    public final /* synthetic */ KD A00;

    public ViewOnClickListenerC1580cV(KD kd) {
        this.A00 = kd;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1669dx interfaceC1669dx;
        InterfaceC1669dx interfaceC1669dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1669dx = this.A00.A02;
            if (interfaceC1669dx != null) {
                interfaceC1669dx2 = this.A00.A02;
                interfaceC1669dx2.A9l();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
