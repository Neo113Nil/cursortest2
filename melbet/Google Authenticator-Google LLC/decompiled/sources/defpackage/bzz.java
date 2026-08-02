package defpackage;

import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class bzz extends kra implements krx {
    final /* synthetic */ caa a;
    final /* synthetic */ List b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzz(caa caaVar, List list, kqj kqjVar) {
        super(2, kqjVar);
        this.a = caaVar;
        this.b = list;
    }

    @Override // defpackage.krx
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bzz) c((kvm) obj, (kqj) obj2)).b(kow.a);
    }

    @Override // defpackage.kqu
    public final Object b(Object obj) {
        ixc.Y(obj);
        int i = hel.d;
        heg hegVar = new heg(4);
        brn brnVar = new brn();
        List list = this.b;
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            bzs a = bzq.a(this.a.e.a((String) it.next()), brnVar);
            hegVar.j(a.a);
            i2 += a.b;
        }
        hel g = hegVar.g();
        g.getClass();
        return new cab(!g.isEmpty() || i2 > 0, g, i2, list.size());
    }

    @Override // defpackage.kqu
    public final kqj c(Object obj, kqj kqjVar) {
        return new bzz(this.a, this.b, kqjVar);
    }
}
