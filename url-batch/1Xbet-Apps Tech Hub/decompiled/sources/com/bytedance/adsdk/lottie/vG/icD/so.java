package com.bytedance.adsdk.lottie.vG.icD;

/* compiled from: Mask.java */
/* loaded from: classes.dex */
public class so {
    private final boolean Jd;
    private final com.bytedance.adsdk.lottie.vG.pvs.so icD;
    private final pvs pvs;
    private final com.bytedance.adsdk.lottie.vG.pvs.Jd vG;

    /* compiled from: Mask.java */
    public enum pvs {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public so(pvs pvsVar, com.bytedance.adsdk.lottie.vG.pvs.so soVar, com.bytedance.adsdk.lottie.vG.pvs.Jd jd, boolean z) {
        this.pvs = pvsVar;
        this.icD = soVar;
        this.vG = jd;
        this.Jd = z;
    }

    public pvs pvs() {
        return this.pvs;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.so icD() {
        return this.icD;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Jd vG() {
        return this.vG;
    }

    public boolean Jd() {
        return this.Jd;
    }
}
