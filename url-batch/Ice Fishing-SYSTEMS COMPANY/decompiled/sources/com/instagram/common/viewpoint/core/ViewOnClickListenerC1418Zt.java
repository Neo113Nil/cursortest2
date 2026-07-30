package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1418Zt implements View.OnClickListener {
    public final /* synthetic */ C1420Zv A00;

    public ViewOnClickListenerC1418Zt(C1420Zv c1420Zv) {
        this.A00 = c1420Zv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1404Zf interfaceC1404Zf;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1404Zf = this.A00.A02;
            interfaceC1404Zf.A9c();
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
