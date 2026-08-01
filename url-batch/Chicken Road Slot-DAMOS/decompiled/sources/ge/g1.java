package ge;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class g1 extends le.k implements m0, z0 {

    /* renamed from: r, reason: collision with root package name */
    public k1 f4352r;

    @Override // ge.m0
    public final void a() {
        k1 j = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f4374d;
            Object obj = atomicReferenceFieldUpdater.get(j);
            if (obj instanceof g1) {
                if (obj != this) {
                    return;
                }
                o0 o0Var = a0.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j, obj, o0Var)) {
                    if (atomicReferenceFieldUpdater.get(j) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof z0) || ((z0) obj).e() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = le.k.f5984d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof le.p) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                obj2.getClass();
                le.k kVar = (le.k) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = le.k.f5986i;
                le.p pVar = (le.p) atomicReferenceFieldUpdater3.get(kVar);
                if (pVar == null) {
                    pVar = new le.p(kVar);
                    atomicReferenceFieldUpdater3.set(kVar, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                kVar.f();
                return;
            }
        }
    }

    @Override // ge.z0
    public final boolean d() {
        return true;
    }

    @Override // ge.z0
    public final m1 e() {
        return null;
    }

    public c1 getParent() {
        return j();
    }

    public final k1 j() {
        k1 k1Var = this.f4352r;
        if (k1Var != null) {
            return k1Var;
        }
        Intrinsics.f("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // le.k
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.m(this) + "[job@" + a0.m(j()) + ']';
    }
}
