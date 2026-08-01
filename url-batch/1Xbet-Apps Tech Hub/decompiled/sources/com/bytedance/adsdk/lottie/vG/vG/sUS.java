package com.bytedance.adsdk.lottie.vG.vG;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.bytedance.adsdk.lottie.NB.Wyp;
import com.bytedance.adsdk.lottie.vG.icD.mnm;
import java.util.Collections;

/* compiled from: ShapeLayer.java */
/* loaded from: classes.dex */
public class sUS extends pvs {
    private final icD so;
    private final com.bytedance.adsdk.lottie.pvs.pvs.Jd yiw;

    sUS(com.bytedance.adsdk.lottie.so soVar, Jd jd, icD icd, com.bytedance.adsdk.lottie.sUS sus) {
        super(soVar, jd);
        this.so = icd;
        com.bytedance.adsdk.lottie.pvs.pvs.Jd jd2 = new com.bytedance.adsdk.lottie.pvs.pvs.Jd(soVar, this, new mnm("__container", jd.IP(), false), sus);
        this.yiw = jd2;
        jd2.pvs(Collections.emptyList(), Collections.emptyList());
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    void icD(Canvas canvas, Matrix matrix, int i) {
        this.yiw.pvs(canvas, matrix, i);
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs, com.bytedance.adsdk.lottie.pvs.pvs.NB
    public void pvs(RectF rectF, Matrix matrix, boolean z) {
        super.pvs(rectF, matrix, z);
        this.yiw.pvs(rectF, this.pvs, z);
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    public com.bytedance.adsdk.lottie.vG.icD.pvs sUS() {
        com.bytedance.adsdk.lottie.vG.icD.pvs sUS = super.sUS();
        return sUS != null ? sUS : this.so.sUS();
    }

    @Override // com.bytedance.adsdk.lottie.vG.vG.pvs
    public Wyp yiw() {
        Wyp yiw = super.yiw();
        return yiw != null ? yiw : this.so.yiw();
    }
}
