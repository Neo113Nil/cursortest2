package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;

/* compiled from: ValidateSlideUpTouch.java */
/* loaded from: classes.dex */
public class so implements View.OnTouchListener {
    private float Jd;
    private float NB;
    private final boolean icD;
    private final Mxy pvs;
    private float sUS;
    private final int vG = 10;
    private float yiw;

    public so(Mxy mxy, boolean z) {
        this.pvs = mxy;
        this.icD = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Mxy mxy;
        Mxy mxy2;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.Jd = motionEvent.getX();
            this.NB = motionEvent.getY();
            Object[] objArr = new Object[3];
            Float.valueOf(this.Jd);
            String str = ", mStartY: " + this.NB;
        } else if (action == 1) {
            this.sUS = motionEvent.getX();
            this.yiw = motionEvent.getY();
            Object[] objArr2 = new Object[3];
            Float.valueOf(this.sUS);
            String str2 = ", mEndY: " + this.yiw;
            if (!this.icD && (mxy2 = this.pvs) != null) {
                mxy2.pvs();
            } else {
                float f = this.sUS - this.Jd;
                float f2 = this.yiw - this.NB;
                float sqrt = (float) Math.sqrt((f * f) + (f2 * f2));
                Object[] objArr3 = new Object[2];
                Float.valueOf(sqrt);
                float icD = com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), Math.abs(sqrt));
                Object[] objArr4 = new Object[5];
                Float.valueOf(icD);
                Integer.valueOf(10);
                if (icD > 10.0f && (mxy = this.pvs) != null) {
                    mxy.pvs();
                }
            }
        }
        return true;
    }
}
