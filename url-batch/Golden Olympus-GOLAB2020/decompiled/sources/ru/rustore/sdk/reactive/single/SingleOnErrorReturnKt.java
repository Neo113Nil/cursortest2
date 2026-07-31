package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SingleOnErrorReturnKt {
    @NotNull
    public static final <T> Single<T> onErrorReturn(@NotNull Single<T> single, @NotNull Function1<? super Throwable, ? extends T> mapper) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        return new SingleOnErrorReturn(single, mapper);
    }
}
