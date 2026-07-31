package com.bytedance.sdk.openadsdk.nqi;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class fs {
    private int[] fb;
    private int fs;
    private int zmn;
    private int zn;

    public fs(int i, int i2) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.zmn = i;
        this.fs = i2;
        int i3 = (i + 31) / 32;
        this.zn = i3;
        this.fb = new int[i3 * i2];
    }

    public boolean zmn(int i, int i2) {
        return ((this.fb[(i2 * this.zn) + (i / 32)] >>> (i & 31)) & 1) != 0;
    }

    public void zmn(int i, int i2, int i3, int i4) {
        if (i2 < 0 || i < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i4 <= 0 || i3 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i5 = i3 + i;
        int i6 = i4 + i2;
        if (i6 > this.fs || i5 > this.zmn) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i2 < i6) {
            int i7 = this.zn * i2;
            for (int i8 = i; i8 < i5; i8++) {
                int[] iArr = this.fb;
                int i9 = (i8 / 32) + i7;
                iArr[i9] = iArr[i9] | (1 << (i8 & 31));
            }
            i2++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof fs)) {
            return false;
        }
        fs fsVar = (fs) obj;
        return this.zmn == fsVar.zmn && this.fs == fsVar.fs && this.zn == fsVar.zn && Arrays.equals(this.fb, fsVar.fb);
    }

    public int hashCode() {
        int i = this.zmn;
        return (((((((i * 31) + i) * 31) + this.fs) * 31) + this.zn) * 31) + Arrays.hashCode(this.fb);
    }
}
