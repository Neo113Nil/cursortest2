package com.bytedance.sdk.component.adexpress.dynamic.zn.zmn;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.zn.bvs;

/* loaded from: classes6.dex */
public class fs implements View.OnTouchListener {
    private bvs btk;
    private boolean fb;
    private float fs;
    private com.bytedance.sdk.component.adexpress.dynamic.zn.zg hhw;
    private float zmn;
    private long zn;

    public fs(bvs bvsVar, com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar) {
        this.btk = bvsVar;
        this.hhw = zgVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zn = System.currentTimeMillis();
            this.zmn = motionEvent.getX();
            this.fs = motionEvent.getY();
            this.btk.btk();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.zmn) >= com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), 10.0f) || Math.abs(y - this.fs) >= com.bytedance.sdk.component.adexpress.fb.nps.zmn(com.bytedance.sdk.component.adexpress.fb.zmn(), 10.0f)) {
                    this.fb = true;
                    this.btk.hhw();
                }
            }
        } else {
            if (this.fb) {
                return false;
            }
            if (System.currentTimeMillis() - this.zn >= 1500) {
                com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar = this.hhw;
                if (zgVar != null) {
                    zgVar.zmn();
                }
            }
            this.btk.hhw();
        }
        return true;
    }
}
