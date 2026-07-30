package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableMap;
import p7.b;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableMapPublisher<T, U> extends Flowable<U> {
    final Function<? super T, ? extends U> mapper;
    final b source;

    public FlowableMapPublisher(b bVar, Function<? super T, ? extends U> function) {
        this.source = bVar;
        this.mapper = function;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        this.source.subscribe(new FlowableMap.MapSubscriber(cVar, this.mapper));
    }
}
