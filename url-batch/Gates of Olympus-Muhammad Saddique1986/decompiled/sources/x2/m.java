package x2;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f10361b = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10362c = AtomicIntegerFieldUpdater.newUpdater(m.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10363d = AtomicIntegerFieldUpdater.newUpdater(m.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f10364e = AtomicIntegerFieldUpdater.newUpdater(m.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f10365a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a(i iVar) {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10362c;
        if (atomicIntegerFieldUpdater.get(this) - f10363d.get(this) == 127) {
            return iVar;
        }
        if (iVar.f10352e) {
            f10364e.incrementAndGet(this);
        }
        int i3 = atomicIntegerFieldUpdater.get(this) & 127;
        while (true) {
            AtomicReferenceArray atomicReferenceArray = this.f10365a;
            if (atomicReferenceArray.get(i3) == null) {
                atomicReferenceArray.lazySet(i3, iVar);
                atomicIntegerFieldUpdater.incrementAndGet(this);
                return null;
            }
            Thread.yield();
        }
    }

    public final i b() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f10363d;
            int i3 = atomicIntegerFieldUpdater.get(this);
            if (i3 - f10362c.get(this) == 0) {
                return null;
            }
            int i4 = i3 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i3, i3 + 1) && (iVar = (i) this.f10365a.getAndSet(i4, null)) != null) {
                if (iVar.f10352e) {
                    f10364e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i c(int i3, boolean z3) {
        int i4 = i3 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f10365a;
        i iVar = (i) atomicReferenceArray.get(i4);
        if (iVar != null && iVar.f10352e == z3) {
            while (!atomicReferenceArray.compareAndSet(i4, iVar, null)) {
                if (atomicReferenceArray.get(i4) != iVar) {
                }
            }
            if (z3) {
                f10364e.decrementAndGet(this);
            }
            return iVar;
        }
        return null;
    }
}
