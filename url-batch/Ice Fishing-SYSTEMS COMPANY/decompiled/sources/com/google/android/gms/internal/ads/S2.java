package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class S2 implements O0 {

    /* renamed from: G, reason: collision with root package name */
    public static final /* synthetic */ int f27472G = 0;

    /* renamed from: A, reason: collision with root package name */
    public int f27473A;

    /* renamed from: B, reason: collision with root package name */
    public long f27474B;

    /* renamed from: C, reason: collision with root package name */
    public Q0 f27475C;

    /* renamed from: D, reason: collision with root package name */
    public R2[] f27476D;

    /* renamed from: E, reason: collision with root package name */
    public long[][] f27477E;

    /* renamed from: F, reason: collision with root package name */
    public int f27478F;

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC3720p3 f27479a;

    /* renamed from: b, reason: collision with root package name */
    public final int f27480b;

    /* renamed from: c, reason: collision with root package name */
    public final Lr f27481c;

    /* renamed from: d, reason: collision with root package name */
    public final Lr f27482d;

    /* renamed from: e, reason: collision with root package name */
    public final Lr f27483e;

    /* renamed from: f, reason: collision with root package name */
    public final Lr f27484f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayDeque f27485g;

    /* renamed from: h, reason: collision with root package name */
    public final V2 f27486h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f27487j;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f27488k;

    /* renamed from: l, reason: collision with root package name */
    public C3675oC f27489l;

    /* renamed from: m, reason: collision with root package name */
    public int f27490m;

    /* renamed from: n, reason: collision with root package name */
    public int f27491n;

    /* renamed from: o, reason: collision with root package name */
    public long f27492o;

    /* renamed from: p, reason: collision with root package name */
    public int f27493p;

    /* renamed from: q, reason: collision with root package name */
    public Lr f27494q;

    /* renamed from: r, reason: collision with root package name */
    public int f27495r;

    /* renamed from: s, reason: collision with root package name */
    public int f27496s;

    /* renamed from: t, reason: collision with root package name */
    public int f27497t;

    /* renamed from: u, reason: collision with root package name */
    public int f27498u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f27499v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f27500w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f27501x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f27502y;

    /* renamed from: z, reason: collision with root package name */
    public int f27503z;

    static {
        int i = AbstractC3194fG.f30672t0;
    }

    public S2() {
        this(InterfaceC3720p3.m0, 16);
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void a(Q0 q02) {
        if ((this.f27480b & 16) == 0) {
            q02 = new com.bumptech.glide.manager.n(q02, this.f27479a);
        }
        this.f27475C = q02;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final boolean b(P0 p02) {
        C3675oC c3675oC;
        InterfaceC3234g1 v6 = AbstractC2720Pd.v(p02, false);
        if (v6 != null) {
            c3675oC = UB.j(v6);
        } else {
            SB sb = UB.f27942u;
            c3675oC = C3675oC.f33115x;
        }
        this.f27489l = c3675oC;
        return v6 == null;
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void c(long j9, long j10) {
        this.f27485g.clear();
        this.f27493p = 0;
        this.f27495r = -1;
        this.f27496s = 0;
        this.f27497t = 0;
        this.f27498u = 0;
        this.f27499v = false;
        this.f27503z = 0;
        this.f27473A = 0;
        this.f27487j.clear();
        this.f27488k.clear();
        if (j9 == 0) {
            if (this.f27490m != 3) {
                this.f27490m = 0;
                this.f27493p = 0;
                return;
            } else {
                V2 v22 = this.f27486h;
                v22.f28205a.clear();
                v22.f28206b = 0;
                this.i.clear();
                return;
            }
        }
        for (R2 r22 : this.f27476D) {
            C2908a3 c2908a3 = r22.f27301b;
            int a9 = c2908a3.a(j10);
            if (a9 == -1) {
                a9 = c2908a3.b(j10);
            }
            r22.f27304e = a9;
            C3502l1 c3502l1 = r22.f27303d;
            if (c3502l1 != null) {
                c3502l1.f32512b = false;
                c3502l1.f32513c = 0;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final /* synthetic */ List d() {
        return this.f27489l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:347:0x03ac, code lost:
    
        if (r36 < r32) goto L166;
     */
    /* JADX WARN: Removed duplicated region for block: B:150:0x064b  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0654 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0006 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0641 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:350:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:353:0x03bf  */
    @Override // com.google.android.gms.internal.ads.O0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int e(P0 p02, S0 s02) {
        char c4;
        int i;
        int i4;
        boolean z8;
        int i9;
        long j9;
        char c9;
        char c10;
        boolean z9;
        int i10;
        while (true) {
            int i11 = this.f27490m;
            ArrayDeque arrayDeque = this.f27485g;
            Lr lr = this.f27483e;
            if (i11 == 0) {
                int i12 = this.f27493p;
                Lr lr2 = this.f27484f;
                if (i12 == 0) {
                    if (!p02.E(lr2.f26233a, 0, 8, true)) {
                        return -1;
                    }
                    this.f27493p = 8;
                    lr2.E(0);
                    this.f27492o = lr2.P();
                    this.f27491n = lr2.b();
                }
                long j10 = this.f27492o;
                if (j10 == 1) {
                    p02.y(lr2.f26233a, 8, 8);
                    this.f27493p += 8;
                    this.f27492o = lr2.j();
                } else if (j10 == 0) {
                    long q6 = p02.q();
                    if (q6 == -1) {
                        Ww ww = (Ww) arrayDeque.peek();
                        q6 = ww != null ? ww.f28533c : -1L;
                    }
                    if (q6 != -1) {
                        this.f27492o = (q6 - p02.p()) + this.f27493p;
                    }
                }
                long j11 = this.f27492o;
                int i13 = this.f27493p;
                long j12 = i13;
                if (j11 < j12) {
                    if (this.f27491n != 1718773093 || i13 != 8) {
                        break;
                    }
                    this.f27492o = j12;
                    i13 = 8;
                }
                int i14 = this.f27491n;
                if (i14 == 1836019574 || i14 == 1953653099 || i14 == 1835297121 || i14 == 1835626086 || i14 == 1937007212 || i14 == 1701082227 || i14 == 1835365473 || i14 == 1635284069 || i14 == 1953654118) {
                    long p6 = p02.p();
                    long j13 = this.f27492o;
                    long j14 = p6 + j13;
                    long j15 = this.f27493p;
                    if (j13 != j15 && this.f27491n == 1835365473) {
                        lr.y(8);
                        p02.B(lr.f26233a, 0, 8);
                        H2.f(lr);
                        p02.s(lr.f26234b);
                        p02.k();
                    }
                    long j16 = j14 - j15;
                    arrayDeque.push(new Ww(this.f27491n, j16));
                    if (this.f27492o == this.f27493p) {
                        g(j16);
                    } else {
                        this.f27490m = 0;
                        this.f27493p = 0;
                    }
                } else {
                    if (i14 == 1835296868 || i14 == 1836476516 || i14 == 1751411826 || i14 == 1937011556 || i14 == 1937011827 || i14 == 1937011571 || i14 == 1668576371 || i14 == 1701606260 || i14 == 1937011555 || i14 == 1937011578 || i14 == 1937013298 || i14 == 1937007471 || i14 == 1668232756 || i14 == 1953196132 || i14 == 1718909296 || i14 == 1969517665 || i14 == 1801812339 || i14 == 1768715124 || i14 == 1667785072) {
                        PA.T(i13 == 8);
                        PA.T(this.f27492o <= 2147483647L);
                        Lr lr3 = new Lr((int) this.f27492o);
                        System.arraycopy(lr2.f26233a, 0, lr3.f26233a, 0, 8);
                        this.f27494q = lr3;
                    } else {
                        this.f27494q = null;
                    }
                    this.f27490m = 1;
                }
            } else {
                if (i11 != 1) {
                    if (i11 == 2) {
                        long p9 = p02.p();
                        int i15 = this.f27495r;
                        if (i15 == -1) {
                            int i16 = 0;
                            boolean z10 = true;
                            boolean z11 = true;
                            int i17 = -1;
                            int i18 = -1;
                            long j17 = Long.MAX_VALUE;
                            long j18 = Long.MAX_VALUE;
                            long j19 = Long.MAX_VALUE;
                            while (true) {
                                R2[] r2Arr = this.f27476D;
                                if (i16 >= r2Arr.length) {
                                    break;
                                }
                                R2 r22 = r2Arr[i16];
                                int i19 = r22.f27304e;
                                C2908a3 c2908a3 = r22.f27301b;
                                if (i19 != c2908a3.f29164b) {
                                    long j20 = c2908a3.f29165c[i19];
                                    long[][] jArr = this.f27477E;
                                    jArr.getClass();
                                    long j21 = jArr[i16][i19];
                                    long j22 = j20 - p9;
                                    boolean z12 = j22 < 0 || j22 >= 262144;
                                    if (z12) {
                                        z8 = z11;
                                    } else {
                                        if (!z11) {
                                            z8 = false;
                                        }
                                        i18 = i16;
                                        z8 = z12;
                                        j19 = j22;
                                        j18 = j21;
                                        if (j21 >= j17) {
                                            i17 = i16;
                                            z10 = z12;
                                            z11 = z8;
                                            j17 = j21;
                                        } else {
                                            z11 = z8;
                                        }
                                    }
                                    if (z12 == z8) {
                                    }
                                    if (j21 >= j17) {
                                    }
                                }
                                i16++;
                            }
                            i15 = (j17 == Long.MAX_VALUE || !z10 || j18 < j17 + 10485760) ? i18 : i17;
                            this.f27495r = i15;
                            if (i15 == -1) {
                                return -1;
                            }
                        }
                        R2 r23 = this.f27476D[i15];
                        InterfaceC3448k1 interfaceC3448k1 = r23.f27302c;
                        int i20 = r23.f27304e;
                        C2908a3 c2908a32 = r23.f27301b;
                        long j23 = this.f27474B + c2908a32.f29165c[i20];
                        int[] iArr = c2908a32.f29166d;
                        int i21 = iArr[i20];
                        long j24 = (j23 - p9) + this.f27496s;
                        if (j24 < 0 || j24 >= 262144) {
                            s02.f27467n = j23;
                            return 1;
                        }
                        X2 x22 = r23.f27300a;
                        if (x22.f28594h == 1) {
                            j24 += 8;
                            i21 -= 8;
                        }
                        int i22 = i21;
                        p02.s((int) j24);
                        TP tp = x22.f28593g;
                        String str = tp.f27776o;
                        boolean equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8608h);
                        int i23 = this.f27480b;
                        if (!equals ? !Objects.equals(str, com.anythink.basead.exoplayer.k.o.i) ? Objects.equals(str, "video/apv") : (i23 & 128) != 0 : (i23 & 32) != 0) {
                            c4 = 1;
                        } else {
                            c4 = 1;
                            this.f27499v = true;
                        }
                        C3502l1 c3502l1 = r23.f27303d;
                        int i24 = x22.f28596k;
                        if (i24 == 0) {
                            if ("audio/ac4".equals(str)) {
                                if (this.f27497t == 0) {
                                    AbstractC3217fl.H(i22, lr);
                                    interfaceC3448k1.a(7, lr);
                                    this.f27497t += 7;
                                }
                                i22 += 7;
                            } else if (r23.f27305f != null && Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8619t)) {
                                TP tp2 = r23.f27305f;
                                lr.y(4);
                                p02.B(lr.f26233a, 0, 4);
                                p02.k();
                                C2906a1 c2906a1 = new C2906a1();
                                if (c2906a1.a(lr.b()) && !Objects.equals(tp2.f27776o, (String) c2906a1.f29159g)) {
                                    C4065vP c4065vP = new C4065vP(tp2);
                                    String str2 = (String) c2906a1.f29159g;
                                    str2.getClass();
                                    c4065vP.e(str2);
                                    tp2 = new TP(c4065vP);
                                }
                                interfaceC3448k1.e(tp2);
                                r23.f27305f = null;
                            } else if (c3502l1 != null) {
                                c3502l1.a(p02);
                            }
                            while (true) {
                                int i25 = this.f27497t;
                                if (i25 >= i22) {
                                    break;
                                }
                                int d2 = interfaceC3448k1.d(p02, i22 - i25, false);
                                this.f27496s += d2;
                                this.f27497t += d2;
                                this.f27498u -= d2;
                            }
                        } else {
                            Lr lr4 = this.f27482d;
                            byte[] bArr = lr4.f26233a;
                            bArr[0] = 0;
                            bArr[c4] = 0;
                            bArr[2] = 0;
                            int i26 = 4 - i24;
                            i22 += i26;
                            while (this.f27497t < i22) {
                                int i27 = this.f27498u;
                                if (i27 == 0) {
                                    if (this.f27499v || PA.y(tp) + i24 > iArr[i20] - this.f27496s) {
                                        i = i24;
                                        i4 = 0;
                                    } else {
                                        int y6 = PA.y(tp);
                                        i = i24 + y6;
                                        i4 = y6;
                                    }
                                    p02.y(bArr, i26, i);
                                    this.f27496s += i;
                                    lr4.E(0);
                                    int b9 = lr4.b();
                                    if (b9 < 0) {
                                        throw W4.a(null, "Invalid NAL length");
                                    }
                                    this.f27498u = b9 - i4;
                                    Lr lr5 = this.f27481c;
                                    lr5.E(0);
                                    interfaceC3448k1.a(4, lr5);
                                    this.f27497t += 4;
                                    if (i4 > 0) {
                                        interfaceC3448k1.a(i4, lr4);
                                        this.f27497t += i4;
                                        if (PA.F(bArr, i4, tp)) {
                                            this.f27499v = true;
                                        }
                                    }
                                } else {
                                    int d3 = interfaceC3448k1.d(p02, i27, false);
                                    this.f27496s += d3;
                                    this.f27497t += d3;
                                    this.f27498u -= d3;
                                }
                            }
                        }
                        int i28 = i22;
                        long j25 = c2908a32.f29168f[i20];
                        int i29 = c2908a32.f29169g[i20];
                        if (!this.f27499v) {
                            i29 |= 67108864;
                        }
                        int i30 = i29;
                        if (c3502l1 != null) {
                            c3502l1.b(interfaceC3448k1, j25, i30, i28, 0, null);
                            if (i20 + 1 == c2908a32.f29164b) {
                                c3502l1.c(interfaceC3448k1, null);
                            }
                        } else {
                            interfaceC3448k1.b(j25, i30, i28, 0, null);
                        }
                        r23.f27304e++;
                        this.f27495r = -1;
                        this.f27496s = 0;
                        this.f27497t = 0;
                        this.f27498u = 0;
                        this.f27499v = false;
                        return 0;
                    }
                    if (i11 != 3) {
                        ArrayList arrayList = this.f27487j;
                        C2908a3 c2908a33 = (C2908a3) arrayList.get(this.f27503z);
                        int i31 = this.f27473A;
                        int i32 = c2908a33.f29164b;
                        ArrayList arrayList2 = this.f27488k;
                        if (i31 < i32) {
                            long j26 = c2908a33.f29165c[i31];
                            if (p02.p() != j26) {
                                s02.f27467n = j26;
                                return 1;
                            }
                            int i33 = c2908a33.f29166d[this.f27473A];
                            lr.y(i33);
                            p02.y(lr.f26233a, 0, i33);
                            String k6 = lr.k(Math.min(lr.L(), lr.B()), StandardCharsets.UTF_8);
                            int i34 = this.f27473A;
                            long[] jArr2 = c2908a33.f29168f;
                            long t9 = AbstractC3548lu.t(jArr2[i34]);
                            int i35 = this.f27473A + 1;
                            arrayList2.add(new M1(t9, i35 < i32 ? AbstractC3548lu.t(jArr2[i35]) : AbstractC3548lu.t(c2908a33.i), false, new C3904sQ(null, k6)));
                            this.f27473A++;
                            return 0;
                        }
                        for (R2 r24 : this.f27476D) {
                            if (r24.f27300a.f28597l == c2908a33.f29163a.f28587a) {
                                TP tp3 = r24.f27305f;
                                tp3.getClass();
                                ArrayList arrayList3 = new ArrayList();
                                R3 r32 = tp3.f27773l;
                                if (r32 != null) {
                                    arrayList3.addAll(r32.a(InterfaceC4043v3.class, W0.f28340w));
                                }
                                arrayList3.addAll(arrayList2);
                                C4065vP c4065vP2 = new C4065vP(tp3);
                                c4065vP2.f34782k = new R3(arrayList3);
                                TP tp4 = new TP(c4065vP2);
                                if (Objects.equals(tp4.f27776o, com.anythink.basead.exoplayer.k.o.f8619t)) {
                                    r24.f27305f = tp4;
                                } else {
                                    r24.f27302c.e(tp4);
                                    r24.f27305f = null;
                                }
                            }
                        }
                        this.f27503z++;
                        this.f27473A = 0;
                        arrayList2.clear();
                        if (this.f27503z != arrayList.size()) {
                            return 0;
                        }
                        this.f27490m = 2;
                        return 0;
                    }
                    ArrayList arrayList4 = this.i;
                    V2 v22 = this.f27486h;
                    int i36 = v22.f28206b;
                    if (i36 != 0) {
                        if (i36 != 1) {
                            ArrayList arrayList5 = v22.f28205a;
                            int i37 = 8;
                            short s3 = 2817;
                            if (i36 != 2) {
                                long p10 = p02.p();
                                int q9 = (int) ((p02.q() - p02.p()) - v22.f28207c);
                                Lr lr6 = new Lr(q9);
                                p02.y(lr6.f26233a, 0, q9);
                                for (int i38 = 0; i38 < arrayList5.size(); i38++) {
                                    U2 u22 = (U2) arrayList5.get(i38);
                                    lr6.E((int) (u22.f27917a - p10));
                                    lr6.G(4);
                                    int c11 = lr6.c();
                                    Charset charset = StandardCharsets.UTF_8;
                                    String k9 = lr6.k(c11, charset);
                                    switch (k9.hashCode()) {
                                        case -1711564334:
                                            if (k9.equals("SlowMotion_Data")) {
                                                c9 = 0;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case -1332107749:
                                            if (k9.equals("Super_SlowMotion_Edit_Data")) {
                                                c9 = 3;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case -1251387154:
                                            if (k9.equals("Super_SlowMotion_Data")) {
                                                c9 = 1;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case -830665521:
                                            if (k9.equals("Super_SlowMotion_Deflickering_On")) {
                                                c9 = 4;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        case 1760745220:
                                            if (k9.equals("Super_SlowMotion_BGM")) {
                                                c9 = 2;
                                                break;
                                            }
                                            c9 = 65535;
                                            break;
                                        default:
                                            c9 = 65535;
                                            break;
                                    }
                                    if (c9 == 0) {
                                        c10 = 2192;
                                    } else if (c9 == 1) {
                                        c10 = 2816;
                                    } else if (c9 == 2) {
                                        c10 = 2817;
                                    } else if (c9 == 3) {
                                        c10 = 2819;
                                    } else {
                                        if (c9 != 4) {
                                            throw W4.a(null, "Invalid SEF name");
                                        }
                                        c10 = 2820;
                                    }
                                    int i39 = u22.f27918b - (c11 + 8);
                                    if (c10 == 2192) {
                                        ArrayList arrayList6 = new ArrayList();
                                        List r9 = V2.f28204e.r(lr6.k(i39, charset));
                                        int i40 = 0;
                                        while (i40 < r9.size()) {
                                            List r10 = V2.f28203d.r((CharSequence) r9.get(i40));
                                            if (r10.size() != 3) {
                                                throw W4.a(null, null);
                                            }
                                            try {
                                                ArrayList arrayList7 = arrayList6;
                                                arrayList7.add(new C3180f2(1 << (Integer.parseInt((String) r10.get(2)) - 1), Long.parseLong((String) r10.get(0)), Long.parseLong((String) r10.get(1))));
                                                i40++;
                                                arrayList6 = arrayList7;
                                            } catch (NumberFormatException e6) {
                                                throw W4.a(e6, null);
                                            }
                                        }
                                        arrayList4.add(new C3289h2(arrayList6));
                                    } else if (c10 != 2816 && c10 != 2817 && c10 != 2819 && c10 != 2820) {
                                        throw new IllegalStateException();
                                    }
                                }
                                s02.f27467n = 0L;
                            } else {
                                long q10 = p02.q();
                                int i41 = v22.f28207c - 20;
                                Lr lr7 = new Lr(i41);
                                p02.y(lr7.f26233a, 0, i41);
                                int i42 = 0;
                                while (i42 < i41 / 12) {
                                    lr7.G(2);
                                    lr7.v(2);
                                    byte[] bArr2 = lr7.f26233a;
                                    int i43 = lr7.f26234b;
                                    int i44 = i43 + 1;
                                    lr7.f26234b = i44;
                                    int i45 = bArr2[i43] & 255;
                                    lr7.f26234b = i43 + 2;
                                    short s6 = (short) (((bArr2[i44] & 255) << 8) | i45);
                                    if (s6 != 2192 && s6 != 2816 && s6 != s3 && s6 != 2819) {
                                        if (s6 != 2820) {
                                            lr7.G(i37);
                                            j9 = q10;
                                            i42++;
                                            q10 = j9;
                                            s3 = 2817;
                                            i37 = 8;
                                        }
                                    }
                                    j9 = q10;
                                    arrayList5.add(new U2((j9 - v22.f28207c) - lr7.c(), lr7.c()));
                                    i42++;
                                    q10 = j9;
                                    s3 = 2817;
                                    i37 = 8;
                                }
                                if (arrayList5.isEmpty()) {
                                    s02.f27467n = 0L;
                                } else {
                                    v22.f28206b = 3;
                                    s02.f27467n = ((U2) arrayList5.get(0)).f27917a;
                                }
                            }
                        } else {
                            Lr lr8 = new Lr(8);
                            p02.y(lr8.f26233a, 0, 8);
                            v22.f28207c = lr8.c() + 8;
                            if (lr8.b() != 1397048916) {
                                s02.f27467n = 0L;
                            } else {
                                s02.f27467n = p02.p() - (v22.f28207c - 12);
                                v22.f28206b = 2;
                            }
                        }
                        i9 = 1;
                    } else {
                        long q11 = p02.q();
                        s02.f27467n = (q11 == -1 || q11 < 8) ? 0L : q11 - 8;
                        i9 = 1;
                        v22.f28206b = 1;
                    }
                    if (s02.f27467n != 0) {
                        return i9;
                    }
                    this.f27490m = 0;
                    this.f27493p = 0;
                    return i9;
                }
                long j27 = this.f27492o - this.f27493p;
                long p11 = p02.p() + j27;
                Lr lr9 = this.f27494q;
                if (lr9 != null) {
                    p02.y(lr9.f26233a, this.f27493p, (int) j27);
                    if (this.f27491n == 1718909296) {
                        this.f27500w = true;
                        lr9.E(8);
                        if (lr9.b() != 1903435808) {
                            lr9.G(4);
                            while (lr9.B() > 0) {
                                if (lr9.b() != 1903435808) {
                                }
                            }
                            i10 = 0;
                            this.f27478F = i10;
                        }
                        i10 = 1;
                        this.f27478F = i10;
                    } else if (!arrayDeque.isEmpty()) {
                        ((Ww) arrayDeque.peek()).f28534d.add(new C3443jx(this.f27491n, lr9));
                    }
                } else {
                    if (!this.f27500w && this.f27491n == 1835295092) {
                        this.f27478F = 1;
                    }
                    if (j27 < 262144) {
                        p02.s((int) j27);
                    } else {
                        s02.f27467n = p02.p() + j27;
                        z9 = true;
                        g(p11);
                        if (!this.f27501x) {
                            this.f27502y = true;
                            s02.f27467n = 0L;
                            this.f27501x = false;
                        } else if (!z9) {
                            continue;
                        }
                        if (this.f27490m == 2) {
                            return 1;
                        }
                    }
                }
                z9 = false;
                g(p11);
                if (!this.f27501x) {
                }
                if (this.f27490m == 2) {
                }
            }
        }
        throw W4.c("Atom size less than header length (unsupported).");
    }

    @Override // com.google.android.gms.internal.ads.O0
    public final void f() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (((com.google.android.gms.internal.ads.C4143ww) r1).f35092a.equals("auxiliary.tracks.interleaved") != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00aa, code lost:
    
        if (((com.google.android.gms.internal.ads.C4143ww) r12).f35092a.equals("auxiliary.tracks.map") != false) goto L40;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0308  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g(long j9) {
        int i;
        long j10;
        ArrayList arrayList;
        R3 r32;
        R3 r33;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i4;
        long[] jArr;
        long j11;
        int i9;
        int i10;
        R3 r34;
        R3 r35;
        TP tp;
        boolean equals;
        int i11;
        int i12;
        R2 r22;
        ArrayList arrayList5;
        int i13;
        int i14;
        InterfaceC4043v3 interfaceC4043v3;
        InterfaceC4043v3 interfaceC4043v32;
        int i15;
        loop0: while (true) {
            int i16 = 0;
            int i17 = 1;
            while (true) {
                ArrayDeque arrayDeque = this.f27485g;
                if (arrayDeque.isEmpty() || ((Ww) arrayDeque.peek()).f28533c != j9) {
                    break loop0;
                }
                Ww ww = (Ww) arrayDeque.pop();
                if (ww.f32624b == 1836019574) {
                    Ww j12 = ww.j(1835365473);
                    ArrayList arrayList6 = new ArrayList();
                    ArrayList arrayList7 = this.f27487j;
                    if (j12 != null) {
                        r32 = H2.e(j12);
                        if (this.f27502y) {
                            r32.getClass();
                            InterfaceC4043v3[] interfaceC4043v3Arr = r32.f27306a;
                            int length = interfaceC4043v3Arr.length;
                            int i18 = i16;
                            while (true) {
                                if (i18 >= length) {
                                    j10 = 0;
                                    interfaceC4043v3 = null;
                                    break;
                                }
                                InterfaceC4043v3 interfaceC4043v33 = interfaceC4043v3Arr[i18];
                                j10 = 0;
                                if (C4143ww.class.isAssignableFrom(interfaceC4043v33.getClass())) {
                                    interfaceC4043v3 = (InterfaceC4043v3) C4143ww.class.cast(interfaceC4043v33);
                                }
                                interfaceC4043v3 = null;
                                if (interfaceC4043v3 != null) {
                                    break;
                                } else {
                                    i18 += i17;
                                }
                            }
                            C4143ww c4143ww = (C4143ww) interfaceC4043v3;
                            if (c4143ww != null && c4143ww.f35093b[i16] == 0) {
                                this.f27474B = j10 + 16;
                            }
                            int length2 = interfaceC4043v3Arr.length;
                            int i19 = i16;
                            while (true) {
                                if (i19 >= length2) {
                                    interfaceC4043v32 = null;
                                    break;
                                }
                                InterfaceC4043v3 interfaceC4043v34 = interfaceC4043v3Arr[i19];
                                if (C4143ww.class.isAssignableFrom(interfaceC4043v34.getClass())) {
                                    interfaceC4043v32 = (InterfaceC4043v3) C4143ww.class.cast(interfaceC4043v34);
                                }
                                interfaceC4043v32 = null;
                                if (interfaceC4043v32 != null) {
                                    break;
                                } else {
                                    i19 += i17;
                                }
                            }
                            C4143ww c4143ww2 = (C4143ww) interfaceC4043v32;
                            c4143ww2.getClass();
                            ArrayList b9 = c4143ww2.b();
                            arrayList6 = new ArrayList(b9.size());
                            for (int i20 = i16; i20 < b9.size(); i20 += i17) {
                                int intValue = ((Integer) b9.get(i20)).intValue();
                                if (intValue == 0) {
                                    i15 = i17;
                                } else if (intValue != i17) {
                                    i15 = 3;
                                    if (intValue != 2) {
                                        i15 = intValue != 3 ? i16 : 4;
                                    }
                                } else {
                                    i15 = 2;
                                }
                                arrayList6.add(Integer.valueOf(i15));
                            }
                        } else {
                            j10 = 0;
                        }
                        arrayList = arrayList6;
                    } else {
                        j10 = 0;
                        arrayList = arrayList6;
                        r32 = null;
                    }
                    ArrayList arrayList8 = new ArrayList();
                    int i21 = this.f27478F;
                    X0 x02 = new X0();
                    C3443jx i22 = ww.i(1969517665);
                    if (i22 != null) {
                        r33 = H2.c(i22);
                        x02.a(r33);
                    } else {
                        r33 = null;
                    }
                    C3443jx i23 = ww.i(1836476516);
                    i23.getClass();
                    int i24 = i17 != i21 ? i16 : i17;
                    InterfaceC4043v3[] interfaceC4043v3Arr2 = new InterfaceC4043v3[i17];
                    interfaceC4043v3Arr2[i16] = H2.d(i23.f32222c);
                    R3 r36 = new R3(interfaceC4043v3Arr2);
                    ArrayList arrayList9 = arrayList7;
                    R3 r37 = r33;
                    int i25 = i16;
                    R3 r38 = r36;
                    ArrayList b10 = H2.b(ww, x02, com.anythink.basead.exoplayer.b.f6539b, null, false, i24, J2.f25691b);
                    if (this.f27502y) {
                        boolean z8 = arrayList.size() == b10.size() ? i17 : i25;
                        Locale locale = Locale.US;
                        PA.U("The number of auxiliary track types from metadata (" + arrayList.size() + ") is not same as the number of auxiliary tracks (" + b10.size() + ")", z8);
                    }
                    ArrayList arrayList10 = new ArrayList();
                    Iterator it = b10.iterator();
                    while (it.hasNext()) {
                        int i26 = ((C2908a3) it.next()).f29163a.f28597l;
                        if (i26 != -1) {
                            Integer valueOf = Integer.valueOf(i26);
                            if (!arrayList10.contains(valueOf)) {
                                arrayList10.add(valueOf);
                            }
                        }
                    }
                    arrayList9.clear();
                    Iterator it2 = b10.iterator();
                    while (it2.hasNext()) {
                        C2908a3 c2908a3 = (C2908a3) it2.next();
                        if (arrayList10.contains(Integer.valueOf(c2908a3.f29163a.f28587a))) {
                            arrayList9.add(c2908a3);
                        }
                    }
                    String i27 = PA.i(b10);
                    int i28 = i17;
                    int i29 = -1;
                    int i30 = i25;
                    int i31 = i30;
                    long j13 = com.anythink.basead.exoplayer.b.f6539b;
                    while (i31 < b10.size()) {
                        C2908a3 c2908a32 = (C2908a3) b10.get(i31);
                        int i32 = c2908a32.f29164b;
                        if (i32 == 0) {
                            arrayList2 = arrayList9;
                        } else {
                            arrayList2 = arrayList9;
                            X2 x22 = c2908a32.f29163a;
                            if (x22.f28598m) {
                                arrayList3 = b10;
                                Q0 q02 = this.f27475C;
                                int i33 = i30 + 1;
                                ArrayList arrayList11 = arrayList8;
                                int i34 = x22.f28588b;
                                InterfaceC3448k1 x3 = q02.x(i30, i34);
                                R2 r23 = new R2(x22, c2908a32, x3);
                                long j14 = x22.f28591e;
                                if (j14 == com.anythink.basead.exoplayer.b.f6539b) {
                                    j14 = c2908a32.i;
                                }
                                x3.getClass();
                                long max = Math.max(j13, j14);
                                TP tp2 = x22.f28593g;
                                String str = tp2.f27776o;
                                boolean equals2 = com.anythink.basead.exoplayer.k.o.f8579C.equals(str);
                                int i35 = c2908a32.f29167e;
                                int i36 = equals2 ? i35 * 16 : i35 + 30;
                                C4065vP c4065vP = new C4065vP(tp2);
                                c4065vP.f34786o = i36;
                                if (i34 == 2) {
                                    int i37 = this.f27480b & 8;
                                    int i38 = tp2.f27768f;
                                    if (i37 != 0) {
                                        i38 |= i29 == -1 ? i28 : 2;
                                    }
                                    if (this.f27502y) {
                                        i38 |= 32768;
                                        c4065vP.f34779g = ((Integer) arrayList.get(i31)).intValue();
                                    }
                                    c4065vP.f34778f = i38;
                                    i34 = 2;
                                }
                                if (K4.b(str)) {
                                    int[] iArr = c2908a32.f29170h;
                                    arrayList4 = arrayList;
                                    boolean z9 = c2908a32.f29171j;
                                    int min = Math.min(!z9 ? iArr.length : i32, 20);
                                    PA.T(j14 != com.anythink.basead.exoplayer.b.f6539b ? i28 : i25);
                                    i4 = i29;
                                    long min2 = Math.min(j14, 10000000L);
                                    int i39 = i25;
                                    int i40 = i39;
                                    int i41 = -1;
                                    while (true) {
                                        jArr = c2908a32.f29168f;
                                        if (i39 >= min) {
                                            break;
                                        }
                                        int i42 = z9 ? i39 : iArr[i39];
                                        long j15 = jArr[i42];
                                        if (j15 > min2) {
                                            break;
                                        }
                                        if (j15 >= j10 && (i9 = c2908a32.f29166d[i42]) > i40) {
                                            i40 = i9;
                                            i41 = i42;
                                        }
                                        i39++;
                                    }
                                    if (i41 != -1) {
                                        j11 = jArr[i41];
                                        if (j11 == com.anythink.basead.exoplayer.b.f6539b) {
                                            O1 o12 = new O1(j11);
                                            i10 = i28;
                                            InterfaceC4043v3[] interfaceC4043v3Arr3 = new InterfaceC4043v3[i10];
                                            interfaceC4043v3Arr3[i25] = o12;
                                            r34 = new R3(interfaceC4043v3Arr3);
                                        } else {
                                            i10 = i28;
                                            r34 = null;
                                        }
                                        if (i34 == i10 && (i13 = x02.f28581a) != -1 && (i14 = x02.f28582b) != -1) {
                                            c4065vP.J = i13;
                                            c4065vP.f34769K = i14;
                                        }
                                        ArrayList arrayList12 = this.i;
                                        R3 r39 = !arrayList12.isEmpty() ? null : new R3(arrayList12);
                                        r35 = r38;
                                        AbstractC3217fl.l(i34, r32, c4065vP, tp2.f27773l, r39, r37, r35, r34);
                                        c4065vP.d(i27);
                                        tp = new TP(c4065vP);
                                        equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8619t);
                                        i11 = x22.f28597l;
                                        if (i11 != -1) {
                                            Iterator it3 = arrayList2.iterator();
                                            while (it3.hasNext()) {
                                                if (((C2908a3) it3.next()).f29163a.f28587a == i11) {
                                                    i12 = 1;
                                                    break;
                                                }
                                            }
                                        }
                                        i12 = i25;
                                        if (equals && i12 == 0) {
                                            x3.e(tp);
                                            r22 = r23;
                                        } else {
                                            r22 = r23;
                                            r22.f27305f = tp;
                                        }
                                        int i43 = i4;
                                        i29 = (i34 == 2 || i43 != -1) ? i43 : arrayList11.size();
                                        arrayList5 = arrayList11;
                                        arrayList5.add(r22);
                                        i30 = i33;
                                        j13 = max;
                                        i31++;
                                        arrayList8 = arrayList5;
                                        r38 = r35;
                                        arrayList9 = arrayList2;
                                        b10 = arrayList3;
                                        arrayList = arrayList4;
                                        i28 = 1;
                                    }
                                } else {
                                    arrayList4 = arrayList;
                                    i4 = i29;
                                }
                                j11 = -9223372036854775807L;
                                if (j11 == com.anythink.basead.exoplayer.b.f6539b) {
                                }
                                if (i34 == i10) {
                                    c4065vP.J = i13;
                                    c4065vP.f34769K = i14;
                                }
                                ArrayList arrayList122 = this.i;
                                if (!arrayList122.isEmpty()) {
                                }
                                r35 = r38;
                                AbstractC3217fl.l(i34, r32, c4065vP, tp2.f27773l, r39, r37, r35, r34);
                                c4065vP.d(i27);
                                tp = new TP(c4065vP);
                                equals = Objects.equals(str, com.anythink.basead.exoplayer.k.o.f8619t);
                                i11 = x22.f28597l;
                                if (i11 != -1) {
                                }
                                i12 = i25;
                                if (equals) {
                                }
                                r22 = r23;
                                r22.f27305f = tp;
                                int i432 = i4;
                                if (i34 == 2) {
                                }
                                arrayList5 = arrayList11;
                                arrayList5.add(r22);
                                i30 = i33;
                                j13 = max;
                                i31++;
                                arrayList8 = arrayList5;
                                r38 = r35;
                                arrayList9 = arrayList2;
                                b10 = arrayList3;
                                arrayList = arrayList4;
                                i28 = 1;
                            }
                        }
                        arrayList4 = arrayList;
                        arrayList5 = arrayList8;
                        arrayList3 = b10;
                        r35 = r38;
                        i31++;
                        arrayList8 = arrayList5;
                        r38 = r35;
                        arrayList9 = arrayList2;
                        b10 = arrayList3;
                        arrayList = arrayList4;
                        i28 = 1;
                    }
                    ArrayList arrayList13 = arrayList9;
                    int i44 = i29;
                    int i45 = -1;
                    R2[] r2Arr = (R2[]) arrayList8.toArray(new R2[i25]);
                    this.f27476D = r2Arr;
                    int length3 = r2Arr.length;
                    long[][] jArr2 = new long[length3][];
                    int[] iArr2 = new int[length3];
                    long[] jArr3 = new long[length3];
                    boolean[] zArr = new boolean[length3];
                    for (int i46 = 0; i46 < r2Arr.length; i46++) {
                        jArr2[i46] = new long[r2Arr[i46].f27301b.f29164b];
                        jArr3[i46] = r2Arr[i46].f27301b.f29168f[0];
                    }
                    long j16 = j10;
                    int i47 = 0;
                    while (i47 < r2Arr.length) {
                        long j17 = Long.MAX_VALUE;
                        int i48 = i45;
                        for (int i49 = 0; i49 < r2Arr.length; i49++) {
                            if (!zArr[i49]) {
                                long j18 = jArr3[i49];
                                if (j18 <= j17) {
                                    i48 = i49;
                                    j17 = j18;
                                }
                            }
                        }
                        int i50 = iArr2[i48];
                        long[] jArr4 = jArr2[i48];
                        jArr4[i50] = j16;
                        C2908a3 c2908a33 = r2Arr[i48].f27301b;
                        R2[] r2Arr2 = r2Arr;
                        boolean[] zArr2 = zArr;
                        j16 += c2908a33.f29166d[i50];
                        int i51 = i50 + 1;
                        iArr2[i48] = i51;
                        if (i51 < jArr4.length) {
                            jArr3[i48] = c2908a33.f29168f[i51];
                        } else {
                            zArr2[i48] = true;
                            i47++;
                        }
                        r2Arr = r2Arr2;
                        zArr = zArr2;
                        i45 = -1;
                    }
                    this.f27477E = jArr2;
                    this.f27475C.v();
                    this.f27475C.w(new Q2(j13, this.f27476D, i44));
                    arrayDeque.clear();
                    if (!this.f27501x) {
                        i = 1;
                        this.f27490m = true != arrayList13.isEmpty() ? 4 : 2;
                    }
                } else {
                    i = i17;
                    if (!arrayDeque.isEmpty()) {
                        ((Ww) arrayDeque.peek()).f28535e.add(ww);
                    }
                }
                i17 = i;
                i16 = 0;
            }
        }
        int i52 = this.f27490m;
        if (i52 == 4 || i52 == 2) {
            return;
        }
        this.f27490m = 0;
        this.f27493p = 0;
    }

    public S2(InterfaceC3720p3 interfaceC3720p3, int i) {
        this.f27479a = interfaceC3720p3;
        this.f27480b = i;
        SB sb = UB.f27942u;
        this.f27489l = C3675oC.f33115x;
        this.f27490m = 0;
        this.f27486h = new V2();
        this.i = new ArrayList();
        this.f27484f = new Lr(16);
        this.f27485g = new ArrayDeque();
        this.f27481c = new Lr(PA.f26862N);
        this.f27482d = new Lr(6);
        this.f27483e = new Lr();
        this.f27495r = -1;
        this.f27475C = Q0.f27098l0;
        this.f27476D = new R2[0];
        this.f27487j = new ArrayList();
        this.f27488k = new ArrayList();
    }
}
