package com.facebook.ads.redexgen.X;

import android.os.Handler;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OG implements View.OnClickListener {
    public final /* synthetic */ C0826Sl A00;

    public OG(C0826Sl c0826Sl) {
        this.A00 = c0826Sl;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z;
        boolean z2;
        AbstractC01360g abstractC01360g;
        AbstractC1045aS abstractC1045aS;
        Handler handler;
        Runnable runnable;
        AbstractC1045aS abstractC1045aS2;
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A0P = true;
            z = this.A00.A0O;
            if (!z) {
                C0826Sl c0826Sl = this.A00;
                abstractC01360g = c0826Sl.A0d;
                c0826Sl.A0c(((FH) abstractC01360g).A0G().toString());
                abstractC1045aS = this.A00.A0G;
                if (abstractC1045aS.A0H() >= 0) {
                    handler = this.A00.A09;
                    runnable = this.A00.A0j;
                    abstractC1045aS2 = this.A00.A0G;
                    handler.postDelayed(runnable, abstractC1045aS2.A0H());
                }
            }
            C0826Sl c0826Sl2 = this.A00;
            z2 = c0826Sl2.A0O;
            c0826Sl2.A0f(z2 ? false : true);
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
