package com.bytedance.sdk.component.adexpress.dynamic.zn.zmn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public class zn implements View.OnTouchListener {
    private boolean btk;
    private boolean bvs;
    private float fb;
    private float fs;
    private com.bytedance.sdk.component.adexpress.dynamic.zn.zg hhw;
    private int nps;
    private boolean zg;
    private float zmn;
    private float zn;

    public zn(com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar) {
        this(zgVar, 5);
    }

    public zn(com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar, int i) {
        this.nps = 5;
        this.zg = true;
        this.hhw = zgVar;
        if (i > 0) {
            this.nps = i;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar;
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar2;
        com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar3;
        if (this.bvs) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zmn = motionEvent.getX();
            this.fs = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.fb = motionEvent.getX();
                this.zn = motionEvent.getY();
                if (Math.abs(this.fb - this.zmn) > 10.0f) {
                    this.btk = true;
                }
                if (Math.abs(this.fb - this.zmn) > 8.0f || Math.abs(this.zn - this.fs) > 8.0f) {
                    this.zg = false;
                }
                int fs = com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), Math.abs(this.fb - this.zmn));
                if (this.fb > this.zmn && fs > this.nps && (zgVar3 = this.hhw) != null) {
                    zgVar3.zmn();
                    this.bvs = true;
                }
            }
        } else {
            if (!this.btk && !this.zg) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int fs2 = com.bytedance.sdk.component.adexpress.fb.nps.fs(com.bytedance.sdk.component.adexpress.fb.zmn(), Math.abs(this.fb - this.zmn));
            if (this.fb > this.zmn && fs2 > this.nps && (zgVar2 = this.hhw) != null) {
                zgVar2.zmn();
                this.bvs = true;
            }
            float abs = Math.abs(x - this.zmn);
            float abs2 = Math.abs(y - this.fs);
            if ((abs < 8.0f || abs2 < 8.0f) && (zgVar = this.hhw) != null) {
                zgVar.fs();
                this.bvs = true;
            }
        }
        return true;
    }
}
