package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableDelaySubscriptionOther<T, U> extends Flowable<T> {
    final b main;
    final b other;

    static final class MainSubscriber<T> extends AtomicLong implements FlowableSubscriber<T>, d {
        private static final long serialVersionUID = 2259811067697317255L;
        final c downstream;
        final b main;
        final MainSubscriber<T>.OtherSubscriber other = new OtherSubscriber();
        final AtomicReference<d> upstream = new AtomicReference<>();

        final class OtherSubscriber extends AtomicReference<d> implements FlowableSubscriber<Object> {
            private static final long serialVersionUID = -3892798459447644106L;

            OtherSubscriber() {
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onComplete() {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onError(Throwable th) {
                if (get() != SubscriptionHelper.CANCELLED) {
                    MainSubscriber.this.downstream.onError(th);
                } else {
                    RxJavaPlugins.onError(th);
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onNext(Object obj) {
                d dVar = get();
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (dVar != subscriptionHelper) {
                    lazySet(subscriptionHelper);
                    dVar.cancel();
                    MainSubscriber.this.next();
                }
            }

            @Override // io.reactivex.FlowableSubscriber, p7.c
            public void onSubscribe(d dVar) {
                if (SubscriptionHelper.setOnce(this, dVar)) {
                    dVar.request(Long.MAX_VALUE);
                }
            }
        }

        MainSubscriber(c cVar, b bVar) {
            this.downstream = cVar;
            this.main = bVar;
        }

        @Override // p7.d
        public void cancel() {
            SubscriptionHelper.cancel(this.other);
            SubscriptionHelper.cancel(this.upstream);
        }

        void next() {
            this.main.subscribe(this);
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
            this.downstream.onNext(t7);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this, dVar);
        }

        @Override // p7.d
        public void request(long j8) {
            if (SubscriptionHelper.validate(j8)) {
                SubscriptionHelper.deferredRequest(this.upstream, this, j8);
            }
        }
    }

    public FlowableDelaySubscriptionOther(b bVar, b bVar2) {
        this.main = bVar;
        this.other = bVar2;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        MainSubscriber mainSubscriber = new MainSubscriber(cVar, this.main);
        cVar.onSubscribe(mainSubscriber);
        this.other.subscribe(mainSubscriber.other);
    }
}
