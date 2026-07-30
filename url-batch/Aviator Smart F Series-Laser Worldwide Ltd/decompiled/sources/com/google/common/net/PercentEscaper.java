package com.google.common.net;

import cn.hutool.core.text.l;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.escape.UnicodeEscaper;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class PercentEscaper extends UnicodeEscaper {
    private static final char[] PLUS_SIGN = {'+'};
    private static final char[] UPPER_HEX_DIGITS = "0123456789ABCDEF".toCharArray();
    private final boolean plusForSpace;
    private final boolean[] safeOctets;

    public PercentEscaper(String str, boolean z7) {
        Preconditions.checkNotNull(str);
        if (str.matches(".*[0-9A-Za-z].*")) {
            throw new IllegalArgumentException("Alphanumeric characters are always 'safe' and should not be explicitly specified");
        }
        String concat = str.concat("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
        if (z7 && concat.contains(l.SPACE)) {
            throw new IllegalArgumentException("plusForSpace cannot be specified when space is a 'safe' character");
        }
        this.plusForSpace = z7;
        this.safeOctets = createSafeOctets(concat);
    }

    private static boolean[] createSafeOctets(String str) {
        char[] charArray = str.toCharArray();
        int i8 = -1;
        for (char c8 : charArray) {
            i8 = Math.max((int) c8, i8);
        }
        boolean[] zArr = new boolean[i8 + 1];
        for (char c9 : charArray) {
            zArr[c9] = true;
        }
        return zArr;
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        for (int i8 = 0; i8 < length; i8++) {
            char charAt = str.charAt(i8);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                return escapeSlow(str, i8);
            }
        }
        return str;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    protected int nextEscapeIndex(CharSequence charSequence, int i8, int i9) {
        Preconditions.checkNotNull(charSequence);
        while (i8 < i9) {
            char charAt = charSequence.charAt(i8);
            boolean[] zArr = this.safeOctets;
            if (charAt >= zArr.length || !zArr[charAt]) {
                break;
            }
            i8++;
        }
        return i8;
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @CheckForNull
    protected char[] escape(int i8) {
        boolean[] zArr = this.safeOctets;
        if (i8 < zArr.length && zArr[i8]) {
            return null;
        }
        if (i8 == 32 && this.plusForSpace) {
            return PLUS_SIGN;
        }
        if (i8 <= 127) {
            char[] cArr = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr[i8 >>> 4], cArr[i8 & 15]};
        }
        if (i8 <= 2047) {
            char[] cArr2 = UPPER_HEX_DIGITS;
            return new char[]{'%', cArr2[(i8 >>> 10) | 12], cArr2[(i8 >>> 6) & 15], '%', cArr2[((i8 >>> 4) & 3) | 8], cArr2[i8 & 15]};
        }
        if (i8 <= 65535) {
            char[] cArr3 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'E', cArr3[i8 >>> 12], '%', cArr3[((i8 >>> 10) & 3) | 8], cArr3[(i8 >>> 6) & 15], '%', cArr3[((i8 >>> 4) & 3) | 8], cArr3[i8 & 15]};
        }
        if (i8 <= 1114111) {
            char[] cArr4 = UPPER_HEX_DIGITS;
            return new char[]{'%', 'F', cArr4[(i8 >>> 18) & 7], '%', cArr4[((i8 >>> 16) & 3) | 8], cArr4[(i8 >>> 12) & 15], '%', cArr4[((i8 >>> 10) & 3) | 8], cArr4[(i8 >>> 6) & 15], '%', cArr4[((i8 >>> 4) & 3) | 8], cArr4[i8 & 15]};
        }
        StringBuilder sb = new StringBuilder(43);
        sb.append("Invalid unicode character value ");
        sb.append(i8);
        throw new IllegalArgumentException(sb.toString());
    }
}
