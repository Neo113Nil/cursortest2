package l6;

import f6.l;
import f6.p;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.x;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.internal.c0;
import kotlinx.coroutines.s1;
import y5.g;

/* loaded from: classes5.dex */
public abstract class b {
    public static final <T> void startCoroutineUndispatched(l lVar, c cVar) {
        Object coroutine_suspended;
        c probeCoroutineCreated = f.probeCoroutineCreated(cVar);
        try {
            CoroutineContext context = cVar.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                Object invoke = ((l) x.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(probeCoroutineCreated);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (invoke != coroutine_suspended) {
                    probeCoroutineCreated.resumeWith(Result.m348constructorimpl(invoke));
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m348constructorimpl(g.createFailure(th)));
        }
    }

    public static final <T> void startCoroutineUnintercepted(l lVar, c cVar) {
        Object coroutine_suspended;
        c probeCoroutineCreated = f.probeCoroutineCreated(cVar);
        try {
            Object invoke = ((l) x.beforeCheckcastToFunctionOfArity(lVar, 1)).invoke(probeCoroutineCreated);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                probeCoroutineCreated.resumeWith(Result.m348constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m348constructorimpl(g.createFailure(th)));
        }
    }

    private static final <T> void startDirect(c cVar, l lVar) {
        Object coroutine_suspended;
        c probeCoroutineCreated = f.probeCoroutineCreated(cVar);
        try {
            Object invoke = lVar.invoke(probeCoroutineCreated);
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (invoke != coroutine_suspended) {
                probeCoroutineCreated.resumeWith(Result.m348constructorimpl(invoke));
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m348constructorimpl(g.createFailure(th)));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(c0 c0Var, R r8, p pVar) {
        Object b0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        try {
            b0Var = ((p) x.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, c0Var);
        } catch (Throwable th) {
            b0Var = new b0(th, false, 2, null);
        }
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (b0Var == coroutine_suspended) {
            coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object makeCompletingOnce$kotlinx_coroutines_core = c0Var.makeCompletingOnce$kotlinx_coroutines_core(b0Var);
        if (makeCompletingOnce$kotlinx_coroutines_core == s1.COMPLETING_WAITING_CHILDREN) {
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        }
        if (makeCompletingOnce$kotlinx_coroutines_core instanceof b0) {
            throw ((b0) makeCompletingOnce$kotlinx_coroutines_core).cause;
        }
        return s1.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(c0 c0Var, R r8, p pVar) {
        Object b0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        try {
            b0Var = ((p) x.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, c0Var);
        } catch (Throwable th) {
            b0Var = new b0(th, false, 2, null);
        }
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (b0Var == coroutine_suspended) {
            coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object makeCompletingOnce$kotlinx_coroutines_core = c0Var.makeCompletingOnce$kotlinx_coroutines_core(b0Var);
        if (makeCompletingOnce$kotlinx_coroutines_core == s1.COMPLETING_WAITING_CHILDREN) {
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        }
        if (makeCompletingOnce$kotlinx_coroutines_core instanceof b0) {
            Throwable th2 = ((b0) makeCompletingOnce$kotlinx_coroutines_core).cause;
            if (!(th2 instanceof TimeoutCancellationException)) {
                throw th2;
            }
            if (((TimeoutCancellationException) th2).coroutine != c0Var) {
                throw th2;
            }
            if (b0Var instanceof b0) {
                throw ((b0) b0Var).cause;
            }
        } else {
            b0Var = s1.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        return b0Var;
    }

    private static final <T> Object undispatchedResult(c0 c0Var, l lVar, f6.a aVar) {
        Object b0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        Object coroutine_suspended3;
        try {
            b0Var = aVar.invoke();
        } catch (Throwable th) {
            b0Var = new b0(th, false, 2, null);
        }
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (b0Var == coroutine_suspended) {
            coroutine_suspended3 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended3;
        }
        Object makeCompletingOnce$kotlinx_coroutines_core = c0Var.makeCompletingOnce$kotlinx_coroutines_core(b0Var);
        if (makeCompletingOnce$kotlinx_coroutines_core == s1.COMPLETING_WAITING_CHILDREN) {
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended2;
        }
        if (!(makeCompletingOnce$kotlinx_coroutines_core instanceof b0)) {
            return s1.unboxState(makeCompletingOnce$kotlinx_coroutines_core);
        }
        b0 b0Var2 = (b0) makeCompletingOnce$kotlinx_coroutines_core;
        if (((Boolean) lVar.invoke(b0Var2.cause)).booleanValue()) {
            throw b0Var2.cause;
        }
        if (b0Var instanceof b0) {
            throw ((b0) b0Var).cause;
        }
        return b0Var;
    }

    public static final <R, T> void startCoroutineUndispatched(p pVar, R r8, c cVar) {
        Object coroutine_suspended;
        c probeCoroutineCreated = f.probeCoroutineCreated(cVar);
        try {
            CoroutineContext context = cVar.getContext();
            Object updateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                Object invoke = ((p) x.beforeCheckcastToFunctionOfArity(pVar, 2)).invoke(r8, probeCoroutineCreated);
                coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                if (invoke != coroutine_suspended) {
                    probeCoroutineCreated.resumeWith(Result.m348constructorimpl(invoke));
                }
            } finally {
                ThreadContextKt.restoreThreadContext(context, updateThreadContext);
            }
        } catch (Throwable th) {
            Result.a aVar = Result.Companion;
            probeCoroutineCreated.resumeWith(Result.m348constructorimpl(g.createFailure(th)));
        }
    }
}
