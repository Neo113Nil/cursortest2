package com.bytedance.adsdk.lottie.vG.icD;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapePath.java */
/* loaded from: classes.dex */
public class vA implements vG {
    private final boolean Jd;
    private final int icD;
    private final String pvs;
    private final com.bytedance.adsdk.lottie.vG.pvs.so vG;

    public vA(String str, int i, com.bytedance.adsdk.lottie.vG.pvs.so soVar, boolean z) {
        this.pvs = str;
        this.icD = i;
        this.vG = soVar;
        this.Jd = z;
    }

    public String pvs() {
        return this.pvs;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.so icD() {
        return this.vG;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new com.bytedance.adsdk.lottie.pvs.pvs.cR(soVar, pvsVar, this);
    }

    public boolean vG() {
        return this.Jd;
    }

    public String toString() {
        return "ShapePath{name=" + this.pvs + ", index=" + this.icD + AbstractJsonLexerKt.END_OBJ;
    }
}
