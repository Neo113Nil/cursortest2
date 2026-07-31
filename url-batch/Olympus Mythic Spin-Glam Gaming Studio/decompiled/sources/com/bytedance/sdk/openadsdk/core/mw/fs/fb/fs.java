package com.bytedance.sdk.openadsdk.core.mw.fs.fb;

import android.content.Context;
import android.util.Log;
import com.bytedance.adsdk.ugeno.fb.rc;

/* loaded from: classes9.dex */
public class fs extends com.bytedance.adsdk.ugeno.fb.fb.zn {
    private boolean klz;
    private float rc;

    public fs(Context context) {
        super(context);
        this.rc = 100.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        if (objArr != null && objArr.length >= 2) {
            if (com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(objArr[1]), 0.0f) <= 0.0f) {
                rc rcVar = this.zmn;
                if (rcVar != null && !this.klz) {
                    this.klz = true;
                    rcVar.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                }
                return true;
            }
            if (this.btk.get("rate") != null) {
                this.rc = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(r2), 100);
            }
            float zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(objArr[0]), 100.0f);
            Log.d("UGBaseEventMonitor", "monitor: progress=" + zmn + " mTargetProgress=" + this.rc);
            if (zmn >= this.rc) {
                rc rcVar2 = this.zmn;
                if (rcVar2 != null && !this.klz) {
                    this.klz = true;
                    rcVar2.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                }
                return true;
            }
        }
        return false;
    }
}
