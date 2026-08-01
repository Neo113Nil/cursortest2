package com.bytedance.adsdk.lottie.vG.icD;

import com.bytedance.adsdk.lottie.pvs.pvs.rCZ;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public class zM implements vG {
    private final com.bytedance.adsdk.lottie.vG.pvs.icD Jd;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD NB;
    private final pvs icD;
    private final String pvs;
    private final boolean sUS;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD vG;

    /* compiled from: ShapeTrimPath.java */
    public enum pvs {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static pvs pvs(int i) {
            if (i == 1) {
                return SIMULTANEOUSLY;
            }
            if (i == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
        }
    }

    public zM(String str, pvs pvsVar, com.bytedance.adsdk.lottie.vG.pvs.icD icd, com.bytedance.adsdk.lottie.vG.pvs.icD icd2, com.bytedance.adsdk.lottie.vG.pvs.icD icd3, boolean z) {
        this.pvs = str;
        this.icD = pvsVar;
        this.vG = icd;
        this.Jd = icd2;
        this.NB = icd3;
        this.sUS = z;
    }

    public String pvs() {
        return this.pvs;
    }

    public pvs icD() {
        return this.icD;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD vG() {
        return this.Jd;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD Jd() {
        return this.vG;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD NB() {
        return this.NB;
    }

    public boolean sUS() {
        return this.sUS;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new rCZ(pvsVar, this);
    }

    public String toString() {
        return "Trim Path: {start: " + this.vG + ", end: " + this.Jd + ", offset: " + this.NB + "}";
    }
}
