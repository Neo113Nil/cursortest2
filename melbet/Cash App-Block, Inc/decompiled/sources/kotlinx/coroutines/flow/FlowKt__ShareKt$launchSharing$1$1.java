package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class FlowKt__ShareKt$launchSharing$1$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ int I$0;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FlowKt__ShareKt$launchSharing$1$1 flowKt__ShareKt$launchSharing$1$1 = new FlowKt__ShareKt$launchSharing$1$1(2, continuation);
        flowKt__ShareKt$launchSharing$1$1.I$0 = ((Number) obj).intValue();
        return flowKt__ShareKt$launchSharing$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((FlowKt__ShareKt$launchSharing$1$1) create(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        return Boolean.valueOf(i > 0);
    }
}
