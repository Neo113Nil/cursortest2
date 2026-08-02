package com.stripe.android.financialconnections.utils;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class FlowsKt$get$1 extends SuspendLambda implements Function4 {
    public /* synthetic */ FlowCollector L$0;
    public /* synthetic */ Map L$1;
    public /* synthetic */ Object L$2;
    public int label;

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        FlowsKt$get$1 flowsKt$get$1 = new FlowsKt$get$1(4, (Continuation) obj4);
        flowsKt$get$1.L$0 = (FlowCollector) obj;
        flowsKt$get$1.L$1 = (Map) obj2;
        flowsKt$get$1.L$2 = obj3;
        return flowsKt$get$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FlowCollector flowCollector = this.L$0;
        Map map = this.L$1;
        Object obj2 = this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Object obj3 = map.get(obj2);
            if (obj3 != null) {
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (flowCollector.emit(obj3, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
