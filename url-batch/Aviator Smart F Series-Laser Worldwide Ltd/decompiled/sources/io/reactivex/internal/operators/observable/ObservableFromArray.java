package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicQueueDisposable;

/* loaded from: classes3.dex */
public final class ObservableFromArray<T> extends Observable<T> {
    final T[] array;

    static final class FromArrayDisposable<T> extends BasicQueueDisposable<T> {
        final T[] array;
        volatile boolean disposed;
        final Observer<? super T> downstream;
        boolean fusionMode;
        int index;

        FromArrayDisposable(Observer<? super T> observer, T[] tArr) {
            this.downstream = observer;
            this.array = tArr;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            this.index = this.array.length;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            this.disposed = true;
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return this.disposed;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return this.index == this.array.length;
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            int i8 = this.index;
            T[] tArr = this.array;
            if (i8 == tArr.length) {
                return null;
            }
            this.index = i8 + 1;
            return (T) ObjectHelper.requireNonNull(tArr[i8], "The array element is null");
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i8) {
            if ((i8 & 1) == 0) {
                return 0;
            }
            this.fusionMode = true;
            return 1;
        }

        void run() {
            T[] tArr = this.array;
            int length = tArr.length;
            for (int i8 = 0; i8 < length && !isDisposed(); i8++) {
                T t7 = tArr[i8];
                if (t7 == null) {
                    this.downstream.onError(new NullPointerException("The element at index " + i8 + " is null"));
                    return;
                }
                this.downstream.onNext(t7);
            }
            if (isDisposed()) {
                return;
            }
            this.downstream.onComplete();
        }
    }

    public ObservableFromArray(T[] tArr) {
        this.array = tArr;
    }

    @Override // io.reactivex.Observable
    public void subscribeActual(Observer<? super T> observer) {
        FromArrayDisposable fromArrayDisposable = new FromArrayDisposable(observer, this.array);
        observer.onSubscribe(fromArrayDisposable);
        if (fromArrayDisposable.fusionMode) {
            return;
        }
        fromArrayDisposable.run();
    }
}
