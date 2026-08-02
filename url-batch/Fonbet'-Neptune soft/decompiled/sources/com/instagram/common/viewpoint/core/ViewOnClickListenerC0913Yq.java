package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0913Yq implements View.OnClickListener {
    public final /* synthetic */ LU A00;

    public ViewOnClickListenerC0913Yq(LU lu) {
        this.A00 = lu;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.A9U();
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
