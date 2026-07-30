package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.annotations.CheckReturnValue;
import io.reactivex.annotations.NonNull;
import io.reactivex.annotations.Nullable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.BasicIntQueueSubscription;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class UnicastProcessor<T> extends FlowableProcessor<T> {
    volatile boolean cancelled;
    final boolean delayError;
    volatile boolean done;
    final AtomicReference<c> downstream;
    boolean enableOperatorFusion;
    Throwable error;
    final AtomicReference<Runnable> onTerminate;
    final AtomicBoolean once;
    final SpscLinkedArrayQueue<T> queue;
    final AtomicLong requested;
    final BasicIntQueueSubscription<T> wip;

    final class UnicastQueueSubscription extends BasicIntQueueSubscription<T> {
        private static final long serialVersionUID = -4896760517184205454L;

        UnicastQueueSubscription() {
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public void cancel() {
            if (UnicastProcessor.this.cancelled) {
                return;
            }
            UnicastProcessor.this.cancelled = true;
            UnicastProcessor.this.doTerminate();
            UnicastProcessor.this.downstream.lazySet(null);
            if (UnicastProcessor.this.wip.getAndIncrement() == 0) {
                UnicastProcessor.this.downstream.lazySet(null);
                UnicastProcessor unicastProcessor = UnicastProcessor.this;
                if (unicastProcessor.enableOperatorFusion) {
                    return;
                }
                unicastProcessor.queue.clear();
            }
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public void clear() {
            UnicastProcessor.this.queue.clear();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        public boolean isEmpty() {
            return UnicastProcessor.this.queue.isEmpty();
        }

        @Override // io.reactivex.internal.fuseable.SimpleQueue
        @Nullable
        public T poll() {
            return UnicastProcessor.this.queue.poll();
        }

        @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(UnicastProcessor.this.requested, j8);
                UnicastProcessor.this.drain();
            }
        }

        @Override // io.reactivex.internal.fuseable.QueueFuseable
        public int requestFusion(int i8) {
            if ((i8 & 2) == 0) {
                return 0;
            }
            UnicastProcessor.this.enableOperatorFusion = true;
            return 2;
        }
    }

    UnicastProcessor(int i8) {
        this(i8, null, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create() {
        return new UnicastProcessor<>(Flowable.bufferSize());
    }

    boolean checkTerminated(boolean z7, boolean z8, boolean z9, c cVar, SpscLinkedArrayQueue<T> spscLinkedArrayQueue) {
        if (this.cancelled) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            return true;
        }
        if (!z8) {
            return false;
        }
        if (z7 && this.error != null) {
            spscLinkedArrayQueue.clear();
            this.downstream.lazySet(null);
            cVar.onError(this.error);
            return true;
        }
        if (!z9) {
            return false;
        }
        Throwable th = this.error;
        this.downstream.lazySet(null);
        if (th != null) {
            cVar.onError(th);
        } else {
            cVar.onComplete();
        }
        return true;
    }

    void doTerminate() {
        Runnable andSet = this.onTerminate.getAndSet(null);
        if (andSet != null) {
            andSet.run();
        }
    }

    void drain() {
        if (this.wip.getAndIncrement() != 0) {
            return;
        }
        c cVar = this.downstream.get();
        int i8 = 1;
        while (cVar == null) {
            i8 = this.wip.addAndGet(-i8);
            if (i8 == 0) {
                return;
            } else {
                cVar = this.downstream.get();
            }
        }
        if (this.enableOperatorFusion) {
            drainFused(cVar);
        } else {
            drainRegular(cVar);
        }
    }

    void drainFused(c cVar) {
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        int i8 = 1;
        boolean z7 = !this.delayError;
        while (!this.cancelled) {
            boolean z8 = this.done;
            if (z7 && z8 && this.error != null) {
                spscLinkedArrayQueue.clear();
                this.downstream.lazySet(null);
                cVar.onError(this.error);
                return;
            }
            cVar.onNext(null);
            if (z8) {
                this.downstream.lazySet(null);
                Throwable th = this.error;
                if (th != null) {
                    cVar.onError(th);
                    return;
                } else {
                    cVar.onComplete();
                    return;
                }
            }
            i8 = this.wip.addAndGet(-i8);
            if (i8 == 0) {
                return;
            }
        }
        this.downstream.lazySet(null);
    }

    void drainRegular(c cVar) {
        long j8;
        SpscLinkedArrayQueue<T> spscLinkedArrayQueue = this.queue;
        boolean z7 = !this.delayError;
        int i8 = 1;
        do {
            long j9 = this.requested.get();
            long j10 = 0;
            while (true) {
                if (j9 == j10) {
                    j8 = j10;
                    break;
                }
                boolean z8 = this.done;
                T poll = spscLinkedArrayQueue.poll();
                boolean z9 = poll == null;
                j8 = j10;
                if (checkTerminated(z7, z8, z9, cVar, spscLinkedArrayQueue)) {
                    return;
                }
                if (z9) {
                    break;
                }
                cVar.onNext(poll);
                j10 = 1 + j8;
            }
            if (j9 == j10 && checkTerminated(z7, this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                return;
            }
            if (j8 != 0 && j9 != Long.MAX_VALUE) {
                this.requested.addAndGet(-j8);
            }
            i8 = this.wip.addAndGet(-i8);
        } while (i8 != 0);
    }

    @Override // io.reactivex.processors.FlowableProcessor
    @Nullable
    public Throwable getThrowable() {
        if (this.done) {
            return this.error;
        }
        return null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasComplete() {
        return this.done && this.error == null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasSubscribers() {
        return this.downstream.get() != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor
    public boolean hasThrowable() {
        return this.done && this.error != null;
    }

    @Override // io.reactivex.processors.FlowableProcessor, p7.a, p7.c
    public void onComplete() {
        if (this.done || this.cancelled) {
            return;
        }
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, p7.a, p7.c
    public void onError(Throwable th) {
        ObjectHelper.requireNonNull(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            RxJavaPlugins.onError(th);
            return;
        }
        this.error = th;
        this.done = true;
        doTerminate();
        drain();
    }

    @Override // io.reactivex.processors.FlowableProcessor, p7.a, p7.c
    public void onNext(T t7) {
        ObjectHelper.requireNonNull(t7, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.done || this.cancelled) {
            return;
        }
        this.queue.offer(t7);
        drain();
    }

    @Override // p7.a, p7.c
    public void onSubscribe(d dVar) {
        if (this.done || this.cancelled) {
            dVar.cancel();
        } else {
            dVar.request(Long.MAX_VALUE);
        }
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        if (this.once.get() || !this.once.compareAndSet(false, true)) {
            EmptySubscription.error(new IllegalStateException("This processor allows only a single Subscriber"), cVar);
            return;
        }
        cVar.onSubscribe(this.wip);
        this.downstream.set(cVar);
        if (this.cancelled) {
            this.downstream.lazySet(null);
        } else {
            drain();
        }
    }

    UnicastProcessor(int i8, Runnable runnable) {
        this(i8, runnable, true);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i8) {
        return new UnicastProcessor<>(i8);
    }

    UnicastProcessor(int i8, Runnable runnable, boolean z7) {
        this.queue = new SpscLinkedArrayQueue<>(ObjectHelper.verifyPositive(i8, "capacityHint"));
        this.onTerminate = new AtomicReference<>(runnable);
        this.delayError = z7;
        this.downstream = new AtomicReference<>();
        this.once = new AtomicBoolean();
        this.wip = new UnicastQueueSubscription();
        this.requested = new AtomicLong();
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(boolean z7) {
        return new UnicastProcessor<>(Flowable.bufferSize(), null, z7);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i8, Runnable runnable) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i8, runnable);
    }

    @CheckReturnValue
    @NonNull
    public static <T> UnicastProcessor<T> create(int i8, Runnable runnable, boolean z7) {
        ObjectHelper.requireNonNull(runnable, "onTerminate");
        return new UnicastProcessor<>(i8, runnable, z7);
    }
}
