package S0;

import E.AbstractC0005f;
import T.C0096n;
import T.C0097o;
import T.D;
import T.E;
import a.AbstractC0124a;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import v2.G;
import v2.I;
import v2.a0;
import y0.AbstractC1569a;
import y0.C;
import y0.F;

/* loaded from: classes.dex */
public final class s implements y0.n {

    /* renamed from: A, reason: collision with root package name */
    public long f2500A;

    /* renamed from: B, reason: collision with root package name */
    public y0.p f2501B;

    /* renamed from: C, reason: collision with root package name */
    public r[] f2502C;

    /* renamed from: D, reason: collision with root package name */
    public long[][] f2503D;

    /* renamed from: E, reason: collision with root package name */
    public int f2504E;

    /* renamed from: F, reason: collision with root package name */
    public H0.b f2505F;

    /* renamed from: a, reason: collision with root package name */
    public final V0.j f2506a;

    /* renamed from: b, reason: collision with root package name */
    public final int f2507b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2508c;

    /* renamed from: d, reason: collision with root package name */
    public final W.u f2509d;

    /* renamed from: e, reason: collision with root package name */
    public final W.u f2510e;

    /* renamed from: f, reason: collision with root package name */
    public final W.u f2511f;

    /* renamed from: g, reason: collision with root package name */
    public final W.u f2512g;

    /* renamed from: h, reason: collision with root package name */
    public final ArrayDeque f2513h;

    /* renamed from: i, reason: collision with root package name */
    public final v f2514i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f2515j;

    /* renamed from: k, reason: collision with root package name */
    public a0 f2516k;

    /* renamed from: l, reason: collision with root package name */
    public int f2517l;

    /* renamed from: m, reason: collision with root package name */
    public int f2518m;
    public long n;
    public int o;

    /* renamed from: p, reason: collision with root package name */
    public W.u f2519p;

    /* renamed from: q, reason: collision with root package name */
    public int f2520q;

    /* renamed from: r, reason: collision with root package name */
    public int f2521r;

    /* renamed from: s, reason: collision with root package name */
    public int f2522s;

    /* renamed from: t, reason: collision with root package name */
    public int f2523t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f2524u;
    public boolean v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f2525w;

    /* renamed from: x, reason: collision with root package name */
    public long f2526x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f2527y;
    public boolean z;

    public s(V0.j jVar, int i4) {
        this.f2506a = jVar;
        this.f2507b = i4;
        this.f2508c = (i4 & 256) != 0;
        G g4 = I.f15571b;
        this.f2516k = a0.f15605e;
        this.f2517l = (i4 & 4) != 0 ? 3 : 0;
        this.f2514i = new v();
        this.f2515j = new ArrayList();
        this.f2512g = new W.u(16);
        this.f2513h = new ArrayDeque();
        this.f2509d = new W.u(X.p.f3552a);
        this.f2510e = new W.u(6);
        this.f2511f = new W.u();
        this.f2520q = -1;
        this.f2501B = y0.p.f16182y0;
        this.f2502C = new r[0];
    }

    @Override // y0.n
    public final void a(long j4, long j5) {
        this.f2513h.clear();
        this.o = 0;
        this.f2520q = -1;
        this.f2521r = 0;
        this.f2522s = 0;
        this.f2523t = 0;
        this.f2524u = false;
        this.z = false;
        if (j4 == 0) {
            if (this.f2517l != 3) {
                this.f2517l = 0;
                this.o = 0;
                return;
            } else {
                v vVar = this.f2514i;
                vVar.f2533a.clear();
                vVar.f2534b = 0;
                this.f2515j.clear();
                return;
            }
        }
        for (r rVar : this.f2502C) {
            A a3 = rVar.f2495b;
            int a4 = a3.a(j5);
            if (a4 == -1) {
                a4 = a3.b(j5);
            }
            rVar.f2498e = a4;
            y0.G g4 = rVar.f2497d;
            if (g4 != null) {
                g4.f16089b = false;
                g4.f16090c = 0;
            }
        }
    }

