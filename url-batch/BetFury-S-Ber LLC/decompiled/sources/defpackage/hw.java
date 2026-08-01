package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public class hw extends mw {
    public final boolean h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hw(mw mwVar) {
        super(true);
        boolean z = true;
        A(mwVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mw.g;
        kb kbVar = (kb) atomicReferenceFieldUpdater.get(this);
        lb lbVar = kbVar instanceof lb ? (lb) kbVar : null;
        if (lbVar != null) {
            mw j = lbVar.j();
            while (!j.u()) {
                kb kbVar2 = (kb) atomicReferenceFieldUpdater.get(j);
                lb lbVar2 = kbVar2 instanceof lb ? (lb) kbVar2 : null;
                if (lbVar2 != null) {
                    j = lbVar2.j();
                }
            }
            this.h = z;
        }
        z = false;
        this.h = z;
    }

    @Override // defpackage.mw
    public final boolean u() {
        return this.h;
    }

    @Override // defpackage.mw
    public final boolean v() {
        return true;
    }
}
