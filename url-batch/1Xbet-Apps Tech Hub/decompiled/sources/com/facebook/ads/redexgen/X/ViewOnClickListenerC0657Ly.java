package com.facebook.ads.redexgen.X;

import android.view.View;
import com.facebook.ads.internal.view.FullScreenAdToolbar;

/* renamed from: com.facebook.ads.redexgen.X.Ly, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0657Ly implements View.OnClickListener {
    public final /* synthetic */ FullScreenAdToolbar A00;

    public ViewOnClickListenerC0657Ly(FullScreenAdToolbar fullScreenAdToolbar) {
        this.A00 = fullScreenAdToolbar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0650Lr interfaceC0650Lr;
        ME me;
        InterfaceC0650Lr interfaceC0650Lr2;
        if (K0.A02(this)) {
            return;
        }
        try {
            interfaceC0650Lr = this.A00.A02;
            if (interfaceC0650Lr != null) {
                me = this.A00.A07;
                if (me.A04()) {
                    interfaceC0650Lr2 = this.A00.A02;
                    interfaceC0650Lr2.AAr();
                }
            }
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
