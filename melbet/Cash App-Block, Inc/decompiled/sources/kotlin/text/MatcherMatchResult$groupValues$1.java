package kotlin.text;

import kotlin.collections.AbstractList;

/* loaded from: classes3.dex */
public final class MatcherMatchResult$groupValues$1 extends AbstractList {
    public final /* synthetic */ MatcherMatchResult this$0;

    public MatcherMatchResult$groupValues$1(MatcherMatchResult matcherMatchResult) {
        this.this$0 = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof String) {
            return super.contains((String) obj);
        }
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        String group = this.this$0.matcher.group(i);
        return group == null ? "" : group;
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        return this.this$0.matcher.groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof String) {
            return super.indexOf((String) obj);
        }
        return -1;
    }

    @Override // kotlin.collections.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof String) {
            return super.lastIndexOf((String) obj);
        }
        return -1;
    }
}
