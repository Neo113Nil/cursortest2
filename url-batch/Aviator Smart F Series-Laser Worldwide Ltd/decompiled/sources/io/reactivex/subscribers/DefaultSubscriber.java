package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.EndConsumerHelper;
import p7.d;

/* loaded from: classes3.dex */
public abstract class DefaultSubscriber<T> implements FlowableSubscriber<T> {
    d upstream;

    protected final void cancel() {
        d dVar = this.upstream;
        this.upstream = SubscriptionHelper.CANCELLED;
        dVar.cancel();
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public abstract /* synthetic */ void onComplete();

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public abstract /* synthetic */ void onError(Throwable th);

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public abstract /* synthetic */ void onNext(Object obj);

    protected void onStart() {
        request(Long.MAX_VALUE);
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public final void onSubscribe(d dVar) {
        if (EndConsumerHelper.validate(this.upstream, dVar, getClass())) {
            this.upstream = dVar;
            onStart();
        }
    }

    protected final void request(long j8) {
        d dVar = this.upstream;
        if (dVar != null) {
            dVar.request(j8);
        }
    }
}
