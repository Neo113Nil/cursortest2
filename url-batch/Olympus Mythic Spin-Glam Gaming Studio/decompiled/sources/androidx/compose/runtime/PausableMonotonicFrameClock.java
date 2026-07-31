package androidx.compose.runtime;

import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: PausableMonotonicFrameClock.kt */
@StabilityInferred
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\u0007J*\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00028\u00000\nH\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/runtime/PausableMonotonicFrameClock;", "Landroidx/compose/runtime/MonotonicFrameClock;", "frameClock", "<init>", "(Landroidx/compose/runtime/MonotonicFrameClock;)V", "", "pause", "()V", "resume", "R", "Lkotlin/Function1;", "", "onFrame", "withFrameNanos", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/runtime/MonotonicFrameClock;", "Landroidx/compose/runtime/Latch;", "latch", "Landroidx/compose/runtime/Latch;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PausableMonotonicFrameClock implements MonotonicFrameClock {
    private final MonotonicFrameClock frameClock;
    private final Latch latch = new Latch();

    public PausableMonotonicFrameClock(MonotonicFrameClock monotonicFrameClock) {
        this.frameClock = monotonicFrameClock;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return MonotonicFrameClock.DefaultImpls.fold(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.get(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, key);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return MonotonicFrameClock.DefaultImpls.plus(this, coroutineContext);
    }

    public final void pause() {
        this.latch.closeLatch();
    }

    public final void resume() {
        this.latch.openLatch();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005a A[PHI: r7
      0x005a: PHI (r7v6 java.lang.Object) = (r7v5 java.lang.Object), (r7v1 java.lang.Object) binds: [B:17:0x0057, B:10:0x0028] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0059 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // androidx.compose.runtime.MonotonicFrameClock
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object withFrameNanos(Function1 function1, Continuation continuation) {
        PausableMonotonicFrameClock$withFrameNanos$1 pausableMonotonicFrameClock$withFrameNanos$1;
        int i;
        if (continuation instanceof PausableMonotonicFrameClock$withFrameNanos$1) {
            pausableMonotonicFrameClock$withFrameNanos$1 = (PausableMonotonicFrameClock$withFrameNanos$1) continuation;
            int i2 = pausableMonotonicFrameClock$withFrameNanos$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pausableMonotonicFrameClock$withFrameNanos$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pausableMonotonicFrameClock$withFrameNanos$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = pausableMonotonicFrameClock$withFrameNanos$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    Latch latch = this.latch;
                    pausableMonotonicFrameClock$withFrameNanos$1.L$0 = function1;
                    pausableMonotonicFrameClock$withFrameNanos$1.label = 1;
                    if (latch.await(pausableMonotonicFrameClock$withFrameNanos$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            ResultKt.throwOnFailure(obj);
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function1 = (Function1) pausableMonotonicFrameClock$withFrameNanos$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                MonotonicFrameClock monotonicFrameClock = this.frameClock;
                pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
                pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
                obj = monotonicFrameClock.withFrameNanos(function1, pausableMonotonicFrameClock$withFrameNanos$1);
                return obj != coroutine_suspended ? coroutine_suspended : obj;
            }
        }
        pausableMonotonicFrameClock$withFrameNanos$1 = new PausableMonotonicFrameClock$withFrameNanos$1(this, continuation);
        Object obj2 = pausableMonotonicFrameClock$withFrameNanos$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = pausableMonotonicFrameClock$withFrameNanos$1.label;
        if (i != 0) {
        }
        MonotonicFrameClock monotonicFrameClock2 = this.frameClock;
        pausableMonotonicFrameClock$withFrameNanos$1.L$0 = null;
        pausableMonotonicFrameClock$withFrameNanos$1.label = 2;
        obj2 = monotonicFrameClock2.withFrameNanos(function1, pausableMonotonicFrameClock$withFrameNanos$1);
        if (obj2 != coroutine_suspended2) {
        }
    }
}
