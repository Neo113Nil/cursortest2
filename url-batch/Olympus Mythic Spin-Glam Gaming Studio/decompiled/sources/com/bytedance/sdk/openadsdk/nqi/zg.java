package com.bytedance.sdk.openadsdk.nqi;

/* loaded from: classes4.dex */
public enum zg {
    L(1),
    M(0),
    Q(3),
    H(2);

    private static final zg[] btk;
    private final int hhw;

    static {
        zg zgVar = L;
        zg zgVar2 = M;
        zg zgVar3 = Q;
        btk = new zg[]{zgVar2, zgVar, H, zgVar3};
    }

    zg(int i) {
        this.hhw = i;
    }

    public int zmn() {
        return this.hhw;
    }
}
