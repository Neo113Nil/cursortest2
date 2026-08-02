package com.squareup.workflow1.internal;

import com.fillr.featuretoggle.UnleashContext;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelResult;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class WorkflowRunner$nextOutput$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ UnleashContext this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WorkflowRunner$nextOutput$2$1(UnleashContext unleashContext, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = unleashContext;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        UnleashContext unleashContext = this.this$0;
        switch (i) {
            case 0:
                WorkflowRunner$nextOutput$2$1 workflowRunner$nextOutput$2$1 = new WorkflowRunner$nextOutput$2$1(unleashContext, continuation, 0);
                workflowRunner$nextOutput$2$1.L$0 = obj;
                return workflowRunner$nextOutput$2$1;
            default:
                WorkflowRunner$nextOutput$2$1 workflowRunner$nextOutput$2$12 = new WorkflowRunner$nextOutput$2$1(unleashContext, continuation, 1);
                workflowRunner$nextOutput$2$12.L$0 = obj;
                return workflowRunner$nextOutput$2$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                ((WorkflowRunner$nextOutput$2$1) create(new ChannelResult(((ChannelResult) obj).holder), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return null;
            default:
                return ((WorkflowRunner$nextOutput$2$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        UnleashContext unleashContext = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Object obj2 = ((ChannelResult) this.L$0).holder;
                Throwable m4190exceptionOrNullimpl = ChannelResult.m4190exceptionOrNullimpl(obj2);
                if (m4190exceptionOrNullimpl != null) {
                    throw m4190exceptionOrNullimpl;
                }
                Object m4191getOrNullimpl = ChannelResult.m4191getOrNullimpl(obj2);
                if (m4191getOrNullimpl == null || Intrinsics.areEqual(unleashContext.sessionId, m4191getOrNullimpl)) {
                    return null;
                }
                unleashContext.sessionId = m4191getOrNullimpl;
                return null;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(Intrinsics.areEqual(this.L$0, unleashContext.sessionId));
        }
    }
}
