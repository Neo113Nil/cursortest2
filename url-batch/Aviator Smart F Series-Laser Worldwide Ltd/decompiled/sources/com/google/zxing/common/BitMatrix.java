package com.google.zxing.common;

import java.util.Arrays;

/* loaded from: classes4.dex */
public final class BitMatrix implements Cloneable {
    private final int[] bits;
    private final int height;
    private final int rowSize;
    private final int width;

    public BitMatrix(int i8) {
        this(i8, i8);
    }

    private String buildToString(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(this.height * (this.width + 1));
        for (int i8 = 0; i8 < this.height; i8++) {
            for (int i9 = 0; i9 < this.width; i9++) {
                sb.append(get(i9, i8) ? str : str2);
            }
            sb.append(str3);
        }
        return sb.toString();
    }

    public static BitMatrix parse(boolean[][] zArr) {
        int length = zArr.length;
        int length2 = zArr[0].length;
        BitMatrix bitMatrix = new BitMatrix(length2, length);
        for (int i8 = 0; i8 < length; i8++) {
            boolean[] zArr2 = zArr[i8];
            for (int i9 = 0; i9 < length2; i9++) {
                if (zArr2[i9]) {
                    bitMatrix.set(i9, i8);
                }
            }
        }
        return bitMatrix;
    }

