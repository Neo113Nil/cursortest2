package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableSingle<T> extends AbstractFlowableWithUpstream<T, T> {
    final T defaultValue;
    final boolean failOnEmpty;

    static final class SingleElementSubscriber<T> extends DeferredScalarSubscription<T> implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5526049321428043809L;
        final T defaultValue;
        boolean done;
        final boolean failOnEmpty;
        d upstream;

        SingleElementSubscriber(c cVar, T t7, boolean z7) {
            super(cVar);
            this.defaultValue = t7;
            this.failOnEmpty = z7;
        }

        @Override // io.reactivex.internal.subscriptions.DeferredScalarSubscription, io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
        public void cancel() {
            super.cancel();
            this.upstream.cancel();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            if (this.done) {
                return;
            }
            this.done = true;
            T t7 = this.value;
            this.value = null;
            if (t7 == null) {
                t7 = this.defaultValue;
            }
            if (t7 != null) {
                complete(t7);
            } else if (this.failOnEmpty) {
                this.downstream.onError(new NoSuchElementException());
            } else {
                this.downstream.onComplete();
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            if (this.done) {
                RxJavaPlugins.onError(th);
            } else {
                this.done = true;
                this.downstream.onError(th);
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(T t7) {
            if (this.done) {
                return;
            }
            if (this.value == null) {
                this.value = t7;
                return;
            }
            this.done = true;
            this.upstream.cancel();
            this.downstream.onError(new IllegalArgumentException("Sequence contains more than one element!"));
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            if (SubscriptionHelper.validate(this.upstream, dVar)) {
                this.upstream = dVar;
                this.downstream.onSubscribe(this);
                dVar.request(Long.MAX_VALUE);
            }
        }
    }

    public FlowableSingle(Flowable<T> flowable, T t7, boolean z7) {
        super(flowable);
        this.defaultValue = t7;
        this.failOnEmpty = z7;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SingleElementSubscriber(cVar, this.defaultValue, this.failOnEmpty));
    }
}
