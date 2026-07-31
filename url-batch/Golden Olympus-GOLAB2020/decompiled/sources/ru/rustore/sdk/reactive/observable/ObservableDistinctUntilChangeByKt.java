package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableDistinctUntilChangeByKt {
    @NotNull
    public static final <T> Observable<T> distinctUntilChange(@NotNull Observable<T> observable) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        return new ObservableDistinctUntilChangeBy(observable, ObservableDistinctUntilChangeByKt$distinctUntilChange$1.INSTANCE);
    }

    @NotNull
    public static final <T> Observable<T> distinctUntilChangeBy(@NotNull Observable<T> observable, @NotNull Function2<? super T, ? super T, Boolean> comparator) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        return new ObservableDistinctUntilChangeBy(observable, comparator);
    }
}
