package com.bytedance.adsdk.lottie.vG.pvs;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatablePathValue.java */
/* loaded from: classes.dex */
public class NB implements Ju<PointF, PointF> {
    private final List<com.bytedance.adsdk.lottie.yiw.pvs<PointF>> pvs;

    public NB(List<com.bytedance.adsdk.lottie.yiw.pvs<PointF>> list) {
        this.pvs = list;
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public List<com.bytedance.adsdk.lottie.yiw.pvs<PointF>> vG() {
        return this.pvs;
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public boolean icD() {
        return this.pvs.size() == 1 && this.pvs.get(0).NB();
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs() {
        if (this.pvs.get(0).NB()) {
            return new com.bytedance.adsdk.lottie.pvs.icD.qh(this.pvs);
        }
        return new com.bytedance.adsdk.lottie.pvs.icD.Wyp(this.pvs);
    }
}
