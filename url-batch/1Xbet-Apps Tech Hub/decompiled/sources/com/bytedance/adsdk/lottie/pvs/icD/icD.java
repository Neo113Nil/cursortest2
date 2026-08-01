package com.bytedance.adsdk.lottie.pvs.icD;

import java.util.List;

/* compiled from: ColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class icD extends yiw<Integer> {
    public icD(List<com.bytedance.adsdk.lottie.yiw.pvs<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public Integer pvs(com.bytedance.adsdk.lottie.yiw.pvs<Integer> pvsVar, float f) {
        return Integer.valueOf(vG(pvsVar, f));
    }

    public int vG(com.bytedance.adsdk.lottie.yiw.pvs<Integer> pvsVar, float f) {
        if (pvsVar.pvs == null || pvsVar.icD == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.vG != null) {
            pvsVar.yiw.floatValue();
            Jd();
            so();
            throw null;
        }
        return com.bytedance.adsdk.lottie.sUS.icD.pvs(com.bytedance.adsdk.lottie.sUS.NB.icD(f, 0.0f, 1.0f), pvsVar.pvs.intValue(), pvsVar.icD.intValue());
    }

    public int Mxy() {
        return vG(vG(), NB());
    }
}
