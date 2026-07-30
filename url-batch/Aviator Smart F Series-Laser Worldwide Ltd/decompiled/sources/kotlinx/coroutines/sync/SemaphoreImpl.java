package kotlinx.coroutines.sync;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.common.util.concurrent.s;
import f6.l;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.f;
import kotlinx.coroutines.internal.d0;
import kotlinx.coroutines.internal.e;
import kotlinx.coroutines.internal.e0;
import kotlinx.coroutines.internal.g0;
import kotlinx.coroutines.l2;
import kotlinx.coroutines.n;
import kotlinx.coroutines.o;
import kotlinx.coroutines.q;
import kotlinx.coroutines.selects.j;
import y5.w;

/* loaded from: classes5.dex */
public class SemaphoreImpl implements a {
    private volatile int _availablePermits;
    private volatile long deqIdx;
    private volatile long enqIdx;
    private volatile Object head;
    private final l onCancellationRelease;
    private final int permits;
    private volatile Object tail;
    private static final AtomicReferenceFieldUpdater head$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, TtmlNode.TAG_HEAD);
    private static final AtomicLongFieldUpdater deqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "deqIdx");
    private static final AtomicReferenceFieldUpdater tail$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreImpl.class, Object.class, "tail");
    private static final AtomicLongFieldUpdater enqIdx$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreImpl.class, "enqIdx");
    private static final AtomicIntegerFieldUpdater _availablePermits$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreImpl.class, "_availablePermits");

    public SemaphoreImpl(int i8, int i9) {
        this.permits = i8;
        if (i8 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i8).toString());
        }
        if (i9 < 0 || i9 > i8) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i8).toString());
        }
        b bVar = new b(0L, null, 2);
        this.head = bVar;
        this.tail = bVar;
        this._availablePermits = i8 - i9;
        this.onCancellationRelease = new l() { // from class: kotlinx.coroutines.sync.SemaphoreImpl$onCancellationRelease$1
            {
                super(1);
            }

            @Override // f6.l
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((Throwable) obj);
                return w.INSTANCE;
            }

            public final void invoke(Throwable th) {
                SemaphoreImpl.this.release();
            }
        };
    }

    static /* synthetic */ Object acquire$suspendImpl(SemaphoreImpl semaphoreImpl, c cVar) {
        Object coroutine_suspended;
        if (semaphoreImpl.decPermits() > 0) {
            return w.INSTANCE;
        }
        Object acquireSlowPath = semaphoreImpl.acquireSlowPath(cVar);
        coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
        return acquireSlowPath == coroutine_suspended ? acquireSlowPath : w.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(c cVar) {
        c intercepted;
        Object coroutine_suspended;
        Object coroutine_suspended2;
        intercepted = IntrinsicsKt__IntrinsicsJvmKt.intercepted(cVar);
        o orCreateCancellableContinuation = q.getOrCreateCancellableContinuation(intercepted);
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((n) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            coroutine_suspended = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            if (result == coroutine_suspended) {
                f.probeCoroutineSuspended(cVar);
            }
            coroutine_suspended2 = kotlin.coroutines.intrinsics.b.getCOROUTINE_SUSPENDED();
            return result == coroutine_suspended2 ? result : w.INSTANCE;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(l2 l2Var) {
        int i8;
        Object findSegmentInternal;
        int i9;
        g0 g0Var;
        g0 g0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$FU;
        b bVar = (b) atomicReferenceFieldUpdater.get(this);
        long andIncrement = enqIdx$FU.getAndIncrement(this);
        SemaphoreImpl$addAcquireToQueue$createNewSegment$1 semaphoreImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        i8 = SemaphoreKt.SEGMENT_SIZE;
        long j8 = andIncrement / i8;
        loop0: while (true) {
            findSegmentInternal = e.findSegmentInternal(bVar, j8, semaphoreImpl$addAcquireToQueue$createNewSegment$1);
            if (!e0.m1279isClosedimpl(findSegmentInternal)) {
                d0 m1277getSegmentimpl = e0.m1277getSegmentimpl(findSegmentInternal);
                while (true) {
                    d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                    if (d0Var.id >= m1277getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!m1277getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d0Var, m1277getSegmentimpl)) {
                        if (d0Var.decPointers$kotlinx_coroutines_core()) {
                            d0Var.remove();
                        }
                    } else if (m1277getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        m1277getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        b bVar2 = (b) e0.m1277getSegmentimpl(findSegmentInternal);
        i9 = SemaphoreKt.SEGMENT_SIZE;
        int i10 = (int) (andIncrement % i9);
        if (s.a(bVar2.getAcquirers(), i10, null, l2Var)) {
            l2Var.invokeOnCancellation(bVar2, i10);
            return true;
        }
        g0Var = SemaphoreKt.PERMIT;
        g0Var2 = SemaphoreKt.TAKEN;
        if (!s.a(bVar2.getAcquirers(), i10, g0Var, g0Var2)) {
            return false;
        }
        if (l2Var instanceof n) {
            kotlin.jvm.internal.s.checkNotNull(l2Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((n) l2Var).resume(w.INSTANCE, this.onCancellationRelease);
        } else {
            if (!(l2Var instanceof j)) {
                throw new IllegalStateException(("unexpected: " + l2Var).toString());
            }
            ((j) l2Var).selectInRegistrationPhase(w.INSTANCE);
        }
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater;
        int i8;
        int i9;
        do {
            atomicIntegerFieldUpdater = _availablePermits$FU;
            i8 = atomicIntegerFieldUpdater.get(this);
            i9 = this.permits;
            if (i8 <= i9) {
                return;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i8, i9));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final boolean tryResumeAcquire(Object obj) {
        if (!(obj instanceof n)) {
            if (obj instanceof j) {
                return ((j) obj).trySelect(this, w.INSTANCE);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        n nVar = (n) obj;
        Object tryResume = nVar.tryResume(w.INSTANCE, null, this.onCancellationRelease);
        if (tryResume == null) {
            return false;
        }
        nVar.completeResume(tryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        int i8;
        Object findSegmentInternal;
        int i9;
        g0 g0Var;
        g0 g0Var2;
        int i10;
        g0 g0Var3;
        g0 g0Var4;
        g0 g0Var5;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$FU;
        b bVar = (b) atomicReferenceFieldUpdater.get(this);
        long andIncrement = deqIdx$FU.getAndIncrement(this);
        i8 = SemaphoreKt.SEGMENT_SIZE;
        long j8 = andIncrement / i8;
        SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        loop0: while (true) {
            findSegmentInternal = e.findSegmentInternal(bVar, j8, semaphoreImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (e0.m1279isClosedimpl(findSegmentInternal)) {
                break;
            }
            d0 m1277getSegmentimpl = e0.m1277getSegmentimpl(findSegmentInternal);
            while (true) {
                d0 d0Var = (d0) atomicReferenceFieldUpdater.get(this);
                if (d0Var.id >= m1277getSegmentimpl.id) {
                    break loop0;
                }
                if (!m1277getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, d0Var, m1277getSegmentimpl)) {
                    if (d0Var.decPointers$kotlinx_coroutines_core()) {
                        d0Var.remove();
                    }
                } else if (m1277getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    m1277getSegmentimpl.remove();
                }
            }
        }
        b bVar2 = (b) e0.m1277getSegmentimpl(findSegmentInternal);
        bVar2.cleanPrev();
        if (bVar2.id > j8) {
            return false;
        }
        i9 = SemaphoreKt.SEGMENT_SIZE;
        int i11 = (int) (andIncrement % i9);
        g0Var = SemaphoreKt.PERMIT;
        Object andSet = bVar2.getAcquirers().getAndSet(i11, g0Var);
        if (andSet != null) {
            g0Var2 = SemaphoreKt.CANCELLED;
            if (andSet == g0Var2) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        i10 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = bVar2.getAcquirers().get(i11);
            g0Var5 = SemaphoreKt.TAKEN;
            if (obj == g0Var5) {
                return true;
            }
        }
        g0Var3 = SemaphoreKt.PERMIT;
        g0Var4 = SemaphoreKt.BROKEN;
        return !s.a(bVar2.getAcquirers(), i11, g0Var3, g0Var4);
    }

    @Override // kotlinx.coroutines.sync.a
    public Object acquire(c cVar) {
        return acquire$suspendImpl(this, cVar);
    }

    @Override // kotlinx.coroutines.sync.a
    public int getAvailablePermits() {
        return Math.max(_availablePermits$FU.get(this), 0);
    }

    protected final void onAcquireRegFunction(j jVar, Object obj) {
        while (decPermits() <= 0) {
            kotlin.jvm.internal.s.checkNotNull(jVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((l2) jVar)) {
                return;
            }
        }
        jVar.selectInRegistrationPhase(w.INSTANCE);
    }

    @Override // kotlinx.coroutines.sync.a
    public void release() {
        do {
            int andIncrement = _availablePermits$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    @Override // kotlinx.coroutines.sync.a
    public boolean tryAcquire() {
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = _availablePermits$FU;
            int i8 = atomicIntegerFieldUpdater.get(this);
            if (i8 > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i8 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i8, i8 - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W w7, l lVar, l lVar2) {
        while (decPermits() <= 0) {
            if (((Boolean) lVar.invoke(w7)).booleanValue()) {
                return;
            }
        }
        lVar2.invoke(w7);
    }

    protected final void acquire(n nVar) {
        while (decPermits() <= 0) {
            kotlin.jvm.internal.s.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (addAcquireToQueue((l2) nVar)) {
                return;
            }
        }
        nVar.resume(w.INSTANCE, this.onCancellationRelease);
    }
}
