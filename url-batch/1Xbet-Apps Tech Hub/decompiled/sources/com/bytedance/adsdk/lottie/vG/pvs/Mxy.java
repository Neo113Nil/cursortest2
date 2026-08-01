package com.bytedance.adsdk.lottie.vG.pvs;

import android.graphics.PointF;
import java.util.List;

/* compiled from: AnimatableSplitDimensionPathValue.java */
/* loaded from: classes.dex */
public class Mxy implements Ju<PointF, PointF> {
    private final icD icD;
    private final icD pvs;

    public Mxy(icD icd, icD icd2) {
        this.pvs = icd;
        this.icD = icd2;
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public List<com.bytedance.adsdk.lottie.yiw.pvs<PointF>> vG() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public boolean icD() {
        return this.pvs.icD() && this.icD.icD();
    }

    @Override // com.bytedance.adsdk.lottie.vG.pvs.Ju
    public com.bytedance.adsdk.lottie.pvs.icD.pvs<PointF, PointF> pvs() {
        return new com.bytedance.adsdk.lottie.pvs.icD.IP(this.pvs.pvs(), this.icD.pvs());
    }
}
