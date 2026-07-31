package com.bytedance.sdk.openadsdk.nqi;

/* loaded from: classes4.dex */
public enum rt {
    NUMERIC(new int[]{10, 12, 14}, 1),
    ALPHANUMERIC(new int[]{9, 11, 13}, 2),
    BYTE(new int[]{8, 16, 16}, 4),
    ECI(new int[]{0, 0, 0}, 7),
    KANJI(new int[]{8, 10, 12}, 8),
    FNC1_FIRST_POSITION(new int[]{0, 0, 0}, 5);

    private final int[] nps;
    private final int zg;

    rt(int[] iArr, int i) {
        this.nps = iArr;
        this.zg = i;
    }

    public int zmn(kw kwVar) {
        int zmn = kwVar.zmn();
        return this.nps[zmn <= 9 ? (char) 0 : zmn <= 26 ? (char) 1 : (char) 2];
    }

    public int zmn() {
        return this.zg;
    }
}
