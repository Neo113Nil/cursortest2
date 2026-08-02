package kotlinx.coroutines.flow;

import androidx.compose.runtime.BroadcastFrameClock;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuationImpl;

/* loaded from: classes3.dex */
public final /* synthetic */ class FlowKt__DelayKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long f$0;

    public /* synthetic */ FlowKt__DelayKt$$ExternalSyntheticLambda0(long j, int i) {
        this.$r8$classId = i;
        this.f$0 = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CancellableContinuationImpl cancellableContinuationImpl;
        Object failure;
        int i = this.$r8$classId;
        long j = this.f$0;
        switch (i) {
            case 0:
                return Long.valueOf(j);
            default:
                BroadcastFrameClock.FrameAwaiter frameAwaiter = (BroadcastFrameClock.FrameAwaiter) obj;
                Function1 function1 = frameAwaiter.onFrame;
                if (function1 != null && (cancellableContinuationImpl = frameAwaiter.continuation) != null) {
                    try {
                        Result.Companion companion = Result.Companion;
                        failure = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.Companion;
                        failure = new Result.Failure(th);
                    }
                    cancellableContinuationImpl.resumeWith(failure);
                }
                return Unit.INSTANCE;
        }
    }
}
