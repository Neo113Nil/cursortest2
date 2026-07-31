package com.bytedance.sdk.component.adexpress.dynamic.zn.zmn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public class fb implements View.OnTouchListener {
    private boolean btk = true;
    private com.bytedance.sdk.component.adexpress.dynamic.zn.zg bvs;
    private float fb;
    private float fs;
    private float hhw;
    private int iv;
    private float nps;
    private boolean rc;
    private boolean zg;
    private float zmn;
    private float zn;

    public fb(com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar, int i, boolean z) {
        this.bvs = zgVar;
        this.iv = i;
        this.rc = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar;
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar2;
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zmn = motionEvent.getX();
            this.fs = motionEvent.getY();
            this.hhw = motionEvent.getY();
            this.btk = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.nps = y;
                if (Math.abs(y - this.hhw) > 10.0f) {
                    this.zg = true;
                }
                this.fb = motionEvent.getX();
                this.zn = motionEvent.getY();
                if (Math.abs(this.fb - this.zmn) > 8.0f || Math.abs(this.zn - this.fs) > 8.0f) {
                    this.btk = false;
                }
            }
        } else {
            if (!this.zg && !this.btk) {
                return false;
            }
            if (!this.rc && (zgVar3 = this.bvs) != null) {
                zgVar3.zmn();
            } else {
                int fs = com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), Math.abs(this.nps - this.hhw));
                if (this.nps - this.hhw < 0.0f && fs > this.iv && (zgVar2 = this.bvs) != null) {
                    zgVar2.zmn();
                } else if (this.btk && (zgVar = this.bvs) != null) {
                    zgVar.zmn();
                }
            }
        }
        return true;
    }
}
