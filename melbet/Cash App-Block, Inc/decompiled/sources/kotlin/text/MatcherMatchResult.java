package kotlin.text;

import java.util.List;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.MatchResult;

/* loaded from: classes3.dex */
public final class MatcherMatchResult implements MatchResult {
    public MatcherMatchResult$groupValues$1 groupValues_;
    public final MatcherMatchResult$groups$1 groups;
    public final CharSequence input;
    public final Matcher matcher;

    public MatcherMatchResult(Matcher matcher, CharSequence charSequence) {
        matcher.getClass();
        charSequence.getClass();
        this.matcher = matcher;
        this.input = charSequence;
        this.groups = new MatcherMatchResult$groups$1(this, 0);
    }

    @Override // kotlin.text.MatchResult
    public final /* bridge */ MatchResult.Destructured getDestructured() {
        return UStringsKt.getDestructured(this);
    }

    @Override // kotlin.text.MatchResult
    public final List getGroupValues() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new MatcherMatchResult$groupValues$1(this);
        }
        MatcherMatchResult$groupValues$1 matcherMatchResult$groupValues$1 = this.groupValues_;
        matcherMatchResult$groupValues$1.getClass();
        return matcherMatchResult$groupValues$1;
    }

    @Override // kotlin.text.MatchResult
    public final MatcherMatchResult$groups$1 getGroups() {
        return this.groups;
    }

    @Override // kotlin.text.MatchResult
    public final IntRange getRange() {
        Matcher matcher = this.matcher;
        return RangesKt___RangesKt.until(matcher.start(), matcher.end());
    }

    @Override // kotlin.text.MatchResult
    public final String getValue() {
        String group = this.matcher.group();
        group.getClass();
        return group;
    }

    @Override // kotlin.text.MatchResult
    public final MatcherMatchResult next() {
        Matcher matcher = this.matcher;
        int end = matcher.end() + (matcher.end() == matcher.start() ? 1 : 0);
        CharSequence charSequence = this.input;
        if (end > charSequence.length()) {
            return null;
        }
        Matcher matcher2 = matcher.pattern().matcher(charSequence);
        matcher2.getClass();
        if (matcher2.find(end)) {
            return new MatcherMatchResult(matcher2, charSequence);
        }
        return null;
    }
}
