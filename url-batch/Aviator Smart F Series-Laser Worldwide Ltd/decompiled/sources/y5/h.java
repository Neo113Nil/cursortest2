package y5;

import java.util.List;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes3.dex */
public abstract class h {
    public static final <A, B> Pair<A, B> to(A a8, B b8) {
        return new Pair<>(a8, b8);
    }

    public static final <T> List<T> toList(Pair<? extends T, ? extends T> pair) {
        List<T> listOf;
        kotlin.jvm.internal.s.checkNotNullParameter(pair, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf(pair.getFirst(), pair.getSecond());
        return listOf;
    }

    public static final <T> List<T> toList(Triple<? extends T, ? extends T, ? extends T> triple) {
        List<T> listOf;
        kotlin.jvm.internal.s.checkNotNullParameter(triple, "<this>");
        listOf = CollectionsKt__CollectionsKt.listOf(triple.getFirst(), triple.getSecond(), triple.getThird());
        return listOf;
    }
}
