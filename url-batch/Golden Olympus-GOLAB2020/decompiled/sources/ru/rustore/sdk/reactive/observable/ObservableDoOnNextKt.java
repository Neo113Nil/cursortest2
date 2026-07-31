package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableDoOnNextKt {
    @NotNull
    public static final <T> Observable<T> doOnNext(@NotNull Observable<T> observable, @NotNull Function1<? super T, Unit> block) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new ObservableDoOnNext(observable, block);
    }
}
