package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public class au {
    public static final /* synthetic */ AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(au.class, Object.class, "_cur$volatile");
    private volatile /* synthetic */ Object _cur$volatile = new cu(8, false);

    public final boolean a(Runnable runnable) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            cu cuVar = (cu) atomicReferenceFieldUpdater.get(this);
            int a2 = cuVar.a(runnable);
            if (a2 == 0) {
                return true;
            }
            if (a2 == 1) {
                cu c = cuVar.c();
                while (!atomicReferenceFieldUpdater.compareAndSet(this, cuVar, c) && atomicReferenceFieldUpdater.get(this) == cuVar) {
                }
            } else if (a2 == 2) {
                return false;
            }
        }
    }

    public final void b() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            cu cuVar = (cu) atomicReferenceFieldUpdater.get(this);
            if (cuVar.b()) {
                return;
            }
            cu c = cuVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, cuVar, c) && atomicReferenceFieldUpdater.get(this) == cuVar) {
            }
        }
    }

    public final int c() {
        cu cuVar = (cu) a.get(this);
        cuVar.getClass();
        long j = cu.f.get(cuVar);
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) (1073741823 & j)));
    }

    public final Object d() {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
            cu cuVar = (cu) atomicReferenceFieldUpdater.get(this);
            Object d = cuVar.d();
            if (d != cu.g) {
                return d;
            }
            cu c = cuVar.c();
            while (!atomicReferenceFieldUpdater.compareAndSet(this, cuVar, c) && atomicReferenceFieldUpdater.get(this) == cuVar) {
            }
        }
    }
}
