package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gcl implements gbr {
    public final koe a;
    private volatile Supplier b = new hbv(1);
    private final iyi c;

    public gcl(koe koeVar, iyi iyiVar) {
        this.a = koeVar;
        this.c = iyiVar;
    }

    @Override // defpackage.gbr, defpackage.gcb
    public final hvi a(WorkerParameters workerParameters) {
        gty aC = hoq.aC(131, "NoAccountWorkerFactory startWork()");
        try {
            iyi iyiVar = this.c;
            cap capVar = new cap(this, aC, workerParameters, 12, null);
            Supplier supplier = this.b;
            Set b = ((jsd) iyiVar.c).b();
            hfk i = hfm.i(b.size());
            Iterator it = b.iterator();
            while (it.hasNext()) {
                i.c(new gct((gka) it.next(), workerParameters, supplier));
            }
            hvi m = ((cka) iyiVar.b).m(capVar, i.g());
            aC.close();
            return m;
        } finally {
        }
    }

    @Override // defpackage.gcb
    public final hvi b(WorkerParameters workerParameters) {
        return ((gbr) this.a.b()).b(workerParameters);
    }

    @Override // defpackage.gcb
    public final void c(Supplier supplier) {
        this.b = supplier;
    }

    @Override // defpackage.gcb
    public final /* synthetic */ void d() {
    }
}
