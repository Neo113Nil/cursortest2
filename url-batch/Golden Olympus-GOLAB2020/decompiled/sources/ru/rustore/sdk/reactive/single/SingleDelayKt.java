package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Dispatchers;

@Metadata
/* loaded from: classes3.dex */
public final class SingleDelayKt {
    @NotNull
    public static final <T> Single<T> delay(@NotNull Single<T> single, long j4, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return SingleFlatMapKt.flatMap(single, new SingleDelayKt$delay$1(dispatcher, j4));
    }

    public static /* synthetic */ Single delay$default(Single single, long j4, Dispatcher dispatcher, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            dispatcher = Dispatchers.INSTANCE.getIo();
        }
        return delay(single, j4, dispatcher);
    }
}
