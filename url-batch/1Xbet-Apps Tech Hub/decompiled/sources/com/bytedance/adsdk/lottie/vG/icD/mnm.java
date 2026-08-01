package com.bytedance.adsdk.lottie.vG.icD;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ShapeGroup.java */
/* loaded from: classes.dex */
public class mnm implements vG {
    private final List<vG> icD;
    private final String pvs;
    private final boolean vG;

    public mnm(String str, List<vG> list, boolean z) {
        this.pvs = str;
        this.icD = list;
        this.vG = z;
    }

    public String pvs() {
        return this.pvs;
    }

    public List<vG> icD() {
        return this.icD;
    }

    public boolean vG() {
        return this.vG;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        return new com.bytedance.adsdk.lottie.pvs.pvs.Jd(soVar, pvsVar, this, sus);
    }

    public String toString() {
        return "ShapeGroup{name='" + this.pvs + "' Shapes: " + Arrays.toString(this.icD.toArray()) + AbstractJsonLexerKt.END_OBJ;
    }
}
