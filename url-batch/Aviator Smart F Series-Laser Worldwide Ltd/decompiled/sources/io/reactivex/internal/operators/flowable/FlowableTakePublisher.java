package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.operators.flowable.FlowableTake;
import p7.b;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableTakePublisher<T> extends Flowable<T> {
    final long limit;
    final b source;

    public FlowableTakePublisher(b bVar, long j8) {
        this.source = bVar;
        this.limit = j8;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe(new FlowableTake.TakeSubscriber(cVar, this.limit));
    }
}
