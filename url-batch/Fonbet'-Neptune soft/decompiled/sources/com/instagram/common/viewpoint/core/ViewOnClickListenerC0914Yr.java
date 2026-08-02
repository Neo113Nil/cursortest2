package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Yr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnClickListenerC0914Yr implements View.OnClickListener {
    public final /* synthetic */ O6 A00;
    public final /* synthetic */ C0904Yh A01;
    public final /* synthetic */ LU A02;

    public ViewOnClickListenerC0914Yr(LU lu, C0904Yh c0904Yh, O6 o6) {
        this.A02 = lu;
        this.A01 = c0904Yh;
        this.A00 = o6;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC0832Vl.A02(this)) {
            return;
        }
        try {
            this.A01.A01();
            this.A02.A0B.AEP(this.A00);
        } catch (Throwable th) {
            AbstractC0832Vl.A00(th, this);
        }
    }
}
