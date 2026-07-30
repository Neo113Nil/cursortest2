package n6;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public abstract class b0 extends s6.j implements H, U {

    /* renamed from: l, reason: collision with root package name */
    public f0 f7039l;

    @Override // n6.U
    public final boolean a() {
        return true;
    }

    @Override // n6.U
    public final h0 c() {
        return null;
    }

    @Override // n6.H
    public final void dispose() {
        f0 i2 = i();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f0.f7054d;
            Object obj = atomicReferenceFieldUpdater.get(i2);
            if (obj instanceof b0) {
                if (obj != this) {
                    return;
                }
                J j = AbstractC0792z.j;
                while (!atomicReferenceFieldUpdater.compareAndSet(i2, obj, j)) {
                    if (atomicReferenceFieldUpdater.get(i2) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof U) || ((U) obj).c() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = s6.j.f7838d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof s6.o) {
                    s6.j jVar = ((s6.o) obj2).f7851a;
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                Intrinsics.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                s6.j jVar2 = (s6.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = s6.j.f7840i;
                s6.o oVar = (s6.o) atomicReferenceFieldUpdater3.get(jVar2);
                if (oVar == null) {
                    oVar = new s6.o(jVar2);
                    atomicReferenceFieldUpdater3.set(jVar2, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar2.e();
                return;
            }
        }
    }

    public X getParent() {
        return i();
    }

    public final f0 i() {
        f0 f0Var = this.f7039l;
        if (f0Var != null) {
            return f0Var;
        }
        Intrinsics.h("job");
        throw null;
    }

    public abstract boolean j();

    public abstract void k(Throwable th);

    @Override // s6.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + AbstractC0792z.g(this) + "[job@" + AbstractC0792z.g(i()) + ']';
    }
}
