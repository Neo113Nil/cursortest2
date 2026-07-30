package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BooleanSupplier;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.internal.util.QueueDrainHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableBuffer<T, C extends Collection<? super T>> extends AbstractFlowableWithUpstream<T, C> {
    final Callable<C> bufferSupplier;
    final int size;
    final int skip;

    static final class PublisherBufferExactSubscriber<T, C extends Collection<? super T>> implements FlowableSubscriber<T>, d {
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final c downstream;
        int index;
        final int size;
        d upstream;

        PublisherBufferExactSubscriber(c cVar, int i8, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i8;
            this.bufferSupplier = callable;
        }

        @Override // p7.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c8 = this.buffer;
            if (c8 != null && !c8.isEmpty()) {
                this.downstream.onNext(c8);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.done) {
                return;
            }
            C c8 = this.buffer;
            if (c8 == null) {
                try {
                    c8 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c8;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            c8.add(t7);
            int i8 = this.index + 1;
            if (i8 != this.size) {
                this.index = i8;
                return;
            }
            this.index = 0;
            this.buffer = null;
            this.downstream.onNext(c8);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                this.upstream.request(BackpressureHelper.multiplyCap(j8, this.size));
            }
        }
    }

    static final class PublisherBufferOverlappingSubscriber<T, C extends Collection<? super T>> extends AtomicLong implements FlowableSubscriber<T>, d, BooleanSupplier {
        private static final long serialVersionUID = -7370244972039324525L;
        final Callable<C> bufferSupplier;
        volatile boolean cancelled;
        boolean done;
        final c downstream;
        int index;
        long produced;
        final int size;
        final int skip;
        d upstream;
        final AtomicBoolean once = new AtomicBoolean();
        final ArrayDeque<C> buffers = new ArrayDeque<>();

        PublisherBufferOverlappingSubscriber(c cVar, int i8, int i9, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i8;
            this.skip = i9;
            this.bufferSupplier = callable;
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        @Override // io.reactivex.functions.BooleanSupplier
        public boolean getAsBoolean() {
            return this.cancelled;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            long j8 = this.produced;
            if (j8 != 0) {
                BackpressureHelper.produced(this, j8);
            }
            QueueDrainHelper.postComplete(this.downstream, this.buffers, this, this);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffers.clear();
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.done) {
                return;
            }
            ArrayDeque<C> arrayDeque = this.buffers;
            int i8 = this.index;
            int i9 = i8 + 1;
            if (i8 == 0) {
                try {
                    arrayDeque.offer((Collection) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer"));
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            Collection collection = (Collection) arrayDeque.peek();
            if (collection != null && collection.size() + 1 == this.size) {
                arrayDeque.poll();
                collection.add(t7);
                this.produced++;
                this.downstream.onNext(collection);
            }
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((Collection) it.next()).add(t7);
            }
            if (i9 == this.skip) {
                i9 = 0;
            }
            this.index = i9;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (!SubscriptionHelper.validate(j8) || QueueDrainHelper.postCompleteRequest(j8, this.downstream, this.buffers, this, this)) {
                return;
            }
            if (this.once.get() || !this.once.compareAndSet(false, true)) {
                this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j8));
            } else {
                this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j8 - 1)));
            }
        }
    }

    static final class PublisherBufferSkipSubscriber<T, C extends Collection<? super T>> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5616169793639412593L;
        C buffer;
        final Callable<C> bufferSupplier;
        boolean done;
        final c downstream;
        int index;
        final int size;
        final int skip;
        d upstream;

        PublisherBufferSkipSubscriber(c cVar, int i8, int i9, Callable<C> callable) {
            this.downstream = cVar;
            this.size = i8;
            this.skip = i9;
            this.bufferSupplier = callable;
        }

        @Override // p7.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            C c8 = this.buffer;
            this.buffer = null;
            if (c8 != null) {
                this.downstream.onNext(c8);
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            this.done = true;
            this.buffer = null;
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.done) {
                return;
            }
            C c8 = this.buffer;
            int i8 = this.index;
            int i9 = i8 + 1;
            if (i8 == 0) {
                try {
                    c8 = (C) ObjectHelper.requireNonNull(this.bufferSupplier.call(), "The bufferSupplier returned a null buffer");
                    this.buffer = c8;
                } catch (Throwable th) {
                    Exceptions.throwIfFatal(th);
                    cancel();
                    onError(th);
                    return;
                }
            }
            if (c8 != null) {
                c8.add(t7);
                if (c8.size() == this.size) {
                    this.buffer = null;
                    this.downstream.onNext(c8);
                }
            }
            if (i9 == this.skip) {
                i9 = 0;
            }
            this.index = i9;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                if (get() != 0 || !compareAndSet(0, 1)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j8));
                    return;
                }
                this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(j8, this.size), BackpressureHelper.multiplyCap(this.skip - this.size, j8 - 1)));
            }
        }
    }

    public FlowableBuffer(Flowable<T> flowable, int i8, int i9, Callable<C> callable) {
        super(flowable);
        this.size = i8;
        this.skip = i9;
        this.bufferSupplier = callable;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        int i8 = this.size;
        int i9 = this.skip;
        if (i8 == i9) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferExactSubscriber(cVar, i8, this.bufferSupplier));
        } else if (i9 > i8) {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferSkipSubscriber(cVar, this.size, this.skip, this.bufferSupplier));
        } else {
            this.source.subscribe((FlowableSubscriber) new PublisherBufferOverlappingSubscriber(cVar, this.size, this.skip, this.bufferSupplier));
        }
    }
}
