package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;

/* loaded from: classes9.dex */
public abstract class AbstractObservableWithUpstream extends Observable {
    public final ObservableSource source;

    public AbstractObservableWithUpstream(ObservableSource observableSource) {
        this.source = observableSource;
    }
}
