package kotlinx.coroutines;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes3.dex */
public abstract class DelayKt {
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitCancellation(kotlin.coroutines.c cVar) {
        DelayKt$awaitCancellation$1 delayKt$awaitCancellation$1;
        Object coroutine_suspended;
        int i8;
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended2;
        if (cVar instanceof DelayKt$awaitCancellation$1) {
            delayKt$awaitCancellation$1 = (DelayKt$awaitCancellation$1) cVar;
            int i9 = delayKt$awaitCancellation$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                delayKt$awaitCancellation$1.label = i9 - Integer.MIN_VALUE;
                Object obj = delayKt$awaitCancellation$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = delayKt$awaitCancellation$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    delayKt$awaitCancellation$1.label = 1;
                    intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(delayKt$awaitCancellation$1);
                    o oVar = new o(intercepted, 1);
                    oVar.initCancellability();
                    Object result = oVar.getResult();
                    coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    if (result == coroutine_suspended2) {
                        kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(delayKt$awaitCancellation$1);
                    }
                    if (result == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y5.g.throwOnFailure(obj);
                }
                throw new KotlinNothingValueException();
            }
        }
        delayKt$awaitCancellation$1 = new DelayKt$awaitCancellation$1(cVar);
        Object obj2 = delayKt$awaitCancellation$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = delayKt$awaitCancellation$1.label;
        if (i8 != 0) {
        }
        throw new KotlinNothingValueException();
    }

    public static final Object delay(long j8, kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        if (j8 <= 0) {
            return y5.w.INSTANCE;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o oVar = new o(intercepted, 1);
        oVar.initCancellability();
        if (j8 < Long.MAX_VALUE) {
            getDelay(oVar.getContext()).mo1294scheduleResumeAfterDelay(j8, oVar);
        }
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return result == coroutine_suspended2 ? result : y5.w.INSTANCE;
    }

    /* renamed from: delay-VtjQ1oo, reason: not valid java name */
    public static final Object m1227delayVtjQ1oo(long j8, kotlin.coroutines.c cVar) {
        Object coroutine_suspended;
        Object delay = delay(m1228toDelayMillisLRDsOJo(j8), cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return delay == coroutine_suspended ? delay : y5.w.INSTANCE;
    }

    public static final p0 getDelay(CoroutineContext coroutineContext) {
        CoroutineContext.a aVar = coroutineContext.get(kotlin.coroutines.d.Key);
        p0 p0Var = aVar instanceof p0 ? (p0) aVar : null;
        return p0Var == null ? m0.getDefaultDelay() : p0Var;
    }

    /* renamed from: toDelayMillis-LRDsOJo, reason: not valid java name */
    public static final long m1228toDelayMillisLRDsOJo(long j8) {
        long coerceAtLeast;
        if (k6.a.m218compareToLRDsOJo(j8, k6.a.Companion.m322getZEROUwyO8pc()) <= 0) {
            return 0L;
        }
        coerceAtLeast = j6.v.coerceAtLeast(k6.a.m237getInWholeMillisecondsimpl(j8), 1L);
        return coerceAtLeast;
    }
}
