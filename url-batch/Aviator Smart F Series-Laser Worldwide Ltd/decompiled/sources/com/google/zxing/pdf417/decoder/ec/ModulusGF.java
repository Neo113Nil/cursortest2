package com.google.zxing.pdf417.decoder.ec;

import com.google.zxing.pdf417.PDF417Common;

/* loaded from: classes4.dex */
public final class ModulusGF {
    public static final ModulusGF PDF417_GF = new ModulusGF(PDF417Common.NUMBER_OF_CODEWORDS, 3);
    private final int[] expTable;
    private final int[] logTable;
    private final int modulus;
    private final ModulusPoly one;
    private final ModulusPoly zero;

    private ModulusGF(int i8, int i9) {
        this.modulus = i8;
        this.expTable = new int[i8];
        this.logTable = new int[i8];
        int i10 = 1;
        for (int i11 = 0; i11 < i8; i11++) {
            this.expTable[i11] = i10;
            i10 = (i10 * i9) % i8;
        }
        for (int i12 = 0; i12 < i8 - 1; i12++) {
            this.logTable[this.expTable[i12]] = i12;
        }
        this.zero = new ModulusPoly(this, new int[]{0});
        this.one = new ModulusPoly(this, new int[]{1});
    }

    int add(int i8, int i9) {
        return (i8 + i9) % this.modulus;
    }

    ModulusPoly buildMonomial(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 == 0) {
            return this.zero;
        }
        int[] iArr = new int[i8 + 1];
        iArr[0] = i9;
        return new ModulusPoly(this, iArr);
    }

    int exp(int i8) {
        return this.expTable[i8];
    }

    ModulusPoly getOne() {
        return this.one;
    }

    int getSize() {
        return this.modulus;
    }

    ModulusPoly getZero() {
        return this.zero;
    }

    int inverse(int i8) {
        if (i8 != 0) {
            return this.expTable[(this.modulus - this.logTable[i8]) - 1];
        }
        throw new ArithmeticException();
    }

    int log(int i8) {
        if (i8 != 0) {
            return this.logTable[i8];
        }
        throw new IllegalArgumentException();
    }

    int multiply(int i8, int i9) {
        if (i8 == 0 || i9 == 0) {
            return 0;
        }
        int[] iArr = this.expTable;
        int[] iArr2 = this.logTable;
        return iArr[(iArr2[i8] + iArr2[i9]) % (this.modulus - 1)];
    }

    int subtract(int i8, int i9) {
        int i10 = this.modulus;
        return ((i8 + i10) - i9) % i10;
    }
}
