package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import io.reactivex.internal.subscriptions.SubscriptionArbiter;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.processors.FlowableProcessor;
import io.reactivex.processors.UnicastProcessor;
import io.reactivex.subscribers.SerializedSubscriber;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.b;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public final class FlowableRepeatWhen<T> extends AbstractFlowableWithUpstream<T, T> {
    final Function<? super Flowable<Object>, ? extends b> handler;

    static final class RepeatWhenSubscriber<T> extends WhenSourceSubscriber<T, Object> {
        private static final long serialVersionUID = -2680129890138081029L;

        RepeatWhenSubscriber(c cVar, FlowableProcessor<Object> flowableProcessor, d dVar) {
            super(cVar, flowableProcessor, dVar);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            again(0);
        }

        @Override // io.reactivex.internal.operators.flowable.FlowableRepeatWhen.WhenSourceSubscriber, io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.receiver.cancel();
            this.downstream.onError(th);
        }
    }

    static final class WhenReceiver<T, U> extends AtomicInteger implements FlowableSubscriber<Object>, d {
        private static final long serialVersionUID = 2827772011130406689L;
        final b source;
        WhenSourceSubscriber<T, U> subscriber;
        final AtomicReference<d> upstream = new AtomicReference<>();
        final AtomicLong requested = new AtomicLong();

        WhenReceiver(b bVar) {
            this.source = bVar;
        }

        @Override // p7.d
        public void cancel() {
            SubscriptionHelper.cancel(this.upstream);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onComplete() {
            this.subscriber.cancel();
            this.subscriber.downstream.onComplete();
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onError(Throwable th) {
            this.subscriber.cancel();
            this.subscriber.downstream.onError(th);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onNext(Object obj) {
            if (getAndIncrement() == 0) {
                while (this.upstream.get() != SubscriptionHelper.CANCELLED) {
                    this.source.subscribe(this.subscriber);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public void onSubscribe(d dVar) {
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        }

        @Override // p7.d
        public void request(long j8) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j8);
        }
    }

    static abstract class WhenSourceSubscriber<T, U> extends SubscriptionArbiter implements FlowableSubscriber<T> {
        private static final long serialVersionUID = -5604623027276966720L;
        protected final c downstream;
        protected final FlowableProcessor<U> processor;
        private long produced;
        protected final d receiver;

        WhenSourceSubscriber(c cVar, FlowableProcessor<U> flowableProcessor, d dVar) {
            super(false);
            this.downstream = cVar;
            this.processor = flowableProcessor;
            this.receiver = dVar;
        }

        protected final void again(U u7) {
            setSubscription(EmptySubscription.INSTANCE);
            long j8 = this.produced;
            if (j8 != 0) {
                this.produced = 0L;
                produced(j8);
            }
            this.receiver.request(1L);
            this.processor.onNext(u7);
        }

        @Override // io.reactivex.internal.subscriptions.SubscriptionArbiter, p7.d
        public final void cancel() {
            super.cancel();
            this.receiver.cancel();
        }

        public abstract /* synthetic */ void onComplete();

        public abstract /* synthetic */ void onError(Throwable th);

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public final void onNext(T t7) {
            this.produced++;
            this.downstream.onNext(t7);
        }

        @Override // io.reactivex.FlowableSubscriber, p7.c
        public final void onSubscribe(d dVar) {
            setSubscription(dVar);
        }
    }

    public FlowableRepeatWhen(Flowable<T> flowable, Function<? super Flowable<Object>, ? extends b> function) {
        super(flowable);
        this.handler = function;
    }

    @Override // io.reactivex.Flowable
    public void subscribeActual(c cVar) {
        SerializedSubscriber serializedSubscriber = new SerializedSubscriber(cVar);
        FlowableProcessor<T> serialized = UnicastProcessor.create(8).toSerialized();
        try {
            b bVar = (b) ObjectHelper.requireNonNull(this.handler.apply(serialized), "handler returned a null Publisher");
            WhenReceiver whenReceiver = new WhenReceiver(this.source);
            RepeatWhenSubscriber repeatWhenSubscriber = new RepeatWhenSubscriber(serializedSubscriber, serialized, whenReceiver);
            whenReceiver.subscriber = repeatWhenSubscriber;
            cVar.onSubscribe(repeatWhenSubscriber);
            bVar.subscribe(whenReceiver);
            whenReceiver.onNext(0);
        } catch (Throwable th) {
            Exceptions.throwIfFatal(th);
            EmptySubscription.error(th, cVar);
        }
    }
}
