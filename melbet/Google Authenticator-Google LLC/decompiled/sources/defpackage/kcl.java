package defpackage;

import java.util.Iterator;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kcl implements kmc {
    public final kmc a;
    final /* synthetic */ kcm b;

    public kcl(kcm kcmVar, kmc kmcVar) {
        this.b = kcmVar;
        this.a = kmcVar;
    }

    @Override // defpackage.kmc
    public final void a() {
        Runnable a;
        klv klvVar = (klv) this.a;
        Future future = klvVar.a;
        if (future != null) {
            future.cancel(false);
            klvVar.a = null;
        }
        klw klwVar = klvVar.b;
        Iterator it = klwVar.h.iterator();
        if (it.hasNext()) {
            throw null;
        }
        kcq kcqVar = klvVar.c;
        synchronized (klwVar.p) {
            if (!klwVar.r.remove(kcqVar)) {
                throw new AssertionError("Transport already removed");
            }
            jyl.c((jyk) klwVar.u.f.get(Long.valueOf(jyl.a(klwVar))), kcqVar);
            klwVar.a();
        }
        kcm kcmVar = this.b;
        synchronized (kcmVar) {
            kcmVar.c--;
            a = kcmVar.a();
        }
        if (a != null) {
            a.run();
        }
    }
}
