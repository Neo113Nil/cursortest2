package defpackage;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcp implements khl, kdh {
    public static final Logger a = Logger.getLogger(kcp.class.getName());
    public final kca b;
    public final kdi c;
    private final kjm d;
    private final kjm e;
    private final hel f;
    private final kcf g;
    private klz h;
    private ScheduledExecutorService i;
    private Executor j;
    private boolean k;
    private final kee l;
    private final ixa m;

    public kcp(kcn kcnVar) {
        kca kcaVar = kcnVar.a;
        kcaVar.getClass();
        this.b = kcaVar;
        kjm kjmVar = kcnVar.c;
        kjmVar.getClass();
        this.e = kjmVar;
        this.d = kcnVar.d;
        List list = kcnVar.b;
        list.getClass();
        this.f = hel.o(list);
        kuq kuqVar = kcnVar.g;
        kuqVar.getClass();
        this.l = new kee(kuqVar, null);
        this.g = kcnVar.e;
        this.m = kcnVar.f;
        this.c = new kdi(this);
    }

    @Override // defpackage.kdh
    public final synchronized boolean a(int i, Parcel parcel) {
        IBinder readStrongBinder;
        if (i == 1) {
            if (this.k) {
                kco.a.a(1, parcel);
                return false;
            }
            if (parcel.readInt() > 0 && (readStrongBinder = parcel.readStrongBinder()) != null) {
                int callingUid = Binder.getCallingUid();
                jwt jwtVar = jwt.a;
                kdw kdwVar = new kdw(jwt.a);
                kca kcaVar = this.b;
                kdwVar.c(jye.b, kcaVar);
                kdwVar.c(jye.a, new kcz(callingUid));
                kdwVar.c(kcs.c, Integer.valueOf(callingUid));
                jws jwsVar = kcs.d;
                Intent intent = kcaVar.a;
                kdwVar.c(jwsVar, intent.getPackage() != null ? intent.getPackage() : intent.getComponent().getPackageName());
                kdwVar.c(kcs.e, this.g);
                kee keeVar = this.l;
                Executor executor = this.j;
                executor.getClass();
                kdwVar.c(kcw.a, new gva(callingUid, keeVar, executor));
                kdwVar.c(kgy.a, kbe.c);
                kcq kcqVar = new kcq(this.d, kdwVar.a(), this.f);
                synchronized (kcqVar) {
                    ScheduledExecutorService scheduledExecutorService = kcqVar.g;
                    Logger logger = kdo.a;
                    kdo kdmVar = readStrongBinder instanceof Binder ? new kdm(readStrongBinder, scheduledExecutorService) : new kdn(readStrongBinder);
                    kcqVar.m = kdmVar;
                    try {
                        kdmVar.b.linkToDeath(kcqVar, 0);
                    } catch (RemoteException unused) {
                    }
                }
                klz klzVar = this.h;
                synchronized (klzVar) {
                    hoq.I(!((kcm) klzVar).b, "Illegal transportCreated() after serverShutdown()");
                    ((kcm) klzVar).c++;
                }
                klz klzVar2 = ((kcm) klzVar).a;
                klw klwVar = ((klr) klzVar2).a;
                synchronized (klwVar.p) {
                    klwVar.r.add(kcqVar);
                }
                klv klvVar = new klv(((klr) klzVar2).a, kcqVar);
                klw klwVar2 = klvVar.b;
                long j = klwVar2.j;
                if (j != Long.MAX_VALUE) {
                    klvVar.a = klvVar.c.g.schedule(new kkh(klvVar, 7), j, TimeUnit.MILLISECONDS);
                } else {
                    klvVar.a = new FutureTask(new cov(17), null);
                }
                jyl.b((jyk) klwVar2.u.f.get(Long.valueOf(jyl.a(klwVar2))), klvVar.c);
                kcqVar.g(new kcl((kcm) klzVar, klvVar));
                return true;
            }
        }
        return false;
    }

    public final synchronized void b() {
        this.e.b(this.j);
        this.j = null;
    }

    @Override // defpackage.khl
    public final synchronized void c() {
        Runnable a2;
        if (this.k) {
            return;
        }
        this.k = true;
        this.c.a = kco.a;
        klz klzVar = this.h;
        klz klzVar2 = ((kcm) klzVar).a;
        klw klwVar = ((klr) klzVar2).a;
        synchronized (klwVar.p) {
            if (!klwVar.n) {
                ArrayList arrayList = new ArrayList(klwVar.r);
                kbq kbqVar = klwVar.m;
                klwVar.n = true;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    kcq kcqVar = (kcq) arrayList.get(i);
                    if (kbqVar == null) {
                        kcqVar.e();
                    } else {
                        kcqVar.f(kbqVar);
                    }
                }
                klw klwVar2 = ((klr) klzVar2).a;
                synchronized (klwVar2.p) {
                    klwVar2.q = true;
                    klwVar2.a();
                }
            }
        }
        synchronized (klzVar) {
            ((kcm) klzVar).b = true;
            a2 = ((kcm) klzVar).a();
        }
        if (a2 != null) {
            a2.run();
        }
        this.d.b(this.i);
        this.i = null;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.khl
    public final synchronized void d(klz klzVar) {
        this.h = new kcm(klzVar, new iaq(this, 12));
        this.i = (ScheduledExecutorService) this.d.a();
        this.j = this.e.a();
    }

    public final String toString() {
        return "BinderServer[" + this.b.toString() + "]";
    }
}
