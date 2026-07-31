package com.bytedance.sdk.component.adexpress.dynamic.zn.zmn;

import android.view.MotionEvent;
import android.view.View;

/* loaded from: classes5.dex */
public class hhw implements View.OnTouchListener {
    private static int zn = 10;
    private com.bytedance.sdk.component.adexpress.dynamic.zn.zg btk;
    private boolean fb;
    private float fs;
    private float zmn;

    public hhw(com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar) {
        this.btk = zgVar;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zmn = motionEvent.getX();
            this.fs = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.zmn) >= zn || Math.abs(y - this.fs) >= zn) {
                    this.fb = true;
                }
            } else if (action == 3) {
                this.fb = false;
            }
        } else {
            if (this.fb) {
                this.fb = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.zmn) >= zn || Math.abs(y2 - this.fs) >= zn) {
                this.fb = false;
            } else {
                com.bytedance.sdk.component.adexpress.dynamic.zn.zg zgVar = this.btk;
                if (zgVar != null) {
                    zgVar.zmn();
                }
            }
        }
        return true;
    }
}
