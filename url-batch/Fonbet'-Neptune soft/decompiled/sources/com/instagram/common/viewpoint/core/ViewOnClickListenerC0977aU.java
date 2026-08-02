package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.aU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0977aU implements View.OnClickListener {
    public final /* synthetic */ KE A00;
    public final /* synthetic */ String A01;

    public ViewOnClickListenerC0977aU(KE ke, String str) {
        this.A00 = ke;
        this.A01 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A0E(this.A01);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
