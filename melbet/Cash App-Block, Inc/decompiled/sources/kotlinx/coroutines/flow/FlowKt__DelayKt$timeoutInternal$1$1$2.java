package kotlinx.coroutines.flow;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.time.Duration;
import kotlinx.coroutines.TimeoutCancellationException;
import papa.SafeTrace;

/* loaded from: classes9.dex */
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends SuspendLambda implements Function1 {

    /* renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    public final /* synthetic */ long f834$$v$c$kotlintimeDuration$timeout$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, Continuation continuation) {
        super(1, continuation);
        this.f834$$v$c$kotlintimeDuration$timeout$0 = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.f834$$v$c$kotlintimeDuration$timeout$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ((FlowKt__DelayKt$timeoutInternal$1$1$2) create((Continuation) obj)).invokeSuspend(Unit.INSTANCE);
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) Duration.m4177toStringimpl(this.f834$$v$c$kotlintimeDuration$timeout$0)), null);
    }
}
