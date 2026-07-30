package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC0947Zs {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC0946Zr viewOnClickListenerC0946Zr = new ViewOnClickListenerC0946Zr(onClickListener);
            view.setOnClickListener(viewOnClickListenerC0946Zr);
            view.setOnTouchListener(new ViewOnTouchListenerC0945Zq(viewOnClickListenerC0946Zr));
        }
    }
}
