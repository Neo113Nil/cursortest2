package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Ct, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0353Ct extends AbstractRunnableC0840Vt {
    public final /* synthetic */ C0349Cp A00;

    public C0353Ct(C0349Cp c0349Cp) {
        this.A00 = c0349Cp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        View view;
        Drawable drawable;
        this.A00.A02 = EnumC1194e1.A02;
        view = this.A00.A07;
        drawable = this.A00.A04;
        XP.A0Q(view, drawable);
    }
}
