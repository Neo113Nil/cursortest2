package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;

/* compiled from: SlideRightTouch.java */
/* loaded from: classes.dex */
public class vG implements View.OnTouchListener {
    private float Jd;
    private boolean Mxy;
    private boolean NB;
    private float icD;
    private float pvs;
    private Mxy sUS;
    private boolean so;
    private float vG;
    private int yiw;

    public vG(Mxy mxy) {
        this(mxy, 5);
    }

    public vG(Mxy mxy, int i) {
        this.yiw = 5;
        this.so = true;
        this.sUS = mxy;
        if (i > 0) {
            this.yiw = i;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Mxy mxy;
        Mxy mxy2;
        Mxy mxy3;
        if (this.Mxy) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pvs = motionEvent.getX();
            this.icD = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                this.Jd = motionEvent.getX();
                this.vG = motionEvent.getY();
                if (Math.abs(this.Jd - this.pvs) > 10.0f) {
                    this.NB = true;
                }
                if (Math.abs(this.Jd - this.pvs) > 8.0f || Math.abs(this.vG - this.icD) > 8.0f) {
                    this.so = false;
                }
                int icD = com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), Math.abs(this.Jd - this.pvs));
                if (this.Jd > this.pvs && icD > this.yiw && (mxy3 = this.sUS) != null) {
                    mxy3.pvs();
                    this.Mxy = true;
                }
            }
        } else {
            if (!this.NB && !this.so) {
                return false;
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int icD2 = com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), Math.abs(this.Jd - this.pvs));
            if (this.Jd > this.pvs && icD2 > this.yiw && (mxy2 = this.sUS) != null) {
                mxy2.pvs();
                this.Mxy = true;
            }
            float abs = Math.abs(x - this.pvs);
            float abs2 = Math.abs(y - this.icD);
            if ((abs < 8.0f || abs2 < 8.0f) && (mxy = this.sUS) != null) {
                mxy.icD();
                this.Mxy = true;
            }
        }
        return true;
    }
}
