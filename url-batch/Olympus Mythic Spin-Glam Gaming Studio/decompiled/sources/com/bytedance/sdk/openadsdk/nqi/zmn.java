package com.bytedance.sdk.openadsdk.nqi;

import java.util.Arrays;

/* loaded from: classes12.dex */
public final class zmn {
    private static final int[] zmn = new int[0];
    private int zn = 0;
    private int[] fs = zmn;

    public int zmn() {
        return this.zn;
    }

    public int fs() {
        return (this.zn + 7) / 8;
    }

    private void fs(int i) {
        if (i > this.fs.length * 32) {
            int[] zn = zn((int) Math.ceil(i / 0.75f));
            int[] iArr = this.fs;
            System.arraycopy(iArr, 0, zn, 0, iArr.length);
            this.fs = zn;
        }
    }

    public boolean zmn(int i) {
        return ((1 << (i & 31)) & this.fs[i / 32]) != 0;
    }

    public void zmn(boolean z) {
        fs(this.zn + 1);
        if (z) {
            int[] iArr = this.fs;
            int i = this.zn;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.zn++;
    }

    public void zmn(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        int i3 = this.zn;
        fs(i3 + i2);
        for (int i4 = i2 - 1; i4 >= 0; i4--) {
            if (((1 << i4) & i) != 0) {
                int[] iArr = this.fs;
                int i5 = i3 / 32;
                iArr[i5] = iArr[i5] | (1 << (i3 & 31));
            }
            i3++;
        }
        this.zn = i3;
    }

    public void zmn(zmn zmnVar) {
        int i = zmnVar.zn;
        fs(this.zn + i);
        for (int i2 = 0; i2 < i; i2++) {
            zmn(zmnVar.zmn(i2));
        }
    }

    public void fs(zmn zmnVar) {
        if (this.zn != zmnVar.zn) {
            throw new IllegalArgumentException("Sizes don't match");
        }
        int i = 0;
        while (true) {
            int[] iArr = this.fs;
            if (i >= iArr.length) {
                return;
            }
            iArr[i] = iArr[i] ^ zmnVar.fs[i];
            i++;
        }
    }

    public void zmn(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < 8; i6++) {
                if (zmn(i)) {
                    i5 |= 1 << (7 - i6);
                }
                i++;
            }
            bArr[i2 + i4] = (byte) i5;
        }
    }

    private static int[] zn(int i) {
        return new int[(i + 31) / 32];
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof zmn)) {
            return false;
        }
        zmn zmnVar = (zmn) obj;
        return this.zn == zmnVar.zn && Arrays.equals(this.fs, zmnVar.fs);
    }

    public int hashCode() {
        return (this.zn * 31) + Arrays.hashCode(this.fs);
    }
}
