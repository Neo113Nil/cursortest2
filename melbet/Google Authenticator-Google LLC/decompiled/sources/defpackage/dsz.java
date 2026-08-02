package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dsz extends kra implements krx {
    Object a;
    int b;
    final /* synthetic */ ehs c;
    final /* synthetic */ dtd d;
    final /* synthetic */ List e;
    final /* synthetic */ boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsz(ehs ehsVar, dtd dtdVar, List list, boolean z, kqj kqjVar) {
        super(2, kqjVar);
        this.c = ehsVar;
        this.d = dtdVar;
        this.e = list;
        this.f = z;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dsz) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        Object obj2;
        Object obj3;
        kqp kqpVar = kqp.a;
        if (this.b != 0) {
            obj3 = this.a;
            ixc.Y(obj);
        } else {
            ixc.Y(obj);
            ehr ehrVar = this.c.a;
            jit jitVar = ehrVar.a;
            dtd dtdVar = this.d;
            List list = this.e;
            boolean z = this.f;
            String str = jitVar.c;
            this.a = str;
            this.b = 1;
            jfq jfqVar = (jfq) dtdVar.k.a.get(str);
            if (jfqVar != null) {
                obj = jfqVar;
            } else {
                Iterator it = list.iterator();
                Object obj4 = null;
                boolean z2 = false;
                Object obj5 = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (ksp.b(((cid) next).c, ehrVar.c)) {
                            if (z2) {
                                break;
                            }
                            z2 = true;
                            obj5 = next;
                        }
                    } else if (z2) {
                        obj4 = obj5;
                    }
                }
                cid cidVar = (cid) obj4;
                if (!ehrVar.b || cidVar == null) {
                    obj2 = jfq.a;
                    dtdVar.k = new jfr(ixd.r(dtdVar.k.a, new kol(jitVar.c, obj2)));
                } else {
                    obj2 = ixg.f(new kwn(dtdVar.j), new dsy(dtdVar, cidVar, z, ehrVar, null), this);
                }
                obj = obj2;
            }
            if (obj == kqpVar) {
                return kqpVar;
            }
            obj3 = str;
        }
        return new kol(obj3, obj);
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new dsz(this.c, this.d, this.e, this.f, kqjVar);
    }
}
