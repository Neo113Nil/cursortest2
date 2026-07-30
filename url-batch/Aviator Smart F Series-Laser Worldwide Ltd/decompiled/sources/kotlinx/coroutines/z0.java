package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.p0;

/* loaded from: classes3.dex */
public abstract class z0 extends a1 implements p0 {
    private volatile Object _delayed;
    private volatile int _isCompleted = 0;
    private volatile Object _queue;
    private static final AtomicReferenceFieldUpdater _queue$FU = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_queue");
    private static final AtomicReferenceFieldUpdater _delayed$FU = AtomicReferenceFieldUpdater.newUpdater(z0.class, Object.class, "_delayed");
    private static final AtomicIntegerFieldUpdater _isCompleted$FU = AtomicIntegerFieldUpdater.newUpdater(z0.class, "_isCompleted");

    private final class a extends c {
        private final n cont;

        public a(long j8, n nVar) {
            super(j8);
            this.cont = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.cont.resumeUndispatched(z0.this, y5.w.INSTANCE);
        }

        @Override // kotlinx.coroutines.z0.c
        public String toString() {
            return super.toString() + this.cont;
        }
    }

    private static final class b extends c {
        private final Runnable block;

        public b(long j8, Runnable runnable) {
            super(j8);
            this.block = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.block.run();
        }

        @Override // kotlinx.coroutines.z0.c
        public String toString() {
            return super.toString() + this.block;
        }
    }

    public static abstract class c implements Runnable, Comparable, u0, kotlinx.coroutines.internal.m0 {
        private volatile Object _heap;
        private int index = -1;
        public long nanoTime;

        public c(long j8) {
            this.nanoTime = j8;
        }

