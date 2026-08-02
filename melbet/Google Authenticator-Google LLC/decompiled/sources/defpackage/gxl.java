package defpackage;

import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gxl {
    public final gvy d;
    public final float e;
    public gtx i;
    public gtx j;
    public final eoc k;
    public final hel l;
    public final boolean m;
    private final SparseArray o;
    private final long[] p;
    private final boolean[] q;
    public final Map a = new HashMap();
    public Long b = null;
    public final Map c = new HashMap();
    public final jkj n = lfs.a.k();
    public long f = 0;
    public long g = Long.MAX_VALUE;
    public long h = Long.MIN_VALUE;
    private long r = 1;
    private long s = 2;

    public gxl(gvy gvyVar, SparseArray sparseArray, float f, eoc eocVar, hel helVar, boolean z) {
        this.d = gvyVar;
        this.o = sparseArray;
        this.e = f;
        this.k = eocVar;
        this.l = helVar;
        this.m = z;
        this.q = new boolean[gvyVar.e.size()];
        this.p = new long[gvyVar.e.size()];
    }

    private final long c(long j, jkb jkbVar, String str) {
        long j2 = this.r;
        this.r = 1 + j2;
        jkj k = lfw.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        lfw lfwVar = (lfw) jkpVar;
        lfwVar.b |= 2;
        lfwVar.d = j;
        if (!jkpVar.M()) {
            k.t();
        }
        lfw lfwVar2 = (lfw) k.b;
        lfwVar2.b |= 1;
        lfwVar2.c = str;
        k(j2, jkbVar, (lfw) k.q());
        jkj n = n(j2);
        if (!n.b.M()) {
            n.t();
        }
        lgz lgzVar = (lgz) n.b;
        lgz lgzVar2 = lgz.a;
        lgzVar.b |= 16;
        lgzVar.g = true;
        return j2;
    }

    private final long d(int i) {
        long[] jArr = this.p;
        long j = jArr[i];
        if (j != 0) {
            return j;
        }
        long j2 = this.r;
        this.r = 1 + j2;
        jArr[i] = j2;
        return j2;
    }

    private final long e(gtx gtxVar) {
        return d(gtxVar.d);
    }

    private static long f(gtx gtxVar) {
        return ((gtxVar.f + gtxVar.h) * 1000000) + gtxVar.g + gtxVar.i;
    }

    private static long g(gtx gtxVar) {
        return (gtxVar.f * 1000000) + gtxVar.g;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        if (r7 <= r11) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final gxk h(gtx gtxVar) {
        long j;
        boolean z;
        int i = gtxVar.e;
        if (i == -1) {
            return new gxk(0L, gyf.a);
        }
        boolean z2 = gtxVar.m;
        jkx jkxVar = this.d.e;
        do {
            if (i == -1) {
                break;
            }
            gtx gtxVar2 = (gtx) jkxVar.get(i);
            int y = a.y(gtxVar2.l);
            if (y == 0) {
                y = 1;
            }
            int i2 = y - 1;
            if (i2 == 1) {
                z = true;
            } else {
                if (i2 != 2) {
                    if (i2 == 3) {
                        throw new AssertionError("Markers are not expected to be ancestors.");
                    }
                    throw new AssertionError("Invalid span kind for span: " + gtxVar2.d);
                }
                z2 = gtxVar2.m & z2;
                i = gtxVar2.e;
                z = false;
            }
        } while (!z);
        hoq.s(((long) i) != -1);
        gtx gtxVar3 = (gtx) jkxVar.get(i);
        long g = g(gtxVar3);
        long g2 = g(gtxVar);
        if (g <= g2) {
            long f = f(gtxVar3);
            if (g2 <= f) {
                int y2 = a.y(gtxVar.l);
                if (y2 != 0 && y2 == 2) {
                    long f2 = f(gtxVar);
                    if (g <= f2) {
                    }
                }
                if (z2) {
                    return new gxk(e(gtxVar3), gyf.a);
                }
            }
        }
        jkb j2 = j(gtxVar, 0L);
        jkb i3 = i(gtxVar3);
        jmv.d(j2);
        jmv.d(i3);
        int compare = Long.compare(j2.b, i3.b);
        if (compare == 0) {
            compare = Integer.compare(j2.c, i3.c);
        }
        if (compare >= 0) {
            j2 = i3;
        }
        long c = c(e(gtxVar3), j2, String.valueOf(gtxVar.c).concat("-dispatch"));
        long e = e(gtxVar3);
        jmv.d(j2);
        long j3 = j2.b;
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(j3) + Long.numberOfLeadingZeros(~j3) + Long.numberOfLeadingZeros(1000000000L) + Long.numberOfLeadingZeros(-1000000001L);
        if (numberOfLeadingZeros <= 65) {
            if (numberOfLeadingZeros >= 64) {
                long j4 = j3 * 1000000000;
                if (j3 == 0 || j4 / j3 == 1000000000) {
                    j = j4;
                }
            }
            throw new ArithmeticException();
        }
        j = j3 * 1000000000;
        return new gxk(e, gzp.h(new gxj(c, a.l(j, j2.c))));
    }

    private static jkb i(gtx gtxVar) {
        return jmv.b(f(gtxVar));
    }

    private static jkb j(gtx gtxVar, long j) {
        return jmv.b(g(gtxVar) + j);
    }

    private final void k(long j, jkb jkbVar, lfw lfwVar) {
        jkj k = lfx.a.k();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        lfx lfxVar = (lfx) jkpVar;
        lfxVar.b |= 1;
        lfxVar.e = j;
        if (!jkpVar.M()) {
            k.t();
        }
        lfx lfxVar2 = (lfx) k.b;
        jkbVar.getClass();
        lfxVar2.f = jkbVar;
        lfxVar2.b |= 2;
        jkj k2 = lft.a.k();
        if (!k2.b.M()) {
            k2.t();
        }
        lft lftVar = (lft) k2.b;
        lfwVar.getClass();
        lftVar.c = lfwVar;
        lftVar.b |= 1;
        if (!k.b.M()) {
            k.t();
        }
        jkj jkjVar = this.n;
        lfx lfxVar3 = (lfx) k.b;
        lft lftVar2 = (lft) k2.q();
        lftVar2.getClass();
        lfxVar3.d = lftVar2;
        lfxVar3.c = 5;
        jkjVar.al(k);
    }

    private final void l(gtx gtxVar, long j, long j2, long j3, String str, long j4) {
        long e = e(gtxVar);
        jkb j5 = j(gtxVar, j4);
        jkj k = lfu.a.k();
        lfw m = m(gtxVar, j);
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        lfu lfuVar = (lfu) jkpVar;
        m.getClass();
        lfuVar.c = m;
        lfuVar.b |= 1;
        if (j2 != 0) {
            if (!jkpVar.M()) {
                k.t();
            }
            lfu lfuVar2 = (lfu) k.b;
            lfuVar2.b |= 2;
            lfuVar2.d = j2;
        }
        if (j3 != 0 && str != null) {
            if (!k.b.M()) {
                k.t();
            }
            jkp jkpVar2 = k.b;
            lfu lfuVar3 = (lfu) jkpVar2;
            lfuVar3.b |= 8;
            lfuVar3.e = str;
            if (!jkpVar2.M()) {
                k.t();
            }
            jkp jkpVar3 = k.b;
            lfu lfuVar4 = (lfu) jkpVar3;
            lfuVar4.b |= 32;
            lfuVar4.g = 1L;
            if (!jkpVar3.M()) {
                k.t();
            }
            lfu lfuVar5 = (lfu) k.b;
            lfuVar5.f = 3;
            lfuVar5.b |= 16;
        }
        jkj jkjVar = this.n;
        lfx lfxVar = lfx.a;
        jkj k2 = lfxVar.k();
        if (!k2.b.M()) {
            k2.t();
        }
        jkp jkpVar4 = k2.b;
        lfx lfxVar2 = (lfx) jkpVar4;
        lfxVar2.b |= 1;
        lfxVar2.e = e;
        if (!jkpVar4.M()) {
            k2.t();
        }
        jkp jkpVar5 = k2.b;
        lfx lfxVar3 = (lfx) jkpVar5;
        j5.getClass();
        lfxVar3.f = j5;
        lfxVar3.b |= 2;
        if (!jkpVar5.M()) {
            k2.t();
        }
        lfx lfxVar4 = (lfx) k2.b;
        lfu lfuVar6 = (lfu) k.q();
        lfuVar6.getClass();
        lfxVar4.d = lfuVar6;
        lfxVar4.c = 3;
        jkjVar.al(k2);
        if ((gtxVar.b & 32) != 0) {
            if (gtxVar.h > 0 || gtxVar.i > 0) {
                j5 = i(gtxVar);
            }
            jkj k3 = lfv.a.k();
            if ((gtxVar.b & 128) != 0) {
                jkb a = jmv.a(gtxVar.j);
                if (!k3.b.M()) {
                    k3.t();
                }
                lfv lfvVar = (lfv) k3.b;
                a.getClass();
                lfvVar.c = a;
                lfvVar.b |= 1;
            }
            jkj k4 = lfxVar.k();
            if (!k4.b.M()) {
                k4.t();
            }
            jkp jkpVar6 = k4.b;
            lfx lfxVar5 = (lfx) jkpVar6;
            lfxVar5.b |= 1;
            lfxVar5.e = e;
            if (!jkpVar6.M()) {
                k4.t();
            }
            jkp jkpVar7 = k4.b;
            lfx lfxVar6 = (lfx) jkpVar7;
            j5.getClass();
            lfxVar6.f = j5;
            lfxVar6.b |= 2;
            if (!jkpVar7.M()) {
                k4.t();
            }
            lfx lfxVar7 = (lfx) k4.b;
            lfv lfvVar2 = (lfv) k3.q();
            lfvVar2.getClass();
            lfxVar7.d = lfvVar2;
            lfxVar7.c = 4;
            jkjVar.al(k4);
        }
    }

    private static final lfw m(gtx gtxVar, long j) {
        jkj k = lfw.a.k();
        String str = gtxVar.c;
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        lfw lfwVar = (lfw) jkpVar;
        str.getClass();
        lfwVar.b |= 1;
        lfwVar.c = str;
        if (!jkpVar.M()) {
            k.t();
        }
        lfw lfwVar2 = (lfw) k.b;
        lfwVar2.b |= 2;
        lfwVar2.d = j;
        int i = gtxVar.b;
        if ((i & 2048) != 0 && (i & 4096) != 0 && (i & 8192) != 0) {
            jkj k2 = lfl.a.k();
            int i2 = gtxVar.n;
            if (!k2.b.M()) {
                k2.t();
            }
            jkp jkpVar2 = k2.b;
            lfl lflVar = (lfl) jkpVar2;
            lflVar.b |= 8;
            lflVar.d = i2;
            int i3 = gtxVar.o;
            if (!jkpVar2.M()) {
                k2.t();
            }
            jkp jkpVar3 = k2.b;
            lfl lflVar2 = (lfl) jkpVar3;
            lflVar2.b |= 16;
            lflVar2.e = i3;
            int i4 = gtxVar.p;
            if (!jkpVar3.M()) {
                k2.t();
            }
            lfl lflVar3 = (lfl) k2.b;
            lflVar3.b |= 4;
            lflVar3.c = i4;
            if (!k.b.M()) {
                k.t();
            }
            lfw lfwVar3 = (lfw) k.b;
            lfl lflVar4 = (lfl) k2.q();
            lflVar4.getClass();
            lfwVar3.e = lflVar4;
            lfwVar3.b |= 4;
        }
        return (lfw) k.q();
    }

    private final jkj n(long j) {
        Map map = this.a;
        Long valueOf = Long.valueOf(j);
        jkj jkjVar = (jkj) map.get(valueOf);
        if (jkjVar == null) {
            jkjVar = lgz.a.k();
            if (!jkjVar.b.M()) {
                jkjVar.t();
            }
            lgz lgzVar = (lgz) jkjVar.b;
            lgzVar.b |= 1;
            lgzVar.c = j;
            map.put(valueOf, jkjVar);
        }
        return jkjVar;
    }

    public final gzp a(gtx gtxVar) {
        gtz j = guc.j(gxf.a, (guc) this.o.get(gtxVar.d, gub.a));
        return j.b() ? ((gxe) j.a()).a() : gyf.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0158  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(gtx gtxVar) {
        long j;
        int y;
        long j2;
        int i;
        int i2;
        long j3;
        long j4;
        long j5;
        int i3;
        gzp a;
        long g;
        long f;
        long j6;
        gtz j7;
        gtz j8;
        boolean[] zArr = this.q;
        int i4 = gtxVar.d;
        if (zArr[i4]) {
            return;
        }
        int i5 = gtxVar.e;
        if (i5 > i4) {
            b((gtx) this.d.e.get(i5));
        }
        int i6 = gtxVar.l;
        int y2 = a.y(i6);
        if (y2 == 0) {
            y2 = 1;
        }
        int i7 = y2 - 1;
        if (i7 != 1) {
            if (i7 == 2) {
                int y3 = a.y(i6);
                hoq.H(y3 != 0 && y3 == 3);
                gxk h = h(gtxVar);
                gzp gzpVar = h.b;
                long c = gzpVar.f() ? ((gxj) gzpVar.b()).a : c(h.a, j(gtxVar, 0L), String.valueOf(gtxVar.c).concat("-start"));
                jkj n = n(e(gtxVar));
                long d = d(gtxVar.e);
                if (!n.b.M()) {
                    n.t();
                }
                lgz lgzVar = (lgz) n.b;
                lgz lgzVar2 = lgz.a;
                lgzVar.b |= 32;
                lgzVar.h = d;
                long j9 = this.s;
                this.s = j9 + 1;
                i2 = 2;
                j = -1;
                l(gtxVar, c, j9, 1L, "Intervals", 0L);
                i = 4;
                a = a(gtxVar);
                if (a.f()) {
                    jkj n2 = n(e(gtxVar));
                    lew lewVar = (lew) a.b();
                    if (!n2.b.M()) {
                        n2.t();
                    }
                    lgz lgzVar3 = (lgz) n2.b;
                    lgz lgzVar4 = lgz.a;
                    lgzVar3.d = lewVar;
                    lgzVar3.b |= 2;
                }
                if (gtxVar.e == j) {
                    this.i = gtxVar;
                } else if (this.j == null) {
                    gtz j10 = guc.j(gxf.a, (guc) this.o.get(gtxVar.d, gub.a));
                    if (j10.b() && ((gxe) j10.a()).b()) {
                        this.j = gtxVar;
                        jkj n3 = n(e(gtxVar));
                        if (!n3.b.M()) {
                            n3.t();
                        }
                        lgz lgzVar5 = (lgz) n3.b;
                        lgz lgzVar6 = lgz.a;
                        lgzVar5.b |= i;
                        lgzVar5.e = true;
                    }
                }
                if ((gtxVar.b & 256) != 0) {
                    jkj n4 = n(e(gtxVar));
                    boolean z = gtxVar.k;
                    if (!n4.b.M()) {
                        n4.t();
                    }
                    lgz lgzVar7 = (lgz) n4.b;
                    lgz lgzVar8 = lgz.a;
                    lgzVar7.b |= 8;
                    lgzVar7.f = z;
                }
                g = g(gtxVar);
                f = f(gtxVar);
                if (g < this.g) {
                    this.g = g;
                }
                if (f > this.h) {
                    this.h = f;
                }
                j6 = gtxVar.f + gtxVar.h;
                if (j6 > this.f) {
                    this.f = j6;
                }
                SparseArray sparseArray = this.o;
                hoq hoqVar = eif.a;
                int i8 = gtxVar.d;
                guc gucVar = gub.a;
                j7 = guc.j(hoqVar, (guc) sparseArray.get(i8, gucVar));
                if (j7.b()) {
                    Long l = (Long) j7.a();
                    l.longValue();
                    Long l2 = this.b;
                    if (l2 == null) {
                        this.b = l;
                    } else {
                        boolean equals = l2.equals(l);
                        Long l3 = this.b;
                        if (!equals) {
                            Object[] objArr = new Object[i2];
                            objArr[0] = l3;
                            objArr[1] = l;
                            throw new IllegalStateException(hoq.w("Expected all spans in a TikTok trace to share the same Dapper Trace ID, but found %s and %s", objArr));
                        }
                    }
                }
                j8 = guc.j(eif.b, (guc) sparseArray.get(gtxVar.d, gucVar));
                if (j8.b()) {
                    this.c.put(Long.valueOf(e(gtxVar)), (Long) j8.a());
                }
                zArr[gtxVar.d] = true;
            }
            if (i7 != 3) {
                throw new AssertionError("Invalid span kind for span: " + gtxVar.d);
            }
        }
        j = -1;
        int y4 = a.y(i6);
        hoq.H((y4 != 0 && y4 == 2) || ((y = a.y(i6)) != 0 && y == 4));
        int y5 = a.y(gtxVar.l);
        boolean z2 = y5 != 0 && y5 == 2;
        gxk h2 = h(gtxVar);
        long j11 = h2.a;
        if (gtxVar.k) {
            j2 = 1;
            i = 4;
            i2 = 2;
            j3 = 1;
        } else {
            j2 = 1;
            if (gtxVar.e == -1) {
                j3 = this.s;
                i = 4;
                i2 = 2;
            } else {
                i = 4;
                i2 = 2;
                if (h2.b.f()) {
                    j3 = this.s;
                } else {
                    j3 = 0;
                }
            }
            this.s = j3 + 1;
        }
        gzp gzpVar2 = h2.b;
        if (gzpVar2.f()) {
            gxj gxjVar = (gxj) gzpVar2.b();
            j11 = gxjVar.a;
            if (g(gtxVar) == gxjVar.b) {
                j4 = j3;
                z2 = true;
                j5 = j2;
                i3 = gtxVar.e;
                long j12 = j4;
                if (i3 != -1) {
                    long d2 = d(i3);
                    if (d2 != j11) {
                        jkj n5 = n(e(gtxVar));
                        if (!n5.b.M()) {
                            n5.t();
                        }
                        lgz lgzVar9 = (lgz) n5.b;
                        lgz lgzVar10 = lgz.a;
                        lgzVar9.b |= 32;
                        lgzVar9.h = d2;
                    }
                }
                if (z2) {
                    k(e(gtxVar), j(gtxVar, 0L), m(gtxVar, j11));
                } else {
                    l(gtxVar, j11, j12, 0L, null, j5);
                }
                a = a(gtxVar);
                if (a.f()) {
                }
                if (gtxVar.e == j) {
                }
                if ((gtxVar.b & 256) != 0) {
                }
                g = g(gtxVar);
                f = f(gtxVar);
                if (g < this.g) {
                }
                if (f > this.h) {
                }
                j6 = gtxVar.f + gtxVar.h;
                if (j6 > this.f) {
                }
                SparseArray sparseArray2 = this.o;
                hoq hoqVar2 = eif.a;
                int i82 = gtxVar.d;
                guc gucVar2 = gub.a;
                j7 = guc.j(hoqVar2, (guc) sparseArray2.get(i82, gucVar2));
                if (j7.b()) {
                }
                j8 = guc.j(eif.b, (guc) sparseArray2.get(gtxVar.d, gucVar2));
                if (j8.b()) {
                }
                zArr[gtxVar.d] = true;
            }
            j4 = j3;
            z2 = true;
        } else {
            j4 = j3;
        }
        j5 = 0;
        i3 = gtxVar.e;
        long j122 = j4;
        if (i3 != -1) {
        }
        if (z2) {
        }
        a = a(gtxVar);
        if (a.f()) {
        }
        if (gtxVar.e == j) {
        }
        if ((gtxVar.b & 256) != 0) {
        }
        g = g(gtxVar);
        f = f(gtxVar);
        if (g < this.g) {
        }
        if (f > this.h) {
        }
        j6 = gtxVar.f + gtxVar.h;
        if (j6 > this.f) {
        }
        SparseArray sparseArray22 = this.o;
        hoq hoqVar22 = eif.a;
        int i822 = gtxVar.d;
        guc gucVar22 = gub.a;
        j7 = guc.j(hoqVar22, (guc) sparseArray22.get(i822, gucVar22));
        if (j7.b()) {
        }
        j8 = guc.j(eif.b, (guc) sparseArray22.get(gtxVar.d, gucVar22));
        if (j8.b()) {
        }
        zArr[gtxVar.d] = true;
    }
}
