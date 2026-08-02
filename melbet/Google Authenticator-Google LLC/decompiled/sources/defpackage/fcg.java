package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.PowerManager;
import android.os.Process;
import java.util.List;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class fcg implements htq {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fcg(ept eptVar, int i, String str, String str2, int i2) {
        this.e = i2;
        this.b = eptVar;
        this.a = i;
        this.c = str;
        this.d = str2;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.htq
    public final hvi a() {
        if (this.e == 0) {
            hvi aJ = hnu.aJ(this.c);
            for (int i = 0; i < this.a; i++) {
                if (((Boolean) hnu.aR((Future) this.d.get(i))).booleanValue()) {
                    aJ = hti.g(aJ, gvx.c(new doj((fwv) ((fci) this.b).a.get(i), 7)), huf.a);
                }
            }
            return aJ;
        }
        final ept eptVar = (ept) this.b;
        epk epkVar = (epk) eptVar.b.b();
        Object obj = this.c;
        final int i2 = this.a;
        final eru a = ept.c(i2) ? epkVar.b() ? eru.a : eru.b : eptVar.c.a((String) obj);
        if (a.e()) {
            return hve.a;
        }
        Object obj2 = this.d;
        gzp gzpVar = epkVar.a;
        hvc v = hvc.v(hnu.aJ(null));
        drv drvVar = new drv(19);
        hvm hvmVar = eptVar.a;
        hvi f = hso.f(v, RuntimeException.class, drvVar, hvmVar);
        final String str = (String) obj2;
        final String str2 = (String) obj;
        return hti.g(f, new htr() { // from class: eps
            /* JADX WARN: Removed duplicated region for block: B:102:0x0356  */
            /* JADX WARN: Removed duplicated region for block: B:105:0x0376  */
            /* JADX WARN: Removed duplicated region for block: B:108:0x038e  */
            /* JADX WARN: Removed duplicated region for block: B:114:0x03b1  */
            /* JADX WARN: Removed duplicated region for block: B:117:0x03e5  */
            /* JADX WARN: Removed duplicated region for block: B:120:0x02da  */
            /* JADX WARN: Removed duplicated region for block: B:121:0x0131  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x012b  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x0178  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x021f  */
            /* JADX WARN: Removed duplicated region for block: B:84:0x028d  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x02a7  */
            /* JADX WARN: Removed duplicated region for block: B:90:0x02d3  */
            /* JADX WARN: Removed duplicated region for block: B:93:0x02ec  */
            /* JADX WARN: Removed duplicated region for block: B:96:0x0306  */
            /* JADX WARN: Removed duplicated region for block: B:99:0x033f  */
            @Override // defpackage.htr
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final hvi a(Object obj3) {
                ActivityManager.MemoryInfo memoryInfo;
                epw epwVar;
                epv epvVar;
                jkj k;
                boolean z;
                jkj jkjVar;
                jkj k2;
                jkj k3;
                int i3;
                String str3;
                lew lewVar = (lew) obj3;
                jkj k4 = lgv.a.k();
                int myPid = Process.myPid();
                ept eptVar2 = ept.this;
                epx epxVar = eptVar2.d;
                hac v2 = hoq.v(new eks(epxVar, 8));
                Object b = epxVar.a.b();
                fao.b();
                if (((epk) b).b) {
                    memoryInfo = new ActivityManager.MemoryInfo();
                    Context context = epxVar.b;
                    if (elh.a == null) {
                        synchronized (elh.class) {
                            if (elh.a == null) {
                                Object systemService = context.getSystemService("activity");
                                systemService.getClass();
                                elh.a = (ActivityManager) systemService;
                            }
                        }
                    }
                    elh.a.getMemoryInfo(memoryInfo);
                } else {
                    memoryInfo = null;
                }
                String d = epxVar.d(((Boolean) epxVar.c.b()).booleanValue() ? String.valueOf(myPid) : "self", "status", false);
                if (d != null) {
                    if (!d.isEmpty()) {
                        epwVar = new epw();
                        epwVar.f = epx.c(epw.a, d);
                        epwVar.g = epx.c(epw.b, d);
                        epwVar.h = epx.c(epw.c, d);
                        epwVar.i = epx.c(epw.d, d);
                        epwVar.j = epx.c(epw.e, d);
                        epvVar = (!((Boolean) epxVar.d.b()).booleanValue() || ((Boolean) epxVar.e.b()).booleanValue()) ? new epv(epx.b(epxVar.d(String.valueOf(myPid), "dmabuf_rss", true)), epx.b(epxVar.d(String.valueOf(myPid), "dmabuf_rss_hwm", true)), epx.b(epxVar.d(String.valueOf(myPid), "dmabuf_pss", true))) : null;
                        k = lfb.a.k();
                        jkj k5 = lfa.a.k();
                        jkj k6 = ley.a.k();
                        if (memoryInfo != null) {
                            z = true;
                            jkjVar = k5;
                        } else {
                            z = true;
                            jkjVar = k5;
                            long j = memoryInfo.availMem >> 10;
                            if (!k6.b.M()) {
                                k6.t();
                            }
                            int i4 = (int) j;
                            ley leyVar = (ley) k6.b;
                            leyVar.b |= 131072;
                            leyVar.c = i4;
                            long j2 = memoryInfo.totalMem >> 20;
                            if (!k6.b.M()) {
                                k6.t();
                            }
                            ley leyVar2 = (ley) k6.b;
                            leyVar2.b |= 262144;
                            leyVar2.d = (int) j2;
                        }
                        if (epwVar != null) {
                            Long l = epwVar.f;
                            if (l != null) {
                                long longValue = l.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar3 = (ley) k6.b;
                                leyVar3.b |= 524288;
                                leyVar3.e = longValue;
                            }
                            Long l2 = epwVar.g;
                            if (l2 != null) {
                                long longValue2 = l2.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar4 = (ley) k6.b;
                                leyVar4.b |= 1048576;
                                leyVar4.f = longValue2;
                            }
                            Long l3 = epwVar.h;
                            if (l3 != null) {
                                long longValue3 = l3.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar5 = (ley) k6.b;
                                leyVar5.b |= 2097152;
                                leyVar5.g = longValue3;
                            }
                            Long l4 = epwVar.i;
                            if (l4 != null) {
                                long longValue4 = l4.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar6 = (ley) k6.b;
                                leyVar6.b |= 4194304;
                                leyVar6.h = longValue4;
                            }
                            Long l5 = epwVar.j;
                            if (l5 != null) {
                                long longValue5 = l5.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar7 = (ley) k6.b;
                                leyVar7.b |= 8388608;
                                leyVar7.i = longValue5;
                            }
                        }
                        if (epvVar != null) {
                            Long l6 = epvVar.a;
                            if (l6 != null) {
                                long longValue6 = l6.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar8 = (ley) k6.b;
                                leyVar8.b |= 16777216;
                                leyVar8.j = longValue6;
                            }
                            Long l7 = epvVar.b;
                            if (l7 != null) {
                                long longValue7 = l7.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar9 = (ley) k6.b;
                                leyVar9.b |= 33554432;
                                leyVar9.k = longValue7;
                            }
                            Long l8 = epvVar.c;
                            if (l8 != null) {
                                long longValue8 = l8.longValue();
                                if (!k6.b.M()) {
                                    k6.t();
                                }
                                ley leyVar10 = (ley) k6.b;
                                leyVar10.b |= 67108864;
                                leyVar10.l = longValue8;
                            }
                        }
                        ley leyVar11 = (ley) k6.q();
                        if (!jkjVar.b.M()) {
                            jkjVar.t();
                        }
                        lfa lfaVar = (lfa) jkjVar.b;
                        leyVar11.getClass();
                        lfaVar.c = leyVar11;
                        lfaVar.b |= 1;
                        if (!k.b.M()) {
                            k.t();
                        }
                        lfb lfbVar = (lfb) k.b;
                        lfa lfaVar2 = (lfa) jkjVar.q();
                        lfaVar2.getClass();
                        lfbVar.c = lfaVar2;
                        lfbVar.b |= 1;
                        k2 = lfz.a.k();
                        lfy s = !((Boolean) epxVar.f.b()).booleanValue() ? epxVar.g.s(myPid, v2) : epxVar.g.s(Process.myPid(), v2);
                        if (!k2.b.M()) {
                            k2.t();
                        }
                        lfz lfzVar = (lfz) k2.b;
                        s.getClass();
                        lfzVar.c = s;
                        lfzVar.b |= 1;
                        if (!k.b.M()) {
                            k.t();
                        }
                        lfb lfbVar2 = (lfb) k.b;
                        lfz lfzVar2 = (lfz) k2.q();
                        lfzVar2.getClass();
                        lfbVar2.d = lfzVar2;
                        lfbVar2.b |= 2;
                        k3 = lez.a.k();
                        Context context2 = epxVar.b;
                        ActivityManager activityManager = elh.a;
                        Object systemService2 = context2.getSystemService("power");
                        systemService2.getClass();
                        boolean isInteractive = ((PowerManager) systemService2).isInteractive();
                        if (!k3.b.M()) {
                            k3.t();
                        }
                        lez lezVar = (lez) k3.b;
                        lezVar.b |= 1;
                        lezVar.c = isInteractive;
                        if (!k.b.M()) {
                            k.t();
                        }
                        lfb lfbVar3 = (lfb) k.b;
                        lez lezVar2 = (lez) k3.q();
                        lezVar2.getClass();
                        lfbVar3.f = lezVar2;
                        lfbVar3.b |= 8;
                        if (!k.b.M()) {
                            k.t();
                        }
                        i3 = i2;
                        jkp jkpVar = k.b;
                        lfb lfbVar4 = (lfb) jkpVar;
                        str3 = str;
                        lfbVar4.e = i3 - 1;
                        lfbVar4.b |= 4;
                        if (str3 != null) {
                            if (!jkpVar.M()) {
                                k.t();
                            }
                            lfb lfbVar5 = (lfb) k.b;
                            lfbVar5.b |= 16;
                            lfbVar5.g = str3;
                        }
                        lfb lfbVar6 = (lfb) k.q();
                        if (!k4.b.M()) {
                            k4.t();
                        }
                        eru eruVar = a;
                        String str4 = str2;
                        lgv lgvVar = (lgv) k4.b;
                        lfbVar6.getClass();
                        lgvVar.f = lfbVar6;
                        lgvVar.b |= 8;
                        lgv lgvVar2 = (lgv) k4.q();
                        eme a2 = emf.a();
                        a2.a = str4;
                        boolean z2 = z;
                        a2.c(z2);
                        a2.d = eruVar;
                        a2.f(lgvVar2);
                        a2.b = lewVar;
                        if (ept.c(i3)) {
                            a2.d(z2);
                        }
                        return eptVar2.c.b(a2.a());
                    }
                    ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 312, "MemoryUsageCapture.java")).s("Null or empty proc status");
                }
                epwVar = null;
                if (((Boolean) epxVar.d.b()).booleanValue()) {
                }
                k = lfb.a.k();
                jkj k52 = lfa.a.k();
                jkj k62 = ley.a.k();
                if (memoryInfo != null) {
                }
                if (epwVar != null) {
                }
                if (epvVar != null) {
                }
                ley leyVar112 = (ley) k62.q();
                if (!jkjVar.b.M()) {
                }
                lfa lfaVar3 = (lfa) jkjVar.b;
                leyVar112.getClass();
                lfaVar3.c = leyVar112;
                lfaVar3.b |= 1;
                if (!k.b.M()) {
                }
                lfb lfbVar7 = (lfb) k.b;
                lfa lfaVar22 = (lfa) jkjVar.q();
                lfaVar22.getClass();
                lfbVar7.c = lfaVar22;
                lfbVar7.b |= 1;
                k2 = lfz.a.k();
                if (!((Boolean) epxVar.f.b()).booleanValue()) {
                }
                if (!k2.b.M()) {
                }
                lfz lfzVar3 = (lfz) k2.b;
                s.getClass();
                lfzVar3.c = s;
                lfzVar3.b |= 1;
                if (!k.b.M()) {
                }
                lfb lfbVar22 = (lfb) k.b;
                lfz lfzVar22 = (lfz) k2.q();
                lfzVar22.getClass();
                lfbVar22.d = lfzVar22;
                lfbVar22.b |= 2;
                k3 = lez.a.k();
                Context context22 = epxVar.b;
                ActivityManager activityManager2 = elh.a;
                Object systemService22 = context22.getSystemService("power");
                systemService22.getClass();
                boolean isInteractive2 = ((PowerManager) systemService22).isInteractive();
                if (!k3.b.M()) {
                }
                lez lezVar3 = (lez) k3.b;
                lezVar3.b |= 1;
                lezVar3.c = isInteractive2;
                if (!k.b.M()) {
                }
                lfb lfbVar32 = (lfb) k.b;
                lez lezVar22 = (lez) k3.q();
                lezVar22.getClass();
                lfbVar32.f = lezVar22;
                lfbVar32.b |= 8;
                if (!k.b.M()) {
                }
                i3 = i2;
                jkp jkpVar2 = k.b;
                lfb lfbVar42 = (lfb) jkpVar2;
                str3 = str;
                lfbVar42.e = i3 - 1;
                lfbVar42.b |= 4;
                if (str3 != null) {
                }
                lfb lfbVar62 = (lfb) k.q();
                if (!k4.b.M()) {
                }
                eru eruVar2 = a;
                String str42 = str2;
                lgv lgvVar3 = (lgv) k4.b;
                lfbVar62.getClass();
                lgvVar3.f = lfbVar62;
                lgvVar3.b |= 8;
                lgv lgvVar22 = (lgv) k4.q();
                eme a22 = emf.a();
                a22.a = str42;
                boolean z22 = z;
                a22.c(z22);
                a22.d = eruVar2;
                a22.f(lgvVar22);
                a22.b = lewVar;
                if (ept.c(i3)) {
                }
                return eptVar2.c.b(a22.a());
            }
        }, hvmVar);
    }

    public /* synthetic */ fcg(fci fciVar, jll jllVar, int i, List list, int i2) {
        this.e = i2;
        this.b = fciVar;
        this.c = jllVar;
        this.a = i;
        this.d = list;
    }
}
