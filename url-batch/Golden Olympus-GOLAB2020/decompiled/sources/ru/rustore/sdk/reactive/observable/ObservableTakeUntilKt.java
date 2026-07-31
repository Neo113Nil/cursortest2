package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableTakeUntilKt {
    @NotNull
    public static final <T> Observable<T> takeUntil(@NotNull Observable<T> observable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new ObservableTakeUntil(observable, predicate);
    }
}
