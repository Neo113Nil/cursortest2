package io.reactivex.rxjava3.internal.operators.observable;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.operators.QueueDisposable;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes9.dex */
public final class ObservableRange extends Observable {
    public final long end;

    public final class RangeDisposable extends AtomicInteger implements QueueDisposable {
        public final Observer downstream;
        public final long end;
        public boolean fused;
        public long index;

        public RangeDisposable(Observer observer, long j, long j2) {
            this.downstream = observer;
            this.index = j;
            this.end = j2;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            set(1);
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final boolean offer(Object obj) {
            throw new UnsupportedOperationException("Should not be called");
        }

        @Override // io.reactivex.rxjava3.operators.SimpleQueue
        public final Object poll() {
            long j = this.index;
            if (j != this.end) {
                this.index = 1 + j;
                return Integer.valueOf((int) j);
            }
            lazySet(1);
            return null;
        }

        @Override // io.reactivex.rxjava3.operators.QueueDisposable
        public final int requestFusion() {
            this.fused = true;
            return 1;
        }
    }

    public ObservableRange(int i) {
        this.end = 1 + i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        Observer observer2;
        RangeDisposable rangeDisposable = new RangeDisposable(observer, 1L, this.end);
        observer.onSubscribe(rangeDisposable);
        if (rangeDisposable.fused) {
            return;
        }
        long j = rangeDisposable.index;
        while (true) {
            long j2 = rangeDisposable.end;
            observer2 = rangeDisposable.downstream;
            if (j == j2 || rangeDisposable.get() != 0) {
                break;
            }
            observer2.onNext(Integer.valueOf((int) j));
            j++;
        }
        if (rangeDisposable.get() == 0) {
            rangeDisposable.lazySet(1);
            observer2.onComplete();
        }
    }
}
