package com.bytedance.adsdk.ugeno.fb.fs;

import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes13.dex */
public class fs extends zmn {
    private List<com.bytedance.adsdk.ugeno.fb.zmn.fb> bvs;

    public fs(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
        super(znVar, str, zmnVar);
        this.bvs = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fs.zmn
    public void zmn() {
        Object obj;
        com.bytedance.adsdk.ugeno.fb.zmn.zn zmn;
        Map<String, Object> map = this.hhw;
        if (map == null || map.size() <= 0 || (obj = this.hhw.get("name")) == null) {
            return;
        }
        String valueOf = String.valueOf(obj);
        com.bytedance.adsdk.ugeno.fb.zmn.zmn jy = this.zn.jy();
        if (jy == null || (zmn = jy.zmn(valueOf)) == null) {
            return;
        }
        zmn.zmn(valueOf);
    }
}
