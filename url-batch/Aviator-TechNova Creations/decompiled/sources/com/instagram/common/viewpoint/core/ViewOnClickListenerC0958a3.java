package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.a3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0958a3 implements View.OnClickListener {
    public final /* synthetic */ KG A00;

    public ViewOnClickListenerC0958a3(KG kg) {
        this.A00 = kg;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A02();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
