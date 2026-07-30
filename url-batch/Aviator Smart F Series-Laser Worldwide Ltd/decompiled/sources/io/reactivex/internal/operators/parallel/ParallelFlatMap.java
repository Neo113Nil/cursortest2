package io.reactivex.internal.operators.parallel;

import io.reactivex.functions.Function;
import io.reactivex.internal.operators.flowable.FlowableFlatMap;
import io.reactivex.parallel.ParallelFlowable;
import p7.b;
import p7.c;

/* loaded from: classes3.dex */
public final class ParallelFlatMap<T, R> extends ParallelFlowable<R> {
    final boolean delayError;
    final Function<? super T, ? extends b> mapper;
    final int maxConcurrency;
    final int prefetch;
    final ParallelFlowable<T> source;

    public ParallelFlatMap(ParallelFlowable<T> parallelFlowable, Function<? super T, ? extends b> function, boolean z7, int i8, int i9) {
        this.source = parallelFlowable;
        this.mapper = function;
        this.delayError = z7;
        this.maxConcurrency = i8;
        this.prefetch = i9;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.source.parallelism();
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            c[] cVarArr2 = new c[length];
            for (int i8 = 0; i8 < length; i8++) {
                cVarArr2[i8] = FlowableFlatMap.subscribe(cVarArr[i8], this.mapper, this.delayError, this.maxConcurrency, this.prefetch);
            }
            this.source.subscribe(cVarArr2);
        }
    }
}
