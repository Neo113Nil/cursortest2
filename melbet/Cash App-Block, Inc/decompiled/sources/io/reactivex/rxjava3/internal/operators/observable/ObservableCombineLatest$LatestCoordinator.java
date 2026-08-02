package io.reactivex.rxjava3.internal.operators.observable;

import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.text.MatchResult;

/* loaded from: classes9.dex */
public final class ObservableCombineLatest$LatestCoordinator extends AtomicInteger implements Disposable {
    public int active;
    public volatile boolean cancelled;
    public final MatchResult.Destructured combiner;
    public int complete;
    public volatile boolean done;
    public final Observer downstream;
    public final AtomicThrowable errors = new AtomicThrowable();
    public Object[] latest;
    public final ObservableCombineLatest$CombinerObserver[] observers;
    public final SpscLinkedArrayQueue queue;

    public ObservableCombineLatest$LatestCoordinator(Observer observer, MatchResult.Destructured destructured, int i, int i2) {
        this.downstream = observer;
        this.combiner = destructured;
        this.latest = new Object[i];
        ObservableCombineLatest$CombinerObserver[] observableCombineLatest$CombinerObserverArr = new ObservableCombineLatest$CombinerObserver[i];
        for (int i3 = 0; i3 < i; i3++) {
            observableCombineLatest$CombinerObserverArr[i3] = new ObservableCombineLatest$CombinerObserver(this, i3);
        }
        this.observers = observableCombineLatest$CombinerObserverArr;
        this.queue = new SpscLinkedArrayQueue(i2);
    }

    public final void cancelSources() {
        for (ObservableCombineLatest$CombinerObserver observableCombineLatest$CombinerObserver : this.observers) {
            observableCombineLatest$CombinerObserver.getClass();
            DisposableHelper.dispose(observableCombineLatest$CombinerObserver);
        }
    }

    public final void clear(SpscLinkedArrayQueue spscLinkedArrayQueue) {
        synchronized (this) {
            this.latest = null;
        }
        while (true) {
            if (spscLinkedArrayQueue.poll() == null && spscLinkedArrayQueue.isEmpty()) {
                return;
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.Disposable
    public final void dispose() {
        if (this.cancelled) {
            return;
        }
        this.cancelled = true;
        cancelSources();
        drain();
    }

    public final void drain() {
        if (getAndIncrement() != 0) {
            return;
        }
        SpscLinkedArrayQueue spscLinkedArrayQueue = this.queue;
        Observer observer = this.downstream;
        int i = 1;
        while (!this.cancelled) {
            if (this.errors.get() != null) {
                cancelSources();
                clear(spscLinkedArrayQueue);
                this.errors.tryTerminateConsumer(observer);
                return;
            }
            boolean z = this.done;
            Object[] objArr = (Object[]) spscLinkedArrayQueue.poll();
            boolean z2 = objArr == null;
            if (z && z2) {
                clear(spscLinkedArrayQueue);
                this.errors.tryTerminateConsumer(observer);
                return;
            }
            if (z2) {
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            } else {
                try {
                    Object mo39apply = this.combiner.mo39apply(objArr);
                    Objects.requireNonNull(mo39apply, "The combiner returned a null value");
                    observer.onNext(mo39apply);
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    this.errors.tryAddThrowableOrReport(th);
                    cancelSources();
                    clear(spscLinkedArrayQueue);
                    this.errors.tryTerminateConsumer(observer);
                    return;
                }
            }
        }
        clear(spscLinkedArrayQueue);
        AtomicThrowable atomicThrowable = this.errors;
        atomicThrowable.getClass();
        Throwable th2 = ExceptionHelper.TERMINATED;
        Throwable th3 = (Throwable) atomicThrowable.get();
        Throwable th4 = ExceptionHelper.TERMINATED;
        if (th3 != th4) {
            th3 = (Throwable) atomicThrowable.getAndSet(th4);
        }
        if (th3 == null || th3 == th4) {
            return;
        }
        UnsignedBytes.onError(th3);
    }
}
