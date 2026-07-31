package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Disposable;

@Metadata
/* loaded from: classes3.dex */
public final class SingleDoOnSubscribeKt {
    @NotNull
    public static final <T> Single<T> doOnSubscribe(@NotNull Single<T> single, @NotNull Function1<? super Disposable, Unit> block) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new SingleDoOnSubscribe(single, block);
    }
}
