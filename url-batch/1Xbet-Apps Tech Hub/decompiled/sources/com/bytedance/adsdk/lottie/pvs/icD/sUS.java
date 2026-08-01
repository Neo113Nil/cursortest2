package com.bytedance.adsdk.lottie.pvs.icD;

import java.util.List;

/* compiled from: IntegerKeyframeAnimation.java */
/* loaded from: classes.dex */
public class sUS extends yiw<Integer> {
    public sUS(List<com.bytedance.adsdk.lottie.yiw.pvs<Integer>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public Integer pvs(com.bytedance.adsdk.lottie.yiw.pvs<Integer> pvsVar, float f) {
        return Integer.valueOf(vG(pvsVar, f));
    }

    int vG(com.bytedance.adsdk.lottie.yiw.pvs<Integer> pvsVar, float f) {
        if (pvsVar.pvs == null || pvsVar.icD == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.vG != null) {
            pvsVar.yiw.floatValue();
            Jd();
            so();
            throw null;
        }
        return com.bytedance.adsdk.lottie.sUS.NB.pvs(pvsVar.so(), pvsVar.Mxy(), f);
    }

    public int Mxy() {
        return vG(vG(), NB());
    }
}
