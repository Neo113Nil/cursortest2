package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;

@Metadata
/* loaded from: classes3.dex */
public final class SingleSubscribeOnKt {
    @NotNull
    public static final <T> Single<T> subscribeOn(@NotNull Single<T> single, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new SingleSubscribeOn(single, dispatcher);
    }
}
