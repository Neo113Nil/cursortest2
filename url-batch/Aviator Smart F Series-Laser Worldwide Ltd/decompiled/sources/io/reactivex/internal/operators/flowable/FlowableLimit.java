package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableLimit<T> extends AbstractFlowableWithUpstream<T, T> {

    /* renamed from: n, reason: collision with root package name */
    final long f16977n;

    static final class LimitSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 2288246011222124525L;
        final c downstream;
        long remaining;
        d upstream;

        LimitSubscriber(c cVar, long j8) {
            this.downstream = cVar;
            this.remaining = j8;
            lazySet(j8);
        }

        @Override // p7.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.remaining > 0) {
                this.remaining = 0L;
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.remaining <= 0) {
                RxJavaPlugins.onError(th);
            } else {
                this.remaining = 0L;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            long j8 = this.remaining;
            if (j8 > 0) {
                long j9 = j8 - 1;
                this.remaining = j9;
                this.downstream.onNext(t7);
                if (j9 == 0) {
                    this.upstream.cancel();
                    this.downstream.onComplete();
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                if (this.remaining == 0) {
                    dVar.cancel();
                    EmptySubscription.complete(this.downstream);
                } else {
                    this.upstream = dVar;
                    this.downstream.onSubscribe(this);
                }
            }
        }

        @Override // p7.d
        public void request(long j8) {
            long j9;
            long j10;
            if (SubscriptionHelper.validate(j8)) {
                do {
                    j9 = get();
                    if (j9 == 0) {
                        return;
                    } else {
                        j10 = j9 <= j8 ? j9 : j8;
                    }
                } while (!compareAndSet(j9, j9 - j10));
                this.upstream.request(j10);
            }
        }
    }

    public FlowableLimit(Flowable<T> flowable, long j8) {
        super(flowable);
        this.f16977n = j8;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new LimitSubscriber(cVar, this.f16977n));
    }
}