        @Override // kotlinx.coroutines.u0
        public final void dispose() {
            kotlinx.coroutines.internal.g0 g0Var;
            kotlinx.coroutines.internal.g0 g0Var2;
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    g0Var = c1.DISPOSED_TASK;
                    if (obj == g0Var) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.remove(this);
                    }
                    g0Var2 = c1.DISPOSED_TASK;
                    this._heap = g0Var2;
                    y5.w wVar = y5.w.INSTANCE;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // kotlinx.coroutines.internal.m0
        public kotlinx.coroutines.internal.l0 getHeap() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.l0) {
                return (kotlinx.coroutines.internal.l0) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.m0
        public int getIndex() {
            return this.index;
        }

        public final int scheduleTask(long j8, d dVar, z0 z0Var) {
            kotlinx.coroutines.internal.g0 g0Var;
            synchronized (this) {
                Object obj = this._heap;
                g0Var = c1.DISPOSED_TASK;
                if (obj == g0Var) {
                    return 2;
                }
                synchronized (dVar) {
                    try {
                        c cVar = (c) dVar.firstImpl();
                        if (z0Var.isCompleted()) {
                            return 1;
                        }
                        if (cVar == null) {
                            dVar.timeNow = j8;
                        } else {
                            long j9 = cVar.nanoTime;
                            if (j9 - j8 < 0) {
                                j8 = j9;
                            }
                            if (j8 - dVar.timeNow > 0) {
                                dVar.timeNow = j8;
                            }
                        }
                        long j10 = this.nanoTime;
                        long j11 = dVar.timeNow;
                        if (j10 - j11 < 0) {
                            this.nanoTime = j11;
                        }
                        dVar.addImpl(this);
                        return 0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // kotlinx.coroutines.internal.m0
        public void setHeap(kotlinx.coroutines.internal.l0 l0Var) {
            kotlinx.coroutines.internal.g0 g0Var;
            Object obj = this._heap;
            g0Var = c1.DISPOSED_TASK;
            if (obj == g0Var) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this._heap = l0Var;
        }

        @Override // kotlinx.coroutines.internal.m0
        public void setIndex(int i8) {
            this.index = i8;
        }

        public final boolean timeToExecute(long j8) {
            return j8 - this.nanoTime >= 0;
        }

        public String toString() {
            return "Delayed[nanos=" + this.nanoTime + ']';
        }

        @Override // java.lang.Comparable
        public int compareTo(c cVar) {
            long j8 = this.nanoTime - cVar.nanoTime;
            if (j8 > 0) {
                return 1;
            }
            return j8 < 0 ? -1 : 0;
        }
    }

    public static final class d extends kotlinx.coroutines.internal.l0 {
        public long timeNow;

        public d(long j8) {
            this.timeNow = j8;
        }
    }

    private final void closeQueue() {
        kotlinx.coroutines.internal.g0 g0Var;
        kotlinx.coroutines.internal.g0 g0Var2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _queue$FU;
                g0Var = c1.CLOSED_EMPTY;
                if (androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater2, this, null, g0Var)) {
                    return;
                }
            } else {
                if (obj instanceof kotlinx.coroutines.internal.u) {
                    ((kotlinx.coroutines.internal.u) obj).close();
                    return;
                }
                g0Var2 = c1.CLOSED_EMPTY;
                if (obj == g0Var2) {
                    return;
                }
                kotlinx.coroutines.internal.u uVar = new kotlinx.coroutines.internal.u(8, true);
                kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar.addLast((Runnable) obj);
                if (androidx.concurrent.futures.a.a(_queue$FU, this, obj, uVar)) {
                    return;
                }
            }
        }
    }

    private final Runnable dequeue() {
        kotlinx.coroutines.internal.g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.u) {
                kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.u uVar = (kotlinx.coroutines.internal.u) obj;
                Object removeFirstOrNull = uVar.removeFirstOrNull();
                if (removeFirstOrNull != kotlinx.coroutines.internal.u.REMOVE_FROZEN) {
                    return (Runnable) removeFirstOrNull;
                }
                androidx.concurrent.futures.a.a(_queue$FU, this, obj, uVar.next());
            } else {
                g0Var = c1.CLOSED_EMPTY;
                if (obj == g0Var) {
                    return null;
                }
                if (androidx.concurrent.futures.a.a(_queue$FU, this, obj, null)) {
                    kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final boolean enqueueImpl(Runnable runnable) {
        kotlinx.coroutines.internal.g0 g0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _queue$FU;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (isCompleted()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.a.a(_queue$FU, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.u) {
                kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
                kotlinx.coroutines.internal.u uVar = (kotlinx.coroutines.internal.u) obj;
                int addLast = uVar.addLast(runnable);
                if (addLast == 0) {
                    return true;
                }
                if (addLast == 1) {
                    androidx.concurrent.futures.a.a(_queue$FU, this, obj, uVar.next());
                } else if (addLast == 2) {
                    return false;
                }
            } else {
                g0Var = c1.CLOSED_EMPTY;
                if (obj == g0Var) {
                    return false;
                }
                kotlinx.coroutines.internal.u uVar2 = new kotlinx.coroutines.internal.u(8, true);
                kotlin.jvm.internal.s.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                uVar2.addLast((Runnable) obj);
                uVar2.addLast(runnable);
                if (androidx.concurrent.futures.a.a(_queue$FU, this, obj, uVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isCompleted() {
        return _isCompleted$FU.get(this) != 0;
    }

    private final void loop$atomicfu(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, f6.l lVar, Object obj) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void rescheduleAllDelayed() {
        c cVar;
        kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
        long nanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
        while (true) {
            d dVar = (d) _delayed$FU.get(this);
            if (dVar == null || (cVar = (c) dVar.removeFirstOrNull()) == null) {
                return;
            } else {
                reschedule(nanoTime, cVar);
            }
        }
    }

    private final int scheduleImpl(long j8, c cVar) {
        if (isCompleted()) {
            return 1;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _delayed$FU;
        d dVar = (d) atomicReferenceFieldUpdater.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.a.a(atomicReferenceFieldUpdater, this, null, new d(j8));
            Object obj = atomicReferenceFieldUpdater.get(this);
            kotlin.jvm.internal.s.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.scheduleTask(j8, dVar, this);
    }

    private final void setCompleted(boolean z7) {
        _isCompleted$FU.set(this, z7 ? 1 : 0);
    }

    private final boolean shouldUnpark(c cVar) {
        d dVar = (d) _delayed$FU.get(this);
        return (dVar != null ? (c) dVar.peek() : null) == cVar;
    }

    @Override // kotlinx.coroutines.p0
    public Object delay(long j8, kotlin.coroutines.c cVar) {
        return p0.a.delay(this, j8, cVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* renamed from: dispatch */
    public final void mo1293dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        enqueue(runnable);
    }

    public void enqueue(Runnable runnable) {
        if (enqueueImpl(runnable)) {
            unpark();
        } else {
            l0.INSTANCE.enqueue(runnable);
        }
    }

    @Override // kotlinx.coroutines.y0
    protected long getNextTime() {
        c cVar;
        long coerceAtLeast;
        kotlinx.coroutines.internal.g0 g0Var;
        if (super.getNextTime() == 0) {
            return 0L;
        }
        Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.u)) {
                g0Var = c1.CLOSED_EMPTY;
                return obj == g0Var ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.u) obj).isEmpty()) {
                return 0L;
            }
        }
        d dVar = (d) _delayed$FU.get(this);
        if (dVar == null || (cVar = (c) dVar.peek()) == null) {
            return Long.MAX_VALUE;
        }
        long j8 = cVar.nanoTime;
        kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
        coerceAtLeast = j6.v.coerceAtLeast(j8 - (timeSource != null ? timeSource.nanoTime() : System.nanoTime()), 0L);
        return coerceAtLeast;
    }

    public u0 invokeOnTimeout(long j8, Runnable runnable, CoroutineContext coroutineContext) {
        return p0.a.invokeOnTimeout(this, j8, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.y0
    protected boolean isEmpty() {
        kotlinx.coroutines.internal.g0 g0Var;
        if (!isUnconfinedQueueEmpty()) {
            return false;
        }
        d dVar = (d) _delayed$FU.get(this);
        if (dVar != null && !dVar.isEmpty()) {
            return false;
        }
        Object obj = _queue$FU.get(this);
        if (obj != null) {
            if (obj instanceof kotlinx.coroutines.internal.u) {
                return ((kotlinx.coroutines.internal.u) obj).isEmpty();
            }
            g0Var = c1.CLOSED_EMPTY;
            if (obj != g0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // kotlinx.coroutines.y0
    public long processNextEvent() {
        kotlinx.coroutines.internal.m0 m0Var;
        if (processUnconfinedEvent()) {
            return 0L;
        }
        d dVar = (d) _delayed$FU.get(this);
        if (dVar != null && !dVar.isEmpty()) {
            kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
            long nanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
            do {
                synchronized (dVar) {
                    kotlinx.coroutines.internal.m0 firstImpl = dVar.firstImpl();
                    m0Var = null;
                    if (firstImpl != null) {
                        c cVar = (c) firstImpl;
                        if (cVar.timeToExecute(nanoTime) && enqueueImpl(cVar)) {
                            m0Var = dVar.removeAtImpl(0);
                        }
                    }
                }
            } while (((c) m0Var) != null);
        }
        Runnable dequeue = dequeue();
        if (dequeue == null) {
            return getNextTime();
        }
        dequeue.run();
        return 0L;
    }

    protected final void resetAll() {
        _queue$FU.set(this, null);
        _delayed$FU.set(this, null);
    }

    public final void schedule(long j8, c cVar) {
        int scheduleImpl = scheduleImpl(j8, cVar);
        if (scheduleImpl == 0) {
            if (shouldUnpark(cVar)) {
                unpark();
            }
        } else if (scheduleImpl == 1) {
            reschedule(j8, cVar);
        } else if (scheduleImpl != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    protected final u0 scheduleInvokeOnTimeout(long j8, Runnable runnable) {
        long delayToNanos = c1.delayToNanos(j8);
        if (delayToNanos >= k6.c.MAX_MILLIS) {
            return x1.INSTANCE;
        }
        kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
        long nanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
        b bVar = new b(delayToNanos + nanoTime, runnable);
        schedule(nanoTime, bVar);
        return bVar;
    }

    @Override // kotlinx.coroutines.p0
    /* renamed from: scheduleResumeAfterDelay */
    public void mo1294scheduleResumeAfterDelay(long j8, n nVar) {
        long delayToNanos = c1.delayToNanos(j8);
        if (delayToNanos < k6.c.MAX_MILLIS) {
            kotlinx.coroutines.b timeSource = kotlinx.coroutines.c.getTimeSource();
            long nanoTime = timeSource != null ? timeSource.nanoTime() : System.nanoTime();
            a aVar = new a(delayToNanos + nanoTime, nVar);
            schedule(nanoTime, aVar);
            q.disposeOnCancellation(nVar, aVar);
        }
    }

    @Override // kotlinx.coroutines.y0
    public void shutdown() {
        h2.INSTANCE.resetEventLoop$kotlinx_coroutines_core();
        setCompleted(true);
        closeQueue();
        while (processNextEvent() <= 0) {
        }
        rescheduleAllDelayed();
    }
}
