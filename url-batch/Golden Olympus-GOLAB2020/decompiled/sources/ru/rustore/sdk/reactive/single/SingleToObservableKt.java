package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.observable.Observable;

@Metadata
/* loaded from: classes3.dex */
public final class SingleToObservableKt {
    @NotNull
    public static final <T> Observable<T> toObservable(@NotNull Single<T> single) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        return new SingleToObservable(single);
    }
}
