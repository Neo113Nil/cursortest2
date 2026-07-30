package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import p7.b;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableFromPublisher<T> extends Flowable<T> {
    final b publisher;

    public FlowableFromPublisher(b bVar) {
        this.publisher = bVar;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.publisher.subscribe(cVar);
    }
}
