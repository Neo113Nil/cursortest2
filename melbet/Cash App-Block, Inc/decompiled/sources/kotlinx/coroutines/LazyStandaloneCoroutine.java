package kotlinx.coroutines;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.internal.InlineList;
import papa.SafeTrace;

/* loaded from: classes4.dex */
public final class LazyStandaloneCoroutine extends StandaloneCoroutine {
    public final Continuation continuation;

    public LazyStandaloneCoroutine(CoroutineContext coroutineContext, Function2 function2) {
        super(coroutineContext, false);
        this.continuation = IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted(this, this, function2);
    }

    @Override // kotlinx.coroutines.JobSupport
    public final void onStart() {
        try {
            Continuation intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.continuation);
            Result.Companion companion = Result.Companion;
            InlineList.resumeCancellableWithInternal(Unit.INSTANCE, intercepted);
        } catch (Throwable th) {
            th = th;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).cause;
            }
            Result.Companion companion2 = Result.Companion;
            resumeWith(SafeTrace.createFailure(th));
            throw th;
        }
    }
}
