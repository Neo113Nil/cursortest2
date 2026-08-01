package com.bytedance.sdk.component.adexpress.dynamic.interact.pvs;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.Mxy;

/* compiled from: SlideUpAndClickTouch.java */
/* loaded from: classes.dex */
public class Jd implements View.OnTouchListener {
    private float Jd;
    private Mxy Mxy;
    private boolean NB = true;
    private int Wyp;
    private float icD;
    private float pvs;
    private boolean qh;
    private float sUS;
    private boolean so;
    private float vG;
    private float yiw;

    public Jd(Mxy mxy, int i, boolean z) {
        this.Mxy = mxy;
        this.Wyp = i;
        this.qh = z;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        Mxy mxy;
        Mxy mxy2;
        Mxy mxy3;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pvs = motionEvent.getX();
            this.icD = motionEvent.getY();
            this.sUS = motionEvent.getY();
            this.NB = true;
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.yiw = y;
                if (Math.abs(y - this.sUS) > 10.0f) {
                    this.so = true;
                }
                this.Jd = motionEvent.getX();
                this.vG = motionEvent.getY();
                if (Math.abs(this.Jd - this.pvs) > 8.0f || Math.abs(this.vG - this.icD) > 8.0f) {
                    this.NB = false;
                }
            }
        } else {
            if (!this.so && !this.NB) {
                return false;
            }
            if (!this.qh && (mxy3 = this.Mxy) != null) {
                mxy3.pvs();
            } else {
                int icD = com.bytedance.sdk.component.adexpress.Jd.yiw.icD(com.bytedance.sdk.component.adexpress.Jd.pvs(), Math.abs(this.yiw - this.sUS));
                if (this.yiw - this.sUS < 0.0f && icD > this.Wyp && (mxy2 = this.Mxy) != null) {
                    mxy2.pvs();
                } else if (this.NB && (mxy = this.Mxy) != null) {
                    mxy.pvs();
                }
            }
        }
        return true;
    }
}
