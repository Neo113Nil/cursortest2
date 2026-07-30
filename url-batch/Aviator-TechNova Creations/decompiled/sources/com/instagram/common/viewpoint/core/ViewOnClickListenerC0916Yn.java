package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yn, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0916Yn implements View.OnClickListener {
    public final /* synthetic */ C0910Yh A00;
    public final /* synthetic */ LU A01;

    public ViewOnClickListenerC0916Yn(LU lu, C0910Yh c0910Yh) {
        this.A01 = lu;
        this.A00 = c0910Yh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0838Vl.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0B.AEC(O4.A04);
        } catch (Throwable th) {
            AbstractC0838Vl.A00(th, this);
        }
    }
}
