package com.facebook.ads.redexgen.X;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0689Ne implements View.OnClickListener {
    public final /* synthetic */ C0691Ng A00;

    public ViewOnClickListenerC0689Ne(C0691Ng c0691Ng) {
        this.A00 = c0691Ng;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (K0.A02(this)) {
            return;
        }
        try {
            this.A00.A04();
        } catch (Throwable th) {
            K0.A00(th, this);
        }
    }
}
