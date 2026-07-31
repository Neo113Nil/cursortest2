package ru.rustore.sdk.reactive.subject;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.observable.Observable;

@Metadata
/* loaded from: classes3.dex */
public final class ReadOnlySubject<T> implements Subject<T> {

    @NotNull
    private final Subject<T> subject;

    public ReadOnlySubject(@NotNull Subject<T> subject) {
        Intrinsics.checkNotNullParameter(subject, "subject");
        this.subject = subject;
    }

    @Override // ru.rustore.sdk.reactive.subject.Subject
    @NotNull
    public Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return this.subject.observe(backpressureStrategy);
    }
}
