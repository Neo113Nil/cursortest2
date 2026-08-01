package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class az {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(az.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new cz(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            cz czVar = (cz) atomicReferenceFieldUpdater.get(this);
            int a2 = czVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                cz c = czVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, czVar, c) && atomicReferenceFieldUpdater.get(this) == czVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            cz czVar = (cz) atomicReferenceFieldUpdater.get(this);
            if (czVar.b()) {
                return;
            }
            cz c = czVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, czVar, c) && atomicReferenceFieldUpdater.get(this) == czVar) {
            }
        }
    }

    public final int c() {
        cz czVar = (cz) a.get(this);
        czVar.getClass();
        long j = cz.f.get(czVar);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            cz czVar = (cz) atomicReferenceFieldUpdater.get(this);
            Object d = czVar.d();
            if (d != cz.g) {
                return d;
            }
            cz c = czVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, czVar, c) && atomicReferenceFieldUpdater.get(this) == czVar) {
            }
        }
    }
}
