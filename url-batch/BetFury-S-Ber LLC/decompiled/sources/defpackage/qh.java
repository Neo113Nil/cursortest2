package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-555d5e190d9a27a9a8404de93c25a29c9fbe11559b3463c92c68ce527c1de619 */
/* loaded from: classes.dex */
public final class qh extends tg0 implements xr {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ ds l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qh(xr xrVar, dg dgVar) {
        super(dgVar);
        this.j = 2;
        this.l = xrVar;
    }

    @Override // defpackage.xr
    public final Object g(Object obj, Object obj2) {
        int i = this.j;
        sk0 sk0Var = sk0.a;
        switch (i) {
            case 0:
                return ((qh) i((dg) obj2, (x50) obj)).l(sk0Var);
            case 1:
                return ((qh) i((dg) obj2, (x50) obj)).l(sk0Var);
            default:
                return ((qh) i((dg) obj2, (ah) obj)).l(sk0Var);
        }
    }

    @Override // defpackage.f8
    public final dg i(dg dgVar, Object obj) {
        int i = this.j;
        ds dsVar = this.l;
        switch (i) {
            case 0:
                qh qhVar = new qh(dgVar, (h) dsVar, 0);
                qhVar.k = obj;
                return qhVar;
            case 1:
                qh qhVar2 = new qh(dgVar, (tr) dsVar, 1);
                qhVar2.k = obj;
                return qhVar2;
            default:
                qh qhVar3 = new qh((xr) dsVar, dgVar);
                qhVar3.k = obj;
                return qhVar3;
        }
    }

    @Override // defpackage.f8
    public final Object l(Object obj) {
        int i = this.j;
        ds dsVar = this.l;
        switch (i) {
            case 0:
                bh bhVar = bh.COROUTINE_SUSPENDED;
                mv.O(obj);
                x50 x50Var = (x50) this.k;
                x50Var.getClass();
                return ((h) dsVar).h(x50Var.b());
            case 1:
                bh bhVar2 = bh.COROUTINE_SUSPENDED;
                mv.O(obj);
                x50 x50Var2 = (x50) this.k;
                x50Var2.getClass();
                return ((tr) dsVar).h(x50Var2.b());
            default:
                bh bhVar3 = bh.COROUTINE_SUSPENDED;
                mv.O(obj);
                og w = ((ah) this.k).i().w(sl.g);
                w.getClass();
                tg tgVar = (tg) w;
                id idVar = new id(true);
                dg dgVar = null;
                idVar.A(null);
                gk0.x(ls.f, tgVar, eh.UNDISPATCHED, new he(idVar, (xr) dsVar, dgVar, 3));
                while (true) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = mw.f;
                    if (!(atomicReferenceFieldUpdater.get(idVar) instanceof wu)) {
                        Object obj2 = atomicReferenceFieldUpdater.get(idVar);
                        if (obj2 instanceof wu) {
                            s9.u("This job has not completed yet");
                            return dgVar;
                        }
                        if (obj2 instanceof ld) {
                            throw ((ld) obj2).a;
                        }
                        return n9.T(obj2);
                    }
                    try {
                        return gk0.L(tgVar, new ra0(idVar, dgVar, 2));
                    } catch (InterruptedException unused) {
                    }
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qh(dg dgVar, tr trVar, int i) {
        super(dgVar);
        this.j = i;
        this.l = trVar;
    }
}
