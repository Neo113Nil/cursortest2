package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableSubscribeOnKt {
    @NotNull
    public static final <T> Observable<T> subscribeOn(@NotNull Observable<T> observable, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new ObservableSubscribeOn(observable, dispatcher);
    }
}
