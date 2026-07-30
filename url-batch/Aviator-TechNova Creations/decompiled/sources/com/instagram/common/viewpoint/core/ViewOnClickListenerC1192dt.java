package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dt, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC1192dt implements View.OnClickListener {
    public final /* synthetic */ D1 A00;

    public ViewOnClickListenerC1192dt(D1 d1) {
        this.A00 = d1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0802Ua c0802Ua;
        C1159dL c1159dL;
        E1 e1;
        boolean A07;
        E1 e12;
        E1 e13;
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            c0802Ua = this.A00.A04;
            c0802Ua.A04(UZ.A0l, null);
            c1159dL = this.A00.A03;
            c1159dL.A0F().A3e();
            e1 = this.A00.A00;
            if (e1 != null) {
                A07 = this.A00.A07();
                if (A07) {
                    e13 = this.A00.A00;
                    e13.setVolume(1.0f);
                } else {
                    e12 = this.A00.A00;
                    e12.setVolume(0.0f);
                }
                this.A00.A09();
            }
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
