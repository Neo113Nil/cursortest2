package q2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b0 extends v2.i implements G, U {

    /* renamed from: g, reason: collision with root package name */
    public f0 f7880g;

    @Override // q2.G
    public final void a() {
        f0 j3 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f7895d;
            Object obj = atomicReferenceFieldUpdater.get(j3);
            if (obj instanceof b0) {
                if (obj != this) {
                    return;
                }
                I i3 = AbstractC0837y.f7949j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j3, obj, i3)) {
                    if (atomicReferenceFieldUpdater.get(j3) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof U) || ((U) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = v2.i.f9807d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof v2.o) {
                    v2.i iVar = ((v2.o) obj2).f9823a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                f2.j.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                v2.i iVar2 = (v2.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = v2.i.f9809f;
                v2.o oVar = (v2.o) atomicReferenceFieldUpdater3.get(iVar2);
                if (oVar == null) {
                    oVar = new v2.o(iVar2);
                    atomicReferenceFieldUpdater3.set(iVar2, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                iVar2.f();
                return;
            }
        }
    }

    @Override // q2.U
    public final boolean b() {
        return true;
    }

    @Override // q2.U
    public final h0 d() {
        return null;
    }

    public X getParent() {
        return j();
    }

    public final f0 j() {
        f0 f0Var = this.f7880g;
        if (f0Var != null) {
            return f0Var;
        }
        f2.j.j("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // v2.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0837y.j(this) + "[job@" + AbstractC0837y.j(j()) + ']';
    }
}
