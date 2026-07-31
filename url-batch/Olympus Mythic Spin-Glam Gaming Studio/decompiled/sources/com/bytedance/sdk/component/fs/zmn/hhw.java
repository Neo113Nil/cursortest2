package com.bytedance.sdk.component.fs.zmn;

/* loaded from: classes15.dex */
public final class hhw {
    private final String[] zmn;

    public hhw(String[] strArr) {
        this.zmn = strArr;
    }

    public int zmn() {
        return this.zmn.length / 2;
    }

    public String zmn(int i) {
        return this.zmn[i * 2];
    }

    public String fs(int i) {
        return this.zmn[(i * 2) + 1];
    }
}
