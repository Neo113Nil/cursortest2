package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2878bC {
    public static void A00(View view, boolean z, View.OnClickListener onClickListener) {
        if (!z) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z) {
                return;
            }
            ViewOnClickListenerC2877bB viewOnClickListenerC2877bB = new ViewOnClickListenerC2877bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC2877bB);
            view.setOnTouchListener(new ViewOnTouchListenerC2876bA(viewOnClickListenerC2877bB));
        }
    }
}
