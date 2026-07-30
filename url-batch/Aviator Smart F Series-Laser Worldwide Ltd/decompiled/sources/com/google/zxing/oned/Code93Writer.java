package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import java.util.Map;

/* loaded from: classes4.dex */
public class Code93Writer extends OneDimensionalCodeWriter {
    @Deprecated
    protected static int appendPattern(boolean[] zArr, int i8, int[] iArr, boolean z7) {
        return appendPattern(zArr, i8, iArr);
    }

    private static int computeChecksumIndex(String str, int i8) {
        int i9 = 0;
        int i10 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            i9 += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i10;
            i10++;
            if (i10 > i8) {
                i10 = 1;
            }
        }
        return i9 % 47;
    }

    private static void toIntArray(int i8, int[] iArr) {
        for (int i9 = 0; i9 < 9; i9++) {
            int i10 = 1;
            if (((1 << (8 - i9)) & i8) == 0) {
                i10 = 0;
            }
            iArr[i9] = i10;
        }
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_93) {
            return super.encode(str, barcodeFormat, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(barcodeFormat)));
    }

    private static int appendPattern(boolean[] zArr, int i8, int[] iArr) {
        int length = iArr.length;
        int i9 = 0;
        while (i9 < length) {
            int i10 = i8 + 1;
            zArr[i8] = iArr[i9] != 0;
            i9++;
            i8 = i10;
        }
        return 9;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length <= 80) {
            int[] iArr = new int[9];
            int length2 = ((str.length() + 4) * 9) + 1;
            toIntArray(Code93Reader.CHARACTER_ENCODINGS[47], iArr);
            boolean[] zArr = new boolean[length2];
            int appendPattern = appendPattern(zArr, 0, iArr);
            for (int i8 = 0; i8 < length; i8++) {
                toIntArray(Code93Reader.CHARACTER_ENCODINGS["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i8))], iArr);
                appendPattern += appendPattern(zArr, appendPattern, iArr);
            }
            int computeChecksumIndex = computeChecksumIndex(str, 20);
            int[] iArr2 = Code93Reader.CHARACTER_ENCODINGS;
            toIntArray(iArr2[computeChecksumIndex], iArr);
            int appendPattern2 = appendPattern + appendPattern(zArr, appendPattern, iArr);
            toIntArray(iArr2[computeChecksumIndex(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(computeChecksumIndex), 15)], iArr);
            int appendPattern3 = appendPattern2 + appendPattern(zArr, appendPattern2, iArr);
            toIntArray(iArr2[47], iArr);
            zArr[appendPattern3 + appendPattern(zArr, appendPattern3, iArr)] = true;
            return zArr;
        }
        throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
    }
}
