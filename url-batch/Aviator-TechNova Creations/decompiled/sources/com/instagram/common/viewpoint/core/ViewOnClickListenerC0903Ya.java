package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ya, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0903Ya implements View.OnClickListener {
    public final /* synthetic */ C0905Yc A00;

    public ViewOnClickListenerC0903Ya(C0905Yc c0905Yc) {
        this.A00 = c0905Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0908Yf interfaceC0908Yf;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0908Yf = this.A00.A04;
            interfaceC0908Yf.AAg();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
