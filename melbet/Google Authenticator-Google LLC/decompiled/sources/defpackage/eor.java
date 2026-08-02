package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eor implements ekz {
    public boolean a = false;
    public Activity b;
    private final jpt c;

    public eor(jpt jptVar, gzp gzpVar, Executor executor) {
        this.c = jptVar;
        executor.execute(new drn(this, gzpVar, 16));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v14, types: [java.lang.Object, jpt] */
    /* JADX WARN: Type inference failed for: r7v22, types: [java.lang.Object, jpt] */
    @Override // defpackage.ekz
    public final synchronized void b(Activity activity) {
        eov eovVar;
        boolean isEnabled;
        int i;
        lgs lgsVar;
        if (this.a) {
            eou eouVar = (eou) this.c.b();
            epd a = epd.a(activity);
            gyf gyfVar = gyf.a;
            eox eoxVar = new eox(a, gyfVar, gyfVar, gyfVar, gyfVar);
            ert ertVar = eouVar.d.c;
            boolean z = ertVar.b;
            ery eryVar = ertVar.a;
            if (z && eryVar.a) {
                ArrayMap arrayMap = eouVar.c;
                synchronized (arrayMap) {
                    eovVar = (eov) arrayMap.remove(eoxVar.a);
                    if (arrayMap.isEmpty()) {
                        eouVar.b.j();
                    }
                }
                if (eovVar == null) {
                    ((hkf) ((hkf) eiu.a.e()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "stopAsFuture", 213, "FrameMetricServiceImpl.java")).u("Measurement not found: %s", new ekn(eoxVar.a.a));
                    hvi hviVar = hve.a;
                } else {
                    epa epaVar = eouVar.f;
                    epd epdVar = eoxVar.a;
                    String b = epdVar.b();
                    int i2 = 0;
                    int i3 = 1;
                    if (Build.VERSION.SDK_INT >= 29) {
                        isEnabled = Trace.isEnabled();
                        if (isEnabled) {
                            Trace.endAsyncSection(String.format("J<%s>", b), 352691800);
                            for (epe epeVar : ((epf) epaVar.a.b()).c) {
                                int C = a.C(epeVar.b);
                                if (C == 0) {
                                    C = i3;
                                }
                                switch (C - 1) {
                                    case 1:
                                        i = 0;
                                        break;
                                    case 2:
                                        i = eovVar.f;
                                        break;
                                    case 3:
                                        i = eovVar.h;
                                        break;
                                    case 4:
                                        i = eovVar.i;
                                        break;
                                    case 5:
                                        i = eovVar.j;
                                        break;
                                    case 6:
                                        i = eovVar.k;
                                        break;
                                    case 7:
                                        i = eovVar.m;
                                        break;
                                    default:
                                        ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/jank/JankPerfettoTrigger", "endTraceSectionAndEmitCounters", 190, "JankPerfettoTrigger.java")).u("UNKNOWN COUNTER with %s as the name", epeVar.c);
                                        i3 = i3;
                                        continue;
                                }
                                Trace.setCounter(epeVar.c.replace("%EVENT_NAME%", b), i);
                            }
                        }
                    }
                    boolean z2 = i3;
                    if (eovVar.h == 0) {
                        hvi hviVar2 = hve.a;
                    } else {
                        koe koeVar = epaVar.a;
                        if (((epf) koeVar.b()).d) {
                            TimeUnit timeUnit = TimeUnit.SECONDS;
                            Long l = 9000L;
                            l.getClass();
                            if (eovVar.m <= 9000 && eovVar.f != 0) {
                                emt emtVar = (emt) epaVar.b.b();
                                String replace = ((epf) koeVar.b()).b.replace("%PACKAGE_NAME%", ((Context) epaVar.d).getPackageName());
                                replace.getClass();
                                emtVar.a(replace);
                            }
                        }
                        long elapsedRealtime = SystemClock.elapsedRealtime() - eovVar.c;
                        jkl jklVar = (jkl) lgo.a.k();
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        lgo lgoVar = (lgo) jklVar.b;
                        lgoVar.b |= 16;
                        lgoVar.g = ((int) elapsedRealtime) + 1;
                        int i4 = eovVar.f;
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        lgo lgoVar2 = (lgo) jklVar.b;
                        lgoVar2.b |= 1;
                        lgoVar2.c = i4;
                        int i5 = eovVar.h;
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        lgo lgoVar3 = (lgo) jklVar.b;
                        lgoVar3.b |= 2;
                        lgoVar3.d = i5;
                        int i6 = eovVar.i;
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        lgo lgoVar4 = (lgo) jklVar.b;
                        lgoVar4.b |= 4;
                        lgoVar4.e = i6;
                        int i7 = eovVar.k;
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        lgo lgoVar5 = (lgo) jklVar.b;
                        lgoVar5.b |= 32;
                        lgoVar5.h = i7;
                        int i8 = eovVar.m;
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        lgo lgoVar6 = (lgo) jklVar.b;
                        lgoVar6.b |= 64;
                        lgoVar6.i = i8;
                        int i9 = eovVar.j;
                        if (!jklVar.b.M()) {
                            jklVar.t();
                        }
                        lgo lgoVar7 = (lgo) jklVar.b;
                        lgoVar7.b |= 8;
                        lgoVar7.f = i9;
                        if (eovVar.o && !eovVar.p) {
                            long j = eovVar.q / 1000000;
                            if (!jklVar.b.M()) {
                                jklVar.t();
                            }
                            lgo lgoVar8 = (lgo) jklVar.b;
                            lgoVar8.b |= 4096;
                            lgoVar8.q = (int) j;
                        }
                        int i10 = eovVar.n;
                        if (i10 != Integer.MIN_VALUE) {
                            int[] iArr = eovVar.e;
                            int[] iArr2 = eov.b;
                            jkj k = lgs.a.k();
                            int i11 = 0;
                            while (true) {
                                if (i11 >= 52) {
                                    if (iArr[51] > 0) {
                                        k.ag(i10 + 1);
                                        k.ah(0);
                                    }
                                    lgsVar = (lgs) k.q();
                                } else if (iArr2[i11] > i10) {
                                    k.ah(0);
                                    k.ag(i10 + 1);
                                    lgsVar = (lgs) k.q();
                                } else {
                                    int i12 = iArr[i11];
                                    if (i12 > 0 || (i11 > 0 && iArr[i11 - 1] > 0)) {
                                        k.ah(i12);
                                        k.ag(iArr2[i11]);
                                    }
                                    i11++;
                                }
                            }
                            if (!jklVar.b.M()) {
                                jklVar.t();
                            }
                            lgo lgoVar9 = (lgo) jklVar.b;
                            lgsVar.getClass();
                            lgoVar9.p = lgsVar;
                            lgoVar9.b |= 2048;
                            int i13 = eovVar.g;
                            if (!jklVar.b.M()) {
                                jklVar.t();
                            }
                            lgo lgoVar10 = (lgo) jklVar.b;
                            lgoVar10.b |= 512;
                            lgoVar10.n = i13;
                            int i14 = eovVar.l;
                            if (!jklVar.b.M()) {
                                jklVar.t();
                            }
                            lgo lgoVar11 = (lgo) jklVar.b;
                            lgoVar11.b |= 1024;
                            lgoVar11.o = i14;
                        }
                        while (i2 < 29) {
                            int i15 = i2 + 1;
                            int[] iArr3 = eovVar.d;
                            if (iArr3[i2] > 0) {
                                jkj k2 = lgn.a.k();
                                int i16 = iArr3[i2];
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                jkp jkpVar = k2.b;
                                lgn lgnVar = (lgn) jkpVar;
                                lgnVar.b |= 1;
                                lgnVar.c = i16;
                                int[] iArr4 = eov.a;
                                int i17 = iArr4[i2];
                                if (!jkpVar.M()) {
                                    k2.t();
                                }
                                jkp jkpVar2 = k2.b;
                                lgn lgnVar2 = (lgn) jkpVar2;
                                lgnVar2.b |= 2;
                                lgnVar2.d = i17;
                                if (i15 < 29) {
                                    int i18 = iArr4[i15] - 1;
                                    if (!jkpVar2.M()) {
                                        k2.t();
                                    }
                                    lgn lgnVar3 = (lgn) k2.b;
                                    lgnVar3.b |= 4;
                                    lgnVar3.e = i18;
                                }
                                if (!jklVar.b.M()) {
                                    jklVar.t();
                                }
                                lgo lgoVar12 = (lgo) jklVar.b;
                                lgn lgnVar4 = (lgn) k2.q();
                                lgnVar4.getClass();
                                jkx jkxVar = lgoVar12.k;
                                if (!jkxVar.c()) {
                                    lgoVar12.k = jkp.A(jkxVar);
                                }
                                lgoVar12.k.add(lgnVar4);
                            }
                            i2 = i15;
                        }
                        jkl jklVar2 = (jkl) ((lgo) jklVar.q()).C();
                        gzp l2 = eos.l(eouVar.a);
                        if (l2.f()) {
                            int intValue = ((Float) l2.b()).intValue();
                            if (!jklVar2.b.M()) {
                                jklVar2.t();
                            }
                            lgo lgoVar13 = (lgo) jklVar2.b;
                            lgoVar13.b |= 256;
                            lgoVar13.m = intValue;
                        }
                        emi emiVar = eouVar.d;
                        lgo lgoVar14 = (lgo) jklVar2.q();
                        eme a2 = emf.a();
                        jkj k3 = lgv.a.k();
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        lgv lgvVar = (lgv) k3.b;
                        lgoVar14.getClass();
                        lgvVar.l = lgoVar14;
                        lgvVar.b |= 512;
                        a2.f((lgv) k3.q());
                        a2.b = null;
                        a2.c = "Activity";
                        a2.a = epdVar.b();
                        a2.c(z2);
                        emiVar.b(a2.a());
                    }
                }
            } else {
                hvi hviVar3 = hve.a;
            }
        } else if (!activity.equals(this.b)) {
            ((hkf) ((hkf) eiu.a.b()).i("com/google/android/libraries/performance/primes/metrics/jank/ActivityLevelJankMonitor", "onActivityPaused", 86, "ActivityLevelJankMonitor.java")).w("Activity mismatch (currentActivity=%s, activity=%s)", this.b, activity);
        }
        this.b = null;
    }

    @Override // defpackage.ekz
    public final synchronized void c(Activity activity) {
        boolean isEnabled;
        if (!this.a) {
            this.b = activity;
            return;
        }
        eou eouVar = (eou) this.c.b();
        epd a = epd.a(activity);
        if (eouVar.d.c(a.b())) {
            ArrayMap arrayMap = eouVar.c;
            synchronized (arrayMap) {
                if (arrayMap.size() >= 25) {
                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 156, "FrameMetricServiceImpl.java")).u("Too many concurrent measurements, ignoring %s", a);
                    return;
                }
                eov b = ((eow) eouVar.e).b();
                eov eovVar = (eov) arrayMap.put(a, b);
                if (eovVar != null) {
                    arrayMap.put(a, eovVar);
                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/jank/FrameMetricServiceImpl", "start", 170, "FrameMetricServiceImpl.java")).u("measurement already started: %s", a);
                    return;
                }
                gzp gzpVar = eouVar.g;
                if (gzpVar.f() && ((epg) gzpVar.b()).a()) {
                    b.o = true;
                }
                if (arrayMap.size() == 1) {
                    eouVar.b.g();
                }
                epa epaVar = eouVar.f;
                String b2 = a.b();
                if (Build.VERSION.SDK_INT >= 29) {
                    isEnabled = Trace.isEnabled();
                    if (isEnabled) {
                        Trace.beginAsyncSection(String.format("J<%s>", b2), 352691800);
                    }
                }
            }
        }
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void h() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void i() {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void a(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void d(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void e(Activity activity) {
    }

    @Override // defpackage.ekz
    public final /* synthetic */ void f(int i) {
    }
}
