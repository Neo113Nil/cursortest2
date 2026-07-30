package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.TimeUnit;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableDelay<T> extends AbstractFlowableWithUpstream<T, T> {
    final long delay;
    final boolean delayError;
    final Scheduler scheduler;
    final TimeUnit unit;

    static final class DelaySubscriber<T> implements FlowableSubscriber<T>, d {
        final long delay;
        final boolean delayError;
        final c downstream;
        final TimeUnit unit;
        d upstream;

        /* renamed from: w, reason: collision with root package name */
        final Scheduler.Worker f16973w;

        final class OnComplete implements Runnable {
            OnComplete() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onComplete();
                } finally {
                    DelaySubscriber.this.f16973w.dispose();
                }
            }
        }

        final class OnError implements Runnable {

            /* renamed from: t, reason: collision with root package name */
            private final Throwable f16974t;

            OnError(Throwable th) {
                this.f16974t = th;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    DelaySubscriber.this.downstream.onError(this.f16974t);
                } finally {
                    DelaySubscriber.this.f16973w.dispose();
                }
            }
        }

        final class OnNext implements Runnable {

            /* renamed from: t, reason: collision with root package name */
            private final T f16975t;

            OnNext(T t7) {
                this.f16975t = t7;
            }

            @Override // java.lang.Runnable
            public void run() {
                DelaySubscriber.this.downstream.onNext(this.f16975t);
            }
        }

        DelaySubscriber(c cVar, long j8, TimeUnit timeUnit, Scheduler.Worker worker, boolean z7) {
            this.downstream = cVar;
            this.delay = j8;
            this.unit = timeUnit;
            this.f16973w = worker;
            this.delayError = z7;
        }

        @Override // p7.d
        public void cancel() {
            this.upstream.cancel();
            this.f16973w.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.f16973w.schedule(new OnComplete(), this.delay, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.f16973w.schedule(new OnError(th), this.delayError ? this.delay : 0L, this.unit);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.f16973w.schedule(new OnNext(t7), this.delay, this.unit);
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
            this.upstream.request(j8);
        }
    }

    public FlowableDelay(Flowable<T> flowable, long j8, TimeUnit timeUnit, Scheduler scheduler, boolean z7) {
        super(flowable);
        this.delay = j8;
        this.unit = timeUnit;
        this.scheduler = scheduler;
        this.delayError = z7;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new DelaySubscriber(this.delayError ? cVar : new SerializedSubscriber(cVar), this.delay, this.unit, this.scheduler.createWorker(), this.delayError));
    }
}
