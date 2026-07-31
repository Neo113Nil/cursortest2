package io.opentelemetry.api.internal;

import javax.annotation.CheckForNull;

/* loaded from: classes3.dex */
public final class PercentEscaper {
    private static final int DEST_PAD = 32;
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private static final String SAFE_CHARS = "-._~!$'()*&@:abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final boolean[] safeOctets = createSafeOctets(SAFE_CHARS);

    public static PercentEscaper create() {
        return new PercentEscaper();
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int i = -1;
        for (char c : charArray) {
            i = Math.max((int) c, i);
        }
        boolean[] zArr = new boolean[i + 1];
        for (char c2 : charArray) {
            zArr[c2] = true;
        }
        return zArr;
    }

    public String escape(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            boolean[] zArr = safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(str, i);
            }
        }
        return str;
    }

    private static String escapeSlow(String str, int i) {
        int length = str.length();
        char[] chars = TemporaryBuffers.chars(1024);
        int i2 = 0;
        int i3 = 0;
        while (i < length) {
            int codePointAt = codePointAt(str, i, length);
            if (codePointAt < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] escape = escape(codePointAt);
            int i4 = (Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1) + i;
            if (escape != null) {
                int i5 = i - i2;
                int i6 = i3 + i5;
                int length2 = escape.length + i6;
                if (chars.length < length2) {
                    chars = growBuffer(chars, i3, length2 + (length - i) + 32);
                }
                if (i5 > 0) {
                    str.getChars(i2, i, chars, i3);
                    i3 = i6;
                }
                if (escape.length > 0) {
                    System.arraycopy(escape, 0, chars, i3, escape.length);
                    i3 += escape.length;
                }
                i2 = i4;
            }
            i = nextEscapeIndex(str, i4, length);
        }
        int i7 = length - i2;
        if (i7 > 0) {
            int i8 = i7 + i3;
            if (chars.length < i8) {
                chars = growBuffer(chars, i3, i8);
            }
            str.getChars(i2, length, chars, i3);
            i3 = i8;
        }
        return new String(chars, 0, i3);
    }

    private static int nextEscapeIndex(CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            char charAt = charSequence.charAt(i);
            boolean[] zArr = safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i++;
        }
        return i;
    }

    @CheckForNull
    private static char[] escape(int i) {
        boolean[] zArr = safeOctets;
        if (i < zArr.length && zArr[i]) {
            return null;
        }
        if (i <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[i >>> 4], cArr[i & 15]};
        }
        if (i <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr2[(i >>> 10) | 12], cArr2[(i >>> 6) & 15], '%', cArr2[((i >>> 4) & 3) | 8], cArr2[i & 15]};
        }
        if (i <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'E', cArr3[i >>> 12], '%', cArr3[((i >>> 10) & 3) | 8], cArr3[(i >>> 6) & 15], '%', cArr3[((i >>> 4) & 3) | 8], cArr3[i & 15]};
        }
        if (i <= 1114111) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'F', cArr4[(i >>> 18) & 7], '%', cArr4[((i >>> 16) & 3) | 8], cArr4[(i >>> 12) & 15], '%', cArr4[((i >>> 10) & 3) | 8], cArr4[(i >>> 6) & 15], '%', cArr4[((i >>> 4) & 3) | 8], cArr4[i & 15]};
        }
        throw new IllegalArgumentException("Invalid unicode character value " + i);
    }

    private static int codePointAt(CharSequence charSequence, int i, int i2) {
        if (i < i2) {
            int i3 = i + 1;
            char charAt = charSequence.charAt(i);
            if (charAt < 55296 || charAt > 57343) {
                return charAt;
            }
            if (charAt > 56319) {
                throw new IllegalArgumentException("Unexpected low surrogate character '" + charAt + "' with value " + ((int) charAt) + " at index " + i + " in '" + ((Object) charSequence) + "'");
            }
            if (i3 == i2) {
                return -charAt;
            }
            char charAt2 = charSequence.charAt(i3);
            if (Character.isLowSurrogate(charAt2)) {
                return Character.toCodePoint(charAt, charAt2);
            }
            throw new IllegalArgumentException("Expected low surrogate but got char '" + charAt2 + "' with value " + ((int) charAt2) + " at index " + i3 + " in '" + ((Object) charSequence) + "'");
        }
        throw new IndexOutOfBoundsException("Index exceeds specified range");
    }

    private static char[] growBuffer(char[] cArr, int i, int i2) {
        if (i2 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i2];
        if (i > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i);
        }
        return cArr2;
    }
}
