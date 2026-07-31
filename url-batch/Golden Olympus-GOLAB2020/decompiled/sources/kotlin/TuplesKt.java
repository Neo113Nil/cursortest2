package kotlin;

import W1.q;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class TuplesKt {
    @NotNull
    public static final <A, B> Pair<A, B> to(A a4, B b4) {
        return new Pair<>(a4, b4);
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull Pair<? extends T, ? extends T> pair) {
        Intrinsics.checkNotNullParameter(pair, "<this>");
        return CollectionsKt.listOf(pair.getFirst(), pair.getSecond());
    }

    @NotNull
    public static final <T> List<T> toList(@NotNull q qVar) {
        Intrinsics.checkNotNullParameter(qVar, "<this>");
        return CollectionsKt.listOf(qVar.f(), qVar.g(), qVar.h());
    }
}
