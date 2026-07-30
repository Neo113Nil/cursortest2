package defpackage;

import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class oi1 implements MatchResult {
    public final Matcher a;
    public final CharSequence b;
    public final o0 c;
    public ni1 d;

    public oi1(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new o0(1, this);
    }

    @Override // kotlin.text.MatchResult
    public final IntRange a() {
        Matcher matcher = this.a;
        return d.f(matcher.start(), matcher.end());
    }
}
