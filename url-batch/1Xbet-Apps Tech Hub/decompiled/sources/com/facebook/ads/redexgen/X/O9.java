package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class O9 implements View.OnTouchListener {
    public final /* synthetic */ C0826Sl A00;

    public O9(C0826Sl c0826Sl) {
        this.A00 = c0826Sl;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        float f;
        int action = motionEvent.getActionMasked();
        switch (action) {
            case 0:
                this.A00.A00 = motionEvent.getY();
                break;
            case 1:
                float browserFinalY = motionEvent.getY();
                f = this.A00.A00;
                if (f < browserFinalY) {
                    this.A00.A0f(false);
                    break;
                }
                break;
        }
        return true;
    }
}
