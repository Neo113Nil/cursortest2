package com.squareup.util.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.AbstractFlow;
import kotlinx.coroutines.flow.AbstractFlow$collect$1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* loaded from: classes7.dex */
public final class TakeUntil extends AbstractFlow {
    public static final StopException STOP = new StopException();
    public final Flow other;
    public final Flow source;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"com/squareup/util/coroutines/TakeUntil$StopException", "Ljava/util/concurrent/CancellationException;", "Lkotlin/coroutines/cancellation/CancellationException;", "util-coroutines"}, k = 1, mv = {2, 3, 0}, xi = 48)
    /* loaded from: classes8.dex */
    public final class StopException extends CancellationException {
    }

    public TakeUntil(Flow flow, Flow flow2) {
        flow.getClass();
        flow2.getClass();
        this.source = flow;
        this.other = flow2;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public final Object collectSafely(SafeCollector safeCollector, AbstractFlow$collect$1 abstractFlow$collect$1) {
        Object coroutineScope = JobKt.coroutineScope(new TakeUntil$collectSafely$2(this, safeCollector, (Continuation) null, 0), abstractFlow$collect$1);
        return coroutineScope == CoroutineSingletons.COROUTINE_SUSPENDED ? coroutineScope : Unit.INSTANCE;
    }
}
