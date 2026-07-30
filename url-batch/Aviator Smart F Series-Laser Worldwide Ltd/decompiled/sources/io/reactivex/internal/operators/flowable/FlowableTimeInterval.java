package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.schedulers.Timed;
import java.util.concurrent.TimeUnit;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableTimeInterval<T> extends AbstractFlowableWithUpstream<T, Timed<T>> {
    final Scheduler scheduler;
    final TimeUnit unit;

    static final class TimeIntervalSubscriber<T> implements FlowableSubscriber<T>, d {
        final c downstream;
        long lastTime;
        final Scheduler scheduler;
        final TimeUnit unit;
        d upstream;

        TimeIntervalSubscriber(c cVar, TimeUnit timeUnit, Scheduler scheduler) {
            this.downstream = cVar;
            this.scheduler = scheduler;
            this.unit = timeUnit;
        }

        @Override // p7.d
        public void cancel() {
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            long now = this.scheduler.now(this.unit);
            long j8 = this.lastTime;
            this.lastTime = now;
            this.downstream.onNext(new Timed(t7, now - j8, this.unit));
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.lastTime = this.scheduler.now(this.unit);
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
            }
        }

        @Override // p7.d
        public void request(long j8) {
            this.upstream.request(j8);
        }
    }

    public FlowableTimeInterval(Flowable<T> flowable, TimeUnit timeUnit, Scheduler scheduler) {
        super(flowable);
        this.scheduler = scheduler;
        this.unit = timeUnit;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new TimeIntervalSubscriber(cVar, this.unit, this.scheduler));
    }
}
