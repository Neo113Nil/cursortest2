package io.reactivex.internal.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AtomicThrowable;
import io.reactivex.internal.util.HalfSerializer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public class StrictSubscriber<T> extends AtomicInteger implements FlowableSubscriber<T>, d {
    private static final long serialVersionUID = -4945028590049415624L;
    volatile boolean done;
    final c downstream;
    final AtomicThrowable error = new AtomicThrowable();
    final AtomicLong requested = new AtomicLong();
    final AtomicReference<d> upstream = new AtomicReference<>();
    final AtomicBoolean once = new AtomicBoolean();

    public StrictSubscriber(c cVar) {
        this.downstream = cVar;
    }

    @Override // p7.d
    public void cancel() {
        if (this.done) {
            return;
        }
        SubscriptionHelper.cancel(this.upstream);
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onComplete() {
        this.done = true;
        HalfSerializer.onComplete(this.downstream, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onError(Throwable th) {
        this.done = true;
        HalfSerializer.onError(this.downstream, th, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onNext(T t7) {
        HalfSerializer.onNext(this.downstream, t7, this, this.error);
    }

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onSubscribe(d dVar) {
        if (this.once.compareAndSet(false, true)) {
            this.downstream.onSubscribe(this);
            SubscriptionHelper.deferredSetOnce(this.upstream, this.requested, dVar);
        } else {
            dVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
        }
    }

    @Override // p7.d
    public void request(long j8) {
        if (j8 > 0) {
            SubscriptionHelper.deferredRequest(this.upstream, this.requested, j8);
            return;
        }
        cancel();
        onError(new IllegalArgumentException("§3.9 violated: positive request amount required but it was " + j8));
    }
}
