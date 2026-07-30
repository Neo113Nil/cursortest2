package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public abstract class BasicQueueSubscription<T> extends AtomicLong implements QueueSubscription<T> {
    private static final long serialVersionUID = -6671519529404341862L;

    public abstract /* synthetic */ void cancel();

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t7) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public abstract /* synthetic */ void request(long j8);

    @Override // io.reactivex.internal.fuseable.SimpleQueue
    public final boolean offer(T t7, T t8) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
