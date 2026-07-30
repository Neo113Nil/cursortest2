package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnClickListenerC1423Zy implements View.OnClickListener {
    public final /* synthetic */ C1406Zh A00;
    public final /* synthetic */ MC A01;

    public ViewOnClickListenerC1423Zy(MC mc, C1406Zh c1406Zh) {
        this.A01 = mc;
        this.A00 = c1406Zh;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (WU.A02(this)) {
            return;
        }
        try {
            this.A00.A01();
            this.A01.A0D.AEr(EnumC1131Oi.A06);
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
