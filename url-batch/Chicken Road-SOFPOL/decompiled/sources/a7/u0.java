package a7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public class u0 extends a1 {

    /* renamed from: f, reason: collision with root package name */
    public final boolean f302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(s0 s0Var) {
        super(true);
        boolean z3 = true;
        P(s0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a1.f241e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar != null) {
            a1 j7 = lVar.j();
            while (!j7.K()) {
                k kVar2 = (k) atomicReferenceFieldUpdater.get(j7);
                l lVar2 = kVar2 instanceof l ? (l) kVar2 : null;
                if (lVar2 != null) {
                    j7 = lVar2.j();
                }
            }
            this.f302f = z3;
        }
        z3 = false;
        this.f302f = z3;
    }

    @Override // a7.a1
    public final boolean K() {
        return this.f302f;
    }

    @Override // a7.a1
    public final boolean L() {
        return true;
    }
}
