package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1294fY extends AbstractRunnableC0846Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C0702Qc A02;

    public C1294fY(RS rs, C0702Qc c0702Qc, Drawable drawable) {
        this.A01 = rs;
        this.A02 = c0702Qc;
        this.A00 = drawable;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
