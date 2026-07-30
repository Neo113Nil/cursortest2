package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;
import p7.b;
import p7.c;

/* loaded from: classes3.dex */
public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    final ErrorMode errorMode;
    final Function<? super T, ? extends b> mapper;
    final int prefetch;
    final b source;

    public FlowableConcatMapPublisher(b bVar, Function<? super T, ? extends b> function, int i8, ErrorMode errorMode) {
        this.source = bVar;
        this.mapper = function;
        this.prefetch = i8;
        this.errorMode = errorMode;
    }

    @Override // io.reactivex.Flowable
    protected void subscribeActual(c cVar) {
        if (FlowableScalarXMap.tryScalarXMapSubscribe(this.source, cVar, this.mapper)) {
            return;
        }
        this.source.subscribe(FlowableConcatMap.subscribe(cVar, this.mapper, this.prefetch, this.errorMode));
    }
}
