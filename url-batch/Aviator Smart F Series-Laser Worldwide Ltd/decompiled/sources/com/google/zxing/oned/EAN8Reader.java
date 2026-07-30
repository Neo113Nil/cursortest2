package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.common.BitArray;

/* loaded from: classes4.dex */
public final class EAN8Reader extends UPCEANReader {
    private final int[] decodeMiddleCounters = new int[4];

    @Override // com.google.zxing.oned.UPCEANReader
    protected int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb) {
        int[] iArr2 = this.decodeMiddleCounters;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int size = bitArray.getSize();
        int i8 = iArr[1];
        for (int i9 = 0; i9 < 4 && i8 < size; i9++) {
            sb.append((char) (UPCEANReader.decodeDigit(bitArray, iArr2, i8, UPCEANReader.L_PATTERNS) + 48));
            for (int i10 : iArr2) {
                i8 += i10;
            }
        }
        int i11 = UPCEANReader.findGuardPattern(bitArray, i8, true, UPCEANReader.MIDDLE_PATTERN)[1];
        for (int i12 = 0; i12 < 4 && i11 < size; i12++) {
            sb.append((char) (UPCEANReader.decodeDigit(bitArray, iArr2, i11, UPCEANReader.L_PATTERNS) + 48));
            for (int i13 : iArr2) {
                i11 += i13;
            }
        }
        return i11;
    }

    @Override // com.google.zxing.oned.UPCEANReader
    BarcodeFormat getBarcodeFormat() {
        return BarcodeFormat.EAN_8;
    }
}
