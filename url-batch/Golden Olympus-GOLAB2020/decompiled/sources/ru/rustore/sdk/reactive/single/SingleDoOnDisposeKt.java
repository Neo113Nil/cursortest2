package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SingleDoOnDisposeKt {
    @NotNull
    public static final <T> Single<T> doOnDispose(@NotNull Single<T> single, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new SingleDoOnDispose(single, block);
    }
}
