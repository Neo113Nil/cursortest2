package com.squareup.util.compose;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.room.RoomDatabase$performClear$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.FlowExtensionsKt$combine$$inlined$combine$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class LifecycleKt$LifecycleLaunchedEffect$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ LifecycleOwner $lifecycleOwner;
    public final /* synthetic */ Lifecycle.State $state;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleKt$LifecycleLaunchedEffect$2$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.$lifecycleOwner = lifecycleOwner;
        this.$state = state;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LifecycleKt$LifecycleLaunchedEffect$2$1 lifecycleKt$LifecycleLaunchedEffect$2$1 = new LifecycleKt$LifecycleLaunchedEffect$2$1(this.$lifecycleOwner, this.$state, this.$block, continuation);
        lifecycleKt$LifecycleLaunchedEffect$2$1.L$0 = obj;
        return lifecycleKt$LifecycleLaunchedEffect$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LifecycleKt$LifecycleLaunchedEffect$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(new FlowExtensionsKt$combine$$inlined$combine$1(24, this.$lifecycleOwner.getLifecycle().getCurrentStateFlow(), this.$state));
            RoomDatabase$performClear$1 roomDatabase$performClear$1 = new RoomDatabase$performClear$1(this.$block, coroutineScope, continuation, 23);
            this.L$0 = null;
            this.label = 1;
            if (FlowKt.collectLatest(distinctUntilChanged, roomDatabase$performClear$1, this) == coroutineSingletons) {
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
