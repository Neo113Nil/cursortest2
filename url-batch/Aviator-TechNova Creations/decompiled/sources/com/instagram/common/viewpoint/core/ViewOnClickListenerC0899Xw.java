package com.instagram.common.viewpoint.core;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Xw, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0899Xw implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC0899Xw(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0888Xl interfaceC0888Xl;
        YO yo;
        InterfaceC0888Xl interfaceC0888Xl2;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            interfaceC0888Xl = this.A00.A02;
            if (interfaceC0888Xl != null) {
                yo = this.A00.A09;
                if (yo.A06()) {
                    interfaceC0888Xl2 = this.A00.A02;
                    interfaceC0888Xl2.ACC(this.A00);
                }
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
