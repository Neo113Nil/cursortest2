package com.bytedance.adsdk.ugeno.core.fs;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import com.bytedance.adsdk.ugeno.core.cn;
import com.bytedance.adsdk.ugeno.core.mw;

/* loaded from: classes8.dex */
public class zn {
    private boolean btk;
    private Context fb;
    private float fs;
    private final int hhw;
    private float zmn;
    private mw zn;

    public zn(Context context, mw mwVar) {
        this.fb = context;
        this.zn = mwVar;
        this.hhw = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean zmn(cn cnVar, com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zmn = motionEvent.getX();
            this.fs = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.zmn) >= this.hhw || Math.abs(y - this.fs) >= this.hhw) {
                    this.btk = true;
                }
            } else if (action == 3) {
                this.btk = false;
            }
        } else {
            if (this.btk) {
                this.btk = false;
                return false;
            }
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.zmn) >= this.hhw || Math.abs(y2 - this.fs) >= this.hhw) {
                this.btk = false;
            } else if (cnVar != null) {
                cnVar.zmn(this.zn, znVar, znVar);
                return true;
            }
        }
        return true;
    }
}
