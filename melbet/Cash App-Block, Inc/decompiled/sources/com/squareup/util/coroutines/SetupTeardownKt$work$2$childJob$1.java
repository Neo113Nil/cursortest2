package com.squareup.util.coroutines;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SetupTeardownKt$work$2$childJob$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Ref$ObjectRef $teardown;
    public final /* synthetic */ SetupTeardown $this_work;
    public final /* synthetic */ Object $value;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SetupTeardownKt$work$2$childJob$1(Ref$ObjectRef ref$ObjectRef, SetupTeardown setupTeardown, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$teardown = ref$ObjectRef;
        this.$this_work = setupTeardown;
        this.$value = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                SetupTeardownKt$work$2$childJob$1 setupTeardownKt$work$2$childJob$1 = new SetupTeardownKt$work$2$childJob$1(this.$teardown, this.$this_work, this.$value, continuation, 0);
                setupTeardownKt$work$2$childJob$1.L$0 = obj;
                return setupTeardownKt$work$2$childJob$1;
            default:
                SetupTeardownKt$work$2$childJob$1 setupTeardownKt$work$2$childJob$12 = new SetupTeardownKt$work$2$childJob$1(this.$teardown, (CompositeSetupTeardown) this.$this_work, this.$value, continuation, 1);
                setupTeardownKt$work$2$childJob$12.L$0 = obj;
                return setupTeardownKt$work$2$childJob$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SetupTeardownKt$work$2$childJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Object obj2 = this.$value;
        SetupTeardown setupTeardown = this.$this_work;
        Ref$ObjectRef ref$ObjectRef = this.$teardown;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef.element = StateFlowKt.setup(setupTeardown, coroutineScope, obj2);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                ref$ObjectRef.element = StateFlowKt.setup((CompositeSetupTeardown) setupTeardown, coroutineScope, obj2);
                break;
        }
        return Unit.INSTANCE;
    }
}
