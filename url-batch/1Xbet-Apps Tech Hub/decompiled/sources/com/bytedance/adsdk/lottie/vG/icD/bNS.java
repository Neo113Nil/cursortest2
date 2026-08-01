package com.bytedance.adsdk.lottie.vG.icD;

import android.graphics.Path;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapeFill.java */
/* loaded from: classes.dex */
public class bNS implements vG {
    private final com.bytedance.adsdk.lottie.vG.pvs.pvs Jd;
    private final com.bytedance.adsdk.lottie.vG.pvs.Jd NB;
    private final Path.FillType icD;
    private final boolean pvs;
    private final boolean sUS;
    private final String vG;

    public bNS(String str, boolean z, Path.FillType fillType, com.bytedance.adsdk.lottie.vG.pvs.pvs pvsVar, com.bytedance.adsdk.lottie.vG.pvs.Jd jd, boolean z2) {
        this.vG = str;
        this.pvs = z;
        this.icD = fillType;
        this.Jd = pvsVar;
        this.NB = jd;
        this.sUS = z2;
    }

    public String pvs() {
        return this.vG;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.pvs icD() {
        return this.Jd;
    }

    public com.bytedance.adsdk.lottie.vG.pvs.Jd vG() {
        return this.NB;
    }

    public Path.FillType Jd() {
        return this.icD;
    }

    public boolean NB() {
        return this.sUS;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new com.bytedance.adsdk.lottie.pvs.pvs.yiw(soVar, pvsVar, this);
    }

    public String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.pvs + AbstractJsonLexerKt.END_OBJ;
    }
}
