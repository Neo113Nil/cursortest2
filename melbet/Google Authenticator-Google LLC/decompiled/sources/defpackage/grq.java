package defpackage;

import androidx.work.WorkerParameters;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grq {
    private static final hkh c = hkh.l("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl");
    public final koe a;
    public final cka b;
    private final koe d;
    private final koe e;

    public grq(cka ckaVar, koe koeVar, koe koeVar2, koe koeVar3) {
        this.b = ckaVar;
        this.d = koeVar;
        this.a = koeVar2;
        this.e = koeVar3;
    }

    public final hvi a(hvi hviVar, htr htrVar) {
        Set set = (Set) this.d.b();
        hfk i = hfm.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i.c(new gjk(htrVar, (ldt) it.next(), 3));
        }
        return this.b.m(new fxs(hviVar, 19), i.g());
    }

    public final hvi b(hvi hviVar, int i, WorkerParameters workerParameters) {
        doi doiVar = new doi(i, workerParameters, 4);
        Set set = (Set) this.e.b();
        hfk i2 = hfm.i(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            i2.c(new gjk(doiVar, (ldt) it.next(), 4));
        }
        return this.b.m(new fxs(hviVar, 18), i2.g());
    }

    public final void c(Instant instant, brn brnVar) {
        Iterator it = ((Set) this.e.b()).iterator();
        while (it.hasNext()) {
            try {
                if (((ldt) it.next()).e()) {
                    long epochMilli = Instant.now().toEpochMilli();
                    brnVar.B("scheduled_execution_time_epoch_millis", instant.toEpochMilli());
                    brnVar.B("worker_enqueue_time_epoch_millis", epochMilli);
                }
            } catch (RuntimeException e) {
                ((hkf) ((hkf) ((hkf) c.f()).h(e)).i("com/google/apps/tiktok/sync/monitoring/SyncMonitoringDispatcherImpl", "reportWorkerScheduled", (char) 130, "SyncMonitoringDispatcherImpl.java")).s("SyncWorkerMonitor failed during onWorkerSchedule.");
            }
        }
    }
}
