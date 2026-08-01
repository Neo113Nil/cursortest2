package com.bytedance.adsdk.lottie.vG.pvs;

import java.util.Arrays;
import java.util.List;

/* compiled from: AnimatableGradientColorValue.java */
/* loaded from: classes.dex */
public class vG extends IP<com.bytedance.adsdk.lottie.vG.icD.Jd, com.bytedance.adsdk.lottie.vG.icD.Jd> {
    @Override // com.bytedance.adsdk.lottie.vG.pvs.IP, com.bytedance.adsdk.lottie.vG.pvs.Ju
    public /* bridge */ /* synthetic */ boolean icD() {
        return super.icD();
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.IP
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.IP, com.bytedance.adsdk.lottie.vG.pvs.Ju
    public /* bridge */ /* synthetic */ List vG() {
        return super.vG();
    }

    public vG(List<com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd>> list) {
        super(pvs(list));
    }

    private static List<com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd>> pvs(List<com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, pvs(list.get(i)));
        }
        return list;
    }

    private static com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd> pvs(com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd> pvsVar) {
        com.bytedance.adsdk.lottie.vG.icD.Jd jd = pvsVar.pvs;
        com.bytedance.adsdk.lottie.vG.icD.Jd jd2 = pvsVar.icD;
        if (jd == null || jd2 == null || jd.pvs().length == jd2.pvs().length) {
            return pvsVar;
        }
        float[] pvs = pvs(jd.pvs(), jd2.pvs());
        return pvsVar.pvs(jd.pvs(pvs), jd2.pvs(pvs));
    }

    static float[] pvs(float[] fArr, float[] fArr2) {
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

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public com.bytedance.adsdk.lottie.pvs.icD.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd, com.bytedance.adsdk.lottie.vG.icD.Jd> pvs() {
        return new com.bytedance.adsdk.lottie.pvs.icD.NB(this.pvs);
    }
}
