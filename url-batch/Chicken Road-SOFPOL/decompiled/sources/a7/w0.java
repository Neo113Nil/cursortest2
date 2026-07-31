package a7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class w0 extends f7.j implements e0, p0 {

    /* renamed from: g, reason: collision with root package name */
    public a1 f309g;

    @Override // a7.e0
    public final void a() {
        a1 j7 = j();
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1.f240d;
            Object obj = atomicReferenceFieldUpdater.get(j7);
            if (obj instanceof w0) {
                if (obj != this) {
                    return;
                }
                g0 g0Var = x.f318j;
                while (!atomicReferenceFieldUpdater.compareAndSet(j7, obj, g0Var)) {
                    if (atomicReferenceFieldUpdater.get(j7) != obj) {
                        break;
                    }
                }
                return;
            }
            if (!(obj instanceof p0) || ((p0) obj).d() == null) {
                return;
            }
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f7.j.f2783d;
                Object obj2 = atomicReferenceFieldUpdater2.get(this);
                if (obj2 instanceof f7.o) {
                    return;
                }
                if (obj2 == this) {
                    return;
                }
                q6.i.c(obj2, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                f7.j jVar = (f7.j) obj2;
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = f7.j.f2785f;
                f7.o oVar = (f7.o) atomicReferenceFieldUpdater3.get(jVar);
                if (oVar == null) {
                    oVar = new f7.o(jVar);
                    atomicReferenceFieldUpdater3.set(jVar, oVar);
                }
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, obj2, oVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != obj2) {
                        break;
                    }
                }
                jVar.f();
                return;
            }
        }
    }

    @Override // a7.p0
    public final boolean b() {
        return true;
    }

    @Override // a7.p0
    public final c1 d() {
        return null;
    }

    public s0 getParent() {
        return j();
    }

    public final a1 j() {
        a1 a1Var = this.f309g;
        if (a1Var != null) {
            return a1Var;
        }
        q6.i.j("job");
        throw null;
    }

    public abstract boolean k();

    public abstract void l(Throwable th);

    @Override // f7.j
    public final String toString() {
        return getClass().getSimpleName() + '@' + x.g(this) + "[job@" + x.g(j()) + ']';
    }
}
