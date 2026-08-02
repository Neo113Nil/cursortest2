package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cce implements ccg {
    private final hvl a;
    private List b;
    private final caz c;

    public cce(caz cazVar, hvl hvlVar) {
        this.c = cazVar;
        this.a = hvlVar;
    }

    private final hvi b(hvi hviVar, cbz cbzVar) {
        gwu g = gwu.g(hviVar);
        bpg bpgVar = new bpg(cbzVar, hviVar, 16);
        hvl hvlVar = this.a;
        return g.i(bpgVar, hvlVar).e(Exception.class, new bpg(cbzVar, hviVar, 17), hvlVar);
    }

    private final void c(List list, ccf ccfVar, cbz cbzVar, String str) {
        if (this.b.size() == 50) {
            list.add(b(this.c.a(this.b, str), cbzVar));
            this.b = new ArrayList();
        }
        this.b.add(ccfVar.a);
    }

    @Override // defpackage.ccg
    public final hvi a(List list, cbz cbzVar, String str) {
        ArrayList arrayList = new ArrayList(list.size());
        this.b = new ArrayList(50);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ccf ccfVar = (ccf) it.next();
            if (ccfVar.c == 2) {
                int i = ccfVar.b - 1;
                if (i == 1) {
                    cbzVar.i.incrementAndGet();
                    c(arrayList, ccfVar, cbzVar, str);
                } else if (i != 2) {
                    cbzVar.j.incrementAndGet();
                    try {
                        hvi b = this.c.b(ccfVar.a, str, true);
                        gwu g = gwu.g(b);
                        bpg bpgVar = new bpg(cbzVar, b, 14);
                        hvl hvlVar = this.a;
                        arrayList.add(g.i(bpgVar, hvlVar).e(Exception.class, new bpg(cbzVar, b, 15), hvlVar));
                    } catch (cat e) {
                        arrayList.add(hnu.aI(e));
                    }
                } else {
                    cbzVar.h.incrementAndGet();
                    c(arrayList, ccfVar, cbzVar, str);
                }
            }
        }
        if (!this.b.isEmpty()) {
            arrayList.add(b(this.c.a(this.b, str), cbzVar));
        }
        return hoq.at(hnu.aG(arrayList), new bwv(19), this.a);
    }
}
