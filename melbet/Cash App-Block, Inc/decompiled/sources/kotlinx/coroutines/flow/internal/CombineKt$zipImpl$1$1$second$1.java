package kotlinx.coroutines.flow.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.util.coroutines.FlowExtensionsKt$runUntil$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class CombineKt$zipImpl$1$1$second$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Flow $flow2;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CombineKt$zipImpl$1$1$second$1(Flow flow, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$flow2 = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$1 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, continuation, 0);
                combineKt$zipImpl$1$1$second$1.L$0 = obj;
                return combineKt$zipImpl$1$1$second$1;
            default:
                CombineKt$zipImpl$1$1$second$1 combineKt$zipImpl$1$1$second$12 = new CombineKt$zipImpl$1$1$second$1(this.$flow2, continuation, 1);
                combineKt$zipImpl$1$1$second$12.L$0 = obj;
                return combineKt$zipImpl$1$1$second$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ProducerScope producerScope = (ProducerScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((CombineKt$zipImpl$1$1$second$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Flow flow = this.$flow2;
        switch (i) {
            case 0:
                ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtensionsKt$runUntil$1$1.AnonymousClass1 anonymousClass1 = new FlowExtensionsKt$runUntil$1$1.AnonymousClass1(producerScope, 2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass1, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                ProducerScope producerScope2 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtensionsKt$runUntil$1$1.AnonymousClass1 anonymousClass12 = new FlowExtensionsKt$runUntil$1$1.AnonymousClass1(producerScope2, 1);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(anonymousClass12, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
