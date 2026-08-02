package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class cca implements ccg {
    private final hvl a;
    private final bpr b;

    public cca(bpr bprVar, hvl hvlVar) {
        this.b = bprVar;
        this.a = hvlVar;
    }

    private final hvi b(hvi hviVar, AtomicInteger atomicInteger) {
        return hoq.au(hviVar, new bpg(atomicInteger, hviVar, 13, null), this.a);
    }

    @Override // defpackage.ccg
    public final hvi a(List list, cbz cbzVar, String str) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ccf ccfVar = (ccf) it.next();
            if (ccfVar.c == 1) {
                int i = ccfVar.b - 1;
                if (i != 1) {
                    bpr bprVar = this.b;
                    if (i != 2) {
                        bpc bpcVar = ccfVar.a;
                        arrayList.add(b(bprVar.e(bpcVar.g, bpcVar.l.longValue()), cbzVar.c));
                    } else {
                        arrayList.add(b(bprVar.b(ccfVar.a), cbzVar.a));
                    }
                } else {
                    arrayList.add(b(this.b.f(ccfVar.a), cbzVar.b));
                }
            }
        }
        return hoq.at(hnu.aG(arrayList), new bwv(18), this.a);
    }
}
