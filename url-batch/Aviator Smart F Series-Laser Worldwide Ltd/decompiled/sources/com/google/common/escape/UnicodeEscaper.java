package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class UnicodeEscaper extends Escaper {
    private static final int DEST_PAD = 32;

    protected UnicodeEscaper() {
    }

    protected static int codePointAt(CharSequence charSequence, int i8, int i9) {
        Preconditions.checkNotNull(charSequence);
        if (i8 >= i9) {
            throw new IndexOutOfBoundsException("Index exceeds specified range");
        }
        int i10 = i8 + 1;
        char charAt = charSequence.charAt(i8);
        if (charAt < 55296 || charAt > 57343) {
            return charAt;
        }
        if (charAt > 56319) {
            String valueOf = String.valueOf(charSequence);
            StringBuilder sb = new StringBuilder(valueOf.length() + 88);
            sb.append("Unexpected low surrogate character '");
            sb.append(charAt);
            sb.append("' with value ");
            sb.append((int) charAt);
            sb.append(" at index ");
            sb.append(i8);
            sb.append(" in '");
            sb.append(valueOf);
            sb.append("'");
            throw new IllegalArgumentException(sb.toString());
        }
        if (i10 == i9) {
            return -charAt;
        }
        char charAt2 = charSequence.charAt(i10);
        if (Character.isLowSurrogate(charAt2)) {
            return Character.toCodePoint(charAt, charAt2);
        }
        String valueOf2 = String.valueOf(charSequence);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 89);
        sb2.append("Expected low surrogate but got char '");
        sb2.append(charAt2);
        sb2.append("' with value ");
        sb2.append((int) charAt2);
        sb2.append(" at index ");
        sb2.append(i10);
        sb2.append(" in '");
        sb2.append(valueOf2);
        sb2.append("'");
        throw new IllegalArgumentException(sb2.toString());
    }

    private static char[] growBuffer(char[] cArr, int i8, int i9) {
        if (i9 < 0) {
            throw new AssertionError("Cannot increase internal buffer any further");
        }
        char[] cArr2 = new char[i9];
        if (i8 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i8);
        }
        return cArr2;
    }

    @Override // com.google.common.escape.Escaper
    public String escape(String str) {
        Preconditions.checkNotNull(str);
        int length = str.length();
        int nextEscapeIndex = nextEscapeIndex(str, 0, length);
        return nextEscapeIndex == length ? str : escapeSlow(str, nextEscapeIndex);
    }

    @CheckForNull
    protected abstract char[] escape(int i8);

    protected final String escapeSlow(String str, int i8) {
        int length = str.length();
        char[] charBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            int codePointAt = codePointAt(str, i8, length);
            if (codePointAt < 0) {
                throw new IllegalArgumentException("Trailing high surrogate at end of input");
            }
            char[] escape = escape(codePointAt);
            int i11 = (Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1) + i8;
            if (escape != null) {
                int i12 = i8 - i9;
                int i13 = i10 + i12;
                int length2 = escape.length + i13;
                if (charBufferFromThreadLocal.length < length2) {
                    charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i10, length2 + (length - i8) + 32);
                }
                if (i12 > 0) {
                    str.getChars(i9, i8, charBufferFromThreadLocal, i10);
                    i10 = i13;
                }
                if (escape.length > 0) {
                    System.arraycopy(escape, 0, charBufferFromThreadLocal, i10, escape.length);
                    i10 += escape.length;
                }
                i9 = i11;
            }
            i8 = nextEscapeIndex(str, i11, length);
        }
        int i14 = length - i9;
        if (i14 > 0) {
            int i15 = i14 + i10;
            if (charBufferFromThreadLocal.length < i15) {
                charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i10, i15);
            }
            str.getChars(i9, length, charBufferFromThreadLocal, i10);
            i10 = i15;
        }
        return new String(charBufferFromThreadLocal, 0, i10);
    }

    protected int nextEscapeIndex(CharSequence charSequence, int i8, int i9) {
        while (i8 < i9) {
            int codePointAt = codePointAt(charSequence, i8, i9);
            if (codePointAt < 0 || escape(codePointAt) != null) {
                break;
            }
            i8 += Character.isSupplementaryCodePoint(codePointAt) ? 2 : 1;
        }
        return i8;
    }
}
