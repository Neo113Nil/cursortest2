package E3;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f727b = AtomicReferenceFieldUpdater.newUpdater(n.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f728c = AtomicIntegerFieldUpdater.newUpdater(n.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f729d = AtomicIntegerFieldUpdater.newUpdater(n.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f730e = AtomicIntegerFieldUpdater.newUpdater(n.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    public final AtomicReferenceArray f731a = new AtomicReferenceArray(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public final i a() {
        i iVar;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f729d;
            int i4 = atomicIntegerFieldUpdater.get(this);
            if (i4 - f728c.get(this) == 0) {
                return null;
            }
            int i5 = i4 & 127;
            if (atomicIntegerFieldUpdater.compareAndSet(this, i4, i4 + 1) && (iVar = (i) this.f731a.getAndSet(i5, null)) != null) {
                if (iVar.f715b.f716a == 1) {
                    f730e.decrementAndGet(this);
                }
                return iVar;
            }
        }
    }

    public final i b(int i4, boolean z) {
        int i5 = i4 & 127;
        AtomicReferenceArray atomicReferenceArray = this.f731a;
        i iVar = (i) atomicReferenceArray.get(i5);
        if (iVar != null) {
            if ((iVar.f715b.f716a == 1) == z) {
                while (!atomicReferenceArray.compareAndSet(i5, iVar, null)) {
                    if (atomicReferenceArray.get(i5) != iVar) {
                    }
                }
                if (z) {
                    f730e.decrementAndGet(this);
                }
                return iVar;
            }
        }
        return null;
    }
}
