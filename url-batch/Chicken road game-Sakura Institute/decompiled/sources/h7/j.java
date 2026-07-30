package h7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f4691a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new l(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4691a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int a3 = lVar.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                l c4 = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c4) && atomicReferenceFieldUpdater.get(this) == lVar) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4691a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            l c4 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c4) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        l lVar = (l) f4691a.get(this);
        lVar.getClass();
        long j8 = l.f4694f.get(lVar);
        return (((int) ((j8 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j8))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f4691a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            Object d8 = lVar.d();
            if (d8 != l.f4695g) {
                return d8;
            }
            l c4 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c4) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }
}
