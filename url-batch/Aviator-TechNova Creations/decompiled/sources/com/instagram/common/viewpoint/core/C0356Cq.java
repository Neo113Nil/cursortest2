package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Cq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0356Cq extends AbstractRunnableC0846Vt {
    public final /* synthetic */ C0355Cp A00;

    public C0356Cq(C0355Cp c0355Cp) {
        this.A00 = c0355Cp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        View view;
        Drawable drawable;
        this.A00.A02 = EnumC1200e1.A04;
        view = this.A00.A07;
        drawable = this.A00.A05;
        XP.A0Q(view, drawable);
    }
}
