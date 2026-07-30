package com.google.zxing.oned;

import com.baidu.ar.face.algo.FAUEnum;
import com.baidu.location.BDLocation;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.common.base.Ascii;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import com.realsil.sdk.core.bluetooth.connection.le.GattError;
import com.realsil.sdk.dfu.DfuException;
import java.util.Arrays;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Code39Reader extends OneDReader {
    static final String ALPHABET_STRING = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%";
    static final int ASTERISK_ENCODING = 148;
    static final int[] CHARACTER_ENCODINGS = {52, 289, 97, 352, 49, 304, 112, 37, 292, 100, DfuException.ERROR_CANNOT_FIND_DEVICE, 73, 328, 25, DfuException.ERROR_ENTER_OTA_MODE_FAILED, 88, 13, DfuException.ERROR_SEND_COMMAND_REACH_MAX_RETRY_TIMES, 76, 28, 259, 67, 322, 19, DfuException.ERROR_USER_NOT_ACTIVE_IMAGE_ERROR, 82, 7, DfuException.ERROR_NO_SERVICE_FOUND_OR_LOSS, 70, 22, 385, 193, 448, GattError.GATT_ALREADY_OPEN, 400, FAUEnum.PR_ANIMATE_FAILED, 133, 388, 196, 168, BDLocation.TypeServerDecryptError, TsExtractor.TS_STREAM_TYPE_DTS, 42};
    private final int[] counters;
    private final StringBuilder decodeRowResult;
    private final boolean extendedMode;
    private final boolean usingCheckDigit;

    public Code39Reader() {
        this(false);
    }

    private static String decodeExtended(CharSequence charSequence) {
        int i8;
        char c8;
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        int i9 = 0;
        while (i9 < length) {
            char charAt = charSequence.charAt(i9);
            if (charAt == '+' || charAt == '$' || charAt == '%' || charAt == '/') {
                i9++;
                char charAt2 = charSequence.charAt(i9);
                if (charAt != '$') {
                    if (charAt != '%') {
                        if (charAt != '+') {
                            if (charAt == '/') {
                                if (charAt2 >= 'A' && charAt2 <= 'O') {
                                    i8 = charAt2 - ' ';
                                } else {
                                    if (charAt2 != 'Z') {
                                        throw FormatException.getFormatInstance();
                                    }
                                    c8 = ':';
                                    sb.append(c8);
                                }
                            }
                            c8 = 0;
                            sb.append(c8);
                        } else {
                            if (charAt2 < 'A' || charAt2 > 'Z') {
                                throw FormatException.getFormatInstance();
                            }
                            i8 = charAt2 + ' ';
                        }
                    } else if (charAt2 >= 'A' && charAt2 <= 'E') {
                        i8 = charAt2 - '&';
                    } else if (charAt2 >= 'F' && charAt2 <= 'J') {
                        i8 = charAt2 - 11;
                    } else if (charAt2 >= 'K' && charAt2 <= 'O') {
                        i8 = charAt2 + 16;
                    } else if (charAt2 < 'P' || charAt2 > 'T') {
                        if (charAt2 != 'U') {
                            if (charAt2 == 'V') {
                                c8 = '@';
                            } else if (charAt2 == 'W') {
                                c8 = '`';
                            } else {
                                if (charAt2 != 'X' && charAt2 != 'Y' && charAt2 != 'Z') {
                                    throw FormatException.getFormatInstance();
                                }
                                c8 = Ascii.MAX;
                            }
                            sb.append(c8);
                        }
                        c8 = 0;
                        sb.append(c8);
                    } else {
                        i8 = charAt2 + '+';
                    }
                } else {
                    if (charAt2 < 'A' || charAt2 > 'Z') {
                        throw FormatException.getFormatInstance();
                    }
                    i8 = charAt2 - '@';
                }
                c8 = (char) i8;
                sb.append(c8);
            } else {
                sb.append(charAt);
            }
            i9++;
        }
        return sb.toString();
    }

    private static int[] findAsteriskPattern(BitArray bitArray, int[] iArr) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
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
                    if (toNarrowWidePattern(iArr) == ASTERISK_ENCODING && bitArray.isRange(Math.max(0, i8 - ((nextSet - i8) / 2)), i8, false)) {
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
                if (i8 == ASTERISK_ENCODING) {
                    return '*';
                }
                throw NotFoundException.getNotFoundInstance();
            }
            if (iArr[i9] == i8) {
                return ALPHABET_STRING.charAt(i9);
            }
            i9++;
        }
    }

    private static int toNarrowWidePattern(int[] iArr) {
        int length = iArr.length;
        int i8 = 0;
        while (true) {
            int i9 = Integer.MAX_VALUE;
            for (int i10 : iArr) {
                if (i10 < i9 && i10 > i8) {
                    i9 = i10;
                }
            }
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            for (int i14 = 0; i14 < length; i14++) {
                int i15 = iArr[i14];
                if (i15 > i9) {
                    i12 |= 1 << ((length - 1) - i14);
                    i11++;
                    i13 += i15;
                }
            }
            if (i11 == 3) {
                for (int i16 = 0; i16 < length && i11 > 0; i16++) {
                    int i17 = iArr[i16];
                    if (i17 > i9) {
                        i11--;
                        if ((i17 << 1) >= i13) {
                            return -1;
                        }
                    }
                }
                return i12;
            }
            if (i11 <= 3) {
                return -1;
            }
            i8 = i9;
        }
    }

    @Override // com.google.zxing.oned.OneDReader
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        int[] iArr = this.counters;
        Arrays.fill(iArr, 0);
        StringBuilder sb = this.decodeRowResult;
        sb.setLength(0);
        int nextSet = bitArray.getNextSet(findAsteriskPattern(bitArray, iArr)[1]);
        int size = bitArray.getSize();
        while (true) {
            OneDReader.recordPattern(bitArray, nextSet, iArr);
            int narrowWidePattern = toNarrowWidePattern(iArr);
            if (narrowWidePattern < 0) {
                throw NotFoundException.getNotFoundInstance();
            }
            char patternToChar = patternToChar(narrowWidePattern);
            sb.append(patternToChar);
            int i9 = nextSet;
            for (int i10 : iArr) {
                i9 += i10;
            }
            int nextSet2 = bitArray.getNextSet(i9);
            if (patternToChar == '*') {
                sb.setLength(sb.length() - 1);
                int i11 = 0;
                for (int i12 : iArr) {
                    i11 += i12;
                }
                int i13 = (nextSet2 - nextSet) - i11;
                if (nextSet2 != size && (i13 << 1) < i11) {
                    throw NotFoundException.getNotFoundInstance();
                }
                if (this.usingCheckDigit) {
                    int length = sb.length() - 1;
                    int i14 = 0;
                    for (int i15 = 0; i15 < length; i15++) {
                        i14 += ALPHABET_STRING.indexOf(this.decodeRowResult.charAt(i15));
                    }
                    if (sb.charAt(length) != ALPHABET_STRING.charAt(i14 % 43)) {
                        throw ChecksumException.getChecksumInstance();
                    }
                    sb.setLength(length);
                }
                if (sb.length() == 0) {
                    throw NotFoundException.getNotFoundInstance();
                }
                float f8 = i8;
                return new Result(this.extendedMode ? decodeExtended(sb) : sb.toString(), null, new ResultPoint[]{new ResultPoint((r2[1] + r2[0]) / 2.0f, f8), new ResultPoint(nextSet + (i11 / 2.0f), f8)}, BarcodeFormat.CODE_39);
            }
            nextSet = nextSet2;
        }
    }

    public Code39Reader(boolean z7) {
        this(z7, false);
    }

    public Code39Reader(boolean z7, boolean z8) {
        this.usingCheckDigit = z7;
        this.extendedMode = z8;
        this.decodeRowResult = new StringBuilder(20);
        this.counters = new int[9];
    }
}
