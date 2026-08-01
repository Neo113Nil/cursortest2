package s1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f3658a = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "_cur");
    private volatile Object _cur = new l(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3658a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            int a2 = lVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                l c2 = lVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c2) && atomicReferenceFieldUpdater.get(this) == lVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3658a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            if (lVar.b()) {
                return;
            }
            l c2 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c2) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }

    public final int c() {
        l lVar = (l) f3658a.get(this);
        lVar.getClass();
        long j2 = l.f3661f.get(lVar);
        return (((int) ((j2 & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j2))) & 1073741823;
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f3658a;
            l lVar = (l) atomicReferenceFieldUpdater.get(this);
            Object d = lVar.d();
            if (d != l.f3662g) {
                return d;
            }
            l c2 = lVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, lVar, c2) && atomicReferenceFieldUpdater.get(this) == lVar) {
            }
        }
    }
}
