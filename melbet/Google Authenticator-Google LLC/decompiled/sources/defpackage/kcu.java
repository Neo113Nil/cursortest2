package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcu implements kbi {
    /* JADX WARN: Type inference failed for: r7v13, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.kbi
    public final ixf a(kbg kbgVar, kaa kaaVar, kbh kbhVar) {
        hvi aI;
        kbq e;
        gva gvaVar = (gva) kbgVar.g().a(kcw.a);
        kae c = kbgVar.c();
        String str = c.c;
        boolean z = c.f;
        if (!z || (aI = (hvi) ((ConcurrentHashMap) gvaVar.d).get(str)) == null) {
            Object obj = gvaVar.c;
            int i = gvaVar.a;
            kuq kuqVar = (kuq) ((kee) obj).a;
            kck kckVar = (kck) ((her) kuqVar.a).getOrDefault(str, kuqVar.b);
            if (kckVar instanceof kcc) {
                aI = ((kcc) kckVar).b();
            } else {
                try {
                    aI = hnu.aJ(kckVar.a(i));
                } catch (Exception e2) {
                    aI = hnu.aI(e2);
                }
            }
            if (z) {
                ((ConcurrentHashMap) gvaVar.d).putIfAbsent(str, aI);
                hnu.aS(aI, new kcv(gvaVar, str, aI, 0), huf.a);
            }
        }
        if (!aI.isDone()) {
            ?? r7 = gvaVar.b;
            kdv kdvVar = new kdv();
            hnu.aS(aI, new kct(kbgVar, kdvVar, kaaVar, kbhVar, 0), r7);
            return kdvVar;
        }
        try {
            e = (kbq) hnu.aR(aI);
        } catch (CancellationException | ExecutionException e3) {
            kbq d = kbq.k.d(e3);
            String message = e3.getMessage();
            e = message != null ? d.e(message) : d;
        }
        if (e.g()) {
            return kbhVar.a(kbgVar, kaaVar);
        }
        kbgVar.a(e, new kaa());
        return new ixf();
    }
}
