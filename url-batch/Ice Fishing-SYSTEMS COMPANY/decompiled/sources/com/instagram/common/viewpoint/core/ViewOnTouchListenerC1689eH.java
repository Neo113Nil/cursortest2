package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.eH, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class ViewOnTouchListenerC1689eH implements View.OnTouchListener {
    public final /* synthetic */ C1690eI A00;

    public ViewOnTouchListenerC1689eH(C1690eI c1690eI) {
        this.A00 = c1690eI;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        VA va;
        AbstractC2004jd abstractC2004jd;
        if (motionEvent.getAction() == 1) {
            this.A00.A01 = System.currentTimeMillis();
            C1690eI.A00(this.A00);
            va = this.A00.A06;
            abstractC2004jd = this.A00.A03;
            va.ABp(abstractC2004jd.A2E(), new C1496b9().A03(this.A00.getViewabilityChecker()).A02(this.A00.getTouchDataRecorder()).A05());
            return false;
        }
        return false;
    }
}
