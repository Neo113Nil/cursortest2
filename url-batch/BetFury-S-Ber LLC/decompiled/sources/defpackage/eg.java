package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public abstract class eg extends f8 {
    public final qg g;
    public transient dg h;

    public eg(dg dgVar) {
        this(dgVar, dgVar != null ? dgVar.d() : null);
    }

    @Override // defpackage.dg
    public final qg d() {
        qg qgVar = this.g;
        qgVar.getClass();
        return qgVar;
    }

    @Override // defpackage.f8
    public final void m() {
        dg dgVar = this.h;
        if (dgVar != null && dgVar != this) {
            qg qgVar = this.g;
            qgVar.getClass();
            og w = qgVar.w(sl.g);
            w.getClass();
            ek ekVar = (ek) dgVar;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = ek.m;
            while (atomicReferenceFieldUpdater.get(ekVar) == mv.i) {
            }
            Object obj = atomicReferenceFieldUpdater.get(ekVar);
            ka kaVar = obj instanceof ka ? (ka) obj : null;
            if (kaVar != null) {
                kaVar.r();
            }
        }
        this.h = kd.f;
    }

    public eg(dg dgVar, qg qgVar) {
        super(dgVar);
        this.g = qgVar;
    }
}
