package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.util.Pair;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class j1 implements oc4, pd4 {

    /* renamed from: x, reason: collision with root package name */
    public static final vc4 f6904x = new vc4() { // from class: com.google.android.gms.internal.ads.g1
        @Override // com.google.android.gms.internal.ads.vc4
        public final /* synthetic */ oc4[] a(Uri uri, Map map) {
            return uc4.a(this, uri, map);
        }

        @Override // com.google.android.gms.internal.ads.vc4
        public final oc4[] zza() {
            vc4 vc4Var = j1.f6904x;
            return new oc4[]{new j1(0)};
        }
    };

    /* renamed from: i, reason: collision with root package name */
    private int f6913i;

    /* renamed from: j, reason: collision with root package name */
    private long f6914j;

    /* renamed from: k, reason: collision with root package name */
    private int f6915k;

    /* renamed from: l, reason: collision with root package name */
    private dr2 f6916l;

    /* renamed from: n, reason: collision with root package name */
    private int f6918n;

    /* renamed from: o, reason: collision with root package name */
    private int f6919o;

    /* renamed from: p, reason: collision with root package name */
    private int f6920p;

    /* renamed from: q, reason: collision with root package name */
    private rc4 f6921q;

    /* renamed from: r, reason: collision with root package name */
    private i1[] f6922r;

    /* renamed from: s, reason: collision with root package name */
    private long[][] f6923s;

    /* renamed from: t, reason: collision with root package name */
    private int f6924t;

    /* renamed from: u, reason: collision with root package name */
    private long f6925u;

    /* renamed from: v, reason: collision with root package name */
    private int f6926v;

    /* renamed from: w, reason: collision with root package name */
    private m f6927w;

    /* renamed from: h, reason: collision with root package name */
    private int f6912h = 0;

    /* renamed from: f, reason: collision with root package name */
    private final m1 f6910f = new m1();

    /* renamed from: g, reason: collision with root package name */
    private final List<b81> f6911g = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final dr2 f6908d = new dr2(16);

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<o0> f6909e = new ArrayDeque<>();

    /* renamed from: a, reason: collision with root package name */
    private final dr2 f6905a = new dr2(th2.f12217a);

    /* renamed from: b, reason: collision with root package name */
    private final dr2 f6906b = new dr2(4);

    /* renamed from: c, reason: collision with root package name */
    private final dr2 f6907c = new dr2();

    /* renamed from: m, reason: collision with root package name */
    private int f6917m = -1;

    public j1(int i7) {
    }

    private static int j(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static int k(r1 r1Var, long j7) {
        int a7 = r1Var.a(j7);
        return a7 == -1 ? r1Var.b(j7) : a7;
    }

    private static long l(r1 r1Var, long j7, long j8) {
        int k7 = k(r1Var, j7);
        return k7 == -1 ? j8 : Math.min(r1Var.f10959c[k7], j8);
    }

    private final void m() {
        this.f6912h = 0;
        this.f6915k = 0;
    }

    private final void n(long j7) {
        j1 j1Var;
        c91 c91Var;
        c91 c91Var2;
        long j8;
        List<r1> list;
        int i7;
        j1 j1Var2;
        c91 c91Var3;
        char c7;
        int i8;
        j1 j1Var3 = this;
        while (!j1Var3.f6909e.isEmpty() && j1Var3.f6909e.peek().f9410b == j7) {
            o0 pop = j1Var3.f6909e.pop();
            if (pop.f10494a == 1836019574) {
                ArrayList arrayList = new ArrayList();
                boolean z6 = j1Var3.f6926v == 1;
                fd4 fd4Var = new fd4();
                p0 d7 = pop.d(1969517665);
                if (d7 != null) {
                    Pair<c91, c91> a7 = x0.a(d7);
                    c91 c91Var4 = (c91) a7.first;
                    c91 c91Var5 = (c91) a7.second;
                    if (c91Var4 != null) {
                        fd4Var.b(c91Var4);
                    }
                    c91Var = c91Var5;
                    c91Var2 = c91Var4;
                } else {
                    c91Var = null;
                    c91Var2 = null;
                }
                o0 c8 = pop.c(1835365473);
                c91 b7 = c8 != null ? x0.b(c8) : null;
                List<r1> c9 = x0.c(pop, fd4Var, -9223372036854775807L, null, false, z6, new e43() { // from class: com.google.android.gms.internal.ads.h1
                    @Override // com.google.android.gms.internal.ads.e43
                    public final Object apply(Object obj) {
                        o1 o1Var = (o1) obj;
                        vc4 vc4Var = j1.f6904x;
                        return o1Var;
                    }
                });
                rc4 rc4Var = j1Var3.f6921q;
                Objects.requireNonNull(rc4Var);
                int size = c9.size();
                long j9 = -9223372036854775807L;
                long j10 = -9223372036854775807L;
                int i9 = 0;
                int i10 = -1;
                while (true) {
                    j8 = 0;
                    if (i9 >= size) {
                        break;
                    }
                    r1 r1Var = c9.get(i9);
                    if (r1Var.f10958b == 0) {
                        j1Var2 = j1Var3;
                        list = c9;
                        i7 = size;
                    } else {
                        o1 o1Var = r1Var.f10957a;
                        ArrayList arrayList2 = arrayList;
                        long j11 = o1Var.f9429e;
                        if (j11 == j9) {
                            j11 = r1Var.f10964h;
                        }
                        long max = Math.max(j10, j11);
                        i1 i1Var = new i1(o1Var, r1Var, rc4Var.r(i9, o1Var.f9426b));
                        int i11 = r1Var.f10961e;
                        list = c9;
                        bf4 b8 = o1Var.f9430f.b();
                        b8.l(i11 + 30);
                        i7 = size;
                        if (o1Var.f9426b == 2 && j11 > 0 && (i8 = r1Var.f10958b) > 1) {
                            b8.e(i8 / (j11 / 1000000.0f));
                        }
                        int i12 = o1Var.f9426b;
                        int i13 = f1.f4937b;
                        if (i12 == 1 && fd4Var.a()) {
                            b8.c(fd4Var.f5092a);
                            b8.d(fd4Var.f5093b);
                        }
                        int i14 = o1Var.f9426b;
                        c91[] c91VarArr = new c91[2];
                        c91VarArr[0] = c91Var;
                        j1Var2 = this;
                        if (j1Var2.f6911g.isEmpty()) {
                            c7 = 1;
                            c91Var3 = null;
                        } else {
                            c91Var3 = new c91(j1Var2.f6911g);
                            c7 = 1;
                        }
                        c91VarArr[c7] = c91Var3;
                        c91 c91Var6 = new c91(new b81[0]);
                        if (i14 == 1) {
                            if (c91Var2 != null) {
                                c91Var6 = c91Var2;
                            }
                        } else if (i14 == 2 && b7 != null) {
                            int i15 = 0;
                            while (true) {
                                if (i15 >= b7.a()) {
                                    break;
                                }
                                b81 c10 = b7.c(i15);
                                if (c10 instanceof j) {
                                    j jVar = (j) c10;
                                    if ("com.android.capture.fps".equals(jVar.f6872f)) {
                                        c91Var6 = new c91(jVar);
                                        break;
                                    }
                                }
                                i15++;
                            }
                        }
                        for (int i16 = 0; i16 < 2; i16++) {
                            c91Var6 = c91Var6.h(c91VarArr[i16]);
                        }
                        if (c91Var6.a() > 0) {
                            b8.m(c91Var6);
                        }
                        i1Var.f6482c.b(b8.y());
                        if (o1Var.f9426b == 2 && i10 == -1) {
                            i10 = arrayList2.size();
                        }
                        arrayList = arrayList2;
                        arrayList.add(i1Var);
                        j10 = max;
                    }
                    i9++;
                    j1Var3 = j1Var2;
                    c9 = list;
                    size = i7;
                    j9 = -9223372036854775807L;
                }
                j1Var = j1Var3;
                j1Var.f6924t = i10;
                j1Var.f6925u = j10;
                i1[] i1VarArr = (i1[]) arrayList.toArray(new i1[0]);
                j1Var.f6922r = i1VarArr;
                int length = i1VarArr.length;
                long[][] jArr = new long[length][];
                int[] iArr = new int[length];
                long[] jArr2 = new long[length];
                boolean[] zArr = new boolean[length];
                for (int i17 = 0; i17 < i1VarArr.length; i17++) {
                    jArr[i17] = new long[i1VarArr[i17].f6481b.f10958b];
                    jArr2[i17] = i1VarArr[i17].f6481b.f10962f[0];
                }
                int i18 = 0;
                while (i18 < i1VarArr.length) {
                    long j12 = Long.MAX_VALUE;
                    int i19 = -1;
                    for (int i20 = 0; i20 < i1VarArr.length; i20++) {
                        if (!zArr[i20]) {
                            long j13 = jArr2[i20];
                            if (j13 <= j12) {
                                i19 = i20;
                                j12 = j13;
                            }
                        }
                    }
                    int i21 = iArr[i19];
                    long[] jArr3 = jArr[i19];
                    jArr3[i21] = j8;
                    r1 r1Var2 = i1VarArr[i19].f6481b;
                    j8 += r1Var2.f10960d[i21];
                    int i22 = i21 + 1;
                    iArr[i19] = i22;
                    if (i22 < jArr3.length) {
                        jArr2[i19] = r1Var2.f10962f[i22];
                    } else {
                        zArr[i19] = true;
                        i18++;
                    }
                }
                j1Var.f6923s = jArr;
                rc4Var.H();
                rc4Var.p(j1Var);
                j1Var.f6909e.clear();
                j1Var.f6912h = 2;
            } else {
                j1Var = j1Var3;
                if (!j1Var.f6909e.isEmpty()) {
                    j1Var.f6909e.peek().e(pop);
                }
            }
            j1Var3 = j1Var;
        }
        if (j1Var3.f6912h != 2) {
            m();
        }
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final long b() {
        return this.f6925u;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final boolean c(pc4 pc4Var) {
        return n1.b(pc4Var, false);
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final nd4 d(long j7) {
        long j8;
        long j9;
        int b7;
        i1[] i1VarArr = this.f6922r;
        Objects.requireNonNull(i1VarArr);
        if (i1VarArr.length == 0) {
            qd4 qd4Var = qd4.f10660c;
            return new nd4(qd4Var, qd4Var);
        }
        int i7 = this.f6924t;
        long j10 = -1;
        if (i7 != -1) {
            r1 r1Var = i1VarArr[i7].f6481b;
            int k7 = k(r1Var, j7);
            if (k7 == -1) {
                qd4 qd4Var2 = qd4.f10660c;
                return new nd4(qd4Var2, qd4Var2);
            }
            long j11 = r1Var.f10962f[k7];
            j8 = r1Var.f10959c[k7];
            if (j11 >= j7 || k7 >= r1Var.f10958b - 1 || (b7 = r1Var.b(j7)) == -1 || b7 == k7) {
                j9 = -9223372036854775807L;
            } else {
                j9 = r1Var.f10962f[b7];
                j10 = r1Var.f10959c[b7];
            }
            j7 = j11;
        } else {
            j8 = Long.MAX_VALUE;
            j9 = -9223372036854775807L;
        }
        int i8 = 0;
        while (true) {
            i1[] i1VarArr2 = this.f6922r;
            if (i8 >= i1VarArr2.length) {
                break;
            }
            if (i8 != this.f6924t) {
                r1 r1Var2 = i1VarArr2[i8].f6481b;
                long l7 = l(r1Var2, j7, j8);
                if (j9 != -9223372036854775807L) {
                    j10 = l(r1Var2, j9, j10);
                }
                j8 = l7;
            }
            i8++;
        }
        qd4 qd4Var3 = new qd4(j7, j8);
        return j9 == -9223372036854775807L ? new nd4(qd4Var3, qd4Var3) : new nd4(qd4Var3, new qd4(j9, j10));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03d9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x02ae  */
    @Override // com.google.android.gms.internal.ads.oc4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(pc4 pc4Var, md4 md4Var) {
        long j7;
        int i7;
        boolean z6;
        boolean z7;
        long b7;
        o0 peek;
        long j8;
        int i8;
        dr2 dr2Var;
        while (true) {
            int i9 = this.f6912h;
            if (i9 == 0) {
                if (this.f6915k == 0) {
                    if (!pc4Var.m(this.f6908d.h(), 0, 8, true)) {
                        return -1;
                    }
                    this.f6915k = 8;
                    this.f6908d.f(0);
                    this.f6914j = this.f6908d.A();
                    this.f6913i = this.f6908d.m();
                }
                long j9 = this.f6914j;
                if (j9 == 1) {
                    pc4Var.e(this.f6908d.h(), 8, 8);
                    this.f6915k += 8;
                    b7 = this.f6908d.B();
                } else {
                    if (j9 == 0) {
                        long c7 = pc4Var.c();
                        if (c7 == -1 && (peek = this.f6909e.peek()) != null) {
                            c7 = peek.f9410b;
                        }
                        if (c7 != -1) {
                            b7 = (c7 - pc4Var.b()) + this.f6915k;
                        }
                    }
                    j8 = this.f6914j;
                    i8 = this.f6915k;
                    if (j8 >= i8) {
                        throw dz.c("Atom size less than header length (unsupported).");
                    }
                    int i10 = this.f6913i;
                    if (i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1701082227 || i10 == 1835365473) {
                        long b8 = pc4Var.b();
                        long j10 = this.f6914j;
                        long j11 = this.f6915k;
                        long j12 = (b8 + j10) - j11;
                        if (j10 != j11 && this.f6913i == 1835365473) {
                            this.f6907c.c(8);
                            pc4Var.f(this.f6907c.h(), 0, 8);
                            x0.d(this.f6907c);
                            pc4Var.l(this.f6907c.k());
                            pc4Var.i();
                        }
                        this.f6909e.push(new o0(this.f6913i, j12));
                        if (this.f6914j == this.f6915k) {
                            n(j12);
                        } else {
                            m();
                        }
                    } else {
                        if (i10 == 1835296868 || i10 == 1836476516 || i10 == 1751411826 || i10 == 1937011556 || i10 == 1937011827 || i10 == 1937011571 || i10 == 1668576371 || i10 == 1701606260 || i10 == 1937011555 || i10 == 1937011578 || i10 == 1937013298 || i10 == 1937007471 || i10 == 1668232756 || i10 == 1953196132 || i10 == 1718909296 || i10 == 1969517665 || i10 == 1801812339 || i10 == 1768715124) {
                            wu1.f(i8 == 8);
                            wu1.f(this.f6914j <= 2147483647L);
                            dr2Var = new dr2((int) this.f6914j);
                            System.arraycopy(this.f6908d.h(), 0, dr2Var.h(), 0, 8);
                        } else {
                            long b9 = pc4Var.b();
                            long j13 = this.f6915k;
                            long j14 = b9 - j13;
                            if (this.f6913i == 1836086884) {
                                this.f6927w = new m(0L, j14, -9223372036854775807L, j14 + j13, this.f6914j - j13);
                            }
                            dr2Var = null;
                        }
                        this.f6916l = dr2Var;
                        this.f6912h = 1;
                    }
                }
                this.f6914j = b7;
                j8 = this.f6914j;
                i8 = this.f6915k;
                if (j8 >= i8) {
                }
            } else {
                if (i9 != 1) {
                    long b10 = pc4Var.b();
                    if (this.f6917m == -1) {
                        long j15 = Long.MAX_VALUE;
                        long j16 = Long.MAX_VALUE;
                        long j17 = Long.MAX_VALUE;
                        int i11 = -1;
                        boolean z8 = true;
                        boolean z9 = true;
                        int i12 = -1;
                        for (int i13 = 0; i13 < ((i1[]) n13.c(this.f6922r)).length; i13++) {
                            i1 i1Var = this.f6922r[i13];
                            int i14 = i1Var.f6483d;
                            r1 r1Var = i1Var.f6481b;
                            if (i14 != r1Var.f10958b) {
                                long j18 = r1Var.f10959c[i14];
                                long j19 = ((long[][]) n13.c(this.f6923s))[i13][i14];
                                long j20 = j18 - b10;
                                boolean z10 = j20 < 0 || j20 >= 262144;
                                if (z10) {
                                    z6 = z9;
                                } else {
                                    if (!z9) {
                                        z6 = false;
                                    }
                                    i11 = i13;
                                    z9 = z10;
                                    j16 = j20;
                                    j17 = j19;
                                    if (j19 < j15) {
                                        i12 = i13;
                                        z8 = z10;
                                        j15 = j19;
                                    }
                                }
                                if (z10 != z6 || j20 >= j16) {
                                    z9 = z6;
                                    if (j19 < j15) {
                                    }
                                }
                                i11 = i13;
                                z9 = z10;
                                j16 = j20;
                                j17 = j19;
                                if (j19 < j15) {
                                }
                            }
                        }
                        if (j15 != Long.MAX_VALUE && z8 && j17 >= j15 + 10485760) {
                            i11 = i12;
                        }
                        this.f6917m = i11;
                        if (i11 == -1) {
                            return -1;
                        }
                    }
                    i1 i1Var2 = ((i1[]) n13.c(this.f6922r))[this.f6917m];
                    td4 td4Var = i1Var2.f6482c;
                    int i15 = i1Var2.f6483d;
                    r1 r1Var2 = i1Var2.f6481b;
                    long j21 = r1Var2.f10959c[i15];
                    int i16 = r1Var2.f10960d[i15];
                    long j22 = (j21 - b10) + this.f6918n;
                    if (j22 < 0 || j22 >= 262144) {
                        md4Var.f8503a = j21;
                        return 1;
                    }
                    if (i1Var2.f6480a.f9431g == 1) {
                        i7 = i16 - 8;
                        j7 = j22 + 8;
                    } else {
                        j7 = j22;
                        i7 = i16;
                    }
                    pc4Var.l((int) j7);
                    o1 o1Var = i1Var2.f6480a;
                    if (o1Var.f9434j == 0) {
                        if ("audio/ac4".equals(o1Var.f9430f.f3660l)) {
                            if (this.f6919o == 0) {
                                wb4.b(i7, this.f6907c);
                                rd4.b(td4Var, this.f6907c, 7);
                                this.f6919o += 7;
                            }
                            i7 += 7;
                        }
                        while (true) {
                            int i17 = this.f6919o;
                            if (i17 >= i7) {
                                break;
                            }
                            int a7 = rd4.a(td4Var, pc4Var, i7 - i17, false);
                            this.f6918n += a7;
                            this.f6919o += a7;
                            this.f6920p -= a7;
                        }
                    } else {
                        byte[] h7 = this.f6906b.h();
                        h7[0] = 0;
                        h7[1] = 0;
                        h7[2] = 0;
                        int i18 = i1Var2.f6480a.f9434j;
                        int i19 = 4 - i18;
                        while (this.f6919o < i7) {
                            int i20 = this.f6920p;
                            if (i20 == 0) {
                                pc4Var.e(h7, i19, i18);
                                this.f6918n += i18;
                                this.f6906b.f(0);
                                int m7 = this.f6906b.m();
                                if (m7 < 0) {
                                    throw dz.a("Invalid NAL length", null);
                                }
                                this.f6920p = m7;
                                this.f6905a.f(0);
                                rd4.b(td4Var, this.f6905a, 4);
                                this.f6919o += 4;
                                i7 += i19;
                            } else {
                                int a8 = rd4.a(td4Var, pc4Var, i20, false);
                                this.f6918n += a8;
                                this.f6919o += a8;
                                this.f6920p -= a8;
                            }
                        }
                    }
                    r1 r1Var3 = i1Var2.f6481b;
                    td4Var.a(r1Var3.f10962f[i15], r1Var3.f10963g[i15], i7, 0, null);
                    i1Var2.f6483d++;
                    this.f6917m = -1;
                    this.f6918n = 0;
                    this.f6919o = 0;
                    this.f6920p = 0;
                    return 0;
                }
                long j23 = this.f6914j - this.f6915k;
                long b11 = pc4Var.b() + j23;
                dr2 dr2Var2 = this.f6916l;
                if (dr2Var2 != null) {
                    pc4Var.e(dr2Var2.h(), this.f6915k, (int) j23);
                    if (this.f6913i == 1718909296) {
                        dr2Var2.f(8);
                        int j24 = j(dr2Var2.m());
                        if (j24 == 0) {
                            dr2Var2.g(4);
                            while (true) {
                                if (dr2Var2.i() <= 0) {
                                    j24 = 0;
                                    break;
                                }
                                j24 = j(dr2Var2.m());
                                if (j24 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f6926v = j24;
                    } else if (!this.f6909e.isEmpty()) {
                        this.f6909e.peek().f(new p0(this.f6913i, dr2Var2));
                    }
                } else if (j23 < 262144) {
                    pc4Var.l((int) j23);
                } else {
                    md4Var.f8503a = pc4Var.b() + j23;
                    z7 = true;
                    n(b11);
                    if (z7 && this.f6912h != 2) {
                        return 1;
                    }
                }
                z7 = false;
                n(b11);
                if (z7) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.pd4
    public final boolean f() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void g(rc4 rc4Var) {
        this.f6921q = rc4Var;
    }

    @Override // com.google.android.gms.internal.ads.oc4
    public final void h(long j7, long j8) {
        this.f6909e.clear();
        this.f6915k = 0;
        this.f6917m = -1;
        this.f6918n = 0;
        this.f6919o = 0;
        this.f6920p = 0;
        if (j7 == 0) {
            m();
            return;
        }
        i1[] i1VarArr = this.f6922r;
        if (i1VarArr != null) {
            for (i1 i1Var : i1VarArr) {
                r1 r1Var = i1Var.f6481b;
                int a7 = r1Var.a(j8);
                if (a7 == -1) {
                    a7 = r1Var.b(j8);
                }
                i1Var.f6483d = a7;
            }
        }
    }
}
