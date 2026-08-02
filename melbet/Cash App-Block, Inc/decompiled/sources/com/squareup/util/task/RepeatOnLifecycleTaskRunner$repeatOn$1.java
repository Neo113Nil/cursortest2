package com.squareup.util.task;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class RepeatOnLifecycleTaskRunner$repeatOn$1 extends SuspendLambda implements Function1 {
    public RepeatOnLifecycleTaskRunner$repeatOn$1() {
        super(1, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RepeatOnLifecycleTaskRunner$repeatOn$1(1, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((RepeatOnLifecycleTaskRunner$repeatOn$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        return Boolean.TRUE;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return Boolean.TRUE;
    }
}
