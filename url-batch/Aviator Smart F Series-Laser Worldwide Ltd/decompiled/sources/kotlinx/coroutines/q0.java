package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;

/* loaded from: classes3.dex */
public final class q0 extends kotlinx.coroutines.internal.c0 {
    private static final AtomicIntegerFieldUpdater _decision$FU = AtomicIntegerFieldUpdater.newUpdater(q0.class, "_decision");
    private volatile int _decision;

    public q0(CoroutineContext coroutineContext, kotlin.coroutines.c cVar) {
        super(coroutineContext, cVar);
    }

    private final void loop$atomicfu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final boolean tryResume() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$FU;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!_decision$FU.compareAndSet(this, 0, 2));
        return true;
    }

    private final boolean trySuspend() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _decision$FU;
        do {
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 != 0) {
                if (i8 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!_decision$FU.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // kotlinx.coroutines.internal.c0, kotlinx.coroutines.JobSupport
    protected void afterCompletion(Object obj) {
        afterResume(obj);
    }

    @Override // kotlinx.coroutines.internal.c0, kotlinx.coroutines.a
    protected void afterResume(Object obj) {
        kotlin.coroutines.c intercepted;
        if (tryResume()) {
            return;
        }
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(this.uCont);
        kotlinx.coroutines.internal.l.resumeCancellableWith$default(intercepted, e0.recoverResult(obj, this.uCont), null, 2, null);
    }

    public final Object getResult$kotlinx_coroutines_core() {
        Object coroutine_suspended;
        if (trySuspend()) {
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return coroutine_suspended;
        }
        Object unboxState = s1.unboxState(getState$kotlinx_coroutines_core());
        if (unboxState instanceof b0) {
            throw ((b0) unboxState).cause;
        }
        return unboxState;
    }
}
