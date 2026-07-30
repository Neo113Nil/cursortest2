package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.l1;

/* loaded from: classes5.dex */
abstract /* synthetic */ class FlowKt__ErrorsKt {
    /* renamed from: catch, reason: not valid java name */
    public static final <T> e m1268catch(e eVar, f6.q qVar) {
        return new FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(eVar, qVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object catchImpl(e eVar, f fVar, kotlin.coroutines.c cVar) {
        FlowKt__ErrorsKt$catchImpl$1 flowKt__ErrorsKt$catchImpl$1;
        Object coroutine_suspended;
        int i8;
        Ref$ObjectRef ref$ObjectRef;
        Throwable th;
        if (cVar instanceof FlowKt__ErrorsKt$catchImpl$1) {
            flowKt__ErrorsKt$catchImpl$1 = (FlowKt__ErrorsKt$catchImpl$1) cVar;
            int i9 = flowKt__ErrorsKt$catchImpl$1.label;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                flowKt__ErrorsKt$catchImpl$1.label = i9 - Integer.MIN_VALUE;
                Object obj = flowKt__ErrorsKt$catchImpl$1.result;
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                i8 = flowKt__ErrorsKt$catchImpl$1.label;
                if (i8 != 0) {
                    y5.g.throwOnFailure(obj);
                    Ref$ObjectRef ref$ObjectRef2 = new Ref$ObjectRef();
                    try {
                        f flowKt__ErrorsKt$catchImpl$2 = new FlowKt__ErrorsKt$catchImpl$2(fVar, ref$ObjectRef2);
                        flowKt__ErrorsKt$catchImpl$1.L$0 = ref$ObjectRef2;
                        flowKt__ErrorsKt$catchImpl$1.label = 1;
                        if (eVar.collect(flowKt__ErrorsKt$catchImpl$2, flowKt__ErrorsKt$catchImpl$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        ref$ObjectRef = ref$ObjectRef2;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ref$ObjectRef = (Ref$ObjectRef) flowKt__ErrorsKt$catchImpl$1.L$0;
                    try {
                        y5.g.throwOnFailure(obj);
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                th = (Throwable) ref$ObjectRef.element;
                if (!isSameExceptionAs$FlowKt__ErrorsKt(th, th) || isCancellationCause$FlowKt__ErrorsKt(th, flowKt__ErrorsKt$catchImpl$1.getContext())) {
                    throw th;
                }
                if (th == null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    y5.b.addSuppressed(th, th);
                    throw th;
                }
                y5.b.addSuppressed(th, th);
                throw th;
            }
        }
        flowKt__ErrorsKt$catchImpl$1 = new FlowKt__ErrorsKt$catchImpl$1(cVar);
        Object obj2 = flowKt__ErrorsKt$catchImpl$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = flowKt__ErrorsKt$catchImpl$1.label;
        if (i8 != 0) {
        }
        th = (Throwable) ref$ObjectRef.element;
        if (isSameExceptionAs$FlowKt__ErrorsKt(th, th)) {
        }
        throw th;
    }

    private static final boolean isCancellationCause$FlowKt__ErrorsKt(Throwable th, CoroutineContext coroutineContext) {
        l1 l1Var = (l1) coroutineContext.get(l1.Key);
        if (l1Var == null || !l1Var.isCancelled()) {
            return false;
        }
        return isSameExceptionAs$FlowKt__ErrorsKt(th, l1Var.getCancellationException());
    }

    private static final boolean isSameExceptionAs$FlowKt__ErrorsKt(Throwable th, Throwable th2) {
        return th2 != null && kotlin.jvm.internal.s.areEqual(th2, th);
    }

    public static final <T> e retry(e eVar, long j8, f6.p pVar) {
        if (j8 > 0) {
            return g.retryWhen(eVar, new FlowKt__ErrorsKt$retry$3(j8, pVar, null));
        }
        throw new IllegalArgumentException(("Expected positive amount of retries, but had " + j8).toString());
    }

    public static /* synthetic */ e retry$default(e eVar, long j8, f6.p pVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            j8 = Long.MAX_VALUE;
        }
        if ((i8 & 2) != 0) {
            pVar = new FlowKt__ErrorsKt$retry$1(null);
        }
        return g.retry(eVar, j8, pVar);
    }

    public static final <T> e retryWhen(e eVar, f6.r rVar) {
        return new FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(eVar, rVar);
    }
}
