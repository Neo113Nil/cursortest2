package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ggr implements fup {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ggr(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r7v4, types: [java.lang.Object, koe] */
    @Override // defpackage.fup
    public final hvi a(fun funVar) {
        int i = this.b;
        if (i != 0) {
            ?? r7 = this.a;
            if (i != 1) {
                return ((gqn) r7.b()).e();
            }
            hvi aJ = hnu.aJ(null);
            ((iwq) r7).k(aJ, "com.google.apps.tiktok.account.data.AllAccounts");
            return aJ;
        }
        gty aB = hoq.aB(153, "AccountEnabled: updateConfigurationsForAllPackages", gub.a, true);
        Object obj = this.a;
        try {
            frv frvVar = funVar.a;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((fym) obj).c.entrySet()) {
                ggh gghVar = (ggh) entry.getValue();
                if (gghVar == ggh.d || gghVar == ggh.b) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            Set keySet = linkedHashMap.keySet();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : keySet) {
                if (((fym) obj).h()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(ixc.w(arrayList));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((kee) ((fym) obj).e).d((String) it.next()));
            }
            ArrayList arrayList3 = new ArrayList(ixc.w(arrayList2));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(((fym) obj).g((String) it2.next(), frvVar));
            }
            hvi bx = hnu.bx(arrayList3);
            aB.b(bx);
            ixf.j(aB, null);
            return bx;
        } finally {
        }
    }
}
