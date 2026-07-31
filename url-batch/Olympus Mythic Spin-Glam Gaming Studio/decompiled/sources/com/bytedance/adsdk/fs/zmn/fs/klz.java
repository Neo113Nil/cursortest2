package com.bytedance.adsdk.fs.zmn.fs;

import java.util.List;

/* loaded from: classes4.dex */
public class klz extends nps<com.bytedance.adsdk.fs.nps.zn> {
    private final com.bytedance.adsdk.fs.nps.zn fb;

    public klz(List<com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.nps.zn>> list) {
        super(list);
        this.fb = new com.bytedance.adsdk.fs.nps.zn();
    }

    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.fs.nps.zn zmn(com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.nps.zn> zmnVar, float f) {
        com.bytedance.adsdk.fs.nps.zn znVar;
        com.bytedance.adsdk.fs.nps.zn znVar2 = zmnVar.zmn;
        if (znVar2 == null || (znVar = zmnVar.fs) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.fs.nps.zn znVar3 = znVar2;
        com.bytedance.adsdk.fs.nps.zn znVar4 = znVar;
        if (this.zn != null) {
            zmnVar.nps.floatValue();
            fb();
            zg();
            throw null;
        }
        this.fb.zmn(com.bytedance.adsdk.fs.hhw.btk.zmn(znVar3.zmn(), znVar4.zmn(), f), com.bytedance.adsdk.fs.hhw.btk.zmn(znVar3.fs(), znVar4.fs(), f));
        return this.fb;
    }
}
