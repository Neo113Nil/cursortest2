package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SingleFlatMapKt {
    @NotNull
    public static final <T, R> Single<R> flatMap(@NotNull Single<T> single, @NotNull Function1<? super T, ? extends Single<R>> mapper) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new SingleFlatMap(single, mapper);
    }
}
