package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableSkipWhile<T> extends AbstractFlowableWithUpstream<T, T> {
    final Predicate<? super T> predicate;

    static final class SkipWhileSubscriber<T> implements FlowableSubscriber<T>, d {
        final c downstream;
        boolean notSkipping;
        final Predicate<? super T> predicate;
        d upstream;

        SkipWhileSubscriber(c cVar, Predicate<? super T> predicate) {
            this.downstream = cVar;
            this.predicate = predicate;
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
            if (this.notSkipping) {
                this.downstream.onNext(t7);
                return;
            }
            try {
                if (this.predicate.test(t7)) {
                    this.upstream.request(1L);
                } else {
                    this.notSkipping = true;
                    this.downstream.onNext(t7);
                }
            } catch (Throwable th) {
                Exceptions.throwIfFatal(th);
                this.upstream.cancel();
                this.downstream.onError(th);
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
            this.upstream.request(j8);
        }
    }

    public FlowableSkipWhile(Flowable<T> flowable, Predicate<? super T> predicate) {
        super(flowable);
        this.predicate = predicate;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe((FlowableSubscriber) new SkipWhileSubscriber(cVar, this.predicate));
    }
}
