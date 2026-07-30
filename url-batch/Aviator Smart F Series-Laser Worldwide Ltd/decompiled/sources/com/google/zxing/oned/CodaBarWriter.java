package com.google.zxing.oned;

import cn.hutool.core.io.file.c;

/* loaded from: classes4.dex */
public final class CodaBarWriter extends OneDimensionalCodeWriter {
    private static final char[] ALT_START_END_CHARS = {'T', 'N', '*', 'E'};
    private static final char[] CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED = {c.UNIX_SEPARATOR, ':', '+', '.'};
    private static final char DEFAULT_GUARD;
    private static final char[] START_END_CHARS;

    static {
        char[] cArr = {'A', 'B', 'C', 'D'};
        START_END_CHARS = cArr;
        DEFAULT_GUARD = cArr[0];
    }

    @Override // com.google.zxing.oned.OneDimensionalCodeWriter
    public boolean[] encode(String str) {
        int i8;
        if (str.length() < 2) {
            StringBuilder sb = new StringBuilder();
            char c8 = DEFAULT_GUARD;
            sb.append(c8);
            sb.append(str);
            sb.append(c8);
            str = sb.toString();
        } else {
            char upperCase = Character.toUpperCase(str.charAt(0));
            char upperCase2 = Character.toUpperCase(str.charAt(str.length() - 1));
            char[] cArr = START_END_CHARS;
            boolean arrayContains = CodaBarReader.arrayContains(cArr, upperCase);
            boolean arrayContains2 = CodaBarReader.arrayContains(cArr, upperCase2);
            char[] cArr2 = ALT_START_END_CHARS;
            boolean arrayContains3 = CodaBarReader.arrayContains(cArr2, upperCase);
            boolean arrayContains4 = CodaBarReader.arrayContains(cArr2, upperCase2);
            if (arrayContains) {
                if (!arrayContains2) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
            } else if (!arrayContains3) {
                if (arrayContains2 || arrayContains4) {
                    throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
                }
                StringBuilder sb2 = new StringBuilder();
                char c9 = DEFAULT_GUARD;
                sb2.append(c9);
                sb2.append(str);
                sb2.append(c9);
                str = sb2.toString();
            } else if (!arrayContains4) {
                throw new IllegalArgumentException("Invalid start/end guards: ".concat(str));
            }
        }
        int i9 = 20;
        for (int i10 = 1; i10 < str.length() - 1; i10++) {
            if (Character.isDigit(str.charAt(i10)) || str.charAt(i10) == '-' || str.charAt(i10) == '$') {
                i9 += 9;
            } else {
                if (!CodaBarReader.arrayContains(CHARS_WHICH_ARE_TEN_LENGTH_EACH_AFTER_DECODED, str.charAt(i10))) {
                    throw new IllegalArgumentException("Cannot encode : '" + str.charAt(i10) + '\'');
                }
                i9 += 10;
            }
        }
        boolean[] zArr = new boolean[i9 + (str.length() - 1)];
        int i11 = 0;
        for (int i12 = 0; i12 < str.length(); i12++) {
            char upperCase3 = Character.toUpperCase(str.charAt(i12));
            if (i12 == 0 || i12 == str.length() - 1) {
                if (upperCase3 == '*') {
                    upperCase3 = 'C';
                } else if (upperCase3 == 'E') {
                    upperCase3 = 'D';
                } else if (upperCase3 == 'N') {
                    upperCase3 = 'B';
                } else if (upperCase3 == 'T') {
                    upperCase3 = 'A';
                }
            }
            int i13 = 0;
            while (true) {
                char[] cArr3 = CodaBarReader.ALPHABET;
                if (i13 >= cArr3.length) {
                    i8 = 0;
                    break;
                }
                if (upperCase3 == cArr3[i13]) {
                    i8 = CodaBarReader.CHARACTER_ENCODINGS[i13];
                    break;
                }
                i13++;
            }
            int i14 = 0;
            boolean z7 = true;
            while (true) {
                int i15 = 0;
                while (i14 < 7) {
                    zArr[i11] = z7;
                    i11++;
                    if (((i8 >> (6 - i14)) & 1) == 0 || i15 == 1) {
                        z7 = !z7;
                        i14++;
                    } else {
                        i15++;
                    }
                }
                break;
            }
            if (i12 < str.length() - 1) {
                zArr[i11] = false;
                i11++;
            }
        }
        return zArr;
    }
}
