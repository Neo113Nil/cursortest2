package com.yandex.mobile.ads.impl;

import android.util.Pair;
import com.yandex.mobile.ads.impl.AbstractC2346xg;
import com.yandex.mobile.ads.impl.tw1;
import com.yandex.mobile.ads.impl.wz0;
import com.yandex.mobile.ads.impl.yb0;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class o11 implements p70, tw1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f29832a;

    /* renamed from: b, reason: collision with root package name */
    private final sf1 f29833b;

    /* renamed from: c, reason: collision with root package name */
    private final sf1 f29834c;

    /* renamed from: d, reason: collision with root package name */
    private final sf1 f29835d;

    /* renamed from: e, reason: collision with root package name */
    private final sf1 f29836e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<AbstractC2346xg.a> f29837f;

    /* renamed from: g, reason: collision with root package name */
    private final xw1 f29838g;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList f29839h;

    /* renamed from: i, reason: collision with root package name */
    private int f29840i;

    /* renamed from: j, reason: collision with root package name */
    private int f29841j;

    /* renamed from: k, reason: collision with root package name */
    private long f29842k;

    /* renamed from: l, reason: collision with root package name */
    private int f29843l;

    /* renamed from: m, reason: collision with root package name */
    private sf1 f29844m;

    /* renamed from: n, reason: collision with root package name */
    private int f29845n;

    /* renamed from: o, reason: collision with root package name */
    private int f29846o;

    /* renamed from: p, reason: collision with root package name */
    private int f29847p;

    /* renamed from: q, reason: collision with root package name */
    private int f29848q;

    /* renamed from: r, reason: collision with root package name */
    private r70 f29849r;

    /* renamed from: s, reason: collision with root package name */
    private a[] f29850s;

    /* renamed from: t, reason: collision with root package name */
    private long[][] f29851t;

    /* renamed from: u, reason: collision with root package name */
    private int f29852u;

    /* renamed from: v, reason: collision with root package name */
    private long f29853v;

    /* renamed from: w, reason: collision with root package name */
    private int f29854w;

    /* renamed from: x, reason: collision with root package name */
    private m11 f29855x;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final k52 f29856a;

        /* renamed from: b, reason: collision with root package name */
        public final q52 f29857b;

        /* renamed from: c, reason: collision with root package name */
        public final p52 f29858c;

        /* renamed from: d, reason: collision with root package name */
        public final x62 f29859d;

        /* renamed from: e, reason: collision with root package name */
        public int f29860e;

        public a(k52 k52Var, q52 q52Var, p52 p52Var) {
            this.f29856a = k52Var;
            this.f29857b = q52Var;
            this.f29858c = p52Var;
            this.f29859d = "audio/true-hd".equals(k52Var.f28066f.f34991m) ? new x62() : null;
        }
    }

    static {
        new t70() { // from class: com.yandex.mobile.ads.impl.Db
            @Override // com.yandex.mobile.ads.impl.t70
            public final p70[] a() {
                p70[] d4;
                d4 = o11.d();
                return d4;
            }
        };
    }

    public o11() {
        this(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ k52 a(k52 k52Var) {
        return k52Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ p70[] d() {
        return new p70[]{new o11()};
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final long c() {
        return this.f29853v;
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void release() {
    }

    public o11(int i4) {
        this.f29832a = 0;
        this.f29840i = 0;
        this.f29838g = new xw1();
        this.f29839h = new ArrayList();
        this.f29836e = new sf1(16);
        this.f29837f = new ArrayDeque<>();
        this.f29833b = new sf1(s31.f31556a);
        this.f29834c = new sf1(4);
        this.f29835d = new sf1();
        this.f29845n = -1;
        this.f29849r = r70.f31061a;
        this.f29850s = new a[0];
    }

    private void c(long j4) {
        while (!this.f29837f.isEmpty() && this.f29837f.peek().f34553b == j4) {
            AbstractC2346xg.a pop = this.f29837f.pop();
            if (pop.f34552a == 1836019574) {
                a(pop);
                this.f29837f.clear();
                this.f29840i = 2;
            } else if (!this.f29837f.isEmpty()) {
                this.f29837f.peek().f34555d.add(pop);
            }
        }
        if (this.f29840i != 2) {
            this.f29840i = 0;
            this.f29843l = 0;
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(r70 r70Var) {
        this.f29849r = r70Var;
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final boolean b() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03a1 A[EDGE_INSN: B:180:0x03a1->B:181:0x03a1 BREAK  A[LOOP:7: B:114:0x026f->B:120:0x0396], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x03c2 A[LOOP:10: B:182:0x03bf->B:184:0x03c2, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(AbstractC2346xg.a aVar) {
        int i4;
        int i5;
        int i6;
        wz0 wz0Var;
        wz0 wz0Var2;
        xd0 xd0Var;
        wz0 wz0Var3;
        ArrayList a4;
        int size;
        int i7;
        long j4;
        a[] aVarArr;
        int i8;
        int i9;
        wz0 wz0Var4;
        ArrayList arrayList;
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList2;
        int i14;
        int i15;
        xd0 xd0Var2;
        int i16;
        zt0 zt0Var;
        int i17;
        int i18;
        int i19 = 4;
        ArrayList arrayList3 = new ArrayList();
        boolean z4 = this.f29854w == 1;
        xd0 xd0Var3 = new xd0();
        AbstractC2346xg.b c4 = aVar.c(1969517665);
        int i20 = 1751411826;
        int i21 = 8;
        if (c4 != null) {
            int i22 = C2369yg.f35101b;
            sf1 sf1Var = c4.f34556b;
            sf1Var.e(8);
            wz0 wz0Var5 = null;
            wz0 wz0Var6 = null;
            i6 = 0;
            while (sf1Var.a() >= i21) {
                int d4 = sf1Var.d();
                int h4 = sf1Var.h();
                int h5 = sf1Var.h();
                if (h5 == 1835365473) {
                    sf1Var.e(d4);
                    int i23 = d4 + h4;
                    sf1Var.f(i21);
                    int d5 = sf1Var.d();
                    sf1Var.f(i19);
                    i17 = i19;
                    if (sf1Var.h() != i20) {
                        d5 += 4;
                    }
                    sf1Var.e(d5);
                    while (true) {
                        if (sf1Var.d() >= i23) {
                            break;
                        }
                        int d6 = sf1Var.d();
                        int h6 = sf1Var.h();
                        if (sf1Var.h() == 1768715124) {
                            sf1Var.e(d6);
                            int i24 = d6 + h6;
                            sf1Var.f(i21);
                            ArrayList arrayList4 = new ArrayList();
                            while (sf1Var.d() < i24) {
                                zh0 b4 = c01.b(sf1Var);
                                if (b4 != null) {
                                    arrayList4.add(b4);
                                }
                            }
                            if (!arrayList4.isEmpty()) {
                                wz0Var6 = new wz0(arrayList4);
                            }
                        } else {
                            sf1Var.e(d6 + h6);
                        }
                    }
                    i18 = i21;
                    wz0Var6 = null;
                    sf1Var.e(d4 + h4);
                    i19 = i17;
                    i21 = i18;
                    i20 = 1751411826;
                } else {
                    i17 = i19;
                    if (h5 == 1936553057) {
                        sf1Var.e(d4);
                        int i25 = d4 + h4;
                        sf1Var.f(12);
                        while (true) {
                            if (sf1Var.d() >= i25) {
                                i18 = i21;
                                break;
                            }
                            int d7 = sf1Var.d();
                            int h7 = sf1Var.h();
                            i18 = i21;
                            if (sf1Var.h() != 1935766900) {
                                sf1Var.e(d7 + h7);
                                i21 = i18;
                            } else if (h7 >= 14) {
                                sf1Var.f(5);
                                int t4 = sf1Var.t();
                                if (t4 == 12 || t4 == 13) {
                                    float f4 = t4 == 12 ? 240.0f : 120.0f;
                                    sf1Var.f(1);
                                    wz0Var5 = new wz0(new h02(sf1Var.t(), f4));
                                }
                            }
                        }
                        wz0Var5 = null;
                        sf1Var.e(d4 + h4);
                        i19 = i17;
                        i21 = i18;
                        i20 = 1751411826;
                    }
                    i18 = i21;
                    sf1Var.e(d4 + h4);
                    i19 = i17;
                    i21 = i18;
                    i20 = 1751411826;
                }
            }
            i4 = i19;
            i5 = i21;
            Pair create = Pair.create(wz0Var6, wz0Var5);
            wz0 wz0Var7 = (wz0) create.first;
            wz0 wz0Var8 = (wz0) create.second;
            if (wz0Var7 != null) {
                xd0Var3.a(wz0Var7);
            }
            wz0Var = wz0Var8;
            wz0Var2 = wz0Var7;
        } else {
            i4 = 4;
            i5 = 8;
            i6 = 0;
            wz0Var = null;
            wz0Var2 = null;
        }
        AbstractC2346xg.a b5 = aVar.b(1835365473);
        if (b5 != null) {
            int i26 = C2369yg.f35101b;
            AbstractC2346xg.b c5 = b5.c(1751411826);
            AbstractC2346xg.b c6 = b5.c(1801812339);
            AbstractC2346xg.b c7 = b5.c(1768715124);
            if (c5 != null && c6 != null && c7 != null) {
                sf1 sf1Var2 = c5.f34556b;
                sf1Var2.e(16);
                if (sf1Var2.h() == 1835299937) {
                    sf1 sf1Var3 = c6.f34556b;
                    sf1Var3.e(12);
                    int h8 = sf1Var3.h();
                    String[] strArr = new String[h8];
                    for (int i27 = i6; i27 < h8; i27++) {
                        int h9 = sf1Var3.h();
                        sf1Var3.f(i4);
                        strArr[i27] = sf1Var3.a(h9 - 8, un.f33183c);
                    }
                    sf1 sf1Var4 = c7.f34556b;
                    int i28 = i5;
                    sf1Var4.e(i28);
                    ArrayList arrayList5 = new ArrayList();
                    while (sf1Var4.a() > i28) {
                        int d8 = sf1Var4.d();
                        int h10 = sf1Var4.h();
                        int h11 = sf1Var4.h() - 1;
                        if (h11 >= 0 && h11 < h8) {
                            String str = strArr[h11];
                            int i29 = d8 + h10;
                            while (true) {
                                int d9 = sf1Var4.d();
                                if (d9 >= i29) {
                                    xd0Var2 = xd0Var3;
                                    i16 = h8;
                                    zt0Var = null;
                                    break;
                                }
                                int h12 = sf1Var4.h();
                                xd0Var2 = xd0Var3;
                                if (sf1Var4.h() == 1684108385) {
                                    int h13 = sf1Var4.h();
                                    int h14 = sf1Var4.h();
                                    int i30 = h12 - 16;
                                    byte[] bArr = new byte[i30];
                                    i16 = h8;
                                    sf1Var4.a(bArr, i6, i30);
                                    zt0Var = new zt0(h14, h13, str, bArr);
                                    break;
                                }
                                sf1Var4.e(d9 + h12);
                                xd0Var3 = xd0Var2;
                                i6 = 0;
                            }
                            if (zt0Var != null) {
                                arrayList5.add(zt0Var);
                            }
                        } else {
                            xd0Var2 = xd0Var3;
                            i16 = h8;
                            fr0.a("Skipped metadata with unknown key index: ", h11, "AtomParsers");
                        }
                        sf1Var4.e(d8 + h10);
                        xd0Var3 = xd0Var2;
                        h8 = i16;
                        i28 = 8;
                        i6 = 0;
                    }
                    xd0Var = xd0Var3;
                    if (!arrayList5.isEmpty()) {
                        wz0Var3 = new wz0(arrayList5);
                        xd0 xd0Var4 = xd0Var;
                        a4 = C2369yg.a(aVar, xd0Var4, -9223372036854775807L, null, (this.f29832a & 1) != 0, z4, new ud0() { // from class: com.yandex.mobile.ads.impl.Cb
                            @Override // com.yandex.mobile.ads.impl.ud0
                            public final Object apply(Object obj) {
                                k52 a5;
                                a5 = o11.a((k52) obj);
                                return a5;
                            }
                        });
                        size = a4.size();
                        i7 = 0;
                        int i31 = -1;
                        long j5 = -9223372036854775807L;
                        while (true) {
                            j4 = 0;
                            if (i7 >= size) {
                                break;
                            }
                            q52 q52Var = (q52) a4.get(i7);
                            if (q52Var.f30678b == 0) {
                                arrayList = a4;
                                i10 = size;
                                arrayList2 = arrayList3;
                                wz0Var4 = wz0Var2;
                            } else {
                                k52 k52Var = q52Var.f30677a;
                                ArrayList arrayList6 = arrayList3;
                                wz0Var4 = wz0Var2;
                                long j6 = k52Var.f28065e;
                                if (j6 == -9223372036854775807L) {
                                    j6 = q52Var.f30684h;
                                }
                                j5 = Math.max(j5, j6);
                                arrayList = a4;
                                i10 = size;
                                a aVar2 = new a(k52Var, q52Var, this.f29849r.a(i7, k52Var.f28062b));
                                if ("audio/true-hd".equals(k52Var.f28066f.f34991m)) {
                                    i11 = q52Var.f30681e * 16;
                                } else {
                                    i11 = q52Var.f30681e + 30;
                                }
                                yb0.a a5 = k52Var.f28066f.a();
                                a5.h(i11);
                                if (k52Var.f28062b == 2 && j6 > 0 && (i15 = q52Var.f30678b) > 1) {
                                    a5.a(i15 / (j6 / 1000000.0f));
                                }
                                if (k52Var.f28062b == 1 && (i14 = xd0Var4.f34517a) != -1 && xd0Var4.f34518b != -1) {
                                    a5.d(i14).e(xd0Var4.f34518b);
                                }
                                int i32 = k52Var.f28062b;
                                wz0[] wz0VarArr = {wz0Var, this.f29839h.isEmpty() ? null : new wz0(this.f29839h)};
                                wz0 wz0Var9 = new wz0(new wz0.b[0]);
                                if (i32 == 1) {
                                    if (wz0Var4 != null) {
                                        wz0Var9 = wz0Var4;
                                    }
                                } else if (i32 == 2 && wz0Var3 != null) {
                                    for (int i33 = 0; i33 < wz0Var3.c(); i33 = i12 + 1) {
                                        wz0.b a6 = wz0Var3.a(i33);
                                        if (a6 instanceof zt0) {
                                            zt0 zt0Var2 = (zt0) a6;
                                            i12 = i33;
                                            if ("com.android.capture.fps".equals(zt0Var2.f35763b)) {
                                                i13 = 1;
                                                wz0Var9 = new wz0(zt0Var2);
                                                break;
                                            }
                                        } else {
                                            i12 = i33;
                                        }
                                    }
                                }
                                i13 = 1;
                                for (int i34 = 0; i34 < 2; i34 += i13) {
                                    wz0Var9 = wz0Var9.a(wz0VarArr[i34]);
                                }
                                if (wz0Var9.c() > 0) {
                                    a5.a(wz0Var9);
                                }
                                aVar2.f29858c.a(a5.a());
                                if (k52Var.f28062b == 2 && i31 == -1) {
                                    i31 = arrayList6.size();
                                }
                                arrayList2 = arrayList6;
                                arrayList2.add(aVar2);
                            }
                            i7++;
                            arrayList3 = arrayList2;
                            wz0Var2 = wz0Var4;
                            a4 = arrayList;
                            size = i10;
                        }
                        this.f29852u = i31;
                        this.f29853v = j5;
                        aVarArr = (a[]) arrayList3.toArray(new a[0]);
                        this.f29850s = aVarArr;
                        long[][] jArr = new long[aVarArr.length][];
                        int[] iArr = new int[aVarArr.length];
                        long[] jArr2 = new long[aVarArr.length];
                        boolean[] zArr = new boolean[aVarArr.length];
                        for (i8 = 0; i8 < aVarArr.length; i8++) {
                            jArr[i8] = new long[aVarArr[i8].f29857b.f30678b];
                            jArr2[i8] = aVarArr[i8].f29857b.f30682f[0];
                        }
                        i9 = 0;
                        while (i9 < aVarArr.length) {
                            long j7 = Long.MAX_VALUE;
                            int i35 = -1;
                            for (int i36 = 0; i36 < aVarArr.length; i36++) {
                                if (!zArr[i36]) {
                                    long j8 = jArr2[i36];
                                    if (j8 <= j7) {
                                        i35 = i36;
                                        j7 = j8;
                                    }
                                }
                            }
                            int i37 = iArr[i35];
                            long[] jArr3 = jArr[i35];
                            jArr3[i37] = j4;
                            q52 q52Var2 = aVarArr[i35].f29857b;
                            j4 += q52Var2.f30680d[i37];
                            int i38 = i37 + 1;
                            iArr[i35] = i38;
                            if (i38 < jArr3.length) {
                                jArr2[i35] = q52Var2.f30682f[i38];
                            } else {
                                zArr[i35] = true;
                                i9++;
                            }
                        }
                        this.f29851t = jArr;
                        this.f29849r.a();
                        this.f29849r.a(this);
                    }
                    wz0Var3 = null;
                    xd0 xd0Var42 = xd0Var;
                    a4 = C2369yg.a(aVar, xd0Var42, -9223372036854775807L, null, (this.f29832a & 1) != 0, z4, new ud0() { // from class: com.yandex.mobile.ads.impl.Cb
                        @Override // com.yandex.mobile.ads.impl.ud0
                        public final Object apply(Object obj) {
                            k52 a52;
                            a52 = o11.a((k52) obj);
                            return a52;
                        }
                    });
                    size = a4.size();
                    i7 = 0;
                    int i312 = -1;
                    long j52 = -9223372036854775807L;
                    while (true) {
                        j4 = 0;
                        if (i7 >= size) {
                        }
                        i7++;
                        arrayList3 = arrayList2;
                        wz0Var2 = wz0Var4;
                        a4 = arrayList;
                        size = i10;
                    }
                    this.f29852u = i312;
                    this.f29853v = j52;
                    aVarArr = (a[]) arrayList3.toArray(new a[0]);
                    this.f29850s = aVarArr;
                    long[][] jArr4 = new long[aVarArr.length][];
                    int[] iArr2 = new int[aVarArr.length];
                    long[] jArr22 = new long[aVarArr.length];
                    boolean[] zArr2 = new boolean[aVarArr.length];
                    while (i8 < aVarArr.length) {
                    }
                    i9 = 0;
                    while (i9 < aVarArr.length) {
                    }
                    this.f29851t = jArr4;
                    this.f29849r.a();
                    this.f29849r.a(this);
                }
            }
        }
        xd0Var = xd0Var3;
        wz0Var3 = null;
        xd0 xd0Var422 = xd0Var;
        a4 = C2369yg.a(aVar, xd0Var422, -9223372036854775807L, null, (this.f29832a & 1) != 0, z4, new ud0() { // from class: com.yandex.mobile.ads.impl.Cb
            @Override // com.yandex.mobile.ads.impl.ud0
            public final Object apply(Object obj) {
                k52 a52;
                a52 = o11.a((k52) obj);
                return a52;
            }
        });
        size = a4.size();
        i7 = 0;
        int i3122 = -1;
        long j522 = -9223372036854775807L;
        while (true) {
            j4 = 0;
            if (i7 >= size) {
            }
            i7++;
            arrayList3 = arrayList2;
            wz0Var2 = wz0Var4;
            a4 = arrayList;
            size = i10;
        }
        this.f29852u = i3122;
        this.f29853v = j522;
        aVarArr = (a[]) arrayList3.toArray(new a[0]);
        this.f29850s = aVarArr;
        long[][] jArr42 = new long[aVarArr.length][];
        int[] iArr22 = new int[aVarArr.length];
        long[] jArr222 = new long[aVarArr.length];
        boolean[] zArr22 = new boolean[aVarArr.length];
        while (i8 < aVarArr.length) {
        }
        i9 = 0;
        while (i9 < aVarArr.length) {
        }
        this.f29851t = jArr42;
        this.f29849r.a();
        this.f29849r.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.tw1
    public final tw1.a b(long j4) {
        long j5;
        long j6;
        long j7;
        boolean z4;
        int i4;
        long j8;
        long j9;
        int a4;
        long j10 = j4;
        a[] aVarArr = this.f29850s;
        if (aVarArr.length == 0) {
            vw1 vw1Var = vw1.f33814c;
            return new tw1.a(vw1Var, vw1Var);
        }
        int i5 = this.f29852u;
        boolean z5 = false;
        int i6 = -1;
        if (i5 != -1) {
            q52 q52Var = aVarArr[i5].f29857b;
            int b4 = u82.b(q52Var.f30682f, j10, false);
            while (true) {
                if (b4 < 0) {
                    b4 = -1;
                    break;
                }
                if ((q52Var.f30683g[b4] & 1) != 0) {
                    break;
                }
                b4--;
            }
            if (b4 == -1) {
                b4 = q52Var.a(j10);
            }
            if (b4 == -1) {
                vw1 vw1Var2 = vw1.f33814c;
                return new tw1.a(vw1Var2, vw1Var2);
            }
            long j11 = q52Var.f30682f[b4];
            j5 = q52Var.f30679c[b4];
            if (j11 >= j10 || b4 >= q52Var.f30678b - 1 || (a4 = q52Var.a(j10)) == -1 || a4 == b4) {
                j9 = -1;
                j7 = -9223372036854775807L;
            } else {
                j7 = q52Var.f30682f[a4];
                j9 = q52Var.f30679c[a4];
            }
            j6 = j9;
            j10 = j11;
        } else {
            j5 = Long.MAX_VALUE;
            j6 = -1;
            j7 = -9223372036854775807L;
        }
        int i7 = 0;
        while (true) {
            a[] aVarArr2 = this.f29850s;
            if (i7 >= aVarArr2.length) {
                break;
            }
            if (i7 != this.f29852u) {
                q52 q52Var2 = aVarArr2[i7].f29857b;
                int b5 = u82.b(q52Var2.f30682f, j10, z5);
                while (true) {
                    if (b5 < 0) {
                        j8 = -9223372036854775807L;
                        b5 = i6;
                        break;
                    }
                    j8 = -9223372036854775807L;
                    if ((q52Var2.f30683g[b5] & 1) != 0) {
                        break;
                    }
                    b5--;
                }
                if (b5 == i6) {
                    b5 = q52Var2.a(j10);
                }
                if (b5 != i6) {
                    j5 = Math.min(q52Var2.f30679c[b5], j5);
                }
                if (j7 != j8) {
                    z4 = false;
                    int b6 = u82.b(q52Var2.f30682f, j7, false);
                    while (true) {
                        if (b6 < 0) {
                            b6 = -1;
                            break;
                        }
                        if ((q52Var2.f30683g[b6] & 1) != 0) {
                            break;
                        }
                        b6--;
                    }
                    i4 = -1;
                    if (b6 == -1) {
                        b6 = q52Var2.a(j7);
                    }
                    if (b6 != -1) {
                        j6 = Math.min(q52Var2.f30679c[b6], j6);
                    }
                } else {
                    z4 = false;
                    i4 = -1;
                }
            } else {
                z4 = z5;
                i4 = i6;
            }
            i7++;
            i6 = i4;
            z5 = z4;
        }
        vw1 vw1Var3 = new vw1(j10, j5);
        if (j7 == -9223372036854775807L) {
            return new tw1.a(vw1Var3, vw1Var3);
        }
        return new tw1.a(vw1Var3, new vw1(j7, j6));
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x0423, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0403, code lost:
    
        if (r6 > 2147483647L) goto L274;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0405, code lost:
    
        r8 = new com.yandex.mobile.ads.impl.sf1((int) r6);
        java.lang.System.arraycopy(r36.f29836e.c(), 0, r8.c(), 0, 8);
        r36.f29844m = r8;
        r36.f29840i = 1;
     */
    @Override // com.yandex.mobile.ads.impl.p70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(q70 q70Var, hj1 hj1Var) {
        long j4;
        char c4;
        long j5;
        int i4;
        boolean z4;
        AbstractC2346xg.a peek;
        while (true) {
            int i5 = this.f29840i;
            char c5 = 2;
            if (i5 == 0) {
                if (this.f29843l == 0) {
                    if (!q70Var.a(this.f29836e.c(), 0, 8, true)) {
                        if (this.f29854w != 2 || (this.f29832a & 2) == 0) {
                            return -1;
                        }
                        p52 a4 = this.f29849r.a(0, 4);
                        m11 m11Var = this.f29855x;
                        a4.a(new yb0.a().a(m11Var != null ? new wz0(m11Var) : null).a());
                        this.f29849r.a();
                        this.f29849r.a(new tw1.b(-9223372036854775807L, 0L));
                        return -1;
                    }
                    this.f29843l = 8;
                    this.f29836e.e(0);
                    this.f29842k = this.f29836e.v();
                    this.f29841j = this.f29836e.h();
                }
                long j6 = this.f29842k;
                if (j6 == 1) {
                    q70Var.b(this.f29836e.c(), 8, 8);
                    this.f29843l += 8;
                    this.f29842k = this.f29836e.y();
                } else if (j6 == 0) {
                    long b4 = q70Var.b();
                    if (b4 == -1 && (peek = this.f29837f.peek()) != null) {
                        b4 = peek.f34553b;
                    }
                    if (b4 != -1) {
                        this.f29842k = (b4 - q70Var.a()) + this.f29843l;
                    }
                }
                long j7 = this.f29842k;
                int i6 = this.f29843l;
                if (j7 >= i6) {
                    int i7 = this.f29841j;
                    if (i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1701082227 || i7 == 1835365473) {
                        long a5 = q70Var.a();
                        long j8 = this.f29842k;
                        long j9 = this.f29843l;
                        long j10 = (a5 + j8) - j9;
                        if (j8 != j9 && this.f29841j == 1835365473) {
                            this.f29835d.c(8);
                            q70Var.a(this.f29835d.c(), 0, 8);
                            sf1 sf1Var = this.f29835d;
                            int i8 = C2369yg.f35101b;
                            int d4 = sf1Var.d();
                            sf1Var.f(4);
                            if (sf1Var.h() != 1751411826) {
                                d4 += 4;
                            }
                            sf1Var.e(d4);
                            q70Var.a(this.f29835d.d());
                            q70Var.c();
                        }
                        this.f29837f.push(new AbstractC2346xg.a(this.f29841j, j10));
                        if (this.f29842k == this.f29843l) {
                            c(j10);
                        } else {
                            this.f29840i = 0;
                            this.f29843l = 0;
                        }
                    } else if (i7 != 1835296868 && i7 != 1836476516 && i7 != 1751411826 && i7 != 1937011556 && i7 != 1937011827 && i7 != 1937011571 && i7 != 1668576371 && i7 != 1701606260 && i7 != 1937011555 && i7 != 1937011578 && i7 != 1937013298 && i7 != 1937007471 && i7 != 1668232756 && i7 != 1953196132 && i7 != 1718909296 && i7 != 1969517665 && i7 != 1801812339 && i7 != 1768715124) {
                        long a6 = q70Var.a();
                        long j11 = this.f29843l;
                        long j12 = a6 - j11;
                        if (this.f29841j == 1836086884) {
                            this.f29855x = new m11(0L, j12, -9223372036854775807L, j12 + j11, this.f29842k - j11);
                        }
                        this.f29844m = null;
                        this.f29840i = 1;
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    throw wf1.a("Atom size less than header length (unsupported).");
                }
            } else {
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            this.f29838g.a(q70Var, hj1Var, this.f29839h);
                            if (hj1Var.f26771a == 0) {
                                this.f29840i = 0;
                                this.f29843l = 0;
                            }
                            return 1;
                        }
                        throw new IllegalStateException();
                    }
                    long a7 = q70Var.a();
                    if (this.f29845n == -1) {
                        int i9 = 0;
                        boolean z5 = true;
                        boolean z6 = true;
                        j4 = 0;
                        int i10 = -1;
                        int i11 = -1;
                        long j13 = Long.MAX_VALUE;
                        long j14 = Long.MAX_VALUE;
                        long j15 = Long.MAX_VALUE;
                        j5 = 262144;
                        while (true) {
                            a[] aVarArr = this.f29850s;
                            if (i9 >= aVarArr.length) {
                                break;
                            }
                            a aVar = aVarArr[i9];
                            int i12 = aVar.f29860e;
                            q52 q52Var = aVar.f29857b;
                            char c6 = c5;
                            if (i12 != q52Var.f30678b) {
                                long j16 = q52Var.f30679c[i12];
                                long[][] jArr = this.f29851t;
                                int i13 = u82.f32873a;
                                long j17 = jArr[i9][i12];
                                long j18 = j16 - a7;
                                boolean z7 = j18 < 0 || j18 >= 262144;
                                if ((!z7 && z5) || (z7 == z5 && j18 < j15)) {
                                    z5 = z7;
                                    i11 = i9;
                                    j15 = j18;
                                    j14 = j17;
                                }
                                if (j17 < j13) {
                                    z6 = z7;
                                    i10 = i9;
                                    j13 = j17;
                                }
                            }
                            i9++;
                            c5 = c6;
                        }
                        c4 = c5;
                        int i14 = (j13 == Long.MAX_VALUE || !z6 || j14 < j13 + 10485760) ? i11 : i10;
                        this.f29845n = i14;
                        if (i14 == -1) {
                            return -1;
                        }
                    } else {
                        j4 = 0;
                        c4 = 2;
                        j5 = 262144;
                    }
                    a aVar2 = this.f29850s[this.f29845n];
                    p52 p52Var = aVar2.f29858c;
                    int i15 = aVar2.f29860e;
                    q52 q52Var2 = aVar2.f29857b;
                    long j19 = q52Var2.f30679c[i15];
                    int i16 = q52Var2.f30680d[i15];
                    x62 x62Var = aVar2.f29859d;
                    int i17 = 4;
                    long j20 = (j19 - a7) + this.f29846o;
                    if (j20 >= j4 && j20 < j5) {
                        if (aVar2.f29856a.f28067g == 1) {
                            j20 += 8;
                            i16 -= 8;
                        }
                        q70Var.a((int) j20);
                        k52 k52Var = aVar2.f29856a;
                        if (k52Var.f28070j != 0) {
                            byte[] c7 = this.f29834c.c();
                            c7[0] = 0;
                            c7[1] = 0;
                            c7[c4] = 0;
                            int i18 = aVar2.f29856a.f28070j;
                            int i19 = 4 - i18;
                            while (this.f29847p < i16) {
                                int i20 = this.f29848q;
                                if (i20 == 0) {
                                    q70Var.b(c7, i19, i18);
                                    this.f29846o += i18;
                                    this.f29834c.e(0);
                                    int h4 = this.f29834c.h();
                                    if (h4 >= 0) {
                                        this.f29848q = h4;
                                        this.f29833b.e(0);
                                        int i21 = i17;
                                        p52Var.a(i21, this.f29833b);
                                        this.f29847p += i21;
                                        i16 += i19;
                                    } else {
                                        throw wf1.a("Invalid NAL length", (Exception) null);
                                    }
                                } else {
                                    int b5 = p52Var.b(q70Var, i20, false);
                                    this.f29846o += b5;
                                    this.f29847p += b5;
                                    this.f29848q -= b5;
                                }
                                i17 = 4;
                            }
                        } else {
                            if ("audio/ac4".equals(k52Var.f28066f.f34991m)) {
                                if (this.f29847p == 0) {
                                    C2214s.a(i16, this.f29835d);
                                    i4 = 7;
                                    p52Var.a(7, this.f29835d);
                                    this.f29847p += 7;
                                } else {
                                    i4 = 7;
                                }
                                i16 += i4;
                            } else if (x62Var != null) {
                                x62Var.a(q70Var);
                            }
                            while (true) {
                                int i22 = this.f29847p;
                                if (i22 >= i16) {
                                    break;
                                }
                                int b6 = p52Var.b(q70Var, i16 - i22, false);
                                this.f29846o += b6;
                                this.f29847p += b6;
                                this.f29848q -= b6;
                            }
                        }
                        int i23 = i16;
                        q52 q52Var3 = aVar2.f29857b;
                        long j21 = q52Var3.f30682f[i15];
                        int i24 = q52Var3.f30683g[i15];
                        if (x62Var != null) {
                            x62Var.a(p52Var, j21, i24, i23, 0, null);
                            if (i15 + 1 == aVar2.f29857b.f30678b) {
                                x62Var.a(p52Var, null);
                            }
                        } else {
                            p52Var.a(j21, i24, i23, 0, null);
                        }
                        aVar2.f29860e++;
                        this.f29845n = -1;
                        this.f29846o = 0;
                        this.f29847p = 0;
                        this.f29848q = 0;
                        return 0;
                    }
                    hj1Var.f26771a = j19;
                    return 1;
                }
                long j22 = this.f29842k - this.f29843l;
                long a8 = q70Var.a() + j22;
                sf1 sf1Var2 = this.f29844m;
                if (sf1Var2 != null) {
                    q70Var.b(sf1Var2.c(), this.f29843l, (int) j22);
                    if (this.f29841j == 1718909296) {
                        sf1Var2.e(8);
                        int h5 = sf1Var2.h();
                        int i25 = h5 != 1751476579 ? h5 != 1903435808 ? 0 : 1 : 2;
                        if (i25 == 0) {
                            sf1Var2.f(4);
                            while (true) {
                                if (sf1Var2.a() <= 0) {
                                    i25 = 0;
                                    break;
                                }
                                int h6 = sf1Var2.h();
                                i25 = h6 != 1751476579 ? h6 != 1903435808 ? 0 : 1 : 2;
                                if (i25 != 0) {
                                    break;
                                }
                            }
                        }
                        this.f29854w = i25;
                    } else if (!this.f29837f.isEmpty()) {
                        this.f29837f.peek().f34554c.add(new AbstractC2346xg.b(this.f29841j, sf1Var2));
                    }
                } else if (j22 < 262144) {
                    q70Var.a((int) j22);
                } else {
                    hj1Var.f26771a = q70Var.a() + j22;
                    z4 = true;
                    c(a8);
                    if (z4 && this.f29840i != 2) {
                        return 1;
                    }
                }
                z4 = false;
                c(a8);
                if (z4) {
                    return 1;
                }
                continue;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final void a(long j4, long j5) {
        this.f29837f.clear();
        this.f29843l = 0;
        this.f29845n = -1;
        this.f29846o = 0;
        this.f29847p = 0;
        this.f29848q = 0;
        if (j4 == 0) {
            if (this.f29840i != 3) {
                this.f29840i = 0;
                this.f29843l = 0;
                return;
            } else {
                this.f29838g.a();
                this.f29839h.clear();
                return;
            }
        }
        for (a aVar : this.f29850s) {
            q52 q52Var = aVar.f29857b;
            int b4 = u82.b(q52Var.f30682f, j5, false);
            while (true) {
                if (b4 < 0) {
                    b4 = -1;
                    break;
                } else if ((q52Var.f30683g[b4] & 1) != 0) {
                    break;
                } else {
                    b4--;
                }
            }
            if (b4 == -1) {
                b4 = q52Var.a(j5);
            }
            aVar.f29860e = b4;
            x62 x62Var = aVar.f29859d;
            if (x62Var != null) {
                x62Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.p70
    public final boolean a(q70 q70Var) {
        return i02.a(q70Var, (this.f29832a & 2) != 0);
    }
}
