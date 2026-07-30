package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableBufferBoundary<T, U extends Collection<? super T>, Open, Close> extends AbstractFlowableWithUpstream<T, U> {
    final Function<? super Open, ? extends b> bufferClose;
    final b bufferOpen;
    final Callable<U> bufferSupplier;

    static final class BufferBoundarySubscriber<T, C extends Collection<? super T>, Open, Close> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -8466418554264089604L;
        final Function<? super Open, ? extends b> bufferClose;
        final b bufferOpen;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        volatile boolean done;
        final c downstream;
        long emitted;
        long index;
        final SpscLinkedArrayQueue<C> queue = new SpscLinkedArrayQueue<>(Flowable.bufferSize());
        final CompositeDisposable subscribers = new CompositeDisposable();
        final AtomicLong requested = new AtomicLong();
        final AtomicReference<d> upstream = new AtomicReference<>();
        Map<Long, C> buffers = new LinkedHashMap();
        final AtomicThrowable errors = new AtomicThrowable();

        static final class BufferOpenSubscriber<Open> extends AtomicReference<d> implements FlowableSubscriber<Open>, Disposable {
            private static final long serialVersionUID = -8498650778633225126L;
            final BufferBoundarySubscriber<?, ?, Open, ?> parent;

            BufferOpenSubscriber(BufferBoundarySubscriber<?, ?, Open, ?> bufferBoundarySubscriber) {
                this.parent = bufferBoundarySubscriber;
            }

            @Override // io.reactivex.disposables.Disposable
            public void dispose() {
                SubscriptionHelper.cancel(this);
            }

            @Override // io.reactivex.disposables.Disposable
            public boolean isDisposed() {
                return get() == SubscriptionHelper.CANCELLED;
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onComplete() {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.openComplete(this);
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onError(Throwable th) {
                lazySet(SubscriptionHelper.CANCELLED);
                this.parent.boundaryError(this, th);
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onNext(Open open) {
                this.parent.open(open);
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onSubscribe(d dVar) {
                SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
            }
        }

        BufferBoundarySubscriber(c cVar, b bVar, Function<? super Open, ? extends b> function, Callable<C> callable) {
            this.downstream = cVar;
            this.bufferSupplier = callable;
            this.bufferOpen = bVar;
            this.bufferClose = function;
        }

        void boundaryError(Disposable disposable, Throwable th) {
            SubscriptionHelper.cancel(this.upstream);
            this.subscribers.delete(disposable);
            onError(th);
        }

        @Override // p7.d
        public void cancel() {
            if (SubscriptionHelper.cancel(this.upstream)) {
                this.cancelled = true;
                this.subscribers.dispose();
                synchronized (this) {
                    this.buffers = null;
                }
                if (getAndIncrement() != 0) {
                    this.queue.clear();
                }
            }
        }

        void close(BufferCloseSubscriber<T, C> bufferCloseSubscriber, long j8) {
            boolean z7;
            this.subscribers.delete(bufferCloseSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                z7 = true;
            } else {
                z7 = false;
            }
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    this.queue.offer(map.remove(Long.valueOf(j8)));
                    if (z7) {
                        this.done = true;
                    }
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            long j8 = this.emitted;
            c cVar = this.downstream;
            SpscLinkedArrayQueue<C> spscLinkedArrayQueue = this.queue;
            int i8 = 1;
            do {
                long j9 = this.requested.get();
                while (j8 != j9) {
                    if (this.cancelled) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    boolean z7 = this.done;
                    if (z7 && this.errors.get() != null) {
                        spscLinkedArrayQueue.clear();
                        cVar.onError(this.errors.terminate());
                        return;
                    }
                    C poll = spscLinkedArrayQueue.poll();
                    boolean z8 = poll == null;
                    if (z7 && z8) {
                        cVar.onComplete();
                        return;
                    } else {
                        if (z8) {
                            break;
                        }
                        cVar.onNext(poll);
                        j8++;
                    }
                }
                if (j8 == j9) {
                    if (this.cancelled) {
                        spscLinkedArrayQueue.clear();
                        return;
                    }
                    if (this.done) {
                        if (this.errors.get() != null) {
                            spscLinkedArrayQueue.clear();
                            cVar.onError(this.errors.terminate());
                            return;
                        } else if (spscLinkedArrayQueue.isEmpty()) {
                            cVar.onComplete();
                            return;
                        }
                    }
                }
                this.emitted = j8;
                i8 = addAndGet(-i8);
            } while (i8 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.subscribers.dispose();
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        this.queue.offer(it.next());
                    }
                    this.buffers = null;
                    this.done = true;
                    drain();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (!this.errors.addThrowable(th)) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.subscribers.dispose();
            synchronized (this) {
                this.buffers = null;
            }
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            synchronized (this) {
                try {
                    Map<Long, C> map = this.buffers;
                    if (map == null) {
                        return;
                    }
                    Iterator<C> it = map.values().iterator();
                    while (it.hasNext()) {
                        it.next().add(t7);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                BufferOpenSubscriber bufferOpenSubscriber = new BufferOpenSubscriber(this);
                this.subscribers.add(bufferOpenSubscriber);
                this.bufferOpen.subscribe(bufferOpenSubscriber);
                dVar.request(Long.MAX_VALUE);
            }
        }

        void open(Open open) {
            try {
                Collection collection = (Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null Collection");
                b bVar = (b) ObjectHelper.requireNonNull(this.bufferClose.apply(open), "The bufferClose returned a null Publisher");
                long j8 = this.index;
                this.index = 1 + j8;
                synchronized (this) {
                    try {
                        Map<Long, C> map = this.buffers;
                        if (map == null) {
                            return;
                        }
                        map.put(Long.valueOf(j8), collection);
                        BufferCloseSubscriber bufferCloseSubscriber = new BufferCloseSubscriber(this, j8);
                        this.subscribers.add(bufferCloseSubscriber);
                        bVar.subscribe(bufferCloseSubscriber);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                SubscriptionHelper.cancel(this.upstream);
                onError(th2);
            }
        }

        void openComplete(BufferOpenSubscriber<Open> bufferOpenSubscriber) {
            this.subscribers.delete(bufferOpenSubscriber);
            if (this.subscribers.size() == 0) {
                SubscriptionHelper.cancel(this.upstream);
                this.done = true;
                drain();
            }
        }

        @Override // p7.d
        public void request(long j8) {
            BackpressureHelper.add(this.requested, j8);
            drain();
        }
    }

    static final class BufferCloseSubscriber<T, C extends Collection<? super T>> extends AtomicReference<d> implements FlowableSubscriber<Object>, Disposable {
        private static final long serialVersionUID = -8498650778633225126L;
        final long index;
        final BufferBoundarySubscriber<T, C, ?, ?> parent;

        BufferCloseSubscriber(BufferBoundarySubscriber<T, C, ?, ?> bufferBoundarySubscriber, long j8) {
            this.parent = bufferBoundarySubscriber;
            this.index = j8;
        }

        @Override // io.reactivex.disposables.Disposable
        public void dispose() {
            SubscriptionHelper.cancel(this);
        }

        @Override // io.reactivex.disposables.Disposable
        public boolean isDisposed() {
            return get() == SubscriptionHelper.CANCELLED;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            d dVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            d dVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar == subscriptionHelper) {
                RxJavaPlugins.onError(th);
            } else {
                lazySet(subscriptionHelper);
                this.parent.boundaryError(this, th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(Object obj) {
            d dVar = get();
            SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
            if (dVar != subscriptionHelper) {
                lazySet(subscriptionHelper);
                dVar.cancel();
                this.parent.close(this, this.index);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.setOnce(this, dVar, Long.MAX_VALUE);
        }
    }

    public FlowableBufferBoundary(Flowable<T> flowable, b bVar, Function<? super Open, ? extends b> function, Callable<U> callable) {
        super(flowable);
        this.bufferOpen = bVar;
        this.bufferClose = function;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        BufferBoundarySubscriber bufferBoundarySubscriber = new BufferBoundarySubscriber(cVar, this.bufferOpen, this.bufferClose, this.bufferSupplier);
        cVar.onSubscribe(bufferBoundarySubscriber);
        this.source.subscribe((FlowableSubscriber) bufferBoundarySubscriber);
    }
}
