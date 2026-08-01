package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0666Mh implements View.OnClickListener {
    public final /* synthetic */ C0668Mj A00;

    public ViewOnClickListenerC0666Mh(C0668Mj c0668Mj) {
        this.A00 = c0668Mj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        MT mt;
        if (K0.A02(this)) {
            return;
        }
        try {
            mt = this.A00.A02;
            mt.A8F();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
