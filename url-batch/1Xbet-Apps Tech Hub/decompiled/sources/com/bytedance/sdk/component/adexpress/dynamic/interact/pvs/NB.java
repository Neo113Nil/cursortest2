package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;

/* compiled from: SlideUpTouch.java */
/* loaded from: classes.dex */
public class NB implements View.OnTouchListener {
    private Mxy Jd;
    private int NB;
    private float icD;
    private float pvs;
    private boolean vG;

    public NB(Mxy mxy, int i) {
        this.Jd = mxy;
        this.NB = i;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Mxy mxy;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pvs = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.icD = y;
                if (Math.abs(y - this.pvs) > 10.0f) {
                    this.vG = true;
                }
            }
        } else {
            if (!this.vG) {
                return false;
            }
            int icD = com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), Math.abs(this.icD - this.pvs));
            if (this.icD - this.pvs < 0.0f && icD > this.NB && (mxy = this.Jd) != null) {
                mxy.pvs();
            }
        }
        return true;
    }
}
