package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class grg implements gqu {
    public static final hkh a = hkh.l("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler");
    public final gzp b;
    public final grq c;
    public final ghf d;
    private final gqw e;
    private final Executor f;
    private final Boolean g;
    private final Boolean h;

    public grg(ghf ghfVar, gqw gqwVar, Executor executor, grq grqVar, gzp gzpVar, Boolean bool, gzp gzpVar2) {
        this.d = ghfVar;
        this.e = gqwVar;
        this.f = executor;
        this.c = grqVar;
        this.g = (Boolean) gzpVar.d(false);
        this.h = bool;
        this.b = gzpVar2;
    }

    @Override // defpackage.gqu
    public final hvi a(Set set, long j, Map map) {
        if (!this.h.booleanValue()) {
            return hve.a;
        }
        ((hkf) ((hkf) a.e()).i("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerOneTimeScheduler", "scheduleNextSyncSystemWakeup", 94, "SyncWorkManagerOneTimeScheduler.java")).s("Scheduling next onetime WorkManager workers");
        return hti.g(this.e.a(set, j, map), gvx.c(new gjt(this, 5)), this.f);
    }

    public final gzp b() {
        return this.g.booleanValue() ? gzp.h(hoq.aT()) : gyf.a;
    }
}
