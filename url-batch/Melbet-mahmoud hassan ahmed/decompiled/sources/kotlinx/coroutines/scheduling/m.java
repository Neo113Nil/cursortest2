package kotlinx.coroutines.scheduling;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m6.p0;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f18436b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18437c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18438d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f18439e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    private final AtomicReferenceArray<i> f18440a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    public static /* synthetic */ i b(m mVar, i iVar, boolean z6, int i7, Object obj) {
        if ((i7 & 2) != 0) {
            z6 = false;
        }
        return mVar.a(iVar, z6);
    }

    private final i c(i iVar) {
        if (iVar.f18428g.M() == 1) {
            f18439e.incrementAndGet(this);
        }
        if (e() == 127) {
            return iVar;
        }
        int i7 = this.producerIndex & 127;
        while (this.f18440a.get(i7) != null) {
            Thread.yield();
        }
        this.f18440a.lazySet(i7, iVar);
        f18437c.incrementAndGet(this);
        return null;
    }

    private final void d(i iVar) {
        if (iVar != null) {
            if (iVar.f18428g.M() == 1) {
                int decrementAndGet = f18439e.decrementAndGet(this);
                if (p0.a()) {
                    if (!(decrementAndGet >= 0)) {
                        throw new AssertionError();
                    }
                }
            }
        }
    }

    private final i i() {
        i andSet;
        while (true) {
            int i7 = this.consumerIndex;
            if (i7 - this.producerIndex == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (f18438d.compareAndSet(this, i7, i7 + 1) && (andSet = this.f18440a.getAndSet(i8, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    private final boolean j(d dVar) {
        i i7 = i();
        if (i7 == null) {
            return false;
        }
        dVar.a(i7);
        return true;
    }

    private final long m(m mVar, boolean z6) {
        i iVar;
        do {
            iVar = (i) mVar.lastScheduledTask;
            if (iVar == null) {
                return -2L;
            }
            if (z6) {
                if (!(iVar.f18428g.M() == 1)) {
                    return -2L;
                }
            }
            long a7 = l.f18435f.a() - iVar.f18427f;
            long j7 = l.f18430a;
            if (a7 < j7) {
                return j7 - a7;
            }
        } while (!androidx.work.impl.utils.futures.b.a(f18436b, mVar, iVar, null));
        b(this, iVar, false, 2, null);
        return -1L;
    }

    public final i a(i iVar, boolean z6) {
        if (z6) {
            return c(iVar);
        }
        i iVar2 = (i) f18436b.getAndSet(this, iVar);
        if (iVar2 == null) {
            return null;
        }
        return c(iVar2);
    }

    public final int e() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int f() {
        return this.lastScheduledTask != null ? e() + 1 : e();
    }

    public final void g(d dVar) {
        i iVar = (i) f18436b.getAndSet(this, null);
        if (iVar != null) {
            dVar.a(iVar);
        }
        while (j(dVar)) {
        }
    }

    public final i h() {
        i iVar = (i) f18436b.getAndSet(this, null);
        return iVar == null ? i() : iVar;
    }

    public final long k(m mVar) {
        if (p0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        int i7 = mVar.producerIndex;
        AtomicReferenceArray<i> atomicReferenceArray = mVar.f18440a;
        for (int i8 = mVar.consumerIndex; i8 != i7; i8++) {
            int i9 = i8 & 127;
            if (mVar.blockingTasksInBuffer == 0) {
                break;
            }
            i iVar = atomicReferenceArray.get(i9);
            if (iVar != null) {
                if ((iVar.f18428g.M() == 1) && atomicReferenceArray.compareAndSet(i9, iVar, null)) {
                    f18439e.decrementAndGet(mVar);
                    b(this, iVar, false, 2, null);
                    return -1L;
                }
            }
        }
        return m(mVar, true);
    }

    public final long l(m mVar) {
        if (p0.a()) {
            if (!(e() == 0)) {
                throw new AssertionError();
            }
        }
        i i7 = mVar.i();
        if (i7 == null) {
            return m(mVar, false);
        }
        i b7 = b(this, i7, false, 2, null);
        if (!p0.a()) {
            return -1L;
        }
        if (b7 == null) {
            return -1L;
        }
        throw new AssertionError();
    }
}
