package ru.rustore.sdk.reactive.subject;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.rustore.sdk.reactive.backpressure.BackpressureStrategy;
import ru.rustore.sdk.reactive.observable.Observable;

@Metadata
/* loaded from: classes3.dex */
public final class MutableStateSubject<T> implements StateSubject<T> {
    private volatile T _value;

    @NotNull
    private final Object monitor = new Object();

    @NotNull
    private final MutableSubject<T> mutableSubject;

    public MutableStateSubject(T t4) {
        MutableSubject<T> mutableSubject = new MutableSubject<>(1, 0, 2, null);
        this.mutableSubject = mutableSubject;
        this._value = t4;
        mutableSubject.emit(t4);
    }

    private final void updateState(T t4) {
        synchronized (this.monitor) {
            try {
                if (!Intrinsics.areEqual(t4, this._value)) {
                    this._value = t4;
                    this.mutableSubject.emit(t4);
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void emit(T t4) {
        updateState(t4);
    }

    @Override // ru.rustore.sdk.reactive.subject.StateSubject
    public T getValue() {
        return this._value;
    }

    @Override // ru.rustore.sdk.reactive.subject.Subject
    @NotNull
    public Observable<T> observe(@NotNull BackpressureStrategy backpressureStrategy) {
        Intrinsics.checkNotNullParameter(backpressureStrategy, "backpressureStrategy");
        return this.mutableSubject.observe(backpressureStrategy);
    }

    public void setValue(T t4) {
        updateState(t4);
    }
}
