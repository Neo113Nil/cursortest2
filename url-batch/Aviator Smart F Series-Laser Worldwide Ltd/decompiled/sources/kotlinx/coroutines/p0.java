package kotlinx.coroutines;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes3.dex */
public interface p0 {

    public static final class a {
        public static Object delay(p0 p0Var, long j8, kotlin.coroutines.c cVar) {
            kotlin.coroutines.c intercepted;
            Object coroutine_suspended;
            Object coroutine_suspended2;
            if (j8 <= 0) {
                return y5.w.INSTANCE;
            }
            intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
            o oVar = new o(intercepted, 1);
            oVar.initCancellability();
            p0Var.mo1294scheduleResumeAfterDelay(j8, oVar);
            Object result = oVar.getResult();
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (result == coroutine_suspended) {
                kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
            }
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return result == coroutine_suspended2 ? result : y5.w.INSTANCE;
        }

        public static u0 invokeOnTimeout(p0 p0Var, long j8, Runnable runnable, CoroutineContext coroutineContext) {
            return m0.getDefaultDelay().invokeOnTimeout(j8, runnable, coroutineContext);
        }
    }

    Object delay(long j8, kotlin.coroutines.c cVar);

    u0 invokeOnTimeout(long j8, Runnable runnable, CoroutineContext coroutineContext);

    /* renamed from: scheduleResumeAfterDelay */
    void mo1294scheduleResumeAfterDelay(long j8, n nVar);
}
