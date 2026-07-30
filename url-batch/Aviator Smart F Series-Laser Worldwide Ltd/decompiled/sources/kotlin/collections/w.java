package kotlin.collections;

import java.util.List;

/* loaded from: classes4.dex */
class w extends v {
    public static final <T> List<T> asReversed(List<? extends T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return new t0(list);
    }

    public static final <T> List<T> asReversedMutable(List<T> list) {
        kotlin.jvm.internal.s.checkNotNullParameter(list, "<this>");
        return new s0(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseElementIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i8) {
        if (new j6.m(0, CollectionsKt__CollectionsKt.getLastIndex(list)).contains(i8)) {
            return CollectionsKt__CollectionsKt.getLastIndex(list) - i8;
        }
        throw new IndexOutOfBoundsException("Element index " + i8 + " must be in range [" + new j6.m(0, CollectionsKt__CollectionsKt.getLastIndex(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reverseIteratorIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i8) {
        return CollectionsKt__CollectionsKt.getLastIndex(list) - i8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int reversePositionIndex$CollectionsKt__ReversedViewsKt(List<?> list, int i8) {
        if (new j6.m(0, list.size()).contains(i8)) {
            return list.size() - i8;
        }
        throw new IndexOutOfBoundsException("Position index " + i8 + " must be in range [" + new j6.m(0, list.size()) + "].");
    }
}
