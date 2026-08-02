package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0941Zs {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC0940Zr viewOnClickListenerC0940Zr = new ViewOnClickListenerC0940Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC0940Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC0939Zq(viewOnClickListenerC0940Zr));
        }
    }
}
