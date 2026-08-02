package defpackage;

import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class eqo extends eos implements emk, ekq {
    private final ekv a;
    private final koe b;
    private final koe c;
    private final koe d;
    private final AtomicBoolean e;
    private final koe f;
    private final koe g;

    public eqo(ekv ekvVar, koe koeVar, koe koeVar2, koe koeVar3, koe koeVar4, jpt jptVar) {
        super((byte[]) null);
        this.e = new AtomicBoolean();
        this.g = koeVar4;
        this.a = ekvVar;
        this.b = koeVar;
        this.c = koeVar2;
        this.d = koeVar3;
        this.f = new eqn(jptVar, 0);
    }

    private static long a(Long l, long j) {
        return l == null ? j : Math.min(l.longValue(), j);
    }

    private static lfj b(eqh eqhVar) {
        jkj k = lfj.a.k();
        if (eqhVar.a != null) {
            String str = eqhVar.a;
            if (!k.b.M()) {
                k.t();
            }
            lfj lfjVar = (lfj) k.b;
            str.getClass();
            lfjVar.b |= 1;
            lfjVar.c = str;
        }
        if (eqhVar.b != null) {
            long j = eqhVar.b.a;
            if (!k.b.M()) {
                k.t();
            }
            lfj lfjVar2 = (lfj) k.b;
            lfjVar2.b |= 2;
            lfjVar2.d = j;
        }
        if (eqhVar.c != null) {
            long j2 = eqhVar.c.a;
            if (!k.b.M()) {
                k.t();
            }
            lfj lfjVar3 = (lfj) k.b;
            lfjVar3.b |= 4;
            lfjVar3.e = j2;
        }
        if (eqhVar.d != null) {
            long j3 = eqhVar.d.a;
            if (!k.b.M()) {
                k.t();
            }
            lfj lfjVar4 = (lfj) k.b;
            lfjVar4.b |= 8;
            lfjVar4.f = j3;
        }
        return (lfj) k.q();
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        Long l;
        long j;
        long startElapsedRealtime;
        this.a.b(this);
        eql eqlVar = eql.a;
        ems emsVar = eqlVar.i;
        ems emsVar2 = eqlVar.j;
        koe koeVar = this.f;
        ((Boolean) koeVar.b()).booleanValue();
        if ((emsVar == null || emsVar.a <= 0) && (emsVar2 == null || emsVar2.a <= 0)) {
            ((hkf) ((hkf) eiu.a.e()).i("com/google/android/libraries/performance/primes/metrics/startup/StartupMetricServiceImpl", "onAppToBackground", 291, "StartupMetricServiceImpl.java")).s("missing firstDraw timestamp");
            return;
        }
        koe koeVar2 = this.g;
        ems emsVar3 = eqlVar.b(((Long) koeVar2.b()).longValue()) ? eqlVar.b : eqlVar.g;
        if (emsVar3 == null) {
            return;
        }
        long j2 = emsVar3.a;
        if (j2 > 0) {
            if ((emsVar == null || emsVar.a < j2) && (emsVar2 == null || emsVar2.a < j2)) {
                return;
            }
            ((Boolean) koeVar.b()).booleanValue();
            jkj k = lfk.a.k();
            boolean b = eqlVar.b(((Long) koeVar2.b()).longValue());
            if (!k.b.M()) {
                k.t();
            }
            jkp jkpVar = k.b;
            lfk lfkVar = (lfk) jkpVar;
            lfkVar.b |= 65536;
            lfkVar.u = b;
            int i = true != b ? 3 : 2;
            if (!jkpVar.M()) {
                k.t();
            }
            lfk lfkVar2 = (lfk) k.b;
            lfkVar2.v = i - 1;
            lfkVar2.b |= 131072;
            ems emsVar4 = eqlVar.b;
            ems emsVar5 = null;
            if (emsVar4 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar3 = (lfk) k.b;
                lfkVar3.b |= 16;
                long j3 = emsVar4.a;
                lfkVar3.f = j3;
                l = Long.valueOf(j3);
            } else {
                l = null;
            }
            ems emsVar6 = eqlVar.c;
            if (emsVar6 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar4 = (lfk) k.b;
                lfkVar4.b |= 128;
                long j4 = emsVar6.a;
                lfkVar4.i = j4;
                l = Long.valueOf(a(l, j4));
            }
            ems emsVar7 = eqlVar.d;
            ems emsVar8 = eqlVar.e;
            ems emsVar9 = eqlVar.f;
            ems emsVar10 = eqlVar.g;
            if (emsVar10 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar5 = (lfk) k.b;
                lfkVar5.b |= 512;
                long j5 = emsVar10.a;
                lfkVar5.k = j5;
                l = Long.valueOf(a(l, j5));
            }
            ems emsVar11 = eqlVar.j;
            ems emsVar12 = eqlVar.k;
            ems emsVar13 = eqlVar.i;
            ems emsVar14 = eqlVar.h;
            int intValue = ((Long) this.d.b()).intValue();
            if (intValue == 1) {
                emsVar5 = emsVar11;
            } else if (intValue == 2) {
                emsVar5 = emsVar12;
            } else if (intValue == 3) {
                emsVar5 = emsVar13;
            } else if (intValue == 4) {
                emsVar5 = emsVar14;
            }
            if (emsVar5 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar6 = (lfk) k.b;
                lfkVar6.b |= 1024;
                j = 0;
                long j6 = emsVar5.a;
                lfkVar6.l = j6;
                l = Long.valueOf(a(l, j6));
            } else {
                j = 0;
            }
            if (emsVar13 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar7 = (lfk) k.b;
                lfkVar7.b |= 8192;
                long j7 = emsVar13.a;
                lfkVar7.o = j7;
                l = Long.valueOf(a(l, j7));
            }
            if (emsVar14 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar8 = (lfk) k.b;
                lfkVar8.b |= 16384;
                long j8 = emsVar14.a;
                lfkVar8.p = j8;
                l = Long.valueOf(a(l, j8));
            }
            if (emsVar11 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar9 = (lfk) k.b;
                lfkVar9.b |= 2048;
                long j9 = emsVar11.a;
                lfkVar9.m = j9;
                l = Long.valueOf(a(l, j9));
            }
            if (emsVar12 != null) {
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar10 = (lfk) k.b;
                lfkVar10.b |= 4096;
                long j10 = emsVar12.a;
                lfkVar10.n = j10;
                l = Long.valueOf(a(l, j10));
            }
            ems emsVar15 = eqlVar.l;
            eqh eqhVar = eqlVar.n;
            if (eqhVar.b != null) {
                lfj b2 = b(eqhVar);
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar11 = (lfk) k.b;
                b2.getClass();
                lfkVar11.x = b2;
                lfkVar11.b |= 524288;
                if ((b2.b & 2) != 0) {
                    l = Long.valueOf(a(l, b2.d));
                }
                if ((b2.b & 4) != 0) {
                    l = Long.valueOf(a(l, b2.e));
                }
                if ((b2.b & 8) != 0) {
                    l = Long.valueOf(a(l, b2.f));
                }
            }
            eqh eqhVar2 = eqlVar.o;
            if (eqhVar2.b != null) {
                lfj b3 = b(eqhVar2);
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar12 = (lfk) k.b;
                b3.getClass();
                lfkVar12.y = b3;
                lfkVar12.b |= 1048576;
                if ((b3.b & 2) != 0) {
                    l = Long.valueOf(a(l, b3.d));
                }
                if ((b3.b & 4) != 0) {
                    l = Long.valueOf(a(l, b3.e));
                }
                if ((b3.b & 8) != 0) {
                    l = Long.valueOf(a(l, b3.f));
                }
            }
            gzp a = eqp.a();
            if (a.f()) {
                Long l2 = (Long) a.b();
                long longValue = l2.longValue();
                if (!k.b.M()) {
                    k.t();
                }
                lfk lfkVar13 = (lfk) k.b;
                lfkVar13.b |= 2;
                lfkVar13.d = longValue;
                l = Long.valueOf(a(l, l2.longValue()));
            }
            startElapsedRealtime = Process.getStartElapsedRealtime();
            if (!k.b.M()) {
                k.t();
            }
            lfk lfkVar14 = (lfk) k.b;
            lfkVar14.b |= 4;
            lfkVar14.e = startElapsedRealtime;
            long a2 = a(l, startElapsedRealtime);
            Long valueOf = Long.valueOf(a2);
            if (!k.b.M()) {
                k.t();
            }
            lfk lfkVar15 = (lfk) k.b;
            lfkVar15.b |= 262144;
            lfkVar15.w = true;
            valueOf.getClass();
            boolean booleanValue = ((Boolean) this.c.b()).booleanValue();
            if (a2 != j) {
                if (!booleanValue) {
                    if (!k.b.M()) {
                        k.t();
                    }
                    lfk lfkVar16 = (lfk) k.b;
                    lfkVar16.b |= 1;
                    lfkVar16.c = a2;
                }
                jkp jkpVar2 = k.b;
                lfk lfkVar17 = (lfk) jkpVar2;
                if ((lfkVar17.b & 16) != 0) {
                    long j11 = lfkVar17.f - a2;
                    if (!jkpVar2.M()) {
                        k.t();
                    }
                    lfk lfkVar18 = (lfk) k.b;
                    lfkVar18.b |= 16;
                    lfkVar18.f = j11;
                }
                jkp jkpVar3 = k.b;
                lfk lfkVar19 = (lfk) jkpVar3;
                if ((lfkVar19.b & 128) != 0) {
                    long j12 = lfkVar19.i - a2;
                    if (!jkpVar3.M()) {
                        k.t();
                    }
                    lfk lfkVar20 = (lfk) k.b;
                    lfkVar20.b |= 128;
                    lfkVar20.i = j12;
                }
                jkp jkpVar4 = k.b;
                lfk lfkVar21 = (lfk) jkpVar4;
                if ((lfkVar21.b & 256) != 0) {
                    long j13 = lfkVar21.j - a2;
                    if (!jkpVar4.M()) {
                        k.t();
                    }
                    lfk lfkVar22 = (lfk) k.b;
                    lfkVar22.b |= 256;
                    lfkVar22.j = j13;
                }
                jkp jkpVar5 = k.b;
                lfk lfkVar23 = (lfk) jkpVar5;
                if ((lfkVar23.b & 32) != 0) {
                    long j14 = lfkVar23.g - a2;
                    if (!jkpVar5.M()) {
                        k.t();
                    }
                    lfk lfkVar24 = (lfk) k.b;
                    lfkVar24.b |= 32;
                    lfkVar24.g = j14;
                }
                jkp jkpVar6 = k.b;
                lfk lfkVar25 = (lfk) jkpVar6;
                if ((lfkVar25.b & 64) != 0) {
                    long j15 = lfkVar25.h - a2;
                    if (!jkpVar6.M()) {
                        k.t();
                    }
                    lfk lfkVar26 = (lfk) k.b;
                    lfkVar26.b |= 64;
                    lfkVar26.h = j15;
                }
                jkp jkpVar7 = k.b;
                lfk lfkVar27 = (lfk) jkpVar7;
                if ((lfkVar27.b & 512) != 0) {
                    long j16 = lfkVar27.k - a2;
                    if (!jkpVar7.M()) {
                        k.t();
                    }
                    lfk lfkVar28 = (lfk) k.b;
                    lfkVar28.b |= 512;
                    lfkVar28.k = j16;
                }
                jkp jkpVar8 = k.b;
                lfk lfkVar29 = (lfk) jkpVar8;
                if ((lfkVar29.b & 1024) != 0) {
                    long j17 = lfkVar29.l - a2;
                    if (!jkpVar8.M()) {
                        k.t();
                    }
                    lfk lfkVar30 = (lfk) k.b;
                    lfkVar30.b |= 1024;
                    lfkVar30.l = j17;
                }
                jkp jkpVar9 = k.b;
                lfk lfkVar31 = (lfk) jkpVar9;
                if ((lfkVar31.b & 2048) != 0) {
                    long j18 = lfkVar31.m - a2;
                    if (!jkpVar9.M()) {
                        k.t();
                    }
                    lfk lfkVar32 = (lfk) k.b;
                    lfkVar32.b |= 2048;
                    lfkVar32.m = j18;
                }
                jkp jkpVar10 = k.b;
                lfk lfkVar33 = (lfk) jkpVar10;
                if ((lfkVar33.b & 4096) != 0) {
                    long j19 = lfkVar33.n - a2;
                    if (!jkpVar10.M()) {
                        k.t();
                    }
                    lfk lfkVar34 = (lfk) k.b;
                    lfkVar34.b |= 4096;
                    lfkVar34.n = j19;
                }
                jkp jkpVar11 = k.b;
                lfk lfkVar35 = (lfk) jkpVar11;
                if ((lfkVar35.b & 8192) != 0) {
                    long j20 = lfkVar35.o - a2;
                    if (!jkpVar11.M()) {
                        k.t();
                    }
                    lfk lfkVar36 = (lfk) k.b;
                    lfkVar36.b |= 8192;
                    lfkVar36.o = j20;
                }
                jkp jkpVar12 = k.b;
                lfk lfkVar37 = (lfk) jkpVar12;
                if ((lfkVar37.b & 16384) != 0) {
                    long j21 = lfkVar37.p - a2;
                    if (!jkpVar12.M()) {
                        k.t();
                    }
                    lfk lfkVar38 = (lfk) k.b;
                    lfkVar38.b |= 16384;
                    lfkVar38.p = j21;
                }
                jkp jkpVar13 = k.b;
                lfk lfkVar39 = (lfk) jkpVar13;
                if ((lfkVar39.b & 32768) != 0) {
                    long j22 = lfkVar39.q - a2;
                    if (!jkpVar13.M()) {
                        k.t();
                    }
                    lfk lfkVar40 = (lfk) k.b;
                    lfkVar40.b = 32768 | lfkVar40.b;
                    lfkVar40.q = j22;
                }
                lfk lfkVar41 = (lfk) k.b;
                if ((lfkVar41.b & 524288) != 0) {
                    lfj lfjVar = lfkVar41.x;
                    if (lfjVar == null) {
                        lfjVar = lfj.a;
                    }
                    lfj P = eos.P(lfjVar, a2);
                    if (!k.b.M()) {
                        k.t();
                    }
                    lfk lfkVar42 = (lfk) k.b;
                    P.getClass();
                    lfkVar42.x = P;
                    lfkVar42.b |= 524288;
                }
                lfk lfkVar43 = (lfk) k.b;
                if ((lfkVar43.b & 1048576) != 0) {
                    lfj lfjVar2 = lfkVar43.y;
                    if (lfjVar2 == null) {
                        lfjVar2 = lfj.a;
                    }
                    lfj P2 = eos.P(lfjVar2, a2);
                    if (!k.b.M()) {
                        k.t();
                    }
                    lfk lfkVar44 = (lfk) k.b;
                    P2.getClass();
                    lfkVar44.y = P2;
                    lfkVar44.b |= 1048576;
                }
                jkp jkpVar14 = k.b;
                lfk lfkVar45 = (lfk) jkpVar14;
                if ((lfkVar45.b & 4) != 0) {
                    long j23 = lfkVar45.e - a2;
                    if (!jkpVar14.M()) {
                        k.t();
                    }
                    lfk lfkVar46 = (lfk) k.b;
                    lfkVar46.b |= 4;
                    lfkVar46.e = j23;
                }
                jkp jkpVar15 = k.b;
                lfk lfkVar47 = (lfk) jkpVar15;
                if ((lfkVar47.b & 2) != 0) {
                    long j24 = lfkVar47.d - a2;
                    if (!jkpVar15.M()) {
                        k.t();
                    }
                    lfk lfkVar48 = (lfk) k.b;
                    lfkVar48.b |= 2;
                    lfkVar48.d = j24;
                }
            }
            eik eikVar2 = eqlVar.m;
            if (this.e.getAndSet(true)) {
                hvi hviVar = hve.a;
            } else {
                eqm eqmVar = (eqm) this.b.b();
                hnu.aN(new bwr(eqmVar, k, 7), eqmVar.c);
            }
        }
    }

    @Override // defpackage.emk
    public final void k() {
        this.a.a(this);
    }

    @Override // defpackage.ekq
    public final /* synthetic */ void j(eik eikVar) {
    }
}
