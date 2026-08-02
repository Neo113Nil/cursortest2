package com.squareup.util.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class PendingUndispatchedLaunch$launch$1 extends SuspendLambda implements Function3 {
    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        return new PendingUndispatchedLaunch$launch$1(3, (Continuation) obj3).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
