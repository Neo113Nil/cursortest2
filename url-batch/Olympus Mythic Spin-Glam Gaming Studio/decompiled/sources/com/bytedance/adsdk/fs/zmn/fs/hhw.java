package com.bytedance.adsdk.fs.zmn.fs;

import java.util.List;

/* loaded from: classes6.dex */
public class hhw extends nps<Integer> {
    public hhw(List<com.bytedance.adsdk.fs.nps.zmn<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public Integer zmn(com.bytedance.adsdk.fs.nps.zmn<Integer> zmnVar, float f) {
        return Integer.valueOf(zn(zmnVar, f));
    }

    int zn(com.bytedance.adsdk.fs.nps.zmn<Integer> zmnVar, float f) {
        if (zmnVar.zmn == null || zmnVar.fs == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.zn != null) {
            zmnVar.nps.floatValue();
            fb();
            zg();
            throw null;
        }
        return com.bytedance.adsdk.fs.hhw.btk.zmn(zmnVar.zg(), zmnVar.bvs(), f);
    }

    public int bvs() {
        return zn(zn(), btk());
    }
}
