package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import java.util.Map;

/* loaded from: classes4.dex */
public class nps extends zn {
    public nps(Context context) {
        super(context);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(objArr[0]), 0);
            Map<String, Object> map = this.btk;
            if (map == null || map.isEmpty()) {
                this.zmn.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
            } else {
                Object obj = this.btk.get("type");
                if (zmn == (obj != null ? com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj), 0) : 0)) {
                    this.zmn.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                }
            }
        }
        return false;
    }
}
