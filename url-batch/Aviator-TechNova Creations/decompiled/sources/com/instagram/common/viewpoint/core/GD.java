package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class GD implements InterfaceC0943Zo {
    public final /* synthetic */ C4K A00;

    public GD(C4K c4k) {
        this.A00 = c4k;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0943Zo
    public final void ADT(C0942Zn c0942Zn) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        imageView = this.A00.A02;
        if (imageView != null && c0942Zn.A00() != null) {
            imageView2 = this.A00.A02;
            imageView2.setImageBitmap(c0942Zn.A00());
            imageView3 = this.A00.A02;
            imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView4 = this.A00.A02;
            imageView4.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
