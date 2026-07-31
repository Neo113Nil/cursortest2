package kotlin.text;

import java.util.regex.Matcher;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public abstract class e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult e(Matcher matcher, int i4, CharSequence charSequence) {
        if (matcher.find(i4)) {
            return new d(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchResult f(Matcher matcher, CharSequence charSequence) {
        if (matcher.matches()) {
            return new d(matcher, charSequence);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange g(java.util.regex.MatchResult matchResult) {
        return kotlin.ranges.g.p(matchResult.start(), matchResult.end());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRange h(java.util.regex.MatchResult matchResult, int i4) {
        return kotlin.ranges.g.p(matchResult.start(i4), matchResult.end(i4));
    }
}
