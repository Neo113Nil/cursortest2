package kotlin.collections;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* renamed from: kotlin.collections.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
class C3231v extends C3230u {
    @NotNull
    public static final <T> List<T> asReversed(@NotNull List<? extends T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new Q(list);
    }

    @NotNull
    public static final <T> List<T> asReversedMutable(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return new P(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(List list, int i4) {
        if (new IntRange(0, C3227q.getLastIndex(list)).h(i4)) {
            return C3227q.getLastIndex(list) - i4;
        }
        throw new IndexOutOfBoundsException("Element index " + i4 + " must be in range [" + new IntRange(0, C3227q.getLastIndex(list)) + "].");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(List list, int i4) {
        return C3227q.getLastIndex(list) - i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(List list, int i4) {
        if (new IntRange(0, list.size()).h(i4)) {
            return list.size() - i4;
        }
        throw new IndexOutOfBoundsException("Position index " + i4 + " must be in range [" + new IntRange(0, list.size()) + "].");
    }
}
