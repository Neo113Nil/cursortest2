package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.health.HealthStats;
import android.os.health.TimerStat;
import android.view.WindowManager;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class eos {
    private static volatile float a;
    private static String b;
    private static Boolean c;
    public static volatile long l;
    public static String m;
    public static Boolean n;

    private eos() {
    }

    public static Intent A(ehr ehrVar, gzp gzpVar, iiw iiwVar) {
        return dih.ag(ehrVar.c, iiwVar, gyf.a);
    }

    public static dkr B(ehv ehvVar) {
        return ehvVar.c().a();
    }

    public static boolean C(ehv ehvVar) {
        return (ehvVar.b() == null && ehvVar.d().isEmpty()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static jhy D(jhh jhhVar, jgu jguVar, int i, int i2, jiu jiuVar) {
        jhq jhqVar = new jhq(jhhVar, jhb.b, 2, (Integer) 2, 16);
        jhq jhqVar2 = null;
        jif jifVar = null;
        jin jinVar = null;
        jgn jgnVar = null;
        jgn jgnVar2 = null;
        int i3 = 2;
        return new jhy((jie) new jim(new jig(jguVar), jhqVar, jhqVar2, jifVar, jinVar, jgnVar, jgnVar2, i3, 0, 1788), i2, jhb.i, jiuVar, (kri) (null == true ? 1 : 0), i, 80);
    }

    public static /* synthetic */ exa E(jkj jkjVar) {
        jkp q = jkjVar.q();
        q.getClass();
        return (exa) q;
    }

    public static void F(jkj jkjVar) {
        if (!jkjVar.b.M()) {
            jkjVar.t();
        }
        exa exaVar = (exa) jkjVar.b;
        exa exaVar2 = exa.a;
        exaVar.c = 2;
        exaVar.b |= 1;
    }

    public static void G(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            gty aC = hoq.aC(61, (String) entry.getKey());
            try {
                ((eww) ((koe) entry.getValue()).b()).a();
                aC.close();
            } catch (Throwable th) {
                try {
                    aC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    public static boolean H() {
        boolean isApplicationUid;
        Boolean bool = c;
        if (bool == null) {
            isApplicationUid = Process.isApplicationUid(Process.myUid());
            bool = Boolean.valueOf(isApplicationUid);
            c = bool;
        }
        return bool.booleanValue();
    }

    public static String I() {
        String processName;
        String str = b;
        if (str != null) {
            return str;
        }
        processName = Application.getProcessName();
        b = processName;
        return processName;
    }

    public static void J(hvi hviVar) {
        hviVar.c(new evp(hviVar, 1), huf.a);
    }

    public static /* synthetic */ boolean K(AtomicReferenceArray atomicReferenceArray, int i, Object obj) {
        while (!atomicReferenceArray.compareAndSet(i, null, obj)) {
            if (atomicReferenceArray.get(i) != null) {
                return false;
            }
        }
        return true;
    }

    public static int L(int i) {
        if (i == 0) {
            return 6;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    i2 = 4;
                    if (i != 4) {
                        i2 = 5;
                        if (i != 5) {
                            return 0;
                        }
                    }
                }
            }
        }
        return i2;
    }

    public static int M(int i) {
        return i == 1 ? jky.c() : i - 2;
    }

    public static void N(Level level, Executor executor, Throwable th, String str, Object... objArr) {
        executor.execute(gvx.h(new fv(level, th, str, objArr, 7)));
    }

    public static Object O(esv esvVar) {
        try {
            return esvVar.a();
        } catch (SecurityException unused) {
            long clearCallingIdentity = Binder.clearCallingIdentity();
            try {
                return esvVar.a();
            } finally {
                Binder.restoreCallingIdentity(clearCallingIdentity);
            }
        }
    }

    public static lfj P(lfj lfjVar, long j) {
        jkj C = lfjVar.C();
        jkp jkpVar = C.b;
        lfj lfjVar2 = (lfj) jkpVar;
        if ((lfjVar2.b & 2) != 0) {
            long j2 = lfjVar2.d - j;
            if (!jkpVar.M()) {
                C.t();
            }
            lfj lfjVar3 = (lfj) C.b;
            lfjVar3.b |= 2;
            lfjVar3.d = j2;
        }
        jkp jkpVar2 = C.b;
        lfj lfjVar4 = (lfj) jkpVar2;
        if ((lfjVar4.b & 4) != 0) {
            long j3 = lfjVar4.e - j;
            if (!jkpVar2.M()) {
                C.t();
            }
            lfj lfjVar5 = (lfj) C.b;
            lfjVar5.b |= 4;
            lfjVar5.e = j3;
        }
        jkp jkpVar3 = C.b;
        lfj lfjVar6 = (lfj) jkpVar3;
        if ((lfjVar6.b & 8) != 0) {
            long j4 = lfjVar6.f - j;
            if (!jkpVar3.M()) {
                C.t();
            }
            lfj lfjVar7 = (lfj) C.b;
            lfjVar7.b |= 8;
            lfjVar7.f = j4;
        }
        return (lfj) C.q();
    }

    public static gzp l(Context context) {
        if (Build.VERSION.SDK_INT >= 31) {
            return gyf.a;
        }
        float f = a;
        if (f == 0.0f) {
            synchronized (eos.class) {
                f = a;
                if (f == 0.0f) {
                    float refreshRate = ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getRefreshRate();
                    a = refreshRate;
                    f = refreshRate;
                }
            }
        }
        return gzp.h(Float.valueOf(f));
    }

    public static long m(HealthStats healthStats, int i) {
        boolean hasMeasurement;
        long measurement;
        if (healthStats == null) {
            return 0L;
        }
        hasMeasurement = healthStats.hasMeasurement(i);
        if (!hasMeasurement) {
            return 0L;
        }
        measurement = healthStats.getMeasurement(i);
        return measurement;
    }

    public static List n(HealthStats healthStats, int i) {
        boolean hasTimers;
        Map timers;
        if (healthStats != null) {
            hasTimers = healthStats.hasTimers(i);
            if (hasTimers) {
                elw elwVar = elw.a;
                timers = healthStats.getTimers(i);
                return elwVar.e(timers);
            }
        }
        return Collections.EMPTY_LIST;
    }

    public static Map o(HealthStats healthStats, int i) {
        boolean hasStats;
        Map stats;
        if (healthStats != null) {
            hasStats = healthStats.hasStats(i);
            if (hasStats) {
                stats = healthStats.getStats(i);
                return stats;
            }
        }
        return Collections.EMPTY_MAP;
    }

    public static lem p(String str) {
        jkj k = lem.a.k();
        if (!k.b.M()) {
            k.t();
        }
        lem lemVar = (lem) k.b;
        lemVar.b |= 2;
        lemVar.d = str;
        return (lem) k.q();
    }

    public static ler q(HealthStats healthStats, int i) {
        boolean hasTimer;
        TimerStat timer;
        if (healthStats != null) {
            hasTimer = healthStats.hasTimer(i);
            if (hasTimer) {
                timer = healthStats.getTimer(i);
                return s(null, timer);
            }
        }
        return null;
    }

    public static ler r(ler lerVar, ler lerVar2) {
        if (lerVar == null || lerVar2 == null) {
            return lerVar;
        }
        int i = lerVar.c - lerVar2.c;
        long j = lerVar.d - lerVar2.d;
        if (i == 0) {
            if (j == 0) {
                return null;
            }
            i = 0;
        }
        jkj k = ler.a.k();
        if ((lerVar.b & 4) != 0) {
            lem lemVar = lerVar.e;
            if (lemVar == null) {
                lemVar = lem.a;
            }
            if (!k.b.M()) {
                k.t();
            }
            ler lerVar3 = (ler) k.b;
            lemVar.getClass();
            lerVar3.e = lemVar;
            lerVar3.b |= 4;
        }
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        ler lerVar4 = (ler) jkpVar;
        lerVar4.b |= 1;
        lerVar4.c = i;
        if (!jkpVar.M()) {
            k.t();
        }
        ler lerVar5 = (ler) k.b;
        lerVar5.b |= 2;
        lerVar5.d = j;
        return (ler) k.q();
    }

    public static ler s(String str, TimerStat timerStat) {
        int count;
        long time;
        jkj k = ler.a.k();
        count = timerStat.getCount();
        if (!k.b.M()) {
            k.t();
        }
        ler lerVar = (ler) k.b;
        lerVar.b |= 1;
        lerVar.c = count;
        time = timerStat.getTime();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        ler lerVar2 = (ler) jkpVar;
        lerVar2.b |= 2;
        lerVar2.d = time;
        if (lerVar2.c < 0) {
            if (!jkpVar.M()) {
                k.t();
            }
            ler lerVar3 = (ler) k.b;
            lerVar3.b |= 1;
            lerVar3.c = 0;
        }
        if (str != null) {
            lem p = p(str);
            if (!k.b.M()) {
                k.t();
            }
            ler lerVar4 = (ler) k.b;
            p.getClass();
            lerVar4.e = p;
            lerVar4.b |= 4;
        }
        ler lerVar5 = (ler) k.b;
        if (lerVar5.c == 0 && lerVar5.d == 0) {
            return null;
        }
        return (ler) k.q();
    }

    public static boolean t(len lenVar) {
        if (lenVar != null) {
            return lenVar.c.size() == 0 && lenVar.d.size() == 0;
        }
        return true;
    }

    public static boolean u(lep lepVar) {
        if (lepVar != null) {
            return lepVar.c <= 0 && lepVar.d <= 0 && lepVar.e <= 0 && lepVar.f <= 0 && lepVar.g <= 0 && lepVar.h <= 0;
        }
        return true;
    }

    public static boolean v(leq leqVar) {
        if (leqVar != null) {
            return ((long) leqVar.c) <= 0 && ((long) leqVar.d) <= 0;
        }
        return true;
    }

    public static boolean w(les lesVar) {
        if (lesVar != null) {
            return lesVar.d <= 0 && lesVar.e <= 0 && lesVar.f <= 0 && lesVar.g <= 0 && lesVar.h.size() == 0 && lesVar.i.size() == 0 && lesVar.j.size() == 0 && lesVar.k.size() == 0 && lesVar.l.size() == 0 && lesVar.m.size() == 0 && lesVar.o.size() == 0 && lesVar.p.size() == 0 && lesVar.q.size() == 0 && lesVar.u.size() == 0 && lesVar.v <= 0 && lesVar.w <= 0 && lesVar.x <= 0 && lesVar.y <= 0 && lesVar.z <= 0 && lesVar.A <= 0 && lesVar.B <= 0 && lesVar.C <= 0 && lesVar.D <= 0 && lesVar.E <= 0 && lesVar.F <= 0 && lesVar.G <= 0 && lesVar.H <= 0 && lesVar.I <= 0 && lesVar.K <= 0 && lesVar.Y <= 0 && lesVar.Z <= 0 && lesVar.aa <= 0 && lesVar.ab <= 0 && lesVar.ac <= 0 && lesVar.ad <= 0 && lesVar.ae <= 0 && lesVar.af <= 0 && lesVar.ag <= 0 && lesVar.ah <= 0 && lesVar.ai <= 0 && lesVar.aj <= 0 && lesVar.ak <= 0 && lesVar.al <= 0 && lesVar.am <= 0 && lesVar.ao <= 0 && lesVar.ap <= 0 && lesVar.aq <= 0;
        }
        return true;
    }

    public static void x(jkj jkjVar, elq elqVar) {
        DesugarCollections.unmodifiableList(((les) jkjVar.b).h);
        for (int i = 0; i < ((les) jkjVar.b).h.size(); i++) {
            jkjVar.ad(i, elqVar.c(jkjVar.N(i)));
        }
        DesugarCollections.unmodifiableList(((les) jkjVar.b).i);
        for (int i2 = 0; i2 < ((les) jkjVar.b).i.size(); i2++) {
            jkjVar.ae(i2, elqVar.c(jkjVar.O(i2)));
        }
        DesugarCollections.unmodifiableList(((les) jkjVar.b).j);
        for (int i3 = 0; i3 < ((les) jkjVar.b).j.size(); i3++) {
            jkjVar.af(i3, elqVar.c(jkjVar.P(i3)));
        }
        DesugarCollections.unmodifiableList(((les) jkjVar.b).k);
        for (int i4 = 0; i4 < ((les) jkjVar.b).k.size(); i4++) {
            jkjVar.ac(i4, elqVar.c(jkjVar.M(i4)));
        }
        DesugarCollections.unmodifiableList(((les) jkjVar.b).l);
        for (int i5 = 0; i5 < ((les) jkjVar.b).l.size(); i5++) {
            jkjVar.ab(i5, elqVar.c(jkjVar.L(i5)));
        }
        DesugarCollections.unmodifiableList(((les) jkjVar.b).m);
        for (int i6 = 0; i6 < ((les) jkjVar.b).m.size(); i6++) {
            jkjVar.Z(i6, elqVar.c(jkjVar.J(i6)));
        }
        DesugarCollections.unmodifiableList(((les) jkjVar.b).o);
        for (int i7 = 0; i7 < ((les) jkjVar.b).o.size(); i7++) {
            jkjVar.aa(i7, elqVar.c(jkjVar.K(i7)));
        }
    }

    public static elx y(Long l2, Long l3, HealthStats healthStats, epa epaVar, int i) {
        Object obj;
        jkj k = les.a.k();
        long m2 = m(healthStats, 10001);
        if (m2 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar = (les) k.b;
            lesVar.b |= 1;
            lesVar.d = m2;
        }
        long m3 = m(healthStats, 10002);
        if (m3 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar2 = (les) k.b;
            lesVar2.b |= 2;
            lesVar2.e = m3;
        }
        long m4 = m(healthStats, 10003);
        if (m4 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar3 = (les) k.b;
            lesVar3.b |= 4;
            lesVar3.f = m4;
        }
        long m5 = m(healthStats, 10004);
        if (m5 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar4 = (les) k.b;
            lesVar4.b |= 8;
            lesVar4.g = m5;
        }
        k.W(n(healthStats, 10005));
        k.X(n(healthStats, 10006));
        k.Y(n(healthStats, 10007));
        k.V(n(healthStats, 10008));
        k.U(n(healthStats, 10009));
        k.Q(n(healthStats, 10010));
        ler q = q(healthStats, 10011);
        if (q != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar5 = (les) k.b;
            lesVar5.n = q;
            lesVar5.b |= 16;
        }
        k.R(n(healthStats, 10012));
        k.T(elt.a.e(o(healthStats, 10014)));
        k.S(els.a.e(o(healthStats, 10015)));
        long m6 = m(healthStats, 10016);
        if (m6 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar6 = (les) k.b;
            lesVar6.b |= 32;
            lesVar6.v = m6;
        }
        long m7 = m(healthStats, 10017);
        if (m7 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar7 = (les) k.b;
            lesVar7.b |= 64;
            lesVar7.w = m7;
        }
        long m8 = m(healthStats, 10018);
        if (m8 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar8 = (les) k.b;
            lesVar8.b |= 128;
            lesVar8.x = m8;
        }
        long m9 = m(healthStats, 10019);
        if (m9 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar9 = (les) k.b;
            lesVar9.b |= 256;
            lesVar9.y = m9;
        }
        long m10 = m(healthStats, 10020);
        if (m10 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar10 = (les) k.b;
            lesVar10.b |= 512;
            lesVar10.z = m10;
        }
        long m11 = m(healthStats, 10021);
        if (m11 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar11 = (les) k.b;
            lesVar11.b |= 1024;
            lesVar11.A = m11;
        }
        long m12 = m(healthStats, 10022);
        if (m12 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar12 = (les) k.b;
            lesVar12.b |= 2048;
            lesVar12.B = m12;
        }
        long m13 = m(healthStats, 10023);
        if (m13 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar13 = (les) k.b;
            lesVar13.b |= 4096;
            lesVar13.C = m13;
        }
        long m14 = m(healthStats, 10024);
        if (m14 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar14 = (les) k.b;
            lesVar14.b |= 8192;
            lesVar14.D = m14;
        }
        long m15 = m(healthStats, 10025);
        if (m15 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar15 = (les) k.b;
            lesVar15.b |= 16384;
            lesVar15.E = m15;
        }
        long m16 = m(healthStats, 10026);
        if (m16 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar16 = (les) k.b;
            lesVar16.b |= 32768;
            lesVar16.F = m16;
        }
        long m17 = m(healthStats, 10027);
        if (m17 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar17 = (les) k.b;
            lesVar17.b |= 65536;
            lesVar17.G = m17;
        }
        long m18 = m(healthStats, 10028);
        if (m18 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar18 = (les) k.b;
            lesVar18.b |= 131072;
            lesVar18.H = m18;
        }
        long m19 = m(healthStats, 10029);
        if (m19 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar19 = (les) k.b;
            lesVar19.b |= 262144;
            lesVar19.I = m19;
        }
        ler q2 = q(healthStats, 10030);
        if (q2 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar20 = (les) k.b;
            lesVar20.J = q2;
            lesVar20.b |= 524288;
        }
        long m20 = m(healthStats, 10031);
        if (m20 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar21 = (les) k.b;
            lesVar21.b |= 1048576;
            lesVar21.K = m20;
        }
        ler q3 = q(healthStats, 10032);
        if (q3 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar22 = (les) k.b;
            lesVar22.L = q3;
            lesVar22.b |= 2097152;
        }
        ler q4 = q(healthStats, 10033);
        if (q4 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar23 = (les) k.b;
            lesVar23.M = q4;
            lesVar23.b |= 4194304;
        }
        ler q5 = q(healthStats, 10034);
        if (q5 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar24 = (les) k.b;
            lesVar24.N = q5;
            lesVar24.b |= 8388608;
        }
        ler q6 = q(healthStats, 10035);
        if (q6 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar25 = (les) k.b;
            lesVar25.O = q6;
            lesVar25.b |= 16777216;
        }
        ler q7 = q(healthStats, 10036);
        if (q7 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar26 = (les) k.b;
            lesVar26.P = q7;
            lesVar26.b |= 33554432;
        }
        ler q8 = q(healthStats, 10037);
        if (q8 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar27 = (les) k.b;
            lesVar27.Q = q8;
            lesVar27.b |= 67108864;
        }
        ler q9 = q(healthStats, 10038);
        if (q9 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar28 = (les) k.b;
            lesVar28.R = q9;
            lesVar28.b |= 134217728;
        }
        ler q10 = q(healthStats, 10039);
        if (q10 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar29 = (les) k.b;
            lesVar29.S = q10;
            lesVar29.b |= 268435456;
        }
        ler q11 = q(healthStats, 10040);
        if (q11 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar30 = (les) k.b;
            lesVar30.T = q11;
            lesVar30.b |= 536870912;
        }
        ler q12 = q(healthStats, 10041);
        if (q12 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar31 = (les) k.b;
            lesVar31.U = q12;
            lesVar31.b |= 1073741824;
        }
        ler q13 = q(healthStats, 10042);
        if (q13 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar32 = (les) k.b;
            lesVar32.V = q13;
            lesVar32.b |= Integer.MIN_VALUE;
        }
        ler q14 = q(healthStats, 10043);
        if (q14 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar33 = (les) k.b;
            lesVar33.W = q14;
            lesVar33.c |= 1;
        }
        ler q15 = q(healthStats, 10044);
        if (q15 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar34 = (les) k.b;
            lesVar34.X = q15;
            lesVar34.c |= 2;
        }
        long m21 = m(healthStats, 10045);
        if (m21 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar35 = (les) k.b;
            lesVar35.c |= 4;
            lesVar35.Y = m21;
        }
        long m22 = m(healthStats, 10046);
        if (m22 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar36 = (les) k.b;
            lesVar36.c |= 8;
            lesVar36.Z = m22;
        }
        long m23 = m(healthStats, 10047);
        if (m23 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar37 = (les) k.b;
            lesVar37.c |= 16;
            lesVar37.aa = m23;
        }
        long m24 = m(healthStats, 10048);
        if (m24 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar38 = (les) k.b;
            lesVar38.c |= 32;
            lesVar38.ab = m24;
        }
        long m25 = m(healthStats, 10049);
        if (m25 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar39 = (les) k.b;
            lesVar39.c |= 64;
            lesVar39.ac = m25;
        }
        long m26 = m(healthStats, 10050);
        if (m26 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar40 = (les) k.b;
            lesVar40.c |= 128;
            lesVar40.ad = m26;
        }
        long m27 = m(healthStats, 10051);
        if (m27 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar41 = (les) k.b;
            lesVar41.c |= 256;
            lesVar41.ae = m27;
        }
        long m28 = m(healthStats, 10052);
        if (m28 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar42 = (les) k.b;
            lesVar42.c |= 512;
            lesVar42.af = m28;
        }
        long m29 = m(healthStats, 10053);
        if (m29 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar43 = (les) k.b;
            lesVar43.c |= 1024;
            lesVar43.ag = m29;
        }
        long m30 = m(healthStats, 10054);
        if (m30 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar44 = (les) k.b;
            lesVar44.c |= 2048;
            lesVar44.ah = m30;
        }
        long m31 = m(healthStats, 10055);
        if (m31 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar45 = (les) k.b;
            lesVar45.c |= 4096;
            lesVar45.ai = m31;
        }
        long m32 = m(healthStats, 10056);
        if (m32 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar46 = (les) k.b;
            lesVar46.c |= 8192;
            lesVar46.aj = m32;
        }
        long m33 = m(healthStats, 10057);
        if (m33 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar47 = (les) k.b;
            lesVar47.c |= 16384;
            lesVar47.ak = m33;
        }
        long m34 = m(healthStats, 10058);
        if (m34 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar48 = (les) k.b;
            lesVar48.c |= 32768;
            lesVar48.al = m34;
        }
        long m35 = m(healthStats, 10059);
        if (m35 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar49 = (les) k.b;
            lesVar49.c = 65536 | lesVar49.c;
            lesVar49.am = m35;
        }
        ler q16 = q(healthStats, 10061);
        if (q16 != null) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar50 = (les) k.b;
            lesVar50.an = q16;
            lesVar50.c |= 131072;
        }
        long m36 = m(healthStats, 10062);
        if (m36 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar51 = (les) k.b;
            lesVar51.c |= 262144;
            lesVar51.ao = m36;
        }
        long m37 = m(healthStats, 10063);
        if (m37 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar52 = (les) k.b;
            lesVar52.c = 524288 | lesVar52.c;
            lesVar52.ap = m37;
        }
        long m38 = m(healthStats, 10064);
        if (m38 != 0) {
            if (!k.b.M()) {
                k.t();
            }
            les lesVar53 = (les) k.b;
            lesVar53.c |= 1048576;
            lesVar53.aq = m38;
        }
        jkj C = ((les) k.q()).C();
        DesugarCollections.unmodifiableList(((les) C.b).h);
        int i2 = 0;
        while (true) {
            Object obj2 = epaVar.c;
            int size = ((les) C.b).h.size();
            obj = ((fwm) obj2).b;
            if (i2 >= size) {
                break;
            }
            C.ad(i2, ((elq) obj).b(elp.a, C.N(i2)));
            i2++;
        }
        DesugarCollections.unmodifiableList(((les) C.b).i);
        for (int i3 = 0; i3 < ((les) C.b).i.size(); i3++) {
            C.ae(i3, ((elq) obj).b(elp.a, C.O(i3)));
        }
        DesugarCollections.unmodifiableList(((les) C.b).j);
        for (int i4 = 0; i4 < ((les) C.b).j.size(); i4++) {
            C.af(i4, ((elq) obj).b(elp.a, C.P(i4)));
        }
        DesugarCollections.unmodifiableList(((les) C.b).k);
        for (int i5 = 0; i5 < ((les) C.b).k.size(); i5++) {
            C.ac(i5, ((elq) obj).b(elp.a, C.M(i5)));
        }
        DesugarCollections.unmodifiableList(((les) C.b).l);
        for (int i6 = 0; i6 < ((les) C.b).l.size(); i6++) {
            C.ab(i6, ((elq) obj).b(elp.b, C.L(i6)));
        }
        DesugarCollections.unmodifiableList(((les) C.b).m);
        for (int i7 = 0; i7 < ((les) C.b).m.size(); i7++) {
            C.Z(i7, ((elq) obj).b(elp.c, C.J(i7)));
        }
        DesugarCollections.unmodifiableList(((les) C.b).o);
        for (int i8 = 0; i8 < ((les) C.b).o.size(); i8++) {
            C.aa(i8, ((elq) obj).b(elp.e, C.K(i8)));
        }
        return new elx((les) C.q(), l2, l3, 951541897L, Long.valueOf(epaVar.b != null ? ((String) r1).hashCode() : 0L), i, null, null, null);
    }

    public static elj z(gzp gzpVar, koe koeVar) {
        return (elj) ((koe) gzpVar.d(koeVar)).b();
    }

    public eos(koe koeVar) {
    }

    public eos(byte[] bArr) {
    }
}
