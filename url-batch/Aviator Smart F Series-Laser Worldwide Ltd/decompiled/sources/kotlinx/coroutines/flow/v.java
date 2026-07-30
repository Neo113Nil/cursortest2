package kotlinx.coroutines.flow;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlinx.coroutines.internal.g0;

/* loaded from: classes5.dex */
final class v extends kotlinx.coroutines.flow.internal.c {
    private static final AtomicReferenceFieldUpdater _state$FU = AtomicReferenceFieldUpdater.newUpdater(v.class, Object.class, "_state");
    private volatile Object _state;

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    public final Object awaitPending(kotlin.coroutines.c cVar) {
        kotlin.coroutines.c intercepted;
        g0 g0Var;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        kotlinx.coroutines.o oVar = new kotlinx.coroutines.o(intercepted, 1);
        oVar.initCancellability();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        g0Var = u.NONE;
        if (!androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, g0Var, oVar)) {
            Result.a aVar = Result.Companion;
            oVar.resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
        }
        Object result = oVar.getResult();
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        if (result == coroutine_suspended) {
            kotlin.coroutines.jvm.internal.f.probeCoroutineSuspended(cVar);
        }
        coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return result == coroutine_suspended2 ? result : y5.w.INSTANCE;
    }

    public final void makePending() {
        g0 g0Var;
        g0 g0Var2;
        g0 g0Var3;
        g0 g0Var4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return;
            }
            g0Var = u.PENDING;
            if (obj == g0Var) {
                return;
            }
            g0Var2 = u.NONE;
            if (obj == g0Var2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _state$FU;
                g0Var3 = u.PENDING;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, obj, g0Var3)) {
                    return;
                }
            } else {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = _state$FU;
                g0Var4 = u.NONE;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater3, this, obj, g0Var4)) {
                    Result.a aVar = Result.Companion;
                    ((kotlinx.coroutines.o) obj).resumeWith(Result.m348constructorimpl(y5.w.INSTANCE));
                    return;
                }
            }
        }
    }

    public final boolean takePending() {
        g0 g0Var;
        g0 g0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        g0Var = u.NONE;
        Object andSet = atomicReferenceFieldUpdater.getAndSet(this, g0Var);
        kotlin.jvm.internal.s.checkNotNull(andSet);
        g0Var2 = u.PENDING;
        return andSet == g0Var2;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public boolean allocateLocked(StateFlowImpl stateFlowImpl) {
        g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _state$FU;
        if (atomicReferenceFieldUpdater.get(this) != null) {
            return false;
        }
        g0Var = u.NONE;
        atomicReferenceFieldUpdater.set(this, g0Var);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public kotlin.coroutines.c[] freeLocked(StateFlowImpl stateFlowImpl) {
        _state$FU.set(this, null);
        return kotlinx.coroutines.flow.internal.b.EMPTY_RESUMES;
    }
}
