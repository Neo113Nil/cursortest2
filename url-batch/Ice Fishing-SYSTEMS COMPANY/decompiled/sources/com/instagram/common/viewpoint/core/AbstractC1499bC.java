package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bC, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1499bC {
    public static void A00(View view, boolean z8, View.OnClickListener onClickListener) {
        if (!z8) {
            view.setOnClickListener(onClickListener);
        } else {
            if (!z8) {
                return;
            }
            ViewOnClickListenerC1498bB viewOnClickListenerC1498bB = new ViewOnClickListenerC1498bB(onClickListener);
            view.setOnClickListener(viewOnClickListenerC1498bB);
            view.setOnTouchListener(new ViewOnTouchListenerC1497bA(viewOnClickListenerC1498bB));
        }
    }
}
