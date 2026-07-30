package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import io.reactivex.processors.UnicastProcessor;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableWindow<T> extends AbstractFlowableWithUpstream<T, Flowable<T>> {
    final int bufferSize;
    final long size;
    final long skip;

    static final class WindowExactSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -2365647875069161133L;
        final int bufferSize;
        final c downstream;
        long index;
        final AtomicBoolean once;
        final long size;
        d upstream;
        UnicastProcessor<T> window;

        WindowExactSubscriber(c cVar, long j8, int i8) {
            super(1);
            this.downstream = cVar;
            this.size = j8;
            this.once = new AtomicBoolean();
            this.bufferSize = i8;
        }

        @Override // p7.d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            long j8 = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j8 == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j9 = j8 + 1;
            unicastProcessor.onNext(t7);
            if (j9 != this.size) {
                this.index = j9;
                return;
            }
            this.index = 0L;
            this.window = null;
            unicastProcessor.onComplete();
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
                this.upstream.request(BackpressureHelper.multiplyCap(this.size, j8));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    static final class WindowOverlapSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 2428527070996323976L;
        final int bufferSize;
        volatile boolean cancelled;
        volatile boolean done;
        final c downstream;
        Throwable error;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        long produced;
        final SpscLinkedArrayQueue<UnicastProcessor<T>> queue;
        final AtomicLong requested;
        final long size;
        final long skip;
        d upstream;
        final ArrayDeque<UnicastProcessor<T>> windows;
        final AtomicInteger wip;

        WindowOverlapSubscriber(c cVar, long j8, long j9, int i8) {
            super(1);
            this.downstream = cVar;
            this.size = j8;
            this.skip = j9;
            this.queue = new SpscLinkedArrayQueue<>(i8);
            this.windows = new ArrayDeque<>();
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.requested = new AtomicLong();
            this.wip = new AtomicInteger();
            this.bufferSize = i8;
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        boolean checkTerminated(boolean z7, boolean z8, c cVar, SpscLinkedArrayQueue<?> spscLinkedArrayQueue) {
            if (this.cancelled) {
                spscLinkedArrayQueue.clear();
                return true;
            }
            if (!z7) {
                return false;
            }
            Throwable th = this.error;
            if (th != null) {
                spscLinkedArrayQueue.clear();
                cVar.onError(th);
                return true;
            }
            if (!z8) {
                return false;
            }
            cVar.onComplete();
            return true;
        }

        void drain() {
            if (this.wip.getAndIncrement() != 0) {
                return;
            }
            c cVar = this.downstream;
            SpscLinkedArrayQueue<UnicastProcessor<T>> spscLinkedArrayQueue = this.queue;
            int i8 = 1;
            do {
                long j8 = this.requested.get();
                long j9 = 0;
                while (j9 != j8) {
                    boolean z7 = this.done;
                    UnicastProcessor<T> poll = spscLinkedArrayQueue.poll();
                    boolean z8 = poll == null;
                    if (checkTerminated(z7, z8, cVar, spscLinkedArrayQueue)) {
                        return;
                    }
                    if (z8) {
                        break;
                    }
                    cVar.onNext(poll);
                    j9++;
                }
                if (j9 == j8 && checkTerminated(this.done, spscLinkedArrayQueue.isEmpty(), cVar, spscLinkedArrayQueue)) {
                    return;
                }
                if (j9 != 0 && j8 != Long.MAX_VALUE) {
                    this.requested.addAndGet(-j9);
                }
                i8 = this.wip.addAndGet(-i8);
            } while (i8 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onComplete();
            }
            this.windows.clear();
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
                return;
            }
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onError(th);
            }
            this.windows.clear();
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.done) {
                return;
            }
            long j8 = this.index;
            if (j8 == 0 && !this.cancelled) {
                getAndIncrement();
                UnicastProcessor<T> create = UnicastProcessor.create(this.bufferSize, this);
                this.windows.offer(create);
                this.queue.offer(create);
                drain();
            }
            long j9 = j8 + 1;
            Iterator<UnicastProcessor<T>> it = this.windows.iterator();
            while (it.hasNext()) {
                it.next().onNext(t7);
            }
            long j10 = this.produced + 1;
            if (j10 == this.size) {
                this.produced = j10 - this.skip;
                UnicastProcessor<T> poll = this.windows.poll();
                if (poll != null) {
                    poll.onComplete();
                }
            } else {
                this.produced = j10;
            }
            if (j9 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j9;
            }
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
                BackpressureHelper.add(this.requested, j8);
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j8));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(this.size, BackpressureHelper.multiplyCap(this.skip, j8 - 1)));
                }
                drain();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    static final class WindowSkipSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = -8792836352386833856L;
        final int bufferSize;
        final c downstream;
        final AtomicBoolean firstRequest;
        long index;
        final AtomicBoolean once;
        final long size;
        final long skip;
        d upstream;
        UnicastProcessor<T> window;

        WindowSkipSubscriber(c cVar, long j8, long j9, int i8) {
            super(1);
            this.downstream = cVar;
            this.size = j8;
            this.skip = j9;
            this.once = new AtomicBoolean();
            this.firstRequest = new AtomicBoolean();
            this.bufferSize = i8;
        }

        @Override // p7.d
        public void cancel() {
            if (this.once.compareAndSet(false, true)) {
                run();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            UnicastProcessor<T> unicastProcessor = this.window;
            if (unicastProcessor != null) {
                this.window = null;
                unicastProcessor.onError(th);
            }
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            long j8 = this.index;
            UnicastProcessor<T> unicastProcessor = this.window;
            if (j8 == 0) {
                getAndIncrement();
                unicastProcessor = UnicastProcessor.create(this.bufferSize, this);
                this.window = unicastProcessor;
                this.downstream.onNext(unicastProcessor);
            }
            long j9 = j8 + 1;
            if (unicastProcessor != null) {
                unicastProcessor.onNext(t7);
            }
            if (j9 == this.size) {
                this.window = null;
                unicastProcessor.onComplete();
            }
            if (j9 == this.skip) {
                this.index = 0L;
            } else {
                this.index = j9;
            }
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
                if (this.firstRequest.get() || !this.firstRequest.compareAndSet(false, true)) {
                    this.upstream.request(BackpressureHelper.multiplyCap(this.skip, j8));
                } else {
                    this.upstream.request(BackpressureHelper.addCap(BackpressureHelper.multiplyCap(this.size, j8), BackpressureHelper.multiplyCap(this.skip - this.size, j8 - 1)));
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (decrementAndGet() == 0) {
                this.upstream.cancel();
            }
        }
    }

    public FlowableWindow(Flowable<T> flowable, long j8, long j9, int i8) {
        super(flowable);
        this.size = j8;
        this.skip = j9;
        this.bufferSize = i8;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        long j8 = this.skip;
        long j9 = this.size;
        if (j8 == j9) {
            this.source.subscribe((FlowableSubscriber) new WindowExactSubscriber(cVar, this.size, this.bufferSize));
        } else if (j8 > j9) {
            this.source.subscribe((FlowableSubscriber) new WindowSkipSubscriber(cVar, this.size, this.skip, this.bufferSize));
        } else {
            this.source.subscribe((FlowableSubscriber) new WindowOverlapSubscriber(cVar, this.size, this.skip, this.bufferSize));
        }
    }
}
