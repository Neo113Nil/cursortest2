package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YZ implements View.OnClickListener {
    public final /* synthetic */ C0905Yc A00;

    public YZ(C0905Yc c0905Yc) {
        this.A00 = c0905Yc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        InterfaceC0908Yf interfaceC0908Yf;
        InterfaceC0908Yf interfaceC0908Yf2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            z = this.A00.A05;
            if (z) {
                interfaceC0908Yf2 = this.A00.A04;
                interfaceC0908Yf2.A4v();
            } else {
                interfaceC0908Yf = this.A00.A04;
                interfaceC0908Yf.A4w();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
