package com.bytedance.adsdk.lottie.vG.icD;

import android.graphics.PointF;

/* compiled from: CircleShape.java */
/* loaded from: classes.dex */
public class icD implements vG {
    private final boolean Jd;
    private final boolean NB;
    private final com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> icD;
    private final String pvs;
    private final com.bytedance.adsdk.lottie.vG.pvs.sUS vG;

    public icD(String str, com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju, com.bytedance.adsdk.lottie.vG.pvs.sUS sus, boolean z, boolean z2) {
        this.pvs = str;
        this.icD = ju;
        this.vG = sus;
        this.Jd = z;
        this.NB = z2;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new com.bytedance.adsdk.lottie.pvs.pvs.sUS(soVar, pvsVar, this);
    }

    public String pvs() {
        return this.pvs;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> icD() {
        return this.icD;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.sUS vG() {
        return this.vG;
    }

    public boolean Jd() {
        return this.Jd;
    }

    public boolean NB() {
        return this.NB;
    }
}
