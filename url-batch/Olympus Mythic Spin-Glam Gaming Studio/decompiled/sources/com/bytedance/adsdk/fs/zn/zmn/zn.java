package com.bytedance.adsdk.fs.zn.zmn;

import java.util.Arrays;
import java.util.List;

/* loaded from: classes12.dex */
public class zn extends rt<com.bytedance.adsdk.fs.zn.fs.fb, com.bytedance.adsdk.fs.zn.fs.fb> {
    @Override // com.bytedance.adsdk.fs.zn.zmn.rt, com.bytedance.adsdk.fs.zn.zmn.mw
    public /* bridge */ /* synthetic */ boolean fs() {
        return super.fs();
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.rt
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.rt, com.bytedance.adsdk.fs.zn.zmn.mw
    public /* bridge */ /* synthetic */ List zn() {
        return super.zn();
    }

    public zn(List<com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.fb>> list) {
        super(zmn(list));
    }

    private static List<com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.fb>> zmn(List<com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.fb>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, zmn(list.get(i)));
        }
        return list;
    }

    private static com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.fb> zmn(com.bytedance.adsdk.fs.nps.zmn<com.bytedance.adsdk.fs.zn.fs.fb> zmnVar) {
        com.bytedance.adsdk.fs.zn.fs.fb fbVar = zmnVar.zmn;
        com.bytedance.adsdk.fs.zn.fs.fb fbVar2 = zmnVar.fs;
        if (fbVar == null || fbVar2 == null || fbVar.zmn().length == fbVar2.zmn().length) {
            return zmnVar;
        }
        float[] zmn = zmn(fbVar.zmn(), fbVar2.zmn());
        return zmnVar.zmn(fbVar.zmn(zmn), fbVar2.zmn(zmn));
    }

    static float[] zmn(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.fs.zn.zmn.mw
    public com.bytedance.adsdk.fs.zmn.fs.zmn<com.bytedance.adsdk.fs.zn.fs.fb, com.bytedance.adsdk.fs.zn.fs.fb> zmn() {
        return new com.bytedance.adsdk.fs.zmn.fs.btk(this.zmn);
    }
}
