package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;
import javax.annotation.CheckForNull;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ArrayBasedCharEscaper extends CharEscaper {
    private final char[][] replacements;
    private final int replacementsLength;
    private final char safeMax;
    private final char safeMin;

    protected ArrayBasedCharEscaper(Map<Character, String> map, char c8, char c9) {
        this(ArrayBasedEscaperMap.create(map), c8, c9);
    }

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i8 = 0; i8 < str.length(); i8++) {
            char charAt = str.charAt(i8);
            if ((charAt < this.replacementsLength && this.replacements[charAt] != null) || charAt > this.safeMax || charAt < this.safeMin) {
                return escapeSlow(str, i8);
            }
        }
        return str;
    }

    @CheckForNull
    protected abstract char[] escapeUnsafe(char c8);

    protected ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c8, char c9) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] replacementArray = arrayBasedEscaperMap.getReplacementArray();
        this.replacements = replacementArray;
        this.replacementsLength = replacementArray.length;
        if (c9 < c8) {
            c9 = 0;
            c8 = 65535;
        }
        this.safeMin = c8;
        this.safeMax = c9;
    }

    @Override // com.google.common.escape.CharEscaper
    @CheckForNull
    protected final char[] escape(char c8) {
        char[] cArr;
        if (c8 < this.replacementsLength && (cArr = this.replacements[c8]) != null) {
            return cArr;
        }
        if (c8 < this.safeMin || c8 > this.safeMax) {
            return escapeUnsafe(c8);
        }
        return null;
    }
}
