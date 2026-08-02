package kotlin.collections;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public class CollectionsKt__ReversedViewsKt extends CollectionsKt__MutableCollectionsKt {
    public static final int access$reverseElementIndex(int i, List list) {
        if (i >= 0 && i <= list.size() - 1) {
            return (list.size() - 1) - i;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Element index ", " must be in range [");
        m2m.append(new IntRange(0, list.size() - 1, 1));
        m2m.append("].");
        throw new IndexOutOfBoundsException(m2m.toString());
    }

    public static final int access$reversePositionIndex(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder m2m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Position index ", " must be in range [");
        m2m.append(new IntRange(0, list.size(), 1));
        m2m.append("].");
        throw new IndexOutOfBoundsException(m2m.toString());
    }

    public static ReversedListReadOnly asReversed(List list) {
        list.getClass();
        return new ReversedListReadOnly(list);
    }
}
