package d1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1847b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1848c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1849d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1850e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1851a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final h a() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1849d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f1848c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (hVar = (h) this.f1851a.getAndSet(i3, null)) != null) {
                if (hVar.f1835f.f1836a == 1) {
                    f1850e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h b(int i2, boolean z2) {
        int i3 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1851a;
        h hVar = (h) atomicReferenceArray.get(i3);
        if (hVar != null) {
            if ((hVar.f1835f.f1836a == 1) == z2) {
                while (!atomicReferenceArray.compareAndSet(i3, hVar, null)) {
                    if (atomicReferenceArray.get(i3) != hVar) {
                    }
                }
                if (z2) {
                    f1850e.decrementAndGet(this);
                }
                return hVar;
            }
        }
        return null;
    }
}
