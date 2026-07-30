package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0359Ct extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C0355Cp A00;

    public C0359Ct(C0355Cp c0355Cp) {
        this.A00 = c0355Cp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        View view;
        Drawable drawable;
        this.A00.A02 = EnumC1200e1.A02;
        view = this.A00.A07;
        drawable = this.A00.A04;
        XP.A0Q(view, drawable);
    }
}
