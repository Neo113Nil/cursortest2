package ge;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public class e1 extends k1 implements o {

    /* renamed from: i, reason: collision with root package name */
    public final boolean f4347i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(c1 c1Var) {
        super(true);
        boolean z10 = true;
        O(c1Var);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = k1.f4375e;
        k kVar = (k) atomicReferenceFieldUpdater.get(this);
        l lVar = kVar instanceof l ? (l) kVar : null;
        if (lVar != null) {
            k1 j = lVar.j();
            while (!j.I()) {
                k kVar2 = (k) atomicReferenceFieldUpdater.get(j);
                l lVar2 = kVar2 instanceof l ? (l) kVar2 : null;
                if (lVar2 != null) {
                    j = lVar2.j();
                }
            }
            this.f4347i = z10;
        }
        z10 = false;
        this.f4347i = z10;
    }

    @Override // ge.k1
    public final boolean I() {
        return this.f4347i;
    }

    @Override // ge.k1
    public final boolean K() {
        return true;
    }
}
