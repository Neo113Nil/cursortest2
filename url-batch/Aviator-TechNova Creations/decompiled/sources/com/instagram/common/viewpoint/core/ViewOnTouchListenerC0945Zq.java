package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Zq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0945Zq implements View.OnTouchListener {
    public final /* synthetic */ ViewOnClickListenerC0946Zr A00;

    public ViewOnTouchListenerC0945Zq(ViewOnClickListenerC0946Zr viewOnClickListenerC0946Zr) {
        this.A00 = viewOnClickListenerC0946Zr;
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
