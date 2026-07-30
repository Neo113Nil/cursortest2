package io.reactivex.internal.subscribers;

import com.google.android.exoplayer2.C;
import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.BackpressureHelper;
import java.util.concurrent.atomic.AtomicLong;
import p7.c;
import p7.d;

/* loaded from: classes3.dex */
public abstract class SinglePostCompleteSubscriber<T, R> extends AtomicLong implements FlowableSubscriber<T>, d {
    static final long COMPLETE_MASK = Long.MIN_VALUE;
    static final long REQUEST_MASK = Long.MAX_VALUE;
    private static final long serialVersionUID = 7917814472626990048L;
    protected final c downstream;
    protected long produced;
    protected d upstream;
    protected R value;

    public SinglePostCompleteSubscriber(c cVar) {
        this.downstream = cVar;
    }

    public void cancel() {
        this.upstream.cancel();
    }

    protected final void complete(R r8) {
        long j8 = this.produced;
        if (j8 != 0) {
            BackpressureHelper.produced(this, j8);
        }
        while (true) {
            long j9 = get();
            if ((j9 & Long.MIN_VALUE) != 0) {
                onDrop(r8);
                return;
            }
            if ((j9 & Long.MAX_VALUE) != 0) {
                lazySet(C.TIME_UNSET);
                this.downstream.onNext(r8);
                this.downstream.onComplete();
                return;
            } else {
                this.value = r8;
                if (compareAndSet(0L, Long.MIN_VALUE)) {
                    return;
                } else {
                    this.value = null;
                }
            }
        }
    }

    public abstract /* synthetic */ void onComplete();

    protected void onDrop(R r8) {
    }

    public abstract /* synthetic */ void onError(Throwable th);

    public abstract /* synthetic */ void onNext(Object obj);

    @Override // io.reactivex.FlowableSubscriber, p7.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // p7.d
    public final void request(long j8) {
        long j9;
        if (SubscriptionHelper.validate(j8)) {
            do {
                j9 = get();
                if ((j9 & Long.MIN_VALUE) != 0) {
                    if (compareAndSet(Long.MIN_VALUE, C.TIME_UNSET)) {
                        this.downstream.onNext(this.value);
                        this.downstream.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(j9, BackpressureHelper.addCap(j9, j8)));
            this.upstream.request(j8);
        }
    }
}
