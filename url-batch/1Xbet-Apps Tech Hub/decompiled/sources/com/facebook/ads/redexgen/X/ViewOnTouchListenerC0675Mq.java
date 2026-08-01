package com.facebook.ads.redexgen.X;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Mq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class ViewOnTouchListenerC0675Mq implements View.OnTouchListener {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        return false;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        switch (motionEvent.getAction()) {
            case 0:
                i = C0681Mw.A0D;
                LV.A0M(view, i);
                break;
            case 1:
                LV.A0M(view, 0);
                break;
        }
    }
}
