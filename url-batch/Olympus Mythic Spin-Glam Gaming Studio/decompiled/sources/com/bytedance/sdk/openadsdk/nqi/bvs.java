package com.bytedance.sdk.openadsdk.nqi;

/* loaded from: classes4.dex */
public final class bvs {
    public static final bvs zmn = new bvs(285, 256, 0);
    private final int btk;
    private final iv fb;
    private final int[] fs;
    private final int hhw;
    private final int[] zn;

    static int fs(int i, int i2) {
        return i ^ i2;
    }

    public bvs(int i, int i2, int i3) {
        this.btk = i2;
        this.hhw = i3;
        this.fs = new int[i2];
        this.zn = new int[i2];
        int i4 = 1;
        for (int i5 = 0; i5 < i2; i5++) {
            this.fs[i5] = i4;
            i4 *= 2;
            if (i4 >= i2) {
                i4 = (i4 ^ i) & (i2 - 1);
            }
        }
        for (int i6 = 0; i6 < i2 - 1; i6++) {
            this.zn[this.fs[i6]] = i6;
        }
        this.fb = new iv(this, new int[]{0});
    }

    iv zmn() {
        return this.fb;
    }

    iv zmn(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 == 0) {
            return this.fb;
        }
        int[] iArr = new int[i + 1];
        iArr[0] = i2;
        return new iv(this, iArr);
    }

    int zmn(int i) {
        return this.fs[i];
    }

    int fs(int i) {
        if (i == 0) {
            throw new ArithmeticException();
        }
        return this.fs[(this.btk - this.zn[i]) - 1];
    }

    int zn(int i, int i2) {
        if (i == 0 || i2 == 0) {
            return 0;
        }
        int[] iArr = this.fs;
        int[] iArr2 = this.zn;
        return iArr[(iArr2[i] + iArr2[i2]) % (this.btk - 1)];
    }

    public int fs() {
        return this.hhw;
    }
}
