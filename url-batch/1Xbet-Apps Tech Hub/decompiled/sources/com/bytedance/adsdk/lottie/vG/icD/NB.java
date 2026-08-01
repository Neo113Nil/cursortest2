package com.bytedance.adsdk.lottie.vG.icD;

import android.graphics.Path;

/* compiled from: GradientFill.java */
/* loaded from: classes.dex */
public class NB implements vG {
    private final com.bytedance.adsdk.lottie.vG.pvs.Jd Jd;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD Mxy;
    private final com.bytedance.adsdk.lottie.vG.pvs.sUS NB;
    private final boolean Wyp;
    private final Path.FillType icD;
    private final yiw pvs;
    private final com.bytedance.adsdk.lottie.vG.pvs.sUS sUS;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD so;
    private final com.bytedance.adsdk.lottie.vG.pvs.vG vG;
    private final String yiw;

    public NB(String str, yiw yiwVar, Path.FillType fillType, com.bytedance.adsdk.lottie.vG.pvs.vG vGVar, com.bytedance.adsdk.lottie.vG.pvs.Jd jd, com.bytedance.adsdk.lottie.vG.pvs.sUS sus, com.bytedance.adsdk.lottie.vG.pvs.sUS sus2, com.bytedance.adsdk.lottie.vG.pvs.icD icd, com.bytedance.adsdk.lottie.vG.pvs.icD icd2, boolean z) {
        this.pvs = yiwVar;
        this.icD = fillType;
        this.vG = vGVar;
        this.Jd = jd;
        this.NB = sus;
        this.sUS = sus2;
        this.yiw = str;
        this.so = icd;
        this.Mxy = icd2;
        this.Wyp = z;
    }

    public String pvs() {
        return this.yiw;
    }

    public yiw icD() {
        return this.pvs;
    }

    public Path.FillType vG() {
        return this.icD;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.vG Jd() {
        return this.vG;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Jd NB() {
        return this.Jd;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.sUS sUS() {
        return this.NB;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.sUS yiw() {
        return this.sUS;
    }

    public boolean so() {
        return this.Wyp;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new com.bytedance.adsdk.lottie.pvs.pvs.so(soVar, sus, pvsVar, this);
    }
}
