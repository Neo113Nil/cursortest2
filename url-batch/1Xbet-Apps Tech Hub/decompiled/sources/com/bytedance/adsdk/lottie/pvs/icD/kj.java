package com.bytedance.adsdk.lottie.pvs.icD;

import java.util.List;

/* compiled from: ScaleKeyframeAnimation.java */
/* loaded from: classes.dex */
public class kj extends yiw<com.bytedance.adsdk.lottie.yiw.vG> {
    private final com.bytedance.adsdk.lottie.yiw.vG Jd;

    public kj(List<com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.yiw.vG>> list) {
        super(list);
        this.Jd = new com.bytedance.adsdk.lottie.yiw.vG();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.lottie.yiw.vG pvs(com.bytedance.adsdk.lottie.yiw.pvs<com.bytedance.adsdk.lottie.yiw.vG> pvsVar, float f) {
        if (pvsVar.pvs == null || pvsVar.icD == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        com.bytedance.adsdk.lottie.yiw.vG vGVar = pvsVar.pvs;
        com.bytedance.adsdk.lottie.yiw.vG vGVar2 = pvsVar.icD;
        if (this.vG != null) {
            pvsVar.yiw.floatValue();
            Jd();
            so();
            throw null;
        }
        this.Jd.pvs(com.bytedance.adsdk.lottie.sUS.NB.pvs(vGVar.pvs(), vGVar2.pvs(), f), com.bytedance.adsdk.lottie.sUS.NB.pvs(vGVar.icD(), vGVar2.icD(), f));
        return this.Jd;
    }
}
