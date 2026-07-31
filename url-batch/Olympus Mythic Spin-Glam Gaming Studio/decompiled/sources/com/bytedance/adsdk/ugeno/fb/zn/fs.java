package com.bytedance.adsdk.ugeno.fb.zn;

import com.bytedance.adsdk.ugeno.fb.hhw;
import com.ironsource.X3;

/* loaded from: classes15.dex */
public class fs extends com.bytedance.adsdk.ugeno.fb.fs.zmn {
    public fs(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
        super(znVar, str, zmnVar);
    }

    @Override // com.bytedance.adsdk.ugeno.fb.fs.zmn
    public void zmn() {
        if (this.zn == null) {
            return;
        }
        Object obj = this.hhw.get(X3.i.L);
        int zmn = obj != null ? com.bytedance.adsdk.ugeno.nps.zn.zmn(String.valueOf(obj), 0) : 0;
        com.bytedance.adsdk.ugeno.fs.zn znVar = this.zn;
        com.bytedance.adsdk.ugeno.fs.zn fs = znVar.fs(znVar);
        if (fs == null) {
            return;
        }
        com.bytedance.adsdk.ugeno.fs.zn hhw = fs.hhw("SwiperView");
        if (hhw instanceof com.bytedance.adsdk.ugeno.fs) {
            ((com.bytedance.adsdk.ugeno.fs) hhw).zmn(zmn);
        }
    }
}
