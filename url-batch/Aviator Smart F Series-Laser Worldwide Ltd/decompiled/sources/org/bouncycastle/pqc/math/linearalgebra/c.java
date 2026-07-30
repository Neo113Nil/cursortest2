package org.bouncycastle.pqc.math.linearalgebra;

import java.lang.reflect.Array;
import java.security.SecureRandom;

/* loaded from: classes5.dex */
public class c extends k {
    private int length;
    private int[][] matrix;

    public c(int i8, char c8) {
        this(i8, c8, new SecureRandom());
    }

    private static void addToRow(int[] iArr, int[] iArr2, int i8) {
        for (int length = iArr2.length - 1; length >= i8; length--) {
            iArr2[length] = iArr[length] ^ iArr2[length];
        }
    }

    private void assignRandomLowerTriangularMatrix(int i8, SecureRandom secureRandom) {
        this.numRows = i8;
        this.numColumns = i8;
        int i9 = (i8 + 31) >>> 5;
        this.length = i9;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i9);
        for (int i10 = 0; i10 < this.numRows; i10++) {
            int i11 = i10 >>> 5;
            int i12 = i10 & 31;
            int i13 = 31 - i12;
            int i14 = 1 << i12;
            for (int i15 = 0; i15 < i11; i15++) {
                this.matrix[i10][i15] = secureRandom.nextInt();
            }
            this.matrix[i10][i11] = i14 | (secureRandom.nextInt() >>> i13);
            while (true) {
                i11++;
                if (i11 < this.length) {
                    this.matrix[i10][i11] = 0;
                }
            }
        }
    }

    private void assignRandomRegularMatrix(int i8, SecureRandom secureRandom) {
        this.numRows = i8;
        this.numColumns = i8;
        int i9 = (i8 + 31) >>> 5;
        this.length = i9;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i9);
        c cVar = (c) new c(i8, k.MATRIX_TYPE_RANDOM_LT, secureRandom).rightMultiply(new c(i8, k.MATRIX_TYPE_RANDOM_UT, secureRandom));
        int[] vector = new l(i8, secureRandom).getVector();
        for (int i10 = 0; i10 < i8; i10++) {
            System.arraycopy(cVar.matrix[i10], 0, this.matrix[vector[i10]], 0, this.length);
        }
    }

    private void assignRandomUpperTriangularMatrix(int i8, SecureRandom secureRandom) {
        int i9;
        this.numRows = i8;
        this.numColumns = i8;
        int i10 = (i8 + 31) >>> 5;
        this.length = i10;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i10);
        int i11 = i8 & 31;
        int i12 = i11 == 0 ? -1 : (1 << i11) - 1;
        for (int i13 = 0; i13 < this.numRows; i13++) {
            int i14 = i13 >>> 5;
            int i15 = i13 & 31;
            int i16 = 1 << i15;
            for (int i17 = 0; i17 < i14; i17++) {
                this.matrix[i13][i17] = 0;
            }
            this.matrix[i13][i14] = (secureRandom.nextInt() << i15) | i16;
            while (true) {
                i14++;
                i9 = this.length;
                if (i14 < i9) {
                    this.matrix[i13][i14] = secureRandom.nextInt();
                }
            }
            int[] iArr = this.matrix[i13];
            int i18 = i9 - 1;
            iArr[i18] = iArr[i18] & i12;
        }
    }

    private void assignUnitMatrix(int i8) {
        this.numRows = i8;
        this.numColumns = i8;
        int i9 = (i8 + 31) >>> 5;
        this.length = i9;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i9);
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < this.length; i11++) {
                this.matrix[i10][i11] = 0;
            }
        }
        for (int i12 = 0; i12 < this.numRows; i12++) {
            this.matrix[i12][i12 >>> 5] = 1 << (i12 & 31);
        }
    }

    private void assignZeroMatrix(int i8, int i9) {
        this.numRows = i8;
        this.numColumns = i9;
        int i10 = (i9 + 31) >>> 5;
        this.length = i10;
        this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i10);
        for (int i11 = 0; i11 < this.numRows; i11++) {
            for (int i12 = 0; i12 < this.length; i12++) {
                this.matrix[i11][i12] = 0;
            }
        }
    }

    public static c[] createRandomRegularMatrixAndItsInverse(int i8, SecureRandom secureRandom) {
        c[] cVarArr = new c[2];
        int i9 = (i8 + 31) >> 5;
        c cVar = new c(i8, k.MATRIX_TYPE_RANDOM_LT, secureRandom);
        c cVar2 = new c(i8, k.MATRIX_TYPE_RANDOM_UT, secureRandom);
        c cVar3 = (c) cVar.rightMultiply(cVar2);
        l lVar = new l(i8, secureRandom);
        int[] vector = lVar.getVector();
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i9);
        for (int i10 = 0; i10 < i8; i10++) {
            System.arraycopy(cVar3.matrix[vector[i10]], 0, iArr[i10], 0, i9);
        }
        cVarArr[0] = new c(i8, iArr);
        c cVar4 = new c(i8, 'I');
        int i11 = 0;
        while (i11 < i8) {
            int i12 = i11 >>> 5;
            int i13 = 1 << (i11 & 31);
            int i14 = i11 + 1;
            for (int i15 = i14; i15 < i8; i15++) {
                if ((cVar.matrix[i15][i12] & i13) != 0) {
                    for (int i16 = 0; i16 <= i12; i16++) {
                        int[][] iArr2 = cVar4.matrix;
                        int[] iArr3 = iArr2[i15];
                        iArr3[i16] = iArr3[i16] ^ iArr2[i11][i16];
                    }
                }
            }
            i11 = i14;
        }
        c cVar5 = new c(i8, 'I');
        for (int i17 = i8 - 1; i17 >= 0; i17--) {
            int i18 = i17 >>> 5;
            int i19 = 1 << (i17 & 31);
            for (int i20 = i17 - 1; i20 >= 0; i20--) {
                if ((cVar2.matrix[i20][i18] & i19) != 0) {
                    for (int i21 = i18; i21 < i9; i21++) {
                        int[][] iArr4 = cVar5.matrix;
                        int[] iArr5 = iArr4[i20];
                        iArr5[i21] = iArr4[i17][i21] ^ iArr5[i21];
                    }
                }
            }
        }
        cVarArr[1] = (c) cVar5.rightMultiply(cVar4.rightMultiply(lVar));
        return cVarArr;
    }

    private static void swapRows(int[][] iArr, int i8, int i9) {
        int[] iArr2 = iArr[i8];
        iArr[i8] = iArr[i9];
        iArr[i9] = iArr2;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public k computeInverse() {
        int i8 = this.numRows;
        if (i8 != this.numColumns) {
            throw new ArithmeticException("Matrix is not invertible.");
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, this.length);
        for (int i9 = this.numRows - 1; i9 >= 0; i9--) {
            iArr[i9] = h.clone(this.matrix[i9]);
        }
        int[][] iArr2 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numRows, this.length);
        for (int i10 = this.numRows - 1; i10 >= 0; i10--) {
            iArr2[i10][i10 >> 5] = 1 << (i10 & 31);
        }
        for (int i11 = 0; i11 < this.numRows; i11++) {
            int i12 = i11 >> 5;
            int i13 = 1 << (i11 & 31);
            if ((iArr[i11][i12] & i13) == 0) {
                int i14 = i11 + 1;
                boolean z7 = false;
                while (i14 < this.numRows) {
                    if ((iArr[i14][i12] & i13) != 0) {
                        swapRows(iArr, i11, i14);
                        swapRows(iArr2, i11, i14);
                        i14 = this.numRows;
                        z7 = true;
                    }
                    i14++;
                }
                if (!z7) {
                    throw new ArithmeticException("Matrix is not invertible.");
                }
            }
            for (int i15 = this.numRows - 1; i15 >= 0; i15--) {
                if (i15 != i11) {
                    int[] iArr3 = iArr[i15];
                    if ((iArr3[i12] & i13) != 0) {
                        addToRow(iArr[i11], iArr3, i12);
                        addToRow(iArr2[i11], iArr2[i15], 0);
                    }
                }
            }
        }
        return new c(this.numColumns, iArr2);
    }

    public k computeTranspose() {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, this.numColumns, (this.numRows + 31) >>> 5);
        int i8 = 0;
        while (true) {
            int i9 = this.numRows;
            if (i8 >= i9) {
                return new c(i9, iArr);
            }
            for (int i10 = 0; i10 < this.numColumns; i10++) {
                int i11 = i8 >>> 5;
                int i12 = i8 & 31;
                if (((this.matrix[i8][i10 >>> 5] >>> (i10 & 31)) & 1) == 1) {
                    int[] iArr2 = iArr[i10];
                    iArr2[i11] = (1 << i12) | iArr2[i11];
                }
            }
            i8++;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.numRows != cVar.numRows || this.numColumns != cVar.numColumns || this.length != cVar.length) {
            return false;
        }
        for (int i8 = 0; i8 < this.numRows; i8++) {
            if (!h.equals(this.matrix[i8], cVar.matrix[i8])) {
                return false;
            }
        }
        return true;
    }

    public c extendLeftCompactForm() {
        int i8 = this.numColumns;
        int i9 = this.numRows;
        c cVar = new c(i9, i8 + i9);
        int i10 = this.numRows;
        int i11 = (i10 - 1) + this.numColumns;
        int i12 = i10 - 1;
        while (i12 >= 0) {
            System.arraycopy(this.matrix[i12], 0, cVar.matrix[i12], 0, this.length);
            int[] iArr = cVar.matrix[i12];
            int i13 = i11 >> 5;
            iArr[i13] = iArr[i13] | (1 << (i11 & 31));
            i12--;
            i11--;
        }
        return cVar;
    }

    public c extendRightCompactForm() {
        int i8;
        int i9 = this.numRows;
        c cVar = new c(i9, this.numColumns + i9);
        int i10 = this.numRows;
        int i11 = i10 >> 5;
        int i12 = i10 & 31;
        for (int i13 = i10 - 1; i13 >= 0; i13--) {
            int[] iArr = cVar.matrix[i13];
            int i14 = i13 >> 5;
            iArr[i14] = iArr[i14] | (1 << (i13 & 31));
            int i15 = 0;
            if (i12 != 0) {
                int i16 = i11;
                while (true) {
                    i8 = this.length;
                    if (i15 >= i8 - 1) {
                        break;
                    }
                    int i17 = this.matrix[i13][i15];
                    int[] iArr2 = cVar.matrix[i13];
                    int i18 = i16 + 1;
                    iArr2[i16] = iArr2[i16] | (i17 << i12);
                    iArr2[i18] = iArr2[i18] | (i17 >>> (32 - i12));
                    i15++;
                    i16 = i18;
                }
                int i19 = this.matrix[i13][i8 - 1];
                int[] iArr3 = cVar.matrix[i13];
                int i20 = i16 + 1;
                iArr3[i16] = iArr3[i16] | (i19 << i12);
                if (i20 < cVar.length) {
                    iArr3[i20] = iArr3[i20] | (i19 >>> (32 - i12));
                }
            } else {
                System.arraycopy(this.matrix[i13], 0, iArr, i11, this.length);
            }
        }
        return cVar;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public byte[] getEncoded() {
        int i8 = (this.numColumns + 7) >>> 3;
        int i9 = this.numRows;
        int i10 = 8;
        byte[] bArr = new byte[(i8 * i9) + 8];
        j.I2OSP(i9, bArr, 0);
        j.I2OSP(this.numColumns, bArr, 4);
        int i11 = this.numColumns;
        int i12 = i11 >>> 5;
        int i13 = i11 & 31;
        for (int i14 = 0; i14 < this.numRows; i14++) {
            int i15 = 0;
            while (i15 < i12) {
                j.I2OSP(this.matrix[i14][i15], bArr, i10);
                i15++;
                i10 += 4;
            }
            int i16 = 0;
            while (i16 < i13) {
                bArr[i10] = (byte) ((this.matrix[i14][i12] >>> i16) & 255);
                i16 += 8;
                i10++;
            }
        }
        return bArr;
    }

    public double getHammingWeight() {
        int i8 = this.numColumns & 31;
        int i9 = this.length;
        if (i8 != 0) {
            i9--;
        }
        double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
        double d9 = 0.0d;
        for (int i10 = 0; i10 < this.numRows; i10++) {
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = this.matrix[i10][i11];
                for (int i13 = 0; i13 < 32; i13++) {
                    d8 += (i12 >>> i13) & 1;
                    d9 += 1.0d;
                }
            }
            int i14 = this.matrix[i10][this.length - 1];
            for (int i15 = 0; i15 < i8; i15++) {
                d8 += (i14 >>> i15) & 1;
                d9 += 1.0d;
            }
        }
        return d8 / d9;
    }

    public int[][] getIntArray() {
        return this.matrix;
    }

    public c getLeftSubMatrix() {
        int i8 = this.numColumns;
        int i9 = this.numRows;
        if (i8 <= i9) {
            throw new ArithmeticException("empty submatrix");
        }
        int i10 = (i9 + 31) >> 5;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i9, i10);
        int i11 = this.numRows;
        int i12 = (1 << (i11 & 31)) - 1;
        if (i12 == 0) {
            i12 = -1;
        }
        for (int i13 = i11 - 1; i13 >= 0; i13--) {
            System.arraycopy(this.matrix[i13], 0, iArr[i13], 0, i10);
            int[] iArr2 = iArr[i13];
            int i14 = i10 - 1;
            iArr2[i14] = iArr2[i14] & i12;
        }
        return new c(this.numRows, iArr);
    }

    public int getLength() {
        return this.length;
    }

    public c getRightSubMatrix() {
        int i8;
        int i9 = this.numColumns;
        int i10 = this.numRows;
        if (i9 <= i10) {
            throw new ArithmeticException("empty submatrix");
        }
        int i11 = i10 >> 5;
        int i12 = i10 & 31;
        c cVar = new c(i10, i9 - i10);
        for (int i13 = this.numRows - 1; i13 >= 0; i13--) {
            int i14 = 0;
            if (i12 != 0) {
                int i15 = i11;
                while (true) {
                    i8 = cVar.length;
                    if (i14 >= i8 - 1) {
                        break;
                    }
                    int[] iArr = cVar.matrix[i13];
                    int[] iArr2 = this.matrix[i13];
                    int i16 = i15 + 1;
                    iArr[i14] = (iArr2[i15] >>> i12) | (iArr2[i16] << (32 - i12));
                    i14++;
                    i15 = i16;
                }
                int[] iArr3 = cVar.matrix[i13];
                int[] iArr4 = this.matrix[i13];
                int i17 = i15 + 1;
                iArr3[i8 - 1] = iArr4[i15] >>> i12;
                if (i17 < this.length) {
                    int i18 = i8 - 1;
                    iArr3[i18] = iArr3[i18] | (iArr4[i17] << (32 - i12));
                }
            } else {
                System.arraycopy(this.matrix[i13], i11, cVar.matrix[i13], 0, cVar.length);
            }
        }
        return cVar;
    }

    public int[] getRow(int i8) {
        return this.matrix[i8];
    }

    public int hashCode() {
        int i8 = (((this.numRows * 31) + this.numColumns) * 31) + this.length;
        for (int i9 = 0; i9 < this.numRows; i9++) {
            i8 = (i8 * 31) + org.bouncycastle.util.a.hashCode(this.matrix[i9]);
        }
        return i8;
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public boolean isZero() {
        for (int i8 = 0; i8 < this.numRows; i8++) {
            for (int i9 = 0; i9 < this.length; i9++) {
                if (this.matrix[i8][i9] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public k leftMultiply(l lVar) {
        int[] vector = lVar.getVector();
        int length = vector.length;
        int i8 = this.numRows;
        if (length != i8) {
            throw new ArithmeticException("length mismatch");
        }
        int[][] iArr = new int[i8][];
        for (int i9 = i8 - 1; i9 >= 0; i9--) {
            iArr[i9] = h.clone(this.matrix[vector[i9]]);
        }
        return new c(this.numRows, iArr);
    }

    public q leftMultiplyLeftCompactForm(q qVar) {
        if (!(qVar instanceof d)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (qVar.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((d) qVar).getVecArray();
        int i8 = this.numRows;
        int[] iArr = new int[((this.numColumns + i8) + 31) >>> 5];
        int i9 = i8 >>> 5;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            int i12 = 1;
            do {
                if ((vecArray[i11] & i12) != 0) {
                    for (int i13 = 0; i13 < this.length; i13++) {
                        iArr[i13] = iArr[i13] ^ this.matrix[i10][i13];
                    }
                    int i14 = this.numColumns;
                    int i15 = (i14 + i10) >>> 5;
                    iArr[i15] = (1 << ((i14 + i10) & 31)) | iArr[i15];
                }
                i10++;
                i12 <<= 1;
            } while (i12 != 0);
        }
        int i16 = 1 << (this.numRows & 31);
        for (int i17 = 1; i17 != i16; i17 <<= 1) {
            if ((vecArray[i9] & i17) != 0) {
                for (int i18 = 0; i18 < this.length; i18++) {
                    iArr[i18] = iArr[i18] ^ this.matrix[i10][i18];
                }
                int i19 = this.numColumns;
                int i20 = (i19 + i10) >>> 5;
                iArr[i20] = (1 << ((i19 + i10) & 31)) | iArr[i20];
            }
            i10++;
        }
        return new d(iArr, this.numRows + this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public k rightMultiply(k kVar) {
        if (!(kVar instanceof c)) {
            throw new ArithmeticException("matrix is not defined over GF(2)");
        }
        if (kVar.numRows != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        c cVar = (c) kVar;
        c cVar2 = new c(this.numRows, kVar.numColumns);
        int i8 = this.numColumns & 31;
        int i9 = this.length;
        if (i8 != 0) {
            i9--;
        }
        for (int i10 = 0; i10 < this.numRows; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = this.matrix[i10][i12];
                for (int i14 = 0; i14 < 32; i14++) {
                    if (((1 << i14) & i13) != 0) {
                        for (int i15 = 0; i15 < cVar.length; i15++) {
                            int[] iArr = cVar2.matrix[i10];
                            iArr[i15] = iArr[i15] ^ cVar.matrix[i11][i15];
                        }
                    }
                    i11++;
                }
            }
            int i16 = this.matrix[i10][this.length - 1];
            for (int i17 = 0; i17 < i8; i17++) {
                if (((1 << i17) & i16) != 0) {
                    for (int i18 = 0; i18 < cVar.length; i18++) {
                        int[] iArr2 = cVar2.matrix[i10];
                        iArr2[i18] = iArr2[i18] ^ cVar.matrix[i11][i18];
                    }
                }
                i11++;
            }
        }
        return cVar2;
    }

    public q rightMultiplyRightCompactForm(q qVar) {
        int i8;
        if (!(qVar instanceof d)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (qVar.length != this.numColumns + this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((d) qVar).getVecArray();
        int i9 = this.numRows;
        int[] iArr = new int[(i9 + 31) >>> 5];
        int i10 = i9 >> 5;
        int i11 = i9 & 31;
        int i12 = 0;
        while (true) {
            int i13 = this.numRows;
            if (i12 >= i13) {
                return new d(iArr, i13);
            }
            int i14 = i12 >> 5;
            int i15 = i12 & 31;
            int i16 = (vecArray[i14] >>> i15) & 1;
            int i17 = i10;
            int i18 = 0;
            if (i11 != 0) {
                while (true) {
                    i8 = this.length;
                    if (i18 >= i8 - 1) {
                        break;
                    }
                    int i19 = i17 + 1;
                    i16 ^= ((vecArray[i17] >>> i11) | (vecArray[i19] << (32 - i11))) & this.matrix[i12][i18];
                    i18++;
                    i17 = i19;
                }
                int i20 = i17 + 1;
                int i21 = vecArray[i17] >>> i11;
                if (i20 < vecArray.length) {
                    i21 |= vecArray[i20] << (32 - i11);
                }
                i16 ^= this.matrix[i12][i8 - 1] & i21;
            } else {
                while (i18 < this.length) {
                    i16 ^= vecArray[i17] & this.matrix[i12][i18];
                    i18++;
                    i17++;
                }
            }
            int i22 = 0;
            for (int i23 = 0; i23 < 32; i23++) {
                i22 ^= i16 & 1;
                i16 >>>= 1;
            }
            if (i22 == 1) {
                iArr[i14] = iArr[i14] | (1 << i15);
            }
            i12++;
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public String toString() {
        int i8 = this.numColumns & 31;
        int i9 = this.length;
        if (i8 != 0) {
            i9--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < this.numRows; i10++) {
            stringBuffer.append(i10 + ": ");
            for (int i11 = 0; i11 < i9; i11++) {
                int i12 = this.matrix[i10][i11];
                for (int i13 = 0; i13 < 32; i13++) {
                    if (((i12 >>> i13) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i14 = this.matrix[i10][this.length - 1];
            for (int i15 = 0; i15 < i8; i15++) {
                if (((i14 >>> i15) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }

    public c(int i8, char c8, SecureRandom secureRandom) {
        if (i8 <= 0) {
            throw new ArithmeticException("Size of matrix is non-positive.");
        }
        if (c8 == 'I') {
            assignUnitMatrix(i8);
            return;
        }
        if (c8 == 'L') {
            assignRandomLowerTriangularMatrix(i8, secureRandom);
            return;
        }
        if (c8 == 'R') {
            assignRandomRegularMatrix(i8, secureRandom);
        } else if (c8 == 'U') {
            assignRandomUpperTriangularMatrix(i8, secureRandom);
        } else {
            if (c8 != 'Z') {
                throw new ArithmeticException("Unknown matrix type.");
            }
            assignZeroMatrix(i8, i8);
        }
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public q leftMultiply(q qVar) {
        if (!(qVar instanceof d)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (qVar.length != this.numRows) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((d) qVar).getVecArray();
        int[] iArr = new int[this.length];
        int i8 = this.numRows;
        int i9 = i8 >> 5;
        int i10 = 1 << (i8 & 31);
        int i11 = 0;
        for (int i12 = 0; i12 < i9; i12++) {
            int i13 = 1;
            do {
                if ((vecArray[i12] & i13) != 0) {
                    for (int i14 = 0; i14 < this.length; i14++) {
                        iArr[i14] = iArr[i14] ^ this.matrix[i11][i14];
                    }
                }
                i11++;
                i13 <<= 1;
            } while (i13 != 0);
        }
        for (int i15 = 1; i15 != i10; i15 <<= 1) {
            if ((vecArray[i9] & i15) != 0) {
                for (int i16 = 0; i16 < this.length; i16++) {
                    iArr[i16] = iArr[i16] ^ this.matrix[i11][i16];
                }
            }
            i11++;
        }
        return new d(iArr, this.numColumns);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public k rightMultiply(l lVar) {
        int[] vector = lVar.getVector();
        int length = vector.length;
        int i8 = this.numColumns;
        if (length != i8) {
            throw new ArithmeticException("length mismatch");
        }
        c cVar = new c(this.numRows, i8);
        for (int i9 = this.numColumns - 1; i9 >= 0; i9--) {
            int i10 = i9 >>> 5;
            int i11 = i9 & 31;
            int i12 = vector[i9];
            int i13 = i12 >>> 5;
            int i14 = i12 & 31;
            for (int i15 = this.numRows - 1; i15 >= 0; i15--) {
                int[] iArr = cVar.matrix[i15];
                iArr[i10] = iArr[i10] | (((this.matrix[i15][i13] >>> i14) & 1) << i11);
            }
        }
        return cVar;
    }

    private c(int i8, int i9) {
        if (i9 <= 0 || i8 <= 0) {
            throw new ArithmeticException("size of matrix is non-positive");
        }
        assignZeroMatrix(i8, i9);
    }

    @Override // org.bouncycastle.pqc.math.linearalgebra.k
    public q rightMultiply(q qVar) {
        if (!(qVar instanceof d)) {
            throw new ArithmeticException("vector is not defined over GF(2)");
        }
        if (qVar.length != this.numColumns) {
            throw new ArithmeticException("length mismatch");
        }
        int[] vecArray = ((d) qVar).getVecArray();
        int[] iArr = new int[(this.numRows + 31) >>> 5];
        int i8 = 0;
        while (true) {
            int i9 = this.numRows;
            if (i8 >= i9) {
                return new d(iArr, i9);
            }
            int i10 = 0;
            for (int i11 = 0; i11 < this.length; i11++) {
                i10 ^= this.matrix[i8][i11] & vecArray[i11];
            }
            int i12 = 0;
            for (int i13 = 0; i13 < 32; i13++) {
                i12 ^= (i10 >>> i13) & 1;
            }
            if (i12 == 1) {
                int i14 = i8 >>> 5;
                iArr[i14] = iArr[i14] | (1 << (i8 & 31));
            }
            i8++;
        }
    }

    public c(int i8, int[][] iArr) {
        int[] iArr2 = iArr[0];
        if (iArr2.length != ((i8 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.numColumns = i8;
        this.numRows = iArr.length;
        this.length = iArr2.length;
        int i9 = i8 & 31;
        int i10 = i9 == 0 ? -1 : (1 << i9) - 1;
        for (int i11 = 0; i11 < this.numRows; i11++) {
            int[] iArr3 = iArr[i11];
            int i12 = this.length - 1;
            iArr3[i12] = iArr3[i12] & i10;
        }
        this.matrix = iArr;
    }

    public c(c cVar) {
        this.numColumns = cVar.getNumColumns();
        this.numRows = cVar.getNumRows();
        this.length = cVar.length;
        this.matrix = new int[cVar.matrix.length][];
        int i8 = 0;
        while (true) {
            int[][] iArr = this.matrix;
            if (i8 >= iArr.length) {
                return;
            }
            iArr[i8] = h.clone(cVar.matrix[i8]);
            i8++;
        }
    }

    public c(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.numRows = j.OS2IP(bArr, 0);
        int OS2IP = j.OS2IP(bArr, 4);
        this.numColumns = OS2IP;
        int i8 = this.numRows;
        int i9 = ((OS2IP + 7) >>> 3) * i8;
        if (i8 > 0) {
            int i10 = 8;
            if (i9 == bArr.length - 8) {
                int i11 = (OS2IP + 31) >>> 5;
                this.length = i11;
                this.matrix = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i8, i11);
                int i12 = this.numColumns;
                int i13 = i12 >> 5;
                int i14 = i12 & 31;
                for (int i15 = 0; i15 < this.numRows; i15++) {
                    int i16 = 0;
                    while (i16 < i13) {
                        this.matrix[i15][i16] = j.OS2IP(bArr, i10);
                        i16++;
                        i10 += 4;
                    }
                    int i17 = 0;
                    while (i17 < i14) {
                        int[] iArr = this.matrix[i15];
                        iArr[i13] = ((bArr[i10] & 255) << i17) ^ iArr[i13];
                        i17 += 8;
                        i10++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }
}
