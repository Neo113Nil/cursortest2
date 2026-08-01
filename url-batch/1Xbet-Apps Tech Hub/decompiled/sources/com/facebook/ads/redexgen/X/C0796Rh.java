package com.facebook.ads.redexgen.X;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Rh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C0796Rh extends C0694Nj {
    public final ImageView A00;
    public final YA A01;

    public C0796Rh(YA ya) {
        super(ya);
        this.A01 = ya;
        ImageView imageView = new ImageView(ya);
        this.A00 = imageView;
        imageView.setAdjustViewBounds(true);
        addView(imageView, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final void A00(String str) {
        T8 downloadImageTask = new T8(this.A00, this.A01);
        downloadImageTask.A04();
        downloadImageTask.A07(str);
    }
}
