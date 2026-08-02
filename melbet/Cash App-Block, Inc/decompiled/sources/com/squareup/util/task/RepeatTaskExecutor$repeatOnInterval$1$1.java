package com.squareup.util.task;

import androidx.lifecycle.Lifecycle;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class RepeatTaskExecutor$repeatOnInterval$1$1 extends SuspendLambda implements Function1 {
    public final /* synthetic */ Lifecycle.State $lifecycleState;
    public final /* synthetic */ RepeatTaskExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatTaskExecutor$repeatOnInterval$1$1(Lifecycle.State state, RepeatTaskExecutor repeatTaskExecutor, Continuation continuation) {
        super(1, continuation);
        this.$lifecycleState = state;
        this.this$0 = repeatTaskExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new RepeatTaskExecutor$repeatOnInterval$1$1(this.$lifecycleState, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return ((RepeatTaskExecutor$repeatOnInterval$1$1) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        Lifecycle.State state = this.$lifecycleState;
        return Boolean.valueOf(state != null ? this.this$0.lifecycle.getCurrentState().isAtLeast(state) : true);
    }
}
