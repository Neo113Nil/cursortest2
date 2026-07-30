package com.google.zxing.oned;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.common.base.Ascii;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.realsil.sdk.dfu.DfuException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Code93Reader extends OneDReader {
    private static final int ASTERISK_ENCODING;
    static final int[] CHARACTER_ENCODINGS;
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*";
    private static final char[] ALPHABET = ALPHABET_STRING.toCharArray();
    private final StringBuilder decodeRowResult = new StringBuilder(20);
    private final int[] counters = new int[6];

    static {
        int[] iArr = {DfuException.ERROR_REQUEST_MTU_NO_CALLBACK, 328, 324, 322, 296, 292, 290, 336, DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, DfuException.ERROR_WRITE_CHARAC_NOTIFY_ERROR, TypedValues.CycleType.TYPE_WAVE_OFFSET, TypedValues.CycleType.TYPE_EASING, 418, 404, TypedValues.CycleType.TYPE_VISIBILITY, 394, 360, 356, 354, 308, 282, 344, 332, 326, 300, 278, 436, 434, 428, TypedValues.CycleType.TYPE_CUSTOM_WAVE_SHAPE, 406, 410, 364, 358, 310, 314, 302, 468, 466, 458, 366, 374, 430, 294, 474, 470, 306, 350};
        CHARACTER_ENCODINGS = iArr;
        ASTERISK_ENCODING = iArr[47];
    }

    private static void checkChecksums(CharSequence charSequence) {
        int length = charSequence.length();
        checkOneChecksum(charSequence, length - 2, 20);
        checkOneChecksum(charSequence, length - 1, 15);
    }

    private static void checkOneChecksum(CharSequence charSequence, int i8, int i9) {
        int i10 = 0;
        int i11 = 1;
        for (int i12 = i8 - 1; i12 >= 0; i12--) {
            i10 += ALPHABET_STRING.indexOf(charSequence.charAt(i12)) * i11;
            i11++;
            if (i11 > i9) {
                i11 = 1;
            }
        }
        if (charSequence.charAt(i8) != ALPHABET[i10 % 47]) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    private static String decodeExtended(CharSequence charSequence) {
        int i8;
        char c8;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i9 = 0;
        while (i9 < length) {
            char charAt = charSequence.charAt(i9);
            if (charAt < 'a' || charAt > 'd') {
                sb.append(charAt);
            } else {
                if (i9 >= length - 1) {
                    throw FormatException.getFormatInstance();
                }
                i9++;
                char charAt2 = charSequence.charAt(i9);
                switch (charAt) {
                    case 'a':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i8 = charAt2 - '@';
                            c8 = (char) i8;
                            sb.append(c8);
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        break;
                    case 'b':
                        if (charAt2 >= 'A' && charAt2 <= 'E') {
                            i8 = charAt2 - '&';
                        } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                            i8 = charAt2 - 11;
                        } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                            i8 = charAt2 + 16;
                        } else if (charAt2 >= 'P' && charAt2 <= 'S') {
                            i8 = charAt2 + '+';
                        } else if (charAt2 >= 'T' && charAt2 <= 'Z') {
                            c8 = Ascii.MAX;
                            sb.append(c8);
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                        c8 = (char) i8;
                        sb.append(c8);
                        break;
                    case 'c':
                        if (charAt2 >= 'A' && charAt2 <= 'O') {
                            i8 = charAt2 - ' ';
                            c8 = (char) i8;
                            sb.append(c8);
                        } else {
                            if (charAt2 != 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            c8 = ':';
                            sb.append(c8);
                            break;
                        }
                    case 'd':
                        if (charAt2 >= 'A' && charAt2 <= 'Z') {
                            i8 = charAt2 + ' ';
                            c8 = (char) i8;
                            sb.append(c8);
                            break;
                        } else {
                            throw FormatException.getFormatInstance();
                        }
                    default:
                        c8 = 0;
                        sb.append(c8);
                        break;
                }
            }
            i9++;
        }
        return sb.toString();
    }

    private int[] findAsteriskPattern(BitArray bitArray) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        Arrays.fill(this.counters, 0);
        int[] iArr = this.counters;
        int length = iArr.length;
        int i8 = nextSet;
        boolean z7 = false;
        int i9 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z7) {
                iArr[i9] = iArr[i9] + 1;
            } else {
                if (i9 != length - 1) {
                    i9++;
                } else {
                    if (toPattern(iArr) == ASTERISK_ENCODING) {
                        return new int[]{i8, nextSet};
                    }
                    i8 += iArr[0] + iArr[1];
                    int i10 = i9 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i10);
                    iArr[i10] = 0;
                    iArr[i9] = 0;
                    i9--;
                }
                iArr[i9] = 1;
                z7 = !z7;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static char patternToChar(int i8) {
        int i9 = 0;
        while (true) {
            int[] iArr = CHARACTER_ENCODINGS;
            if (i9 >= iArr.length) {
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i9] == i8) {
                return ALPHABET[i9];
            }
            i9++;
        }
    }

    private static int toPattern(int[] iArr) {
        int i8 = 0;
        for (int i9 : iArr) {
            i8 += i9;
        }
        int length = iArr.length;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            int round = Math.round((iArr[i11] * 9.0f) / i8);
            if (round <= 0 || round > 4) {
                return -1;
            }
            if ((i11 & 1) == 0) {
                for (int i12 = 0; i12 < round; i12++) {
                    i10 = (i10 << 1) | 1;
                }
            } else {
                i10 <<= round;
            }
        }
        return i10;
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray)[1]);
        int size = bitArray.getSize();
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.decodeRowResult;
        sb.setLength(0);
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int pattern = toPattern(iArr);
            if (pattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char patternToChar = patternToChar(pattern);
            sb.append(patternToChar);
            int i9 = nextSet;
            for (int i10 : iArr) {
                i9 += i10;
            }
            int nextSet2 = bitArray.getNextSet(i9);
            if (patternToChar == '*') {
                sb.deleteCharAt(sb.length() - 1);
                int i11 = 0;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                if (nextSet2 == size || !bitArray.get(nextSet2)) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (sb.length() < 2) {
                    throw NotFoundException.getNotFoundInstance();
                }
                checkChecksums(sb);
                sb.setLength(sb.length() - 2);
                float f8 = i8;
                return new Result(decodeExtended(sb), null, new ResultPoint[]{new ResultPoint((r14[1] + r14[0]) / 2.0f, f8), new ResultPoint(nextSet + (i11 / 2.0f), f8)}, BarcodeFormat.CODE_93);
            }
            nextSet = nextSet2;
        }
    }
}
