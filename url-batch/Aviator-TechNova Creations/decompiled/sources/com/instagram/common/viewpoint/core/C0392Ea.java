package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Ea, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0392Ea extends C0974aL {
    public final ImageView A00;
    public final C1159dL A01;

    public C0392Ea(C1159dL c1159dL) {
        super(c1159dL);
        this.A01 = c1159dL;
        this.A00 = new ImageView(c1159dL);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        KZ downloadImageTask = new KZ(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
