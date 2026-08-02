package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.os.health.HealthStats;
import android.os.health.SystemHealthManager;
import android.util.Base64;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class eln extends eos implements ekz, ekq, emk {
    final AtomicBoolean a;
    public final koe b;
    public final emi c;
    public final bry d;
    public final bry e;
    private final Context f;
    private final Executor g;
    private final AtomicBoolean h;
    private final ekv i;

    /* JADX WARN: Multi-variable type inference failed */
    public eln(ldt ldtVar, Context context, bry bryVar, ekv ekvVar, hvm hvmVar, jpt jptVar, bry bryVar2, koe koeVar, koe koeVar2, Executor executor) {
        super((byte[]) null);
        this.a = new AtomicBoolean();
        new ConcurrentHashMap();
        this.h = new AtomicBoolean(false);
        this.i = ekvVar;
        this.c = ldtVar.n(executor, jptVar, koeVar2);
        this.f = context;
        this.e = bryVar;
        this.g = Build.VERSION.SDK_INT < 31 ? executor : hvmVar;
        this.d = bryVar2;
        this.b = koeVar;
    }

    private final void Q(final int i) {
        hnu.aN(new htq() { // from class: elm
            /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
            /* JADX WARN: Removed duplicated region for block: B:672:0x0ee8  */
            /* JADX WARN: Removed duplicated region for block: B:674:0x0eeb  */
            /* JADX WARN: Removed duplicated region for block: B:777:0x0096 A[Catch: all -> 0x0f0b, TryCatch #3 {, blocks: (B:9:0x0016, B:14:0x004e, B:17:0x0052, B:21:0x0058, B:22:0x008f, B:25:0x012a, B:777:0x0096, B:779:0x009c, B:782:0x00ac, B:784:0x00b2, B:785:0x00b4, B:787:0x00bc, B:788:0x00c7, B:790:0x00cd, B:791:0x00d8, B:793:0x00de, B:794:0x00e9, B:796:0x00ef, B:797:0x00fa, B:799:0x0100, B:800:0x0107, B:802:0x010b, B:804:0x010f, B:806:0x0116, B:808:0x011c, B:809:0x0127, B:822:0x0063, B:823:0x0075, B:825:0x0037), top: B:8:0x0016, inners: #0 }] */
            /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, koe] */
            /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object, koe] */
            @Override // defpackage.htq
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final hvi a() {
                boolean z;
                Object obj;
                esq esqVar;
                int i2;
                elx elxVar;
                lew lewVar;
                lgv lgvVar;
                Object obj2;
                long j;
                les lesVar;
                Integer num;
                elw elwVar;
                elw elwVar2;
                elw elwVar3;
                elw elwVar4;
                elw elwVar5;
                ler lerVar;
                ler lerVar2;
                elt eltVar;
                els elsVar;
                int i3;
                ler lerVar3;
                ler lerVar4;
                int i4;
                ler lerVar5;
                ler lerVar6;
                ler lerVar7;
                ler lerVar8;
                ler lerVar9;
                ler lerVar10;
                ler lerVar11;
                ler lerVar12;
                ler lerVar13;
                ler lerVar14;
                ler lerVar15;
                ler lerVar16;
                ler lerVar17;
                ler lerVar18;
                ler lerVar19;
                ler lerVar20;
                ler lerVar21;
                ler lerVar22;
                ler lerVar23;
                ler lerVar24;
                ler lerVar25;
                ler lerVar26;
                ler lerVar27;
                ler lerVar28;
                ler lerVar29;
                ler lerVar30;
                ler lerVar31;
                ler lerVar32;
                int length;
                eln elnVar = eln.this;
                if (!elnVar.c.c(null)) {
                    return hve.a;
                }
                fao.b();
                bry bryVar = elnVar.d;
                synchronized (bryVar) {
                    Object obj3 = bryVar.a;
                    esq esqVar2 = esq.a;
                    jlr D = jkp.D(esq.class);
                    fao.b();
                    z = false;
                    byte[] decode = !djl.i((Context) ((erj) obj3).a) ? null : Base64.decode(((SharedPreferences) ((erj) obj3).b.b()).getString("primes.battery.snapshot", ""), 0);
                    if (decode != null && (length = decode.length) != 0) {
                        if (decode[0] == 1) {
                            try {
                                obj = D.h(decode, length - 1, jkd.a());
                            } catch (jld e) {
                                ((hkf) ((hkf) ((hkf) eiu.a.g()).h(e)).i("com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 'Q', "PersistentStorage.java")).s("failure reading proto");
                            }
                            esqVar = (esq) obj;
                            if (esqVar != null) {
                                elxVar = null;
                            } else {
                                if ((esqVar.b & 32) != 0) {
                                    int z2 = a.z(esqVar.h);
                                    i2 = z2 == 0 ? 1 : z2;
                                } else {
                                    i2 = 0;
                                }
                                les lesVar2 = esqVar.c;
                                if (lesVar2 == null) {
                                    lesVar2 = les.a;
                                }
                                les lesVar3 = lesVar2;
                                Long valueOf = (esqVar.b & 2) != 0 ? Long.valueOf(esqVar.d) : null;
                                Long valueOf2 = (esqVar.b & 4) != 0 ? Long.valueOf(esqVar.e) : null;
                                Long valueOf3 = (esqVar.b & 8) != 0 ? Long.valueOf(esqVar.f) : null;
                                Long valueOf4 = (esqVar.b & 16) != 0 ? Long.valueOf(esqVar.g) : null;
                                int i5 = esqVar.b;
                                String str = (i5 & 64) != 0 ? esqVar.i : null;
                                if ((i5 & 256) != 0) {
                                    lew lewVar2 = esqVar.j;
                                    if (lewVar2 == null) {
                                        lewVar2 = lew.a;
                                    }
                                    lewVar = lewVar2;
                                } else {
                                    lewVar = null;
                                }
                                elxVar = new elx(lesVar3, valueOf, valueOf2, valueOf3, valueOf4, i2, str, lewVar, (esqVar.b & 512) != 0 ? Integer.valueOf(esqVar.k) : null);
                            }
                        } else {
                            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/persistent/PersistentStorage", "readProto", 84, "PersistentStorage.java")).s("wrong header");
                        }
                    }
                    obj = null;
                    esqVar = (esq) obj;
                    if (esqVar != null) {
                    }
                }
                epa epaVar = (epa) elnVar.b.b();
                eih eihVar = (eih) epaVar.a;
                eihVar.b();
                Object obj4 = epaVar.d;
                Long valueOf5 = Long.valueOf(SystemClock.elapsedRealtime());
                Long valueOf6 = Long.valueOf(dih.r().toEpochMilli());
                SystemHealthManager m4m = a$$ExternalSyntheticApiModelOutline0.m4m(((Context) ((fwm) epaVar.c).a).getSystemService("systemhealth"));
                HealthStats takeMyUidSnapshot = m4m != null ? m4m.takeMyUidSnapshot() : null;
                int i6 = i;
                eihVar.b();
                elx y = eos.y(valueOf5, valueOf6, takeMyUidSnapshot, epaVar, i6);
                bry bryVar2 = elnVar.d;
                synchronized (bryVar2) {
                    jkj k = esq.a.k();
                    les lesVar4 = y.a;
                    if (lesVar4 != null) {
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar3 = (esq) k.b;
                        esqVar3.c = lesVar4;
                        esqVar3.b |= 1;
                    }
                    Long l = y.b;
                    if (l != null) {
                        long longValue = l.longValue();
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar4 = (esq) k.b;
                        esqVar4.b |= 2;
                        esqVar4.d = longValue;
                    }
                    Long l2 = y.c;
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar5 = (esq) k.b;
                        esqVar5.b |= 4;
                        esqVar5.e = longValue2;
                    }
                    Long l3 = y.d;
                    if (l3 != null) {
                        long longValue3 = l3.longValue();
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar6 = (esq) k.b;
                        esqVar6.b |= 8;
                        esqVar6.f = longValue3;
                    }
                    Long l4 = y.e;
                    if (l4 != null) {
                        long longValue4 = l4.longValue();
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar7 = (esq) k.b;
                        esqVar7.b |= 16;
                        esqVar7.g = longValue4;
                    }
                    int i7 = y.i;
                    if (i7 != 0) {
                        int i8 = i7 - 1;
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar8 = (esq) k.b;
                        esqVar8.b |= 32;
                        esqVar8.h = i8;
                    }
                    String str2 = y.f;
                    if (str2 != null) {
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar9 = (esq) k.b;
                        esqVar9.b |= 64;
                        esqVar9.i = str2;
                    }
                    lew lewVar3 = y.g;
                    if (lewVar3 != null) {
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar10 = (esq) k.b;
                        esqVar10.j = lewVar3;
                        esqVar10.b |= 256;
                    }
                    Integer num2 = y.h;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        if (!k.b.M()) {
                            k.t();
                        }
                        esq esqVar11 = (esq) k.b;
                        esqVar11.b |= 512;
                        esqVar11.k = intValue;
                    }
                    Object obj5 = bryVar2.a;
                    esq esqVar12 = (esq) k.q();
                    esqVar12.getClass();
                    byte[] f = esqVar12.f();
                    fao.b();
                    if (djl.i((Context) ((erj) obj5).a)) {
                        int length2 = f.length;
                        byte[] bArr = new byte[length2 + 1];
                        bArr[0] = 1;
                        System.arraycopy(f, 0, bArr, 1, length2);
                        z = ((SharedPreferences) ((erj) obj5).b.b()).edit().putString("primes.battery.snapshot", Base64.encodeToString(bArr, 0)).commit();
                    }
                }
                if (!z) {
                    elnVar.e.h(elnVar);
                    bry bryVar3 = elnVar.d;
                    synchronized (bryVar3) {
                        Object obj6 = bryVar3.a;
                        fao.b();
                        if (djl.i((Context) ((erj) obj6).a)) {
                            ((SharedPreferences) ((erj) obj6).b.b()).edit().remove("primes.battery.snapshot").commit();
                        }
                    }
                    throw new IOException("Failure storing persistent snapshot and helper data");
                }
                hkh hkhVar = eiu.a;
                ((hkf) ((hkf) hkhVar.d()).i("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "captureAndLog", 319, "BatteryMetricServiceImpl.java")).w("log start: %s\nend: %s", elxVar, y);
                epa epaVar2 = (epa) elnVar.b.b();
                if (elxVar == null || !epa.a(elxVar, y)) {
                    ((hkf) ((hkf) hkhVar.b()).i("com/google/android/libraries/performance/primes/metrics/battery/BatteryCapture", "createBatteryMetric", 146, "BatteryCapture.java")).s("inconsistent stats");
                } else {
                    Object obj7 = epaVar2.c;
                    les lesVar5 = y.a;
                    les lesVar6 = elxVar.a;
                    if (lesVar5 == null || lesVar6 == null) {
                        obj2 = obj7;
                        j = 0;
                    } else {
                        jkj k2 = les.a.k();
                        if ((lesVar5.b & 1) != 0) {
                            obj2 = obj7;
                            long j2 = lesVar5.d - lesVar6.d;
                            if (j2 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar7 = (les) k2.b;
                                lesVar7.b |= 1;
                                lesVar7.d = j2;
                            }
                        } else {
                            obj2 = obj7;
                        }
                        if ((lesVar5.b & 2) != 0) {
                            long j3 = lesVar5.e - lesVar6.e;
                            if (j3 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar8 = (les) k2.b;
                                lesVar8.b |= 2;
                                lesVar8.e = j3;
                            }
                        }
                        if ((lesVar5.b & 4) != 0) {
                            long j4 = lesVar5.f - lesVar6.f;
                            if (j4 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar9 = (les) k2.b;
                                lesVar9.b |= 4;
                                lesVar9.f = j4;
                            }
                        }
                        if ((lesVar5.b & 8) != 0) {
                            long j5 = lesVar5.g - lesVar6.g;
                            if (j5 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar10 = (les) k2.b;
                                lesVar10.b |= 8;
                                lesVar10.g = j5;
                            }
                        }
                        elw elwVar6 = elw.a;
                        k2.W(elwVar6.f(lesVar5.h, lesVar6.h));
                        elwVar = elw.a;
                        k2.X(elwVar.f(lesVar5.i, lesVar6.i));
                        elwVar2 = elw.a;
                        k2.Y(elwVar2.f(lesVar5.j, lesVar6.j));
                        elwVar3 = elw.a;
                        k2.V(elwVar3.f(lesVar5.k, lesVar6.k));
                        elwVar4 = elw.a;
                        k2.U(elwVar4.f(lesVar5.l, lesVar6.l));
                        elwVar5 = elw.a;
                        k2.Q(elwVar5.f(lesVar5.m, lesVar6.m));
                        if ((lesVar5.b & 16) != 0) {
                            lerVar = lesVar5.n;
                            if (lerVar == null) {
                                lerVar = ler.a;
                            }
                        } else {
                            lerVar = null;
                        }
                        if ((lesVar6.b & 16) != 0) {
                            lerVar2 = lesVar6.n;
                            if (lerVar2 == null) {
                                lerVar2 = ler.a;
                            }
                        } else {
                            lerVar2 = null;
                        }
                        ler r = eos.r(lerVar, lerVar2);
                        if (r != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar11 = (les) k2.b;
                            lesVar11.n = r;
                            lesVar11.b |= 16;
                        }
                        k2.R(elwVar6.f(lesVar5.o, lesVar6.o));
                        eltVar = elt.a;
                        k2.T(eltVar.f(lesVar5.q, lesVar6.q));
                        elsVar = els.a;
                        k2.S(elsVar.f(lesVar5.u, lesVar6.u));
                        if ((lesVar5.b & 32) != 0) {
                            long j6 = lesVar5.v - lesVar6.v;
                            if (j6 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar12 = (les) k2.b;
                                lesVar12.b |= 32;
                                lesVar12.v = j6;
                            }
                        }
                        if ((lesVar5.b & 64) != 0) {
                            long j7 = lesVar5.w - lesVar6.w;
                            if (j7 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar13 = (les) k2.b;
                                lesVar13.b |= 64;
                                lesVar13.w = j7;
                            }
                        }
                        if ((lesVar5.b & 128) != 0) {
                            long j8 = lesVar5.x - lesVar6.x;
                            if (j8 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar14 = (les) k2.b;
                                lesVar14.b |= 128;
                                lesVar14.x = j8;
                            }
                        }
                        if ((lesVar5.b & 256) != 0) {
                            long j9 = lesVar5.y - lesVar6.y;
                            if (j9 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar15 = (les) k2.b;
                                lesVar15.b |= 256;
                                lesVar15.y = j9;
                            }
                        }
                        if ((lesVar5.b & 512) != 0) {
                            long j10 = lesVar5.z - lesVar6.z;
                            if (j10 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar16 = (les) k2.b;
                                lesVar16.b |= 512;
                                lesVar16.z = j10;
                            }
                        }
                        if ((lesVar5.b & 1024) != 0) {
                            long j11 = lesVar5.A - lesVar6.A;
                            if (j11 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar17 = (les) k2.b;
                                lesVar17.b |= 1024;
                                lesVar17.A = j11;
                            }
                        }
                        if ((lesVar5.b & 2048) != 0) {
                            long j12 = lesVar5.B - lesVar6.B;
                            if (j12 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar18 = (les) k2.b;
                                lesVar18.b |= 2048;
                                lesVar18.B = j12;
                            }
                        }
                        if ((lesVar5.b & 4096) != 0) {
                            long j13 = lesVar5.C - lesVar6.C;
                            if (j13 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar19 = (les) k2.b;
                                lesVar19.b |= 4096;
                                lesVar19.C = j13;
                            }
                        }
                        if ((lesVar5.b & 8192) != 0) {
                            long j14 = lesVar5.D - lesVar6.D;
                            if (j14 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar20 = (les) k2.b;
                                lesVar20.b |= 8192;
                                lesVar20.D = j14;
                            }
                        }
                        if ((lesVar5.b & 16384) != 0) {
                            long j15 = lesVar5.E - lesVar6.E;
                            if (j15 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar21 = (les) k2.b;
                                lesVar21.b |= 16384;
                                lesVar21.E = j15;
                            }
                        }
                        if ((lesVar5.b & 32768) != 0) {
                            j = 0;
                            long j16 = lesVar5.F - lesVar6.F;
                            if (j16 != 0) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar22 = (les) k2.b;
                                lesVar22.b |= 32768;
                                lesVar22.F = j16;
                            }
                        } else {
                            j = 0;
                        }
                        if ((lesVar5.b & 65536) != 0) {
                            long j17 = lesVar5.G - lesVar6.G;
                            if (j17 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar23 = (les) k2.b;
                                lesVar23.b |= 65536;
                                lesVar23.G = j17;
                            }
                        }
                        if ((lesVar5.b & 131072) != 0) {
                            i3 = 131072;
                            long j18 = lesVar5.H - lesVar6.H;
                            if (j18 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar24 = (les) k2.b;
                                lesVar24.b |= 131072;
                                lesVar24.H = j18;
                            }
                        } else {
                            i3 = 131072;
                        }
                        if ((lesVar5.b & 262144) != 0) {
                            long j19 = lesVar5.I - lesVar6.I;
                            if (j19 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar25 = (les) k2.b;
                                lesVar25.b |= 262144;
                                lesVar25.I = j19;
                            }
                        }
                        if ((lesVar5.b & 524288) != 0) {
                            lerVar3 = lesVar5.J;
                            if (lerVar3 == null) {
                                lerVar3 = ler.a;
                            }
                        } else {
                            lerVar3 = null;
                        }
                        if ((lesVar6.b & 524288) != 0) {
                            lerVar4 = lesVar6.J;
                            if (lerVar4 == null) {
                                lerVar4 = ler.a;
                            }
                        } else {
                            lerVar4 = null;
                        }
                        ler r2 = eos.r(lerVar3, lerVar4);
                        if (r2 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar26 = (les) k2.b;
                            lesVar26.J = r2;
                            lesVar26.b |= 524288;
                        }
                        if ((lesVar5.b & 1048576) != 0) {
                            i4 = 524288;
                            long j20 = lesVar5.K - lesVar6.K;
                            if (j20 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar27 = (les) k2.b;
                                lesVar27.b |= 1048576;
                                lesVar27.K = j20;
                            }
                        } else {
                            i4 = 524288;
                        }
                        if ((lesVar5.b & 2097152) != 0) {
                            lerVar5 = lesVar5.L;
                            if (lerVar5 == null) {
                                lerVar5 = ler.a;
                            }
                        } else {
                            lerVar5 = null;
                        }
                        if ((lesVar6.b & 2097152) != 0) {
                            lerVar6 = lesVar6.L;
                            if (lerVar6 == null) {
                                lerVar6 = ler.a;
                            }
                        } else {
                            lerVar6 = null;
                        }
                        ler r3 = eos.r(lerVar5, lerVar6);
                        if (r3 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar28 = (les) k2.b;
                            lesVar28.L = r3;
                            lesVar28.b |= 2097152;
                        }
                        if ((lesVar5.b & 4194304) != 0) {
                            lerVar7 = lesVar5.M;
                            if (lerVar7 == null) {
                                lerVar7 = ler.a;
                            }
                        } else {
                            lerVar7 = null;
                        }
                        if ((lesVar6.b & 4194304) != 0) {
                            lerVar8 = lesVar6.M;
                            if (lerVar8 == null) {
                                lerVar8 = ler.a;
                            }
                        } else {
                            lerVar8 = null;
                        }
                        ler r4 = eos.r(lerVar7, lerVar8);
                        if (r4 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar29 = (les) k2.b;
                            lesVar29.M = r4;
                            lesVar29.b |= 4194304;
                        }
                        if ((lesVar5.b & 8388608) != 0) {
                            lerVar9 = lesVar5.N;
                            if (lerVar9 == null) {
                                lerVar9 = ler.a;
                            }
                        } else {
                            lerVar9 = null;
                        }
                        if ((lesVar6.b & 8388608) != 0) {
                            lerVar10 = lesVar6.N;
                            if (lerVar10 == null) {
                                lerVar10 = ler.a;
                            }
                        } else {
                            lerVar10 = null;
                        }
                        ler r5 = eos.r(lerVar9, lerVar10);
                        if (r5 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar30 = (les) k2.b;
                            lesVar30.N = r5;
                            lesVar30.b |= 8388608;
                        }
                        if ((lesVar5.b & 16777216) != 0) {
                            lerVar11 = lesVar5.O;
                            if (lerVar11 == null) {
                                lerVar11 = ler.a;
                            }
                        } else {
                            lerVar11 = null;
                        }
                        if ((lesVar6.b & 16777216) != 0) {
                            lerVar12 = lesVar6.O;
                            if (lerVar12 == null) {
                                lerVar12 = ler.a;
                            }
                        } else {
                            lerVar12 = null;
                        }
                        ler r6 = eos.r(lerVar11, lerVar12);
                        if (r6 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar31 = (les) k2.b;
                            lesVar31.O = r6;
                            lesVar31.b |= 16777216;
                        }
                        if ((lesVar5.b & 33554432) != 0) {
                            lerVar13 = lesVar5.P;
                            if (lerVar13 == null) {
                                lerVar13 = ler.a;
                            }
                        } else {
                            lerVar13 = null;
                        }
                        if ((lesVar6.b & 33554432) != 0) {
                            lerVar14 = lesVar6.P;
                            if (lerVar14 == null) {
                                lerVar14 = ler.a;
                            }
                        } else {
                            lerVar14 = null;
                        }
                        ler r7 = eos.r(lerVar13, lerVar14);
                        if (r7 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar32 = (les) k2.b;
                            lesVar32.P = r7;
                            lesVar32.b |= 33554432;
                        }
                        if ((lesVar5.b & 67108864) != 0) {
                            lerVar15 = lesVar5.Q;
                            if (lerVar15 == null) {
                                lerVar15 = ler.a;
                            }
                        } else {
                            lerVar15 = null;
                        }
                        if ((lesVar6.b & 67108864) != 0) {
                            lerVar16 = lesVar6.Q;
                            if (lerVar16 == null) {
                                lerVar16 = ler.a;
                            }
                        } else {
                            lerVar16 = null;
                        }
                        ler r8 = eos.r(lerVar15, lerVar16);
                        if (r8 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar33 = (les) k2.b;
                            lesVar33.Q = r8;
                            lesVar33.b |= 67108864;
                        }
                        if ((lesVar5.b & 134217728) != 0) {
                            lerVar17 = lesVar5.R;
                            if (lerVar17 == null) {
                                lerVar17 = ler.a;
                            }
                        } else {
                            lerVar17 = null;
                        }
                        if ((lesVar6.b & 134217728) != 0) {
                            lerVar18 = lesVar6.R;
                            if (lerVar18 == null) {
                                lerVar18 = ler.a;
                            }
                        } else {
                            lerVar18 = null;
                        }
                        ler r9 = eos.r(lerVar17, lerVar18);
                        if (r9 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar34 = (les) k2.b;
                            lesVar34.R = r9;
                            lesVar34.b |= 134217728;
                        }
                        if ((lesVar5.b & 268435456) != 0) {
                            lerVar19 = lesVar5.S;
                            if (lerVar19 == null) {
                                lerVar19 = ler.a;
                            }
                        } else {
                            lerVar19 = null;
                        }
                        if ((lesVar6.b & 268435456) != 0) {
                            lerVar20 = lesVar6.S;
                            if (lerVar20 == null) {
                                lerVar20 = ler.a;
                            }
                        } else {
                            lerVar20 = null;
                        }
                        ler r10 = eos.r(lerVar19, lerVar20);
                        if (r10 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar35 = (les) k2.b;
                            lesVar35.S = r10;
                            lesVar35.b |= 268435456;
                        }
                        if ((lesVar5.b & 536870912) != 0) {
                            lerVar21 = lesVar5.T;
                            if (lerVar21 == null) {
                                lerVar21 = ler.a;
                            }
                        } else {
                            lerVar21 = null;
                        }
                        if ((lesVar6.b & 536870912) != 0) {
                            lerVar22 = lesVar6.T;
                            if (lerVar22 == null) {
                                lerVar22 = ler.a;
                            }
                        } else {
                            lerVar22 = null;
                        }
                        ler r11 = eos.r(lerVar21, lerVar22);
                        if (r11 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar36 = (les) k2.b;
                            lesVar36.T = r11;
                            lesVar36.b |= 536870912;
                        }
                        if ((lesVar5.b & 1073741824) != 0) {
                            lerVar23 = lesVar5.U;
                            if (lerVar23 == null) {
                                lerVar23 = ler.a;
                            }
                        } else {
                            lerVar23 = null;
                        }
                        if ((lesVar6.b & 1073741824) != 0) {
                            lerVar24 = lesVar6.U;
                            if (lerVar24 == null) {
                                lerVar24 = ler.a;
                            }
                        } else {
                            lerVar24 = null;
                        }
                        ler r12 = eos.r(lerVar23, lerVar24);
                        if (r12 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar37 = (les) k2.b;
                            lesVar37.U = r12;
                            lesVar37.b |= 1073741824;
                        }
                        if ((lesVar5.b & Integer.MIN_VALUE) != 0) {
                            lerVar25 = lesVar5.V;
                            if (lerVar25 == null) {
                                lerVar25 = ler.a;
                            }
                        } else {
                            lerVar25 = null;
                        }
                        if ((lesVar6.b & Integer.MIN_VALUE) != 0) {
                            lerVar26 = lesVar6.V;
                            if (lerVar26 == null) {
                                lerVar26 = ler.a;
                            }
                        } else {
                            lerVar26 = null;
                        }
                        ler r13 = eos.r(lerVar25, lerVar26);
                        if (r13 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar38 = (les) k2.b;
                            lesVar38.V = r13;
                            lesVar38.b |= Integer.MIN_VALUE;
                        }
                        if ((lesVar5.c & 1) != 0) {
                            lerVar27 = lesVar5.W;
                            if (lerVar27 == null) {
                                lerVar27 = ler.a;
                            }
                        } else {
                            lerVar27 = null;
                        }
                        if ((lesVar6.c & 1) != 0) {
                            lerVar28 = lesVar6.W;
                            if (lerVar28 == null) {
                                lerVar28 = ler.a;
                            }
                        } else {
                            lerVar28 = null;
                        }
                        ler r14 = eos.r(lerVar27, lerVar28);
                        if (r14 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar39 = (les) k2.b;
                            lesVar39.W = r14;
                            lesVar39.c |= 1;
                        }
                        if ((lesVar5.c & 2) != 0) {
                            lerVar29 = lesVar5.X;
                            if (lerVar29 == null) {
                                lerVar29 = ler.a;
                            }
                        } else {
                            lerVar29 = null;
                        }
                        if ((lesVar6.c & 2) != 0) {
                            lerVar30 = lesVar6.X;
                            if (lerVar30 == null) {
                                lerVar30 = ler.a;
                            }
                        } else {
                            lerVar30 = null;
                        }
                        ler r15 = eos.r(lerVar29, lerVar30);
                        if (r15 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar40 = (les) k2.b;
                            lesVar40.X = r15;
                            lesVar40.c |= 2;
                        }
                        if ((lesVar5.c & 4) != 0) {
                            long j21 = lesVar5.Y - lesVar6.Y;
                            if (j21 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar41 = (les) k2.b;
                                lesVar41.c |= 4;
                                lesVar41.Y = j21;
                            }
                        }
                        if ((lesVar5.c & 8) != 0) {
                            long j22 = lesVar5.Z - lesVar6.Z;
                            if (j22 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar42 = (les) k2.b;
                                lesVar42.c |= 8;
                                lesVar42.Z = j22;
                            }
                        }
                        if ((lesVar5.c & 16) != 0) {
                            long j23 = lesVar5.aa - lesVar6.aa;
                            if (j23 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar43 = (les) k2.b;
                                lesVar43.c |= 16;
                                lesVar43.aa = j23;
                            }
                        }
                        if ((lesVar5.c & 32) != 0) {
                            long j24 = lesVar5.ab - lesVar6.ab;
                            if (j24 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar44 = (les) k2.b;
                                lesVar44.c |= 32;
                                lesVar44.ab = j24;
                            }
                        }
                        if ((lesVar5.c & 64) != 0) {
                            long j25 = lesVar5.ac - lesVar6.ac;
                            if (j25 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar45 = (les) k2.b;
                                lesVar45.c |= 64;
                                lesVar45.ac = j25;
                            }
                        }
                        if ((lesVar5.c & 128) != 0) {
                            long j26 = lesVar5.ad - lesVar6.ad;
                            if (j26 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar46 = (les) k2.b;
                                lesVar46.c |= 128;
                                lesVar46.ad = j26;
                            }
                        }
                        if ((lesVar5.c & 256) != 0) {
                            long j27 = lesVar5.ae - lesVar6.ae;
                            if (j27 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar47 = (les) k2.b;
                                lesVar47.c |= 256;
                                lesVar47.ae = j27;
                            }
                        }
                        if ((lesVar5.c & 512) != 0) {
                            long j28 = lesVar5.af - lesVar6.af;
                            if (j28 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar48 = (les) k2.b;
                                lesVar48.c |= 512;
                                lesVar48.af = j28;
                            }
                        }
                        if ((lesVar5.c & 1024) != 0) {
                            long j29 = lesVar5.ag - lesVar6.ag;
                            if (j29 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar49 = (les) k2.b;
                                lesVar49.c |= 1024;
                                lesVar49.ag = j29;
                            }
                        }
                        if ((lesVar5.c & 2048) != 0) {
                            long j30 = lesVar5.ah - lesVar6.ah;
                            if (j30 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar50 = (les) k2.b;
                                lesVar50.c |= 2048;
                                lesVar50.ah = j30;
                            }
                        }
                        if ((lesVar5.c & 4096) != 0) {
                            long j31 = lesVar5.ai - lesVar6.ai;
                            if (j31 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar51 = (les) k2.b;
                                lesVar51.c |= 4096;
                                lesVar51.ai = j31;
                            }
                        }
                        if ((lesVar5.c & 8192) != 0) {
                            long j32 = lesVar5.aj - lesVar6.aj;
                            if (j32 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar52 = (les) k2.b;
                                lesVar52.c |= 8192;
                                lesVar52.aj = j32;
                            }
                        }
                        if ((lesVar5.c & 16384) != 0) {
                            long j33 = lesVar5.ak - lesVar6.ak;
                            if (j33 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar53 = (les) k2.b;
                                lesVar53.c |= 16384;
                                lesVar53.ak = j33;
                            }
                        }
                        if ((lesVar5.c & 32768) != 0) {
                            long j34 = lesVar5.al - lesVar6.al;
                            if (j34 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar54 = (les) k2.b;
                                lesVar54.c = 32768 | lesVar54.c;
                                lesVar54.al = j34;
                            }
                        }
                        if ((lesVar5.c & 65536) != 0) {
                            long j35 = lesVar5.am - lesVar6.am;
                            if (j35 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar55 = (les) k2.b;
                                lesVar55.c |= 65536;
                                lesVar55.am = j35;
                            }
                        }
                        if ((lesVar5.c & i3) != 0) {
                            lerVar31 = lesVar5.an;
                            if (lerVar31 == null) {
                                lerVar31 = ler.a;
                            }
                        } else {
                            lerVar31 = null;
                        }
                        if ((lesVar6.c & i3) != 0) {
                            lerVar32 = lesVar6.an;
                            if (lerVar32 == null) {
                                lerVar32 = ler.a;
                            }
                        } else {
                            lerVar32 = null;
                        }
                        ler r16 = eos.r(lerVar31, lerVar32);
                        if (r16 != null) {
                            if (!k2.b.M()) {
                                k2.t();
                            }
                            les lesVar56 = (les) k2.b;
                            lesVar56.an = r16;
                            lesVar56.c |= i3;
                        }
                        if ((lesVar5.c & 262144) != 0) {
                            long j36 = lesVar5.ao - lesVar6.ao;
                            if (j36 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar57 = (les) k2.b;
                                lesVar57.c |= 262144;
                                lesVar57.ao = j36;
                            }
                        }
                        if ((lesVar5.c & i4) != 0) {
                            long j37 = lesVar5.ap - lesVar6.ap;
                            if (j37 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar58 = (les) k2.b;
                                lesVar58.c = i4 | lesVar58.c;
                                lesVar58.ap = j37;
                            }
                        }
                        if ((lesVar5.c & 1048576) != 0) {
                            long j38 = lesVar5.aq - lesVar6.aq;
                            if (j38 != j) {
                                if (!k2.b.M()) {
                                    k2.t();
                                }
                                les lesVar59 = (les) k2.b;
                                lesVar59.c |= 1048576;
                                lesVar59.aq = j38;
                            }
                        }
                        lesVar5 = (les) k2.q();
                        if (eos.w(lesVar5)) {
                            lesVar5 = null;
                        }
                    }
                    if (lesVar5 == null) {
                        lesVar = null;
                    } else {
                        Object obj8 = ((fwm) obj2).b;
                        jkj C = lesVar5.C();
                        eos.x(C, (elq) obj8);
                        lesVar = (les) C.q();
                    }
                    if (lesVar == null) {
                        ((hkf) ((hkf) hkhVar.b()).i("com/google/android/libraries/performance/primes/metrics/battery/BatteryCapture", "createBatteryMetric", 151, "BatteryCapture.java")).s("null diff");
                    } else {
                        if ((lesVar.b & 1) != 0 && lesVar.d > j) {
                            jkj k3 = lej.a.k();
                            Long l5 = y.b;
                            l5.getClass();
                            Long l6 = elxVar.b;
                            long longValue5 = l5.longValue();
                            l6.getClass();
                            long longValue6 = longValue5 - l6.longValue();
                            if (!k3.b.M()) {
                                k3.t();
                            }
                            jkp jkpVar = k3.b;
                            lej lejVar = (lej) jkpVar;
                            lejVar.b |= 64;
                            lejVar.i = longValue6;
                            int i9 = elxVar.i;
                            if (i9 != 0) {
                                if (!jkpVar.M()) {
                                    k3.t();
                                }
                                lej lejVar2 = (lej) k3.b;
                                lejVar2.c = i9 - 1;
                                lejVar2.b |= 1;
                            }
                            String str3 = elxVar.f;
                            if (str3 != null) {
                                if (!k3.b.M()) {
                                    k3.t();
                                }
                                lej lejVar3 = (lej) k3.b;
                                lejVar3.b |= 8;
                                lejVar3.f = str3;
                            }
                            lew lewVar4 = elxVar.g;
                            if (lewVar4 != null) {
                                if (!k3.b.M()) {
                                    k3.t();
                                }
                                lej lejVar4 = (lej) k3.b;
                                lejVar4.g = lewVar4;
                                lejVar4.b |= 16;
                            }
                            int i10 = y.i;
                            if (i10 != 0) {
                                if (!k3.b.M()) {
                                    k3.t();
                                }
                                lej lejVar5 = (lej) k3.b;
                                lejVar5.h = i10 - 1;
                                lejVar5.b |= 32;
                            }
                            if (l5 != null) {
                                long longValue7 = l5.longValue();
                                if (!k3.b.M()) {
                                    k3.t();
                                }
                                lej lejVar6 = (lej) k3.b;
                                lejVar6.b |= 256;
                                lejVar6.k = longValue7;
                            }
                            Integer num3 = elxVar.h;
                            if (num3 != null && (num = y.h) != null) {
                                int intValue2 = num.intValue() - num3.intValue();
                                if (!k3.b.M()) {
                                    k3.t();
                                }
                                lej lejVar7 = (lej) k3.b;
                                lejVar7.b |= 512;
                                lejVar7.l = intValue2;
                            }
                            if (!k3.b.M()) {
                                k3.t();
                            }
                            lej lejVar8 = (lej) k3.b;
                            lejVar8.j = lesVar;
                            lejVar8.b |= 128;
                            jkj k4 = lgv.a.k();
                            jkj k5 = lek.a.k();
                            if (!k5.b.M()) {
                                k5.t();
                            }
                            lek lekVar = (lek) k5.b;
                            lej lejVar9 = (lej) k3.q();
                            lejVar9.getClass();
                            lekVar.c = lejVar9;
                            lekVar.b |= 1;
                            if (!k4.b.M()) {
                                k4.t();
                            }
                            lgv lgvVar2 = (lgv) k4.b;
                            lek lekVar2 = (lek) k5.q();
                            lekVar2.getClass();
                            lgvVar2.k = lekVar2;
                            lgvVar2.b |= 256;
                            lgvVar = (lgv) k4.q();
                            if (lgvVar != null) {
                                return hve.a;
                            }
                            emi emiVar = elnVar.c;
                            String str4 = y.f;
                            eme a = emf.a();
                            a.a = str4;
                            a.c(true);
                            a.f(lgvVar);
                            a.b = y.g;
                            return emiVar.b(a.a());
                        }
                        ((hkf) ((hkf) hkhVar.b()).i("com/google/android/libraries/performance/primes/metrics/battery/BatteryCapture", "createBatteryMetric", 155, "BatteryCapture.java")).s("invalid realtime");
                    }
                }
                lgvVar = null;
                if (lgvVar != null) {
                }
            }
        }, this.g);
    }

    @Override // defpackage.ekq
    public final void g(eik eikVar) {
        if (!djl.i(this.f)) {
            hvi hviVar = hve.a;
            return;
        }
        try {
            hoq.H(this.a.getAndSet(false));
            Q(2);
        } catch (Exception e) {
            hnu.aI(e);
        }
    }

    @Override // defpackage.ekz
    public final void h() {
        if (this.h.getAndSet(true)) {
            return;
        }
        j(null);
    }

    @Override // defpackage.ekq
    public final void j(eik eikVar) {
        AtomicBoolean atomicBoolean = this.a;
        if (atomicBoolean.get()) {
            return;
        }
        if (!djl.i(this.f)) {
            hvi hviVar = hve.a;
        } else if (!atomicBoolean.getAndSet(true)) {
            Q(3);
        } else {
            ((hkf) ((hkf) eiu.a.g()).i("com/google/android/libraries/performance/primes/metrics/battery/BatteryMetricServiceImpl", "onAppToForeground", 140, "BatteryMetricServiceImpl.java")).s("App is already in the foreground.");
            hnu.aH();
        }
    }

    @Override // defpackage.emk
    public final void k() {
        this.i.a(this);
        this.e.g(this);
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
    public final /* synthetic */ void c(Activity activity) {
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
