package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yk, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0913Yk implements View.OnClickListener {
    public final /* synthetic */ LV A00;

    public ViewOnClickListenerC0913Yk(LV lv) {
        this.A00 = lv;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0B.AEC(O4.A06);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
