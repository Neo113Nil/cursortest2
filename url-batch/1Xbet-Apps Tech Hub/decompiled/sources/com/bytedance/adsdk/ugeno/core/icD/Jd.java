package com.bytedance.adsdk.ugeno.core.icD;

import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.core.Ju;
import com.bytedance.adsdk.ugeno.core.qh;
import com.bytedance.adsdk.ugeno.icD.so;

/* compiled from: UGSlideRightEvent.java */
/* loaded from: classes.dex */
public class Jd {
    private qh Jd;
    private boolean Mxy;
    private qh NB;
    private float icD;
    private float pvs;
    private String sUS;
    private boolean so;
    private int vG = 0;
    private Context yiw;

    public Jd(Context context, qh qhVar, boolean z) {
        this.yiw = context;
        this.Jd = qhVar;
        this.Mxy = z;
        pvs();
    }

    public Jd(Context context, qh qhVar, qh qhVar2, boolean z) {
        this.yiw = context;
        this.Jd = qhVar;
        this.NB = qhVar2;
        this.Mxy = z;
        pvs();
    }

    private void pvs() {
        qh qhVar = this.Jd;
        if (qhVar == null) {
            return;
        }
        this.vG = qhVar.vG().optInt("slideThreshold");
        this.sUS = this.Jd.vG().optString("slideDirection", "up");
    }

    public boolean pvs(Ju ju, com.bytedance.adsdk.ugeno.component.icD icd, MotionEvent motionEvent) {
        if (this.so) {
            return true;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.pvs = motionEvent.getX();
            this.icD = motionEvent.getY();
        } else if (action == 1 || action == 3) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (this.Mxy && Math.abs(x - this.pvs) <= 10.0f && Math.abs(y - this.icD) <= 10.0f && ju != null) {
                ju.pvs(this.NB, icd, icd);
                return true;
            }
            if (this.vG == 0 && ju != null) {
                ju.pvs(this.Jd, icd, icd);
                this.so = true;
                return true;
            }
            int icD = so.icD(this.yiw, x - this.pvs);
            int icD2 = so.icD(this.yiw, y - this.icD);
            if (TextUtils.equals(this.sUS, "up")) {
                icD = -icD2;
            } else if (TextUtils.equals(this.sUS, "down")) {
                icD = icD2;
            } else if (TextUtils.equals(this.sUS, "left")) {
                icD = -icD;
            } else if (!TextUtils.equals(this.sUS, "right")) {
                icD = 0;
            }
            if (icD < this.vG) {
                return false;
            }
            if (ju != null) {
                ju.pvs(this.Jd, icd, icd);
                this.so = true;
                return true;
            }
        }
        return true;
    }
}
