package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network.dex */
public class YC implements View.OnClickListener {
    public final /* synthetic */ C0575Lc A00;

    public YC(C0575Lc c0575Lc) {
        this.A00 = c0575Lc;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0802Ua c0802Ua;
        InterfaceC0890Xn interfaceC0890Xn;
        YY yy;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            c0802Ua = this.A00.A0N;
            c0802Ua.A04(UZ.A07, null);
            interfaceC0890Xn = this.A00.A0Q;
            yy = this.A00.A0R;
            interfaceC0890Xn.A4b(yy.A7o());
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
