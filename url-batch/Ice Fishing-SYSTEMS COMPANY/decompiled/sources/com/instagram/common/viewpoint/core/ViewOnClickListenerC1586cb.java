package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cb, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1586cb implements View.OnClickListener {
    public final /* synthetic */ KB A00;

    public ViewOnClickListenerC1586cb(KB kb) {
        this.A00 = kb;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1669dx interfaceC1669dx;
        InterfaceC1669dx interfaceC1669dx2;
        if (WU.A02(this)) {
            return;
        }
        try {
            interfaceC1669dx = this.A00.A08;
            if (interfaceC1669dx != null) {
                interfaceC1669dx2 = this.A00.A08;
                interfaceC1669dx2.AJz();
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
