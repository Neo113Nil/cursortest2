package com.squareup.util.coroutines;

import com.squareup.util.coroutines.TakeUntil;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes8.dex */
public final class TakeUntil$collectSafely$2$job$1$1 implements FlowCollector {
    public static final TakeUntil$collectSafely$2$job$1$1 INSTANCE = new TakeUntil$collectSafely$2$job$1$1();

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        TakeUntil.StopException stopException = TakeUntil.STOP;
        throw TakeUntil.STOP;
    }
}
