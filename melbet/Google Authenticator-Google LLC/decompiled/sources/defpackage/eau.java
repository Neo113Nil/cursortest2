package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eau implements kzq {
    public final Object a;
    public final Object b;
    private final /* synthetic */ int c;

    public eau(List list, Integer num, cfe cfeVar, int i) {
        eau eauVar;
        this.c = i;
        list.getClass();
        this.a = num;
        ArrayList arrayList = new ArrayList(ixc.w(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ebb ebbVar = (ebb) it.next();
            ebbVar.getClass();
            if (ebbVar instanceof ebc) {
                eauVar = new eau(new aya(ebbVar, cfeVar, 19), 0);
            } else {
                ((Integer) ((gzs) ebbVar.r).a).intValue();
                eauVar = new eau(new aya(ebbVar, cfeVar, 20), 0);
            }
            arrayList.add(eauVar);
        }
        this.b = arrayList;
    }

    @Override // defpackage.kzq
    public final Object a(kzr kzrVar, kqj kqjVar) {
        return this.c != 0 ? new kzj(new akn(this, (kqj) null, 10, (byte[]) null)).a(kzrVar, kqjVar) : lar.g((lar) this.b, kzrVar, kqjVar);
    }

    public eau(krt krtVar, int i) {
        this.c = i;
        this.a = krtVar;
        this.b = new kzl(new akn(this, (kqj) null, 11));
    }
}
