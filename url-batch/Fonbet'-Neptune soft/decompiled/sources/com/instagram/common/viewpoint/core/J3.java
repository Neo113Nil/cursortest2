package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class J3 implements InterfaceC0937Zo {
    public final /* synthetic */ C0507Is A00;

    public J3(C0507Is c0507Is) {
        this.A00 = c0507Is;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0937Zo
    public final void ADT(C0936Zn c0936Zn) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        imageView = this.A00.A02;
        if (imageView != null && c0936Zn.A00() != null) {
            imageView2 = this.A00.A02;
            imageView2.setImageBitmap(c0936Zn.A00());
            imageView3 = this.A00.A02;
            imageView3.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView4 = this.A00.A02;
            imageView4.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
