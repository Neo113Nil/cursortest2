package com.google.zxing.common;

import com.google.common.primitives.UnsignedBytes;
import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* loaded from: classes4.dex */
public final class StringUtils {
    private static final boolean ASSUME_SHIFT_JIS;
    private static final String EUC_JP = "EUC_JP";
    public static final String GB2312 = "GB2312";
    private static final String ISO88591 = "ISO8859_1";
    private static final String PLATFORM_DEFAULT_ENCODING;
    public static final String SHIFT_JIS = "SJIS";
    private static final String UTF8 = "UTF8";

    static {
        String name = Charset.defaultCharset().name();
        PLATFORM_DEFAULT_ENCODING = name;
        ASSUME_SHIFT_JIS = SHIFT_JIS.equalsIgnoreCase(name) || EUC_JP.equalsIgnoreCase(name);
    }

    private StringUtils() {
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x00f6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String guessEncoding(byte[] bArr, Map<DecodeHintType, ?> map) {
        int i8;
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return map.get(decodeHintType).toString();
            }
        }
        int length = bArr2.length;
        boolean z7 = true;
        int i9 = 0;
        boolean z8 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        int i10 = 0;
        boolean z9 = true;
        boolean z10 = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        while (i11 < length && (z7 || z9 || z10)) {
            byte b8 = bArr2[i11];
            int i21 = b8 & 255;
            if (z10) {
                if (i12 <= 0) {
                    i8 = length;
                    if ((b8 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                        if ((b8 & 64) != 0) {
                            int i22 = i12 + 1;
                            if ((b8 & 32) == 0) {
                                i14++;
                            } else {
                                i22 = i12 + 2;
                                if ((b8 & 16) == 0) {
                                    i15++;
                                } else {
                                    i12 += 3;
                                    if ((b8 & 8) == 0) {
                                        i16++;
                                    }
                                }
                            }
                            i12 = i22;
                        }
                    }
                    if (z7) {
                        if (i21 > 127 && i21 < 160) {
                            z7 = false;
                        } else if (i21 > 159 && (i21 < 192 || i21 == 215 || i21 == 247)) {
                            i18++;
                        }
                    }
                    if (z9) {
                        if (i13 > 0) {
                            if (i21 >= 64 && i21 != 127 && i21 <= 252) {
                                i13--;
                            }
                            z9 = false;
                        } else {
                            if (i21 != 128 && i21 != 160 && i21 <= 239) {
                                if (i21 <= 160 || i21 >= 224) {
                                    if (i21 > 127) {
                                        i13++;
                                        int i23 = i19 + 1;
                                        if (i23 > i9) {
                                            i9 = i23;
                                            i19 = i9;
                                        } else {
                                            i19 = i23;
                                        }
                                    } else {
                                        i19 = 0;
                                    }
                                    i20 = 0;
                                } else {
                                    i10++;
                                    int i24 = i20 + 1;
                                    if (i24 > i17) {
                                        i17 = i24;
                                        i20 = i17;
                                    } else {
                                        i20 = i24;
                                    }
                                    i19 = 0;
                                }
                            }
                            z9 = false;
                        }
                    }
                    i11++;
                    bArr2 = bArr;
                    length = i8;
                } else if ((b8 & UnsignedBytes.MAX_POWER_OF_TWO) != 0) {
                    i12--;
                } else {
                    i8 = length;
                }
                z10 = false;
                if (z7) {
                }
                if (z9) {
                }
                i11++;
                bArr2 = bArr;
                length = i8;
            }
            i8 = length;
            if (z7) {
            }
            if (z9) {
            }
            i11++;
            bArr2 = bArr;
            length = i8;
        }
        int i25 = length;
        if (z10 && i12 > 0) {
            z10 = false;
        }
        if (z9 && i13 > 0) {
            z9 = false;
        }
        return (!z10 || (!z8 && (i14 + i15) + i16 <= 0)) ? (!z9 || (!ASSUME_SHIFT_JIS && i17 < 3 && i9 < 3)) ? (z7 && z9) ? (!(i17 == 2 && i10 == 2) && i18 * 10 < i25) ? ISO88591 : SHIFT_JIS : z7 ? ISO88591 : z9 ? SHIFT_JIS : z10 ? UTF8 : PLATFORM_DEFAULT_ENCODING : SHIFT_JIS : UTF8;
    }
}
