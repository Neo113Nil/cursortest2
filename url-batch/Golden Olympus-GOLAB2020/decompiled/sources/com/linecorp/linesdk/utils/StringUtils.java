package com.linecorp.linesdk.utils;

import androidx.annotation.NonNull;
import java.security.SecureRandom;

/* loaded from: classes2.dex */
public final class StringUtils {
    private static final String ALPHABETIC_CHARS;
    private static final String ALPHA_NUMERIC_CHARS;
    private static final String LOWERCASE_ALPHABETIC_CHARS;
    private static final String NUMERIC_CHARS;
    private static final String UPPERCASE_ALPHABETIC_CHARS;
    private static final SecureRandom secureRandom;

    static {
        String createString = createString('a', 'z');
        LOWERCASE_ALPHABETIC_CHARS = createString;
        String createString2 = createString('A', 'Z');
        UPPERCASE_ALPHABETIC_CHARS = createString2;
        String createString3 = createString('0', '9');
        NUMERIC_CHARS = createString3;
        String str = createString + createString2;
        ALPHABETIC_CHARS = str;
        ALPHA_NUMERIC_CHARS = str + createString3;
        secureRandom = new SecureRandom();
    }

    private StringUtils() {
    }

    @NonNull
    public static String createRandomAlphaNumeric(int i4) {
        return createRandomString(ALPHA_NUMERIC_CHARS, i4);
    }

    @NonNull
    public static String createRandomString(String str, int i4) {
        StringBuilder sb = new StringBuilder();
        for (int i5 = 0; i5 < i4; i5++) {
            sb.append(str.charAt(secureRandom.nextInt(str.length())));
        }
        return sb.toString();
    }

    @NonNull
    public static String createString(char c4, char c5) {
        StringBuilder sb = new StringBuilder();
        while (c4 <= c5) {
            sb.append(c4);
            c4 = (char) (c4 + 1);
        }
        return sb.toString();
    }
}
