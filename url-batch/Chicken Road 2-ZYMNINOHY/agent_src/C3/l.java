package C3;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f305a = AtomicReferenceFieldUpdater.newUpdater(l.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new n(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f305a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            int a3 = nVar.a(runnable);
            if (a3 == 0) {
                return true;
            }
            if (a3 == 1) {
                n c4 = nVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
                }
            } else if (a3 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f305a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            if (nVar.b()) {
                return;
            }
            n c4 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }

    public final int c() {
        n nVar = (n) f305a.get(this);
        nVar.getClass();
        long j4 = n.f308f.get(nVar);
        return (((int) ((j4 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j4))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f305a;
            n nVar = (n) atomicReferenceFieldUpdater.get(this);
            Object d4 = nVar.d();
            if (d4 != n.f309g) {
                return d4;
            }
            n c4 = nVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, nVar, c4) && atomicReferenceFieldUpdater.get(this) == nVar) {
            }
        }
    }
}
