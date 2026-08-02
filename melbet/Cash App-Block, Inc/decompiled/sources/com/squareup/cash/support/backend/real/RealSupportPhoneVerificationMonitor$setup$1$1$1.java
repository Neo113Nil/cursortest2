package com.squareup.cash.support.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class RealSupportPhoneVerificationMonitor$setup$1$1$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ FlowCollector L$0;
    public int label;
    public final /* synthetic */ RealSupportPhoneVerificationMonitor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealSupportPhoneVerificationMonitor$setup$1$1$1(RealSupportPhoneVerificationMonitor realSupportPhoneVerificationMonitor, Continuation continuation) {
        super(4, continuation);
        this.this$0 = realSupportPhoneVerificationMonitor;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RealSupportPhoneVerificationMonitor$setup$1$1$1 realSupportPhoneVerificationMonitor$setup$1$1$1 = new RealSupportPhoneVerificationMonitor$setup$1$1$1(this.this$0, (Continuation) obj4);
        realSupportPhoneVerificationMonitor$setup$1$1$1.L$0 = (FlowCollector) obj;
        return realSupportPhoneVerificationMonitor$setup$1$1$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            StateFlow singleValue = this.this$0.syncValueReader.getSingleValue(AndroidSyncValueSpecs.SupportPhoneConfirmation);
            this.L$0 = null;
            this.label = 1;
            if (FlowKt.emitAll(flowCollector, singleValue, this) == coroutineSingletons) {
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