    @Override // y0.n
    public final boolean b(y0.o oVar) {
        a0 a0Var;
        C l4 = w.l(oVar, false, (this.f2507b & 2) != 0);
        if (l4 != null) {
            a0Var = I.o(l4);
        } else {
            G g4 = I.f15571b;
            a0Var = a0.f15605e;
        }
        this.f2516k = a0Var;
        return l4 == null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0658, code lost:
    
        throw T.G.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:163:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0591 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0012 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x000e A[EDGE_INSN: B:29:0x000e->B:5:0x000e BREAK  A[LOOP:0: B:8:0x0012->B:28:0x0012], SYNTHETIC] */
    @Override // y0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(y0.o oVar, T.r rVar) {
        char c4;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        char c5;
        char c6;
        boolean z;
        X.c cVar;
        boolean z4;
        boolean z5;
        if (!this.f2508c || !this.z) {
            while (true) {
                int i10 = this.f2517l;
                ArrayDeque arrayDeque = this.f2513h;
                int i11 = this.f2507b;
                W.u uVar = this.f2511f;
                int i12 = 4;
                int i13 = 2;
                if (i10 == 0) {
                    int i14 = this.o;
                    W.u uVar2 = this.f2512g;
                    if (i14 == 0) {
                        if (!oVar.d(uVar2.f3351a, 0, 8, true)) {
                            if (this.f2504E == 2 && (i11 & 2) != 0) {
                                F z6 = this.f2501B.z(0, 4);
                                H0.b bVar = this.f2505F;
                                E e4 = bVar == null ? null : new E(bVar);
                                C0096n c0096n = new C0096n();
                                c0096n.f2829k = e4;
                                AbstractC0005f.w(c0096n, z6);
                                this.f2501B.r();
                                this.f2501B.x(new A0.b(-9223372036854775807L));
                            }
                            z5 = false;
                            if (z5) {
                                break;
                            }
                        } else {
                            this.o = 8;
                            uVar2.M(0);
                            this.n = uVar2.B();
                            this.f2518m = uVar2.m();
                        }
                    }
                    long j4 = this.n;
                    if (j4 == 1) {
                        oVar.readFully(uVar2.f3351a, 8, 8);
                        this.o += 8;
                        this.n = uVar2.F();
                    } else if (j4 == 0) {
                        long length = oVar.getLength();
                        if (length == -1 && (cVar = (X.c) arrayDeque.peek()) != null) {
                            length = cVar.f3491c;
                        }
                        if (length != -1) {
                            this.n = (length - oVar.getPosition()) + this.o;
                        }
                    }
                    long j5 = this.n;
                    int i15 = this.o;
                    long j6 = i15;
                    if (j5 < j6) {
                        if (this.f2518m != 1718773093 || i15 != 8) {
                            break;
                        }
                        this.n = j6;
                    }
                    int i16 = this.f2518m;
                    if (i16 == 1836019574 || i16 == 1953653099 || i16 == 1835297121 || i16 == 1835626086 || i16 == 1937007212 || i16 == 1701082227 || i16 == 1835365473 || i16 == 1635284069) {
                        z4 = true;
                        long position = oVar.getPosition();
                        long j7 = this.n;
                        long j8 = this.o;
                        long j9 = (position + j7) - j8;
                        if (j7 != j8 && this.f2518m == 1835365473) {
                            uVar.J(8);
                            oVar.E(uVar.f3351a, 0, 8);
                            j.a(uVar);
                            oVar.v(uVar.f3352b);
                            oVar.u();
                        }
                        arrayDeque.push(new X.c(this.f2518m, j9));
                        if (this.n == this.o) {
                            f(j9);
                        } else {
                            this.f2517l = 0;
                            this.o = 0;
                        }
                    } else if (i16 == 1835296868 || i16 == 1836476516 || i16 == 1751411826 || i16 == 1937011556 || i16 == 1937011827 || i16 == 1937011571 || i16 == 1668576371 || i16 == 1701606260 || i16 == 1937011555 || i16 == 1937011578 || i16 == 1937013298 || i16 == 1937007471 || i16 == 1668232756 || i16 == 1953196132 || i16 == 1718909296 || i16 == 1969517665 || i16 == 1801812339 || i16 == 1768715124) {
                        AbstractC0124a.t(i15 == 8);
                        AbstractC0124a.t(this.n <= 2147483647L);
                        W.u uVar3 = new W.u((int) this.n);
                        System.arraycopy(uVar2.f3351a, 0, uVar3.f3351a, 0, 8);
                        this.f2519p = uVar3;
                        z4 = true;
                        this.f2517l = 1;
                    } else {
                        long position2 = oVar.getPosition();
                        long j10 = this.o;
                        long j11 = position2 - j10;
                        if (this.f2518m == 1836086884) {
                            this.f2505F = new H0.b(0L, j11, -9223372036854775807L, j11 + j10, this.n - j10);
                        }
                        this.f2519p = null;
                        this.f2517l = 1;
                        z4 = true;
                    }
                    z5 = z4;
                    if (z5) {
                    }
                } else {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException();
                            }
                            v vVar = this.f2514i;
                            ArrayList arrayList = vVar.f2533a;
                            int i17 = vVar.f2534b;
                            if (i17 != 0) {
                                if (i17 != 1) {
                                    short s4 = 2817;
                                    int i18 = 8;
                                    short s5 = 2192;
                                    if (i17 == 2) {
                                        long length2 = oVar.getLength();
                                        int i19 = vVar.f2535c - 20;
                                        W.u uVar4 = new W.u(i19);
                                        oVar.readFully(uVar4.f3351a, 0, i19);
                                        int i20 = 0;
                                        while (i20 < i19 / 12) {
                                            uVar4.N(i13);
                                            uVar4.f(i13);
                                            byte[] bArr = uVar4.f3351a;
                                            int i21 = uVar4.f3352b;
                                            int i22 = i13;
                                            int i23 = i21 + 1;
                                            uVar4.f3352b = i23;
                                            int i24 = bArr[i21] & 255;
                                            uVar4.f3352b = i21 + 2;
                                            short s6 = (short) (i24 | ((bArr[i23] & 255) << 8));
                                            if (s6 != s5 && s6 != 2816 && s6 != s4) {
                                                if (s6 != 2819 && s6 != 2820) {
                                                    uVar4.N(i18);
                                                    i9 = i19;
                                                    i20++;
                                                    i19 = i9;
                                                    i13 = i22;
                                                    s4 = 2817;
                                                    s5 = 2192;
                                                    i18 = 8;
                                                }
                                            }
                                            i9 = i19;
                                            arrayList.add(new u((length2 - vVar.f2535c) - uVar4.o(), uVar4.o()));
                                            i20++;
                                            i19 = i9;
                                            i13 = i22;
                                            s4 = 2817;
                                            s5 = 2192;
                                            i18 = 8;
                                        }
                                        if (arrayList.isEmpty()) {
                                            rVar.f2881a = 0L;
                                        } else {
                                            vVar.f2534b = 3;
                                            rVar.f2881a = ((u) arrayList.get(0)).f2529a;
                                        }
                                    } else {
                                        if (i17 != 3) {
                                            throw new IllegalStateException();
                                        }
                                        long position3 = oVar.getPosition();
                                        int length3 = (int) ((oVar.getLength() - oVar.getPosition()) - vVar.f2535c);
                                        W.u uVar5 = new W.u(length3);
                                        oVar.readFully(uVar5.f3351a, 0, length3);
                                        int i25 = 0;
                                        while (i25 < arrayList.size()) {
                                            u uVar6 = (u) arrayList.get(i25);
                                            uVar5.M((int) (uVar6.f2529a - position3));
                                            uVar5.N(i12);
                                            int o = uVar5.o();
                                            Charset charset = StandardCharsets.UTF_8;
                                            String x4 = uVar5.x(o, charset);
                                            switch (x4.hashCode()) {
                                                case -1711564334:
                                                    if (x4.equals("SlowMotion_Data")) {
                                                        c5 = 0;
                                                        break;
                                                    }
                                                    break;
                                                case -1332107749:
                                                    if (x4.equals("Super_SlowMotion_Edit_Data")) {
                                                        c5 = 1;
                                                        break;
                                                    }
                                                    break;
                                                case -1251387154:
                                                    if (x4.equals("Super_SlowMotion_Data")) {
                                                        c5 = 2;
                                                        break;
                                                    }
                                                    break;
                                                case -830665521:
                                                    if (x4.equals("Super_SlowMotion_Deflickering_On")) {
                                                        c5 = 3;
                                                        break;
                                                    }
                                                    break;
                                                case 1760745220:
                                                    if (x4.equals("Super_SlowMotion_BGM")) {
                                                        c5 = 4;
                                                        break;
                                                    }
                                                    break;
                                            }
                                            c5 = 65535;
                                            switch (c5) {
                                                case 0:
                                                    c6 = 2192;
                                                    break;
                                                case 1:
                                                    c6 = 2819;
                                                    break;
                                                case 2:
                                                    c6 = 2816;
                                                    break;
                                                case 3:
                                                    c6 = 2820;
                                                    break;
                                                case 4:
                                                    c6 = 2817;
                                                    break;
                                                default:
                                                    throw T.G.a(null, "Invalid SEF name");
                                            }
                                            int i26 = uVar6.f2530b - (o + 8);
                                            if (c6 == 2192) {
                                                ArrayList arrayList2 = new ArrayList();
                                                List h2 = v.f2532e.h(uVar5.x(i26, charset));
                                                for (int i27 = 0; i27 < h2.size(); i27++) {
                                                    List h4 = v.f2531d.h((CharSequence) h2.get(i27));
                                                    if (h4.size() != 3) {
                                                        throw T.G.a(null, null);
                                                    }
                                                    try {
                                                        arrayList2.add(new N0.a(1 << (Integer.parseInt((String) h4.get(2)) - 1), Long.parseLong((String) h4.get(0)), Long.parseLong((String) h4.get(1))));
                                                    } catch (NumberFormatException e5) {
                                                        throw T.G.a(e5, null);
                                                    }
                                                }
                                                this.f2515j.add(new N0.b(arrayList2));
                                            } else if (c6 != 2816 && c6 != 2817 && c6 != 2819 && c6 != 2820) {
                                                throw new IllegalStateException();
                                            }
                                            i25++;
                                            i12 = 4;
                                        }
                                        rVar.f2881a = 0L;
                                    }
                                } else {
                                    W.u uVar7 = new W.u(8);
                                    oVar.readFully(uVar7.f3351a, 0, 8);
                                    vVar.f2535c = uVar7.o() + 8;
                                    if (uVar7.m() != 1397048916) {
                                        rVar.f2881a = 0L;
                                    } else {
                                        rVar.f2881a = oVar.getPosition() - (vVar.f2535c - 12);
                                        vVar.f2534b = 2;
                                    }
                                }
                                i8 = 1;
                            } else {
                                long length4 = oVar.getLength();
                                rVar.f2881a = (length4 == -1 || length4 < 8) ? 0L : length4 - 8;
                                i8 = 1;
                                vVar.f2534b = 1;
                            }
                            if (rVar.f2881a != 0) {
                                return i8;
                            }
                            this.f2517l = 0;
                            this.o = 0;
                            return i8;
                        }
                        long position4 = oVar.getPosition();
                        if (this.f2520q == -1) {
                            int i28 = 0;
                            int i29 = -1;
                            int i30 = -1;
                            boolean z7 = true;
                            boolean z8 = true;
                            long j12 = Long.MAX_VALUE;
                            long j13 = Long.MAX_VALUE;
                            long j14 = Long.MAX_VALUE;
                            while (true) {
                                r[] rVarArr = this.f2502C;
                                if (i28 >= rVarArr.length) {
                                    break;
                                }
                                r rVar2 = rVarArr[i28];
                                int i31 = rVar2.f2498e;
                                A a3 = rVar2.f2495b;
                                if (i31 != a3.f2383b) {
                                    long j15 = a3.f2384c[i31];
                                    long[][] jArr = this.f2503D;
                                    jArr.getClass();
                                    long j16 = jArr[i28][i31];
                                    long j17 = j15 - position4;
                                    boolean z9 = j17 < 0 || j17 >= 262144;
                                    if ((!z9 && z8) || (z9 == z8 && j17 < j14)) {
                                        z8 = z9;
                                        i30 = i28;
                                        j14 = j17;
                                        j13 = j16;
                                    }
                                    if (j16 < j12) {
                                        z7 = z9;
                                        i29 = i28;
                                        j12 = j16;
                                    }
                                }
                                i28++;
                            }
                            if (j12 == Long.MAX_VALUE || !z7 || j13 < j12 + 10485760) {
                                i29 = i30;
                            }
                            this.f2520q = i29;
                            if (i29 == -1) {
                                return -1;
                            }
                        }
                        r rVar3 = this.f2502C[this.f2520q];
                        F f4 = rVar3.f2496c;
                        A a4 = rVar3.f2495b;
                        x xVar = rVar3.f2494a;
                        int i32 = rVar3.f2498e;
                        long[] jArr2 = a4.f2384c;
                        int[] iArr = a4.f2385d;
                        long j18 = jArr2[i32] + this.f2500A;
                        int i33 = iArr[i32];
                        y0.G g4 = rVar3.f2497d;
                        long j19 = (j18 - position4) + this.f2521r;
                        if (j19 < 0 || j19 >= 262144) {
                            rVar.f2881a = j18;
                            return 1;
                        }
                        int i34 = xVar.f2544h;
                        int i35 = xVar.f2547k;
                        C0097o c0097o = xVar.f2543g;
                        if (i34 == 1) {
                            j19 += 8;
                            i33 -= 8;
                        }
                        int i36 = i33;
                        oVar.v((int) j19);
                        String str = c0097o.n;
                        String str2 = c0097o.n;
                        if (!Objects.equals(str, "video/avc") ? !Objects.equals(str2, "video/hevc") || (i11 & 128) == 0 : (i11 & 32) == 0) {
                            c4 = 1;
                            this.f2524u = true;
                        } else {
                            c4 = 1;
                        }
                        if (i35 != 0) {
                            W.u uVar8 = this.f2510e;
                            byte[] bArr2 = uVar8.f3351a;
                            bArr2[0] = 0;
                            bArr2[c4] = 0;
                            bArr2[2] = 0;
                            int i37 = 4 - i35;
                            int i38 = i36 + i37;
                            while (this.f2522s < i38) {
                                int i39 = this.f2523t;
                                if (i39 == 0) {
                                    if (this.f2524u || X.p.e(c0097o) + i35 > iArr[i32] - this.f2521r) {
                                        i6 = i35;
                                        i7 = 0;
                                    } else {
                                        i7 = X.p.e(c0097o);
                                        i6 = i35 + i7;
                                    }
                                    oVar.readFully(bArr2, i37, i6);
                                    i5 = i38;
                                    this.f2521r += i6;
                                    uVar8.M(0);
                                    int m4 = uVar8.m();
                                    if (m4 < 0) {
                                        throw T.G.a(null, "Invalid NAL length");
                                    }
                                    this.f2523t = m4 - i7;
                                    W.u uVar9 = this.f2509d;
                                    uVar9.M(0);
                                    int i40 = i7;
                                    f4.a(4, uVar9);
                                    this.f2522s += 4;
                                    if (i40 > 0) {
                                        f4.a(i40, uVar8);
                                        this.f2522s += i40;
                                        if (X.p.d(bArr2, i40, c0097o)) {
                                            this.f2524u = true;
                                        }
                                    }
                                } else {
                                    i5 = i38;
                                    int g5 = f4.g(oVar, i39, false);
                                    this.f2521r += g5;
                                    this.f2522s += g5;
                                    this.f2523t -= g5;
                                }
                                i38 = i5;
                            }
                            i4 = i38;
                        } else {
                            if ("audio/ac4".equals(str2)) {
                                if (this.f2522s == 0) {
                                    AbstractC1569a.i(i36, uVar);
                                    f4.a(7, uVar);
                                    this.f2522s += 7;
                                }
                                i36 += 7;
                            } else if (rVar3.f2499f != null && Objects.equals(str2, "audio/mpeg")) {
                                C0097o c0097o2 = rVar3.f2499f;
                                uVar.J(4);
                                oVar.E(uVar.f3351a, 0, 4);
                                oVar.u();
                                y0.w wVar = new y0.w();
                                F f5 = rVar3.f2496c;
                                if (wVar.a(uVar.m()) && !Objects.equals(c0097o2.n, (String) wVar.f16221g)) {
                                    C0096n a5 = c0097o2.a();
                                    String str3 = (String) wVar.f16221g;
                                    str3.getClass();
                                    a5.f2831m = T.F.n(str3);
                                    c0097o2 = new C0097o(a5);
                                }
                                f5.d(c0097o2);
                                rVar3.f2499f = null;
                            } else if (g4 != null) {
                                g4.c(oVar);
                            }
                            while (true) {
                                int i41 = this.f2522s;
                                if (i41 >= i36) {
                                    break;
                                }
                                int g6 = f4.g(oVar, i36 - i41, false);
                                this.f2521r += g6;
                                this.f2522s += g6;
                                this.f2523t -= g6;
                            }
                            i4 = i36;
                        }
                        long j20 = a4.f2387f[i32];
                        int i42 = a4.f2388g[i32];
                        if (!this.f2524u) {
                            i42 |= 67108864;
                        }
                        int i43 = i42;
                        if (g4 != null) {
                            g4.b(f4, j20, i43, i4, 0, null);
                            if (i32 + 1 == a4.f2383b) {
                                g4.a(f4, null);
                            }
                        } else {
                            f4.e(j20, i43, i4, 0, null);
                        }
                        rVar3.f2498e++;
                        this.f2520q = -1;
                        this.f2521r = 0;
                        this.f2522s = 0;
                        this.f2523t = 0;
                        this.f2524u = false;
                        return 0;
                    }
                    long j21 = this.n - this.o;
                    long position5 = oVar.getPosition() + j21;
                    W.u uVar10 = this.f2519p;
                    if (uVar10 != null) {
                        oVar.readFully(uVar10.f3351a, this.o, (int) j21);
                        if (this.f2518m == 1718909296) {
                            this.v = true;
                            uVar10.M(8);
                            int m5 = uVar10.m();
                            int i44 = m5 != 1751476579 ? m5 != 1903435808 ? 0 : 1 : 2;
                            if (i44 == 0) {
                                uVar10.N(4);
                                while (true) {
                                    if (uVar10.a() <= 0) {
                                        i44 = 0;
                                        break;
                                    }
                                    int m6 = uVar10.m();
                                    i44 = m6 != 1751476579 ? m6 != 1903435808 ? 0 : 1 : 2;
                                    if (i44 != 0) {
                                        break;
                                    }
                                }
                            }
                            this.f2504E = i44;
                        } else if (!arrayDeque.isEmpty()) {
                            ((X.c) arrayDeque.peek()).f3492d.add(new X.d(this.f2518m, uVar10));
                        }
                    } else {
                        if (!this.v && this.f2518m == 1835295092) {
                            this.f2504E = 1;
                        }
                        if (j21 < 262144) {
                            oVar.v((int) j21);
                        } else {
                            rVar.f2881a = oVar.getPosition() + j21;
                            z = true;
                            f(position5);
                            if (this.f2525w) {
                                this.f2527y = true;
                                rVar.f2881a = this.f2526x;
                                this.f2525w = false;
                                z = true;
                            }
                            if (!((z || this.f2517l == 2) ? false : true)) {
                                return 1;
                            }
                        }
                    }
                    z = false;
                    f(position5);
                    if (this.f2525w) {
                    }
                    if (!((z || this.f2517l == 2) ? false : true)) {
                    }
                }
            }
        }
        return -1;
    }

    @Override // y0.n
    public final List d() {
        return this.f2516k;
    }

    @Override // y0.n
    public final void e(y0.p pVar) {
        if ((this.f2507b & 16) == 0) {
            pVar = new U.b(pVar, this.f2506a);
        }
        this.f2501B = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:232:0x0123, code lost:
    
        if (((X.a) r13).f3486a.equals("auxiliary.tracks.offset") != false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (((X.a) r12).f3486a.equals("auxiliary.tracks.interleaved") != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        if (((X.a) r12).f3486a.equals("auxiliary.tracks.map") != false) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x033d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(long j4) {
        int i4;
        ArrayList arrayList;
        E e4;
        boolean z;
        ArrayDeque arrayDeque;
        boolean z4;
        E e5;
        E e6;
        boolean z5;
        long[][] jArr;
        ArrayList arrayList2;
        int i5;
        String str;
        boolean z6;
        ArrayList arrayList3;
        boolean z7;
        int length;
        int i6;
        E e7;
        long j5;
        int i7;
        int i8;
        int i9;
        E e8;
        E e9;
        E e10;
        E e11;
        int i10;
        int i11;
        int i12;
        D d4;
        D d5;
        D d6;
        int i13;
        while (true) {
            ArrayDeque arrayDeque2 = this.f2513h;
            int i14 = 0;
            if (arrayDeque2.isEmpty() || ((X.c) arrayDeque2.peek()).f3491c != j4) {
                break;
            }
            X.c cVar = (X.c) arrayDeque2.pop();
            if (cVar.f3496b == 1836019574) {
                X.c h2 = cVar.h(1835365473);
                ArrayList arrayList4 = new ArrayList();
                boolean z8 = this.f2508c;
                long j6 = 0;
                int i15 = this.f2507b;
                if (h2 != null) {
                    e4 = j.f(h2);
                    if (this.f2527y) {
                        e4.getClass();
                        D[] dArr = e4.f2655a;
                        int length2 = dArr.length;
                        int i16 = 0;
                        while (true) {
                            if (i16 >= length2) {
                                d5 = null;
                                break;
                            }
                            D d7 = dArr[i16];
                            if (X.a.class.isAssignableFrom(d7.getClass())) {
                                d5 = (D) X.a.class.cast(d7);
                            }
                            d5 = null;
                            if (d5 != null) {
                                break;
                            } else {
                                i16++;
                            }
                        }
                        X.a aVar = (X.a) d5;
                        if (aVar != null && aVar.f3487b[0] == 0) {
                            this.f2500A = this.f2526x + 16;
                        }
                        int length3 = dArr.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 >= length3) {
                                d6 = null;
                                break;
                            }
                            D d8 = dArr[i17];
                            if (X.a.class.isAssignableFrom(d8.getClass())) {
                                d6 = (D) X.a.class.cast(d8);
                            }
                            d6 = null;
                            if (d6 != null) {
                                break;
                            } else {
                                i17++;
                            }
                        }
                        X.a aVar2 = (X.a) d6;
                        aVar2.getClass();
                        ArrayList d9 = aVar2.d();
                        ArrayList arrayList5 = new ArrayList(d9.size());
                        for (int i18 = 0; i18 < d9.size(); i18++) {
                            int intValue = ((Integer) d9.get(i18)).intValue();
                            if (intValue == 0) {
                                i13 = 1;
                            } else if (intValue != 1) {
                                i13 = 3;
                                if (intValue != 2) {
                                    i13 = intValue != 3 ? 0 : 4;
                                }
                            } else {
                                i13 = 2;
                            }
                            arrayList5.add(Integer.valueOf(i13));
                        }
                        i4 = 0;
                        arrayList = arrayList5;
                    } else {
                        if (e4 == null || (i15 & 64) == 0) {
                            i4 = 0;
                        } else {
                            D[] dArr2 = e4.f2655a;
                            int length4 = dArr2.length;
                            int i19 = 0;
                            while (true) {
                                if (i19 >= length4) {
                                    i4 = i14;
                                    d4 = null;
                                    break;
                                }
                                D d10 = dArr2[i19];
                                if (X.a.class.isAssignableFrom(d10.getClass())) {
                                    d4 = (D) X.a.class.cast(d10);
                                    i4 = i14;
                                } else {
                                    i4 = i14;
                                }
                                d4 = null;
                                if (d4 != null) {
                                    break;
                                }
                                i19++;
                                i14 = i4;
                            }
                            X.a aVar3 = (X.a) d4;
                            if (aVar3 != null) {
                                long F4 = new W.u(aVar3.f3487b).F();
                                if (F4 > 0) {
                                    this.f2526x = F4;
                                    this.f2525w = true;
                                    arrayDeque = arrayDeque2;
                                    z4 = true;
                                    z = z8;
                                    arrayDeque.clear();
                                    this.z = z4;
                                    if (!this.f2525w && !z) {
                                        this.f2517l = 2;
                                    }
                                }
                            }
                        }
                        arrayList = arrayList4;
                    }
                } else {
                    i4 = 0;
                    arrayList = arrayList4;
                    e4 = null;
                }
                ArrayList arrayList6 = new ArrayList();
                boolean z9 = this.f2504E == 1 ? 1 : i4;
                y0.t tVar = new y0.t();
                X.d i20 = cVar.i(1969517665);
                if (i20 != null) {
                    e5 = j.k(i20);
                    tVar.b(e5);
                } else {
                    e5 = null;
                }
                X.d i21 = cVar.i(1836476516);
                i21.getClass();
                D[] dArr3 = new D[1];
                dArr3[i4] = j.g(i21.f3494c);
                E e12 = new E(dArr3);
                if ((i15 & 1) != 0) {
                    e6 = e12;
                    z5 = 1;
                } else {
                    e6 = e12;
                    z5 = i4;
                }
                E e13 = e6;
                E e14 = e5;
                ArrayList j7 = j.j(cVar, tVar, -9223372036854775807L, null, z5, z9, new D0.d(8), this.f2508c);
                if (this.f2527y) {
                    boolean z10 = arrayList.size() == j7.size() ? 1 : i4;
                    Locale locale = Locale.US;
                    AbstractC0124a.s(AbstractC0005f.l("The number of auxiliary track types from metadata (", arrayList.size(), ") is not same as the number of auxiliary tracks (", j7.size(), ")"), z10);
                }
                String b4 = w.b(j7);
                int i22 = i4;
                int i23 = i22;
                long j8 = -9223372036854775807L;
                int i24 = -1;
                while (i22 < j7.size()) {
                    A a3 = (A) j7.get(i22);
                    int i25 = a3.f2383b;
                    ArrayDeque arrayDeque3 = arrayDeque2;
                    int i26 = a3.f2386e;
                    x xVar = a3.f2382a;
                    if (i25 == 0) {
                        arrayList3 = arrayList;
                        arrayList2 = j7;
                        str = b4;
                        i6 = i22;
                        i5 = i23;
                        z6 = z8;
                        e9 = e14;
                        e10 = e13;
                        e11 = e4;
                    } else {
                        arrayList2 = j7;
                        y0.p pVar = this.f2501B;
                        i5 = i23 + 1;
                        str = b4;
                        int i27 = xVar.f2538b;
                        z6 = z8;
                        C0097o c0097o = xVar.f2543g;
                        F z11 = pVar.z(i23, i27);
                        r rVar = new r(xVar, a3, z11);
                        E e15 = e4;
                        long j9 = xVar.f2541e;
                        if (j9 == -9223372036854775807L) {
                            j9 = a3.f2390i;
                        }
                        z11.c(j9);
                        long max = Math.max(j8, j9);
                        String str2 = c0097o.n;
                        String str3 = c0097o.n;
                        int i28 = "audio/true-hd".equals(str2) ? i26 * 16 : i26 + 30;
                        C0096n a4 = c0097o.a();
                        a4.n = i28;
                        if (i27 == 2) {
                            int i29 = c0097o.f2861f;
                            if ((i15 & 8) != 0) {
                                i29 |= i24 == -1 ? 1 : 2;
                            }
                            int i30 = i29;
                            if (this.f2527y) {
                                i12 = i30 | 32768;
                                arrayList3 = arrayList;
                                a4.f2825g = ((Integer) arrayList.get(i22)).intValue();
                            } else {
                                arrayList3 = arrayList;
                                i12 = i30;
                            }
                            a4.f2824f = i12;
                        } else {
                            arrayList3 = arrayList;
                        }
                        long[] jArr2 = a3.f2387f;
                        int[] iArr = a3.f2389h;
                        boolean z12 = a3.f2391j;
                        if (T.F.m(str3)) {
                            if (z12) {
                                z7 = z12;
                                length = a3.f2383b;
                            } else {
                                z7 = z12;
                                length = iArr.length;
                            }
                            int min = Math.min(length, 20);
                            AbstractC0124a.t(j9 != -9223372036854775807L ? 1 : i4);
                            i6 = i22;
                            e7 = e15;
                            long min2 = Math.min(j9, 10000000L);
                            int i31 = i4;
                            int i32 = i31;
                            int i33 = -1;
                            while (i31 < min) {
                                int i34 = z7 ? i31 : iArr[i31];
                                long j10 = jArr2[i34];
                                if (j10 > min2) {
                                    break;
                                }
                                if (j10 >= 0 && (i8 = a3.f2385d[(i7 = i34)]) > i32) {
                                    i32 = i8;
                                    i33 = i7;
                                }
                                i31++;
                            }
                            if (i33 != -1) {
                                j5 = jArr2[i33];
                                if (j5 == -9223372036854775807L) {
                                    H0.c cVar2 = new H0.c(j5);
                                    i9 = 1;
                                    D[] dArr4 = new D[1];
                                    dArr4[i4] = cVar2;
                                    e8 = new E(dArr4);
                                } else {
                                    i9 = 1;
                                    e8 = null;
                                }
                                if (i27 == i9 && (i10 = tVar.f16197a) != -1 && (i11 = tVar.f16198b) != -1) {
                                    a4.f2813H = i10;
                                    a4.f2814I = i11;
                                }
                                E e16 = c0097o.f2867l;
                                ArrayList arrayList7 = this.f2515j;
                                E e17 = !arrayList7.isEmpty() ? null : new E(arrayList7);
                                e9 = e14;
                                e10 = e13;
                                E[] eArr = {e17, e9, e10, e8};
                                e11 = e7;
                                w.k(i27, e11, a4, e16, eArr);
                                a4.f2830l = T.F.n(str);
                                if (Objects.equals(str3, "audio/mpeg")) {
                                    AbstractC0005f.w(a4, rVar.f2496c);
                                } else {
                                    rVar.f2499f = new C0097o(a4);
                                }
                                if (i27 == 2 && i24 == -1) {
                                    i24 = arrayList6.size();
                                }
                                arrayList6.add(rVar);
                                j8 = max;
                            }
                        } else {
                            i6 = i22;
                            e7 = e15;
                        }
                        j5 = -9223372036854775807L;
                        if (j5 == -9223372036854775807L) {
                        }
                        if (i27 == i9) {
                            a4.f2813H = i10;
                            a4.f2814I = i11;
                        }
                        E e162 = c0097o.f2867l;
                        ArrayList arrayList72 = this.f2515j;
                        if (!arrayList72.isEmpty()) {
                        }
                        e9 = e14;
                        e10 = e13;
                        E[] eArr2 = {e17, e9, e10, e8};
                        e11 = e7;
                        w.k(i27, e11, a4, e162, eArr2);
                        a4.f2830l = T.F.n(str);
                        if (Objects.equals(str3, "audio/mpeg")) {
                        }
                        if (i27 == 2) {
                            i24 = arrayList6.size();
                        }
                        arrayList6.add(rVar);
                        j8 = max;
                    }
                    int i35 = i6 + 1;
                    e14 = e9;
                    e4 = e11;
                    e13 = e10;
                    arrayDeque2 = arrayDeque3;
                    j7 = arrayList2;
                    i23 = i5;
                    b4 = str;
                    z8 = z6;
                    i22 = i35;
                    arrayList = arrayList3;
                }
                arrayDeque = arrayDeque2;
                z = z8;
                boolean z13 = true;
                int i36 = -1;
                r[] rVarArr = (r[]) arrayList6.toArray(new r[i4]);
                this.f2502C = rVarArr;
                if (z) {
                    jArr = null;
                } else {
                    jArr = new long[rVarArr.length][];
                    int[] iArr2 = new int[rVarArr.length];
                    long[] jArr3 = new long[rVarArr.length];
                    boolean[] zArr = new boolean[rVarArr.length];
                    for (int i37 = 0; i37 < rVarArr.length; i37++) {
                        jArr[i37] = new long[rVarArr[i37].f2495b.f2383b];
                        jArr3[i37] = rVarArr[i37].f2495b.f2387f[0];
                    }
                    int i38 = 0;
                    while (i38 < rVarArr.length) {
                        long j11 = Long.MAX_VALUE;
                        int i39 = i36;
                        for (int i40 = 0; i40 < rVarArr.length; i40++) {
                            if (!zArr[i40]) {
                                long j12 = jArr3[i40];
                                if (j12 <= j11) {
                                    i39 = i40;
                                    j11 = j12;
                                }
                            }
                        }
                        int i41 = iArr2[i39];
                        long[] jArr4 = jArr[i39];
                        jArr4[i41] = j6;
                        A a5 = rVarArr[i39].f2495b;
                        boolean z14 = z13;
                        j6 += a5.f2385d[i41];
                        int i42 = i41 + 1;
                        iArr2[i39] = i42;
                        if (i42 < jArr4.length) {
                            jArr3[i39] = a5.f2387f[i42];
                        } else {
                            zArr[i39] = z14;
                            i38++;
                        }
                        z13 = z14;
                        i36 = -1;
                    }
                }
                z4 = z13;
                this.f2503D = jArr;
                this.f2501B.r();
                this.f2501B.x(new q(j8, this.f2502C, i24));
                arrayDeque.clear();
                this.z = z4;
                if (!this.f2525w) {
                    this.f2517l = 2;
                }
            } else if (!arrayDeque2.isEmpty()) {
                ((X.c) arrayDeque2.peek()).f3493e.add(cVar);
            }
        }
        if (this.f2517l != 2) {
            this.f2517l = 0;
            this.o = 0;
        }
    }

    @Override // y0.n
    public final void release() {
    }
}
