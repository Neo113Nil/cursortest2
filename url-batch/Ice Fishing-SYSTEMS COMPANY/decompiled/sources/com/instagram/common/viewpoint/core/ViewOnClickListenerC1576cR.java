package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1576cR implements View.OnClickListener {
    public final /* synthetic */ KE A00;

    public ViewOnClickListenerC1576cR(KE ke) {
        this.A00 = ke;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z8;
        boolean z9;
        AbstractC1091Mt abstractC1091Mt;
        AbstractC2004jd abstractC2004jd;
        Handler handler;
        Runnable runnable;
        AbstractC2004jd abstractC2004jd2;
        AbstractC1091Mt abstractC1091Mt2;
        if (WU.A02(this)) {
            return;
        }
        try {
            z8 = this.A00.A0M;
            if (!z8) {
                this.A00.A0N = true;
                abstractC1091Mt = this.A00.A0b;
                if (abstractC1091Mt != null) {
                    KE ke = this.A00;
                    abstractC1091Mt2 = this.A00.A0b;
                    ke.A0f(((AnonymousClass85) abstractC1091Mt2).A0M().toString());
                }
                abstractC2004jd = this.A00.A0E;
                if (abstractC2004jd.A0q() >= 0) {
                    handler = this.A00.A08;
                    runnable = this.A00.A0h;
                    abstractC2004jd2 = this.A00.A0E;
                    handler.postDelayed(runnable, abstractC2004jd2.A0q());
                }
            }
            KE ke2 = this.A00;
            z9 = this.A00.A0M;
            ke2.A0i(z9 ? false : true);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
