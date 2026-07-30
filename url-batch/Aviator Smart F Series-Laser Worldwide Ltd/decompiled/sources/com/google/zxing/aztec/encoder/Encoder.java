package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.reedsolomon.GenericGF;
import com.google.zxing.common.reedsolomon.ReedSolomonEncoder;

/* loaded from: classes4.dex */
public final class Encoder {
    public static final int DEFAULT_AZTEC_LAYERS = 0;
    public static final int DEFAULT_EC_PERCENT = 33;
    private static final int MAX_NB_BITS = 32;
    private static final int MAX_NB_BITS_COMPACT = 4;
    private static final int[] WORD_SIZE = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private Encoder() {
    }

    private static int[] bitsToWords(BitArray bitArray, int i8, int i9) {
        int[] iArr = new int[i9];
        int size = bitArray.getSize() / i8;
        for (int i10 = 0; i10 < size; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 |= bitArray.get((i10 * i8) + i12) ? 1 << ((i8 - i12) - 1) : 0;
            }
            iArr[i10] = i11;
        }
        return iArr;
    }

    private static void drawBullsEye(BitMatrix bitMatrix, int i8, int i9) {
        for (int i10 = 0; i10 < i9; i10 += 2) {
            int i11 = i8 - i10;
            int i12 = i11;
            while (true) {
                int i13 = i8 + i10;
                if (i12 <= i13) {
                    bitMatrix.set(i12, i11);
                    bitMatrix.set(i12, i13);
                    bitMatrix.set(i11, i12);
                    bitMatrix.set(i13, i12);
                    i12++;
                }
            }
        }
        int i14 = i8 - i9;
        bitMatrix.set(i14, i14);
        int i15 = i14 + 1;
        bitMatrix.set(i15, i14);
        bitMatrix.set(i14, i15);
        int i16 = i8 + i9;
        bitMatrix.set(i16, i14);
        bitMatrix.set(i16, i15);
        bitMatrix.set(i16, i16 - 1);
    }

    private static void drawModeMessage(BitMatrix bitMatrix, boolean z7, int i8, BitArray bitArray) {
        int i9 = i8 / 2;
        int i10 = 0;
        if (z7) {
            while (i10 < 7) {
                int i11 = (i9 - 3) + i10;
                if (bitArray.get(i10)) {
                    bitMatrix.set(i11, i9 - 5);
                }
                if (bitArray.get(i10 + 7)) {
                    bitMatrix.set(i9 + 5, i11);
                }
                if (bitArray.get(20 - i10)) {
                    bitMatrix.set(i11, i9 + 5);
                }
                if (bitArray.get(27 - i10)) {
                    bitMatrix.set(i9 - 5, i11);
                }
                i10++;
            }
            return;
        }
        while (i10 < 10) {
            int i12 = (i9 - 5) + i10 + (i10 / 5);
            if (bitArray.get(i10)) {
                bitMatrix.set(i12, i9 - 7);
            }
            if (bitArray.get(i10 + 10)) {
                bitMatrix.set(i9 + 7, i12);
            }
            if (bitArray.get(29 - i10)) {
                bitMatrix.set(i12, i9 + 7);
            }
            if (bitArray.get(39 - i10)) {
                bitMatrix.set(i9 - 7, i12);
            }
            i10++;
        }
    }

    public static AztecCode encode(byte[] bArr) {
        return encode(bArr, 33, 0);
    }

    private static BitArray generateCheckWords(BitArray bitArray, int i8, int i9) {
        int size = bitArray.getSize() / i9;
        ReedSolomonEncoder reedSolomonEncoder = new ReedSolomonEncoder(getGF(i9));
        int i10 = i8 / i9;
        int[] bitsToWords = bitsToWords(bitArray, i9, i10);
        reedSolomonEncoder.encode(bitsToWords, i10 - size);
        BitArray bitArray2 = new BitArray();
        bitArray2.appendBits(0, i8 % i9);
        for (int i11 : bitsToWords) {
            bitArray2.appendBits(i11, i9);
        }
        return bitArray2;
    }

    static BitArray generateModeMessage(boolean z7, int i8, int i9) {
        BitArray bitArray = new BitArray();
        if (z7) {
            bitArray.appendBits(i8 - 1, 2);
            bitArray.appendBits(i9 - 1, 6);
            return generateCheckWords(bitArray, 28, 4);
        }
        bitArray.appendBits(i8 - 1, 5);
        bitArray.appendBits(i9 - 1, 11);
        return generateCheckWords(bitArray, 40, 4);
    }

    private static GenericGF getGF(int i8) {
        if (i8 == 4) {
            return GenericGF.AZTEC_PARAM;
        }
        if (i8 == 6) {
            return GenericGF.AZTEC_DATA_6;
        }
        if (i8 == 8) {
            return GenericGF.AZTEC_DATA_8;
        }
        if (i8 == 10) {
            return GenericGF.AZTEC_DATA_10;
        }
        if (i8 == 12) {
            return GenericGF.AZTEC_DATA_12;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i8)));
    }

    static BitArray stuffBits(BitArray bitArray, int i8) {
        BitArray bitArray2 = new BitArray();
        int size = bitArray.getSize();
        int i9 = (1 << i8) - 2;
        int i10 = 0;
        while (i10 < size) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                int i13 = i10 + i12;
                if (i13 >= size || bitArray.get(i13)) {
                    i11 |= 1 << ((i8 - 1) - i12);
                }
            }
            int i14 = i11 & i9;
            if (i14 == i9) {
                bitArray2.appendBits(i14, i8);
            } else if (i14 == 0) {
                bitArray2.appendBits(i11 | 1, i8);
            } else {
                bitArray2.appendBits(i11, i8);
                i10 += i8;
            }
            i10--;
            i10 += i8;
        }
        return bitArray2;
    }

    private static int totalBitsInLayer(int i8, boolean z7) {
        return ((z7 ? 88 : 112) + (i8 << 4)) * i8;
    }

    public static AztecCode encode(byte[] bArr, int i8, int i9) {
        BitArray bitArray;
        int i10;
        boolean z7;
        int i11;
        int i12;
        int i13;
        BitArray encode = new HighLevelEncoder(bArr).encode();
        int size = ((encode.getSize() * i8) / 100) + 11;
        int size2 = encode.getSize() + size;
        int i14 = 0;
        int i15 = 1;
        if (i9 == 0) {
            BitArray bitArray2 = null;
            int i16 = 0;
            int i17 = 0;
            while (i16 <= 32) {
                boolean z8 = i16 <= 3;
                int i18 = z8 ? i16 + 1 : i16;
                int i19 = totalBitsInLayer(i18, z8);
                if (size2 <= i19) {
                    if (bitArray2 == null || i17 != WORD_SIZE[i18]) {
                        int i20 = WORD_SIZE[i18];
                        i17 = i20;
                        bitArray2 = stuffBits(encode, i20);
                    }
                    int i21 = i19 - (i19 % i17);
                    if ((!z8 || bitArray2.getSize() <= (i17 << 6)) && bitArray2.getSize() + size <= i21) {
                        bitArray = bitArray2;
                        i10 = i17;
                        z7 = z8;
                        i11 = i18;
                        i12 = i19;
                    }
                }
                i16++;
                i14 = 0;
                i15 = 1;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        z7 = i9 < 0;
        i11 = Math.abs(i9);
        if (i11 > (z7 ? 4 : 32)) {
            throw new IllegalArgumentException(String.format("Illegal value %s for layers", Integer.valueOf(i9)));
        }
        i12 = totalBitsInLayer(i11, z7);
        i10 = WORD_SIZE[i11];
        int i22 = i12 - (i12 % i10);
        bitArray = stuffBits(encode, i10);
        if (bitArray.getSize() + size > i22) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        if (z7 && bitArray.getSize() > (i10 << 6)) {
            throw new IllegalArgumentException("Data to large for user specified layer");
        }
        BitArray generateCheckWords = generateCheckWords(bitArray, i12, i10);
        int size3 = bitArray.getSize() / i10;
        BitArray generateModeMessage = generateModeMessage(z7, i11, size3);
        int i23 = (z7 ? 11 : 14) + (i11 << 2);
        int[] iArr = new int[i23];
        int i24 = 2;
        if (z7) {
            for (int i25 = 0; i25 < i23; i25++) {
                iArr[i25] = i25;
            }
            i13 = i23;
        } else {
            int i26 = i23 / 2;
            i13 = i23 + 1 + (((i26 - 1) / 15) * 2);
            int i27 = i13 / 2;
            for (int i28 = 0; i28 < i26; i28++) {
                iArr[(i26 - i28) - i15] = (i27 - r14) - 1;
                iArr[i26 + i28] = (i28 / 15) + i28 + i27 + i15;
            }
        }
        BitMatrix bitMatrix = new BitMatrix(i13);
        int i29 = 0;
        int i30 = 0;
        while (i29 < i11) {
            int i31 = ((i11 - i29) << i24) + (z7 ? 9 : 12);
            int i32 = 0;
            while (i32 < i31) {
                int i33 = i32 << 1;
                while (i14 < i24) {
                    if (generateCheckWords.get(i30 + i33 + i14)) {
                        int i34 = i29 << 1;
                        bitMatrix.set(iArr[i34 + i14], iArr[i34 + i32]);
                    }
                    if (generateCheckWords.get((i31 << 1) + i30 + i33 + i14)) {
                        int i35 = i29 << 1;
                        bitMatrix.set(iArr[i35 + i32], iArr[((i23 - 1) - i35) - i14]);
                    }
                    if (generateCheckWords.get((i31 << 2) + i30 + i33 + i14)) {
                        int i36 = (i23 - 1) - (i29 << 1);
                        bitMatrix.set(iArr[i36 - i14], iArr[i36 - i32]);
                    }
                    if (generateCheckWords.get((i31 * 6) + i30 + i33 + i14)) {
                        int i37 = i29 << 1;
                        bitMatrix.set(iArr[((i23 - 1) - i37) - i32], iArr[i37 + i14]);
                    }
                    i14++;
                    i24 = 2;
                }
                i32++;
                i14 = 0;
                i24 = 2;
            }
            i30 += i31 << 3;
            i29++;
            i14 = 0;
            i24 = 2;
        }
        drawModeMessage(bitMatrix, z7, i13, generateModeMessage);
        if (z7) {
            drawBullsEye(bitMatrix, i13 / 2, 5);
        } else {
            int i38 = i13 / 2;
            drawBullsEye(bitMatrix, i38, 7);
            int i39 = 0;
            int i40 = 0;
            while (i40 < (i23 / 2) - 1) {
                for (int i41 = i38 & 1; i41 < i13; i41 += 2) {
                    int i42 = i38 - i39;
                    bitMatrix.set(i42, i41);
                    int i43 = i38 + i39;
                    bitMatrix.set(i43, i41);
                    bitMatrix.set(i41, i42);
                    bitMatrix.set(i41, i43);
                }
                i40 += 15;
                i39 += 16;
            }
        }
        AztecCode aztecCode = new AztecCode();
        aztecCode.setCompact(z7);
        aztecCode.setSize(i13);
        aztecCode.setLayers(i11);
        aztecCode.setCodeWords(size3);
        aztecCode.setMatrix(bitMatrix);
        return aztecCode;
    }
}
