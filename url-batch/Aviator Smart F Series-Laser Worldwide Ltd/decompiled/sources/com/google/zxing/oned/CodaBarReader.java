package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public final class CodaBarReader extends OneDReader {
    private static final float MAX_ACCEPTABLE = 2.0f;
    private static final int MIN_CHARACTER_LENGTH = 3;
    private static final float PADDING = 1.5f;
    private static final String ALPHABET_STRING = "0123456789-$:/.+ABCD";
    static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    static final int[] CHARACTER_ENCODINGS = {3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 12, 24, 69, 81, 84, 21, 26, 41, 11, 14};
    private static final char[] STARTEND_ENCODING = {'A', 'B', 'C', 'D'};
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private int[] counters = new int[80];
    private int counterLength = 0;

    static boolean arrayContains(char[] cArr, char c8) {
        if (cArr != null) {
            for (char c9 : cArr) {
                if (c9 == c8) {
                    return true;
                }
            }
        }
        return false;
    }

    private void counterAppend(int i8) {
        int[] iArr = this.counters;
        int i9 = this.counterLength;
        iArr[i9] = i8;
        int i10 = i9 + 1;
        this.counterLength = i10;
        if (i10 >= iArr.length) {
            int[] iArr2 = new int[i10 << 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            this.counters = iArr2;
        }
    }

    private int findStartPattern() {
        for (int i8 = 1; i8 < this.counterLength; i8 += 2) {
            int narrowWidePattern = toNarrowWidePattern(i8);
            if (narrowWidePattern != -1 && arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) {
                int i9 = 0;
                for (int i10 = i8; i10 < i8 + 7; i10++) {
                    i9 += this.counters[i10];
                }
                if (i8 == 1 || this.counters[i8 - 1] >= i9 / 2) {
                    return i8;
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private void setCounters(BitArray bitArray) {
        int i8 = 0;
        this.counterLength = 0;
        int nextUnset = bitArray.getNextUnset(0);
        int size = bitArray.getSize();
        if (nextUnset >= size) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z7 = true;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z7) {
                i8++;
            } else {
                counterAppend(i8);
                z7 = !z7;
                i8 = 1;
            }
            nextUnset++;
        }
        counterAppend(i8);
    }

    private int toNarrowWidePattern(int i8) {
        int i9 = i8 + 7;
        if (i9 >= this.counterLength) {
            return -1;
        }
        int[] iArr = this.counters;
        int i10 = Integer.MAX_VALUE;
        int i11 = 0;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int i14 = i8; i14 < i9; i14 += 2) {
            int i15 = iArr[i14];
            if (i15 < i12) {
                i12 = i15;
            }
            if (i15 > i13) {
                i13 = i15;
            }
        }
        int i16 = (i12 + i13) / 2;
        int i17 = 0;
        for (int i18 = i8 + 1; i18 < i9; i18 += 2) {
            int i19 = iArr[i18];
            if (i19 < i10) {
                i10 = i19;
            }
            if (i19 > i17) {
                i17 = i19;
            }
        }
        int i20 = (i10 + i17) / 2;
        int i21 = 128;
        int i22 = 0;
        for (int i23 = 0; i23 < 7; i23++) {
            i21 >>= 1;
            if (iArr[i8 + i23] > ((i23 & 1) == 0 ? i16 : i20)) {
                i22 |= i21;
            }
        }
        while (true) {
            int[] iArr2 = CHARACTER_ENCODINGS;
            if (i11 >= iArr2.length) {
                return -1;
            }
            if (iArr2[i11] == i22) {
                return i11;
            }
            i11++;
        }
    }

    private void validatePattern(int i8) {
        int i9 = 0;
        int[] iArr = {0, 0, 0, 0};
        int[] iArr2 = {0, 0, 0, 0};
        int length = this.decodeRowResult.length() - 1;
        int i10 = i8;
        int i11 = 0;
        while (true) {
            int i12 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i11)];
            for (int i13 = 6; i13 >= 0; i13--) {
                int i14 = (i13 & 1) + ((i12 & 1) << 1);
                iArr[i14] = iArr[i14] + this.counters[i10 + i13];
                iArr2[i14] = iArr2[i14] + 1;
                i12 >>= 1;
            }
            if (i11 >= length) {
                break;
            }
            i10 += 8;
            i11++;
        }
        float[] fArr = new float[4];
        float[] fArr2 = new float[4];
        for (int i15 = 0; i15 < 2; i15++) {
            fArr2[i15] = 0.0f;
            int i16 = i15 + 2;
            int i17 = iArr[i16];
            int i18 = iArr2[i16];
            float f8 = ((iArr[i15] / iArr2[i15]) + (i17 / i18)) / 2.0f;
            fArr2[i16] = f8;
            fArr[i15] = f8;
            fArr[i16] = ((i17 * 2.0f) + PADDING) / i18;
        }
        loop3: while (true) {
            int i19 = CHARACTER_ENCODINGS[this.decodeRowResult.charAt(i9)];
            for (int i20 = 6; i20 >= 0; i20--) {
                int i21 = (i20 & 1) + ((i19 & 1) << 1);
                float f9 = this.counters[i8 + i20];
                if (f9 < fArr2[i21] || f9 > fArr[i21]) {
                    break loop3;
                }
                i19 >>= 1;
            }
            if (i9 >= length) {
                return;
            }
            i8 += 8;
            i9++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        int i9;
        Arrays.fill(this.counters, 0);
        setCounters(bitArray);
        int findStartPattern = findStartPattern();
        this.decodeRowResult.setLength(0);
        int i10 = findStartPattern;
        while (true) {
            int narrowWidePattern = toNarrowWidePattern(i10);
            if (narrowWidePattern == -1) {
                throw NotFoundException.getNotFoundInstance();
            }
            this.decodeRowResult.append((char) narrowWidePattern);
            i9 = i10 + 8;
            if ((this.decodeRowResult.length() <= 1 || !arrayContains(STARTEND_ENCODING, ALPHABET[narrowWidePattern])) && i9 < this.counterLength) {
                i10 = i9;
            }
        }
        int i11 = i10 + 7;
        int i12 = this.counters[i11];
        int i13 = 0;
        for (int i14 = -8; i14 < -1; i14++) {
            i13 += this.counters[i9 + i14];
        }
        if (i9 < this.counterLength && i12 < i13 / 2) {
            throw NotFoundException.getNotFoundInstance();
        }
        validatePattern(findStartPattern);
        for (int i15 = 0; i15 < this.decodeRowResult.length(); i15++) {
            StringBuilder sb = this.decodeRowResult;
            sb.setCharAt(i15, ALPHABET[sb.charAt(i15)]);
        }
        char charAt = this.decodeRowResult.charAt(0);
        char[] cArr = STARTEND_ENCODING;
        if (!arrayContains(cArr, charAt)) {
            throw NotFoundException.getNotFoundInstance();
        }
        StringBuilder sb2 = this.decodeRowResult;
        if (!arrayContains(cArr, sb2.charAt(sb2.length() - 1))) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (this.decodeRowResult.length() <= 3) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (map == null || !map.containsKey(DecodeHintType.RETURN_CODABAR_START_END)) {
            StringBuilder sb3 = this.decodeRowResult;
            sb3.deleteCharAt(sb3.length() - 1);
            this.decodeRowResult.deleteCharAt(0);
        }
        int i16 = 0;
        for (int i17 = 0; i17 < findStartPattern; i17++) {
            i16 += this.counters[i17];
        }
        float f8 = i16;
        while (findStartPattern < i11) {
            i16 += this.counters[findStartPattern];
            findStartPattern++;
        }
        float f9 = i8;
        return new Result(this.decodeRowResult.toString(), null, new ResultPoint[]{new ResultPoint(f8, f9), new ResultPoint(i16, f9)}, BarcodeFormat.CODABAR);
    }
}
