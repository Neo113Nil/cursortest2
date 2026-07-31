package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableFilterKt {
    @NotNull
    public static final <T> Observable<T> filter(@NotNull Observable<T> observable, @NotNull Function1<? super T, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        return new ObservableFilter(observable, predicate);
    }
}
