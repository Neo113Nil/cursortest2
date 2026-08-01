package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public final class df0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(df0.class, Object.class, "lastScheduledTask$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(df0.class, "producerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(df0.class, "consumerIndex$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(df0.class, "blockingTasksInBuffer$volatile");
    public final AtomicReferenceArray a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i80 a() {
        i80 i80Var;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = d;
            int i = atomicIntegerFieldUpdater.get(this);
            if (i - c.get(this) == 0) {
                return null;
            }
            int i2 = i & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i, i + 1) && (i80Var = (i80) this.a.getAndSet(i2, null)) != null) {
                if (i80Var.g) {
                    e.decrementAndGet(this);
                }
                return i80Var;
            }
        }
    }

    public final i80 b(int i, boolean z) {
        int i2 = i & 127;
        AtomicReferenceArray atomicReferenceArray = this.a;
        i80 i80Var = (i80) atomicReferenceArray.get(i2);
        if (i80Var != null && i80Var.g == z) {
            while (!atomicReferenceArray.compareAndSet(i2, i80Var, null)) {
                if (atomicReferenceArray.get(i2) != i80Var) {
                }
            }
            if (z) {
                e.decrementAndGet(this);
            }
            return i80Var;
        }
        return null;
    }
}
