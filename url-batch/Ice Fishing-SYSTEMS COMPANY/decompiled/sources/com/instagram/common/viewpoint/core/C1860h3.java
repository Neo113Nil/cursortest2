package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.h3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1860h3 extends AbstractRunnableC1326Wc {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ SA A01;
    public final /* synthetic */ UK A02;

    public C1860h3(SA sa, UK uk, Drawable drawable) {
        this.A01 = sa;
        this.A02 = uk;
        this.A00 = drawable;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        this.A02.A1P(this.A00);
    }
}
