package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-de38bb36dc2361356cb83b4c675dbcd2450924cecdb12a3272c608759c381a50 */
/* loaded from: classes.dex */
public abstract class rr extends zt implements di, xq {
    public ur d;

    @Override // defpackage.di
    public final void a() {
        ur j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ur.f;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof rr) {
                if (obj != this) {
                    return;
                }
                ek ekVar = kr.i;
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, ekVar)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof xq) || ((xq) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zt.a;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof x20) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                zt ztVar = (zt) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = zt.c;
                x20 x20Var = (x20) atomicReferenceFieldUpdater3.get(ztVar);
                if (x20Var == null) {
                    x20Var = new x20(ztVar);
                    atomicReferenceFieldUpdater3.set(ztVar, x20Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, x20Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                ztVar.f();
                return;
            }
        }
    }

    @Override // defpackage.xq
    public final boolean b() {
        return true;
    }

    @Override // defpackage.xq
    public final iy d() {
        return null;
    }

    public final ur j() {
        ur urVar = this.d;
        if (urVar != null) {
            return urVar;
        }
        kr.g0("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.zt
    public final String toString() {
        return getClass().getSimpleName() + '@' + xf.s(this) + "[job@" + xf.s(j()) + ']';
    }
}
