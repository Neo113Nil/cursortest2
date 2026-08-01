package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.PointF;
import java.util.Collections;

/* compiled from: SplitDimensionPathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class IP extends pvs<PointF, PointF> {
    protected com.bytedance.adsdk.lottie.yiw.icD<Float> Jd;
    private final pvs<Float, Float> Mxy;
    protected com.bytedance.adsdk.lottie.yiw.icD<Float> NB;
    private final PointF sUS;
    private final pvs<Float, Float> so;
    private final PointF yiw;

    public IP(pvs<Float, Float> pvsVar, pvs<Float, Float> pvsVar2) {
        super(Collections.emptyList());
        this.sUS = new PointF();
        this.yiw = new PointF();
        this.so = pvsVar;
        this.Mxy = pvsVar2;
        pvs(so());
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    public void pvs(float f) {
        this.so.pvs(f);
        this.Mxy.pvs(f);
        this.sUS.set(this.so.yiw().floatValue(), this.Mxy.yiw().floatValue());
        for (int i = 0; i < this.pvs.size(); i++) {
            this.pvs.get(i).pvs();
        }
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: Mxy, reason: merged with bridge method [inline-methods] */
    public PointF yiw() {
        return pvs(null, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public PointF pvs(com.bytedance.adsdk.lottie.yiw.pvs<PointF> pvsVar, float f) {
        com.bytedance.adsdk.lottie.yiw.pvs<Float> vG;
        com.bytedance.adsdk.lottie.yiw.pvs<Float> vG2;
        if (this.Jd != null && (vG2 = this.so.vG()) != null) {
            this.so.NB();
            Float f2 = vG2.yiw;
            if (f2 == null) {
                throw null;
            }
            f2.floatValue();
            throw null;
        }
        if (this.NB != null && (vG = this.Mxy.vG()) != null) {
            this.Mxy.NB();
            Float f3 = vG.yiw;
            if (f3 == null) {
                throw null;
            }
            f3.floatValue();
            throw null;
        }
        this.yiw.set(this.sUS.x, 0.0f);
        PointF pointF = this.yiw;
        pointF.set(pointF.x, this.sUS.y);
        return this.yiw;
    }
}
