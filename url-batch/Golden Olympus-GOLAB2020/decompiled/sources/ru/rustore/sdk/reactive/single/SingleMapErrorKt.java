package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SingleMapErrorKt {
    @NotNull
    public static final <T> Single<T> mapError(@NotNull Single<T> single, @NotNull Function1<? super Throwable, ? extends Throwable> mapper) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new SingleMapError(single, mapper);
    }
}
