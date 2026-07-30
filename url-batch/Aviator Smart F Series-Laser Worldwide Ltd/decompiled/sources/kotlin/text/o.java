package kotlin.text;

import java.util.Set;

/* loaded from: classes3.dex */
class o extends n {
    private static final Regex toRegex(String str) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        return new Regex(str);
    }

    private static final Regex toRegex(String str, RegexOption option) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(option, "option");
        return new Regex(str, option);
    }

    private static final Regex toRegex(String str, Set<? extends RegexOption> options) {
        kotlin.jvm.internal.s.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.s.checkNotNullParameter(options, "options");
        return new Regex(str, options);
    }
}
