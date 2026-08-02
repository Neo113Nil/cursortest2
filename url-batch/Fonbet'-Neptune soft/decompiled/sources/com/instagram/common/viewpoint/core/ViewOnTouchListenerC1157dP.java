package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.dP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1157dP implements View.OnTouchListener {
    public final /* synthetic */ E1 A00;

    public ViewOnTouchListenerC1157dP(E1 e1) {
        this.A00 = e1;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C0775Te c0775Te;
        c0775Te = this.A00.A0C;
        c0775Te.A02(new DH(view, motionEvent));
        return false;
    }
}
