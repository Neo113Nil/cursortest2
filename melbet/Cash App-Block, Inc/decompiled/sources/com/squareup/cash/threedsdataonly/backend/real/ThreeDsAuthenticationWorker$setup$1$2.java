package com.squareup.cash.threedsdataonly.backend.real;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.RepeatOnLifecycleKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.attribution.ActivityTransitionsSideEffectsPerformer;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ThreeDsAuthenticationWorker$setup$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Lifecycle $lifecycle;
    public int label;
    public final /* synthetic */ ActivityTransitionsSideEffectsPerformer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeDsAuthenticationWorker$setup$1$2(Lifecycle lifecycle, ActivityTransitionsSideEffectsPerformer activityTransitionsSideEffectsPerformer, Continuation continuation) {
        super(2, continuation);
        this.$lifecycle = lifecycle;
        this.this$0 = activityTransitionsSideEffectsPerformer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ThreeDsAuthenticationWorker$setup$1$2(this.$lifecycle, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((ThreeDsAuthenticationWorker$setup$1$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Lifecycle.State state = Lifecycle.State.RESUMED;
            ThreeDsAuthenticationWorker$setup$1$1 threeDsAuthenticationWorker$setup$1$1 = new ThreeDsAuthenticationWorker$setup$1$1(this.this$0, null, 1);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(this.$lifecycle, state, threeDsAuthenticationWorker$setup$1$1, this) == coroutineSingletons) {
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
