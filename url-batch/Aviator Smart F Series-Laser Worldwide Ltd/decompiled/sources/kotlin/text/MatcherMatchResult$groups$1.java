package kotlin.text;

import java.util.Iterator;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes3.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection implements i {
    final /* synthetic */ MatcherMatchResult this$0;

    MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.this$0 = matcherMatchResult;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj == null || (obj instanceof g)) {
            return contains((g) obj);
        }
        return false;
    }

    @Override // kotlin.text.i, kotlin.text.h
    public g get(int i8) {
        j6.m range;
        range = RegexKt.range(this.this$0.getMatchResult(), i8);
        if (range.getStart().intValue() < 0) {
            return null;
        }
        String group = this.this$0.getMatchResult().group(i8);
        kotlin.jvm.internal.s.checkNotNullExpressionValue(group, "matchResult.group(index)");
        return new g(group, range);
    }

    @Override // kotlin.collections.AbstractCollection
    public int getSize() {
        return this.this$0.getMatchResult().groupCount() + 1;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<g> iterator() {
        j6.m indices;
        kotlin.sequences.m asSequence;
        indices = CollectionsKt__CollectionsKt.getIndices(this);
        asSequence = CollectionsKt___CollectionsKt.asSequence(indices);
        return SequencesKt___SequencesKt.map(asSequence, new f6.l() { // from class: kotlin.text.MatcherMatchResult$groups$1$iterator$1
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke(((Number) obj).intValue());
            }

            public final g invoke(int i8) {
                return MatcherMatchResult$groups$1.this.get(i8);
            }
        }).iterator();
    }

    public /* bridge */ boolean contains(g gVar) {
        return super.contains((Object) gVar);
    }

    @Override // kotlin.text.i
    public g get(String name) {
        kotlin.jvm.internal.s.checkNotNullParameter(name, "name");
        return b6.b.IMPLEMENTATIONS.getMatchResultNamedGroup(this.this$0.getMatchResult(), name);
    }
}
