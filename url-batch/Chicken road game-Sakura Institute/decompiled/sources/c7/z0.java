package c7;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class z0 extends f1 {

    /* renamed from: h, reason: collision with root package name */
    public final boolean f1762h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(x0 x0Var) {
        super(true);
        boolean z8 = true;
        K(x0Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f1.f1693g;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar != null) {
            f1 j8 = lVar.j();
            while (!j8.B()) {
                k kVar2 = (k) atomicReferenceFieldUpdater.get(j8);
                l lVar2 = kVar2 instanceof l ? (l) kVar2 : null;
                if (lVar2 != null) {
                    j8 = lVar2.j();
                }
            }
            this.f1762h = z8;
        }
        z8 = false;
        this.f1762h = z8;
    }

    @Override // c7.f1
    public final boolean B() {
        return this.f1762h;
    }

    @Override // c7.f1
    public final boolean C() {
        return true;
    }
}
