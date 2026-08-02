package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hse {
    private static final char[] b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static final gyv c = gyv.k("-_.*").e(new gym('0', '9')).e(new gym('A', 'Z')).e(new gym('a', 'z'));
    public static final Charset a = StandardCharsets.UTF_8;

    public static String a(String str, Charset charset) {
        char c2;
        char c3;
        char c4;
        int i;
        int i2;
        char[] cArr;
        if (charset.equals(a)) {
            hnu hnuVar = hsb.a;
            str.getClass();
            int i3 = 0;
            while (i3 < str.length()) {
                char charAt = str.charAt(i3);
                hsc hscVar = (hsc) hnuVar;
                boolean[] zArr = hscVar.d;
                if (charAt >= zArr.length || !zArr[charAt]) {
                    int length = str.length();
                    char[] a2 = hjx.a();
                    int i4 = 0;
                    int i5 = 0;
                    while (i3 < length) {
                        if (i3 >= length) {
                            throw new IndexOutOfBoundsException("Index exceeds specified range");
                        }
                        int i6 = i3 + 1;
                        char charAt2 = str.charAt(i3);
                        if (charAt2 < 55296 || charAt2 > 57343) {
                            c3 = 1;
                            c4 = '%';
                            i = 0;
                            i2 = charAt2;
                        } else {
                            c3 = 1;
                            c4 = '%';
                            i = 0;
                            if (charAt2 > 56319) {
                                throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3 + " in '" + str + "'");
                            }
                            if (i6 == length) {
                                i2 = -charAt2;
                            } else {
                                char charAt3 = str.charAt(i6);
                                if (!Character.isLowSurrogate(charAt3)) {
                                    throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt3 + "' with value " + ((int) charAt3) + " at index " + i6 + " in '" + str + "'");
                                }
                                i2 = Character.toCodePoint(charAt2, charAt3);
                            }
                        }
                        if (i2 < 0) {
                            throw new IllegalArgumentException("Trailing high surrogate at end of input");
                        }
                        if (i2 < zArr.length && zArr[i2]) {
                            cArr = null;
                        } else if (i2 == 32 && hscVar.c) {
                            cArr = hsc.a;
                        } else if (i2 <= 127) {
                            cArr = new char[3];
                            cArr[i] = c4;
                            char[] cArr2 = hsc.b;
                            cArr[2] = cArr2[i2 & 15];
                            cArr[c3] = cArr2[i2 >>> 4];
                        } else if (i2 <= 2047) {
                            cArr = new char[6];
                            cArr[i] = c4;
                            cArr[3] = c4;
                            char[] cArr3 = hsc.b;
                            cArr[5] = cArr3[i2 & 15];
                            cArr[4] = cArr3[(3 & (i2 >>> 4)) | 8];
                            cArr[2] = cArr3[(i2 >>> 6) & 15];
                            cArr[c3] = cArr3[(i2 >>> 10) | 12];
                        } else if (i2 <= 65535) {
                            cArr = new char[9];
                            cArr[i] = c4;
                            cArr[c3] = 'E';
                            cArr[3] = c4;
                            cArr[6] = c4;
                            char[] cArr4 = hsc.b;
                            cArr[8] = cArr4[i2 & 15];
                            cArr[7] = cArr4[((i2 >>> 4) & 3) | 8];
                            cArr[5] = cArr4[(i2 >>> 6) & 15];
                            cArr[4] = cArr4[((i2 >>> 10) & 3) | 8];
                            cArr[2] = cArr4[i2 >>> 12];
                        } else {
                            if (i2 > 1114111) {
                                throw new IllegalArgumentException(a.Y(i2, "Invalid unicode character value "));
                            }
                            cArr = new char[12];
                            cArr[i] = c4;
                            cArr[c3] = 'F';
                            cArr[3] = c4;
                            cArr[6] = c4;
                            cArr[9] = c4;
                            char[] cArr5 = hsc.b;
                            cArr[11] = cArr5[i2 & 15];
                            cArr[10] = cArr5[((i2 >>> 4) & 3) | 8];
                            cArr[8] = cArr5[(i2 >>> 6) & 15];
                            cArr[7] = cArr5[((i2 >>> 10) & 3) | 8];
                            cArr[5] = cArr5[(i2 >>> 12) & 15];
                            cArr[4] = cArr5[((i2 >>> 16) & 3) | 8];
                            cArr[2] = cArr5[i2 >>> 18];
                        }
                        int charCount = Character.charCount(i2) + i3;
                        if (cArr != null) {
                            int i7 = i3 - i4;
                            int i8 = i5 + i7;
                            int length2 = a2.length;
                            int length3 = cArr.length;
                            int i9 = i8 + length3;
                            if (length2 < i9) {
                                a2 = hnu.f(a2, i5, i9 + (length - i3) + 32);
                            }
                            if (i7 > 0) {
                                str.getChars(i4, i3, a2, i5);
                                i5 = i8;
                            }
                            System.arraycopy(cArr, i, a2, i5, length3);
                            i5 += length3;
                            i4 = charCount;
                        }
                        i3 = charCount;
                        while (i3 < length) {
                            char charAt4 = str.charAt(i3);
                            if (charAt4 < zArr.length && zArr[charAt4]) {
                                i3++;
                            }
                        }
                    }
                    int i10 = length - i4;
                    if (i10 > 0) {
                        int i11 = i10 + i5;
                        if (a2.length < i11) {
                            a2 = hnu.f(a2, i5, i11);
                        }
                        str.getChars(i4, length, a2, i5);
                        i5 = i11;
                    }
                    return new String(a2, 0, i5);
                }
                i3++;
            }
        } else {
            boolean z = false;
            char c5 = '%';
            int length4 = str.length();
            StringBuilder sb = new StringBuilder(length4 + length4);
            byte[] bytes = str.getBytes(charset);
            int length5 = bytes.length;
            int i12 = 0;
            int i13 = 0;
            while (i12 < length5) {
                byte b2 = bytes[i12];
                int i14 = b2 & 255;
                char c6 = (char) i14;
                if (c.c(c6)) {
                    sb.append(c6);
                    i13++;
                } else if (i14 == 32) {
                    sb.append('+');
                    i13++;
                    z = true;
                } else {
                    c2 = c5;
                    sb.append(c2);
                    char[] cArr6 = b;
                    sb.append(cArr6[i14 >> 4]);
                    sb.append(cArr6[b2 & 15]);
                    i13 += 3;
                    i12++;
                    c5 = c2;
                }
                c2 = c5;
                i12++;
                c5 = c2;
            }
            if (z || i13 != str.length()) {
                return sb.toString();
            }
        }
        return str;
    }
}
