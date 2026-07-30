package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.observers.BasicIntQueueDisposable;

/* loaded from: classes3.dex */
public final class ObservableRangeLong extends Observable<Long> {
    private final long count;
    private final long start;

    static final class RangeDisposable extends BasicIntQueueDisposable<Long> {
        private static final long serialVersionUID = 396518478098735504L;
        final Observer<? super Long> downstream;
        final long end;
        boolean fused;
        long index;

        RangeDisposable(Observer<? super Long> observer, long j8, long j9) {
            this.downstream = observer;
            this.index = j8;
            this.end = j9;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.end;
            lazySet(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            set(1);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() != 0;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.index == this.end;
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i8) {
            if ((i8 & 1) == 0) {
                return 0;
            }
            this.fused = true;
            return 1;
        }

        void run() {
            if (this.fused) {
                return;
            }
            Observer<? super Long> observer = this.downstream;
            long j8 = this.end;
            for (long j9 = this.index; j9 != j8 && get() == 0; j9++) {
                observer.onNext(Long.valueOf(j9));
            }
            if (get() == 0) {
                lazySet(1);
                observer.onComplete();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public Long poll() {
            long j8 = this.index;
            if (j8 != this.end) {
                this.index = 1 + j8;
                return Long.valueOf(j8);
            }
            lazySet(1);
            return null;
        }
    }

    public ObservableRangeLong(long j8, long j9) {
        this.start = j8;
        this.count = j9;
    }

    @Override // io.reactivex.Observable
    protected void subscribeActual(Observer<? super Long> observer) {
        long j8 = this.start;
        RangeDisposable rangeDisposable = new RangeDisposable(observer, j8, j8 + this.count);
        observer.onSubscribe(rangeDisposable);
        rangeDisposable.run();
    }
}
