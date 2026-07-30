package c7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b1 extends h7.i implements i0, u0 {

    /* renamed from: i, reason: collision with root package name */
    public f1 f1674i;

    @Override // c7.i0
    public final void a() {
        f1 j8 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.f1692f;
            Object obj = atomicReferenceFieldUpdater.get(j8);
            if (obj instanceof b1) {
                if (obj != this) {
                    return;
                }
                k0 k0Var = a0.f1669j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j8, obj, k0Var)) {
                    if (atomicReferenceFieldUpdater.get(j8) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof u0) || ((u0) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = h7.i.f4688f;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof h7.n) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                r6.k.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                h7.i iVar = (h7.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = h7.i.f4690h;
                h7.n nVar = (h7.n) atomicReferenceFieldUpdater3.get(iVar);
                if (nVar == null) {
                    nVar = new h7.n(iVar);
                    atomicReferenceFieldUpdater3.set(iVar, nVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, nVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                iVar.f();
                return;
            }
        }
    }

    @Override // c7.u0
    public final boolean b() {
        return true;
    }

    @Override // c7.u0
    public final h1 c() {
        return null;
    }

    public x0 getParent() {
        return j();
    }

    public final f1 j() {
        f1 f1Var = this.f1674i;
        if (f1Var != null) {
            return f1Var;
        }
        r6.k.j("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // h7.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + a0.i(this) + "[job@" + a0.i(j()) + ']';
    }
}
