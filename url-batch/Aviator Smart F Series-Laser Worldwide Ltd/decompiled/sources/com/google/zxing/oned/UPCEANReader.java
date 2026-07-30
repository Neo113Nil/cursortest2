package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.Result;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.ResultPoint;
import com.google.zxing.ResultPointCallback;
import com.google.zxing.common.BitArray;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public abstract class UPCEANReader extends OneDReader {
    static final int[][] L_AND_G_PATTERNS;
    static final int[][] L_PATTERNS;
    private static final float MAX_AVG_VARIANCE = 0.48f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;
    static final int[] START_END_PATTERN = {1, 1, 1};
    static final int[] MIDDLE_PATTERN = {1, 1, 1, 1, 1};
    static final int[] END_PATTERN = {1, 1, 1, 1, 1, 1};
    private final StringBuilder decodeRowStringBuffer = new StringBuilder(20);
    private final UPCEANExtensionSupport extensionReader = new UPCEANExtensionSupport();
    private final EANManufacturerOrgSupport eanManSupport = new EANManufacturerOrgSupport();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        L_PATTERNS = iArr;
        int[][] iArr2 = new int[20][];
        L_AND_G_PATTERNS = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i8 = 10; i8 < 20; i8++) {
            int[] iArr3 = L_PATTERNS[i8 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i9 = 0; i9 < iArr3.length; i9++) {
                iArr4[i9] = iArr3[(iArr3.length - i9) - 1];
            }
            L_AND_G_PATTERNS[i8] = iArr4;
        }
    }

    protected UPCEANReader() {
    }

    static boolean checkStandardUPCEANChecksum(CharSequence charSequence) {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i8 = length - 1;
        return getStandardUPCEANChecksum(charSequence.subSequence(0, i8)) == Character.digit(charSequence.charAt(i8), 10);
    }

    static int decodeDigit(BitArray bitArray, int[] iArr, int i8, int[][] iArr2) {
        OneDReader.recordPattern(bitArray, i8, iArr);
        int length = iArr2.length;
        float f8 = MAX_AVG_VARIANCE;
        int i9 = -1;
        for (int i10 = 0; i10 < length; i10++) {
            float patternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i10], 0.7f);
            if (patternMatchVariance < f8) {
                i9 = i10;
                f8 = patternMatchVariance;
            }
        }
        if (i9 >= 0) {
            return i9;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    static int[] findGuardPattern(BitArray bitArray, int i8, boolean z7, int[] iArr) {
        return findGuardPattern(bitArray, i8, z7, iArr, new int[iArr.length]);
    }

    static int[] findStartGuardPattern(BitArray bitArray) {
        int[] iArr = new int[START_END_PATTERN.length];
        int[] iArr2 = null;
        boolean z7 = false;
        int i8 = 0;
        while (!z7) {
            int[] iArr3 = START_END_PATTERN;
            Arrays.fill(iArr, 0, iArr3.length, 0);
            iArr2 = findGuardPattern(bitArray, i8, false, iArr3, iArr);
            int i9 = iArr2[0];
            int i10 = iArr2[1];
            int i11 = i9 - (i10 - i9);
            if (i11 >= 0) {
                z7 = bitArray.isRange(i11, i9, false);
            }
            i8 = i10;
        }
        return iArr2;
    }

    static int getStandardUPCEANChecksum(CharSequence charSequence) {
        int length = charSequence.length();
        int i8 = 0;
        for (int i9 = length - 1; i9 >= 0; i9 -= 2) {
            int charAt = charSequence.charAt(i9) - '0';
            if (charAt < 0 || charAt > 9) {
                throw FormatException.getFormatInstance();
            }
            i8 += charAt;
        }
        int i10 = i8 * 3;
        for (int i11 = length - 2; i11 >= 0; i11 -= 2) {
            int charAt2 = charSequence.charAt(i11) - '0';
            if (charAt2 < 0 || charAt2 > 9) {
                throw FormatException.getFormatInstance();
            }
            i10 += charAt2;
        }
        return (1000 - i10) % 10;
    }

    boolean checkChecksum(String str) {
        return checkStandardUPCEANChecksum(str);
    }

    int[] decodeEnd(BitArray bitArray, int i8) {
        return findGuardPattern(bitArray, i8, false, START_END_PATTERN);
    }

    protected abstract int decodeMiddle(BitArray bitArray, int[] iArr, StringBuilder sb);

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        return decodeRow(i8, bitArray, findStartGuardPattern(bitArray), map);
    }

    abstract BarcodeFormat getBarcodeFormat();

    private static int[] findGuardPattern(BitArray bitArray, int i8, boolean z7, int[] iArr, int[] iArr2) {
        int size = bitArray.getSize();
        int nextUnset = z7 ? bitArray.getNextUnset(i8) : bitArray.getNextSet(i8);
        int length = iArr.length;
        boolean z8 = z7;
        int i9 = 0;
        int i10 = nextUnset;
        while (nextUnset < size) {
            if (bitArray.get(nextUnset) != z8) {
                iArr2[i9] = iArr2[i9] + 1;
            } else {
                if (i9 != length - 1) {
                    i9++;
                } else {
                    if (OneDReader.patternMatchVariance(iArr2, iArr, 0.7f) < MAX_AVG_VARIANCE) {
                        return new int[]{i10, nextUnset};
                    }
                    i10 += iArr2[0] + iArr2[1];
                    int i11 = i9 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i11);
                    iArr2[i11] = 0;
                    iArr2[i9] = 0;
                    i9--;
                }
                iArr2[i9] = 1;
                z8 = !z8;
            }
            nextUnset++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public Result decodeRow(int i8, BitArray bitArray, int[] iArr, Map<DecodeHintType, ?> map) {
        int i9;
        String lookupCountryIdentifier;
        ResultPointCallback resultPointCallback = map == null ? null : (ResultPointCallback) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((iArr[0] + iArr[1]) / 2.0f, i8));
        }
        StringBuilder sb = this.decodeRowStringBuffer;
        sb.setLength(0);
        int decodeMiddle = decodeMiddle(bitArray, iArr, sb);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint(decodeMiddle, i8));
        }
        int[] decodeEnd = decodeEnd(bitArray, decodeMiddle);
        if (resultPointCallback != null) {
            resultPointCallback.foundPossibleResultPoint(new ResultPoint((decodeEnd[0] + decodeEnd[1]) / 2.0f, i8));
        }
        int i10 = decodeEnd[1];
        int i11 = (i10 - decodeEnd[0]) + i10;
        if (i11 >= bitArray.getSize() || !bitArray.isRange(i10, i11, false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        String sb2 = sb.toString();
        if (sb2.length() < 8) {
            throw FormatException.getFormatInstance();
        }
        if (!checkChecksum(sb2)) {
            throw ChecksumException.getChecksumInstance();
        }
        BarcodeFormat barcodeFormat = getBarcodeFormat();
        float f8 = i8;
        Result result = new Result(sb2, null, new ResultPoint[]{new ResultPoint((iArr[1] + iArr[0]) / 2.0f, f8), new ResultPoint((decodeEnd[1] + decodeEnd[0]) / 2.0f, f8)}, barcodeFormat);
        try {
            Result decodeRow = this.extensionReader.decodeRow(i8, bitArray, decodeEnd[1]);
            result.putMetadata(ResultMetadataType.UPC_EAN_EXTENSION, decodeRow.getText());
            result.putAllMetadata(decodeRow.getResultMetadata());
            result.addResultPoints(decodeRow.getResultPoints());
            i9 = decodeRow.getText().length();
        } catch (ReaderException unused) {
            i9 = 0;
        }
        int[] iArr2 = map != null ? (int[]) map.get(DecodeHintType.ALLOWED_EAN_EXTENSIONS) : null;
        if (iArr2 != null) {
            for (int i12 : iArr2) {
                if (i9 != i12) {
                }
            }
            throw NotFoundException.getNotFoundInstance();
        }
        if ((barcodeFormat == BarcodeFormat.EAN_13 || barcodeFormat == BarcodeFormat.UPC_A) && (lookupCountryIdentifier = this.eanManSupport.lookupCountryIdentifier(sb2)) != null) {
            result.putMetadata(ResultMetadataType.POSSIBLE_COUNTRY, lookupCountryIdentifier);
        }
        return result;
    }
}
