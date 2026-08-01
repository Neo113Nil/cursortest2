package com.bytedance.adsdk.lottie.pvs.icD;

import java.util.List;

/* compiled from: GradientColorKeyframeAnimation.java */
/* loaded from: classes.dex */
public class NB extends yiw<com.bytedance.adsdk.lottie.vG.icD.Jd> {
    private final com.bytedance.adsdk.lottie.vG.icD.Jd Jd;

    public NB(List<com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd>> list) {
        super(list);
        com.bytedance.adsdk.lottie.vG.icD.Jd jd = list.get(0).pvs;
        int vG = jd != null ? jd.vG() : 0;
        this.Jd = new com.bytedance.adsdk.lottie.vG.icD.Jd(new float[vG], new int[vG]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.vG.icD.Jd pvs(com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.vG.icD.Jd> pvsVar, float f) {
        this.Jd.pvs(pvsVar.pvs, pvsVar.icD, f);
        return this.Jd;
    }
}
