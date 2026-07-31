package ru.rustore.sdk.reactive.single;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Dispatchers;

@Metadata
/* loaded from: classes3.dex */
public final class SingleTimeoutKt {
    @NotNull
    public static final <T> Single<T> timeout(@NotNull Single<T> single, long j4, @NotNull TimeUnit timeUnit, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(single, "<this>");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return new SingleTimeout(single, j4, timeUnit, dispatcher);
    }

    public static /* synthetic */ Single timeout$default(Single single, long j4, TimeUnit timeUnit, Dispatcher dispatcher, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            dispatcher = Dispatchers.INSTANCE.getIo();
        }
        return timeout(single, j4, timeUnit, dispatcher);
    }
}
