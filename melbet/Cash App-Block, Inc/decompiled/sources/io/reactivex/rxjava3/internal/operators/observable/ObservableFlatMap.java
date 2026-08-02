package io.reactivex.rxjava3.internal.operators.observable;

import com.google.common.primitives.Longs;
import com.google.common.primitives.UnsignedBytes;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Supplier;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.disposables.EmptyDisposable;
import io.reactivex.rxjava3.internal.util.AtomicThrowable;
import io.reactivex.rxjava3.internal.util.ExceptionHelper;
import io.reactivex.rxjava3.operators.QueueDisposable;
import io.reactivex.rxjava3.operators.SimplePlainQueue;
import io.reactivex.rxjava3.operators.SimpleQueue;
import io.reactivex.rxjava3.operators.SpscArrayQueue;
import io.reactivex.rxjava3.operators.SpscLinkedArrayQueue;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes9.dex */
public final class ObservableFlatMap extends AbstractObservableWithUpstream {
    public final int bufferSize;
    public final Function mapper;

    public final class InnerObserver extends AtomicReference implements Observer {
        public volatile boolean done;
        public int fusionMode;
        public final MergeObserver parent;
        public volatile SimpleQueue queue;

        public InnerObserver(MergeObserver mergeObserver) {
            this.parent = mergeObserver;
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            this.done = true;
            this.parent.drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.parent.errors.tryAddThrowableOrReport(th)) {
                MergeObserver mergeObserver = this.parent;
                mergeObserver.getClass();
                mergeObserver.disposeAll();
                this.done = true;
                this.parent.drain();
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onNext(Object obj) {
            int i = this.fusionMode;
            MergeObserver mergeObserver = this.parent;
            if (i != 0) {
                mergeObserver.drain();
                return;
            }
            if (mergeObserver.get() == 0 && mergeObserver.compareAndSet(0, 1)) {
                mergeObserver.downstream.onNext(obj);
                if (mergeObserver.decrementAndGet() == 0) {
                    return;
                }
            } else {
                SimpleQueue simpleQueue = this.queue;
                if (simpleQueue == null) {
                    simpleQueue = new SpscLinkedArrayQueue(mergeObserver.bufferSize);
                    this.queue = simpleQueue;
                }
                simpleQueue.offer(obj);
                if (mergeObserver.getAndIncrement() != 0) {
                    return;
                }
            }
            mergeObserver.drainLoop();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.setOnce(this, disposable) && (disposable instanceof QueueDisposable)) {
                QueueDisposable queueDisposable = (QueueDisposable) disposable;
                int requestFusion = queueDisposable.requestFusion();
                if (requestFusion == 1) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                    this.done = true;
                    this.parent.drain();
                    return;
                }
                if (requestFusion == 2) {
                    this.fusionMode = requestFusion;
                    this.queue = queueDisposable;
                }
            }
        }
    }

    public final class MergeObserver extends AtomicInteger implements Disposable, Observer {
        public final int bufferSize;
        public volatile boolean disposed;
        public volatile boolean done;
        public final Observer downstream;
        public int lastIndex;
        public final Function mapper;
        public volatile SimplePlainQueue queue;
        public long uniqueId;
        public Disposable upstream;
        public int wip;
        public static final InnerObserver[] EMPTY = new InnerObserver[0];
        public static final InnerObserver[] CANCELLED = new InnerObserver[0];
        public final AtomicThrowable errors = new AtomicThrowable();
        public final int maxConcurrency = Integer.MAX_VALUE;
        public final AtomicReference observers = new AtomicReference(EMPTY);

        public MergeObserver(Observer observer, Function function, int i) {
            this.downstream = observer;
            this.mapper = function;
            this.bufferSize = i;
        }

        public final boolean checkTerminate() {
            if (this.disposed) {
                return true;
            }
            if (((Throwable) this.errors.get()) == null) {
                return false;
            }
            disposeAll();
            this.errors.tryTerminateConsumer(this.downstream);
            return true;
        }

        @Override // io.reactivex.rxjava3.disposables.Disposable
        public final void dispose() {
            this.disposed = true;
            if (disposeAll()) {
                AtomicThrowable atomicThrowable = this.errors;
                atomicThrowable.getClass();
                Throwable th = ExceptionHelper.TERMINATED;
                Throwable th2 = (Throwable) atomicThrowable.get();
                Throwable th3 = ExceptionHelper.TERMINATED;
                if (th2 != th3) {
                    th2 = (Throwable) atomicThrowable.getAndSet(th3);
                }
                if (th2 == null || th2 == th3) {
                    return;
                }
                UnsignedBytes.onError(th2);
            }
        }

        public final boolean disposeAll() {
            this.upstream.dispose();
            AtomicReference atomicReference = this.observers;
            InnerObserver[] innerObserverArr = CANCELLED;
            InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.getAndSet(innerObserverArr);
            if (innerObserverArr2 == innerObserverArr) {
                return false;
            }
            for (InnerObserver innerObserver : innerObserverArr2) {
                innerObserver.getClass();
                DisposableHelper.dispose(innerObserver);
            }
            return true;
        }

        public final void drain() {
            if (getAndIncrement() == 0) {
                drainLoop();
            }
        }

        public final void drainLoop() {
            int i;
            Observer observer = this.downstream;
            int i2 = 1;
            while (!checkTerminate()) {
                SimplePlainQueue simplePlainQueue = this.queue;
                int i3 = 0;
                if (simplePlainQueue != null) {
                    while (!checkTerminate()) {
                        Object poll = simplePlainQueue.poll();
                        if (poll != null) {
                            observer.onNext(poll);
                            i3++;
                        }
                    }
                    return;
                }
                if (i3 == 0) {
                    boolean z = this.done;
                    SimplePlainQueue simplePlainQueue2 = this.queue;
                    InnerObserver[] innerObserverArr = (InnerObserver[]) this.observers.get();
                    int length = innerObserverArr.length;
                    if (this.maxConcurrency != Integer.MAX_VALUE) {
                        synchronized (this) {
                            throw null;
                        }
                    }
                    if (z && ((simplePlainQueue2 == null || simplePlainQueue2.isEmpty()) && length == 0)) {
                        this.errors.tryTerminateConsumer(this.downstream);
                        return;
                    }
                    if (length != 0) {
                        int min = Math.min(length - 1, this.lastIndex);
                        for (0; i < length; i + 1) {
                            if (checkTerminate()) {
                                return;
                            }
                            InnerObserver innerObserver = innerObserverArr[min];
                            SimpleQueue simpleQueue = innerObserver.queue;
                            if (simpleQueue != null) {
                                do {
                                    try {
                                        Object poll2 = simpleQueue.poll();
                                        if (poll2 != null) {
                                            observer.onNext(poll2);
                                        }
                                    } catch (Throwable th) {
                                        Longs.throwIfFatal(th);
                                        DisposableHelper.dispose(innerObserver);
                                        this.errors.tryAddThrowableOrReport(th);
                                        if (checkTerminate()) {
                                            return;
                                        }
                                        removeInner(innerObserver);
                                        i3++;
                                        min++;
                                        if (min != length) {
                                        }
                                    }
                                } while (!checkTerminate());
                                return;
                            }
                            boolean z2 = innerObserver.done;
                            SimpleQueue simpleQueue2 = innerObserver.queue;
                            if (z2 && (simpleQueue2 == null || simpleQueue2.isEmpty())) {
                                removeInner(innerObserver);
                                i3++;
                            }
                            min++;
                            i = min != length ? i + 1 : 0;
                            min = 0;
                        }
                        this.lastIndex = min;
                    }
                    if (i3 == 0) {
                        i2 = addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                        subscribeMore(i3);
                    }
                } else if (this.maxConcurrency != Integer.MAX_VALUE) {
                    subscribeMore(i3);
                }
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onError(Throwable th) {
            if (this.done) {
                UnsignedBytes.onError(th);
            } else if (this.errors.tryAddThrowableOrReport(th)) {
                this.done = true;
                drain();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
        
            if (decrementAndGet() == 0) goto L45;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.reactivex.rxjava3.core.Observer
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void onNext(Object obj) {
            if (this.done) {
                return;
            }
            try {
                Object mo39apply = this.mapper.mo39apply(obj);
                Objects.requireNonNull(mo39apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource = (ObservableSource) mo39apply;
                if (this.maxConcurrency != Integer.MAX_VALUE) {
                    synchronized (this) {
                        try {
                            int i = this.wip;
                            if (i == this.maxConcurrency) {
                                throw null;
                            }
                            this.wip = i + 1;
                        } finally {
                        }
                    }
                }
                if (!(observableSource instanceof Supplier)) {
                    this.uniqueId++;
                    InnerObserver innerObserver = new InnerObserver(this);
                    AtomicReference atomicReference = this.observers;
                    while (true) {
                        InnerObserver[] innerObserverArr = (InnerObserver[]) atomicReference.get();
                        if (innerObserverArr == CANCELLED) {
                            DisposableHelper.dispose(innerObserver);
                            return;
                        }
                        int length = innerObserverArr.length;
                        InnerObserver[] innerObserverArr2 = new InnerObserver[length + 1];
                        System.arraycopy(innerObserverArr, 0, innerObserverArr2, 0, length);
                        innerObserverArr2[length] = innerObserver;
                        while (!atomicReference.compareAndSet(innerObserverArr, innerObserverArr2)) {
                            if (atomicReference.get() != innerObserverArr) {
                                break;
                            }
                        }
                        ((Observable) observableSource).subscribe(innerObserver);
                        return;
                    }
                }
                try {
                    Object obj2 = ((Supplier) observableSource).get();
                    if (obj2 != null) {
                        if (get() == 0 && compareAndSet(0, 1)) {
                            this.downstream.onNext(obj2);
                        } else {
                            SimplePlainQueue simplePlainQueue = this.queue;
                            if (simplePlainQueue == null) {
                                simplePlainQueue = this.maxConcurrency == Integer.MAX_VALUE ? new SpscLinkedArrayQueue(this.bufferSize) : new SpscArrayQueue(this.maxConcurrency);
                                this.queue = simplePlainQueue;
                            }
                            simplePlainQueue.offer(obj2);
                            if (getAndIncrement() != 0) {
                                return;
                            }
                        }
                        drainLoop();
                    }
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    this.errors.tryAddThrowableOrReport(th);
                    drain();
                }
                if (this.maxConcurrency == Integer.MAX_VALUE) {
                    return;
                }
                synchronized (this) {
                    throw null;
                }
            } catch (Throwable th2) {
                Longs.throwIfFatal(th2);
                this.upstream.dispose();
                onError(th2);
            }
        }

        @Override // io.reactivex.rxjava3.core.Observer
        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.validate(this.upstream, disposable)) {
                this.upstream = disposable;
                this.downstream.onSubscribe(this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void removeInner(InnerObserver innerObserver) {
            InnerObserver[] innerObserverArr;
            while (true) {
                AtomicReference atomicReference = this.observers;
                InnerObserver[] innerObserverArr2 = (InnerObserver[]) atomicReference.get();
                int length = innerObserverArr2.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (innerObserverArr2[i] == innerObserver) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (i < 0) {
                    return;
                }
                if (length == 1) {
                    innerObserverArr = EMPTY;
                } else {
                    InnerObserver[] innerObserverArr3 = new InnerObserver[length - 1];
                    System.arraycopy(innerObserverArr2, 0, innerObserverArr3, 0, i);
                    System.arraycopy(innerObserverArr2, i + 1, innerObserverArr3, i, (length - i) - 1);
                    innerObserverArr = innerObserverArr3;
                }
                while (!atomicReference.compareAndSet(innerObserverArr2, innerObserverArr)) {
                    if (atomicReference.get() != innerObserverArr2) {
                        break;
                    }
                }
                return;
            }
        }

        public final void subscribeMore(int i) {
            if (i == 0) {
                return;
            }
            synchronized (this) {
                throw null;
            }
        }
    }

    public ObservableFlatMap(Observable observable, Function function, int i) {
        super(observable);
        this.mapper = function;
        this.bufferSize = i;
    }

    @Override // io.reactivex.rxjava3.core.Observable
    public final void subscribeActual(Observer observer) {
        ObservableSource observableSource = this.source;
        boolean z = observableSource instanceof Supplier;
        Function function = this.mapper;
        if (!z) {
            ((Observable) observableSource).subscribe(new MergeObserver(observer, function, this.bufferSize));
            return;
        }
        try {
            Object obj = ((Supplier) observableSource).get();
            if (obj == null) {
                EmptyDisposable.complete(observer);
                return;
            }
            try {
                Object mo39apply = function.mo39apply(obj);
                Objects.requireNonNull(mo39apply, "The mapper returned a null ObservableSource");
                ObservableSource observableSource2 = (ObservableSource) mo39apply;
                if (!(observableSource2 instanceof Supplier)) {
                    ((Observable) observableSource2).subscribe(observer);
                    return;
                }
                try {
                    Object obj2 = ((Supplier) observableSource2).get();
                    if (obj2 == null) {
                        EmptyDisposable.complete(observer);
                        return;
                    }
                    ObservableScalarXMap$ScalarDisposable observableScalarXMap$ScalarDisposable = new ObservableScalarXMap$ScalarDisposable(observer, obj2);
                    observer.onSubscribe(observableScalarXMap$ScalarDisposable);
                    observableScalarXMap$ScalarDisposable.run();
                } catch (Throwable th) {
                    Longs.throwIfFatal(th);
                    EmptyDisposable.error(th, observer);
                }
            } catch (Throwable th2) {
                Longs.throwIfFatal(th2);
                EmptyDisposable.error(th2, observer);
            }
        } catch (Throwable th3) {
            Longs.throwIfFatal(th3);
            EmptyDisposable.error(th3, observer);
        }
    }
}
