package com.bytedance.adsdk.fs.fb;

/* loaded from: classes3.dex */
public enum zn {
    JSON(".json"),
    ZIP(".zip");

    public final String zn;

    zn(String str) {
        this.zn = str;
    }

    public String zmn() {
        return ".temp" + this.zn;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.zn;
    }
}
