package ru.rustore.sdk.reactive.single;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.core.Dispatcher;

@Metadata
/* loaded from: classes3.dex */
final class SingleTimeout<T> extends Single<T> {
    private final long delay;

    @NotNull
    private final Dispatcher dispatcher;

    @NotNull
    private final TimeUnit timeUnit;

    @NotNull
    private final Single<T> upstream;

    public SingleTimeout(@NotNull Single<T> upstream, long j4, @NotNull TimeUnit timeUnit, @NotNull Dispatcher dispatcher) {
        Intrinsics.checkNotNullParameter(upstream, "upstream");
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.upstream = upstream;
        this.delay = j4;
        this.timeUnit = timeUnit;
        this.dispatcher = dispatcher;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        this.upstream.subscribe(new SingleTimeout$subscribe$wrappedObserver$1(this, downstream));
    }
}
