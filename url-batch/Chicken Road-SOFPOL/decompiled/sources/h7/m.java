package h7;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f3251b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3252c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3253d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f3254e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f3255a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3252c;
        if (atomicIntegerFieldUpdater.get(this) - f3253d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f3242e) {
            f3254e.incrementAndGet(this);
        }
        int i = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f3255a;
            if (atomicReferenceArray.get(i) == null) {
                atomicReferenceArray.lazySet(i, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f3253d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - f3252c.get(this) == 0) {
                return null;
            }
            int i8 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (iVar = (i) this.f3255a.getAndSet(i8, null)) != null) {
                if (iVar.f3242e) {
                    f3254e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i, boolean z3) {
        int i8 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.f3255a;
        i iVar = (i) atomicReferenceArray.get(i8);
        if (iVar != null && iVar.f3242e == z3) {
            while (!atomicReferenceArray.compareAndSet(i8, iVar, null)) {
                if (atomicReferenceArray.get(i8) != iVar) {
                }
            }
            if (z3) {
                f3254e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
