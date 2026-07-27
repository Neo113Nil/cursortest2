package kotlin.text;

import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class j implements MatchResult {

    /* renamed from: a, reason: collision with root package name */
    public final Matcher f7537a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7538b;

    /* renamed from: c, reason: collision with root package name */
    public final i f7539c;

    public j(Matcher matcher, String input) {
        Intrinsics.checkNotNullParameter(matcher, "matcher");
        Intrinsics.checkNotNullParameter(input, "input");
        this.f7537a = matcher;
        this.f7538b = input;
        this.f7539c = new i(this);
    }

    @Override // kotlin.text.MatchResult
    public final IntRange a() {
        Matcher matcher = this.f7537a;
        return kotlin.ranges.b.h(matcher.start(), matcher.end());
    }
}
