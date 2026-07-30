package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class CharEscaper extends Escaper {
    private static final int DEST_PAD_MULTIPLIER = 2;

    protected CharEscaper() {
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
        for (int i8 = 0; i8 < length; i8++) {
            if (escape(str.charAt(i8)) != null) {
                return escapeSlow(str, i8);
            }
        }
        return str;
    }

    @CheckForNull
    protected abstract char[] escape(char c8);

    protected final String escapeSlow(String str, int i8) {
        int length = str.length();
        char[] charBufferFromThreadLocal = Platform.charBufferFromThreadLocal();
        int length2 = charBufferFromThreadLocal.length;
        int i9 = 0;
        int i10 = 0;
        while (i8 < length) {
            char[] escape = escape(str.charAt(i8));
            if (escape != null) {
                int length3 = escape.length;
                int i11 = i8 - i9;
                int i12 = i10 + i11;
                int i13 = i12 + length3;
                if (length2 < i13) {
                    length2 = ((length - i8) * 2) + i13;
                    charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i10, length2);
                }
                if (i11 > 0) {
                    str.getChars(i9, i8, charBufferFromThreadLocal, i10);
                    i10 = i12;
                }
                if (length3 > 0) {
                    System.arraycopy(escape, 0, charBufferFromThreadLocal, i10, length3);
                    i10 += length3;
                }
                i9 = i8 + 1;
            }
            i8++;
        }
        int i14 = length - i9;
        if (i14 > 0) {
            int i15 = i14 + i10;
            if (length2 < i15) {
                charBufferFromThreadLocal = growBuffer(charBufferFromThreadLocal, i10, i15);
            }
            str.getChars(i9, length, charBufferFromThreadLocal, i10);
            i10 = i15;
        }
        return new String(charBufferFromThreadLocal, 0, i10);
    }
}
