package defpackage;

import android.app.Activity;
import android.os.SystemClock;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class enl extends eni implements emk, ekz, ekq {
    volatile eik a;
    public final jpt b;
    public final koe d;
    public final koe e;
    public final erj f;
    public final iee g;
    public final bry h;
    private final Executor j;
    private final emi k;
    private final gzp l;
    private final ekv m;
    private final koe r;
    private final gzp s;
    private final koe t;
    private final koe u;
    private final bry v;
    private final bry w;
    private final AtomicBoolean i = new AtomicBoolean();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicInteger p = new AtomicInteger();
    private final AtomicBoolean q = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);

    public enl(ldt ldtVar, Executor executor, jpt jptVar, gzp gzpVar, bry bryVar, ekv ekvVar, bry bryVar2, koe koeVar, koe koeVar2, koe koeVar3, iee ieeVar, erj erjVar, gzp gzpVar2, koe koeVar4, koe koeVar5, bry bryVar3) {
        this.b = jptVar;
        this.l = gzpVar;
        this.w = bryVar;
        this.m = ekvVar;
        this.v = bryVar2;
        this.k = ldtVar.n(huf.a, jptVar, null);
        this.j = executor;
        this.r = koeVar;
        this.d = koeVar2;
        this.e = koeVar3;
        this.g = ieeVar;
        this.f = erjVar;
        this.s = gzpVar2;
        this.t = koeVar4;
        this.u = koeVar5;
        this.h = bryVar3;
    }

    private final void q(final int i, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        hnu.aN(new htq() { // from class: enj
            @Override // defpackage.htq
            public final hvi a() {
                if (atomicInteger.getAndDecrement() <= 0) {
                    return hve.a;
                }
                int i2 = i;
                enl enlVar = enl.this;
                return enlVar.o(i2, (emz) enlVar.b.b());
            }
        }, this.j);
    }

    @Override // defpackage.ekz
    public final void c(Activity activity) {
        hnu.aN(new cbc(this, 6), this.j);
    }

    @Override // defpackage.ekz
    public final void d(Activity activity) {
        this.a = eik.c(activity.getClass());
    }

    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        this.a = null;
    }

    @Override // defpackage.ekz
    public final void h() {
        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 420, "CrashMetricServiceImpl.java")).s("onActivityCreated");
        if (this.q.getAndSet(true)) {
            return;
        }
        q(4, this.o);
    }

    @Override // defpackage.emk
    public final void k() {
        gzp gzpVar = this.l;
        if (gzpVar.f()) {
            ((ens) ((koe) gzpVar.b()).b()).a();
        }
        this.w.g(this);
        this.m.a(this);
        q(3, this.n);
        hnu.aN(new cbc(this, 5), this.j);
    }

    @Override // defpackage.eni
    public final void l() {
        if (this.i.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new enk(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(23:3|1d|11|(7:13|(3:15|(1:17)|18)(2:66|(3:68|(1:70)|71)(9:72|(2:74|(4:76|(1:78)|79|(3:81|(1:83)|84)(9:85|(10:98|(1:100)|101|(8:102|103|104|105|107|108|110|122)|88|(3:90|(1:92)|93)(3:94|(1:96)|97)|20|(1:22)|23|(19:26|27|28|29|(1:31)(1:61)|32|(1:34)|35|37|(2:40|38)|41|42|(1:46)|47|(2:50|48)|51|(2:54|52)|55|(2:57|58)(1:60)))(0)|87|88|(0)(0)|20|(0)|23|(19:26|27|28|29|(0)(0)|32|(0)|35|37|(1:38)|41|42|(2:44|46)|47|(1:48)|51|(1:52)|55|(0)(0)))))|135|(1:137)|138|20|(0)|23|(0)))|19|20|(0)|23|(0))(1:139)|65|27|28|29|(0)(0)|32|(0)|35|37|(1:38)|41|42|(0)|47|(1:48)|51|(1:52)|55|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x02c0, code lost:
    
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0235 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0248 A[Catch: InterruptedException -> 0x02c0, TRY_ENTER, TryCatch #3 {InterruptedException -> 0x02c0, blocks: (B:28:0x0240, B:31:0x0248, B:32:0x0259, B:34:0x026e, B:35:0x0271, B:61:0x0251), top: B:27:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x026e A[Catch: InterruptedException -> 0x02c0, TryCatch #3 {InterruptedException -> 0x02c0, blocks: (B:28:0x0240, B:31:0x0248, B:32:0x0259, B:34:0x026e, B:35:0x0271, B:61:0x0251), top: B:27:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x02cf A[LOOP:0: B:38:0x02c7->B:40:0x02cf, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x030a A[LOOP:1: B:48:0x02f1->B:50:0x030a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0301 A[LOOP:2: B:52:0x02f9->B:54:0x0301, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0251 A[Catch: InterruptedException -> 0x02c0, TryCatch #3 {InterruptedException -> 0x02c0, blocks: (B:28:0x0240, B:31:0x0248, B:32:0x0259, B:34:0x026e, B:35:0x0271, B:61:0x0251), top: B:27:0x0240 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(lgk lgkVar, eoc eocVar) {
        ekd ekdVar;
        boolean z;
        lgk lgkVar2;
        boolean z2;
        jkj k;
        lgh lghVar;
        IOException iOException;
        FileOutputStream fileOutputStream;
        jkj C;
        int z3;
        emz emzVar = (emz) this.b.b();
        if (!emzVar.b()) {
            return;
        }
        Object obj = ((fwm) ((gzs) this.s).a).b;
        synchronized (obj) {
            if (((WeakHashMap) obj).isEmpty()) {
                ekdVar = ekd.a;
            } else {
                ekdVar = new ekd((ekg[]) ((WeakHashMap) obj).values().toArray(new ekg[0]));
            }
        }
        boolean z4 = true;
        if (n()) {
            iee ieeVar = this.g;
            if (((AtomicBoolean) ieeVar.e).getAndSet(false)) {
                Object obj2 = ieeVar.g;
                jkj k2 = lgh.a.k();
                enp enpVar = (enp) obj2;
                enb enbVar = (enb) enpVar.c.b();
                if (SystemClock.uptimeMillis() - enpVar.d > enbVar.e) {
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lgh lghVar2 = (lgh) k2.b;
                    lghVar2.c = 2;
                    lghVar2.b |= 1;
                    lghVar = (lgh) k2.q();
                } else {
                    hac hacVar = enpVar.a;
                    hac hacVar2 = enpVar.b;
                    gzp gzpVar = (gzp) hacVar.bB();
                    boolean f = gzpVar.f();
                    Object bB = hacVar2.bB();
                    if (f) {
                        gzp gzpVar2 = (gzp) bB;
                        if (gzpVar2.f()) {
                            ena enaVar = new ena((File) gzpVar.b(), (String) gzpVar2.b());
                            int a = enaVar.a();
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            jkp jkpVar = k2.b;
                            lgh lghVar3 = (lgh) jkpVar;
                            lghVar3.b |= 2;
                            lghVar3.d = a;
                            int i = a + 1;
                            if (i >= enbVar.d) {
                                if (!jkpVar.M()) {
                                    k2.t();
                                }
                                lgh lghVar4 = (lgh) k2.b;
                                lghVar4.c = 5;
                                lghVar4.b |= 1;
                                lghVar = (lgh) k2.q();
                            } else {
                                if (enaVar.c()) {
                                    enaVar.b++;
                                    jkj k3 = eng.a.k();
                                    int i2 = enaVar.b;
                                    if (!k3.b.M()) {
                                        k3.t();
                                    }
                                    eng engVar = (eng) k3.b;
                                    engVar.b |= 1;
                                    engVar.c = i2;
                                    eng engVar2 = (eng) k3.q();
                                    boolean z5 = false;
                                    while (true) {
                                        try {
                                            try {
                                                fileOutputStream = new FileOutputStream(enaVar.b());
                                                try {
                                                    engVar2.e(fileOutputStream);
                                                } finally {
                                                    z = z4;
                                                    try {
                                                        fileOutputStream.close();
                                                    } catch (Throwable th) {
                                                        try {
                                                            th.addSuppressed(th);
                                                        } catch (FileNotFoundException unused) {
                                                            if (z5) {
                                                                if (i >= enbVar.c) {
                                                                }
                                                                C = lgkVar.C();
                                                                if (!C.b.M()) {
                                                                }
                                                                lgk lgkVar3 = (lgk) C.b;
                                                                lghVar.getClass();
                                                                lgkVar3.k = lghVar;
                                                                lgkVar3.b |= 2048;
                                                                lgkVar2 = (lgk) C.q();
                                                                z3 = a.z(lghVar.c);
                                                                if (z3 != 0) {
                                                                }
                                                                z2 = false;
                                                                boolean g = fao.g();
                                                                koe koeVar = this.r;
                                                                long j = !g ? ((enn) koeVar.b()).b : ((enn) koeVar.b()).c;
                                                                emi emiVar = this.k;
                                                                eme a2 = emf.a();
                                                                k = lgv.a.k();
                                                                if (!k.b.M()) {
                                                                }
                                                                lgv lgvVar = (lgv) k.b;
                                                                lgkVar2.getClass();
                                                                lgvVar.i = lgkVar2;
                                                                lgvVar.b |= 64;
                                                                a2.f((lgv) k.q());
                                                                a2.g = ekdVar;
                                                                a2.b(emzVar.b);
                                                                a2.g(((Boolean) this.t.b()).booleanValue());
                                                                a2.e(((Long) this.u.b()).intValue());
                                                                a2.e = eocVar;
                                                                emiVar.b(a2.a()).get(j, TimeUnit.MILLISECONDS);
                                                                while (this.n.getAndDecrement() > 0) {
                                                                }
                                                                if (n()) {
                                                                }
                                                                while (this.o.getAndDecrement() > 0) {
                                                                }
                                                                while (this.p.getAndDecrement() > 0) {
                                                                }
                                                                if (z2) {
                                                                }
                                                            } else {
                                                                enaVar.a.mkdirs();
                                                                z4 = z;
                                                            }
                                                        } catch (IOException e) {
                                                            e = e;
                                                            iOException = e;
                                                            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(iOException)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "increment", 'D', "CrashCounter.java")).s("failed to write counter to disk.");
                                                            if (i >= enbVar.c) {
                                                            }
                                                            C = lgkVar.C();
                                                            if (!C.b.M()) {
                                                            }
                                                            lgk lgkVar32 = (lgk) C.b;
                                                            lghVar.getClass();
                                                            lgkVar32.k = lghVar;
                                                            lgkVar32.b |= 2048;
                                                            lgkVar2 = (lgk) C.q();
                                                            z3 = a.z(lghVar.c);
                                                            if (z3 != 0) {
                                                            }
                                                            z2 = false;
                                                            boolean g2 = fao.g();
                                                            koe koeVar2 = this.r;
                                                            long j2 = !g2 ? ((enn) koeVar2.b()).b : ((enn) koeVar2.b()).c;
                                                            emi emiVar2 = this.k;
                                                            eme a22 = emf.a();
                                                            k = lgv.a.k();
                                                            if (!k.b.M()) {
                                                            }
                                                            lgv lgvVar2 = (lgv) k.b;
                                                            lgkVar2.getClass();
                                                            lgvVar2.i = lgkVar2;
                                                            lgvVar2.b |= 64;
                                                            a22.f((lgv) k.q());
                                                            a22.g = ekdVar;
                                                            a22.b(emzVar.b);
                                                            a22.g(((Boolean) this.t.b()).booleanValue());
                                                            a22.e(((Long) this.u.b()).intValue());
                                                            a22.e = eocVar;
                                                            emiVar2.b(a22.a()).get(j2, TimeUnit.MILLISECONDS);
                                                            while (this.n.getAndDecrement() > 0) {
                                                            }
                                                            if (n()) {
                                                            }
                                                            while (this.o.getAndDecrement() > 0) {
                                                            }
                                                            while (this.p.getAndDecrement() > 0) {
                                                            }
                                                            if (z2) {
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (IOException e2) {
                                                e = e2;
                                                z = z4;
                                            }
                                        } catch (FileNotFoundException unused2) {
                                            z = z4;
                                        }
                                        try {
                                            fileOutputStream.close();
                                            break;
                                        } catch (IOException e3) {
                                            iOException = e3;
                                            z = z4;
                                            ((hkf) ((hkf) ((hkf) eiu.a.g()).h(iOException)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashCounter", "increment", 'D', "CrashCounter.java")).s("failed to write counter to disk.");
                                            if (i >= enbVar.c) {
                                            }
                                            C = lgkVar.C();
                                            if (!C.b.M()) {
                                            }
                                            lgk lgkVar322 = (lgk) C.b;
                                            lghVar.getClass();
                                            lgkVar322.k = lghVar;
                                            lgkVar322.b |= 2048;
                                            lgkVar2 = (lgk) C.q();
                                            z3 = a.z(lghVar.c);
                                            if (z3 != 0) {
                                            }
                                            z2 = false;
                                            boolean g22 = fao.g();
                                            koe koeVar22 = this.r;
                                            long j22 = !g22 ? ((enn) koeVar22.b()).b : ((enn) koeVar22.b()).c;
                                            emi emiVar22 = this.k;
                                            eme a222 = emf.a();
                                            k = lgv.a.k();
                                            if (!k.b.M()) {
                                            }
                                            lgv lgvVar22 = (lgv) k.b;
                                            lgkVar2.getClass();
                                            lgvVar22.i = lgkVar2;
                                            lgvVar22.b |= 64;
                                            a222.f((lgv) k.q());
                                            a222.g = ekdVar;
                                            a222.b(emzVar.b);
                                            a222.g(((Boolean) this.t.b()).booleanValue());
                                            a222.e(((Long) this.u.b()).intValue());
                                            a222.e = eocVar;
                                            emiVar22.b(a222.a()).get(j22, TimeUnit.MILLISECONDS);
                                            while (this.n.getAndDecrement() > 0) {
                                            }
                                            if (n()) {
                                            }
                                            while (this.o.getAndDecrement() > 0) {
                                            }
                                            while (this.p.getAndDecrement() > 0) {
                                            }
                                            if (z2) {
                                            }
                                        }
                                        enaVar.a.mkdirs();
                                        z4 = z;
                                    }
                                    if (i >= enbVar.c) {
                                        if (!k2.b.M()) {
                                            k2.t();
                                        }
                                        lgh lghVar5 = (lgh) k2.b;
                                        lghVar5.c = 4;
                                        lghVar5.b |= 1;
                                        lghVar = (lgh) k2.q();
                                    } else {
                                        if (!k2.b.M()) {
                                            k2.t();
                                        }
                                        lgh lghVar6 = (lgh) k2.b;
                                        lghVar6.c = 3;
                                        lghVar6.b |= 1;
                                        lghVar = (lgh) k2.q();
                                    }
                                    C = lgkVar.C();
                                    if (!C.b.M()) {
                                        C.t();
                                    }
                                    lgk lgkVar3222 = (lgk) C.b;
                                    lghVar.getClass();
                                    lgkVar3222.k = lghVar;
                                    lgkVar3222.b |= 2048;
                                    lgkVar2 = (lgk) C.q();
                                    z3 = a.z(lghVar.c);
                                    if (z3 != 0 && z3 == 5) {
                                        z2 = z;
                                        boolean g222 = fao.g();
                                        koe koeVar222 = this.r;
                                        long j222 = !g222 ? ((enn) koeVar222.b()).b : ((enn) koeVar222.b()).c;
                                        emi emiVar222 = this.k;
                                        eme a2222 = emf.a();
                                        k = lgv.a.k();
                                        if (!k.b.M()) {
                                            k.t();
                                        }
                                        lgv lgvVar222 = (lgv) k.b;
                                        lgkVar2.getClass();
                                        lgvVar222.i = lgkVar2;
                                        lgvVar222.b |= 64;
                                        a2222.f((lgv) k.q());
                                        a2222.g = ekdVar;
                                        a2222.b(emzVar.b);
                                        a2222.g(((Boolean) this.t.b()).booleanValue());
                                        a2222.e(((Long) this.u.b()).intValue());
                                        a2222.e = eocVar;
                                        emiVar222.b(a2222.a()).get(j222, TimeUnit.MILLISECONDS);
                                        while (this.n.getAndDecrement() > 0) {
                                            o(3, emzVar);
                                        }
                                        if (n() && !this.c.getAndSet(z)) {
                                            p(6, emzVar, ((enb) this.e.b()).f);
                                        }
                                        while (this.o.getAndDecrement() > 0) {
                                            o(4, emzVar);
                                        }
                                        while (this.p.getAndDecrement() > 0) {
                                            o(5, emzVar);
                                        }
                                        if (z2) {
                                            return;
                                        }
                                        gzp gzpVar3 = emzVar.c;
                                        return;
                                    }
                                }
                                z = z4;
                                if (i >= enbVar.c) {
                                }
                                C = lgkVar.C();
                                if (!C.b.M()) {
                                }
                                lgk lgkVar32222 = (lgk) C.b;
                                lghVar.getClass();
                                lgkVar32222.k = lghVar;
                                lgkVar32222.b |= 2048;
                                lgkVar2 = (lgk) C.q();
                                z3 = a.z(lghVar.c);
                                if (z3 != 0) {
                                    z2 = z;
                                    boolean g2222 = fao.g();
                                    koe koeVar2222 = this.r;
                                    long j2222 = !g2222 ? ((enn) koeVar2222.b()).b : ((enn) koeVar2222.b()).c;
                                    emi emiVar2222 = this.k;
                                    eme a22222 = emf.a();
                                    k = lgv.a.k();
                                    if (!k.b.M()) {
                                    }
                                    lgv lgvVar2222 = (lgv) k.b;
                                    lgkVar2.getClass();
                                    lgvVar2222.i = lgkVar2;
                                    lgvVar2222.b |= 64;
                                    a22222.f((lgv) k.q());
                                    a22222.g = ekdVar;
                                    a22222.b(emzVar.b);
                                    a22222.g(((Boolean) this.t.b()).booleanValue());
                                    a22222.e(((Long) this.u.b()).intValue());
                                    a22222.e = eocVar;
                                    emiVar2222.b(a22222.a()).get(j2222, TimeUnit.MILLISECONDS);
                                    while (this.n.getAndDecrement() > 0) {
                                    }
                                    if (n()) {
                                        p(6, emzVar, ((enb) this.e.b()).f);
                                    }
                                    while (this.o.getAndDecrement() > 0) {
                                    }
                                    while (this.p.getAndDecrement() > 0) {
                                    }
                                    if (z2) {
                                    }
                                }
                            }
                        }
                    }
                    z = true;
                    if (!k2.b.M()) {
                        k2.t();
                    }
                    lgh lghVar7 = (lgh) k2.b;
                    lghVar7.c = 6;
                    lghVar7.b |= 1;
                    lghVar = (lgh) k2.q();
                    C = lgkVar.C();
                    if (!C.b.M()) {
                    }
                    lgk lgkVar322222 = (lgk) C.b;
                    lghVar.getClass();
                    lgkVar322222.k = lghVar;
                    lgkVar322222.b |= 2048;
                    lgkVar2 = (lgk) C.q();
                    z3 = a.z(lghVar.c);
                    if (z3 != 0) {
                    }
                }
            } else {
                jkj k4 = lgh.a.k();
                if (!k4.b.M()) {
                    k4.t();
                }
                lgh lghVar8 = (lgh) k4.b;
                lghVar8.c = 1;
                lghVar8.b |= 1;
                lghVar = (lgh) k4.q();
            }
            z = true;
            C = lgkVar.C();
            if (!C.b.M()) {
            }
            lgk lgkVar3222222 = (lgk) C.b;
            lghVar.getClass();
            lgkVar3222222.k = lghVar;
            lgkVar3222222.b |= 2048;
            lgkVar2 = (lgk) C.q();
            z3 = a.z(lghVar.c);
            if (z3 != 0) {
            }
        } else {
            z = true;
            lgkVar2 = lgkVar;
        }
        z2 = false;
        boolean g22222 = fao.g();
        koe koeVar22222 = this.r;
        long j22222 = !g22222 ? ((enn) koeVar22222.b()).b : ((enn) koeVar22222.b()).c;
        emi emiVar22222 = this.k;
        eme a222222 = emf.a();
        k = lgv.a.k();
        if (!k.b.M()) {
        }
        lgv lgvVar22222 = (lgv) k.b;
        lgkVar2.getClass();
        lgvVar22222.i = lgkVar2;
        lgvVar22222.b |= 64;
        a222222.f((lgv) k.q());
        a222222.g = ekdVar;
        a222222.b(emzVar.b);
        a222222.g(((Boolean) this.t.b()).booleanValue());
        a222222.e(((Long) this.u.b()).intValue());
        a222222.e = eocVar;
        emiVar22222.b(a222222.a()).get(j22222, TimeUnit.MILLISECONDS);
        while (this.n.getAndDecrement() > 0) {
        }
        if (n()) {
        }
        while (this.o.getAndDecrement() > 0) {
        }
        while (this.p.getAndDecrement() > 0) {
        }
        if (z2) {
        }
    }

    public final boolean n() {
        return ((enb) this.e.b()).b;
    }

    public final hvi o(int i, emz emzVar) {
        return p(i, emzVar, emzVar.a / 100.0f);
    }

    public final hvi p(int i, emz emzVar, float f) {
        if (!emzVar.b()) {
            return hve.a;
        }
        if (!this.v.f(f).a()) {
            return hve.a;
        }
        emi emiVar = this.k;
        eme a = emf.a();
        jkj k = lgv.a.k();
        jkj k2 = lgu.a.k();
        float f2 = 1.0f / f;
        if (!k2.b.M()) {
            k2.t();
        }
        int i2 = (int) f2;
        jkp jkpVar = k2.b;
        lgu lguVar = (lgu) jkpVar;
        lguVar.b |= 2;
        lguVar.d = i2;
        if (!jkpVar.M()) {
            k2.t();
        }
        lgu lguVar2 = (lgu) k2.b;
        lguVar2.c = i - 1;
        lguVar2.b |= 1;
        if (!k.b.M()) {
            k.t();
        }
        lgv lgvVar = (lgv) k.b;
        lgu lguVar3 = (lgu) k2.q();
        lguVar3.getClass();
        lgvVar.z = lguVar3;
        lgvVar.b |= 8388608;
        a.f((lgv) k.q());
        return emiVar.b(a.a());
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void b(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void f(int i) {
    }

    @Override // defpackage.ekq
    public final /* synthetic */ void j(eik eikVar) {
    }
}
