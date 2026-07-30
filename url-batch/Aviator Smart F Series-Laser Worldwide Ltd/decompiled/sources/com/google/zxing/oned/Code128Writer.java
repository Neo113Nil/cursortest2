package com.google.zxing.oned;

import com.crrepa.band.my.model.db.proxy.GpsTrainingDaoProxy;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.common.BitMatrix;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
public final class Code128Writer extends OneDimensionalCodeWriter {
    private static final int CODE_CODE_A = 101;
    private static final int CODE_CODE_B = 100;
    private static final int CODE_CODE_C = 99;
    private static final int CODE_FNC_1 = 102;
    private static final int CODE_FNC_2 = 97;
    private static final int CODE_FNC_3 = 96;
    private static final int CODE_FNC_4_A = 101;
    private static final int CODE_FNC_4_B = 100;
    private static final int CODE_START_A = 103;
    private static final int CODE_START_B = 104;
    private static final int CODE_START_C = 105;
    private static final int CODE_STOP = 106;
    private static final char ESCAPE_FNC_1 = 241;
    private static final char ESCAPE_FNC_2 = 242;
    private static final char ESCAPE_FNC_3 = 243;
    private static final char ESCAPE_FNC_4 = 244;

    private enum CType {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int chooseCode(CharSequence charSequence, int i8, int i9) {
        CType findCType;
        CType findCType2;
        char charAt;
        CType findCType3 = findCType(charSequence, i8);
        CType cType = CType.ONE_DIGIT;
        if (findCType3 == cType) {
            return 100;
        }
        CType cType2 = CType.UNCODABLE;
        if (findCType3 == cType2) {
            return (i8 >= charSequence.length() || ((charAt = charSequence.charAt(i8)) >= ' ' && (i9 != 101 || charAt >= '`'))) ? 100 : 101;
        }
        if (i9 == 99) {
            return 99;
        }
        if (i9 != 100) {
            if (findCType3 == CType.FNC_1) {
                findCType3 = findCType(charSequence, i8 + 1);
            }
            return findCType3 == CType.TWO_DIGITS ? 99 : 100;
        }
        CType cType3 = CType.FNC_1;
        if (findCType3 == cType3 || (findCType = findCType(charSequence, i8 + 2)) == cType2 || findCType == cType) {
            return 100;
        }
        if (findCType == cType3) {
            return findCType(charSequence, i8 + 3) == CType.TWO_DIGITS ? 99 : 100;
        }
        int i10 = i8 + 4;
        while (true) {
            findCType2 = findCType(charSequence, i10);
            if (findCType2 != CType.TWO_DIGITS) {
                break;
            }
            i10 += 2;
        }
        return findCType2 == CType.ONE_DIGIT ? 100 : 99;
    }

    private static CType findCType(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        if (i8 >= length) {
            return CType.UNCODABLE;
        }
        char charAt = charSequence.charAt(i8);
        if (charAt == 241) {
            return CType.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return CType.UNCODABLE;
        }
        int i9 = i8 + 1;
        if (i9 >= length) {
            return CType.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i9);
        return (charAt2 < '0' || charAt2 > '9') ? CType.ONE_DIGIT : CType.TWO_DIGITS;
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter, com.google.zxing.Writer
    public BitMatrix encode(String str, BarcodeFormat barcodeFormat, int i8, int i9, Map<EncodeHintType, ?> map) {
        if (barcodeFormat == BarcodeFormat.CODE_128) {
            return super.encode(str, barcodeFormat, i8, i9, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_128, but got ".concat(String.valueOf(barcodeFormat)));
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int length = str.length();
        if (length > 0 && length <= 80) {
            int i8 = 0;
            for (int i9 = 0; i9 < length; i9++) {
                char charAt = str.charAt(i9);
                switch (charAt) {
                    case GpsTrainingDaoProxy.GPS_TYPE /* 241 */:
                    case 242:
                    case 243:
                    case 244:
                        break;
                    default:
                        if (charAt > 127) {
                            throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                        }
                        break;
                }
            }
            ArrayList<int[]> arrayList = new ArrayList();
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 1;
            while (true) {
                int i14 = 103;
                if (i10 < length) {
                    int chooseCode = chooseCode(str, i10, i12);
                    int i15 = 100;
                    if (chooseCode == i12) {
                        switch (str.charAt(i10)) {
                            case GpsTrainingDaoProxy.GPS_TYPE /* 241 */:
                                i15 = 102;
                                break;
                            case 242:
                                i15 = 97;
                                break;
                            case 243:
                                i15 = 96;
                                break;
                            case 244:
                                if (i12 == 101) {
                                    i15 = 101;
                                    break;
                                }
                                break;
                            default:
                                if (i12 != 100) {
                                    if (i12 != 101) {
                                        i15 = Integer.parseInt(str.substring(i10, i10 + 2));
                                        i10++;
                                        break;
                                    } else {
                                        char charAt2 = str.charAt(i10);
                                        i15 = charAt2 - ' ';
                                        if (i15 < 0) {
                                            i15 = charAt2 + '@';
                                            break;
                                        }
                                    }
                                } else {
                                    i15 = str.charAt(i10) - ' ';
                                    break;
                                }
                                break;
                        }
                        i10++;
                    } else {
                        if (i12 != 0) {
                            i14 = chooseCode;
                        } else if (chooseCode == 100) {
                            i14 = 104;
                        } else if (chooseCode != 101) {
                            i14 = 105;
                        }
                        i15 = i14;
                        i12 = chooseCode;
                    }
                    arrayList.add(Code128Reader.CODE_PATTERNS[i15]);
                    i11 += i15 * i13;
                    if (i10 != 0) {
                        i13++;
                    }
                } else {
                    int[][] iArr = Code128Reader.CODE_PATTERNS;
                    arrayList.add(iArr[i11 % 103]);
                    arrayList.add(iArr[106]);
                    int i16 = 0;
                    for (int[] iArr2 : arrayList) {
                        for (int i17 : iArr2) {
                            i16 += i17;
                        }
                    }
                    boolean[] zArr = new boolean[i16];
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        i8 += OneDimensionalCodeWriter.appendPattern(zArr, i8, (int[]) it.next(), true);
                    }
                    return zArr;
                }
            }
        } else {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
    }
}
