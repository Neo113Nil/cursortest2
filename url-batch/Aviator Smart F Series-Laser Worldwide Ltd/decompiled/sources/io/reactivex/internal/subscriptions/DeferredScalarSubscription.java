package io.reactivex.internal.subscriptions;

import io.reactivex.annotations.Nullable;
import p7.c;

/* loaded from: classes3.dex */
public class DeferredScalarSubscription<T> extends BasicIntQueueSubscription<T> {
    static final int CANCELLED = 4;
    static final int FUSED_CONSUMED = 32;
    static final int FUSED_EMPTY = 8;
    static final int FUSED_READY = 16;
    static final int HAS_REQUEST_HAS_VALUE = 3;
    static final int HAS_REQUEST_NO_VALUE = 2;
    static final int NO_REQUEST_HAS_VALUE = 1;
    static final int NO_REQUEST_NO_VALUE = 0;
    private static final long serialVersionUID = -2151279923272604993L;
    protected final c downstream;
    protected T value;

    public DeferredScalarSubscription(c cVar) {
        this.downstream = cVar;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
    public void cancel() {
        set(4);
        this.value = null;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final void clear() {
        lazySet(32);
        this.value = null;
    }

    public final void complete(T t7) {
        int i8 = get();
        while (i8 != 8) {
            if ((i8 & (-3)) != 0) {
                return;
            }
            if (i8 == 2) {
                lazySet(3);
                c cVar = this.downstream;
                cVar.onNext(t7);
                if (get() != 4) {
                    cVar.onComplete();
                    return;
                }
                return;
            }
            this.value = t7;
            if (compareAndSet(0, 1)) {
                return;
            }
            i8 = get();
            if (i8 == 4) {
                this.value = null;
                return;
            }
        }
        this.value = t7;
        lazySet(16);
        c cVar2 = this.downstream;
        cVar2.onNext(t7);
        if (get() != 4) {
            cVar2.onComplete();
        }
    }

    public final boolean isCancelled() {
        return get() == 4;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    @Nullable
    public final T poll() {
        if (get() != 16) {
            return null;
        }
        lazySet(32);
        T t7 = this.value;
        this.value = null;
        return t7;
    }

    @Override // io.reactivex.internal.subscriptions.BasicIntQueueSubscription, io.reactivex.internal.fuseable.QueueSubscription, p7.d
    public final void request(long j8) {
        T t7;
        if (SubscriptionHelper.validate(j8)) {
            do {
                int i8 = get();
                if ((i8 & (-2)) != 0) {
                    return;
                }
                if (i8 == 1) {
                    if (!compareAndSet(1, 3) || (t7 = this.value) == null) {
                        return;
                    }
                    this.value = null;
                    c cVar = this.downstream;
                    cVar.onNext(t7);
                    if (get() != 4) {
                        cVar.onComplete();
                        return;
                    }
                    return;
                }
            } while (!compareAndSet(0, 2));
        }
    }

    @Override // io.reactivex.internal.fuseable.QueueFuseable
    public final int requestFusion(int i8) {
        if ((i8 & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final boolean tryCancel() {
        return getAndSet(4) != 4;
    }
}
