package kotlinx.coroutines.sync;

import kotlin.coroutines.c;
import kotlin.jvm.internal.r;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.internal.j0;
import y5.g;

/* loaded from: classes5.dex */
public abstract class SemaphoreKt {
    private static final g0 BROKEN;
    private static final g0 CANCELLED;
    private static final int MAX_SPIN_CYCLES;
    private static final g0 PERMIT;
    private static final int SEGMENT_SIZE;
    private static final g0 TAKEN;

    static {
        int systemProp$default;
        int systemProp$default2;
        systemProp$default = j0.systemProp$default("kotlinx.coroutines.semaphore.maxSpinCycles", 100, 0, 0, 12, (Object) null);
        MAX_SPIN_CYCLES = systemProp$default;
        PERMIT = new g0("PERMIT");
        TAKEN = new g0("TAKEN");
        BROKEN = new g0("BROKEN");
        CANCELLED = new g0("CANCELLED");
        systemProp$default2 = j0.systemProp$default("kotlinx.coroutines.semaphore.segmentSize", 16, 0, 0, 12, (Object) null);
        SEGMENT_SIZE = systemProp$default2;
    }

    public static final a Semaphore(int i8, int i9) {
        return new SemaphoreImpl(i8, i9);
    }

    public static /* synthetic */ a Semaphore$default(int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i9 = 0;
        }
        return Semaphore(i8, i9);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b createSegment(long j8, b bVar) {
        return new b(j8, bVar, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object withPermit(a aVar, f6.a aVar2, c cVar) {
        SemaphoreKt$withPermit$1 semaphoreKt$withPermit$1;
        Object coroutine_suspended;
        int i8;
        try {
            if (cVar instanceof SemaphoreKt$withPermit$1) {
                semaphoreKt$withPermit$1 = (SemaphoreKt$withPermit$1) cVar;
                int i9 = semaphoreKt$withPermit$1.label;
                if ((i9 & Integer.MIN_VALUE) != 0) {
                    semaphoreKt$withPermit$1.label = i9 - Integer.MIN_VALUE;
                    Object obj = semaphoreKt$withPermit$1.result;
                    coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
                    i8 = semaphoreKt$withPermit$1.label;
                    if (i8 != 0) {
                        g.throwOnFailure(obj);
                        semaphoreKt$withPermit$1.L$0 = aVar;
                        semaphoreKt$withPermit$1.L$1 = aVar2;
                        semaphoreKt$withPermit$1.label = 1;
                        if (aVar.acquire(semaphoreKt$withPermit$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        aVar2 = (f6.a) semaphoreKt$withPermit$1.L$1;
                        aVar = (a) semaphoreKt$withPermit$1.L$0;
                        g.throwOnFailure(obj);
                    }
                    return aVar2.invoke();
                }
            }
            return aVar2.invoke();
        } finally {
            r.finallyStart(1);
            aVar.release();
            r.finallyEnd(1);
        }
        semaphoreKt$withPermit$1 = new SemaphoreKt$withPermit$1(cVar);
        Object obj2 = semaphoreKt$withPermit$1.result;
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        i8 = semaphoreKt$withPermit$1.label;
        if (i8 != 0) {
        }
    }

    private static final <T> Object withPermit$$forInline(a aVar, f6.a aVar2, c cVar) {
        r.mark(0);
        aVar.acquire(cVar);
        r.mark(1);
        try {
            return aVar2.invoke();
        } finally {
            r.finallyStart(1);
            aVar.release();
            r.finallyEnd(1);
        }
    }
}
