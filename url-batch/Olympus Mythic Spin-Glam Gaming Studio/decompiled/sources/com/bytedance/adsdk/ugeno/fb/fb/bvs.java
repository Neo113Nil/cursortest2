package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import android.util.Log;
import android.view.MotionEvent;
import com.bytedance.adsdk.ugeno.fb.rt;

/* loaded from: classes15.dex */
public class bvs extends zn {
    private float klz;
    private boolean mw;
    private float rc;
    private rt rt;

    public bvs(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        if (objArr == null || objArr.length <= 0) {
            return false;
        }
        MotionEvent motionEvent = (MotionEvent) objArr[0];
        rt rtVar = this.rt;
        if (rtVar != null) {
            return rtVar.zmn(this.fs, motionEvent, this.zmn, this);
        }
        return zmn(this.fs, motionEvent);
    }

    public boolean zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.rc = motionEvent.getRawX();
            this.klz = motionEvent.getRawY();
        } else {
            if (action != 1) {
                if (action == 2) {
                    float rawX = motionEvent.getRawX();
                    float rawY = motionEvent.getRawY();
                    if (Math.abs(rawX - this.rc) >= 15.0f || Math.abs(rawY - this.klz) >= 15.0f) {
                        this.mw = true;
                    }
                } else if (action == 3) {
                    this.mw = false;
                }
            }
            if (this.mw) {
                this.mw = false;
                this.rc = 0.0f;
                this.klz = 0.0f;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            float rawX2 = motionEvent.getRawX();
            float rawY2 = motionEvent.getRawY();
            if (Math.abs(rawX2 - this.rc) >= 15.0f || Math.abs(rawY2 - this.klz) >= 15.0f) {
                this.mw = false;
                Log.d("GesThrough_UGTapEvent", "Non-tap event");
                return false;
            }
            Log.d("GesThrough_UGTapEvent", "Tap event, direct handling");
            com.bytedance.adsdk.ugeno.fb.rc rcVar = this.zmn;
            if (rcVar != null) {
                rcVar.zmn(znVar, this.hhw, this.zn.fs(), this.zn);
                this.rc = 0.0f;
                this.klz = 0.0f;
                return true;
            }
        }
        return true;
    }

    public void zmn(rt rtVar) {
        this.rt = rtVar;
    }
}
