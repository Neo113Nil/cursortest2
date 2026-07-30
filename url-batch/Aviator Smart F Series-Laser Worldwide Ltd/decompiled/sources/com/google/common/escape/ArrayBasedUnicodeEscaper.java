package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ArrayBasedUnicodeEscaper extends UnicodeEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final int safeMax;
    private final char safeMaxChar;
    private final int safeMin;
    private final char safeMinChar;

    protected ArrayBasedUnicodeEscaper(Map<Character, String> map, int i8, int i9, String str) {
        this(ArrayBasedEscaperMap.create(map), i8, i9, str);
    }

    @Override // com.google.common.escape.UnicodeEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if ((charAt < this.replacementsLength && this.replacements[charAt] != null) || charAt > this.safeMaxChar || charAt < this.safeMinChar) {
                return escapeSlow(str, i8);
            }
        }
        return str;
    }

    @CheckForNull
    protected abstract char[] escapeUnsafe(int i8);

    @Override // com.google.common.escape.UnicodeEscaper
    protected final int nextEscapeIndex(CharSequence charSequence, int i8, int i9) {
        while (i8 < i9) {
            char charAt = charSequence.charAt(i8);
            if ((charAt < this.replacementsLength && this.replacements[charAt] != null) || charAt > this.safeMaxChar || charAt < this.safeMinChar) {
                break;
            }
            i8++;
        }
        return i8;
    }

    protected ArrayBasedUnicodeEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, int i8, int i9, String str) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (i9 < i8) {
            i9 = -1;
            i8 = Integer.MAX_VALUE;
        }
        this.safeMin = i8;
        this.safeMax = i9;
        if (i8 >= 55296) {
            this.safeMinChar = (char) 65535;
            this.safeMaxChar = (char) 0;
        } else {
            this.safeMinChar = (char) i8;
            this.safeMaxChar = (char) Math.min(i9, 55295);
        }
    }

    @Override // com.google.common.escape.UnicodeEscaper
    @CheckForNull
    protected final char[] escape(int i8) {
        char[] cArr;
        if (i8 < this.replacementsLength && (cArr = this.replacements[i8]) != null) {
            return cArr;
        }
        if (i8 < this.safeMin || i8 > this.safeMax) {
            return escapeUnsafe(i8);
        }
        return null;
    }
}
