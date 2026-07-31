package com.bytedance.sdk.component.adexpress.dynamic.zn.zmn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes15.dex */
public class btk implements View.OnTouchListener {
    private int btk;
    private com.bytedance.sdk.component.adexpress.dynamic.zn.zg fb;
    private float fs;
    private float zmn;
    private boolean zn;

    public btk(com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar, int i) {
        this.fb = zgVar;
        this.btk = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zmn = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.fs = y;
                if (Math.abs(y - this.zmn) > 10.0f) {
                    this.zn = true;
                }
            }
        } else {
            if (!this.zn) {
                return false;
            }
            int fs = com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), Math.abs(this.fs - this.zmn));
            if (this.fs - this.zmn < 0.0f && fs > this.btk && (zgVar = this.fb) != null) {
                zgVar.zmn();
                this.zmn = 0.0f;
                this.fs = 0.0f;
                this.zn = false;
            }
        }
        return true;
    }
}
