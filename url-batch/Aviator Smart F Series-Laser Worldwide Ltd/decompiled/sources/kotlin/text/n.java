package kotlin.text;

import java.util.regex.Pattern;

/* loaded from: classes3.dex */
class n extends StringsKt__IndentKt {
    private static final Regex toRegex(Pattern pattern) {
        kotlin.jvm.internal.s.checkNotNullParameter(pattern, "<this>");
        return new Regex(pattern);
    }
}
