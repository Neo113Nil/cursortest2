package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;

/* compiled from: TapTouch.java */
/* loaded from: classes.dex */
public class sUS implements View.OnTouchListener {
    private static int vG = 10;
    private boolean Jd;
    private Mxy NB;
    private float icD;
    private float pvs;

    public sUS(Mxy mxy) {
        this.NB = mxy;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pvs = motionEvent.getX();
            this.icD = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.pvs) >= vG || Math.abs(y - this.icD) >= vG) {
                    this.Jd = true;
                }
            } else if (action == 3) {
                this.Jd = false;
            }
        } else {
            if (this.Jd) {
                this.Jd = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.pvs) >= vG || Math.abs(y2 - this.icD) >= vG) {
                this.Jd = false;
            } else {
                Mxy mxy = this.NB;
                if (mxy != null) {
                    mxy.pvs();
                }
            }
        }
        return true;
    }
}
