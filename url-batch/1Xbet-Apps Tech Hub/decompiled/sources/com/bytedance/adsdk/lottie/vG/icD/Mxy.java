package com.bytedance.adsdk.lottie.vG.icD;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public class Mxy implements vG {
    private final pvs icD;
    private final String pvs;
    private final boolean vG;

    /* compiled from: MergePaths.java */
    public enum pvs {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static pvs pvs(int i) {
            if (i == 1) {
                return MERGE;
            }
            if (i == 2) {
                return ADD;
            }
            if (i == 3) {
                return SUBTRACT;
            }
            if (i == 4) {
                return INTERSECT;
            }
            if (i == 5) {
                return EXCLUDE_INTERSECTIONS;
            }
            return MERGE;
        }
    }

    public Mxy(String str, pvs pvsVar, boolean z) {
        this.pvs = str;
        this.icD = pvsVar;
        this.vG = z;
    }

    public String pvs() {
        return this.pvs;
    }

    public pvs icD() {
        return this.icD;
    }

    public boolean vG() {
        return this.vG;
    }

    @Override // com.bytedance.adsdk.lottie.vG.icD.vG
    public com.bytedance.adsdk.lottie.pvs.pvs.vG pvs(com.bytedance.adsdk.lottie.so soVar, com.bytedance.adsdk.lottie.sUS sus, com.bytedance.adsdk.lottie.vG.vG.pvs pvsVar) {
        if (soVar.pvs()) {
            return new com.bytedance.adsdk.lottie.pvs.pvs.kj(this);
        }
        return null;
    }

    public String toString() {
        return "MergePaths{mode=" + this.icD + AbstractJsonLexerKt.END_OBJ;
    }
}
