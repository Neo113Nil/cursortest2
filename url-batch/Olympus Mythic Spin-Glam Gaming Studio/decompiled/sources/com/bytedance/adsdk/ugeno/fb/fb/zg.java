package com.bytedance.adsdk.ugeno.fb.fb;

import android.content.Context;
import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes14.dex */
public class zg extends zn {
    private int klz;
    private int mw;
    private int rc;

    public zg(Context context) {
        super(context);
        this.rc = -1;
        this.klz = -1;
        this.mw = -1;
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fb.zn
    public boolean zmn(Object... objArr) {
        if (objArr != null && objArr.length > 0) {
            int zmn = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(objArr[0]), -1);
            int zmn2 = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(objArr[1]), -1);
            int zmn3 = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(objArr[2]), -1);
            Map<String, Object> map = this.btk;
            if (map == null || map.isEmpty()) {
                HashMap hashMap = new HashMap();
                hashMap.put("fromIndex", Integer.valueOf(zmn));
                hashMap.put("toIndex", Integer.valueOf(zmn2));
                hashMap.put("type", Integer.valueOf(zmn3));
                Iterator<hhw.zmn> it = this.zn.fs().iterator();
                while (it.hasNext()) {
                    it.next().fs(hashMap);
                }
                this.zmn.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
            } else {
                Object obj = this.btk.get("fromIndex");
                if (obj != null) {
                    this.rc = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj), -1);
                }
                if (this.btk.get("toIndex") != null) {
                    this.klz = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(this.btk.get("toIndex")), -1);
                }
                if (this.btk.get("type") != null) {
                    this.mw = com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(this.btk.get("type")), -1);
                }
                if (zmn == this.rc && zmn2 == this.klz && zmn3 == this.mw) {
                    this.zmn.zmn(this.fs, this.hhw, this.zn.fs(), this.zn);
                }
            }
        }
        return false;
    }
}
