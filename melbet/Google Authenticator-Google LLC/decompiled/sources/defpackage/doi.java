package defpackage;

import androidx.work.WorkerParameters;
import j$.time.Duration;
import j$.time.Instant;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class doi implements htr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ doi(int i, WorkerParameters workerParameters, int i2) {
        this.c = i2;
        this.a = i;
        this.b = workerParameters;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r12v13, types: [fbz, java.lang.Object] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        String str;
        int i = this.c;
        if (i == 0) {
            dop dopVar = (dop) obj;
            boolean h = dok.h(dopVar);
            Object obj2 = this.b;
            if (!h || !dok.g(dopVar)) {
                return hnu.aJ(((dok) obj2).a());
            }
            fwm fwmVar = ((dok) obj2).e;
            doo dooVar = dopVar.c;
            if (dooVar == null) {
                dooVar = doo.a;
            }
            gwu g = gwu.g(fwmVar.L(dooVar, this.a));
            cvr cvrVar = new cvr(18);
            huf hufVar = huf.a;
            return g.h(cvrVar, hufVar).d(Exception.class, new cvr(12), hufVar).i(new bpg(obj2, dopVar, 20), hufVar);
        }
        if (i == 1) {
            dop dopVar2 = (dop) obj;
            if (!dok.i(dopVar2)) {
                return hnu.aI(new doh());
            }
            Object obj3 = this.b;
            doo dooVar2 = dopVar2.c;
            if (dooVar2 == null) {
                dooVar2 = doo.a;
            }
            return ((dok) obj3).e.L(dooVar2, this.a);
        }
        if (i == 2) {
            jkj k = fxd.a.k();
            int i2 = this.a;
            int i3 = i2 == -1 ? 1 : i2 + 1;
            if (!k.b.M()) {
                k.t();
            }
            ?? r12 = this.b;
            fxd fxdVar = (fxd) k.b;
            fxdVar.b = 1 | fxdVar.b;
            fxdVar.c = i3;
            return r12.a(hnu.aJ((fxd) k.q()));
        }
        if (i == 3) {
            return ((gbc) this.b).d(this.a);
        }
        final ldt ldtVar = (ldt) obj;
        WorkerParameters workerParameters = (WorkerParameters) this.b;
        asa asaVar = workerParameters.b;
        if (!ldtVar.e() || !asaVar.a().containsKey("scheduled_execution_time_epoch_millis") || !asaVar.a().containsKey("worker_enqueue_time_epoch_millis")) {
            return hve.a;
        }
        final long c = asaVar.c("scheduled_execution_time_epoch_millis");
        final long c2 = asaVar.c("worker_enqueue_time_epoch_millis");
        final long epochMilli = Instant.now().toEpochMilli();
        Iterator it = workerParameters.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "none";
                break;
            }
            String str2 = (String) it.next();
            if (str2.startsWith("sync_constraint:")) {
                str = str2.substring(16);
                break;
            }
        }
        final String str3 = str;
        final int i4 = this.a;
        return hti.f(((gnp) ((gzs) ldtVar.a).a).a(), gvx.a(new gzf() { // from class: grx
            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object, koe] */
            @Override // defpackage.gzf
            public final Object a(Object obj4) {
                if (!((Boolean) obj4).booleanValue()) {
                    return null;
                }
                long j = epochMilli;
                String str4 = str3;
                int i5 = i4;
                long j2 = c2;
                long j3 = c;
                ldt ldtVar2 = ldt.this;
                ?? r9 = ((gzs) ldtVar2.c).a;
                goh gohVar = (goh) r9.b();
                double a = hsj.a(Duration.ofMillis(j3 - j2));
                ikj ikjVar = (ikj) ldtVar2.b;
                Object obj5 = ikjVar.b;
                Object obj6 = ikjVar.a;
                ((fdx) gohVar.d.bB()).b(a, obj5, obj6, hoq.aQ(i5).toLowerCase(Locale.US), str4);
                goh gohVar2 = (goh) r9.b();
                ((fdx) gohVar2.e.bB()).b(hsj.a(Duration.ofMillis(j - j2)), obj5, obj6, hoq.aQ(i5).toLowerCase(Locale.US), str4);
                return null;
            }
        }), ldtVar.d);
    }

    public /* synthetic */ doi(Object obj, int i, int i2) {
        this.c = i2;
        this.b = obj;
        this.a = i;
    }
}
