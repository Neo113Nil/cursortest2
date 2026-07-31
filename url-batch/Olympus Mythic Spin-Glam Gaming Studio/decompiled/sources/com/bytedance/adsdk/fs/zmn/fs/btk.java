package com.bytedance.adsdk.fs.zmn.fs;

import java.util.List;

/* loaded from: classes4.dex */
public class btk extends nps<com.bytedance.adsdk.fs.zn.fs.fb> {
    private final com.bytedance.adsdk.fs.zn.fs.fb fb;

    public btk(List<com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.fb>> list) {
        super(list);
        com.bytedance.adsdk.fs.zn.fs.fb fbVar = list.get(0).zmn;
        int zn = fbVar != null ? fbVar.zn() : 0;
        this.fb = new com.bytedance.adsdk.fs.zn.fs.fb(new float[zn], new int[zn]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.fs.zn.fs.fb zmn(com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.fb> zmnVar, float f) {
        this.fb.zmn(zmnVar.zmn, zmnVar.fs, f);
        return this.fb;
    }
}
