package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1497bA implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC1498bB A00;

    public ViewOnTouchListenerC1497bA(ViewOnClickListenerC1498bB viewOnClickListenerC1498bB) {
        this.A00 = viewOnClickListenerC1498bB;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() == 0) {
            this.A00.A00(motionEvent.getX(), motionEvent.getY());
            return false;
        }
        return false;
    }
}
