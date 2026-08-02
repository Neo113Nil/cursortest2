package defpackage;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gri implements gqu {
    public static final hkh a = hkh.l("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler");
    public final Executor b;
    public final gzp c;
    public final gzp d;
    public final grq e;
    public final ghf f;
    private final gqw g;
    private final Boolean h;
    private final Boolean i;

    static {
        new gby(1L, TimeUnit.DAYS);
    }

    public gri(ghf ghfVar, gqw gqwVar, Executor executor, grq grqVar, gzp gzpVar, Boolean bool, gzp gzpVar2, gzp gzpVar3) {
        this.f = ghfVar;
        this.g = gqwVar;
        this.b = executor;
        this.e = grqVar;
        this.h = (Boolean) gzpVar.d(false);
        this.i = bool;
        this.c = gzpVar2;
        this.d = gzpVar3;
    }

    public static ary b(Set set) {
        arw arwVar = new arw();
        arwVar.a = set.contains(gps.ON_CHARGER);
        if (set.contains(gps.ON_NETWORK_UNMETERED)) {
            arwVar.b(3);
        } else if (set.contains(gps.ON_NETWORK_CONNECTED)) {
            arwVar.b(2);
        }
        return arwVar.a();
    }

    public static String d(ary aryVar, gzp gzpVar) {
        StringBuilder sb = new StringBuilder(hnu.bK("SyncPeriodicTask", gzpVar));
        if (aryVar.c) {
            sb.append("_charging");
        }
        int i = aryVar.j;
        if (i == 3) {
            sb.append("_unmetered");
        } else if (i == 2) {
            sb.append("_connected");
        }
        return sb.toString();
    }

    @Override // defpackage.gqu
    public final hvi a(Set set, long j, Map map) {
        if (!this.i.booleanValue()) {
            return hve.a;
        }
        ((hkf) ((hkf) a.e()).i("com/google/apps/tiktok/sync/impl/workmanager/SyncWorkManagerPeriodicScheduler", "scheduleNextSyncSystemWakeup", 105, "SyncWorkManagerPeriodicScheduler.java")).s("Scheduling next periodic WorkManager workers");
        return hti.g(this.g.a(set, j, map), gvx.c(new gjt(this, 6)), this.b);
    }

    public final gzp c() {
        return this.h.booleanValue() ? gzp.h(hoq.aT()) : gyf.a;
    }
}
