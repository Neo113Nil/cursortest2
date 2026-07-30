package com.google.zxing.pdf417.encoder;

import a4.a;
import com.google.zxing.WriterException;
import com.google.zxing.common.CharacterSetECI;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* loaded from: classes4.dex */
final class PDF417HighLevelEncoder {
    private static final int BYTE_COMPACTION = 1;
    private static final int ECI_CHARSET = 927;
    private static final int ECI_GENERAL_PURPOSE = 926;
    private static final int ECI_USER_DEFINED = 925;
    private static final int LATCH_TO_BYTE = 924;
    private static final int LATCH_TO_BYTE_PADDED = 901;
    private static final int LATCH_TO_NUMERIC = 902;
    private static final int LATCH_TO_TEXT = 900;
    private static final byte[] MIXED;
    private static final int NUMERIC_COMPACTION = 2;
    private static final int SHIFT_TO_BYTE = 913;
    private static final int SUBMODE_ALPHA = 0;
    private static final int SUBMODE_LOWER = 1;
    private static final int SUBMODE_MIXED = 2;
    private static final int SUBMODE_PUNCTUATION = 3;
    private static final int TEXT_COMPACTION = 0;
    private static final byte[] TEXT_MIXED_RAW = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, a.f50j0, 13, 9, a.f72p0, a.C0, 35, 45, a.f78r0, 36, 47, 43, 37, a.f66n0, 61, 94, 0, 32, 0, 0, 0};
    private static final byte[] TEXT_PUNCTUATION_RAW = {a.D0, 60, a.G0, 64, 91, a.U0, a.V0, 95, a.W0, a.f97x1, 33, 13, 9, a.f72p0, a.C0, 10, 45, a.f78r0, 36, 47, 34, a.f91v1, a.f66n0, a.f58l0, 41, 63, a.f88u1, a.f85t1, 39, 0};
    private static final byte[] PUNCTUATION = new byte[128];
    private static final Charset DEFAULT_ENCODING = StandardCharsets.ISO_8859_1;

    /* renamed from: com.google.zxing.pdf417.encoder.PDF417HighLevelEncoder$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$zxing$pdf417$encoder$Compaction;

        static {
            int[] iArr = new int[Compaction.values().length];
            $SwitchMap$com$google$zxing$pdf417$encoder$Compaction = iArr;
            try {
                iArr[Compaction.TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$zxing$pdf417$encoder$Compaction[Compaction.NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        byte[] bArr = new byte[128];
        MIXED = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i8 = 0;
        int i9 = 0;
        while (true) {
            byte[] bArr2 = TEXT_MIXED_RAW;
            if (i9 >= bArr2.length) {
                break;
            }
            byte b8 = bArr2[i9];
            if (b8 > 0) {
                MIXED[b8] = (byte) i9;
            }
            i9++;
        }
        Arrays.fill(PUNCTUATION, (byte) -1);
        while (true) {
            byte[] bArr3 = TEXT_PUNCTUATION_RAW;
            if (i8 >= bArr3.length) {
                return;
            }
            byte b9 = bArr3[i8];
            if (b9 > 0) {
                PUNCTUATION[b9] = (byte) i8;
            }
            i8++;
        }
    }

    private PDF417HighLevelEncoder() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0028, code lost:
    
        return r1 - r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int determineConsecutiveBinaryCount(String str, int i8, Charset charset) {
        int i9;
        CharsetEncoder newEncoder = charset.newEncoder();
        int length = str.length();
        int i10 = i8;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            int i11 = 0;
            while (i11 < 13 && isDigit(charAt) && (i9 = i10 + (i11 = i11 + 1)) < length) {
                charAt = str.charAt(i9);
            }
            char charAt2 = str.charAt(i10);
            if (!newEncoder.canEncode(charAt2)) {
                throw new WriterException("Non-encodable character detected: " + charAt2 + " (Unicode: " + ((int) charAt2) + ')');
            }
            i10++;
        }
        return i10 - i8;
    }

    private static int determineConsecutiveDigitCount(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = 0;
        if (i8 < length) {
            char charAt = charSequence.charAt(i8);
            while (isDigit(charAt) && i8 < length) {
                i9++;
                i8++;
                if (i8 < length) {
                    charAt = charSequence.charAt(i8);
                }
            }
        }
        return i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0027, code lost:
    
        return (r1 - r7) - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int determineConsecutiveTextCount(CharSequence charSequence, int i8) {
        int length = charSequence.length();
        int i9 = i8;
        while (i9 < length) {
            char charAt = charSequence.charAt(i9);
            int i10 = 0;
            while (i10 < 13 && isDigit(charAt) && i9 < length) {
                i10++;
                i9++;
                if (i9 < length) {
                    charAt = charSequence.charAt(i9);
                }
            }
            if (i10 <= 0) {
                if (!isText(charSequence.charAt(i9))) {
                    break;
                }
                i9++;
            }
        }
        return i9 - i8;
    }

    private static void encodeBinary(byte[] bArr, int i8, int i9, int i10, StringBuilder sb) {
        int i11;
        if (i9 == 1 && i10 == 0) {
            sb.append((char) 913);
        } else if (i9 % 6 == 0) {
            sb.append((char) 924);
        } else {
            sb.append((char) 901);
        }
        if (i9 >= 6) {
            char[] cArr = new char[5];
            i11 = i8;
            while ((i8 + i9) - i11 >= 6) {
                long j8 = 0;
                for (int i12 = 0; i12 < 6; i12++) {
                    j8 = (j8 << 8) + (bArr[i11 + i12] & 255);
                }
                for (int i13 = 0; i13 < 5; i13++) {
                    cArr[i13] = (char) (j8 % 900);
                    j8 /= 900;
                }
                for (int i14 = 4; i14 >= 0; i14--) {
                    sb.append(cArr[i14]);
                }
                i11 += 6;
            }
        } else {
            i11 = i8;
        }
        while (i11 < i8 + i9) {
            sb.append((char) (bArr[i11] & 255));
            i11++;
        }
    }

    static String encodeHighLevel(String str, Compaction compaction, Charset charset) {
        CharacterSetECI characterSetECIByName;
        StringBuilder sb = new StringBuilder(str.length());
        if (charset == null) {
            charset = DEFAULT_ENCODING;
        } else if (!DEFAULT_ENCODING.equals(charset) && (characterSetECIByName = CharacterSetECI.getCharacterSetECIByName(charset.name())) != null) {
            encodingECI(characterSetECIByName.getValue(), sb);
        }
        int length = str.length();
        int i8 = AnonymousClass1.$SwitchMap$com$google$zxing$pdf417$encoder$Compaction[compaction.ordinal()];
        if (i8 == 1) {
            encodeText(str, 0, length, sb, 0);
        } else if (i8 == 2) {
            byte[] bytes = str.getBytes(charset);
            encodeBinary(bytes, 0, bytes.length, 1, sb);
        } else if (i8 != 3) {
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            while (i9 < length) {
                int determineConsecutiveDigitCount = determineConsecutiveDigitCount(str, i9);
                if (determineConsecutiveDigitCount >= 13) {
                    sb.append((char) 902);
                    encodeNumeric(str, i9, determineConsecutiveDigitCount, sb);
                    i9 += determineConsecutiveDigitCount;
                    i10 = 0;
                    i11 = 2;
                } else {
                    int determineConsecutiveTextCount = determineConsecutiveTextCount(str, i9);
                    if (determineConsecutiveTextCount >= 5 || determineConsecutiveDigitCount == length) {
                        if (i11 != 0) {
                            sb.append((char) 900);
                            i10 = 0;
                            i11 = 0;
                        }
                        i10 = encodeText(str, i9, determineConsecutiveTextCount, sb, i10);
                        i9 += determineConsecutiveTextCount;
                    } else {
                        int determineConsecutiveBinaryCount = determineConsecutiveBinaryCount(str, i9, charset);
                        if (determineConsecutiveBinaryCount == 0) {
                            determineConsecutiveBinaryCount = 1;
                        }
                        int i12 = determineConsecutiveBinaryCount + i9;
                        byte[] bytes2 = str.substring(i9, i12).getBytes(charset);
                        if (bytes2.length == 1 && i11 == 0) {
                            encodeBinary(bytes2, 0, 1, 0, sb);
                        } else {
                            encodeBinary(bytes2, 0, bytes2.length, i11, sb);
                            i10 = 0;
                            i11 = 1;
                        }
                        i9 = i12;
                    }
                }
            }
        } else {
            sb.append((char) 902);
            encodeNumeric(str, 0, length, sb);
        }
        return sb.toString();
    }

    private static void encodeNumeric(String str, int i8, int i9, StringBuilder sb) {
        StringBuilder sb2 = new StringBuilder((i9 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900L);
        BigInteger valueOf2 = BigInteger.valueOf(0L);
        int i10 = 0;
        while (i10 < i9) {
            sb2.setLength(0);
            int min = Math.min(44, i9 - i10);
            StringBuilder sb3 = new StringBuilder("1");
            int i11 = i8 + i10;
            sb3.append(str.substring(i11, i11 + min));
            BigInteger bigInteger = new BigInteger(sb3.toString());
            do {
                sb2.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb2.length() - 1; length >= 0; length--) {
                sb.append(sb2.charAt(length));
            }
            i10 += min;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00f4 A[EDGE_INSN: B:21:0x00f4->B:22:0x00f4 BREAK  A[LOOP:0: B:2:0x000f->B:16:0x000f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int encodeText(CharSequence charSequence, int i8, int i9, StringBuilder sb, int i10) {
        StringBuilder sb2 = new StringBuilder(i9);
        int i11 = i10;
        int i12 = 0;
        while (true) {
            int i13 = i8 + i12;
            char charAt = charSequence.charAt(i13);
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (isPunctuation(charAt)) {
                            sb2.append((char) PUNCTUATION[charAt]);
                        } else {
                            sb2.append((char) 29);
                            i11 = 0;
                        }
                    } else if (isMixed(charAt)) {
                        sb2.append((char) MIXED[charAt]);
                    } else if (isAlphaUpper(charAt)) {
                        sb2.append((char) 28);
                        i11 = 0;
                    } else if (isAlphaLower(charAt)) {
                        sb2.append((char) 27);
                        i11 = 1;
                    } else {
                        int i14 = i13 + 1;
                        if (i14 >= i9 || !isPunctuation(charSequence.charAt(i14))) {
                            sb2.append((char) 29);
                            sb2.append((char) PUNCTUATION[charAt]);
                        } else {
                            sb2.append((char) 25);
                            i11 = 3;
                        }
                    }
                } else if (isAlphaLower(charAt)) {
                    if (charAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (charAt - 'a'));
                    }
                } else if (isAlphaUpper(charAt)) {
                    sb2.append((char) 27);
                    sb2.append((char) (charAt - 'A'));
                } else if (isMixed(charAt)) {
                    sb2.append((char) 28);
                    i11 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) PUNCTUATION[charAt]);
                }
                i12++;
                if (i12 < i9) {
                    break;
                }
            } else {
                if (isAlphaUpper(charAt)) {
                    if (charAt == ' ') {
                        sb2.append((char) 26);
                    } else {
                        sb2.append((char) (charAt - 'A'));
                    }
                } else if (isAlphaLower(charAt)) {
                    sb2.append((char) 27);
                    i11 = 1;
                } else if (isMixed(charAt)) {
                    sb2.append((char) 28);
                    i11 = 2;
                } else {
                    sb2.append((char) 29);
                    sb2.append((char) PUNCTUATION[charAt]);
                }
                i12++;
                if (i12 < i9) {
                }
            }
        }
        int length = sb2.length();
        char c8 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            if (i15 % 2 != 0) {
                c8 = (char) ((c8 * 30) + sb2.charAt(i15));
                sb.append(c8);
            } else {
                c8 = sb2.charAt(i15);
            }
        }
        if (length % 2 != 0) {
            sb.append((char) ((c8 * 30) + 29));
        }
        return i11;
    }

    private static void encodingECI(int i8, StringBuilder sb) {
        if (i8 >= 0 && i8 < 900) {
            sb.append((char) 927);
            sb.append((char) i8);
        } else if (i8 < 810900) {
            sb.append((char) 926);
            sb.append((char) ((i8 / 900) - 1));
            sb.append((char) (i8 % 900));
        } else {
            if (i8 >= 811800) {
                throw new WriterException("ECI number not in valid range from 0..811799, but was ".concat(String.valueOf(i8)));
            }
            sb.append((char) 925);
            sb.append((char) (810900 - i8));
        }
    }

    private static boolean isAlphaLower(char c8) {
        if (c8 != ' ') {
            return c8 >= 'a' && c8 <= 'z';
        }
        return true;
    }

    private static boolean isAlphaUpper(char c8) {
        if (c8 != ' ') {
            return c8 >= 'A' && c8 <= 'Z';
        }
        return true;
    }

    private static boolean isDigit(char c8) {
        return c8 >= '0' && c8 <= '9';
    }

    private static boolean isMixed(char c8) {
        return MIXED[c8] != -1;
    }

    private static boolean isPunctuation(char c8) {
        return PUNCTUATION[c8] != -1;
    }

    private static boolean isText(char c8) {
        if (c8 == '\t' || c8 == '\n' || c8 == '\r') {
            return true;
        }
        return c8 >= ' ' && c8 <= '~';
    }
}
