package com.bytedance.sdk.openadsdk.core.mw.btk.fs;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fb.rc;
import java.util.Map;

/* loaded from: classes3.dex */
public class zmn extends com.bytedance.adsdk.ugeno.fb.fb.zn {
    private boolean rc;

    public zmn(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        Map<String, Object> map = this.btk;
        if (map != null && !map.isEmpty()) {
            try {
                Object obj = objArr[0];
                if (obj == null) {
                    return false;
                }
                int zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(obj.toString(), -1);
                if (this.btk.containsKey("remainingSeconds")) {
                    Object obj2 = this.btk.get("remainingSeconds");
                    int zmn2 = obj2 != null ? com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj2), -1) : -1;
                    if ((zmn == 0 || (zmn2 >= 0 && zmn == zmn2)) && !this.rc) {
                        this.rc = true;
                        rc rcVar = this.zmn;
                        if (rcVar != null) {
                            rcVar.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
