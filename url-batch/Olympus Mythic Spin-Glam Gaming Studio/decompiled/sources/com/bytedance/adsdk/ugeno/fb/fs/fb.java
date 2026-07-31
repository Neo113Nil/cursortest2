package com.bytedance.adsdk.ugeno.fb.fs;

import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.Map;

/* loaded from: classes13.dex */
public class fb extends zmn {
    @Override // com.bytedance.adsdk.ugeno.fb.fs.zmn
    public void fs() {
    }

    public fb(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
        super(znVar, str, zmnVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fs.zmn
    public void zmn() {
        Object obj;
        com.bytedance.adsdk.ugeno.fs.zn znVar;
        com.bytedance.adsdk.ugeno.fs.zn fs;
        com.bytedance.adsdk.ugeno.fs.zn zg;
        com.bytedance.adsdk.ugeno.zmn.zmn klz;
        Map<String, Object> map = this.hhw;
        if (map == null || map.size() <= 0 || (obj = this.hhw.get("name")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        if (TextUtils.isEmpty(valueOf) || (fs = (znVar = this.zn).fs(znVar)) == null || (zg = fs.zg(valueOf)) == null || (klz = zg.klz(valueOf)) == null) {
            return;
        }
        klz.fs();
        klz.zmn(new com.bytedance.adsdk.ugeno.zmn.fs() { // from class: com.bytedance.adsdk.ugeno.fb.fs.fb.1
            @Override // com.bytedance.adsdk.ugeno.zmn.fs
            public void zmn() {
            }

            @Override // com.bytedance.adsdk.ugeno.zmn.fs
            public void fs() {
                fb.this.zn();
            }
        });
    }
}
