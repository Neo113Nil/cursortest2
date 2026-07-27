package d3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f6131b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6132c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6133d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f6134e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f6135a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6132c;
        if (atomicIntegerFieldUpdater.get(this) - f6133d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f6122e) {
            f6134e.incrementAndGet(this);
        }
        int i2 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f6135a;
            if (atomicReferenceArray.get(i2) == null) {
                atomicReferenceArray.lazySet(i2, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f6133d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f6132c.get(this) == 0) {
                return null;
            }
            int i4 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (iVar = (i) this.f6135a.getAndSet(i4, null)) != null) {
                if (iVar.f6122e) {
                    f6134e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i2, boolean z4) {
        int i4 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f6135a;
        i iVar = (i) atomicReferenceArray.get(i4);
        if (iVar != null && iVar.f6122e == z4) {
            while (!atomicReferenceArray.compareAndSet(i4, iVar, null)) {
                if (atomicReferenceArray.get(i4) != iVar) {
                }
            }
            if (z4) {
                f6134e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
