package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cy, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1137cy implements View.OnTouchListener {
    public final /* synthetic */ C1138cz A00;

    public ViewOnTouchListenerC1137cy(C1138cz c1138cz) {
        this.A00 = c1138cz;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        US us;
        AbstractC1434hy abstractC1434hy;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1138cz.A00(this.A00);
            us = this.A00.A07;
            abstractC1434hy = this.A00.A04;
            us.ABJ(abstractC1434hy.A25(), new C0944Zp().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
