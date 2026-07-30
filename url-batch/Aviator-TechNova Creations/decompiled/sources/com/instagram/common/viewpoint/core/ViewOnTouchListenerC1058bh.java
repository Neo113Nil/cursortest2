package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.bh, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1058bh implements View.OnTouchListener {
    public final /* synthetic */ C5K A00;

    public ViewOnTouchListenerC1058bh(C5K c5k) {
        this.A00 = c5k;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1062bl c1062bl;
        c1062bl = this.A00.A0E;
        c1062bl.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
