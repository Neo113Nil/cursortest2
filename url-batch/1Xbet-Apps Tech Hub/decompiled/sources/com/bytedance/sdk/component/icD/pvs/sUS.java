package com.bytedance.sdk.component.icD.pvs;

/* compiled from: Headers.java */
/* loaded from: classes.dex */
public final class sUS {
    private final String[] pvs;

    public sUS(String[] strArr) {
        this.pvs = strArr;
    }

    public int pvs() {
        return this.pvs.length / 2;
    }

    public String pvs(int i) {
        return this.pvs[i * 2];
    }

    public String icD(int i) {
        return this.pvs[(i * 2) + 1];
    }
}
