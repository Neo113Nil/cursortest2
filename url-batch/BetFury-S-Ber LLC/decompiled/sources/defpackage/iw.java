package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class iw extends zy implements nk, wu {
    public mw i;

    @Override // defpackage.nk
    public final void a() {
        mw j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mw.f;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof iw) {
                if (obj != this) {
                    return;
                }
                sm smVar = n9.m;
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, smVar)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof wu) || ((wu) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = zy.f;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof f90) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                zy zyVar = (zy) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = zy.h;
                f90 f90Var = (f90) atomicReferenceFieldUpdater3.get(zyVar);
                if (f90Var == null) {
                    f90Var = new f90(zyVar);
                    atomicReferenceFieldUpdater3.set(zyVar, f90Var);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, f90Var)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                zyVar.f();
                return;
            }
        }
    }

    @Override // defpackage.wu
    public final boolean b() {
        return true;
    }

    @Override // defpackage.wu
    public final u30 d() {
        return null;
    }

    public final mw j() {
        mw mwVar = this.i;
        if (mwVar != null) {
            return mwVar;
        }
        mv.P("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // defpackage.zy
    public final String toString() {
        return getClass().getSimpleName() + '@' + bi.D(this) + "[job@" + bi.D(j()) + ']';
    }
}
