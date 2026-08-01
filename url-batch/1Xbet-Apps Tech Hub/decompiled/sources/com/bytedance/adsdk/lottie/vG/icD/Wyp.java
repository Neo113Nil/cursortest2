package com.bytedance.adsdk.lottie.vG.icD;

import android.graphics.PointF;

/* compiled from: PolystarShape.java */
/* loaded from: classes.dex */
public class Wyp implements vG {
    private final com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> Jd;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD Mxy;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD NB;
    private final boolean Wyp;
    private final pvs icD;
    private final String pvs;
    private final boolean qh;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD sUS;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD so;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD vG;
    private final com.bytedance.adsdk.lottie.vG.pvs.icD yiw;

    /* compiled from: PolystarShape.java */
    public enum pvs {
        STAR(1),
        POLYGON(2);

        private final int vG;

        pvs(int i) {
            this.vG = i;
        }

        public static pvs pvs(int i) {
            for (pvs pvsVar : values()) {
                if (pvsVar.vG == i) {
                    return pvsVar;
                }
            }
            return null;
        }
    }

    public Wyp(String str, pvs pvsVar, com.bytedance.adsdk.lottie.vG.pvs.icD icd, com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> ju, com.bytedance.adsdk.lottie.vG.pvs.icD icd2, com.bytedance.adsdk.lottie.vG.pvs.icD icd3, com.bytedance.adsdk.lottie.vG.pvs.icD icd4, com.bytedance.adsdk.lottie.vG.pvs.icD icd5, com.bytedance.adsdk.lottie.vG.pvs.icD icd6, boolean z, boolean z2) {
        this.pvs = str;
        this.icD = pvsVar;
        this.vG = icd;
        this.Jd = ju;
        this.NB = icd2;
        this.sUS = icd3;
        this.yiw = icd4;
        this.so = icd5;
        this.Mxy = icd6;
        this.Wyp = z;
        this.qh = z2;
    }

    public String pvs() {
        return this.pvs;
    }

    public pvs icD() {
        return this.icD;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD vG() {
        return this.vG;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Ju<PointF, PointF> Jd() {
        return this.Jd;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD NB() {
        return this.NB;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD sUS() {
        return this.sUS;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD yiw() {
        return this.yiw;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD so() {
        return this.so;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.icD Mxy() {
        return this.Mxy;
    }

    public boolean Wyp() {
        return this.Wyp;
    }

    public boolean qh() {
        return this.qh;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new com.bytedance.adsdk.lottie.pvs.pvs.IP(soVar, pvsVar, this);
    }
}
