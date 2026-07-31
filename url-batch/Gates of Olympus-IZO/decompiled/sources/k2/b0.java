package k2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public abstract class b0 extends p2.j implements G, U {

    /* renamed from: g, reason: collision with root package name */
    public f0 f5341g;

    @Override // k2.G
    public final void a() {
        f0 j3 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f5356d;
            Object obj = atomicReferenceFieldUpdater.get(j3);
            if (obj instanceof b0) {
                if (obj != this) {
                    return;
                }
                I i3 = AbstractC0552y.f5409j;
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
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = p2.j.f6787d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof p2.p) {
                    p2.j jVar = ((p2.p) obj2).f6803a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Z1.i.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                p2.j jVar2 = (p2.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = p2.j.f6789f;
                p2.p pVar = (p2.p) atomicReferenceFieldUpdater3.get(jVar2);
                if (pVar == null) {
                    pVar = new p2.p(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, pVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, pVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.f();
                return;
            }
        }
    }

    @Override // k2.U
    public final boolean b() {
        return true;
    }

    @Override // k2.U
    public final h0 d() {
        return null;
    }

    public X getParent() {
        return j();
    }

    public final f0 j() {
        f0 f0Var = this.f5341g;
        if (f0Var != null) {
            return f0Var;
        }
        Z1.i.j("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // p2.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0552y.i(this) + "[job@" + AbstractC0552y.i(j()) + ']';
    }
}