    public void clear() {
        int length = this.bits.length;
        for (int i8 = 0; i8 < length; i8++) {
            this.bits[i8] = 0;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof BitMatrix)) {
            return false;
        }
        BitMatrix bitMatrix = (BitMatrix) obj;
        return this.width == bitMatrix.width && this.height == bitMatrix.height && this.rowSize == bitMatrix.rowSize && Arrays.equals(this.bits, bitMatrix.bits);
    }

    public void flip(int i8, int i9) {
        int i10 = (i9 * this.rowSize) + (i8 / 32);
        int[] iArr = this.bits;
        iArr[i10] = (1 << (i8 & 31)) ^ iArr[i10];
    }

    public boolean get(int i8, int i9) {
        return ((this.bits[(i9 * this.rowSize) + (i8 / 32)] >>> (i8 & 31)) & 1) != 0;
    }

    public int[] getBottomRightOnBit() {
        int length = this.bits.length - 1;
        while (length >= 0 && this.bits[length] == 0) {
            length--;
        }
        if (length < 0) {
            return null;
        }
        int i8 = this.rowSize;
        int i9 = length / i8;
        int i10 = (length % i8) << 5;
        int i11 = 31;
        while ((this.bits[length] >>> i11) == 0) {
            i11--;
        }
        return new int[]{i10 + i11, i9};
    }

    public int[] getEnclosingRectangle() {
        int i8 = this.width;
        int i9 = this.height;
        int i10 = -1;
        int i11 = -1;
        for (int i12 = 0; i12 < this.height; i12++) {
            int i13 = 0;
            while (true) {
                int i14 = this.rowSize;
                if (i13 < i14) {
                    int i15 = this.bits[(i14 * i12) + i13];
                    if (i15 != 0) {
                        if (i12 < i9) {
                            i9 = i12;
                        }
                        if (i12 > i11) {
                            i11 = i12;
                        }
                        int i16 = i13 << 5;
                        if (i16 < i8) {
                            int i17 = 0;
                            while ((i15 << (31 - i17)) == 0) {
                                i17++;
                            }
                            int i18 = i17 + i16;
                            if (i18 < i8) {
                                i8 = i18;
                            }
                        }
                        if (i16 + 31 > i10) {
                            int i19 = 31;
                            while ((i15 >>> i19) == 0) {
                                i19--;
                            }
                            int i20 = i16 + i19;
                            if (i20 > i10) {
                                i10 = i20;
                            }
                        }
                    }
                    i13++;
                }
            }
        }
        if (i10 < i8 || i11 < i9) {
            return null;
        }
        return new int[]{i8, i9, (i10 - i8) + 1, (i11 - i9) + 1};
    }

    public int getHeight() {
        return this.height;
    }

    public BitArray getRow(int i8, BitArray bitArray) {
        if (bitArray == null || bitArray.getSize() < this.width) {
            bitArray = new BitArray(this.width);
        } else {
            bitArray.clear();
        }
        int i9 = i8 * this.rowSize;
        for (int i10 = 0; i10 < this.rowSize; i10++) {
            bitArray.setBulk(i10 << 5, this.bits[i9 + i10]);
        }
        return bitArray;
    }

    public int getRowSize() {
        return this.rowSize;
    }

    public int[] getTopLeftOnBit() {
        int[] iArr;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            iArr = this.bits;
            if (i9 >= iArr.length || iArr[i9] != 0) {
                break;
            }
            i9++;
        }
        if (i9 == iArr.length) {
            return null;
        }
        int i10 = this.rowSize;
        int i11 = i9 / i10;
        int i12 = (i9 % i10) << 5;
        while ((iArr[i9] << (31 - i8)) == 0) {
            i8++;
        }
        return new int[]{i12 + i8, i11};
    }

    public int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i8 = this.width;
        return (((((((i8 * 31) + i8) * 31) + this.height) * 31) + this.rowSize) * 31) + Arrays.hashCode(this.bits);
    }

    public void rotate180() {
        int width = getWidth();
        int height = getHeight();
        BitArray bitArray = new BitArray(width);
        BitArray bitArray2 = new BitArray(width);
        for (int i8 = 0; i8 < (height + 1) / 2; i8++) {
            bitArray = getRow(i8, bitArray);
            int i9 = (height - 1) - i8;
            bitArray2 = getRow(i9, bitArray2);
            bitArray.reverse();
            bitArray2.reverse();
            setRow(i8, bitArray2);
            setRow(i9, bitArray);
        }
    }

    public void set(int i8, int i9) {
        int i10 = (i9 * this.rowSize) + (i8 / 32);
        int[] iArr = this.bits;
        iArr[i10] = (1 << (i8 & 31)) | iArr[i10];
    }

    public void setRegion(int i8, int i9, int i10, int i11) {
        if (i9 < 0 || i8 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i11 <= 0 || i10 <= 0) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i12 = i10 + i8;
        int i13 = i11 + i9;
        if (i13 > this.height || i12 > this.width) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i9 < i13) {
            int i14 = this.rowSize * i9;
            for (int i15 = i8; i15 < i12; i15++) {
                int[] iArr = this.bits;
                int i16 = (i15 / 32) + i14;
                iArr[i16] = iArr[i16] | (1 << (i15 & 31));
            }
            i9++;
        }
    }

    public void setRow(int i8, BitArray bitArray) {
        int[] bitArray2 = bitArray.getBitArray();
        int[] iArr = this.bits;
        int i9 = this.rowSize;
        System.arraycopy(bitArray2, 0, iArr, i8 * i9, i9);
    }

    public String toString() {
        return toString("X ", "  ");
    }

    public void unset(int i8, int i9) {
        int i10 = (i9 * this.rowSize) + (i8 / 32);
        int[] iArr = this.bits;
        iArr[i10] = (~(1 << (i8 & 31))) & iArr[i10];
    }

    public void xor(BitMatrix bitMatrix) {
        if (this.width != bitMatrix.getWidth() || this.height != bitMatrix.getHeight() || this.rowSize != bitMatrix.getRowSize()) {
            throw new IllegalArgumentException("input matrix dimensions do not match");
        }
        BitArray bitArray = new BitArray(this.width);
        for (int i8 = 0; i8 < this.height; i8++) {
            int i9 = this.rowSize * i8;
            int[] bitArray2 = bitMatrix.getRow(i8, bitArray).getBitArray();
            for (int i10 = 0; i10 < this.rowSize; i10++) {
                int[] iArr = this.bits;
                int i11 = i9 + i10;
                iArr[i11] = iArr[i11] ^ bitArray2[i10];
            }
        }
    }

    public BitMatrix(int i8, int i9) {
        if (i8 <= 0 || i9 <= 0) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.width = i8;
        this.height = i9;
        int i10 = (i8 + 31) / 32;
        this.rowSize = i10;
        this.bits = new int[i10 * i9];
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BitMatrix m164clone() {
        return new BitMatrix(this.width, this.height, this.rowSize, (int[]) this.bits.clone());
    }

    public String toString(String str, String str2) {
        return buildToString(str, str2, "\n");
    }

    @Deprecated
    public String toString(String str, String str2, String str3) {
        return buildToString(str, str2, str3);
    }

    private BitMatrix(int i8, int i9, int i10, int[] iArr) {
        this.width = i8;
        this.height = i9;
        this.rowSize = i10;
        this.bits = iArr;
    }

    public static BitMatrix parse(String str, String str2, String str3) {
        if (str != null) {
            boolean[] zArr = new boolean[str.length()];
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = -1;
            int i12 = 0;
            while (i8 < str.length()) {
                if (str.charAt(i8) == '\n' || str.charAt(i8) == '\r') {
                    if (i9 > i10) {
                        if (i11 == -1) {
                            i11 = i9 - i10;
                        } else if (i9 - i10 != i11) {
                            throw new IllegalArgumentException("row lengths do not match");
                        }
                        i12++;
                        i10 = i9;
                    }
                    i8++;
                } else {
                    if (str.substring(i8, str2.length() + i8).equals(str2)) {
                        i8 += str2.length();
                        zArr[i9] = true;
                    } else if (str.substring(i8, str3.length() + i8).equals(str3)) {
                        i8 += str3.length();
                        zArr[i9] = false;
                    } else {
                        throw new IllegalArgumentException("illegal character encountered: " + str.substring(i8));
                    }
                    i9++;
                }
            }
            if (i9 > i10) {
                if (i11 == -1) {
                    i11 = i9 - i10;
                } else if (i9 - i10 != i11) {
                    throw new IllegalArgumentException("row lengths do not match");
                }
                i12++;
            }
            BitMatrix bitMatrix = new BitMatrix(i11, i12);
            for (int i13 = 0; i13 < i9; i13++) {
                if (zArr[i13]) {
                    bitMatrix.set(i13 % i11, i13 / i11);
                }
            }
            return bitMatrix;
        }
        throw new IllegalArgumentException();
    }
}
