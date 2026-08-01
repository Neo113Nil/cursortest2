package com.bytedance.adsdk.lottie.vG.icD;

import android.graphics.PointF;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: RectangleShape.java */
/* loaded from: classes.dex */
public class qh implements vG {
    private final com.bytedance.adsdk.lottie.vG.pvs.icD Jd;
    private final boolean NB;
    private final com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> icD;
    private final String pvs;
    private final com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> vG;

    public qh(String str, com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju, com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju2, com.bytedance.adsdk.lottie.vG.pvs.icD icd, boolean z) {
        this.pvs = str;
        this.icD = ju;
        this.vG = ju2;
        this.Jd = icd;
        this.NB = z;
    }

    public String pvs() {
        return this.pvs;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD icD() {
        return this.Jd;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> vG() {
        return this.vG;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> Jd() {
        return this.icD;
    }

    public boolean NB() {
        return this.NB;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new com.bytedance.adsdk.lottie.pvs.pvs.bNS(soVar, pvsVar, this);
    }

    public String toString() {
        return "RectangleShape{position=" + this.icD + ", size=" + this.vG + AbstractJsonLexerKt.END_OBJ;
    }
}
