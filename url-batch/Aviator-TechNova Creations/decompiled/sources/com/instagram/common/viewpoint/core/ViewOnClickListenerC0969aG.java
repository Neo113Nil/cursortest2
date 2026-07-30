package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0969aG implements View.OnClickListener {
    public final /* synthetic */ C0971aI A00;

    public ViewOnClickListenerC0969aG(C0971aI c0971aI) {
        this.A00 = c0971aI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A05();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
