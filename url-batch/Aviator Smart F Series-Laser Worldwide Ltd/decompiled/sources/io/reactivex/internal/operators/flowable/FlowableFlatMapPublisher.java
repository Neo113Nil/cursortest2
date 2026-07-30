package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import p7.b;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableFlatMapPublisher<T, U> extends Flowable<U> {
    final int bufferSize;
    final boolean delayErrors;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;
    final b source;

    public FlowableFlatMapPublisher(b bVar, Function<? super T, ? extends b> function, boolean z7, int i8, int i9) {
        this.source = bVar;
        this.mapper = function;
        this.delayErrors = z7;
        this.maxConcurrency = i8;
        this.bufferSize = i9;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableFlatMap.subscribe(cVar, this.mapper, this.delayErrors, this.maxConcurrency, this.bufferSize));
    }
}
