package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableMapKt {
    @NotNull
    public static final <T, R> Observable<R> map(@NotNull Observable<T> observable, @NotNull Function1<? super T, ? extends R> block) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        return new ObservableMap(observable, block);
    }
}
