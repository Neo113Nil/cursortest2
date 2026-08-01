package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.PointF;
import java.util.List;

/* compiled from: PointKeyframeAnimation.java */
/* loaded from: classes.dex */
public class qh extends yiw<PointF> {
    private final PointF Jd;

    public qh(List<com.bytedance.adsdk.lottie.yiw.pvs<PointF>> list) {
        super(list);
        this.Jd = new PointF();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public PointF pvs(com.bytedance.adsdk.lottie.yiw.pvs<PointF> pvsVar, float f) {
        return pvs(pvsVar, f, f, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public PointF pvs(com.bytedance.adsdk.lottie.yiw.pvs<PointF> pvsVar, float f, float f2, float f3) {
        if (pvsVar.pvs == null || pvsVar.icD == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = pvsVar.pvs;
        PointF pointF2 = pvsVar.icD;
        if (this.vG != null) {
            pvsVar.yiw.floatValue();
            Jd();
            so();
            throw null;
        }
        this.Jd.set(pointF.x + (f2 * (pointF2.x - pointF.x)), pointF.y + (f3 * (pointF2.y - pointF.y)));
        return this.Jd;
    }
}
