package com.google.zxing.oned;

import com.baidu.location.BDLocation;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.ResultPoint;
import com.google.zxing.common.BitArray;
import java.util.ArrayList;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Code128Reader extends OneDReader {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    static final int[][] CODE_PATTERNS = {new int[]{2, 1, 2, 2, 2, 2}, new int[]{2, 2, 2, 1, 2, 2}, new int[]{2, 2, 2, 2, 2, 1}, new int[]{1, 2, 1, 2, 2, 3}, new int[]{1, 2, 1, 3, 2, 2}, new int[]{1, 3, 1, 2, 2, 2}, new int[]{1, 2, 2, 2, 1, 3}, new int[]{1, 2, 2, 3, 1, 2}, new int[]{1, 3, 2, 2, 1, 2}, new int[]{2, 2, 1, 2, 1, 3}, new int[]{2, 2, 1, 3, 1, 2}, new int[]{2, 3, 1, 2, 1, 2}, new int[]{1, 1, 2, 2, 3, 2}, new int[]{1, 2, 2, 1, 3, 2}, new int[]{1, 2, 2, 2, 3, 1}, new int[]{1, 1, 3, 2, 2, 2}, new int[]{1, 2, 3, 1, 2, 2}, new int[]{1, 2, 3, 2, 2, 1}, new int[]{2, 2, 3, 2, 1, 1}, new int[]{2, 2, 1, 1, 3, 2}, new int[]{2, 2, 1, 2, 3, 1}, new int[]{2, 1, 3, 2, 1, 2}, new int[]{2, 2, 3, 1, 1, 2}, new int[]{3, 1, 2, 1, 3, 1}, new int[]{3, 1, 1, 2, 2, 2}, new int[]{3, 2, 1, 1, 2, 2}, new int[]{3, 2, 1, 2, 2, 1}, new int[]{3, 1, 2, 2, 1, 2}, new int[]{3, 2, 2, 1, 1, 2}, new int[]{3, 2, 2, 2, 1, 1}, new int[]{2, 1, 2, 1, 2, 3}, new int[]{2, 1, 2, 3, 2, 1}, new int[]{2, 3, 2, 1, 2, 1}, new int[]{1, 1, 1, 3, 2, 3}, new int[]{1, 3, 1, 1, 2, 3}, new int[]{1, 3, 1, 3, 2, 1}, new int[]{1, 1, 2, 3, 1, 3}, new int[]{1, 3, 2, 1, 1, 3}, new int[]{1, 3, 2, 3, 1, 1}, new int[]{2, 1, 1, 3, 1, 3}, new int[]{2, 3, 1, 1, 1, 3}, new int[]{2, 3, 1, 3, 1, 1}, new int[]{1, 1, 2, 1, 3, 3}, new int[]{1, 1, 2, 3, 3, 1}, new int[]{1, 3, 2, 1, 3, 1}, new int[]{1, 1, 3, 1, 2, 3}, new int[]{1, 1, 3, 3, 2, 1}, new int[]{1, 3, 3, 1, 2, 1}, new int[]{3, 1, 3, 1, 2, 1}, new int[]{2, 1, 1, 3, 3, 1}, new int[]{2, 3, 1, 1, 3, 1}, new int[]{2, 1, 3, 1, 1, 3}, new int[]{2, 1, 3, 3, 1, 1}, new int[]{2, 1, 3, 1, 3, 1}, new int[]{3, 1, 1, 1, 2, 3}, new int[]{3, 1, 1, 3, 2, 1}, new int[]{3, 3, 1, 1, 2, 1}, new int[]{3, 1, 2, 1, 1, 3}, new int[]{3, 1, 2, 3, 1, 1}, new int[]{3, 3, 2, 1, 1, 1}, new int[]{3, 1, 4, 1, 1, 1}, new int[]{2, 2, 1, 4, 1, 1}, new int[]{4, 3, 1, 1, 1, 1}, new int[]{1, 1, 1, 2, 2, 4}, new int[]{1, 1, 1, 4, 2, 2}, new int[]{1, 2, 1, 1, 2, 4}, new int[]{1, 2, 1, 4, 2, 1}, new int[]{1, 4, 1, 1, 2, 2}, new int[]{1, 4, 1, 2, 2, 1}, new int[]{1, 1, 2, 2, 1, 4}, new int[]{1, 1, 2, 4, 1, 2}, new int[]{1, 2, 2, 1, 1, 4}, new int[]{1, 2, 2, 4, 1, 1}, new int[]{1, 4, 2, 1, 1, 2}, new int[]{1, 4, 2, 2, 1, 1}, new int[]{2, 4, 1, 2, 1, 1}, new int[]{2, 2, 1, 1, 1, 4}, new int[]{4, 1, 3, 1, 1, 1}, new int[]{2, 4, 1, 1, 1, 2}, new int[]{1, 3, 4, 1, 1, 1}, new int[]{1, 1, 1, 2, 4, 2}, new int[]{1, 2, 1, 1, 4, 2}, new int[]{1, 2, 1, 2, 4, 1}, new int[]{1, 1, 4, 2, 1, 2}, new int[]{1, 2, 4, 1, 1, 2}, new int[]{1, 2, 4, 2, 1, 1}, new int[]{4, 1, 1, 2, 1, 2}, new int[]{4, 2, 1, 1, 1, 2}, new int[]{4, 2, 1, 2, 1, 1}, new int[]{2, 1, 2, 1, 4, 1}, new int[]{2, 1, 4, 1, 2, 1}, new int[]{4, 1, 2, 1, 2, 1}, new int[]{1, 1, 1, 1, 4, 3}, new int[]{1, 1, 1, 3, 4, 1}, new int[]{1, 3, 1, 1, 4, 1}, new int[]{1, 1, 4, 1, 1, 3}, new int[]{1, 1, 4, 3, 1, 1}, new int[]{4, 1, 1, 1, 1, 3}, new int[]{4, 1, 1, 3, 1, 1}, new int[]{1, 1, 3, 1, 4, 1}, new int[]{1, 1, 4, 1, 3, 1}, new int[]{3, 1, 1, 1, 4, 1}, new int[]{4, 1, 1, 1, 3, 1}, new int[]{2, 1, 1, 4, 1, 2}, new int[]{2, 1, 1, 2, 1, 4}, new int[]{2, 1, 1, 2, 3, 2}, new int[]{2, 3, 3, 1, 1, 1, 2}};
    private static final int CODE_SHIFT = 98;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final float MAX_AVG_VARIANCE = 0.25f;
    private static final float MAX_INDIVIDUAL_VARIANCE = 0.7f;

    private static int decodeCode(BitArray bitArray, int[] iArr, int i8) {
        OneDReader.recordPattern(bitArray, i8, iArr);
        float f8 = MAX_AVG_VARIANCE;
        int i9 = -1;
        int i10 = 0;
        while (true) {
            int[][] iArr2 = CODE_PATTERNS;
            if (i10 >= iArr2.length) {
                break;
            }
            float patternMatchVariance = OneDReader.patternMatchVariance(iArr, iArr2[i10], 0.7f);
            if (patternMatchVariance < f8) {
                i9 = i10;
                f8 = patternMatchVariance;
            }
            i10++;
        }
        if (i9 >= 0) {
            return i9;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    private static int[] findStartPattern(BitArray bitArray) {
        int size = bitArray.getSize();
        int nextSet = bitArray.getNextSet(0);
        int[] iArr = new int[6];
        int i8 = nextSet;
        boolean z7 = false;
        int i9 = 0;
        while (nextSet < size) {
            if (bitArray.get(nextSet) != z7) {
                iArr[i9] = iArr[i9] + 1;
            } else {
                if (i9 == 5) {
                    int i10 = -1;
                    float f8 = MAX_AVG_VARIANCE;
                    for (int i11 = 103; i11 <= 105; i11++) {
                        float patternMatchVariance = OneDReader.patternMatchVariance(iArr, CODE_PATTERNS[i11], 0.7f);
                        if (patternMatchVariance < f8) {
                            i10 = i11;
                            f8 = patternMatchVariance;
                        }
                    }
                    if (i10 >= 0 && bitArray.isRange(Math.max(0, i8 - ((nextSet - i8) / 2)), i8, false)) {
                        return new int[]{i8, nextSet, i10};
                    }
                    i8 += iArr[0] + iArr[1];
                    int i12 = i9 - 1;
                    System.arraycopy(iArr, 2, iArr, 0, i12);
                    iArr[i12] = 0;
                    iArr[i9] = 0;
                    i9--;
                } else {
                    i9++;
                }
                iArr[i9] = 1;
                z7 = !z7;
            }
            nextSet++;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00dd, code lost:
    
        if (r9 != false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0134, code lost:
    
        if (r9 != false) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00eb A[PHI: r17
      0x00eb: PHI (r17v10 boolean) = (r17v6 boolean), (r17v17 boolean) binds: [B:78:0x0111, B:51:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00f4 A[PHI: r16 r17
      0x00f4: PHI (r16v4 boolean) = 
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v3 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
      (r16v1 boolean)
     binds: [B:78:0x0111, B:79:0x0115, B:83:0x0121, B:82:0x011d, B:70:0x00f6, B:51:0x00bf, B:52:0x00c3, B:56:0x00cf, B:55:0x00cb] A[DONT_GENERATE, DONT_INLINE]
      0x00f4: PHI (r17v9 boolean) = 
      (r17v6 boolean)
      (r17v6 boolean)
      (r17v6 boolean)
      (r17v6 boolean)
      (r17v8 boolean)
      (r17v17 boolean)
      (r17v17 boolean)
      (r17v17 boolean)
      (r17v17 boolean)
     binds: [B:78:0x0111, B:79:0x0115, B:83:0x0121, B:82:0x011d, B:70:0x00f6, B:51:0x00bf, B:52:0x00c3, B:56:0x00cf, B:55:0x00cb] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.zxing.oned.OneDReader
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Result decodeRow(int i8, BitArray bitArray, Map<DecodeHintType, ?> map) {
        char c8;
        boolean z7;
        boolean z8 = false;
        boolean z9 = map != null && map.containsKey(DecodeHintType.ASSUME_GS1);
        int[] findStartPattern = findStartPattern(bitArray);
        int i9 = findStartPattern[2];
        ArrayList arrayList = new ArrayList(20);
        arrayList.add(Byte.valueOf((byte) i9));
        switch (i9) {
            case 103:
                c8 = 'e';
                break;
            case 104:
                c8 = 'd';
                break;
            case 105:
                c8 = 'c';
                break;
            default:
                throw FormatException.getFormatInstance();
        }
        StringBuilder sb = new StringBuilder(20);
        int i10 = 6;
        int[] iArr = new int[6];
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = true;
        boolean z13 = false;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        char c9 = c8;
        int i14 = findStartPattern[0];
        int i15 = findStartPattern[1];
        char c10 = c9;
        while (!z11) {
            int decodeCode = decodeCode(bitArray, iArr, i15);
            arrayList.add(Byte.valueOf((byte) decodeCode));
            if (decodeCode != 106) {
                z12 = true;
            }
            if (decodeCode != 106) {
                i12++;
                i9 += i12 * decodeCode;
            }
            int i16 = i15;
            for (int i17 = 0; i17 < i10; i17++) {
                i16 += iArr[i17];
            }
            switch (decodeCode) {
                case 103:
                case 104:
                case 105:
                    throw FormatException.getFormatInstance();
                default:
                    switch (c10) {
                        case 'c':
                            if (decodeCode >= 100) {
                                if (decodeCode != 106) {
                                    z12 = false;
                                }
                                if (decodeCode != 106) {
                                    switch (decodeCode) {
                                        case 100:
                                            z7 = false;
                                            c10 = 'd';
                                            break;
                                        case 101:
                                            z7 = false;
                                            c10 = 'e';
                                            break;
                                        case 102:
                                            if (z9) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                        default:
                                            z7 = false;
                                            break;
                                    }
                                } else {
                                    z7 = false;
                                    z11 = true;
                                    break;
                                }
                            } else {
                                if (decodeCode < 10) {
                                    sb.append('0');
                                }
                                sb.append(decodeCode);
                            }
                            z7 = false;
                        case 'd':
                            if (decodeCode < 96) {
                                if (z10 == z8) {
                                    sb.append((char) (decodeCode + 32));
                                } else {
                                    sb.append((char) (decodeCode + BDLocation.TypeCoarseLocation));
                                }
                                z7 = false;
                                z10 = false;
                                break;
                            } else {
                                if (decodeCode != 106) {
                                    z12 = false;
                                }
                                if (decodeCode != 106) {
                                    switch (decodeCode) {
                                        case 96:
                                        case 97:
                                        default:
                                            z7 = false;
                                            break;
                                        case 98:
                                            z7 = true;
                                            c10 = 'e';
                                            break;
                                        case 99:
                                            z7 = false;
                                            c10 = 'c';
                                            break;
                                        case 100:
                                            if (z8 || !z10) {
                                                if (z8) {
                                                }
                                                z7 = false;
                                                z10 = true;
                                                break;
                                            }
                                            z8 = true;
                                            z7 = false;
                                            z10 = false;
                                            break;
                                        case 101:
                                            z7 = false;
                                            c10 = 'e';
                                            break;
                                        case 102:
                                            if (z9) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            z7 = false;
                                            break;
                                    }
                                }
                                z11 = true;
                                z7 = false;
                            }
                            break;
                        case 'e':
                            if (decodeCode < 64) {
                                if (z10 == z8) {
                                    sb.append((char) (decodeCode + 32));
                                } else {
                                    sb.append((char) (decodeCode + BDLocation.TypeCoarseLocation));
                                }
                            } else if (decodeCode >= 96) {
                                if (decodeCode != 106) {
                                    z12 = false;
                                }
                                if (decodeCode != 106) {
                                    switch (decodeCode) {
                                        case 98:
                                            z7 = true;
                                            c10 = 'd';
                                            break;
                                        case 100:
                                            z7 = false;
                                            c10 = 'd';
                                            break;
                                        case 101:
                                            if (z8 || !z10) {
                                                if (z8) {
                                                }
                                                z7 = false;
                                                z10 = true;
                                                break;
                                            }
                                            z8 = true;
                                            break;
                                        case 102:
                                            if (z9) {
                                                if (sb.length() == 0) {
                                                    sb.append("]C1");
                                                } else {
                                                    sb.append((char) 29);
                                                }
                                            }
                                            z7 = false;
                                            break;
                                    }
                                }
                                z11 = true;
                                z7 = false;
                            } else if (z10 == z8) {
                                sb.append((char) (decodeCode - 64));
                            } else {
                                sb.append((char) (decodeCode + 64));
                            }
                            z7 = false;
                            z10 = false;
                            break;
                        default:
                            z7 = false;
                            break;
                    }
                    if (z13) {
                        c10 = c10 == 'e' ? 'd' : 'e';
                    }
                    z13 = z7;
                    i10 = 6;
                    i14 = i15;
                    i15 = i16;
                    i13 = i11;
                    i11 = decodeCode;
                    break;
            }
            while (!z11) {
            }
        }
        int i18 = i15 - i14;
        int nextUnset = bitArray.getNextUnset(i15);
        if (!bitArray.isRange(nextUnset, Math.min(bitArray.getSize(), ((nextUnset - i14) / 2) + nextUnset), false)) {
            throw NotFoundException.getNotFoundInstance();
        }
        int i19 = i13;
        if ((i9 - (i12 * i19)) % 103 != i19) {
            throw ChecksumException.getChecksumInstance();
        }
        int length = sb.length();
        if (length == 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        if (length > 0 && z12) {
            if (c10 == 'c') {
                sb.delete(length - 2, length);
            } else {
                sb.delete(length - 1, length);
            }
        }
        float f8 = (findStartPattern[1] + findStartPattern[0]) / 2.0f;
        float f9 = i14 + (i18 / 2.0f);
        int size = arrayList.size();
        byte[] bArr = new byte[size];
        for (int i20 = 0; i20 < size; i20++) {
            bArr[i20] = ((Byte) arrayList.get(i20)).byteValue();
        }
        float f10 = i8;
        return new Result(sb.toString(), bArr, new ResultPoint[]{new ResultPoint(f8, f10), new ResultPoint(f9, f10)}, BarcodeFormat.CODE_128);
    }
}
