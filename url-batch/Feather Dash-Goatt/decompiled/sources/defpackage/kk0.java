package defpackage;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kk0 implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final a0 c;
    public jk0 d;

    public kk0(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new a0(1, this);
    }

    @Override // kotlin.text.MatchResult
    public final List a() {
        if (this.d == null) {
            this.d = new jk0(this);
        }
        jk0 jk0Var = this.d;
        jk0Var.getClass();
        return jk0Var;
    }

    @Override // kotlin.text.MatchResult
    public final kk0 next() {
        Matcher matcher = this.a;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.b;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new kk0(matcher2, charSequence);
        }
        return null;
    }
}
