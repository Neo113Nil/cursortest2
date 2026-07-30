package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.d0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1611d0 implements View.OnTouchListener {
    public final /* synthetic */ AnonymousClass66 A00;

    public ViewOnTouchListenerC1611d0(AnonymousClass66 anonymousClass66) {
        this.A00 = anonymousClass66;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C1615d4 c1615d4;
        c1615d4 = this.A00.A0E;
        c1615d4.dispatchTouchEvent(MotionEvent.obtain(motionEvent));
        return false;
    }
}
