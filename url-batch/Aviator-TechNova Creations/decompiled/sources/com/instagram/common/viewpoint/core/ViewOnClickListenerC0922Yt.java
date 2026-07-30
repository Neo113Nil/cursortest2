package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0922Yt implements View.OnClickListener {
    public final /* synthetic */ C0924Yv A00;

    public ViewOnClickListenerC0922Yt(C0924Yv c0924Yv) {
        this.A00 = c0924Yv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0908Yf interfaceC0908Yf;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0908Yf = this.A00.A02;
            interfaceC0908Yf.A9U();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
