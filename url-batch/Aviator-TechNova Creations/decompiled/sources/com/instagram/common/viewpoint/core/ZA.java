package com.instagram.common.viewpoint.core;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class ZA extends ImageView {
    public ZA(C1159dL c1159dL, View.OnClickListener onClickListener) {
        super(c1159dL);
        Bitmap bitmap = XY.A01(XX.CREDIT_LINE_PILL);
        setImageBitmap(bitmap);
        setOnClickListener(onClickListener);
    }
}
