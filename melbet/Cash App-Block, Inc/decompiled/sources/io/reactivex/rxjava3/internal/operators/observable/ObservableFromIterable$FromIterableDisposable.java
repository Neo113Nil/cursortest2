package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.operators.QueueDisposable;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ObservableFromIterable$FromIterableDisposable implements QueueDisposable {
    public boolean checkNext;
    public volatile boolean disposed;
    public boolean done;
    public final Observer downstream;
    public boolean fusionMode;
    public final Iterator it;

    public ObservableFromIterable$FromIterableDisposable(Observer observer, Iterator it) {
        this.downstream = observer;
        this.it = it;
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        this.disposed = true;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean isEmpty() {
        return this.done;
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called");
    }

    @Override // io.reactivex.rxjava3.operators.SimpleQueue
    public final Object poll() {
        if (this.done) {
            return null;
        }
        boolean z = this.checkNext;
        Iterator it = this.it;
        if (!z) {
            this.checkNext = true;
        } else if (!it.hasNext()) {
            this.done = true;
            return null;
        }
        Object next = it.next();
        Objects.requireNonNull(next, "The iterator returned a null value");
        return next;
    }

    @Override // io.reactivex.rxjava3.operators.QueueDisposable
    public final int requestFusion() {
        this.fusionMode = true;
        return 1;
    }
}
