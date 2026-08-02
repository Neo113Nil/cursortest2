package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dqv extends afc {
    public her i;
    private final dov j;
    private final cvo k;
    private final cwy l;

    public dqv(Context context, dov dovVar) {
        cwy cwyVar = new cwy(context);
        this.i = hix.b;
        this.j = dovVar;
        this.l = cwyVar;
        this.k = new cvo() { // from class: ech
            @Override // defpackage.cvo
            public final void a(her herVar) {
                hel helVar;
                hen henVar = new hen(4);
                for (Map.Entry entry : herVar.entrySet()) {
                    cvg cvgVar = (cvg) entry.getValue();
                    if (cvgVar == null || cvgVar.c.isEmpty()) {
                        int i = hel.d;
                        helVar = his.a;
                    } else {
                        heg hegVar = new heg(4);
                        Iterator it = cvgVar.c.iterator();
                        while (it.hasNext()) {
                            dqw a = dqw.a(cvgVar.b, (cvl) it.next());
                            if (a != null) {
                                hegVar.h(a);
                            }
                        }
                        helVar = hegVar.g();
                    }
                    if (!helVar.isEmpty()) {
                        henVar.g((String) entry.getKey(), helVar);
                    }
                }
                dqv dqvVar = dqv.this;
                dqvVar.i = henVar.d(true);
                dih.ai(dqvVar, gyf.a);
            }
        };
    }

    @Override // defpackage.aez
    protected final void f() {
        cvo cvoVar = this.k;
        cwy cwyVar = this.l;
        cwe.a(cvoVar, cwyVar);
        cpa cpaVar = new cpa();
        cpaVar.b = new cli[]{cvb.a};
        cpaVar.a = new czc(1);
        cpaVar.c = 28003;
        cwyVar.i(0, cpaVar.a());
    }

    @Override // defpackage.aez
    protected final void g() {
        cwe.b(this.k, this.l);
    }

    public final hel l(Object obj) {
        hel helVar = (hel) dih.aq(this.j, obj, this.i, null);
        if (helVar != null) {
            return helVar;
        }
        int i = hel.d;
        return his.a;
    }

    public final boolean m(hel helVar) {
        return hnu.Z(helVar, new bqg(this, 11));
    }

    public dqv() {
        throw null;
    }
}
