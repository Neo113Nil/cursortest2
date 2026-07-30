package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.Map;

/* loaded from: classes4.dex */
public final class ITFReader extends OneDReader {
    private static final float MAX_AVG_VARIANCE = 0.38f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.5f;
    private static final int N = 1;
    private static final int W = 3;

    /* renamed from: w, reason: collision with root package name */
    private static final int f15129w = 2;
    private int narrowLineWidth = -1;
    private static final int[] DEFAULT_ALLOWED_LENGTHS = {6, 8, 10, 12, 14};
    private static final int[] START_PATTERN = {1, 1, 1, 1};
    private static final int[][] END_PATTERN_REVERSED = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};
    private static final int[][] PATTERNS = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    private static int decodeDigit(int[] iArr) {
        int length = PATTERNS.length;
        float f8 = 0.38f;
        int i8 = -1;
        for (int i9 = 0; i9 < length; i9++) {
            float patternMatchVariance = OneDReader.patternMatchVariance(iArr, PATTERNS[i9], 0.5f);
            if (patternMatchVariance < f8) {
                i8 = i9;
                f8 = patternMatchVariance;
            } else if (patternMatchVariance == f8) {
                i8 = -1;
            }
        }
        if (i8 >= 0) {
            return i8 % 10;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private int[] decodeEnd(BitArray bitArray) {
        int[] findGuardPattern;
        bitArray.reverse();
        try {
            int skipWhiteSpace = skipWhiteSpace(bitArray);
            try {
                findGuardPattern = findGuardPattern(bitArray, skipWhiteSpace, END_PATTERN_REVERSED[0]);
            } catch (NotFoundException unused) {
                findGuardPattern = findGuardPattern(bitArray, skipWhiteSpace, END_PATTERN_REVERSED[1]);
            }
            validateQuietZone(bitArray, findGuardPattern[0]);
            int i8 = findGuardPattern[0];
            findGuardPattern[0] = bitArray.getSize() - findGuardPattern[1];
            findGuardPattern[1] = bitArray.getSize() - i8;
            return findGuardPattern;
        } finally {
            bitArray.reverse();
        }
    }

    private static void decodeMiddle(BitArray bitArray, int i8, int i9, StringBuilder sb) {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i8 < i9) {
            OneDReader.recordPattern(bitArray, i8, iArr);
            for (int i10 = 0; i10 < 5; i10++) {
                int i11 = i10 * 2;
                iArr2[i10] = iArr[i11];
                iArr3[i10] = iArr[i11 + 1];
            }
            sb.append((char) (decodeDigit(iArr2) + 48));
            sb.append((char) (decodeDigit(iArr3) + 48));
            for (int i12 = 0; i12 < 10; i12++) {
                i8 += iArr[i12];
            }
        }
    }

    private int[] decodeStart(BitArray bitArray) {
        int[] findGuardPattern = findGuardPattern(bitArray, skipWhiteSpace(bitArray), START_PATTERN);
        int i8 = findGuardPattern[1];
        int i9 = findGuardPattern[0];
        this.narrowLineWidth = (i8 - i9) / 4;
        validateQuietZone(bitArray, i9);
        return findGuardPattern;
    }

    private static int[] findGuardPattern(BitArray bitArray, int i8, int[] iArr) {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int size = bitArray.getSize();
        int i9 = i8;
        boolean z7 = false;
        int i10 = 0;
        while (i8 < size) {
            if (bitArray.get(i8) != z7) {
                iArr2[i10] = iArr2[i10] + 1;
            } else {
                if (i10 != length - 1) {
                    i10++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i9, i8};
                    }
                    i9 += iArr2[0] + iArr2[1];
                    int i11 = i10 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i11);
                    iArr2[i11] = 0;
                    iArr2[i10] = 0;
                    i10--;
                }
                iArr2[i10] = 1;
                z7 = !z7;
            }
            i8++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int skipWhiteSpace(BitArray bitArray) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        if (nextSet != size) {
            return nextSet;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void validateQuietZone(BitArray bitArray, int i8) {
        int i9 = this.narrowLineWidth * 10;
        if (i9 >= i8) {
            i9 = i8;
        }
        for (int i10 = i8 - 1; i9 > 0 && i10 >= 0 && !bitArray.get(i10); i10--) {
            i9--;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        boolean z7;
        int[] decodeStart = decodeStart(bitArray);
        int[] decodeEnd = decodeEnd(bitArray);
        StringBuilder sb = new StringBuilder(20);
        decodeMiddle(bitArray, decodeStart[1], decodeEnd[0], sb);
        String sb2 = sb.toString();
        int[] iArr = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = DEFAULT_ALLOWED_LENGTHS;
        }
        int length = sb2.length();
        int length2 = iArr.length;
        int i9 = 0;
        int i10 = 0;
        while (true) {
            if (i9 >= length2) {
                z7 = false;
                break;
            }
            int i11 = iArr[i9];
            if (length == i11) {
                z7 = true;
                break;
            }
            if (i11 > i10) {
                i10 = i11;
            }
            i9++;
        }
        if ((z7 || length <= i10) && !z7) {
            throw FormatException.getFormatInstance();
        }
        float f8 = i8;
        return new Result(sb2, null, new ResultPoint[]{new ResultPoint(decodeStart[1], f8), new ResultPoint(decodeEnd[0], f8)}, BarcodeFormat.ITF);
    }
}
