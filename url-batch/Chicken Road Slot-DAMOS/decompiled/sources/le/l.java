package le;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f5987a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5987a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a9 = nVar.a(runnable);
            if (a9 == 0) {
                return true;
            }
            if (a9 == 1) {
                n c10 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a9 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5987a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f5987a.get(this);
        nVar.getClass();
        long j = n.f5990f.get(nVar);
        return (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f5987a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d10 = nVar.d();
            if (d10 != n.g) {
                return d10;
            }
            n c10 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c10) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
