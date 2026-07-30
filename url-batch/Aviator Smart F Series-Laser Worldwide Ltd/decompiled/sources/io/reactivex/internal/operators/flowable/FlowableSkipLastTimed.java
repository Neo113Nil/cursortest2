package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.queue.SpscLinkedArrayQueue;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableSkipLastTimed<T> extends AbstractFlowableWithUpstream<T, T> {
    final int bufferSize;
    final boolean delayError;
    final Scheduler scheduler;
    final long time;
    final TimeUnit unit;

    static final class SkipLastTimedSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = -5677354903406201275L;
        volatile boolean cancelled;
        final boolean delayError;
        volatile boolean done;
        final c downstream;
        Throwable error;
        final SpscLinkedArrayQueue<Object> queue;
        final AtomicLong requested = new AtomicLong();
        final Scheduler scheduler;
        final long time;
        final TimeUnit unit;
        d upstream;

        SkipLastTimedSubscriber(c cVar, long j8, TimeUnit timeUnit, Scheduler scheduler, int i8, boolean z7) {
            this.downstream = cVar;
            this.time = j8;
            this.unit = timeUnit;
            this.scheduler = scheduler;
            this.queue = new SpscLinkedArrayQueue<>(i8);
            this.delayError = z7;
        }

        @Override // p7.d
        public void cancel() {
            if (this.cancelled) {
                return;
            }
            this.cancelled = true;
            this.upstream.cancel();
            if (getAndIncrement() == 0) {
                this.queue.clear();
            }
        }

        boolean checkTerminated(boolean z7, boolean z8, c cVar, boolean z9) {
            if (this.cancelled) {
                this.queue.clear();
                return true;
            }
            if (!z7) {
                return false;
            }
            if (z9) {
                if (!z8) {
                    return false;
                }
                Throwable th = this.error;
                if (th != null) {
                    cVar.onError(th);
                } else {
                    cVar.onComplete();
                }
                return true;
            }
            Throwable th2 = this.error;
            if (th2 != null) {
                this.queue.clear();
                cVar.onError(th2);
                return true;
            }
            if (!z8) {
                return false;
            }
            cVar.onComplete();
            return true;
        }

        void drain() {
            if (getAndIncrement() != 0) {
                return;
            }
            c cVar = this.downstream;
            SpscLinkedArrayQueue<Object> spscLinkedArrayQueue = this.queue;
            boolean z7 = this.delayError;
            TimeUnit timeUnit = this.unit;
            Scheduler scheduler = this.scheduler;
            long j8 = this.time;
            int i8 = 1;
            do {
                long j9 = this.requested.get();
                long j10 = 0;
                while (j10 != j9) {
                    boolean z8 = this.done;
                    Long l8 = (Long) spscLinkedArrayQueue.peek();
                    boolean z9 = l8 == null;
                    boolean z10 = (z9 || l8.longValue() <= scheduler.now(timeUnit) - j8) ? z9 : true;
                    if (checkTerminated(z8, z10, cVar, z7)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    spscLinkedArrayQueue.poll();
                    cVar.onNext(spscLinkedArrayQueue.poll());
                    j10++;
                }
                if (j10 != 0) {
                    BackpressureHelper.produced(this.requested, j10);
                }
                i8 = addAndGet(-i8);
            } while (i8 != 0);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.error = th;
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.queue.offer(Long.valueOf(this.scheduler.now(this.unit)), t7);
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                BackpressureHelper.add(this.requested, j8);
                drain();
            }
        }
    }

    public FlowableSkipLastTimed(Flowable<T> flowable, long j8, TimeUnit timeUnit, Scheduler scheduler, int i8, boolean z7) {
        super(flowable);
        this.time = j8;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.bufferSize = i8;
        this.delayError = z7;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipLastTimedSubscriber(cVar, this.time, this.unit, this.scheduler, this.bufferSize, this.delayError));
    }
}
