package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SingleDoOnSuccessKt {
    @NotNull
    public static final <T> Single<T> doOnSuccess(@NotNull Single<T> single, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new SingleDoOnSuccess(single, block);
    }
}
