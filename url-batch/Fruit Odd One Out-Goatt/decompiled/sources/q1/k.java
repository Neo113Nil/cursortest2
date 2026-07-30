package q1;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a2d84f7cf5ca45495ceb585fa5ae0341076c951e080151b58cf9359cc6e7e89d */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f1126b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "lastScheduledTask");

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1127c = AtomicIntegerFieldUpdater.newUpdater(k.class, "producerIndex");

    /* renamed from: d, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1128d = AtomicIntegerFieldUpdater.newUpdater(k.class, "consumerIndex");

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f1129e = AtomicIntegerFieldUpdater.newUpdater(k.class, "blockingTasksInBuffer");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f1130a = new AtomicReferenceArray(128);
    private volatile int blockingTasksInBuffer;
    private volatile int consumerIndex;
    private volatile Object lastScheduledTask;
    private volatile int producerIndex;

    public final g a() {
        g gVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f1128d;
            int i2 = atomicIntegerFieldUpdater.get(this);
            if (i2 - f1127c.get(this) == 0) {
                return null;
            }
            int i3 = i2 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 + 1) && (gVar = (g) this.f1130a.getAndSet(i3, null)) != null) {
                if (gVar.f1115c.f133a == 1) {
                    f1129e.decrementAndGet(this);
                }
                return gVar;
            }
        }
    }

    public final g b(int i2, boolean z2) {
        int i3 = i2 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f1130a;
        g gVar = (g) atomicReferenceArray.get(i3);
        if (gVar != null) {
            if ((gVar.f1115c.f133a == 1) == z2) {
                while (!atomicReferenceArray.compareAndSet(i3, gVar, null)) {
                    if (atomicReferenceArray.get(i3) != gVar) {
                    }
                }
                if (z2) {
                    f1129e.decrementAndGet(this);
                }
                return gVar;
            }
        }
        return null;
    }
}
