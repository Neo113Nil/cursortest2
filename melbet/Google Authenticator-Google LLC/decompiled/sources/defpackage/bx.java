package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class bx implements bv {
    final /* synthetic */ by a;

    public bx(by byVar) {
        this.a = byVar;
    }

    @Override // defpackage.bv
    public final boolean f(ArrayList arrayList, ArrayList arrayList2) {
        boolean ad;
        int i;
        by byVar = this.a;
        if (by.U(2)) {
            Objects.toString(byVar.a);
        }
        int i2 = 0;
        if (byVar.c.isEmpty()) {
            ad = false;
        } else {
            byVar.e = (ae) byVar.c.get(r0.size() - 1);
            ArrayList arrayList3 = byVar.e.d;
            int size = arrayList3.size();
            for (int i3 = 0; i3 < size; i3++) {
                bd bdVar = ((ce) arrayList3.get(i3)).b;
                if (bdVar != null) {
                    bdVar.u = true;
                }
            }
            ad = byVar.ad(arrayList, arrayList2, -1, 0);
        }
        if (!byVar.i.isEmpty() && arrayList.size() > 0) {
            boolean booleanValue = ((Boolean) arrayList2.get(arrayList.size() - 1)).booleanValue();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            for (int i4 = 0; i4 < size2; i4++) {
                linkedHashSet.addAll(by.aa((ae) arrayList.get(i4)));
            }
            ArrayList arrayList4 = byVar.i;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                gux guxVar = (gux) arrayList4.get(i2);
                Iterator it = linkedHashSet.iterator();
                while (true) {
                    i = i2 + 1;
                    if (it.hasNext()) {
                        guxVar.a((bd) it.next(), booleanValue);
                    }
                }
                i2 = i;
            }
        }
        return ad;
    }
}
