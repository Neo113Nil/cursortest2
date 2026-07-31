package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* compiled from: MonotonicFrameClock.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a*\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\"\u001e\u0010\f\u001a\u00020\u0007*\u00020\u00068FX\u0087\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/compose/runtime/MonotonicFrameClock;", "getMonotonicFrameClock", "(Lkotlin/coroutines/CoroutineContext;)Landroidx/compose/runtime/MonotonicFrameClock;", "getMonotonicFrameClock$annotations", "(Lkotlin/coroutines/CoroutineContext;)V", "monotonicFrameClock", "runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class MonotonicFrameClockKt {
    public static final Object withFrameNanos(Function1 function1, Continuation continuation) {
        return getMonotonicFrameClock(continuation.getContext()).withFrameNanos(function1, continuation);
    }

    public static final MonotonicFrameClock getMonotonicFrameClock(CoroutineContext coroutineContext) {
        MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) coroutineContext.get(MonotonicFrameClock.INSTANCE);
        if (monotonicFrameClock != null) {
            return monotonicFrameClock;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }
}
