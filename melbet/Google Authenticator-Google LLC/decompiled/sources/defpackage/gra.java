package defpackage;

import androidx.work.WorkerParameters;
import j$.time.Duration;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gra implements gbr {
    public final ScheduledExecutorService a;
    public final ghf b;
    private final gqc c;
    private final gqu d;
    private final boolean e;
    private final boolean f;
    private final grq g;

    public gra(gqc gqcVar, ghf ghfVar, gqu gquVar, ScheduledExecutorService scheduledExecutorService, grq grqVar, gzp gzpVar, boolean z) {
        this.c = gqcVar;
        this.b = ghfVar;
        this.d = gquVar;
        this.a = scheduledExecutorService;
        this.g = grqVar;
        this.f = ((Boolean) gzpVar.d(false)).booleanValue();
        this.e = z;
    }

    @Override // defpackage.gbr, defpackage.gcb
    public final hvi a(WorkerParameters workerParameters) {
        if (!this.e) {
            return hnu.aJ(new aso());
        }
        if (!(this.d instanceof grg)) {
            return hti.g(this.c.a(), gvx.c(new gja(this, workerParameters, 7)), this.a);
        }
        boolean z = this.f;
        gqc gqcVar = this.c;
        hvi aP = z ? hnu.aP(gqcVar.b(), Duration.ofMinutes(10L), this.a) : gqcVar.b();
        grq grqVar = this.g;
        fxn fxnVar = new fxn(17);
        huf hufVar = huf.a;
        hvi b = grqVar.b(hti.f(aP, fxnVar, hufVar), 1, workerParameters);
        return z ? hoq.ao(b, TimeoutException.class, new fxn(18), hufVar) : b;
    }

    @Override // defpackage.gcb
    public final /* synthetic */ hvi b(WorkerParameters workerParameters) {
        return hnu.bJ();
    }

    @Override // defpackage.gcb
    public final /* synthetic */ void d() {
    }

    @Override // defpackage.gcb
    public final /* synthetic */ void c(Supplier supplier) {
    }
}
