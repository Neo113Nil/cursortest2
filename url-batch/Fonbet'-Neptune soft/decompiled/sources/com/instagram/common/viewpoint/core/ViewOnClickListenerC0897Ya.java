package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0897Ya implements View.OnClickListener {
    public final /* synthetic */ C0899Yc A00;

    public ViewOnClickListenerC0897Ya(C0899Yc c0899Yc) {
        this.A00 = c0899Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0902Yf interfaceC0902Yf;
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0902Yf = this.A00.A04;
            interfaceC0902Yf.AAg();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
