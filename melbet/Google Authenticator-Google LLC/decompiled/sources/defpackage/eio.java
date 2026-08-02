package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eio implements ein {
    private final koe a;
    private final eiw b;
    private final koe c;
    private final koe d;
    private final koe e;
    private final koe f;
    private final koe g;
    private final ekx h;

    public eio(koe koeVar, eiw eiwVar, koe koeVar2, koe koeVar3, koe koeVar4, koe koeVar5, koe koeVar6, gzp gzpVar, ekx ekxVar) {
        this.a = koeVar;
        this.b = eiwVar;
        this.c = koeVar2;
        this.d = koeVar3;
        this.e = koeVar4;
        this.f = koeVar5;
        this.g = koeVar6;
        this.h = ekxVar;
        if (((Boolean) gzpVar.d(false)).booleanValue()) {
            return;
        }
        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", 115, "PrimesApiImpl.java")).s("Primes instant initialization");
        try {
            hoq.ay();
            Iterator it = ((jsd) koeVar2).b().iterator();
            while (it.hasNext()) {
                ((emk) it.next()).k();
            }
        } catch (RuntimeException e) {
            hkh hkhVar = eiu.a;
            ((hkf) ((hkf) ((hkf) hkhVar.g()).h(e)).i("com/google/android/libraries/performance/primes/PrimesApiImpl", "initializeMetricServices", '{', "PrimesApiImpl.java")).s("Primes failed to initialize");
            eiw eiwVar2 = this.b;
            if (eiwVar2.a) {
                return;
            }
            eiwVar2.a = true;
            ((hkf) ((hkf) hkhVar.b()).i("com/google/android/libraries/performance/primes/Shutdown", "shutdown", 33, "Shutdown.java")).s("Shutdown ...");
        }
    }

    @Override // defpackage.ein
    public final hac a() {
        return new efm(this.a, 20);
    }

    @Override // defpackage.ein
    public final void b() {
        this.h.a();
    }

    @Override // defpackage.ein
    public final void c(eqa eqaVar) {
        ((eqe) this.f).b().a(eqaVar);
    }

    @Override // defpackage.ein
    public final void d() {
        ((epq) this.e.b()).a();
    }

    @Override // defpackage.ein
    public final boolean e() {
        return ((eii) this.d).b().b();
    }

    @Override // defpackage.ein
    public final void f(eik eikVar, long j, long j2) {
        final eqz b = ((equ) this.g).b();
        final eqx eqxVar = new eqx(j, j2);
        emi emiVar = b.a;
        final String str = eikVar.a;
        final eru a = emiVar.a(str);
        int H = a.H(emiVar.c.a.b.e);
        if (H == 0) {
            H = 1;
        }
        final int i = H;
        if (a.e()) {
            hvi hviVar = hve.a;
        } else {
            hnu.aN(new htq() { // from class: eqy
                @Override // defpackage.htq
                public final hvi a() {
                    long j3;
                    long j4;
                    eqz eqzVar = eqz.this;
                    if (!((erl) eqzVar.e.bB()).a()) {
                        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/timer/TimerMetricServiceImpl", "recordSystemHealthMetricInBackground", 417, "TimerMetricServiceImpl.java")).s("TimerMetric not recorded, metric was rejected by sampling configuration.");
                        return hve.a;
                    }
                    eqx eqxVar2 = eqxVar;
                    eru eruVar = a;
                    gzp gzpVar = ((eqw) eqzVar.c.b()).b;
                    eme a2 = emf.a();
                    a2.c(true);
                    a2.d = eruVar;
                    gzp gzpVar2 = (gzp) eqzVar.d.b();
                    jkj k = lgv.a.k();
                    boolean booleanValue = ((Boolean) gzpVar2.a(new esh(1)).d(false)).booleanValue();
                    jkj k2 = lgw.a.k();
                    if (booleanValue) {
                        emr emrVar = eqxVar2.a;
                        ems emsVar = emrVar.a;
                        j3 = emrVar.b.b;
                        j4 = emsVar.b;
                    } else {
                        emr emrVar2 = eqxVar2.a;
                        ems emsVar2 = emrVar2.a;
                        j3 = emrVar2.b.a;
                        j4 = emsVar2.a;
                    }
                    long j5 = j3 - j4;
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lgw lgwVar = (lgw) k2.b;
                    lgwVar.b |= 1;
                    lgwVar.c = j5;
                    lgw lgwVar2 = (lgw) k2.q();
                    if (!k.b.M()) {
                        k.t();
                    }
                    String str2 = str;
                    lgv lgvVar = (lgv) k.b;
                    lgwVar2.getClass();
                    lgvVar.g = lgwVar2;
                    lgvVar.b |= 16;
                    a2.f((lgv) k.q());
                    a2.a = str2;
                    a2.b = null;
                    if (((Boolean) eqzVar.f.b()).booleanValue()) {
                        a2.h = i;
                    }
                    return eqzVar.a.b(a2.a());
                }
            }, b.b);
        }
    }

    @Override // defpackage.ein
    public final void g(eik eikVar) {
        ((epq) this.e.b()).b(eikVar);
    }
}
