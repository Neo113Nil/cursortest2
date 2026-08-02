package com.squareup.util.task;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.workflow1.TimerWorker$run$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class RepeatOnLifecycleTaskRunner$repeatOn$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $action;
    public final /* synthetic */ Function1 $filter;
    public final /* synthetic */ Lifecycle.State $lifecycleState;
    public int label;
    public final /* synthetic */ RepeatOnLifecycleTaskRunner this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RepeatOnLifecycleTaskRunner$repeatOn$2(RepeatOnLifecycleTaskRunner repeatOnLifecycleTaskRunner, Lifecycle.State state, Function1 function1, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.this$0 = repeatOnLifecycleTaskRunner;
        this.$lifecycleState = state;
        this.$filter = function1;
        this.$action = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RepeatOnLifecycleTaskRunner$repeatOn$2(this.this$0, this.$lifecycleState, this.$filter, this.$action, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RepeatOnLifecycleTaskRunner$repeatOn$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Lifecycle lifecycle = this.this$0.lifecycle;
            TimerWorker$run$1 timerWorker$run$1 = new TimerWorker$run$1(this.$filter, this.$action, continuation, 23);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, this.$lifecycleState, timerWorker$run$1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
