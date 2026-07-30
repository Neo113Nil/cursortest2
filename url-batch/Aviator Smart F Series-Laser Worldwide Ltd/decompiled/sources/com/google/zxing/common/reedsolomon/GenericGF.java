package com.google.zxing.common.reedsolomon;

import com.android.mltcode.paycertification.utils.Constant;
import com.realsil.sdk.dfu.DfuException;

/* loaded from: classes4.dex */
public final class GenericGF {
    public static final GenericGF AZTEC_DATA_6;
    public static final GenericGF AZTEC_DATA_8;
    public static final GenericGF AZTEC_PARAM;
    public static final GenericGF DATA_MATRIX_FIELD_256;
    public static final GenericGF MAXICODE_FIELD_64;
    public static final GenericGF QR_CODE_FIELD_256;
    private final int[] expTable;
    private final int generatorBase;
    private final int[] logTable;
    private final GenericGFPoly one;
    private final int primitive;
    private final int size;
    private final GenericGFPoly zero;
    public static final GenericGF AZTEC_DATA_12 = new GenericGF(Constant.RESULT_CODE_4201, 4096, 1);
    public static final GenericGF AZTEC_DATA_10 = new GenericGF(1033, 1024, 1);

    static {
        GenericGF genericGF = new GenericGF(67, 64, 1);
        AZTEC_DATA_6 = genericGF;
        AZTEC_PARAM = new GenericGF(19, 16, 1);
        QR_CODE_FIELD_256 = new GenericGF(DfuException.ERROR_DFU_PUB_KEYS_CONFLICT, 256, 0);
        GenericGF genericGF2 = new GenericGF(301, 256, 1);
        DATA_MATRIX_FIELD_256 = genericGF2;
        AZTEC_DATA_8 = genericGF2;
        MAXICODE_FIELD_64 = genericGF;
    }

    public GenericGF(int i8, int i9, int i10) {
        this.primitive = i8;
        this.size = i9;
        this.generatorBase = i10;
        this.expTable = new int[i9];
        this.logTable = new int[i9];
        int i11 = 1;
        for (int i12 = 0; i12 < i9; i12++) {
            this.expTable[i12] = i11;
            i11 <<= 1;
            if (i11 >= i9) {
                i11 = (i11 ^ i8) & (i9 - 1);
            }
        }
        for (int i13 = 0; i13 < i9 - 1; i13++) {
            this.logTable[this.expTable[i13]] = i13;
        }
        this.zero = new GenericGFPoly(this, new int[]{0});
        this.one = new GenericGFPoly(this, new int[]{1});
    }

    static int addOrSubtract(int i8, int i9) {
        return i8 ^ i9;
    }

    GenericGFPoly buildMonomial(int i8, int i9) {
        if (i8 < 0) {
            throw new IllegalArgumentException();
        }
        if (i9 == 0) {
            return this.zero;
        }
        int[] iArr = new int[i8 + 1];
        iArr[0] = i9;
        return new GenericGFPoly(this, iArr);
    }

    int exp(int i8) {
        return this.expTable[i8];
    }

    public int getGeneratorBase() {
        return this.generatorBase;
    }

    GenericGFPoly getOne() {
        return this.one;
    }

    public int getSize() {
        return this.size;
    }

    GenericGFPoly getZero() {
        return this.zero;
    }

    int inverse(int i8) {
        if (i8 != 0) {
            return this.expTable[(this.size - this.logTable[i8]) - 1];
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
        return iArr[(iArr2[i8] + iArr2[i9]) % (this.size - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.primitive) + ',' + this.size + ')';
    }
}
