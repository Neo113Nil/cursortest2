package com.bytedance.adsdk.lottie.pvs.icD;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* compiled from: PathKeyframeAnimation.java */
/* loaded from: classes.dex */
public class Wyp extends yiw<PointF> {
    private final PointF Jd;
    private final float[] NB;
    private final PathMeasure sUS;
    private Mxy yiw;

    public Wyp(List<? extends com.bytedance.adsdk.lottie.yiw.pvs<PointF>> list) {
        super(list);
        this.Jd = new PointF();
        this.NB = new float[2];
        this.sUS = new PathMeasure();
    }

    @Override // com.bytedance.adsdk.lottie.pvs.icD.pvs
    /* renamed from: icD, reason: merged with bridge method [inline-methods] */
    public PointF pvs(com.bytedance.adsdk.lottie.yiw.pvs<PointF> pvsVar, float f) {
        Mxy mxy = (Mxy) pvsVar;
        Path icD = mxy.icD();
        if (icD == null) {
            return pvsVar.pvs;
        }
        if (this.vG != null) {
            mxy.yiw.floatValue();
            Jd();
            so();
            throw null;
        }
        if (this.yiw != mxy) {
            this.sUS.setPath(icD, false);
            this.yiw = mxy;
        }
        PathMeasure pathMeasure = this.sUS;
        pathMeasure.getPosTan(f * pathMeasure.getLength(), this.NB, null);
        PointF pointF = this.Jd;
        float[] fArr = this.NB;
        pointF.set(fArr[0], fArr[1]);
        return this.Jd;
    }
}
