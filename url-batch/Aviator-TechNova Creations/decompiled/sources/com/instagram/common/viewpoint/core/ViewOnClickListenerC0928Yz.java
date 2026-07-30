package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0928Yz implements View.OnClickListener {
    public final /* synthetic */ C0910Yh A00;
    public final /* synthetic */ LS A01;

    public ViewOnClickListenerC0928Yz(LS ls, C0910Yh c0910Yh) {
        this.A01 = ls;
        this.A00 = c0910Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AAh();
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
