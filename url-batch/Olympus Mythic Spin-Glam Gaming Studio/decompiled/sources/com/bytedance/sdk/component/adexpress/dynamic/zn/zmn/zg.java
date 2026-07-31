package com.bytedance.sdk.component.adexpress.dynamic.zn.zmn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public class zg implements View.OnTouchListener {
    private float btk;
    private float fb;
    private final boolean fs;
    private float hhw;
    private float nps;
    private final com.bytedance.sdk.component.adexpress.dynamic.zn.zg zmn;
    private final int zn = 10;

    public zg(com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar, boolean z) {
        this.zmn = zgVar;
        this.fs = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar;
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.fb = motionEvent.getX();
            this.btk = motionEvent.getY();
            new StringBuilder(", mStartY: ").append(this.btk);
        } else if (action == 1) {
            this.hhw = motionEvent.getX();
            this.nps = motionEvent.getY();
            new StringBuilder(", mEndY: ").append(this.nps);
            if (!this.fs && (zgVar2 = this.zmn) != null) {
                zgVar2.zmn();
            } else {
                float f = this.hhw - this.fb;
                float f2 = this.nps - this.btk;
                if (com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), Math.abs((float) Math.sqrt((f * f) + (f2 * f2)))) > 10.0f && (zgVar = this.zmn) != null) {
                    zgVar.zmn();
                }
            }
        }
        return true;
    }
}
