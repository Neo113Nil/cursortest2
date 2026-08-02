package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0921Yy implements View.OnClickListener {
    public final /* synthetic */ C0904Yh A00;
    public final /* synthetic */ LS A01;

    public ViewOnClickListenerC0921Yy(LS ls, C0904Yh c0904Yh) {
        this.A01 = ls;
        this.A00 = c0904Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AEC(O4.A06);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
