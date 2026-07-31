package m0;

import android.os.Trace;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class s {
    public int A;
    public int B;
    public boolean C;
    public final r D;
    public final ArrayList E;
    public boolean F;
    public e2 G;
    public f2 H;
    public i2 I;
    public boolean J;
    public o1 K;
    public n0.a L;
    public final n0.b M;
    public a N;
    public n0.c O;
    public c5.n P;
    public final x0.b Q;
    public final g6.h R;
    public boolean S;
    public long T;
    public x U;

    /* renamed from: a, reason: collision with root package name */
    public final w1.y1 f5073a;

    /* renamed from: b, reason: collision with root package name */
    public final v f5074b;

    /* renamed from: c, reason: collision with root package name */
    public final f2 f5075c;

    /* renamed from: d, reason: collision with root package name */
    public final o.m0 f5076d;

    /* renamed from: e, reason: collision with root package name */
    public final n0.a f5077e;

    /* renamed from: f, reason: collision with root package name */
    public final n0.a f5078f;

    /* renamed from: g, reason: collision with root package name */
    public final b1.b f5079g;

    /* renamed from: h, reason: collision with root package name */
    public final y f5080h;

    /* renamed from: j, reason: collision with root package name */
    public n1 f5081j;

    /* renamed from: k, reason: collision with root package name */
    public int f5082k;

    /* renamed from: l, reason: collision with root package name */
    public int f5083l;

    /* renamed from: m, reason: collision with root package name */
    public int f5084m;

    /* renamed from: o, reason: collision with root package name */
    public int[] f5086o;

    /* renamed from: p, reason: collision with root package name */
    public o.v f5087p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f5088q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f5089r;

    /* renamed from: v, reason: collision with root package name */
    public o.x f5093v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f5094w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f5096y;
    public final ArrayList i = new ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public final n0 f5085n = new n0();

    /* renamed from: s, reason: collision with root package name */
    public final ArrayList f5090s = new ArrayList();

    /* renamed from: t, reason: collision with root package name */
    public final n0 f5091t = new n0();

    /* renamed from: u, reason: collision with root package name */
    public o1 f5092u = u0.g.f7151g;

    /* renamed from: x, reason: collision with root package name */
    public final n0 f5095x = new n0();

    /* renamed from: z, reason: collision with root package name */
    public int f5097z = -1;

    public s(w1.y1 y1Var, v vVar, f2 f2Var, o.m0 m0Var, n0.a aVar, n0.a aVar2, b1.b bVar, y yVar) {
        this.f5073a = y1Var;
        this.f5074b = vVar;
        this.f5075c = f2Var;
        this.f5076d = m0Var;
        this.f5077e = aVar;
        this.f5078f = aVar2;
        this.f5079g = bVar;
        this.f5080h = yVar;
        this.C = vVar.f() || vVar.d();
        this.D = new r(0, this);
        this.E = new ArrayList();
        e2 c8 = f2Var.c();
        c8.c();
        this.G = c8;
        f2 f2Var2 = new f2();
        if (vVar.f()) {
            f2Var2.b();
        }
        if (vVar.d()) {
            f2Var2.f4937n = new o.x();
        }
        this.H = f2Var2;
        i2 e8 = f2Var2.e();
        e8.e(true);
        this.I = e8;
        this.M = new n0.b(this, aVar);
        e2 c9 = this.H.c();
        try {
            a a8 = c9.a(0);
            c9.c();
            this.N = a8;
            this.O = new n0.c();
            this.Q = new x0.b(this);
            g6.h j7 = vVar.j();
            g6.h y7 = y();
            this.R = j7.c(y7 == null ? g6.i.f3046d : y7);
        } catch (Throwable th) {
            c9.c();
            throw th;
        }
    }

    public static final int M(s sVar, int i, boolean z3, int i8) {
        e2 e2Var = sVar.G;
        if (e2Var.j(i)) {
            int i9 = e2Var.i(i);
            Object p7 = e2Var.p(e2Var.f4908b, i);
            if (i9 == 206 && q6.i.a(p7, t.f5112e)) {
                Object h8 = e2Var.h(i, 0);
                p pVar = h8 instanceof p ? (p) h8 : null;
                if (pVar != null) {
                    for (s sVar2 : pVar.f5035d.f5049e) {
                        f2 f2Var = sVar2.f5075c;
                        if (f2Var.f4929e > 0 && (f2Var.f4928d[1] & 67108864) != 0) {
                            y yVar = sVar2.f5080h;
                            synchronized (yVar.f5167g) {
                                yVar.p();
                                o.j0 j0Var = yVar.f5176q;
                                yVar.f5176q = h0.a.q();
                                try {
                                    yVar.f5184y.b0(j0Var);
                                } finally {
                                }
                            }
                            n0.a aVar = new n0.a();
                            sVar2.L = aVar;
                            e2 c8 = sVar2.f5075c.c();
                            try {
                                sVar2.G = c8;
                                n0.b bVar = sVar2.M;
                                n0.a aVar2 = bVar.f5248b;
                                try {
                                    bVar.f5248b = aVar;
                                    sVar2.L(0);
                                    n0.b bVar2 = sVar2.M;
                                    bVar2.b();
                                    if (bVar2.f5249c) {
                                        bVar2.f5248b.f5245b.b0(n0.c0.f5261c);
                                        if (bVar2.f5249c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.f5248b.f5245b.b0(n0.m.f5285c);
                                            bVar2.f5249c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                c8.c();
                            }
                        }
                        sVar.f5074b.q(sVar2.f5080h);
                    }
                }
                return e2Var.o(i);
            }
            if (!e2Var.l(i)) {
                return e2Var.o(i);
            }
        } else if (e2Var.d(i)) {
            int i10 = e2Var.f4908b[(i * 5) + 3] + i;
            int i11 = 0;
            for (int i12 = i + 1; i12 < i10; i12 += e2Var.f4908b[(i12 * 5) + 3]) {
                boolean l3 = e2Var.l(i12);
                if (l3) {
                    sVar.M.c();
                    n0.b bVar3 = sVar.M;
                    Object n6 = e2Var.n(i12);
                    bVar3.c();
                    bVar3.f5254h.add(n6);
                }
                i11 += M(sVar, i12, l3 || z3, l3 ? 0 : i8 + i11);
                if (l3) {
                    sVar.M.c();
                    sVar.M.a();
                }
            }
            if (!e2Var.l(i)) {
                return i11;
            }
        } else if (!e2Var.l(i)) {
            return e2Var.o(i);
        }
        return 1;
    }

    public final void A(ArrayList arrayList) {
        n0.a aVar = this.f5078f;
        n0.b bVar = this.M;
        n0.a aVar2 = bVar.f5248b;
        try {
            bVar.f5248b = aVar;
            aVar.f5245b.b0(n0.a0.f5246c);
            if (arrayList.size() <= 0) {
                bVar.f5248b.f5245b.b0(n0.n.f5286c);
                bVar.f5252f = 0;
            } else {
                c6.f fVar = (c6.f) arrayList.get(0);
                y0 y0Var = (y0) fVar.f1747d;
                y0Var.getClass();
                throw null;
            }
        } finally {
            bVar.f5248b = aVar2;
        }
    }

    public final void B(o1 o1Var, Object obj) {
        R(126665345, 0, null, null);
        C();
        g0(obj);
        long j7 = this.T;
        try {
            this.T = 126665345;
            if (this.S) {
                i2.y(this.I);
            }
            boolean z3 = (this.S || q6.i.a(this.G.f(), o1Var)) ? false : true;
            if (z3) {
                I(o1Var);
            }
            R(202, 0, t.f5110c, o1Var);
            this.K = null;
            boolean z7 = this.f5094w;
            this.f5094w = z3;
            u0.h.c(this, new u0.c(316014703, true, new j0.i0(3, obj)));
            this.f5094w = z7;
        } finally {
        }
    }

    public final Object C() {
        boolean z3 = this.S;
        v0 v0Var = n.f5019a;
        if (!z3) {
            Object m7 = this.G.m();
            if (!this.f5096y || (m7 instanceof p)) {
                return m7;
            }
        } else if (this.f5089r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
            return v0Var;
        }
        return v0Var;
    }

    public final List D() {
        v vVar = this.f5074b;
        u h8 = vVar.h();
        y yVar = h8 != null ? (y) h8 : null;
        if (yVar != null) {
            f2 f2Var = yVar.i;
            e2 c8 = f2Var.c();
            try {
                Integer u7 = r2.r.u(c8, vVar, 0, c8.f4909c);
                if (u7 != null) {
                    try {
                        return r2.r.X(f2Var.c(), u7.intValue(), 0);
                    } finally {
                    }
                }
            } finally {
            }
        }
        return d6.u.f2326d;
    }

    public final int E(int i) {
        int q4 = this.G.q(i) + 1;
        int i8 = 0;
        while (q4 < i) {
            if (!this.G.k(q4)) {
                i8++;
            }
            q4 += h2.a(this.G.f4908b, q4);
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0057, code lost:
    
        if (r10 == null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object F(y yVar, y yVar2, Integer num, List list, p6.a aVar) {
        Object b8;
        boolean z3 = this.F;
        int i = this.f5082k;
        try {
            this.F = true;
            this.f5082k = 0;
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                c6.f fVar = (c6.f) list.get(i8);
                t1 t1Var = (t1) fVar.f1747d;
                Object obj = fVar.f1748e;
                if (obj != null) {
                    a0(t1Var, obj);
                } else {
                    a0(t1Var, null);
                }
            }
            if (yVar != null) {
                int intValue = num != null ? num.intValue() : -1;
                if (yVar2 == null || yVar2.equals(yVar) || intValue < 0) {
                    b8 = aVar.b();
                } else {
                    yVar.f5180u = yVar2;
                    yVar.f5181v = intValue;
                    try {
                        b8 = aVar.b();
                        yVar.f5180u = null;
                        yVar.f5181v = 0;
                    } catch (Throwable th) {
                        yVar.f5180u = null;
                        yVar.f5181v = 0;
                        throw th;
                    }
                }
            }
            b8 = aVar.b();
            this.F = z3;
            this.f5082k = i;
            return b8;
        } catch (Throwable th2) {
            this.F = z3;
            this.f5082k = i;
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f5031b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void G() {
        o0 o0Var;
        int i;
        int i8;
        long j7;
        int i9;
        int i10;
        boolean z3;
        int i11;
        int i12;
        int i13;
        long j8;
        o.d0 d0Var;
        int i14;
        int e8;
        o0 o0Var2;
        int i15;
        long j9;
        long j10;
        int hashCode;
        Object b8;
        boolean z7 = this.F;
        boolean z8 = true;
        this.F = true;
        e2 e2Var = this.G;
        int i16 = e2Var.i;
        int i17 = (i16 * 5) + 3;
        int i18 = e2Var.f4908b[i17] + i16;
        int i19 = this.f5082k;
        long j11 = this.T;
        int i20 = this.f5083l;
        int i21 = this.f5084m;
        int i22 = e2Var.f4913g;
        ArrayList arrayList = this.f5090s;
        int e9 = t.e(i22, arrayList);
        if (e9 < 0) {
            e9 = -(e9 + 1);
        }
        if (e9 < arrayList.size()) {
            o0Var = (o0) arrayList.get(e9);
        }
        o0Var = null;
        boolean z9 = false;
        int i23 = i16;
        while (o0Var != null) {
            boolean z10 = z8;
            t1 t1Var = o0Var.f5030a;
            int i24 = o0Var.f5031b;
            int e10 = t.e(i24, arrayList);
            if (e10 >= 0) {
            }
            Object obj = o0Var.f5032c;
            if (obj == null) {
                t1Var.getClass();
                i = i17;
            } else {
                int i25 = 8;
                o.j0 j0Var = t1Var.f5124g;
                if (j0Var == null) {
                    i = i17;
                } else {
                    i = i17;
                    if (obj instanceof e0) {
                        z3 = t1.a((e0) obj, j0Var);
                        i8 = i19;
                        j7 = j11;
                        i9 = i20;
                        i10 = i21;
                    } else if (obj instanceof o.k0) {
                        o.k0 k0Var = (o.k0) obj;
                        if (k0Var.h()) {
                            Object[] objArr = k0Var.f5490b;
                            long[] jArr = k0Var.f5489a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i9 = i20;
                                i10 = i21;
                                int i26 = 0;
                                while (true) {
                                    long j12 = jArr[i26];
                                    i8 = i19;
                                    j7 = j11;
                                    if ((((~j12) << 7) & j12 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j12 & 255) < 128) {
                                                Object obj2 = objArr[(i26 << 3) + i28];
                                                i11 = i28;
                                                if (!(obj2 instanceof e0) || t1.a((e0) obj2, j0Var)) {
                                                    break;
                                                }
                                            } else {
                                                i11 = i28;
                                            }
                                            j12 >>= i25;
                                            i28 = i11 + 1;
                                        }
                                        if (i27 != i25) {
                                            break;
                                        }
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    i19 = i8;
                                    j11 = j7;
                                    i25 = 8;
                                }
                                z3 = z10 ? 1 : 0;
                            }
                        }
                        i8 = i19;
                        j7 = j11;
                        i9 = i20;
                        i10 = i21;
                        z3 = false;
                    }
                    if (z3) {
                        long j13 = j7;
                        ArrayList arrayList2 = this.E;
                        arrayList2.add(t1Var);
                        this.f5079g.r();
                        y yVar = t1Var.f5118a;
                        if (yVar == null || (d0Var = t1Var.f5123f) == null) {
                            i12 = i16;
                            i13 = i18;
                            j8 = j13;
                        } else {
                            t1Var.e(z10);
                            try {
                                Object[] objArr2 = d0Var.f5435b;
                                int[] iArr = d0Var.f5436c;
                                long[] jArr2 = d0Var.f5434a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    j8 = j13;
                                    int i29 = 0;
                                    while (true) {
                                        long j14 = jArr2[i29];
                                        i12 = i16;
                                        i13 = i18;
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i30 = 8 - ((~(i29 - length2)) >>> 31);
                                            for (int i31 = 0; i31 < i30; i31 = i14 + 1) {
                                                if ((j14 & 255) < 128) {
                                                    int i32 = (i29 << 3) + i31;
                                                    i14 = i31;
                                                    Object obj3 = objArr2[i32];
                                                    int i33 = iArr[i32];
                                                    yVar.z(obj3);
                                                } else {
                                                    i14 = i31;
                                                }
                                                j14 >>= 8;
                                            }
                                            if (i30 != 8) {
                                                break;
                                            }
                                        }
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        i16 = i12;
                                        i18 = i13;
                                    }
                                } else {
                                    i12 = i16;
                                    i13 = i18;
                                    j8 = j13;
                                }
                                t1Var.e(false);
                            } catch (Throwable th) {
                                t1Var.e(false);
                                throw th;
                            }
                        }
                        z10 = true;
                        arrayList2.remove(arrayList2.size() - 1);
                    } else {
                        this.G.r(i24);
                        int i34 = this.G.f4913g;
                        J(i23, i34, i16);
                        int q4 = this.G.q(i34);
                        while (q4 != i16 && !this.G.l(q4)) {
                            q4 = this.G.q(q4);
                        }
                        int i35 = this.G.l(q4) ? 0 : i8;
                        if (q4 != i34) {
                            int h02 = (h0(q4) - this.G.o(i34)) + i35;
                            while (i35 < h02 && q4 != i24) {
                                q4++;
                                while (q4 < i24) {
                                    e2 e2Var2 = this.G;
                                    int i36 = e2Var2.f4908b[(q4 * 5) + 3] + q4;
                                    if (i24 >= i36) {
                                        i35 += e2Var2.l(q4) ? z10 ? 1 : 0 : h0(q4);
                                        q4 = i36;
                                    }
                                }
                                break;
                            }
                        }
                        this.f5082k = i35;
                        this.f5084m = E(i34);
                        int q7 = this.G.q(i34);
                        long j15 = 0;
                        int i37 = 3;
                        int i38 = 0;
                        while (true) {
                            if (q7 < 0) {
                                i15 = i34;
                                j9 = j7;
                                break;
                            }
                            if (q7 == i16) {
                                j9 = j7;
                                j15 ^= Long.rotateLeft(j9, i38);
                                i15 = i34;
                                break;
                            }
                            j9 = j7;
                            e2 e2Var3 = this.G;
                            boolean k3 = e2Var3.k(q7);
                            i15 = i34;
                            int[] iArr2 = e2Var3.f4908b;
                            if (k3) {
                                Object p7 = e2Var3.p(iArr2, q7);
                                if (p7 != null) {
                                    hashCode = p7 instanceof Enum ? ((Enum) p7).ordinal() : p7.hashCode();
                                    j10 = j15;
                                } else {
                                    j10 = j15;
                                    hashCode = 0;
                                }
                            } else {
                                int i39 = e2Var3.i(q7);
                                j10 = j15;
                                hashCode = (i39 != 207 || (b8 = e2Var3.b(iArr2, q7)) == null || b8.equals(n.f5019a)) ? i39 : b8.hashCode();
                            }
                            if (hashCode == 126665345) {
                                j15 = j10 ^ Long.rotateLeft(hashCode, i38);
                                break;
                            }
                            j15 = Long.rotateLeft(this.G.k(q7) ? 0 : E(q7), i38) ^ (j10 ^ Long.rotateLeft(hashCode, i37));
                            i37 = (i37 + 6) % 64;
                            i38 = (i38 + 6) % 64;
                            q7 = this.G.q(q7);
                            j7 = j9;
                            i34 = i15;
                        }
                        this.T = j15;
                        this.K = null;
                        p6.e eVar = t1Var.f5121d;
                        if (eVar == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        eVar.g(this, Integer.valueOf(z10 ? 1 : 0));
                        this.K = null;
                        e2 e2Var4 = this.G;
                        int i40 = e2Var4.f4908b[i] + i16;
                        int i41 = e2Var4.f4913g;
                        if (!((i41 < i16 || i41 > i40) ? false : z10 ? 1 : 0)) {
                            t.c("Index " + i16 + " is not a parent of " + i41);
                        }
                        e2Var4.i = i16;
                        e2Var4.f4914h = i40;
                        e2Var4.f4917l = 0;
                        e2Var4.f4918m = 0;
                        i12 = i16;
                        i13 = i18;
                        j8 = j9;
                        i23 = i15;
                        z9 = z10 ? 1 : 0;
                    }
                    e8 = t.e(this.G.f4913g, arrayList);
                    if (e8 < 0) {
                        e8 = -(e8 + 1);
                    }
                    if (e8 >= arrayList.size()) {
                        o0Var2 = (o0) arrayList.get(e8);
                        i18 = i13;
                        if (o0Var2.f5031b < i18) {
                            o0Var = o0Var2;
                            z8 = z10;
                            i17 = i;
                            i16 = i12;
                            i20 = i9;
                            i21 = i10;
                            i19 = i8;
                            j11 = j8;
                        }
                    } else {
                        i18 = i13;
                    }
                    o0Var2 = null;
                    o0Var = o0Var2;
                    z8 = z10;
                    i17 = i;
                    i16 = i12;
                    i20 = i9;
                    i21 = i10;
                    i19 = i8;
                    j11 = j8;
                }
            }
            i8 = i19;
            j7 = j11;
            i9 = i20;
            i10 = i21;
            z3 = z10 ? 1 : 0;
            if (z3) {
            }
            e8 = t.e(this.G.f4913g, arrayList);
            if (e8 < 0) {
            }
            if (e8 >= arrayList.size()) {
            }
            o0Var2 = null;
            o0Var = o0Var2;
            z8 = z10;
            i17 = i;
            i16 = i12;
            i20 = i9;
            i21 = i10;
            i19 = i8;
            j11 = j8;
        }
        int i42 = i16;
        int i43 = i19;
        long j16 = j11;
        int i44 = i20;
        int i45 = i21;
        if (z9) {
            J(i23, i42, i42);
            this.G.t();
            int h03 = h0(i42);
            this.f5082k = i43 + h03;
            this.f5083l = i44 + h03;
            this.f5084m = i45;
        } else {
            P();
        }
        this.T = j16;
        this.F = z7;
    }

    public final void H() {
        int i;
        L(this.G.f4913g);
        n0.b bVar = this.M;
        bVar.d(false);
        n0 n0Var = bVar.f5250d;
        s sVar = bVar.f5247a;
        e2 e2Var = sVar.G;
        if (e2Var.f4909c > 0 && n0Var.a(-2) != (i = e2Var.i)) {
            if (!bVar.f5249c && bVar.f5251e) {
                bVar.d(false);
                bVar.f5248b.f5245b.b0(n0.q.f5289c);
                bVar.f5249c = true;
            }
            if (i > 0) {
                a a8 = e2Var.a(i);
                n0Var.c(i);
                bVar.d(false);
                n0.l0 l0Var = bVar.f5248b.f5245b;
                l0Var.b0(n0.p.f5288c);
                m.a.O(l0Var, 0, a8);
                bVar.f5249c = true;
            }
        }
        bVar.f5248b.f5245b.b0(n0.y.f5301c);
        int i8 = bVar.f5252f;
        e2 e2Var2 = sVar.G;
        bVar.f5252f = e2Var2.f4908b[(e2Var2.f4913g * 5) + 3] + i8;
    }

    public final void I(o1 o1Var) {
        o.x xVar = this.f5093v;
        if (xVar == null) {
            xVar = new o.x();
            this.f5093v = xVar;
        }
        xVar.g(this.G.f4913g, o1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(int i, int i8, int i9) {
        e2 e2Var = this.G;
        if (i != i8) {
            if (i != i9 && i8 != i9) {
                if (e2Var.q(i) == i8) {
                    i9 = i8;
                } else if (e2Var.q(i8) != i) {
                    if (e2Var.q(i) == e2Var.q(i8)) {
                        i9 = e2Var.q(i);
                    } else {
                        int i10 = i;
                        int i11 = 0;
                        while (i10 > 0 && i10 != i9) {
                            i10 = e2Var.q(i10);
                            i11++;
                        }
                        int i12 = i8;
                        int i13 = 0;
                        while (i12 > 0 && i12 != i9) {
                            i12 = e2Var.q(i12);
                            i13++;
                        }
                        int i14 = i11 - i13;
                        int i15 = i;
                        for (int i16 = 0; i16 < i14; i16++) {
                            i15 = e2Var.q(i15);
                        }
                        int i17 = i13 - i11;
                        int i18 = i8;
                        for (int i19 = 0; i19 < i17; i19++) {
                            i18 = e2Var.q(i18);
                        }
                        i9 = i15;
                        for (int i20 = i18; i9 != i20; i20 = e2Var.q(i20)) {
                            i9 = e2Var.q(i9);
                        }
                    }
                }
            }
            while (i > 0 && i != i9) {
                if (!e2Var.l(i)) {
                    this.M.a();
                }
                i = e2Var.q(i);
            }
            o(i8, i9);
        }
        i9 = i;
        while (i > 0) {
            if (!e2Var.l(i)) {
            }
            i = e2Var.q(i);
        }
        o(i8, i9);
    }

    public final Object K() {
        boolean z3 = this.S;
        v0 v0Var = n.f5019a;
        if (!z3) {
            Object m7 = this.G.m();
            if (!this.f5096y || (m7 instanceof p)) {
                return m7 instanceof b2 ? ((b2) m7).f4881a : m7;
            }
        } else if (this.f5089r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
            return v0Var;
        }
        return v0Var;
    }

    public final void L(int i) {
        boolean l3 = this.G.l(i);
        n0.b bVar = this.M;
        if (l3) {
            bVar.c();
            Object n6 = this.G.n(i);
            bVar.c();
            bVar.f5254h.add(n6);
        }
        M(this, i, l3, 0);
        bVar.c();
        if (l3) {
            bVar.a();
        }
    }

    public final boolean N(int i, boolean z3) {
        if ((i & 1) == 0 && (this.S || this.f5096y)) {
            c5.n nVar = this.P;
            if (nVar != null && w() != null) {
                nVar.getClass();
            }
        } else if (!z3 && z()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void O() {
        int i;
        long rotateLeft;
        long j7;
        if (this.f5090s.isEmpty()) {
            this.f5083l = this.G.s() + this.f5083l;
            return;
        }
        e2 e2Var = this.G;
        int g3 = e2Var.g();
        int[] iArr = e2Var.f4908b;
        int i8 = e2Var.f4913g;
        Object p7 = i8 < e2Var.f4914h ? e2Var.p(iArr, i8) : null;
        Object f6 = e2Var.f();
        int i9 = this.f5084m;
        v0 v0Var = n.f5019a;
        if (p7 != null) {
            if (p7 instanceof Enum) {
                rotateLeft = Long.rotateLeft(((Enum) p7).ordinal() ^ Long.rotateLeft(this.T, 3), 3);
                i = 0;
            } else {
                i = 0;
                rotateLeft = Long.rotateLeft(p7.hashCode() ^ Long.rotateLeft(this.T, 3), 3);
            }
            j7 = rotateLeft ^ i;
        } else {
            if (f6 != null && g3 == 207 && !f6.equals(v0Var)) {
                this.T = Long.rotateLeft(f6.hashCode() ^ Long.rotateLeft(this.T, 3), 3) ^ i9;
                U(null, (iArr[(e2Var.f4913g * 5) + 1] & 1073741824) != 0);
                G();
                e2Var.e();
                if (p7 == null) {
                    if (p7 instanceof Enum) {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ ((Enum) p7).ordinal(), 3);
                        return;
                    } else {
                        this.T = Long.rotateRight(Long.rotateRight(this.T ^ 0, 3) ^ p7.hashCode(), 3);
                        return;
                    }
                }
                if (f6 == null || g3 != 207 || f6.equals(v0Var)) {
                    this.T = Long.rotateRight(g3 ^ Long.rotateRight(this.T ^ i9, 3), 3);
                    return;
                } else {
                    this.T = Long.rotateRight(Long.rotateRight(this.T ^ i9, 3) ^ f6.hashCode(), 3);
                    return;
                }
            }
            j7 = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ g3, 3) ^ i9;
        }
        this.T = j7;
        U(null, (iArr[(e2Var.f4913g * 5) + 1] & 1073741824) != 0);
        G();
        e2Var.e();
        if (p7 == null) {
        }
    }

    public final void P() {
        e2 e2Var = this.G;
        int i = e2Var.i;
        this.f5083l = i >= 0 ? e2Var.f4908b[(i * 5) + 1] & 67108863 : 0;
        e2Var.t();
    }

    public final void Q() {
        if (this.f5083l != 0) {
            t.c("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.S) {
            return;
        }
        t1 w7 = w();
        if (w7 != null) {
            int i = w7.f5119b;
            if ((i & 128) == 0) {
                w7.f5119b = i | 16;
            }
        }
        if (this.f5090s.isEmpty()) {
            P();
        } else {
            G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x014e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void R(int i, int i8, Object obj, Object obj2) {
        long rotateLeft;
        long j7;
        boolean z3;
        n1 n1Var;
        n1 n1Var2;
        int i9;
        int i10;
        Object[] objArr;
        Object[] objArr2;
        int i11;
        int i12;
        int i13;
        boolean z7;
        int i14;
        Object obj3 = obj;
        if (this.f5089r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        int i15 = this.f5084m;
        Object obj4 = n.f5019a;
        if (obj3 != null) {
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ (obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()), 3);
            j7 = 0;
        } else {
            if (obj2 != null && i == 207 && !obj2.equals(obj4)) {
                this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ obj2.hashCode(), 3) ^ i15;
                if (obj3 == null) {
                    this.f5084m++;
                }
                boolean z8 = i8 == 0;
                if (!this.S) {
                    this.G.f4916k++;
                    i2 i2Var = this.I;
                    int i16 = i2Var.f4970t;
                    if (z8) {
                        i2Var.P(i, obj4, obj4, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        i2Var.P(i, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = obj4;
                        }
                        i2Var.P(i, obj3, obj4, false);
                    }
                    n1 n1Var3 = this.f5081j;
                    if (n1Var3 != null) {
                        int i17 = (-2) - i16;
                        r0 r0Var = new r0(-1, i, i17, -1);
                        n1Var3.f5026e.g(i17, new k0(-1, this.f5082k - n1Var3.f5023b, 0));
                        n1Var3.f5025d.add(r0Var);
                    }
                    u(z8, null);
                    return;
                }
                boolean z9 = i8 == 1 && this.f5096y;
                if (this.f5081j == null) {
                    int g3 = this.G.g();
                    if (!z9 && g3 == i) {
                        e2 e2Var = this.G;
                        int i18 = e2Var.f4913g;
                        if (q6.i.a(obj3, i18 < e2Var.f4914h ? e2Var.p(e2Var.f4908b, i18) : null)) {
                            U(obj2, z8);
                        }
                    }
                    e2 e2Var2 = this.G;
                    int[] iArr = e2Var2.f4908b;
                    ArrayList arrayList = new ArrayList();
                    if (e2Var2.f4916k <= 0) {
                        int i19 = e2Var2.f4913g;
                        while (i19 < e2Var2.f4914h) {
                            int i20 = i19 * 5;
                            int i21 = iArr[i20];
                            Object p7 = e2Var2.p(iArr, i19);
                            int i22 = iArr[i20 + 1];
                            if ((i22 & 1073741824) != 0) {
                                z7 = z9;
                                i14 = 1;
                            } else {
                                z7 = z9;
                                i14 = i22 & 67108863;
                            }
                            arrayList.add(new r0(p7, i21, i19, i14));
                            i19 += iArr[i20 + 3];
                            z9 = z7;
                        }
                    }
                    z3 = z9;
                    this.f5081j = new n1(this.f5082k, arrayList);
                    n1Var = this.f5081j;
                    if (n1Var != null) {
                        ArrayList arrayList2 = n1Var.f5025d;
                        o.x xVar = n1Var.f5026e;
                        int i23 = n1Var.f5023b;
                        Object q0Var = obj3 != null ? new q0(Integer.valueOf(i), obj3) : Integer.valueOf(i);
                        o.j0 j0Var = ((o0.a) n1Var.f5027f.getValue()).f5571a;
                        Object g7 = j0Var.g(q0Var);
                        if (g7 == null) {
                            g7 = null;
                        } else if (g7 instanceof o.e0) {
                            o.e0 e0Var = (o.e0) g7;
                            Object j8 = e0Var.j(0);
                            if (e0Var.g()) {
                                j0Var.k(q0Var);
                            }
                            if (e0Var.f5443b == 1) {
                                j0Var.m(q0Var, e0Var.d());
                            }
                            g7 = j8;
                        } else {
                            j0Var.k(q0Var);
                        }
                        r0 r0Var2 = (r0) g7;
                        if (z3 || r0Var2 == null) {
                            this.G.f4916k++;
                            this.S = true;
                            this.K = null;
                            if (this.I.f4973w) {
                                i2 e8 = this.H.e();
                                this.I = e8;
                                e8.L();
                                this.J = false;
                                this.K = null;
                            }
                            this.I.d();
                            i2 i2Var2 = this.I;
                            int i24 = i2Var2.f4970t;
                            if (z8) {
                                i2Var2.P(i, obj4, obj4, true);
                                i9 = 0;
                            } else if (obj2 != null) {
                                if (obj != null) {
                                    obj4 = obj;
                                }
                                i9 = 0;
                                i2Var2.P(i, obj4, obj2, false);
                            } else {
                                i9 = 0;
                                i2Var2.P(i, obj == null ? obj4 : obj, obj4, false);
                            }
                            this.N = this.I.b(i24);
                            int i25 = (-2) - i24;
                            r0 r0Var3 = new r0(-1, i, i25, -1);
                            xVar.g(i25, new k0(-1, this.f5082k - i23, i9));
                            arrayList2.add(r0Var3);
                            n1Var2 = new n1(z8 ? i9 : this.f5082k, new ArrayList());
                            u(z8, n1Var2);
                            return;
                        }
                        int i26 = r0Var2.f5062c;
                        arrayList2.add(r0Var2);
                        k0 k0Var = (k0) xVar.b(i26);
                        this.f5082k = (k0Var != null ? k0Var.f4985b : -1) + i23;
                        k0 k0Var2 = (k0) xVar.b(i26);
                        int i27 = k0Var2 != null ? k0Var2.f4984a : -1;
                        int i28 = n1Var.f5024c;
                        int i29 = i27 - i28;
                        int i30 = 8;
                        if (i27 > i28) {
                            Object[] objArr3 = xVar.f5496c;
                            long[] jArr = xVar.f5494a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i31 = 0;
                                while (true) {
                                    long j9 = jArr[i31];
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i32 = 8 - ((~(i31 - length)) >>> 31);
                                        int i33 = 0;
                                        while (i33 < i32) {
                                            if ((j9 & 255) < 128) {
                                                i13 = i30;
                                                k0 k0Var3 = (k0) objArr3[(i31 << 3) + i33];
                                                i12 = i29;
                                                int i34 = k0Var3.f4984a;
                                                if (i34 == i27) {
                                                    k0Var3.f4984a = i28;
                                                } else if (i28 <= i34 && i34 < i27) {
                                                    k0Var3.f4984a = i34 + 1;
                                                }
                                            } else {
                                                i12 = i29;
                                                i13 = i30;
                                            }
                                            j9 >>= i13;
                                            i33++;
                                            i29 = i12;
                                            i30 = i13;
                                        }
                                        i10 = i29;
                                        if (i32 != i30) {
                                            break;
                                        }
                                    } else {
                                        i10 = i29;
                                    }
                                    if (i31 == length) {
                                        break;
                                    }
                                    i31++;
                                    i29 = i10;
                                    i30 = 8;
                                }
                            } else {
                                i10 = i29;
                            }
                        } else {
                            i10 = i29;
                            if (i28 > i27) {
                                Object[] objArr4 = xVar.f5496c;
                                long[] jArr2 = xVar.f5494a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i35 = 0;
                                    while (true) {
                                        long j10 = jArr2[i35];
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                            int i37 = 0;
                                            while (i37 < i36) {
                                                if ((j10 & 255) < 128) {
                                                    k0 k0Var4 = (k0) objArr4[(i35 << 3) + i37];
                                                    int i38 = k0Var4.f4984a;
                                                    if (i38 == i27) {
                                                        k0Var4.f4984a = i28;
                                                    } else {
                                                        objArr2 = objArr4;
                                                        if (i27 + 1 <= i38 && i38 < i28) {
                                                            k0Var4.f4984a = i38 - 1;
                                                        }
                                                        j10 >>= 8;
                                                        i37++;
                                                        objArr4 = objArr2;
                                                    }
                                                }
                                                objArr2 = objArr4;
                                                j10 >>= 8;
                                                i37++;
                                                objArr4 = objArr2;
                                            }
                                            objArr = objArr4;
                                            if (i36 != 8) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr4;
                                        }
                                        if (i35 == length2) {
                                            break;
                                        }
                                        i35++;
                                        objArr4 = objArr;
                                    }
                                }
                            }
                        }
                        n0.b bVar = this.M;
                        int i39 = bVar.f5252f;
                        s sVar = bVar.f5247a;
                        bVar.f5252f = (i26 - sVar.G.f4913g) + i39;
                        this.G.r(i26);
                        if (i10 > 0) {
                            bVar.d(false);
                            n0 n0Var = bVar.f5250d;
                            e2 e2Var3 = sVar.G;
                            if (e2Var3.f4909c > 0 && n0Var.a(-2) != (i11 = e2Var3.i)) {
                                if (!bVar.f5249c && bVar.f5251e) {
                                    bVar.d(false);
                                    bVar.f5248b.f5245b.b0(n0.q.f5289c);
                                    bVar.f5249c = true;
                                }
                                if (i11 > 0) {
                                    a a8 = e2Var3.a(i11);
                                    n0Var.c(i11);
                                    bVar.d(false);
                                    n0.l0 l0Var = bVar.f5248b.f5245b;
                                    l0Var.b0(n0.p.f5288c);
                                    m.a.O(l0Var, 0, a8);
                                    bVar.f5249c = true;
                                }
                            }
                            n0.l0 l0Var2 = bVar.f5248b.f5245b;
                            l0Var2.b0(n0.u.f5297c);
                            l0Var2.f5281d[l0Var2.f5282e - l0Var2.f5279b[l0Var2.f5280c - 1].f5275a] = i10;
                        }
                        U(obj2, z8);
                    }
                    n1Var2 = null;
                    u(z8, n1Var2);
                    return;
                }
                z3 = z9;
                n1Var = this.f5081j;
                if (n1Var != null) {
                }
                n1Var2 = null;
                u(z8, n1Var2);
                return;
            }
            rotateLeft = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3);
            j7 = i15;
        }
        this.T = rotateLeft ^ j7;
        if (obj3 == null) {
        }
        if (i8 == 0) {
        }
        if (!this.S) {
        }
    }

    public final void S() {
        R(-127, 0, null, null);
    }

    public final void T(int i, b1 b1Var) {
        R(i, 0, b1Var, null);
    }

    public final void U(Object obj, boolean z3) {
        if (z3) {
            e2 e2Var = this.G;
            if (e2Var.f4916k <= 0) {
                if ((e2Var.f4908b[(e2Var.f4913g * 5) + 1] & 1073741824) == 0) {
                    p1.a("Expected a node group");
                }
                e2Var.u();
                return;
            }
            return;
        }
        if (obj != null && this.G.f() != obj) {
            n0.b bVar = this.M;
            bVar.getClass();
            bVar.d(false);
            n0.l0 l0Var = bVar.f5248b.f5245b;
            l0Var.b0(n0.f0.f5267c);
            m.a.O(l0Var, 0, obj);
        }
        this.G.u();
    }

    public final void V(int i) {
        int i8;
        int i9;
        if (this.f5081j != null) {
            R(i, 0, null, null);
            return;
        }
        if (this.f5089r) {
            t.c("A call to createNode(), emitNode() or useNode() expected");
        }
        this.T = Long.rotateLeft(Long.rotateLeft(this.T, 3) ^ i, 3) ^ this.f5084m;
        this.f5084m++;
        e2 e2Var = this.G;
        boolean z3 = this.S;
        v0 v0Var = n.f5019a;
        if (z3) {
            e2Var.f4916k++;
            this.I.P(i, v0Var, v0Var, false);
            u(false, null);
            return;
        }
        if (e2Var.g() == i && ((i9 = e2Var.f4913g) >= e2Var.f4914h || (e2Var.f4908b[(i9 * 5) + 1] & 536870912) == 0)) {
            e2Var.u();
            u(false, null);
            return;
        }
        if (e2Var.f4916k <= 0 && (i8 = e2Var.f4913g) != e2Var.f4914h) {
            int i10 = this.f5082k;
            H();
            this.M.e(i10, e2Var.s());
            t.a(this.f5090s, i8, e2Var.f4913g);
        }
        e2Var.f4916k++;
        this.S = true;
        this.K = null;
        if (this.I.f4973w) {
            i2 e8 = this.H.e();
            this.I = e8;
            e8.L();
            this.J = false;
            this.K = null;
        }
        i2 i2Var = this.I;
        i2Var.d();
        int i11 = i2Var.f4970t;
        i2Var.P(i, v0Var, v0Var, false);
        this.N = i2Var.b(i11);
        u(false, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final s W(int i) {
        t1 t1Var;
        boolean z3;
        int i8;
        V(i);
        boolean z7 = this.S;
        b1.b bVar = this.f5079g;
        ArrayList arrayList = this.E;
        y yVar = this.f5080h;
        if (z7) {
            t1 t1Var2 = new t1(yVar);
            arrayList.add(t1Var2);
            g0(t1Var2);
            t1Var2.f5122e = this.B;
            t1Var2.f5119b &= -17;
            bVar.r();
            return this;
        }
        int i9 = this.G.i;
        ArrayList arrayList2 = this.f5090s;
        int e8 = t.e(i9, arrayList2);
        o0 o0Var = e8 >= 0 ? (o0) arrayList2.remove(e8) : null;
        Object m7 = this.G.m();
        if (q6.i.a(m7, n.f5019a)) {
            t1Var = new t1(yVar);
            g0(t1Var);
        } else {
            q6.i.c(m7, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            t1Var = (t1) m7;
        }
        if (o0Var == null) {
            int i10 = t1Var.f5119b;
            boolean z8 = (i10 & 64) != 0;
            if (z8) {
                t1Var.f5119b = i10 & (-65);
            }
            if (!z8) {
                z3 = false;
                int i11 = t1Var.f5119b;
                t1Var.f5119b = !z3 ? i11 | 8 : i11 & (-9);
                arrayList.add(t1Var);
                t1Var.f5122e = this.B;
                t1Var.f5119b &= -17;
                bVar.r();
                i8 = t1Var.f5119b;
                if ((i8 & 256) != 0) {
                    t1Var.f5119b = (i8 & (-257)) | 512;
                    n0.l0 l0Var = this.M.f5248b.f5245b;
                    l0Var.b0(n0.d0.f5263c);
                    m.a.O(l0Var, 0, t1Var);
                    if (!this.f5096y) {
                        int i12 = t1Var.f5119b;
                        if ((i12 & 128) != 0) {
                            this.f5096y = true;
                            t1Var.f5119b = i12 | 1024;
                        }
                    }
                }
                return this;
            }
        }
        z3 = true;
        int i112 = t1Var.f5119b;
        t1Var.f5119b = !z3 ? i112 | 8 : i112 & (-9);
        arrayList.add(t1Var);
        t1Var.f5122e = this.B;
        t1Var.f5119b &= -17;
        bVar.r();
        i8 = t1Var.f5119b;
        if ((i8 & 256) != 0) {
        }
        return this;
    }

    public final void X(Object obj) {
        if (!this.S && this.G.g() == 207 && !q6.i.a(this.G.f(), obj) && this.f5097z < 0) {
            this.f5097z = this.G.f4913g;
            this.f5096y = true;
        }
        R(207, 0, null, obj);
    }

    public final void Y() {
        R(125, 2, null, null);
        this.f5089r = true;
    }

    public final void Z() {
        this.f5084m = 0;
        this.G = this.f5075c.c();
        R(100, 0, null, null);
        v vVar = this.f5074b;
        vVar.r();
        o1 i = vVar.i();
        this.f5095x.c(this.f5094w ? 1 : 0);
        this.f5094w = f(i);
        this.K = null;
        if (!this.f5088q) {
            this.f5088q = vVar.e();
        }
        if (!this.C) {
            this.C = vVar.f();
        }
        if (this.C) {
            u2 u2Var = x0.c.f8318a;
            q6.i.c(u2Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
            i = ((u0.g) i).b(u2Var, new v2(y()));
        }
        this.f5092u = i;
        Set set = (Set) b.r(i, x0.e.f8320a);
        if (set != null) {
            x xVar = this.U;
            if (xVar == null) {
                xVar = new x(this.f5080h);
                this.U = xVar;
            }
            set.add(xVar);
            vVar.n(set);
        }
        R(Long.hashCode(vVar.g()), 0, null, null);
    }

    public final void a() {
        i();
        this.i.clear();
        this.f5085n.f5021b = 0;
        this.f5091t.f5021b = 0;
        this.f5095x.f5021b = 0;
        this.f5093v = null;
        n0.c cVar = this.O;
        cVar.f5260c.X();
        cVar.f5259b.X();
        this.T = 0;
        this.A = 0;
        this.f5089r = false;
        this.S = false;
        this.f5096y = false;
        this.F = false;
        this.f5097z = -1;
        e2 e2Var = this.G;
        if (!e2Var.f4912f) {
            e2Var.c();
        }
        if (this.I.f4973w) {
            return;
        }
        v();
    }

    public final boolean a0(t1 t1Var, Object obj) {
        a aVar = t1Var.f5120c;
        if (aVar == null) {
            return false;
        }
        int a8 = this.G.f4907a.a(aVar);
        if (!this.F || a8 < this.G.f4913g) {
            return false;
        }
        ArrayList arrayList = this.f5090s;
        int e8 = t.e(a8, arrayList);
        if (e8 < 0) {
            int i = -(e8 + 1);
            if (!(obj instanceof e0)) {
                obj = null;
            }
            arrayList.add(i, new o0(t1Var, a8, obj));
            return true;
        }
        o0 o0Var = (o0) arrayList.get(e8);
        if (!(obj instanceof e0)) {
            o0Var.f5032c = null;
            return true;
        }
        Object obj2 = o0Var.f5032c;
        if (obj2 == null) {
            o0Var.f5032c = obj;
            return true;
        }
        if (obj2 instanceof o.k0) {
            ((o.k0) obj2).a(obj);
            return true;
        }
        o.k0 k0Var = o.s0.f5536a;
        o.k0 k0Var2 = new o.k0(2);
        k0Var2.j(obj2);
        k0Var2.j(obj);
        o0Var.f5032c = k0Var2;
        return true;
    }

    public final void b(Object obj, p6.e eVar) {
        if (this.S) {
            n0.l0 l0Var = this.O.f5259b;
            l0Var.b0(n0.g0.f5269c);
            m.a.O(l0Var, 0, obj);
            q6.i.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            q6.v.c(2, eVar);
            m.a.O(l0Var, 1, eVar);
            return;
        }
        n0.b bVar = this.M;
        bVar.b();
        n0.l0 l0Var2 = bVar.f5248b.f5245b;
        l0Var2.b0(n0.g0.f5269c);
        q6.i.c(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        q6.v.c(2, eVar);
        m.a.P(l0Var2, 0, obj, 1, eVar);
    }

    public final void b0(o.j0 j0Var) {
        ArrayList arrayList = this.f5090s;
        for (int t3 = s6.a.t(arrayList); -1 < t3; t3--) {
            o0 o0Var = (o0) arrayList.get(t3);
            a aVar = o0Var.f5030a.f5120c;
            if (aVar == null || !aVar.a()) {
                arrayList.remove(t3);
            } else {
                int i = o0Var.f5031b;
                int i8 = aVar.f4874a;
                if (i != i8) {
                    o0Var.f5031b = i8;
                }
            }
        }
        Object[] objArr = j0Var.f5483b;
        Object[] objArr2 = j0Var.f5484c;
        long[] jArr = j0Var.f5482a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i9 = 0;
            while (true) {
                long j7 = jArr[i9];
                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i9 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j7) < 128) {
                            int i12 = (i9 << 3) + i11;
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            q6.i.c(obj, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                            t1 t1Var = (t1) obj;
                            a aVar2 = t1Var.f5120c;
                            if (aVar2 != null) {
                                int i13 = aVar2.f4874a;
                                if (obj2 == v0.f5135h) {
                                    obj2 = null;
                                }
                                arrayList.add(new o0(t1Var, i13, obj2));
                            }
                        }
                        j7 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                }
                if (i9 == length) {
                    break;
                } else {
                    i9++;
                }
            }
        }
        d6.q.N(arrayList, t.f5113f);
    }

    public final boolean c(float f6) {
        Object C = C();
        if ((C instanceof Float) && f6 == ((Number) C).floatValue()) {
            return false;
        }
        g0(Float.valueOf(f6));
        return true;
    }

    public final void c0(int i, int i8) {
        if (h0(i) != i8) {
            if (i < 0) {
                o.v vVar = this.f5087p;
                if (vVar == null) {
                    vVar = new o.v();
                    this.f5087p = vVar;
                }
                vVar.f(i, i8);
                return;
            }
            int[] iArr = this.f5086o;
            if (iArr == null) {
                int i9 = this.G.f4909c;
                int[] iArr2 = new int[i9];
                Arrays.fill(iArr2, 0, i9, -1);
                this.f5086o = iArr2;
                iArr = iArr2;
            }
            iArr[i] = i8;
        }
    }

    public final boolean d(int i) {
        Object C = C();
        if ((C instanceof Integer) && i == ((Number) C).intValue()) {
            return false;
        }
        g0(Integer.valueOf(i));
        return true;
    }

    public final void d0(int i, int i8) {
        int h02 = h0(i);
        if (h02 != i8) {
            int i9 = i8 - h02;
            ArrayList arrayList = this.i;
            int size = arrayList.size() - 1;
            while (i != -1) {
                int h03 = h0(i) + i9;
                c0(i, h03);
                int i10 = size;
                while (true) {
                    if (-1 < i10) {
                        n1 n1Var = (n1) arrayList.get(i10);
                        if (n1Var != null && n1Var.a(i, h03)) {
                            size = i10 - 1;
                            break;
                        }
                        i10--;
                    } else {
                        break;
                    }
                }
                if (i < 0) {
                    i = this.G.i;
                } else if (this.G.l(i)) {
                    return;
                } else {
                    i = this.G.q(i);
                }
            }
        }
    }

    public final boolean e(long j7) {
        Object C = C();
        if ((C instanceof Long) && j7 == ((Number) C).longValue()) {
            return false;
        }
        g0(Long.valueOf(j7));
        return true;
    }

    public final u0.g e0(o1 o1Var, u0.g gVar) {
        u0.g gVar2 = (u0.g) o1Var;
        gVar2.getClass();
        u0.f fVar = new u0.f(gVar2);
        fVar.putAll(gVar);
        u0.g a8 = fVar.a();
        T(204, t.f5111d);
        C();
        g0(a8);
        C();
        g0(gVar);
        p(false);
        return a8;
    }

    public final boolean f(Object obj) {
        if (q6.i.a(C(), obj)) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final void f0(Object obj) {
        int i;
        e2 e2Var;
        int i8;
        i2 i2Var;
        if (obj instanceof a2) {
            a2 a2Var = (a2) obj;
            a aVar = null;
            if (this.S) {
                i2 i2Var2 = this.I;
                int i9 = i2Var2.f4970t;
                if (i9 > i2Var2.f4972v + 1) {
                    int i10 = i9 - 1;
                    int D = i2Var2.D(i2Var2.f4953b, i10);
                    while (true) {
                        i8 = i10;
                        i10 = D;
                        i2Var = this.I;
                        if (i10 == i2Var.f4972v || i10 < 0) {
                            break;
                        } else {
                            D = i2Var.D(i2Var.f4953b, i10);
                        }
                    }
                    aVar = i2Var.b(i8);
                }
            } else {
                e2 e2Var2 = this.G;
                int i11 = e2Var2.f4913g;
                if (i11 > e2Var2.i + 1) {
                    int i12 = i11 - 1;
                    int q4 = e2Var2.q(i12);
                    while (true) {
                        i = i12;
                        i12 = q4;
                        e2Var = this.G;
                        if (i12 == e2Var.i || i12 < 0) {
                            break;
                        } else {
                            q4 = e2Var.q(i12);
                        }
                    }
                    aVar = e2Var.a(i);
                }
            }
            b2 b2Var = new b2(a2Var, aVar);
            if (this.S) {
                n0.l0 l0Var = this.M.f5248b.f5245b;
                l0Var.b0(n0.w.f5299c);
                m.a.O(l0Var, 0, b2Var);
            }
            this.f5076d.add(obj);
            obj = b2Var;
        }
        g0(obj);
    }

    public final boolean g(boolean z3) {
        Object C = C();
        if ((C instanceof Boolean) && z3 == ((Boolean) C).booleanValue()) {
            return false;
        }
        g0(Boolean.valueOf(z3));
        return true;
    }

    public final void g0(Object obj) {
        if (this.S) {
            i2 i2Var = this.I;
            if (i2Var.f4964n <= 0 || i2Var.i == i2Var.f4961k) {
                i2Var.E(obj);
                return;
            }
            o.x xVar = i2Var.f4969s;
            if (xVar == null) {
                xVar = new o.x();
            }
            i2Var.f4969s = xVar;
            int i = i2Var.f4972v;
            Object b8 = xVar.b(i);
            if (b8 == null) {
                b8 = new o.e0();
                xVar.g(i, b8);
            }
            ((o.e0) b8).a(obj);
            return;
        }
        e2 e2Var = this.G;
        boolean z3 = e2Var.f4919n;
        n0.b bVar = this.M;
        if (!z3) {
            a a8 = e2Var.a(e2Var.i);
            n0.l0 l0Var = bVar.f5248b.f5245b;
            l0Var.b0(n0.e.f5264c);
            m.a.P(l0Var, 0, a8, 1, obj);
            return;
        }
        int c8 = (e2Var.f4917l - h2.c(e2Var.f4908b, e2Var.i)) - 1;
        if (bVar.f5247a.G.i - bVar.f5252f >= 0) {
            bVar.d(true);
            n0.l0 l0Var2 = bVar.f5248b.f5245b;
            l0Var2.b0(n0.r.f5293g);
            m.a.O(l0Var2, 0, obj);
            l0Var2.f5281d[l0Var2.f5282e - l0Var2.f5279b[l0Var2.f5280c - 1].f5275a] = c8;
            return;
        }
        e2 e2Var2 = this.G;
        a a9 = e2Var2.a(e2Var2.i);
        n0.l0 l0Var3 = bVar.f5248b.f5245b;
        l0Var3.b0(n0.r.f5292f);
        m.a.P(l0Var3, 0, obj, 1, a9);
        l0Var3.f5281d[l0Var3.f5282e - l0Var3.f5279b[l0Var3.f5280c - 1].f5275a] = c8;
    }

    public final boolean h(Object obj) {
        if (C() == obj) {
            return false;
        }
        g0(obj);
        return true;
    }

    public final int h0(int i) {
        int i8;
        if (i >= 0) {
            int[] iArr = this.f5086o;
            return (iArr == null || (i8 = iArr[i]) < 0) ? this.G.o(i) : i8;
        }
        o.v vVar = this.f5087p;
        if (vVar == null || vVar.c(i) < 0) {
            return 0;
        }
        int c8 = vVar.c(i);
        if (c8 >= 0) {
            return vVar.f5553c[c8];
        }
        p.a.e("Cannot find value for key " + i);
        throw null;
    }

    public final void i() {
        this.f5081j = null;
        this.f5082k = 0;
        this.f5083l = 0;
        this.T = 0L;
        this.f5089r = false;
        n0.b bVar = this.M;
        bVar.f5249c = false;
        bVar.f5250d.f5021b = 0;
        bVar.f5252f = 0;
        bVar.f5251e = true;
        bVar.f5253g = 0;
        bVar.f5254h.clear();
        bVar.i = -1;
        bVar.f5255j = -1;
        bVar.f5256k = -1;
        bVar.f5257l = 0;
        this.E.clear();
        this.f5086o = null;
        this.f5087p = null;
    }

    public final void i0() {
        if (!this.f5089r) {
            t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f5089r = false;
        if (this.S) {
            t.c("useNode() called while inserting");
        }
        e2 e2Var = this.G;
        Object n6 = e2Var.n(e2Var.i);
        n0.b bVar = this.M;
        bVar.c();
        bVar.f5254h.add(n6);
        if (this.f5096y && (n6 instanceof j)) {
            bVar.b();
            bVar.f5248b.f5245b.b0(n0.i0.f5273c);
        }
    }

    public final Object j(r1 r1Var) {
        return b.r(l(), r1Var);
    }

    public final void k(p6.a aVar) {
        if (!this.f5089r) {
            t.c("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f5089r = false;
        if (!this.S) {
            t.c("createNode() can only be called when inserting");
        }
        n0 n0Var = this.f5085n;
        int i = n0Var.f5020a[n0Var.f5021b - 1];
        i2 i2Var = this.I;
        a b8 = i2Var.b(i2Var.f4972v);
        this.f5083l++;
        n0.c cVar = this.O;
        n0.l0 l0Var = cVar.f5259b;
        l0Var.b0(n0.r.f5290d);
        m.a.O(l0Var, 0, aVar);
        l0Var.f5281d[l0Var.f5282e - l0Var.f5279b[l0Var.f5280c - 1].f5275a] = i;
        m.a.O(l0Var, 1, b8);
        n0.l0 l0Var2 = cVar.f5260c;
        l0Var2.b0(n0.r.f5291e);
        l0Var2.f5281d[l0Var2.f5282e - l0Var2.f5279b[l0Var2.f5280c - 1].f5275a] = i;
        m.a.O(l0Var2, 0, b8);
    }

    public final o1 l() {
        o1 o1Var;
        o1 o1Var2 = this.K;
        if (o1Var2 != null) {
            return o1Var2;
        }
        int i = this.G.i;
        boolean z3 = this.S;
        b1 b1Var = t.f5110c;
        if (z3 && this.J) {
            int i8 = this.I.f4972v;
            while (i8 > 0) {
                i2 i2Var = this.I;
                if (i2Var.f4953b[i2Var.r(i8) * 5] == 202 && q6.i.a(this.I.s(i8), b1Var)) {
                    Object q4 = this.I.q(i8);
                    q6.i.c(q4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                    o1 o1Var3 = (o1) q4;
                    this.K = o1Var3;
                    return o1Var3;
                }
                i2 i2Var2 = this.I;
                i8 = i2Var2.D(i2Var2.f4953b, i8);
            }
        }
        if (this.G.f4909c > 0) {
            while (i > 0) {
                if (this.G.i(i) == 202) {
                    e2 e2Var = this.G;
                    if (q6.i.a(e2Var.p(e2Var.f4908b, i), b1Var)) {
                        o.x xVar = this.f5093v;
                        if (xVar == null || (o1Var = (o1) xVar.b(i)) == null) {
                            e2 e2Var2 = this.G;
                            Object b8 = e2Var2.b(e2Var2.f4908b, i);
                            q6.i.c(b8, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                            o1Var = (o1) b8;
                        }
                        this.K = o1Var;
                        return o1Var;
                    }
                }
                i = this.G.q(i);
            }
        }
        o1 o1Var4 = this.f5092u;
        this.K = o1Var4;
        return o1Var4;
    }

    public final List m() {
        boolean z3 = this.C;
        List list = d6.u.f2326d;
        if (!z3) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        i2 i2Var = this.I;
        arrayList.addAll(r2.r.j(i2Var, null, i2Var.f4970t, null));
        e2 e2Var = this.G;
        if (!e2Var.f4912f && e2Var.f4909c != 0) {
            x0.h hVar = new x0.h(e2Var);
            int i = e2Var.i;
            Object valueOf = Integer.valueOf(e2Var.f4917l - h2.c(e2Var.f4908b, i));
            while (i >= 0) {
                hVar.c(e2Var.f4907a.g(i), valueOf);
                valueOf = e2Var.a(i);
                i = e2Var.q(i);
            }
            list = (ArrayList) hVar.f6389a;
        }
        arrayList.addAll(list);
        arrayList.addAll(D());
        return arrayList;
    }

    public final void n(o.j0 j0Var, p6.e eVar) {
        ArrayList arrayList = this.f5090s;
        if (this.F) {
            t.c("Reentrant composition is not supported");
        }
        this.f5079g.r();
        Trace.beginSection("Compose:recompose");
        try {
            this.B = Long.hashCode(w0.m.k().g());
            this.f5093v = null;
            b0(j0Var);
            this.f5082k = 0;
            this.F = true;
            try {
                Z();
                Object C = C();
                if (C != eVar && eVar != null) {
                    g0(eVar);
                }
                r rVar = this.D;
                o0.e m7 = b.m();
                try {
                    m7.b(rVar);
                    b1 b1Var = t.f5108a;
                    if (eVar != null) {
                        T(200, b1Var);
                        u0.h.c(this, eVar);
                        p(false);
                    } else if (!this.f5094w || C == null || C.equals(n.f5019a)) {
                        O();
                    } else {
                        T(200, b1Var);
                        q6.v.c(2, C);
                        u0.h.c(this, (p6.e) C);
                        p(false);
                    }
                    m7.k(m7.f5580f - 1);
                    t();
                    this.F = false;
                    arrayList.clear();
                    if (!this.I.f4973w) {
                        t.c("Check failed");
                    }
                    v();
                } catch (Throwable th) {
                    m7.k(m7.f5580f - 1);
                    throw th;
                }
            } finally {
            }
        } finally {
            Trace.endSection();
        }
    }

    public final void o(int i, int i8) {
        if (i <= 0 || i == i8) {
            return;
        }
        o(this.G.q(i), i8);
        if (this.G.l(i)) {
            Object n6 = this.G.n(i);
            n0.b bVar = this.M;
            bVar.c();
            bVar.f5254h.add(n6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x05c0  */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v32 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z3) {
        long rotateRight;
        n0 n0Var;
        ArrayList arrayList;
        int i;
        boolean z7;
        int i8;
        e2 e2Var;
        n1 n1Var;
        ?? r32;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        n0 n0Var2;
        int i14;
        int i15;
        ArrayList arrayList2;
        LinkedHashSet linkedHashSet;
        int i16;
        int i17;
        ArrayList arrayList3;
        ArrayList arrayList4;
        HashSet hashSet;
        int i18;
        n1 n1Var2;
        int i19;
        Object[] objArr;
        long[] jArr;
        int i20;
        Object[] objArr2;
        long[] jArr2;
        int i21;
        Object[] objArr3;
        long[] jArr3;
        int i22;
        Object[] objArr4;
        long[] jArr4;
        long rotateRight2;
        n0 n0Var3 = this.f5085n;
        int i23 = n0Var3.f5020a[n0Var3.f5021b - 2] - 1;
        boolean z8 = this.S;
        v0 v0Var = n.f5019a;
        if (z8) {
            i2 i2Var = this.I;
            int i24 = i2Var.f4972v;
            int i25 = i2Var.f4953b[i2Var.r(i24) * 5];
            Object s5 = this.I.s(i24);
            Object q4 = this.I.q(i24);
            if (s5 != null) {
                rotateRight2 = Long.rotateRight(this.T ^ 0, 3) ^ (s5 instanceof Enum ? ((Enum) s5).ordinal() : s5.hashCode());
            } else if (q4 == null || i25 != 207 || q4.equals(v0Var)) {
                rotateRight2 = Long.rotateRight(this.T ^ i23, 3) ^ i25;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i23, 3) ^ q4.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight2, 3);
        } else {
            e2 e2Var2 = this.G;
            int i26 = e2Var2.i;
            int i27 = e2Var2.i(i26);
            e2 e2Var3 = this.G;
            Object p7 = e2Var3.p(e2Var3.f4908b, i26);
            e2 e2Var4 = this.G;
            Object b8 = e2Var4.b(e2Var4.f4908b, i26);
            if (p7 != null) {
                rotateRight = Long.rotateRight(this.T ^ 0, 3) ^ (p7 instanceof Enum ? ((Enum) p7).ordinal() : p7.hashCode());
            } else if (b8 == null || i27 != 207 || b8.equals(v0Var)) {
                rotateRight = Long.rotateRight(this.T ^ i23, 3) ^ i27;
            } else {
                this.T = Long.rotateRight(Long.rotateRight(this.T ^ i23, 3) ^ b8.hashCode(), 3);
            }
            this.T = Long.rotateRight(rotateRight, 3);
        }
        int i28 = this.f5083l;
        n1 n1Var3 = this.f5081j;
        ArrayList arrayList5 = this.f5090s;
        n0.b bVar = this.M;
        if (n1Var3 != null) {
            o.x xVar = n1Var3.f5026e;
            int i29 = n1Var3.f5023b;
            ArrayList arrayList6 = n1Var3.f5022a;
            if (arrayList6.size() > 0) {
                ArrayList arrayList7 = n1Var3.f5025d;
                HashSet hashSet2 = new HashSet(arrayList7.size());
                int size = arrayList7.size();
                for (int i30 = 0; i30 < size; i30++) {
                    hashSet2.add(arrayList7.get(i30));
                }
                i = -1;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList7.size();
                int size3 = arrayList6.size();
                int i31 = 0;
                int i32 = 0;
                int i33 = 0;
                while (i31 < size3) {
                    r0 r0Var = (r0) arrayList6.get(i31);
                    if (hashSet2.contains(r0Var)) {
                        n0Var2 = n0Var3;
                        i14 = i31;
                        if (!linkedHashSet2.contains(r0Var)) {
                            int i34 = i32;
                            if (i34 < size2) {
                                r0 r0Var2 = (r0) arrayList7.get(i34);
                                if (r0Var2 != r0Var) {
                                    k0 k0Var = (k0) xVar.b(r0Var2.f5062c);
                                    int i35 = k0Var != null ? k0Var.f4985b : -1;
                                    linkedHashSet2.add(r0Var2);
                                    i15 = i34;
                                    i18 = i33;
                                    n1Var2 = n1Var3;
                                    if (i35 != i18) {
                                        k0 k0Var2 = (k0) xVar.b(r0Var2.f5062c);
                                        int i36 = k0Var2 != null ? k0Var2.f4986c : r0Var2.f5063d;
                                        linkedHashSet = linkedHashSet2;
                                        int i37 = i35 + i29;
                                        i16 = size2;
                                        int i38 = i18 + i29;
                                        if (i36 > 0) {
                                            i17 = i29;
                                            int i39 = bVar.f5257l;
                                            if (i39 > 0) {
                                                arrayList3 = arrayList6;
                                                if (bVar.f5255j == i37 - i39 && bVar.f5256k == i38 - i39) {
                                                    bVar.f5257l = i39 + i36;
                                                }
                                            } else {
                                                arrayList3 = arrayList6;
                                            }
                                            bVar.c();
                                            bVar.f5255j = i37;
                                            bVar.f5256k = i38;
                                            bVar.f5257l = i36;
                                        } else {
                                            i17 = i29;
                                            arrayList3 = arrayList6;
                                            bVar.getClass();
                                        }
                                        if (i35 > i18) {
                                            Object[] objArr5 = xVar.f5496c;
                                            long[] jArr5 = xVar.f5494a;
                                            int length = jArr5.length - 2;
                                            if (length >= 0) {
                                                arrayList4 = arrayList7;
                                                hashSet = hashSet2;
                                                int i40 = 0;
                                                while (true) {
                                                    long j7 = jArr5[i40];
                                                    int i41 = i36;
                                                    arrayList2 = arrayList5;
                                                    if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i42 = 8 - ((~(i40 - length)) >>> 31);
                                                        int i43 = 0;
                                                        while (i43 < i42) {
                                                            if ((j7 & 255) < 128) {
                                                                i22 = i43;
                                                                k0 k0Var3 = (k0) objArr5[(i40 << 3) + i43];
                                                                objArr4 = objArr5;
                                                                int i44 = k0Var3.f4985b;
                                                                jArr4 = jArr5;
                                                                if (i35 <= i44 && i44 < i35 + i41) {
                                                                    k0Var3.f4985b = (i44 - i35) + i18;
                                                                } else if (i18 <= i44 && i44 < i35) {
                                                                    k0Var3.f4985b = i44 + i41;
                                                                }
                                                            } else {
                                                                i22 = i43;
                                                                objArr4 = objArr5;
                                                                jArr4 = jArr5;
                                                            }
                                                            j7 >>= 8;
                                                            i43 = i22 + 1;
                                                            objArr5 = objArr4;
                                                            jArr5 = jArr4;
                                                        }
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                        if (i42 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr5;
                                                        jArr3 = jArr5;
                                                    }
                                                    if (i40 == length) {
                                                        break;
                                                    }
                                                    i40++;
                                                    arrayList5 = arrayList2;
                                                    i36 = i41;
                                                    objArr5 = objArr3;
                                                    jArr5 = jArr3;
                                                }
                                            } else {
                                                arrayList2 = arrayList5;
                                            }
                                        } else {
                                            int i45 = i36;
                                            arrayList2 = arrayList5;
                                            arrayList4 = arrayList7;
                                            hashSet = hashSet2;
                                            if (i18 > i35) {
                                                Object[] objArr6 = xVar.f5496c;
                                                long[] jArr6 = xVar.f5494a;
                                                int length2 = jArr6.length - 2;
                                                if (length2 >= 0) {
                                                    int i46 = 0;
                                                    while (true) {
                                                        long j8 = jArr6[i46];
                                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i47 = 8 - ((~(i46 - length2)) >>> 31);
                                                            int i48 = 0;
                                                            while (i48 < i47) {
                                                                if ((j8 & 255) < 128) {
                                                                    objArr2 = objArr6;
                                                                    k0 k0Var4 = (k0) objArr6[(i46 << 3) + i48];
                                                                    jArr2 = jArr6;
                                                                    int i49 = k0Var4.f4985b;
                                                                    i21 = i35;
                                                                    if (i35 <= i49 && i49 < i21 + i45) {
                                                                        k0Var4.f4985b = (i49 - i21) + i18;
                                                                    } else if (i21 + 1 <= i49 && i49 < i18) {
                                                                        k0Var4.f4985b = i49 - i45;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr6;
                                                                    jArr2 = jArr6;
                                                                    i21 = i35;
                                                                }
                                                                j8 >>= 8;
                                                                i48++;
                                                                jArr6 = jArr2;
                                                                objArr6 = objArr2;
                                                                i35 = i21;
                                                            }
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i20 = i35;
                                                            if (i47 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr6;
                                                            jArr = jArr6;
                                                            i20 = i35;
                                                        }
                                                        if (i46 == length2) {
                                                            break;
                                                        }
                                                        i46++;
                                                        jArr6 = jArr;
                                                        objArr6 = objArr;
                                                        i35 = i20;
                                                    }
                                                }
                                            }
                                        }
                                        i19 = i14;
                                    } else {
                                        arrayList2 = arrayList5;
                                        linkedHashSet = linkedHashSet2;
                                        i16 = size2;
                                        i17 = i29;
                                        arrayList3 = arrayList6;
                                    }
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i19 = i14;
                                } else {
                                    i15 = i34;
                                    arrayList2 = arrayList5;
                                    linkedHashSet = linkedHashSet2;
                                    i16 = size2;
                                    i17 = i29;
                                    arrayList3 = arrayList6;
                                    arrayList4 = arrayList7;
                                    hashSet = hashSet2;
                                    i18 = i33;
                                    n1Var2 = n1Var3;
                                    i19 = i14 + 1;
                                }
                                i32 = i15 + 1;
                                k0 k0Var5 = (k0) xVar.b(r0Var2.f5062c);
                                int i50 = i18 + (k0Var5 != null ? k0Var5.f4986c : r0Var2.f5063d);
                                i31 = i19;
                                n1Var3 = n1Var2;
                                linkedHashSet2 = linkedHashSet;
                                size2 = i16;
                                i29 = i17;
                                arrayList6 = arrayList3;
                                arrayList7 = arrayList4;
                                hashSet2 = hashSet;
                                arrayList5 = arrayList2;
                                i33 = i50;
                                n0Var3 = n0Var2;
                            } else {
                                i32 = i34;
                                n0Var3 = n0Var2;
                                i31 = i14;
                            }
                        }
                    } else {
                        n0Var2 = n0Var3;
                        k0 k0Var6 = (k0) xVar.b(r0Var.f5062c);
                        int i51 = k0Var6 != null ? k0Var6.f4985b : -1;
                        int i52 = r0Var.f5062c;
                        i14 = i31;
                        bVar.e(i51 + i29, r0Var.f5063d);
                        n1Var3.a(i52, 0);
                        bVar.f5252f = (i52 - bVar.f5247a.G.f4913g) + bVar.f5252f;
                        this.G.r(i52);
                        H();
                        this.G.s();
                        t.a(arrayList5, i52, this.G.f4908b[(i52 * 5) + 3] + i52);
                    }
                    i31 = i14 + 1;
                    n0Var3 = n0Var2;
                }
                n0Var = n0Var3;
                arrayList = arrayList5;
                bVar.c();
                if (arrayList6.size() > 0) {
                    e2 e2Var5 = this.G;
                    bVar.f5252f = (e2Var5.f4914h - bVar.f5247a.G.f4913g) + bVar.f5252f;
                    e2Var5.t();
                }
                z7 = this.S;
                if (!z7) {
                    e2 e2Var6 = this.G;
                    int i53 = e2Var6.f4918m - e2Var6.f4917l;
                    if (i53 > 0) {
                        if (i53 > 0) {
                            bVar.d(false);
                            n0 n0Var4 = bVar.f5250d;
                            e2 e2Var7 = bVar.f5247a.G;
                            if (e2Var7.f4909c > 0 && n0Var4.a(-2) != (i13 = e2Var7.i)) {
                                if (!bVar.f5249c && bVar.f5251e) {
                                    bVar.d(false);
                                    bVar.f5248b.f5245b.b0(n0.q.f5289c);
                                    bVar.f5249c = true;
                                }
                                if (i13 > 0) {
                                    a a8 = e2Var7.a(i13);
                                    n0Var4.c(i13);
                                    bVar.d(false);
                                    n0.l0 l0Var = bVar.f5248b.f5245b;
                                    l0Var.b0(n0.p.f5288c);
                                    m.a.O(l0Var, 0, a8);
                                    bVar.f5249c = true;
                                }
                            }
                            n0.l0 l0Var2 = bVar.f5248b.f5245b;
                            l0Var2.b0(n0.e0.f5265c);
                            l0Var2.f5281d[l0Var2.f5282e - l0Var2.f5279b[l0Var2.f5280c - 1].f5275a] = i53;
                        } else {
                            bVar.getClass();
                        }
                    }
                }
                i8 = this.f5082k;
                while (true) {
                    e2Var = this.G;
                    if (e2Var.f4916k > 0 && (i12 = e2Var.f4913g) != e2Var.f4914h) {
                        H();
                        bVar.e(i8, this.G.s());
                        t.a(arrayList, i12, this.G.f4913g);
                    }
                }
                if (z7) {
                    if (z3) {
                        bVar.a();
                    }
                    int i54 = bVar.f5247a.G.i;
                    n0 n0Var5 = bVar.f5250d;
                    int i55 = i;
                    if (n0Var5.a(i55) > i54) {
                        t.c("Missed recording an endGroup");
                    }
                    if (n0Var5.a(i55) == i54) {
                        bVar.d(false);
                        n0Var5.b();
                        bVar.f5248b.f5245b.b0(n0.m.f5285c);
                    }
                    int i56 = this.G.i;
                    if (i28 != h0(i56)) {
                        d0(i56, i28);
                    }
                    if (z3) {
                        i28 = 1;
                    }
                    this.G.e();
                    bVar.c();
                } else {
                    if (z3) {
                        n0.c cVar = this.O;
                        n0.l0 l0Var3 = cVar.f5260c;
                        if (!l0Var3.a0()) {
                            t.c("Cannot end node insertion, there are no pending operations that can be realized.");
                        }
                        n0.l0 l0Var4 = cVar.f5259b;
                        n0.j0[] j0VarArr = l0Var3.f5279b;
                        int i57 = l0Var3.f5280c - 1;
                        l0Var3.f5280c = i57;
                        n0.j0 j0Var = j0VarArr[i57];
                        j0VarArr[i57] = null;
                        l0Var4.b0(j0Var);
                        Object[] objArr7 = l0Var3.f5283f;
                        Object[] objArr8 = l0Var4.f5283f;
                        int i58 = l0Var4.f5284g;
                        int i59 = j0Var.f5276b;
                        int i60 = l0Var3.f5284g;
                        int i61 = i60 - i59;
                        System.arraycopy(objArr7, i61, objArr8, i58 - i59, i60 - i61);
                        Object[] objArr9 = l0Var3.f5283f;
                        int i62 = l0Var3.f5284g;
                        d6.l.L(objArr9, i62 - i59, i62);
                        int[] iArr = l0Var3.f5281d;
                        int[] iArr2 = l0Var4.f5281d;
                        int i63 = l0Var4.f5282e;
                        int i64 = j0Var.f5275a;
                        int i65 = l0Var3.f5282e;
                        d6.l.F(i63 - i64, i65 - i64, i65, iArr, iArr2);
                        l0Var3.f5284g -= i59;
                        l0Var3.f5282e -= i64;
                        i28 = 1;
                    }
                    if (this.G.f4916k <= 0) {
                        p1.a("Unbalanced begin/end empty");
                    }
                    r4.f4916k--;
                    i2 i2Var2 = this.I;
                    int i66 = i2Var2.f4972v;
                    i2Var2.j();
                    if (this.G.f4916k <= 0) {
                        int i67 = (-2) - i66;
                        this.I.k();
                        this.I.e(true);
                        a aVar = this.N;
                        if (this.O.f5259b.Z()) {
                            f2 f2Var = this.H;
                            bVar.b();
                            bVar.d(false);
                            n0 n0Var6 = bVar.f5250d;
                            e2 e2Var8 = bVar.f5247a.G;
                            if (e2Var8.f4909c > 0 && n0Var6.a(-2) != (i11 = e2Var8.i)) {
                                if (!bVar.f5249c && bVar.f5251e) {
                                    bVar.d(false);
                                    bVar.f5248b.f5245b.b0(n0.q.f5289c);
                                    bVar.f5249c = true;
                                }
                                if (i11 > 0) {
                                    a a9 = e2Var8.a(i11);
                                    n0Var6.c(i11);
                                    bVar.d(false);
                                    n0.l0 l0Var5 = bVar.f5248b.f5245b;
                                    l0Var5.b0(n0.p.f5288c);
                                    m.a.O(l0Var5, 0, a9);
                                    i10 = 1;
                                    bVar.f5249c = true;
                                    bVar.c();
                                    n0.l0 l0Var6 = bVar.f5248b.f5245b;
                                    l0Var6.b0(n0.s.f5295c);
                                    m.a.P(l0Var6, 0, aVar, i10, f2Var);
                                    r32 = 0;
                                }
                            }
                            i10 = 1;
                            bVar.c();
                            n0.l0 l0Var62 = bVar.f5248b.f5245b;
                            l0Var62.b0(n0.s.f5295c);
                            m.a.P(l0Var62, 0, aVar, i10, f2Var);
                            r32 = 0;
                        } else {
                            f2 f2Var2 = this.H;
                            n0.c cVar2 = this.O;
                            bVar.b();
                            bVar.d(false);
                            n0 n0Var7 = bVar.f5250d;
                            e2 e2Var9 = bVar.f5247a.G;
                            if (e2Var9.f4909c > 0 && n0Var7.a(-2) != (i9 = e2Var9.i)) {
                                if (!bVar.f5249c && bVar.f5251e) {
                                    bVar.d(false);
                                    bVar.f5248b.f5245b.b0(n0.q.f5289c);
                                    bVar.f5249c = true;
                                }
                                if (i9 > 0) {
                                    a a10 = e2Var9.a(i9);
                                    n0Var7.c(i9);
                                    bVar.d(false);
                                    n0.l0 l0Var7 = bVar.f5248b.f5245b;
                                    l0Var7.b0(n0.p.f5288c);
                                    m.a.O(l0Var7, 0, a10);
                                    bVar.f5249c = true;
                                }
                            }
                            bVar.c();
                            n0.l0 l0Var8 = bVar.f5248b.f5245b;
                            l0Var8.b0(n0.t.f5296c);
                            int i68 = l0Var8.f5284g - l0Var8.f5279b[l0Var8.f5280c - 1].f5276b;
                            Object[] objArr10 = l0Var8.f5283f;
                            objArr10[i68] = aVar;
                            objArr10[i68 + 1] = f2Var2;
                            objArr10[i68 + 2] = cVar2;
                            this.O = new n0.c();
                            r32 = 0;
                        }
                        this.S = r32;
                        if (this.f5075c.f4929e != 0) {
                            c0(i67, r32);
                            d0(i67, i28);
                        }
                    }
                }
                n1Var = (n1) this.i.remove(r3.size() - 1);
                if (n1Var != null && !z7) {
                    n1Var.f5024c++;
                }
                this.f5081j = n1Var;
                this.f5082k = n0Var.b() + i28;
                this.f5084m = n0Var.b();
                this.f5083l = n0Var.b() + i28;
            }
        }
        n0Var = n0Var3;
        arrayList = arrayList5;
        i = -1;
        z7 = this.S;
        if (!z7) {
        }
        i8 = this.f5082k;
        while (true) {
            e2Var = this.G;
            if (e2Var.f4916k > 0) {
                break;
            }
            H();
            bVar.e(i8, this.G.s());
            t.a(arrayList, i12, this.G.f4913g);
        }
        if (z7) {
        }
        n1Var = (n1) this.i.remove(r3.size() - 1);
        if (n1Var != null) {
            n1Var.f5024c++;
        }
        this.f5081j = n1Var;
        this.f5082k = n0Var.b() + i28;
        this.f5084m = n0Var.b();
        this.f5083l = n0Var.b() + i28;
    }

    public final void q() {
        p(false);
        t1 w7 = w();
        if (w7 != null) {
            int i = w7.f5119b;
            if ((i & 1) != 0) {
                w7.f5119b = i | 2;
            }
        }
    }

    public final t1 r() {
        t1 t1Var;
        a a8;
        s1 s1Var;
        ArrayList arrayList = this.E;
        t1 t1Var2 = !arrayList.isEmpty() ? (t1) arrayList.remove(arrayList.size() - 1) : null;
        if (t1Var2 != null) {
            t1Var2.f5119b &= -9;
            this.f5079g.r();
            int i = this.B;
            o.d0 d0Var = t1Var2.f5123f;
            if (d0Var != null && (t1Var2.f5119b & 16) == 0) {
                Object[] objArr = d0Var.f5435b;
                int[] iArr = d0Var.f5436c;
                long[] jArr = d0Var.f5434a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    loop0: while (true) {
                        long j7 = jArr[i8];
                        if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j7 & 255) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    Object obj = objArr[i11];
                                    if (iArr[i11] != i) {
                                        s1Var = new s1(i, 0, t1Var2, d0Var);
                                        break loop0;
                                    }
                                }
                                j7 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                    }
                }
            }
            s1Var = null;
            n0.b bVar = this.M;
            if (s1Var != null) {
                n0.l0 l0Var = bVar.f5248b.f5245b;
                l0Var.b0(n0.l.f5278c);
                m.a.P(l0Var, 0, s1Var, 1, this.f5080h);
            }
            int i12 = t1Var2.f5119b;
            if ((i12 & 512) != 0) {
                t1Var2.f5119b = i12 & (-513);
                n0.l0 l0Var2 = bVar.f5248b.f5245b;
                l0Var2.b0(n0.o.f5287c);
                m.a.O(l0Var2, 0, t1Var2);
                int i13 = t1Var2.f5119b;
                t1Var2.f5119b = i13 & (-129);
                if ((i13 & 1024) != 0) {
                    t1Var2.f5119b = i13 & (-1153);
                    this.f5096y = false;
                }
            }
        }
        if (t1Var2 != null) {
            int i14 = t1Var2.f5119b;
            if ((i14 & 16) == 0 && ((i14 & 1) != 0 || this.f5088q)) {
                if (t1Var2.f5120c == null) {
                    if (this.S) {
                        i2 i2Var = this.I;
                        a8 = i2Var.b(i2Var.f4972v);
                    } else {
                        e2 e2Var = this.G;
                        a8 = e2Var.a(e2Var.i);
                    }
                    t1Var2.f5120c = a8;
                }
                t1Var2.f5119b &= -5;
                t1Var = t1Var2;
                p(false);
                return t1Var;
            }
        }
        t1Var = null;
        p(false);
        return t1Var;
    }

    public final void s() {
        if (this.F || this.f5097z != 100) {
            p1.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.f5097z = -1;
        this.f5096y = false;
    }

    public final void t() {
        p(false);
        this.f5074b.c();
        p(false);
        n0.b bVar = this.M;
        if (bVar.f5249c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f5248b.f5245b.b0(n0.m.f5285c);
            bVar.f5249c = false;
        }
        bVar.b();
        if (bVar.f5250d.f5021b != 0) {
            t.c("Missed recording an endGroup()");
        }
        if (!this.i.isEmpty()) {
            t.c("Start/end imbalance");
        }
        i();
        this.G.c();
        this.f5094w = this.f5095x.b() != 0;
    }

    public final void u(boolean z3, n1 n1Var) {
        this.i.add(this.f5081j);
        this.f5081j = n1Var;
        int i = this.f5083l;
        n0 n0Var = this.f5085n;
        n0Var.c(i);
        n0Var.c(this.f5084m);
        n0Var.c(this.f5082k);
        if (z3) {
            this.f5082k = 0;
        }
        this.f5083l = 0;
        this.f5084m = 0;
    }

    public final void v() {
        f2 f2Var = new f2();
        if (this.C) {
            f2Var.b();
        }
        if (this.f5074b.d()) {
            f2Var.f4937n = new o.x();
        }
        this.H = f2Var;
        i2 e8 = f2Var.e();
        e8.e(true);
        this.I = e8;
    }

    public final t1 w() {
        if (this.A != 0) {
            return null;
        }
        ArrayList arrayList = this.E;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (t1) arrayList.get(arrayList.size() - 1);
    }

    public final boolean x() {
        if (!z() || this.f5094w) {
            return true;
        }
        t1 w7 = w();
        return (w7 == null || (w7.f5119b & 4) == 0) ? false : true;
    }

    public final x0.b y() {
        if (this.C) {
            return this.Q;
        }
        return null;
    }

    public final boolean z() {
        t1 w7;
        return (this.S || this.f5096y || this.f5094w || (w7 = w()) == null || (w7.f5119b & 8) != 0) ? false : true;
    }
}
