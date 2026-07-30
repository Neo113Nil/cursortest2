package kotlin.text;

import java.util.List;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import kotlin.text.j;

/* loaded from: classes3.dex */
final class MatcherMatchResult implements j {
    private List<String> groupValues_;
    private final h groups;
    private final CharSequence input;
    private final Matcher matcher;

    public static final class a extends kotlin.collections.b {
        a() {
        }

        @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return contains((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.b, kotlin.collections.AbstractCollection
        public int getSize() {
            return MatcherMatchResult.this.getMatchResult().groupCount() + 1;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return indexOf((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.b, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return lastIndexOf((String) obj);
            }
            return -1;
        }

        public /* bridge */ boolean contains(String str) {
            return super.contains((Object) str);
        }

        @Override // kotlin.collections.b, java.util.List
        public String get(int i8) {
            String group = MatcherMatchResult.this.getMatchResult().group(i8);
            return group == null ? "" : group;
        }

        public /* bridge */ int indexOf(String str) {
            return super.indexOf((Object) str);
        }

        public /* bridge */ int lastIndexOf(String str) {
            return super.lastIndexOf((Object) str);
        }
    }

    public MatcherMatchResult(Matcher matcher, CharSequence input) {
        kotlin.jvm.internal.s.checkNotNullParameter(matcher, "matcher");
        kotlin.jvm.internal.s.checkNotNullParameter(input, "input");
        this.matcher = matcher;
        this.input = input;
        this.groups = new MatcherMatchResult$groups$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MatchResult getMatchResult() {
        return this.matcher;
    }

    @Override // kotlin.text.j
    public j.b getDestructured() {
        return j.a.getDestructured(this);
    }

    @Override // kotlin.text.j
    public List<String> getGroupValues() {
        if (this.groupValues_ == null) {
            this.groupValues_ = new a();
        }
        List<String> list = this.groupValues_;
        kotlin.jvm.internal.s.checkNotNull(list);
        return list;
    }

    @Override // kotlin.text.j
    public h getGroups() {
        return this.groups;
    }

    @Override // kotlin.text.j
    public j6.m getRange() {
        j6.m range;
        range = RegexKt.range(getMatchResult());
        return range;
    }

    @Override // kotlin.text.j
    public String getValue() {
        String group = getMatchResult().group();
        kotlin.jvm.internal.s.checkNotNullExpressionValue(group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.j
    public j next() {
        j findNext;
        int end = getMatchResult().end() + (getMatchResult().end() == getMatchResult().start() ? 1 : 0);
        if (end > this.input.length()) {
            return null;
        }
        Matcher matcher = this.matcher.pattern().matcher(this.input);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(matcher, "matcher.pattern().matcher(input)");
        findNext = RegexKt.findNext(matcher, end, this.input);
        return findNext;
    }
}
