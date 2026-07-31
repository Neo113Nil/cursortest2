package ru.rustore.sdk.reactive.single;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SingleCreate<T> extends Single<T> {

    @NotNull
    private final Function1<SingleEmitter<T>, Unit> source;

    /* JADX WARN: Multi-variable type inference failed */
    public SingleCreate(@NotNull Function1<? super SingleEmitter<T>, Unit> source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // ru.rustore.sdk.reactive.single.Single
    public void subscribe(@NotNull SingleObserver<T> downstream) {
        Intrinsics.checkNotNullParameter(downstream, "downstream");
        SingleEmitterImpl singleEmitterImpl = new SingleEmitterImpl(downstream);
        downstream.onSubscribe(singleEmitterImpl);
        try {
            this.source.invoke(singleEmitterImpl);
        } catch (Throwable th) {
            singleEmitterImpl.error(th);
        }
    }
}
