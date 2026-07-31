package com.bytedance.sdk.openadsdk.core.mw.btk.fs;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fb.rc;
import java.util.Map;

/* loaded from: classes6.dex */
public class fb extends com.bytedance.adsdk.ugeno.fb.fb.zn {
    private boolean rc;

    public fb(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        Map<String, Object> map = this.btk;
        if (map == null || map.isEmpty()) {
            return false;
        }
        long longValue = ((Long) objArr[0]).longValue() / 1000;
        long longValue2 = ((Long) objArr[1]).longValue() / 1000;
        if (longValue <= 0) {
            this.rc = false;
        }
        if (this.btk.containsKey("percent")) {
            Object obj = this.btk.get("percent");
            float zmn = obj != null ? com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj), -1.0f) : -1.0f;
            if (zmn >= 0.0f && longValue >= (zmn / 100.0f) * longValue2 && !this.rc) {
                this.rc = true;
                rc rcVar = this.zmn;
                if (rcVar != null) {
                    rcVar.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                }
            }
        } else {
            if (longValue >= (this.btk.get("interval") != null ? com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(r9), -1) : -1) && !this.rc) {
                this.rc = true;
                rc rcVar2 = this.zmn;
                if (rcVar2 != null) {
                    rcVar2.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                }
            }
        }
        return true;
    }
}
