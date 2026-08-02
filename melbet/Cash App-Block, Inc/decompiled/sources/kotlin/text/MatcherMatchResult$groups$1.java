package kotlin.text;

import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapKeysIterator;
import java.util.Iterator;
import java.util.regex.Matcher;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.TransformingSequence$iterator$1;

/* loaded from: classes3.dex */
public final class MatcherMatchResult$groups$1 extends AbstractCollection {
    public final /* synthetic */ int $r8$classId;
    public final Object this$0;

    public /* synthetic */ MatcherMatchResult$groups$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                if (obj == null ? true : obj instanceof MatchGroup) {
                    return super.contains((MatchGroup) obj);
                }
                return false;
            default:
                return ((PersistentHashMap) this.this$0).containsValue(obj);
        }
    }

    public MatchGroup get(int i) {
        Matcher matcher = ((MatcherMatchResult) this.this$0).matcher;
        IntRange until = RangesKt___RangesKt.until(matcher.start(i), matcher.end(i));
        if (until.first < 0) {
            return null;
        }
        String group = matcher.group(i);
        group.getClass();
        return new MatchGroup(group, until);
    }

    @Override // kotlin.collections.AbstractCollection
    public final int getSize() {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                return ((MatcherMatchResult) obj).matcher.groupCount() + 1;
            default:
                return ((PersistentHashMap) obj).size;
        }
    }

    @Override // kotlin.collections.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.$r8$classId) {
            case 0:
                return false;
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.$r8$classId) {
            case 0:
                return new TransformingSequence$iterator$1(SequencesKt___SequencesKt.map(new StringsKt__StringsKt$lineSequence$$inlined$Sequence$1(CollectionsKt__CollectionsKt.getIndices(this), 1), new StringsKt__IndentKt$$ExternalSyntheticLambda0(this, 2)));
            default:
                return new PersistentHashMapKeysIterator(((PersistentHashMap) this.this$0).node);
        }
    }
}
