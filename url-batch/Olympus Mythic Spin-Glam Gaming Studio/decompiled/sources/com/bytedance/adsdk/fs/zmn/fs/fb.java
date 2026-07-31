package com.bytedance.adsdk.fs.zmn.fs;

import java.util.List;

/* loaded from: classes5.dex */
public class fb extends nps<Float> {
    public fb(List<com.bytedance.adsdk.fs.nps.zmn<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.fs.zmn.fs.zmn
    /* renamed from: fs, reason: merged with bridge method [inline-methods] */
    public Float zmn(com.bytedance.adsdk.fs.nps.zmn<Float> zmnVar, float f) {
        return Float.valueOf(zn(zmnVar, f));
    }

    float zn(com.bytedance.adsdk.fs.nps.zmn<Float> zmnVar, float f) {
        if (zmnVar.zmn == null || zmnVar.fs == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.zn != null) {
            zmnVar.nps.floatValue();
            fb();
            zg();
            throw null;
        }
        return com.bytedance.adsdk.fs.hhw.btk.zmn(zmnVar.hhw(), zmnVar.nps(), f);
    }

    public float bvs() {
        return zn(zn(), btk());
    }
}
