package defpackage;

import androidx.work.WorkerParameters;
import j$.time.Duration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grd implements gbr {
    public static final hkh a = hkh.l("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker");
    public final gqu b;
    public final ScheduledExecutorService c;
    public final ghf d;
    public final fwm e;
    private final gqc f;
    private final boolean g;
    private final boolean h;
    private final grq i;

    public grd(gqc gqcVar, ghf ghfVar, gqu gquVar, ScheduledExecutorService scheduledExecutorService, fwm fwmVar, grq grqVar, gzp gzpVar, boolean z) {
        this.f = gqcVar;
        this.d = ghfVar;
        this.b = gquVar;
        this.c = scheduledExecutorService;
        this.e = fwmVar;
        this.i = grqVar;
        this.h = ((Boolean) gzpVar.d(false)).booleanValue();
        this.g = z;
    }

    public static String f(gzp gzpVar) {
        return "com.google.apps.tiktok.sync.impl.workmanager.SyncPeriodicWorker".concat(String.valueOf(gzpVar.f() ? String.format("_proc<%s>", gzpVar.b()) : ""));
    }

    @Override // defpackage.gbr, defpackage.gcb
    public final hvi a(WorkerParameters workerParameters) {
        if (!this.g) {
            return e(workerParameters);
        }
        if (!(this.b instanceof gri)) {
            return hoq.au(this.f.a(), gvx.c(new gja(this, workerParameters, 10)), this.c);
        }
        boolean z = this.h;
        gqc gqcVar = this.f;
        hvi au = hoq.au(z ? hnu.aP(gqcVar.b(), Duration.ofMinutes(10L), this.c) : gqcVar.b(), new gja(this, workerParameters, 9), this.c);
        grq grqVar = this.i;
        fxn fxnVar = new fxn(19);
        huf hufVar = huf.a;
        return hoq.ao(grqVar.b(hti.f(au, fxnVar, hufVar), 2, workerParameters), Throwable.class, new fxn(20), hufVar);
    }

    @Override // defpackage.gcb
    public final /* synthetic */ hvi b(WorkerParameters workerParameters) {
        return hnu.bJ();
    }

    public final hvi e(WorkerParameters workerParameters) {
        Set set = workerParameters.c;
        bwt bwtVar = new bwt(10);
        Iterator it = set.iterator();
        it.getClass();
        while (it.hasNext()) {
            Object next = it.next();
            if (bwtVar.a(next)) {
                return hnu.bL(hoq.au(this.d.d((String) next), new gja(this, workerParameters, 8), this.c), new bws(14), huf.a);
            }
        }
        throw new NoSuchElementException();
    }

    @Override // defpackage.gcb
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.gcb
    public final /* synthetic */ void c(Supplier supplier) {
    }
}
