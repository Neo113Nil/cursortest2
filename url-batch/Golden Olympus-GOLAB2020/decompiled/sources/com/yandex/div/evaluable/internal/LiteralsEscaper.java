package com.yandex.div.evaluable.internal;

import com.yandex.div.evaluable.EvaluableException;
import com.yandex.div.evaluable.TokenizingException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class LiteralsEscaper {

    @NotNull
    public static final LiteralsEscaper INSTANCE = new LiteralsEscaper();

    @NotNull
    private static final String[] ESCAPE_LITERALS = {"'", "@{"};

    private LiteralsEscaper() {
    }

    private final int countConsecutiveBackslashes(String str, int i4) {
        int i5 = i4;
        while (i5 < str.length() && str.charAt(i5) == '\\') {
            i5++;
        }
        return i5 - i4;
    }

    private final String escapeLiteral(String str, int i4, String[] strArr) {
        if (i4 == str.length() || str.charAt(i4) == ' ') {
            StringBuilder sb = new StringBuilder();
            sb.append("Alone backslash at ");
            sb.append(i4 - 1);
            throw new TokenizingException(sb.toString(), null, 2, null);
        }
        for (String str2 : strArr) {
            if (isPossibleEscapeLiteral(str2, str, i4)) {
                return str2;
            }
        }
        throw new EvaluableException("Incorrect string escape", null, 2, null);
    }

    private final boolean isPossibleEscapeLiteral(String str, String str2, int i4) {
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            int i6 = i4 + i5;
            if (i6 >= str2.length() || str2.charAt(i6) != str.charAt(i5)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ String process$default(LiteralsEscaper literalsEscaper, String str, String[] strArr, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            strArr = ESCAPE_LITERALS;
        }
        return literalsEscaper.process(str, strArr);
    }

    @NotNull
    public final String process(@NotNull String string, @NotNull String[] escapingLiterals) {
        Intrinsics.checkNotNullParameter(string, "string");
        Intrinsics.checkNotNullParameter(escapingLiterals, "escapingLiterals");
        if (!StringsKt.O(string, '\\', false, 2, null)) {
            return string;
        }
        StringBuilder sb = new StringBuilder(string.length());
        int i4 = 0;
        while (i4 < string.length()) {
            if (string.charAt(i4) != '\\') {
                sb.append(string.charAt(i4));
                i4++;
            } else {
                int countConsecutiveBackslashes = countConsecutiveBackslashes(string, i4);
                i4 += countConsecutiveBackslashes;
                int i5 = countConsecutiveBackslashes / 2;
                for (int i6 = 0; i6 < i5; i6++) {
                    sb.append('\\');
                }
                if (countConsecutiveBackslashes % 2 == 1) {
                    String escapeLiteral = escapeLiteral(string, i4, escapingLiterals);
                    sb.append(escapeLiteral);
                    i4 += escapeLiteral.length();
                }
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "literalBuilder.toString()");
        return sb2;
    }
}
