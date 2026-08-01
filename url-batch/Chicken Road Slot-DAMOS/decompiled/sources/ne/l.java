package ne;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f7290b = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7291c = AtomicIntegerFieldUpdater.newUpdater(l.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7292d = AtomicIntegerFieldUpdater.newUpdater(l.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f7293e = AtomicIntegerFieldUpdater.newUpdater(l.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f7294a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final h a(h hVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7291c;
        if (atomicIntegerFieldUpdater.get(this) - f7292d.get(this) == 127) {
            return hVar;
        }
        if (hVar.f7281e) {
            f7293e.incrementAndGet(this);
        }
        int i3 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f7294a;
            if (atomicReferenceArray.get(i3) == null) {
                atomicReferenceArray.lazySet(i3, hVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final h b() {
        h hVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f7292d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f7291c.get(this) == 0) {
                return null;
            }
            int i10 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (hVar = (h) this.f7294a.getAndSet(i10, null)) != null) {
                if (hVar.f7281e) {
                    f7293e.decrementAndGet(this);
                }
                return hVar;
            }
        }
    }

    public final h c(int i3, boolean z10) {
        int i10 = i3 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f7294a;
        h hVar = (h) atomicReferenceArray.get(i10);
        if (hVar != null && hVar.f7281e == z10) {
            while (!atomicReferenceArray.compareAndSet(i10, hVar, null)) {
                if (atomicReferenceArray.get(i10) != hVar) {
                }
            }
            if (z10) {
                f7293e.decrementAndGet(this);
            }
            return hVar;
        }
        return null;
    }
}
