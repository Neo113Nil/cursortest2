package ru.rustore.sdk.reactive.observable;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;
import ru.rustore.sdk.reactive.core.Dispatchers;

@Metadata
/* loaded from: classes3.dex */
public final class ObservableDelayKt {
    @NotNull
    public static final <T> Observable<T> delay(@NotNull Observable<T> observable, long j4, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(observable, "<this>");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        return ObservableSwitchMapKt.switchMap$default(observable, null, new ObservableDelayKt$delay$1(j4, dispatcher), 1, null);
    }

    public static /* synthetic */ Observable delay$default(Observable observable, long j4, Dispatcher dispatcher, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            dispatcher = Dispatchers.INSTANCE.getIo();
        }
        return delay(observable, j4, dispatcher);
    }
}
