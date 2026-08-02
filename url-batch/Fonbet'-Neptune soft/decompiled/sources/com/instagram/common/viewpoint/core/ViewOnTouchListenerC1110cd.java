package com.instagram.common.viewpoint.core;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.cd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC1110cd implements View.OnTouchListener {
    public final /* synthetic */ C01333r A00;

    public ViewOnTouchListenerC1110cd(C01333r c01333r) {
        this.A00 = c01333r;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        View view7;
        AbstractC0987ae abstractC0987ae;
        AbstractC0987ae abstractC0987ae2;
        float x = motionEvent.getX();
        view2 = this.A00.A0H;
        if (x >= view2.getX()) {
            float x2 = motionEvent.getX();
            view3 = this.A00.A0H;
            float x3 = view3.getX();
            view4 = this.A00.A0H;
            if (x2 <= x3 + view4.getWidth()) {
                float y = motionEvent.getY();
                view5 = this.A00.A0H;
                if (y >= view5.getY()) {
                    float y2 = motionEvent.getY();
                    view6 = this.A00.A0H;
                    float y3 = view6.getY();
                    view7 = this.A00.A0H;
                    if (y2 <= y3 + view7.getHeight()) {
                        abstractC0987ae = this.A00.A03;
                        if (abstractC0987ae != null) {
                            abstractC0987ae2 = this.A00.A03;
                            abstractC0987ae2.dispatchTouchEvent(motionEvent);
                            return true;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
