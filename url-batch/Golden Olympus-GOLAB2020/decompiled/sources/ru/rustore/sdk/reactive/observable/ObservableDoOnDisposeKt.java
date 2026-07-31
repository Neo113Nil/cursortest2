package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableDoOnDisposeKt {
    @NotNull
    public static final <T> Observable<T> doOnDispose(@NotNull Observable<T> observable, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new ObservableDoOnDispose(observable, block);
    }
}
