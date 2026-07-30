package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.Scheduler;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableSubscribeOn<T> extends AbstractFlowableWithUpstream<T, T> {
    final boolean nonScheduledRequests;
    final Scheduler scheduler;

    static final class SubscribeOnSubscriber<T> extends AtomicReference<Thread> implements FlowableSubscriber<T>, d, Runnable {
        private static final long serialVersionUID = 8094547886072529208L;
        final c downstream;
        final boolean nonScheduledRequests;
        b source;
        final Scheduler.Worker worker;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        static final class Request implements Runnable {

            /* renamed from: n, reason: collision with root package name */
            final long f16984n;
            final d upstream;

            Request(d dVar, long j8) {
                this.upstream = dVar;
                this.f16984n = j8;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.upstream.request(this.f16984n);
            }
        }

        SubscribeOnSubscriber(c cVar, Scheduler.Worker worker, b bVar, boolean z7) {
            this.downstream = cVar;
            this.worker = worker;
            this.source = bVar;
            this.nonScheduledRequests = !z7;
        }

        @Override // p7.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.downstream.onComplete();
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.downstream.onError(th);
            this.worker.dispose();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            this.downstream.onNext(t7);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.setOnce(this.upstream, dVar)) {
                long andSet = this.requested.getAndSet(0L);
                if (andSet != 0) {
                    requestUpstream(andSet, dVar);
                }
            }
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                d dVar = this.upstream.get();
                if (dVar != null) {
                    requestUpstream(j8, dVar);
                    return;
                }
                BackpressureHelper.add(this.requested, j8);
                d dVar2 = this.upstream.get();
                if (dVar2 != null) {
                    long andSet = this.requested.getAndSet(0L);
                    if (andSet != 0) {
                        requestUpstream(andSet, dVar2);
                    }
                }
            }
        }

        void requestUpstream(long j8, d dVar) {
            if (this.nonScheduledRequests || Thread.currentThread() == get()) {
                dVar.request(j8);
            } else {
                this.worker.schedule(new Request(dVar, j8));
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            lazySet(Thread.currentThread());
            b bVar = this.source;
            this.source = null;
            bVar.subscribe(this);
        }
    }

    public FlowableSubscribeOn(Flowable<T> flowable, Scheduler scheduler, boolean z7) {
        super(flowable);
        this.scheduler = scheduler;
        this.nonScheduledRequests = z7;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        Scheduler.Worker createWorker = this.scheduler.createWorker();
        SubscribeOnSubscriber subscribeOnSubscriber = new SubscribeOnSubscriber(cVar, createWorker, this.source, this.nonScheduledRequests);
        cVar.onSubscribe(subscribeOnSubscriber);
        createWorker.schedule(subscribeOnSubscriber);
    }
}
