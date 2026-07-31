package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SingleMapKt {
    @NotNull
    public static final <T, R> Single<R> map(@NotNull Single<T> single, @NotNull Function1<? super T, ? extends R> mapper) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new SingleMap(single, mapper);
    }
}
