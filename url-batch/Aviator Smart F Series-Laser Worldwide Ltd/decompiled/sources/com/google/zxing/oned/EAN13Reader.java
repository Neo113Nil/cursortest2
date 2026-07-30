package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
public final class EAN13Reader extends UPCEANReader {
    static final int[] FIRST_DIGIT_ENCODINGS = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};
    private final int[] decodeMiddleCounters = new int[4];

    private static void determineFirstDigit(StringBuilder sb, int i8) {
        for (int i9 = 0; i9 < 10; i9++) {
            if (i8 == FIRST_DIGIT_ENCODINGS[i9]) {
                sb.insert(0, (char) (i9 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.UPCEANReader
    protected int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i8 = iArr[1];
        int i9 = 0;
        for (int i10 = 0; i10 < 6 && i8 < size; i10++) {
            int decodeDigit = UPCEANReader.decodeDigit(bitArray, iArr2, i8, UPCEANReader.L_AND_G_PATTERNS);
            sb.append((char) ((decodeDigit % 10) + 48));
            for (int i11 : iArr2) {
                i8 += i11;
            }
            if (decodeDigit >= 10) {
                i9 |= 1 << (5 - i10);
            }
        }
        determineFirstDigit(sb, i9);
        int i12 = UPCEANReader.findGuardPattern(bitArray, i8, true, UPCEANReader.MIDDLE_PATTERN)[1];
        for (int i13 = 0; i13 < 6 && i12 < size; i13++) {
            sb.append((char) (UPCEANReader.decodeDigit(bitArray, iArr2, i12, UPCEANReader.L_PATTERNS) + 48));
            for (int i14 : iArr2) {
                i12 += i14;
            }
        }
        return i12;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.EAN_13;
    }
}
