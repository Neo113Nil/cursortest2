package com.bytedance.adsdk.ugeno.fb;

import com.bytedance.adsdk.ugeno.fb.hhw;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public class btk implements zn {
    @Override // com.bytedance.adsdk.ugeno.fb.zn
    public List<fs> zmn() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fs("update") { // from class: com.bytedance.adsdk.ugeno.fb.btk.1
            @Override // com.bytedance.adsdk.ugeno.fb.fs
            public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                return new com.bytedance.adsdk.ugeno.fb.fs.btk(znVar, str, zmnVar);
            }
        });
        arrayList.add(new fs("emit") { // from class: com.bytedance.adsdk.ugeno.fb.btk.2
            @Override // com.bytedance.adsdk.ugeno.fb.fs
            public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                return new com.bytedance.adsdk.ugeno.fb.fs.fs(znVar, str, zmnVar);
            }
        });
        arrayList.add(new fs("startAnimate") { // from class: com.bytedance.adsdk.ugeno.fb.btk.3
            @Override // com.bytedance.adsdk.ugeno.fb.fs
            public com.bytedance.adsdk.ugeno.fb.fs.zmn zmn(com.bytedance.adsdk.ugeno.fs.zn znVar, String str, hhw.zmn zmnVar) {
                return new com.bytedance.adsdk.ugeno.fb.fs.fb(znVar, str, zmnVar);
            }
        });
        return arrayList;
    }
}
