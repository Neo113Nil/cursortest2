package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;

/* compiled from: LongPressTouch.java */
/* loaded from: classes.dex */
public class icD implements View.OnTouchListener {
    private boolean Jd;
    private InteractViewContainer NB;
    private float icD;
    private float pvs;
    private Mxy sUS;
    private long vG;

    public icD(InteractViewContainer interactViewContainer, Mxy mxy) {
        this.NB = interactViewContainer;
        this.sUS = mxy;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.vG = System.currentTimeMillis();
            this.pvs = motionEvent.getX();
            this.icD = motionEvent.getY();
            this.NB.NB();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.pvs) >= com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), 10.0f) || Math.abs(y - this.icD) >= com.bytedance.sdk.component.adexpress.Jd.yiw.pvs(com.bytedance.sdk.component.adexpress.Jd.pvs(), 10.0f)) {
                    this.Jd = true;
                    this.NB.sUS();
                }
            }
        } else {
            if (this.Jd) {
                return false;
            }
            if (System.currentTimeMillis() - this.vG >= 1500) {
                Mxy mxy = this.sUS;
                if (mxy != null) {
                    mxy.pvs();
                }
            }
            this.NB.sUS();
        }
        return true;
    }
}
