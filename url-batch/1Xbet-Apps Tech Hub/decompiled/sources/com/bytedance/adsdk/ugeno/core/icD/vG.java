package com.bytedance.adsdk.ugeno.core.icD;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.qh;

/* compiled from: UGOnlyTapEvent.java */
/* loaded from: classes.dex */
public class vG {
    private Context Jd;
    private boolean NB;
    private float icD;
    private float pvs;
    private qh vG;

    public vG(Context context, qh qhVar) {
        this.Jd = context;
        this.vG = qhVar;
    }

    public boolean pvs(Ju ju, com.bytedance.adsdk.ugeno.component.icD icd, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pvs = motionEvent.getX();
            this.icD = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.pvs) >= 15.0f || Math.abs(y - this.icD) >= 15.0f) {
                    this.NB = true;
                }
            } else if (action == 3) {
                this.NB = false;
            }
        } else {
            if (this.NB) {
                this.NB = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.pvs) >= 15.0f || Math.abs(y2 - this.icD) >= 15.0f) {
                this.NB = false;
            } else if (ju != null) {
                ju.pvs(this.vG, icd, icd);
                return true;
            }
        }
        return true;
    }
}
