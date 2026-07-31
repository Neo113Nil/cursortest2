package O5;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1831b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1832c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1833d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1834e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1835a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1832c;
        if (atomicIntegerFieldUpdater.get(this) - f1833d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f1820g.f384a == 1) {
            f1834e.incrementAndGet(this);
        }
        int i7 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f1835a;
            if (atomicReferenceArray.get(i7) == null) {
                atomicReferenceArray.lazySet(i7, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1833d;
            int i7 = atomicIntegerFieldUpdater.get(this);
            if (i7 - f1832c.get(this) == 0) {
                return null;
            }
            int i8 = i7 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i7, i7 + 1) && (hVar = (h) this.f1835a.getAndSet(i8, null)) != null) {
                if (hVar.f1820g.f384a == 1) {
                    f1834e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i7, boolean z5) {
        int i8 = i7 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1835a;
        h hVar = (h) atomicReferenceArray.get(i8);
        if (hVar != null) {
            if ((hVar.f1820g.f384a == 1) == z5) {
                while (!atomicReferenceArray.compareAndSet(i8, hVar, null)) {
                    if (atomicReferenceArray.get(i8) != hVar) {
                    }
                }
                if (z5) {
                    f1834e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
