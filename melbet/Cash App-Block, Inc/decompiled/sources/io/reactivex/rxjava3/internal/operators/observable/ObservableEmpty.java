package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* loaded from: classes9.dex */
public final class ObservableEmpty extends Observable implements ScalarSupplier {
    public static final ObservableEmpty INSTANCE = new ObservableEmpty();

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return null;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        EmptyDisposable.complete(observer);
    }
}
