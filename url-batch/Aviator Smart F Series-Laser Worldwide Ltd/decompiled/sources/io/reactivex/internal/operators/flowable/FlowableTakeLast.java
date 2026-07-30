package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableTakeLast<T> extends AbstractFlowableWithUpstream<T, T> {
    final int count;

    static final class TakeLastSubscriber<T> extends ArrayDeque<T> implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 7240042530241604978L;
        volatile boolean cancelled;
        final int count;
        volatile boolean done;
        final c downstream;
        d upstream;
        final AtomicLong requested = new AtomicLong();
        final AtomicInteger wip = new AtomicInteger();

        TakeLastSubscriber(c cVar, int i8) {
            this.downstream = cVar;
            this.count = i8;
        }

        @Override // p7.d
        public void cancel() {
            this.cancelled = true;
            this.upstream.cancel();
        }

        void drain() {
            if (this.wip.getAndIncrement() == 0) {
                c cVar = this.downstream;
                long j8 = this.requested.get();
                while (!this.cancelled) {
                    if (this.done) {
                        long j9 = 0;
                        while (j9 != j8) {
                            if (this.cancelled) {
                                return;
                            }
                            T poll = poll();
                            if (poll == null) {
                                cVar.onComplete();
                                return;
                            } else {
                                cVar.onNext(poll);
                                j9++;
                            }
                        }
                        if (j9 != 0 && j8 != Long.MAX_VALUE) {
                            j8 = this.requested.addAndGet(-j9);
                        }
                    }
                    if (this.wip.decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.done = true;
            drain();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.count == size()) {
                poll();
            }
            offer(t7);
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

    public FlowableTakeLast(Flowable<T> flowable, int i8) {
        super(flowable);
        this.count = i8;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new TakeLastSubscriber(cVar, this.count));
    }
}
