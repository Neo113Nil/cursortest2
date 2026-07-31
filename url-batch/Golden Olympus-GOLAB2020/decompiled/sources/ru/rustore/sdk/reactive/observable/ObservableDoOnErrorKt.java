package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableDoOnErrorKt {
    @NotNull
    public static final <T> Observable<T> doOnError(@NotNull Observable<T> observable, @NotNull Function1<? super Throwable, Unit> block) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new ObservableDoOnError(observable, block);
    }
}
