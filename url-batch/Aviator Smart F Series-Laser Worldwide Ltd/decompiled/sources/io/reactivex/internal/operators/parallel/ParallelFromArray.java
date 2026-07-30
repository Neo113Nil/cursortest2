package io.reactivex.internal.operators.parallel;

import io.reactivex.parallel.ParallelFlowable;
import p7.b;
import p7.c;

/* loaded from: classes3.dex */
public final class ParallelFromArray<T> extends ParallelFlowable<T> {
    final b[] sources;

    public ParallelFromArray(b[] bVarArr) {
        this.sources = bVarArr;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public int parallelism() {
        return this.sources.length;
    }

    @Override // io.reactivex.parallel.ParallelFlowable
    public void subscribe(c[] cVarArr) {
        if (validate(cVarArr)) {
            int length = cVarArr.length;
            for (int i8 = 0; i8 < length; i8++) {
                this.sources[i8].subscribe(cVarArr[i8]);
            }
        }
    }
}
