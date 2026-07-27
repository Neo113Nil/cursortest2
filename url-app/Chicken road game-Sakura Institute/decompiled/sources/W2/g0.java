package W2;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class g0 extends b3.i implements L, Z {

    /* renamed from: j, reason: collision with root package name */
    public k0 f4261j;

    @Override // W2.L
    public final void a() {
        k0 j4 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k0.f4279d;
            Object obj = atomicReferenceFieldUpdater.get(j4);
            if (obj instanceof g0) {
                if (obj != this) {
                    return;
                }
                N n2 = B.f4217j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j4, obj, n2)) {
                    if (atomicReferenceFieldUpdater.get(j4) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof Z) || ((Z) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b3.i.f5667d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof b3.o) {
                    b3.i iVar = ((b3.o) obj2).f5683a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.d(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                b3.i iVar2 = (b3.i) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = b3.i.f5669i;
                b3.o oVar = (b3.o) atomicReferenceFieldUpdater3.get(iVar2);
                if (oVar == null) {
                    oVar = new b3.o(iVar2);
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

    @Override // W2.Z
    public final boolean b() {
        return true;
    }

    @Override // W2.Z
    public final m0 d() {
        return null;
    }

    public InterfaceC0280c0 getParent() {
        return j();
    }

    public final k0 j() {
        k0 k0Var = this.f4261j;
        if (k0Var != null) {
            return k0Var;
        }
        Intrinsics.g("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // b3.i
    public final String toString() {
        return getClass().getSimpleName() + '@' + B.f(this) + "[job@" + B.f(j()) + ']';
    }
}
