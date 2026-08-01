package com.bytedance.adsdk.lottie.Jd;

/* compiled from: FileExtension.java */
/* loaded from: classes.dex */
public enum vG {
    JSON(".json"),
    ZIP(".zip");

    public final String vG;

    vG(String str) {
        this.vG = str;
    }

    public String pvs() {
        return ".temp" + this.vG;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.vG;
    }
}
