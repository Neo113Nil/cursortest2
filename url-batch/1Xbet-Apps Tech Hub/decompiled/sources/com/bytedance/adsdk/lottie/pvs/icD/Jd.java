package com.bytedance.adsdk.lottie.pvs.icD;

import java.util.List;

/* compiled from: FloatKeyframeAnimation.java */
/* loaded from: classes.dex */
public class Jd extends yiw<Float> {
    public Jd(List<com.bytedance.adsdk.lottie.yiw.pvs<Float>> list) {
        super(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public Float pvs(com.bytedance.adsdk.lottie.yiw.pvs<Float> pvsVar, float f) {
        return Float.valueOf(vG(pvsVar, f));
    }

    float vG(com.bytedance.adsdk.lottie.yiw.pvs<Float> pvsVar, float f) {
        if (pvsVar.pvs == null || pvsVar.icD == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        if (this.vG != null) {
            pvsVar.yiw.floatValue();
            Jd();
            so();
            throw null;
        }
        return com.bytedance.adsdk.lottie.sUS.NB.pvs(pvsVar.sUS(), pvsVar.yiw(), f);
    }

    public float Mxy() {
        return vG(vG(), NB());
    }
}
