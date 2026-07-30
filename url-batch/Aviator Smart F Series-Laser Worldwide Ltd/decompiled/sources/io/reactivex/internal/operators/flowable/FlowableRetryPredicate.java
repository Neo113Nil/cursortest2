package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import java.util.concurrent.atomic.AtomicInteger;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableRetryPredicate<T> extends AbstractFlowableWithUpstream<T, T> {
    final long count;
    final Predicate<? super Throwable> predicate;

    static final class RetrySubscriber<T> extends AtomicInteger implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -7098360935104053232L;
        final c downstream;
        final Predicate<? super Throwable> predicate;
        long produced;
        long remaining;
        final SubscriptionArbiter sa;
        final b source;

        RetrySubscriber(c cVar, long j8, Predicate<? super Throwable> predicate, SubscriptionArbiter subscriptionArbiter, b bVar) {
            this.downstream = cVar;
            this.sa = subscriptionArbiter;
            this.source = bVar;
            this.predicate = predicate;
            this.remaining = j8;
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            long j8 = this.remaining;
            if (j8 != Long.MAX_VALUE) {
                this.remaining = j8 - 1;
            }
            if (j8 == 0) {
                this.downstream.onError(th);
                return;
            }
            try {
                if (this.predicate.test(th)) {
                    subscribeNext();
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                Exceptions.throwIfFatal(th2);
                this.downstream.onError(new CompositeException(th, th2));
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.produced++;
            this.downstream.onNext(t7);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            this.sa.setSubscription(dVar);
        }

        void subscribeNext() {
            if (getAndIncrement() == 0) {
                int i8 = 1;
                while (!this.sa.isCancelled()) {
                    long j8 = this.produced;
                    if (j8 != 0) {
                        this.produced = 0L;
                        this.sa.produced(j8);
                    }
                    this.source.subscribe(this);
                    i8 = addAndGet(-i8);
                    if (i8 == 0) {
                        return;
                    }
                }
            }
        }
    }

    public FlowableRetryPredicate(Flowable<T> flowable, long j8, Predicate<? super Throwable> predicate) {
        super(flowable);
        this.predicate = predicate;
        this.count = j8;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SubscriptionArbiter subscriptionArbiter = new SubscriptionArbiter(false);
        cVar.onSubscribe(subscriptionArbiter);
        new RetrySubscriber(cVar, this.count, this.predicate, subscriptionArbiter, this.source).subscribeNext();
    }
}
