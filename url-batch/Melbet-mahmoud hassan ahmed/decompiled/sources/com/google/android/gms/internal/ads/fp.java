package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class fp {
    public static int a(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return v3.k.a(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b6, code lost:
    
        if (true != r4) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00c6, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00c5, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c3, code lost:
    
        if (true != r4) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] b(String str, boolean z6) {
        String str2;
        Character.UnicodeBlock of;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i7 = 0;
        boolean z7 = false;
        int i8 = 0;
        while (i7 < length) {
            int codePointAt = Character.codePointAt(charArray, i7);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt) && ((of = Character.UnicodeBlock.of(codePointAt)) == Character.UnicodeBlock.BOPOMOFO || of == Character.UnicodeBlock.BOPOMOFO_EXTENDED || of == Character.UnicodeBlock.CJK_COMPATIBILITY || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || of == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || of == Character.UnicodeBlock.HANGUL_JAMO || of == Character.UnicodeBlock.HANGUL_SYLLABLES || of == Character.UnicodeBlock.HIRAGANA || of == Character.UnicodeBlock.KATAKANA || of == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS || ((codePointAt >= 65382 && codePointAt <= 65437) || (codePointAt >= 65441 && codePointAt <= 65500)))) {
                if (z7) {
                    arrayList.add(new String(charArray, i8, i7 - i8));
                }
                str2 = new String(charArray, i7, charCount);
            } else {
                if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                    if (!z6 || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                        if (z7) {
                            str2 = new String(charArray, i8, i7 - i8);
                        }
                    }
                }
                i7 += charCount;
            }
            arrayList.add(str2);
            z7 = false;
            i7 += charCount;
        }
        if (z7) {
            arrayList.add(new String(charArray, i8, i7 - i8));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
