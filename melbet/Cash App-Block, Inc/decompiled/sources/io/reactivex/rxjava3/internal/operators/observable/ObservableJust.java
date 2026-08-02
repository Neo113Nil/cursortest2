package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.operators.ScalarSupplier;

/* loaded from: classes9.dex */
public final class ObservableJust extends Observable implements ScalarSupplier {
    public final Object value;

    public ObservableJust(Object obj) {
        this.value = obj;
    }

    @Override // io.reactivex.rxjava3.functions.Supplier
    public final Object get() {
        return this.value;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(observer, this.value);
        observer.onSubscribe(observableScalarXMap$ScalarDisposable);
        observableScalarXMap$ScalarDisposable.run();
    }
}
