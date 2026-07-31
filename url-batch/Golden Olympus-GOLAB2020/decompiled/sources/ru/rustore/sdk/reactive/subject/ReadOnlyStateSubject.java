package ru.rustore.sdk.reactive.subject;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.observable.Observable;

@Metadata
/* loaded from: classes3.dex */
public final class ReadOnlyStateSubject<T> implements StateSubject<T> {

    @NotNull
    private final StateSubject<T> stateSubject;

    public ReadOnlyStateSubject(@NotNull StateSubject<T> stateSubject) {
        Intrinsics.checkNotNullParameter(stateSubject, "stateSubject");
        this.stateSubject = stateSubject;
    }

    @Override // ru.rustore.sdk.reactive.subject.StateSubject
    public T getValue() {
        return this.stateSubject.getValue();
    }

    @Override // ru.rustore.sdk.reactive.subject.Subject
    @NotNull
    public Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return this.stateSubject.observe(backpressureStrategy);
    }
}
