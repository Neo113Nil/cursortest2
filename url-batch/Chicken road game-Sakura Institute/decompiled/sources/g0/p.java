package g0;

import android.os.Trace;
import android.util.SparseArray;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class p {
    public int A;
    public boolean B;
    public final o C;
    public final f1.g D;
    public boolean E;
    public x1 F;
    public y1 G;
    public a2 H;
    public boolean I;
    public k1 J;
    public h0.a K;
    public final h0.b L;
    public c M;
    public h0.c N;
    public boolean O;
    public int P;

    /* renamed from: a, reason: collision with root package name */
    public final b1.b f3820a;

    /* renamed from: b, reason: collision with root package name */
    public final r f3821b;

    /* renamed from: c, reason: collision with root package name */
    public final y1 f3822c;

    /* renamed from: d, reason: collision with root package name */
    public final i.a0 f3823d;

    /* renamed from: e, reason: collision with root package name */
    public final h0.a f3824e;

    /* renamed from: f, reason: collision with root package name */
    public final h0.a f3825f;

    /* renamed from: g, reason: collision with root package name */
    public final u f3826g;

    /* renamed from: i, reason: collision with root package name */
    public j1 f3828i;

    /* renamed from: j, reason: collision with root package name */
    public int f3829j;

    /* renamed from: k, reason: collision with root package name */
    public int f3830k;

    /* renamed from: l, reason: collision with root package name */
    public int f3831l;

    /* renamed from: n, reason: collision with root package name */
    public int[] f3833n;

    /* renamed from: o, reason: collision with root package name */
    public i.n f3834o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f3835p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f3836q;

    /* renamed from: u, reason: collision with root package name */
    public b6.c f3840u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3841v;

    /* renamed from: x, reason: collision with root package name */
    public boolean f3843x;

    /* renamed from: z, reason: collision with root package name */
    public int f3845z;

    /* renamed from: h, reason: collision with root package name */
    public final f1.g f3827h = new f1.g(2);

    /* renamed from: m, reason: collision with root package name */
    public final m0 f3832m = new m0();

    /* renamed from: r, reason: collision with root package name */
    public final ArrayList f3837r = new ArrayList();

    /* renamed from: s, reason: collision with root package name */
    public final m0 f3838s = new m0();

    /* renamed from: t, reason: collision with root package name */
    public k1 f3839t = o0.d.f6822i;

    /* renamed from: w, reason: collision with root package name */
    public final m0 f3842w = new m0();

    /* renamed from: y, reason: collision with root package name */
    public int f3844y = -1;

    public p(b1.b bVar, r rVar, y1 y1Var, i.a0 a0Var, h0.a aVar, h0.a aVar2, u uVar) {
        this.f3820a = bVar;
        this.f3821b = rVar;
        this.f3822c = y1Var;
        this.f3823d = a0Var;
        this.f3824e = aVar;
        this.f3825f = aVar2;
        this.f3826g = uVar;
        this.B = rVar.e() || rVar.c();
        this.C = new o(0, this);
        this.D = new f1.g(2);
        x1 m8 = y1Var.m();
        m8.c();
        this.F = m8;
        y1 y1Var2 = new y1();
        if (rVar.e()) {
            y1Var2.g();
        }
        if (rVar.c()) {
            y1Var2.f3983o = new i.p();
        }
        this.G = y1Var2;
        a2 w4 = y1Var2.w();
        w4.e(true);
        this.H = w4;
        this.L = new h0.b(this, aVar);
        x1 m9 = this.G.m();
        try {
            c a3 = m9.a(0);
            m9.c();
            this.M = a3;
            this.N = new h0.c();
        } catch (Throwable th) {
            m9.c();
            throw th;
        }
    }

    public static final int I(p pVar, int i7, boolean z8, int i8) {
        x1 x1Var = pVar.F;
        h0.b bVar = pVar.L;
        int[] iArr = x1Var.f3959b;
        int i9 = i7 * 5;
        if ((iArr[i9 + 1] & 134217728) != 0) {
            int i10 = iArr[i9];
            Object j8 = x1Var.j(iArr, i7);
            if (i10 == 206 && r6.k.a(j8, d.f3704e)) {
                Object g9 = x1Var.g(i7, 0);
                m mVar = g9 instanceof m ? (m) g9 : null;
                if (mVar != null) {
                    for (p pVar2 : mVar.f3791f.f3799e) {
                        h0.b bVar2 = pVar2.L;
                        y1 y1Var = pVar2.f3822c;
                        if (y1Var.f3975g > 0 && d.h(y1Var.f3974f, 0)) {
                            h0.a aVar = new h0.a();
                            pVar2.K = aVar;
                            x1 m8 = y1Var.m();
                            try {
                                pVar2.F = m8;
                                h0.a aVar2 = bVar2.f4590b;
                                try {
                                    bVar2.f4590b = aVar;
                                    pVar2.H(0);
                                    bVar2.b();
                                    if (bVar2.f4591c) {
                                        bVar2.f4590b.f4587g.Z(h0.w.f4637c);
                                        if (bVar2.f4591c) {
                                            bVar2.d(false);
                                            bVar2.d(false);
                                            bVar2.f4590b.f4587g.Z(h0.i.f4619c);
                                            bVar2.f4591c = false;
                                        }
                                    }
                                } finally {
                                }
                            } finally {
                                m8.c();
                            }
                        }
                        pVar.f3821b.l(pVar2.f3826g);
                    }
                }
                return d.o(iArr, i7);
            }
            if (!d.m(iArr, i7)) {
                return d.o(iArr, i7);
            }
        } else if (d.h(iArr, i7)) {
            int i11 = iArr[i9 + 3] + i7;
            int i12 = 0;
            for (int i13 = i7 + 1; i13 < i11; i13 += iArr[(i13 * 5) + 3]) {
                boolean m9 = d.m(iArr, i13);
                if (m9) {
                    bVar.c();
                    Object i14 = x1Var.i(i13);
                    bVar.c();
                    bVar.f4596h.f3153f.add(i14);
                }
                i12 += I(pVar, i13, m9 || z8, m9 ? 0 : i8 + i12);
                if (m9) {
                    bVar.c();
                    bVar.a();
                }
            }
            if (!d.m(iArr, i7)) {
                return i12;
            }
        } else if (!d.m(iArr, i7)) {
            return d.o(iArr, i7);
        }
        return 1;
    }

    public final int A(int i7) {
        int p6 = d.p(this.F.f3959b, i7) + 1;
        int i8 = 0;
        while (p6 < i7) {
            if (!d.l(this.F.f3959b, p6)) {
                i8++;
            }
            p6 += d.j(this.F.f3959b, p6);
        }
        return i8;
    }

    public final boolean B(b6.c cVar) {
        h0.d0 d0Var = this.f3824e.f4587g;
        if (!d0Var.W()) {
            d.w("Expected applyChanges() to have been called");
            throw null;
        }
        if (((i.x) cVar.f1394g).f4816e <= 0 && this.f3837r.isEmpty()) {
            return false;
        }
        n(cVar, null);
        return d0Var.X();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0037, code lost:
    
        if (r3.f3803b < r5) goto L11;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C() {
        n0 n0Var;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z8;
        int i12;
        long j8;
        n0 n0Var2;
        int i13;
        i.u uVar;
        int i14;
        int D;
        d6.z zVar;
        boolean z9 = this.E;
        boolean z10 = true;
        this.E = true;
        x1 x1Var = this.F;
        int i15 = x1Var.f3966i;
        int i16 = (i15 * 5) + 3;
        int i17 = x1Var.f3959b[i16] + i15;
        int i18 = this.f3829j;
        int i19 = this.P;
        int i20 = this.f3830k;
        int i21 = this.f3831l;
        int i22 = x1Var.f3964g;
        ArrayList arrayList = this.f3837r;
        int D2 = d.D(i22, arrayList);
        if (D2 < 0) {
            D2 = -(D2 + 1);
        }
        if (D2 < arrayList.size()) {
            n0Var = (n0) arrayList.get(D2);
        }
        n0Var = null;
        int i23 = i15;
        boolean z11 = false;
        while (n0Var != null) {
            boolean z12 = z10;
            p1 p1Var = n0Var.f3802a;
            int i24 = n0Var.f3803b;
            int D3 = d.D(i24, arrayList);
            if (D3 >= 0) {
            }
            Object obj = n0Var.f3804c;
            if (obj == null) {
                p1Var.getClass();
                i7 = i16;
            } else {
                int i25 = 8;
                i.x xVar = p1Var.f3856g;
                if (xVar == null) {
                    i7 = i16;
                } else {
                    i7 = i16;
                    if (obj instanceof e0) {
                        z8 = p1.a((e0) obj, xVar);
                        i8 = i18;
                        i9 = i19;
                        i10 = i20;
                        i11 = i21;
                    } else if (obj instanceof i.b0) {
                        i.b0 b0Var = (i.b0) obj;
                        if (b0Var.h()) {
                            Object[] objArr = b0Var.f4722b;
                            long[] jArr = b0Var.f4721a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                i10 = i20;
                                i11 = i21;
                                int i26 = 0;
                                while (true) {
                                    long j9 = jArr[i26];
                                    i8 = i18;
                                    i9 = i19;
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i27 = 8 - ((~(i26 - length)) >>> 31);
                                        int i28 = 0;
                                        while (i28 < i27) {
                                            if ((j9 & 255) < 128) {
                                                i12 = i28;
                                                Object obj2 = objArr[(i26 << 3) + i28];
                                                j8 = j9;
                                                if (!(obj2 instanceof e0) || p1.a((e0) obj2, xVar)) {
                                                    break;
                                                }
                                            } else {
                                                i12 = i28;
                                                j8 = j9;
                                            }
                                            j9 = j8 >> i25;
                                            i28 = i12 + 1;
                                        }
                                        if (i27 != i25) {
                                            break;
                                        }
                                    }
                                    if (i26 == length) {
                                        break;
                                    }
                                    i26++;
                                    i18 = i8;
                                    i19 = i9;
                                    i25 = 8;
                                }
                                z8 = z12 ? 1 : 0;
                            }
                        }
                        i8 = i18;
                        i9 = i19;
                        i10 = i20;
                        i11 = i21;
                        z8 = false;
                    }
                    if (z8) {
                        int i29 = i9;
                        n0Var2 = null;
                        f1.g gVar = this.D;
                        gVar.f3153f.add(p1Var);
                        u uVar2 = p1Var.f3851b;
                        if (uVar2 == null || (uVar = p1Var.f3855f) == null) {
                            i13 = i29;
                        } else {
                            p1Var.e(z12);
                            try {
                                Object[] objArr2 = uVar.f4799b;
                                int[] iArr = uVar.f4800c;
                                long[] jArr2 = uVar.f4798a;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i30 = 0;
                                    while (true) {
                                        long j10 = jArr2[i30];
                                        long[] jArr3 = jArr2;
                                        i13 = i29;
                                        if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i31 = 8 - ((~(i30 - length2)) >>> 31);
                                            for (int i32 = 0; i32 < i31; i32 = i14 + 1) {
                                                if ((j10 & 255) < 128) {
                                                    int i33 = (i30 << 3) + i32;
                                                    i14 = i32;
                                                    Object obj3 = objArr2[i33];
                                                    int i34 = iArr[i33];
                                                    uVar2.v(obj3);
                                                } else {
                                                    i14 = i32;
                                                }
                                                j10 >>= 8;
                                            }
                                            if (i31 != 8) {
                                                break;
                                            }
                                        }
                                        if (i30 == length2) {
                                            break;
                                        }
                                        i30++;
                                        i29 = i13;
                                        jArr2 = jArr3;
                                    }
                                } else {
                                    i13 = i29;
                                }
                                p1Var.e(false);
                            } catch (Throwable th) {
                                p1Var.e(false);
                                throw th;
                            }
                        }
                        z12 = true;
                        gVar.f3153f.remove(r2.size() - 1);
                    } else {
                        this.F.k(i24);
                        int i35 = this.F.f3964g;
                        F(i23, i35, i15);
                        int i36 = (i35 * 5) + 2;
                        int i37 = this.F.f3959b[i36];
                        while (i37 != i15 && !d.m(this.F.f3959b, i37)) {
                            i37 = this.F.f3959b[(i37 * 5) + 2];
                        }
                        int i38 = d.m(this.F.f3959b, i37) ? 0 : i8;
                        if (i37 != i35) {
                            int c02 = (c0(i37) - d.o(this.F.f3959b, i35)) + i38;
                            while (i38 < c02 && i37 != i24) {
                                i37++;
                                while (i37 < i24) {
                                    int[] iArr2 = this.F.f3959b;
                                    int i39 = iArr2[(i37 * 5) + 3] + i37;
                                    if (i24 >= i39) {
                                        i38 += d.m(iArr2, i37) ? z12 ? 1 : 0 : c0(i37);
                                        i37 = i39;
                                    }
                                }
                                break;
                            }
                        }
                        this.f3829j = i38;
                        this.f3831l = A(i35);
                        int i40 = this.F.f3959b[i36];
                        int i41 = i9;
                        this.P = j(i40, A(i40), i15, i41);
                        this.J = null;
                        q6.e eVar = p1Var.f3853d;
                        if (eVar != null) {
                            eVar.d(this, Integer.valueOf(z12 ? 1 : 0));
                            zVar = d6.z.f2639a;
                        } else {
                            zVar = null;
                        }
                        if (zVar == null) {
                            throw new IllegalStateException("Invalid restart scope");
                        }
                        this.J = null;
                        x1 x1Var2 = this.F;
                        int i42 = x1Var2.f3959b[i7] + i15;
                        int i43 = x1Var2.f3964g;
                        if (!((i43 < i15 || i43 > i42) ? false : z12 ? 1 : 0)) {
                            d.w("Index " + i15 + " is not a parent of " + i43);
                            throw null;
                        }
                        x1Var2.f3966i = i15;
                        x1Var2.f3965h = i42;
                        x1Var2.f3969l = 0;
                        x1Var2.f3970m = 0;
                        i23 = i35;
                        i13 = i41;
                        z11 = z12 ? 1 : 0;
                        n0Var2 = null;
                    }
                    D = d.D(this.F.f3964g, arrayList);
                    if (D < 0) {
                        D = -(D + 1);
                    }
                    if (D < arrayList.size()) {
                        n0 n0Var3 = (n0) arrayList.get(D);
                        if (n0Var3.f3803b < i17) {
                            n0Var = n0Var3;
                            z10 = z12;
                            i16 = i7;
                            i20 = i10;
                            i21 = i11;
                            i18 = i8;
                            i19 = i13;
                        }
                    }
                    n0Var = n0Var2;
                    z10 = z12;
                    i16 = i7;
                    i20 = i10;
                    i21 = i11;
                    i18 = i8;
                    i19 = i13;
                }
            }
            i8 = i18;
            i9 = i19;
            i10 = i20;
            i11 = i21;
            z8 = z12 ? 1 : 0;
            if (z8) {
            }
            D = d.D(this.F.f3964g, arrayList);
            if (D < 0) {
            }
            if (D < arrayList.size()) {
            }
            n0Var = n0Var2;
            z10 = z12;
            i16 = i7;
            i20 = i10;
            i21 = i11;
            i18 = i8;
            i19 = i13;
        }
        int i44 = i18;
        int i45 = i19;
        int i46 = i20;
        int i47 = i21;
        if (z11) {
            F(i23, i15, i15);
            this.F.m();
            int c03 = c0(i15);
            this.f3829j = i44 + c03;
            this.f3830k = i46 + c03;
            this.f3831l = i47;
        } else {
            K();
        }
        this.P = i45;
        this.E = z9;
    }

    public final void D() {
        H(this.F.f3964g);
        h0.b bVar = this.L;
        bVar.d(false);
        m0 m0Var = bVar.f4592d;
        p pVar = bVar.f4589a;
        x1 x1Var = pVar.F;
        if (x1Var.f3960c > 0) {
            int i7 = x1Var.f3966i;
            int i8 = m0Var.f3793b;
            if ((i8 > 0 ? m0Var.f3792a[i8 - 1] : -2) != i7) {
                if (!bVar.f4591c && bVar.f4593e) {
                    bVar.d(false);
                    bVar.f4590b.f4587g.Z(h0.l.f4622c);
                    bVar.f4591c = true;
                }
                if (i7 > 0) {
                    c a3 = x1Var.a(i7);
                    m0Var.b(i7);
                    bVar.d(false);
                    h0.d0 d0Var = bVar.f4590b.f4587g;
                    h0.k kVar = h0.k.f4621c;
                    int i9 = kVar.f4605b;
                    d0Var.a0(kVar);
                    j1.c.l0(d0Var, 0, a3);
                    int i10 = d0Var.f4613m;
                    int i11 = kVar.f4604a;
                    if (i10 != h0.d0.T(d0Var, i11) || d0Var.f4614n != h0.d0.T(d0Var, i9)) {
                        StringBuilder sb = new StringBuilder();
                        int i12 = 0;
                        for (int i13 = 0; i13 < i11; i13++) {
                            if (((1 << i13) & d0Var.f4613m) != 0) {
                                if (i12 > 0) {
                                    sb.append(", ");
                                }
                                sb.append(kVar.b(i13));
                                i12++;
                            }
                        }
                        String sb2 = sb.toString();
                        StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                        int i14 = 0;
                        for (int i15 = 0; i15 < i9; i15++) {
                            if (((1 << i15) & d0Var.f4614n) != 0) {
                                if (i12 > 0) {
                                    o2.append(", ");
                                }
                                o2.append(kVar.c(i15));
                                i14++;
                            }
                        }
                        String sb3 = o2.toString();
                        r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb4 = new StringBuilder("Error while pushing ");
                        sb4.append(kVar);
                        sb4.append(". Not all arguments were provided. Missing ");
                        a0.m.t(sb4, i12, " int arguments (", sb2, ") and ");
                        a0.m.u(sb4, i14, " object arguments (", sb3, ").");
                        throw null;
                    }
                    bVar.f4591c = true;
                }
            }
        }
        bVar.f4590b.f4587g.Z(h0.s.f4633c);
        int i16 = bVar.f4594f;
        x1 x1Var2 = pVar.F;
        bVar.f4594f = x1Var2.f3959b[(x1Var2.f3964g * 5) + 3] + i16;
    }

    public final void E(k1 k1Var) {
        b6.c cVar = this.f3840u;
        if (cVar == null) {
            cVar = new b6.c(21);
            this.f3840u = cVar;
        }
        ((SparseArray) cVar.f1394g).put(this.F.f3964g, k1Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0081 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void F(int i7, int i8, int i9) {
        x1 x1Var = this.F;
        if (i7 != i8) {
            if (i7 != i9 && i8 != i9) {
                int[] iArr = x1Var.f3959b;
                int[] iArr2 = x1Var.f3959b;
                int i10 = iArr[(i7 * 5) + 2];
                if (i10 == i8) {
                    i9 = i8;
                } else {
                    int i11 = iArr[(i8 * 5) + 2];
                    if (i11 != i7) {
                        if (i10 == i11) {
                            i9 = i10;
                        } else {
                            int i12 = i7;
                            int i13 = 0;
                            while (i12 > 0 && i12 != i9) {
                                i12 = d.p(iArr2, i12);
                                i13++;
                            }
                            int i14 = i8;
                            int i15 = 0;
                            while (i14 > 0 && i14 != i9) {
                                i14 = d.p(iArr2, i14);
                                i15++;
                            }
                            int i16 = i13 - i15;
                            int i17 = i7;
                            for (int i18 = 0; i18 < i16; i18++) {
                                i17 = iArr[(i17 * 5) + 2];
                            }
                            int i19 = i15 - i13;
                            int i20 = i8;
                            for (int i21 = 0; i21 < i19; i21++) {
                                i20 = iArr[(i20 * 5) + 2];
                            }
                            i9 = i17;
                            for (int i22 = i20; i9 != i22; i22 = iArr[(i22 * 5) + 2]) {
                                i9 = iArr[(i9 * 5) + 2];
                            }
                        }
                    }
                }
            }
            while (i7 > 0 && i7 != i9) {
                if (!d.m(x1Var.f3959b, i7)) {
                    this.L.a();
                }
                i7 = x1Var.f3959b[(i7 * 5) + 2];
            }
            o(i8, i9);
        }
        i9 = i7;
        while (i7 > 0) {
            if (!d.m(x1Var.f3959b, i7)) {
            }
            i7 = x1Var.f3959b[(i7 * 5) + 2];
        }
        o(i8, i9);
    }

    public final Object G() {
        if (!this.O) {
            Object h3 = this.F.h();
            if (!this.f3843x || (h3 instanceof m)) {
                return h3 instanceof v1 ? ((v1) h3).f3952a : h3;
            }
        } else if (this.f3836q) {
            d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return l.f3784a;
    }

    public final void H(int i7) {
        I(this, i7, false, 0);
        this.L.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J() {
        int rotateLeft;
        if (this.f3837r.isEmpty()) {
            this.f3830k = this.F.l() + this.f3830k;
            return;
        }
        x1 x1Var = this.F;
        int f9 = x1Var.f();
        int[] iArr = x1Var.f3959b;
        int i7 = x1Var.f3964g;
        Object j8 = i7 < x1Var.f3965h ? x1Var.j(iArr, i7) : null;
        Object e9 = x1Var.e();
        int i8 = this.f3831l;
        t0 t0Var = l.f3784a;
        if (j8 != null) {
            rotateLeft = Integer.rotateLeft((j8 instanceof Enum ? ((Enum) j8).ordinal() : j8.hashCode()) ^ Integer.rotateLeft(this.P, 3), 3);
        } else {
            if (e9 != null && f9 == 207 && !e9.equals(t0Var)) {
                this.P = Integer.rotateLeft(e9.hashCode() ^ Integer.rotateLeft(this.P, 3), 3) ^ i8;
                P(null, d.m(iArr, x1Var.f3964g));
                C();
                x1Var.d();
                if (j8 == null) {
                    if (j8 instanceof Enum) {
                        this.P = Integer.rotateRight(Integer.hashCode(((Enum) j8).ordinal()) ^ Integer.rotateRight(this.P, 3), 3);
                        return;
                    } else {
                        this.P = Integer.rotateRight(Integer.hashCode(j8.hashCode()) ^ Integer.rotateRight(this.P, 3), 3);
                        return;
                    }
                }
                if (e9 == null || f9 != 207 || e9.equals(t0Var)) {
                    this.P = Integer.rotateRight(Integer.rotateRight(this.P ^ i8, 3) ^ Integer.hashCode(f9), 3);
                    return;
                } else {
                    this.P = Integer.rotateRight(Integer.hashCode(e9.hashCode()) ^ Integer.rotateRight(this.P ^ i8, 3), 3);
                    return;
                }
            }
            rotateLeft = Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ f9, 3) ^ i8;
        }
        this.P = rotateLeft;
        P(null, d.m(iArr, x1Var.f3964g));
        C();
        x1Var.d();
        if (j8 == null) {
        }
    }

    public final void K() {
        x1 x1Var = this.F;
        int i7 = x1Var.f3966i;
        this.f3830k = i7 >= 0 ? d.o(x1Var.f3959b, i7) : 0;
        this.F.m();
    }

    public final void L() {
        if (this.f3830k != 0) {
            d.w("No nodes can be emitted before calling skipAndEndGroup");
            throw null;
        }
        p1 v5 = v();
        if (v5 != null) {
            v5.f3850a |= 16;
        }
        if (this.f3837r.isEmpty()) {
            K();
        } else {
            C();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x014f  */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28, types: [int] */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v5, types: [g0.k1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void M(int i7, int i8, Object obj, Object obj2) {
        int rotateLeft;
        boolean z8;
        boolean z9;
        Throwable th;
        int i9;
        j1 j1Var;
        boolean z10;
        j1 j1Var2;
        int i10;
        int i11;
        Object[] objArr;
        int i12;
        Object[] objArr2;
        boolean z11;
        h0.d0 d0Var;
        h0.p pVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Object[] objArr3;
        Object[] objArr4;
        int i18;
        boolean z12;
        ?? o2;
        p pVar2 = this;
        Object obj3 = obj;
        if (pVar2.f3836q) {
            d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        int i19 = pVar2.f3831l;
        t0 t0Var = l.f3784a;
        if (obj3 != null) {
            rotateLeft = Integer.rotateLeft((obj3 instanceof Enum ? ((Enum) obj3).ordinal() : obj3.hashCode()) ^ Integer.rotateLeft(pVar2.P, 3), 3);
        } else {
            if (obj2 != null && i7 == 207 && !obj2.equals(t0Var)) {
                pVar2.P = i19 ^ Integer.rotateLeft(obj2.hashCode() ^ Integer.rotateLeft(pVar2.P, 3), 3);
                boolean z13 = true;
                if (obj3 == null) {
                    pVar2.f3831l++;
                }
                boolean z14 = i8 == 0;
                if (!pVar2.O) {
                    pVar2.F.f3968k++;
                    a2 a2Var = pVar2.H;
                    int i20 = a2Var.f3683t;
                    if (z14) {
                        a2Var.H(i7, t0Var, t0Var, true);
                    } else if (obj2 != null) {
                        if (obj3 == null) {
                            obj3 = t0Var;
                        }
                        a2Var.H(i7, obj3, obj2, false);
                    } else {
                        if (obj3 == null) {
                            obj3 = t0Var;
                        }
                        a2Var.H(i7, obj3, t0Var, false);
                    }
                    j1 j1Var3 = pVar2.f3828i;
                    if (j1Var3 != null) {
                        int i21 = (-2) - i20;
                        p0 p0Var = new p0(-1, i7, i21, -1);
                        j1Var3.f3763e.i(i21, new j0(-1, pVar2.f3829j - j1Var3.f3760b, 0));
                        j1Var3.f3762d.add(p0Var);
                    }
                    pVar2.t(z14, null);
                    return;
                }
                boolean z15 = i8 == 1 && pVar2.f3843x;
                if (pVar2.f3828i == null) {
                    int f9 = pVar2.F.f();
                    if (!z15 && f9 == i7) {
                        x1 x1Var = pVar2.F;
                        int i22 = x1Var.f3964g;
                        if (r6.k.a(obj3, i22 < x1Var.f3965h ? x1Var.j(x1Var.f3959b, i22) : null)) {
                            pVar2.P(obj2, z14);
                        }
                    }
                    x1 x1Var2 = pVar2.F;
                    int[] iArr = x1Var2.f3959b;
                    i9 = -2;
                    ArrayList arrayList = new ArrayList();
                    if (x1Var2.f3968k > 0) {
                        th = null;
                    } else {
                        int i23 = x1Var2.f3964g;
                        th = null;
                        while (i23 < x1Var2.f3965h) {
                            int i24 = i23 * 5;
                            boolean z16 = z13;
                            int i25 = iArr[i24];
                            Object j8 = x1Var2.j(iArr, i23);
                            if (d.m(iArr, i23)) {
                                z12 = z15;
                                o2 = z16;
                            } else {
                                z12 = z15;
                                o2 = d.o(iArr, i23);
                            }
                            arrayList.add(new p0(j8, i25, i23, o2));
                            i23 += iArr[i24 + 3];
                            z15 = z12;
                            z13 = z16;
                        }
                    }
                    z8 = z15;
                    z9 = z13;
                    pVar2.f3828i = new j1(pVar2.f3829j, arrayList);
                    j1Var = pVar2.f3828i;
                    if (j1Var == null) {
                        ArrayList arrayList2 = j1Var.f3762d;
                        i.p pVar3 = j1Var.f3763e;
                        int i26 = j1Var.f3760b;
                        Object o0Var = obj3 != null ? new o0(Integer.valueOf(i7), obj3) : Integer.valueOf(i7);
                        i.x xVar = ((y0) j1Var.f3764f.getValue()).f3973a;
                        Object e9 = xVar.e(o0Var);
                        if (e9 != null) {
                            if (!(e9 instanceof List) || ((e9 instanceof s6.a) && !(e9 instanceof s6.c))) {
                                xVar.g(o0Var);
                            } else {
                                List b9 = r6.y.b(e9);
                                Object remove = b9.remove(0);
                                if (b9.isEmpty()) {
                                    xVar.g(o0Var);
                                }
                                e9 = remove;
                            }
                            r6.k.d(e9, "null cannot be cast to non-null type V of androidx.compose.runtime.MutableScatterMultiMap.pop_impl$lambda$1");
                        } else {
                            e9 = th;
                        }
                        p0 p0Var2 = (p0) e9;
                        if (z8 || p0Var2 == null) {
                            z10 = z14;
                            pVar2.F.f3968k++;
                            pVar2.O = true;
                            ?? r22 = th;
                            pVar2.J = r22;
                            if (pVar2.H.f3686w) {
                                a2 w4 = pVar2.G.w();
                                pVar2.H = w4;
                                w4.D();
                                pVar2.I = false;
                                pVar2.J = r22;
                            }
                            pVar2.H.d();
                            a2 a2Var2 = pVar2.H;
                            int i27 = a2Var2.f3683t;
                            if (z10) {
                                a2Var2.H(i7, t0Var, t0Var, true);
                                i10 = 0;
                            } else if (obj2 != null) {
                                if (obj3 == null) {
                                    obj3 = t0Var;
                                }
                                i10 = 0;
                                a2Var2.H(i7, obj3, obj2, false);
                            } else {
                                i10 = 0;
                                if (obj3 == null) {
                                    obj3 = t0Var;
                                }
                                a2Var2.H(i7, obj3, t0Var, false);
                            }
                            pVar2.M = pVar2.H.b(i27);
                            int i28 = (-2) - i27;
                            p0 p0Var3 = new p0(-1, i7, i28, -1);
                            pVar3.i(i28, new j0(-1, pVar2.f3829j - i26, i10));
                            arrayList2.add(p0Var3);
                            ArrayList arrayList3 = new ArrayList();
                            if (!z10) {
                                i10 = pVar2.f3829j;
                            }
                            j1Var2 = new j1(i10, arrayList3);
                            pVar2.t(z10, j1Var2);
                            return;
                        }
                        int i29 = p0Var2.f3848c;
                        arrayList2.add(p0Var2);
                        j0 j0Var = (j0) pVar3.f(i29);
                        pVar2.f3829j = (j0Var != null ? j0Var.f3757b : -1) + i26;
                        j0 j0Var2 = (j0) pVar3.f(i29);
                        int i30 = j0Var2 != null ? j0Var2.f3756a : -1;
                        int i31 = j1Var.f3761c;
                        int i32 = i30 - i31;
                        int i33 = 8;
                        if (i30 > i31) {
                            Object[] objArr5 = pVar3.f4772c;
                            long[] jArr = pVar3.f4770a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i34 = 0;
                                while (true) {
                                    long j9 = jArr[i34];
                                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i35 = 8 - ((~(i34 - length)) >>> 31);
                                        int i36 = 0;
                                        while (i36 < i35) {
                                            if ((j9 & 255) < 128) {
                                                i18 = i33;
                                                j0 j0Var3 = (j0) objArr5[(i34 << 3) + i36];
                                                objArr4 = objArr5;
                                                int i37 = j0Var3.f3756a;
                                                if (i37 == i30) {
                                                    j0Var3.f3756a = i31;
                                                } else if (i31 <= i37 && i37 < i30) {
                                                    j0Var3.f3756a = i37 + 1;
                                                }
                                            } else {
                                                objArr4 = objArr5;
                                                i18 = i33;
                                            }
                                            j9 >>= i18;
                                            i36++;
                                            objArr5 = objArr4;
                                            i33 = i18;
                                        }
                                        objArr3 = objArr5;
                                        if (i35 != i33) {
                                            break;
                                        }
                                    } else {
                                        objArr3 = objArr5;
                                    }
                                    if (i34 == length) {
                                        break;
                                    }
                                    i34++;
                                    objArr5 = objArr3;
                                    i33 = 8;
                                }
                            }
                        } else if (i31 > i30) {
                            Object[] objArr6 = pVar3.f4772c;
                            long[] jArr2 = pVar3.f4770a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i38 = 0;
                                while (true) {
                                    long j10 = jArr2[i38];
                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i39 = 8 - ((~(i38 - length2)) >>> 31);
                                        int i40 = 0;
                                        while (i40 < i39) {
                                            if ((j10 & 255) < 128) {
                                                j0 j0Var4 = (j0) objArr6[(i38 << 3) + i40];
                                                objArr2 = objArr6;
                                                int i41 = j0Var4.f3756a;
                                                if (i41 == i30) {
                                                    j0Var4.f3756a = i31;
                                                    i12 = i30;
                                                } else {
                                                    i12 = i30;
                                                    if (i12 + 1 <= i41 && i41 < i31) {
                                                        j0Var4.f3756a = i41 - 1;
                                                    }
                                                }
                                            } else {
                                                i12 = i30;
                                                objArr2 = objArr6;
                                            }
                                            j10 >>= 8;
                                            i40++;
                                            objArr6 = objArr2;
                                            i30 = i12;
                                        }
                                        i11 = i30;
                                        objArr = objArr6;
                                        if (i39 != 8) {
                                            break;
                                        }
                                    } else {
                                        i11 = i30;
                                        objArr = objArr6;
                                    }
                                    if (i38 == length2) {
                                        break;
                                    }
                                    i38++;
                                    objArr6 = objArr;
                                    i30 = i11;
                                }
                            }
                        }
                        h0.b bVar = pVar2.L;
                        int i42 = bVar.f4594f;
                        p pVar4 = bVar.f4589a;
                        bVar.f4594f = (i29 - pVar4.F.f3964g) + i42;
                        pVar2.F.k(i29);
                        if (i32 > 0) {
                            bVar.d(false);
                            m0 m0Var = bVar.f4592d;
                            x1 x1Var3 = pVar4.F;
                            if (x1Var3.f3960c > 0) {
                                int i43 = x1Var3.f3966i;
                                int i44 = m0Var.f3793b;
                                if ((i44 > 0 ? m0Var.f3792a[i44 - 1] : i9) != i43) {
                                    if (!bVar.f4591c && bVar.f4593e) {
                                        bVar.d(false);
                                        bVar.f4590b.f4587g.Z(h0.l.f4622c);
                                        bVar.f4591c = z9;
                                    }
                                    if (i43 > 0) {
                                        c a3 = x1Var3.a(i43);
                                        m0Var.b(i43);
                                        bVar.d(false);
                                        h0.d0 d0Var2 = bVar.f4590b.f4587g;
                                        h0.k kVar = h0.k.f4621c;
                                        int i45 = kVar.f4605b;
                                        d0Var2.a0(kVar);
                                        j1.c.l0(d0Var2, 0, a3);
                                        int i46 = d0Var2.f4613m;
                                        int i47 = kVar.f4604a;
                                        z11 = z14;
                                        if (i46 != h0.d0.T(d0Var2, i47) || d0Var2.f4614n != h0.d0.T(d0Var2, i45)) {
                                            int i48 = 1;
                                            StringBuilder sb = new StringBuilder();
                                            int i49 = 0;
                                            int i50 = 0;
                                            while (i49 < i47) {
                                                if (((i48 << i49) & d0Var2.f4613m) != 0) {
                                                    if (i50 > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append(kVar.b(i49));
                                                    i50++;
                                                }
                                                i49++;
                                                i48 = 1;
                                            }
                                            String sb2 = sb.toString();
                                            StringBuilder o6 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                                            int i51 = 0;
                                            int i52 = 0;
                                            while (i51 < i45) {
                                                int i53 = i45;
                                                if (((1 << i51) & d0Var2.f4614n) != 0) {
                                                    if (i50 > 0) {
                                                        o6.append(", ");
                                                    }
                                                    o6.append(kVar.c(i51));
                                                    i52++;
                                                }
                                                i51++;
                                                i45 = i53;
                                            }
                                            String sb3 = o6.toString();
                                            r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                            sb4.append(kVar);
                                            sb4.append(". Not all arguments were provided. Missing ");
                                            a0.m.t(sb4, i50, " int arguments (", sb2, ") and ");
                                            a0.m.u(sb4, i52, " object arguments (", sb3, ").");
                                            throw th;
                                        }
                                        bVar.f4591c = true;
                                        d0Var = bVar.f4590b.f4587g;
                                        pVar = h0.p.f4630c;
                                        i13 = pVar.f4605b;
                                        d0Var.a0(pVar);
                                        j1.c.k0(d0Var, 0, i32);
                                        i14 = d0Var.f4613m;
                                        i15 = pVar.f4604a;
                                        if (i14 == h0.d0.T(d0Var, i15) || d0Var.f4614n != h0.d0.T(d0Var, i13)) {
                                            StringBuilder sb5 = new StringBuilder();
                                            i16 = 0;
                                            int i54 = 0;
                                            while (i16 < i15) {
                                                int i55 = i15;
                                                if ((d0Var.f4613m & (1 << i16)) != 0) {
                                                    if (i54 > 0) {
                                                        sb5.append(", ");
                                                    }
                                                    sb5.append(pVar.b(i16));
                                                    i54++;
                                                }
                                                i16++;
                                                i15 = i55;
                                            }
                                            String sb6 = sb5.toString();
                                            StringBuilder o8 = a0.m.o(sb6, "StringBuilder().apply(builderAction).toString()");
                                            i17 = 0;
                                            int i56 = 0;
                                            while (i17 < i13) {
                                                int i57 = i13;
                                                if (((1 << i17) & d0Var.f4614n) != 0) {
                                                    if (i54 > 0) {
                                                        o8.append(", ");
                                                    }
                                                    o8.append(pVar.c(i17));
                                                    i56++;
                                                }
                                                i17++;
                                                i13 = i57;
                                            }
                                            String sb7 = o8.toString();
                                            r6.k.e(sb7, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                            sb8.append(pVar);
                                            sb8.append(". Not all arguments were provided. Missing ");
                                            a0.m.t(sb8, i54, " int arguments (", sb6, ") and ");
                                            a0.m.u(sb8, i56, " object arguments (", sb7, ").");
                                            throw th;
                                        }
                                        z10 = z11;
                                    }
                                }
                            }
                            z11 = z14;
                            d0Var = bVar.f4590b.f4587g;
                            pVar = h0.p.f4630c;
                            i13 = pVar.f4605b;
                            d0Var.a0(pVar);
                            j1.c.k0(d0Var, 0, i32);
                            i14 = d0Var.f4613m;
                            i15 = pVar.f4604a;
                            if (i14 == h0.d0.T(d0Var, i15)) {
                            }
                            StringBuilder sb52 = new StringBuilder();
                            i16 = 0;
                            int i542 = 0;
                            while (i16 < i15) {
                            }
                            String sb62 = sb52.toString();
                            StringBuilder o82 = a0.m.o(sb62, "StringBuilder().apply(builderAction).toString()");
                            i17 = 0;
                            int i562 = 0;
                            while (i17 < i13) {
                            }
                            String sb72 = o82.toString();
                            r6.k.e(sb72, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb82 = new StringBuilder("Error while pushing ");
                            sb82.append(pVar);
                            sb82.append(". Not all arguments were provided. Missing ");
                            a0.m.t(sb82, i542, " int arguments (", sb62, ") and ");
                            a0.m.u(sb82, i562, " object arguments (", sb72, ").");
                            throw th;
                        }
                        z10 = z14;
                        pVar2 = this;
                        pVar2.P(obj2, z10);
                    } else {
                        z10 = z14;
                    }
                    j1Var2 = null;
                    pVar2.t(z10, j1Var2);
                    return;
                }
                z8 = z15;
                z9 = true;
                th = null;
                i9 = -2;
                j1Var = pVar2.f3828i;
                if (j1Var == null) {
                }
                j1Var2 = null;
                pVar2.t(z10, j1Var2);
                return;
            }
            rotateLeft = i19 ^ Integer.rotateLeft(Integer.rotateLeft(pVar2.P, 3) ^ i7, 3);
        }
        pVar2.P = rotateLeft;
        boolean z132 = true;
        if (obj3 == null) {
        }
        if (i8 == 0) {
        }
        if (!pVar2.O) {
        }
    }

    public final void N() {
        M(-127, 0, null, null);
    }

    public final void O(int i7, a1 a1Var) {
        M(i7, 0, a1Var, null);
    }

    public final void P(Object obj, boolean z8) {
        if (z8) {
            x1 x1Var = this.F;
            if (x1Var.f3968k <= 0) {
                if (d.m(x1Var.f3959b, x1Var.f3964g)) {
                    x1Var.n();
                    return;
                } else {
                    d.R("Expected a node group");
                    throw null;
                }
            }
            return;
        }
        if (obj != null && this.F.e() != obj) {
            h0.b bVar = this.L;
            bVar.getClass();
            bVar.d(false);
            h0.d0 d0Var = bVar.f4590b.f4587g;
            h0.y yVar = h0.y.f4639c;
            int i7 = yVar.f4605b;
            d0Var.a0(yVar);
            j1.c.l0(d0Var, 0, obj);
            int i8 = d0Var.f4613m;
            int i9 = yVar.f4604a;
            if (i8 != h0.d0.T(d0Var, i9) || d0Var.f4614n != h0.d0.T(d0Var, i7)) {
                StringBuilder sb = new StringBuilder();
                int i10 = 0;
                for (int i11 = 0; i11 < i9; i11++) {
                    if (((1 << i11) & d0Var.f4613m) != 0) {
                        if (i10 > 0) {
                            sb.append(", ");
                        }
                        sb.append(yVar.b(i11));
                        i10++;
                    }
                }
                String sb2 = sb.toString();
                StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                int i12 = 0;
                for (int i13 = 0; i13 < i7; i13++) {
                    if (((1 << i13) & d0Var.f4614n) != 0) {
                        if (i10 > 0) {
                            o2.append(", ");
                        }
                        o2.append(yVar.c(i13));
                        i12++;
                    }
                }
                String sb3 = o2.toString();
                r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                StringBuilder sb4 = new StringBuilder("Error while pushing ");
                sb4.append(yVar);
                sb4.append(". Not all arguments were provided. Missing ");
                a0.m.t(sb4, i10, " int arguments (", sb2, ") and ");
                a0.m.u(sb4, i12, " object arguments (", sb3, ").");
                throw null;
            }
        }
        this.F.n();
    }

    public final void Q(int i7) {
        int i8;
        int i9;
        if (this.f3828i != null) {
            M(i7, 0, null, null);
            return;
        }
        if (this.f3836q) {
            d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        this.P = this.f3831l ^ Integer.rotateLeft(Integer.rotateLeft(this.P, 3) ^ i7, 3);
        this.f3831l++;
        x1 x1Var = this.F;
        boolean z8 = this.O;
        t0 t0Var = l.f3784a;
        if (z8) {
            x1Var.f3968k++;
            this.H.H(i7, t0Var, t0Var, false);
            t(false, null);
            return;
        }
        if (x1Var.f() == i7 && ((i9 = x1Var.f3964g) >= x1Var.f3965h || !d.l(x1Var.f3959b, i9))) {
            x1Var.n();
            t(false, null);
            return;
        }
        if (x1Var.f3968k <= 0 && (i8 = x1Var.f3964g) != x1Var.f3965h) {
            int i10 = this.f3829j;
            D();
            this.L.e(i10, x1Var.l());
            d.q(this.f3837r, i8, x1Var.f3964g);
        }
        x1Var.f3968k++;
        this.O = true;
        this.J = null;
        if (this.H.f3686w) {
            a2 w4 = this.G.w();
            this.H = w4;
            w4.D();
            this.I = false;
            this.J = null;
        }
        a2 a2Var = this.H;
        a2Var.d();
        int i11 = a2Var.f3683t;
        a2Var.H(i7, t0Var, t0Var, false);
        this.M = a2Var.b(i11);
        t(false, null);
    }

    public final void R(int i7) {
        M(i7, 0, null, null);
    }

    public final p S(int i7) {
        p1 p1Var;
        Q(i7);
        boolean z8 = this.O;
        f1.g gVar = this.D;
        u uVar = this.f3826g;
        if (z8) {
            p1 p1Var2 = new p1(uVar);
            gVar.f3153f.add(p1Var2);
            b0(p1Var2);
            p1Var2.f3854e = this.A;
            p1Var2.f3850a &= -17;
            return this;
        }
        int i8 = this.F.f3966i;
        ArrayList arrayList = this.f3837r;
        int D = d.D(i8, arrayList);
        n0 n0Var = D >= 0 ? (n0) arrayList.remove(D) : null;
        Object h3 = this.F.h();
        if (r6.k.a(h3, l.f3784a)) {
            p1Var = new p1(uVar);
            b0(p1Var);
        } else {
            r6.k.d(h3, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            p1Var = (p1) h3;
        }
        if (n0Var == null) {
            int i9 = p1Var.f3850a;
            boolean z9 = (i9 & 64) != 0;
            if (z9) {
                p1Var.f3850a = i9 & (-65);
            }
            if (!z9) {
                p1Var.f3850a &= -9;
                gVar.f3153f.add(p1Var);
                p1Var.f3854e = this.A;
                p1Var.f3850a &= -17;
                return this;
            }
        }
        p1Var.f3850a |= 8;
        gVar.f3153f.add(p1Var);
        p1Var.f3854e = this.A;
        p1Var.f3850a &= -17;
        return this;
    }

    public final void T(Object obj) {
        if (!this.O && this.F.f() == 207 && !r6.k.a(this.F.e(), obj) && this.f3844y < 0) {
            this.f3844y = this.F.f3964g;
            this.f3843x = true;
        }
        M(207, 0, null, obj);
    }

    public final void U() {
        M(125, 2, null, null);
        this.f3836q = true;
    }

    public final void V() {
        this.f3831l = 0;
        y1 y1Var = this.f3822c;
        this.F = y1Var.m();
        M(100, 0, null, null);
        r rVar = this.f3821b;
        rVar.m();
        this.f3839t = rVar.f();
        this.f3842w.b(this.f3841v ? 1 : 0);
        this.f3841v = f(this.f3839t);
        this.J = null;
        if (!this.f3835p) {
            this.f3835p = rVar.d();
        }
        if (!this.B) {
            this.B = rVar.e();
        }
        Set set = (Set) d.K(this.f3839t, r0.b.f7699a);
        if (set != null) {
            set.add(y1Var);
            rVar.j(set);
        }
        M(rVar.g(), 0, null, null);
    }

    public final boolean W(p1 p1Var, Object obj) {
        c cVar = p1Var.f3852c;
        if (cVar == null) {
            return false;
        }
        int a3 = this.F.f3958a.a(cVar);
        if (!this.E || a3 < this.F.f3964g) {
            return false;
        }
        ArrayList arrayList = this.f3837r;
        int D = d.D(a3, arrayList);
        if (D < 0) {
            int i7 = -(D + 1);
            if (!(obj instanceof e0)) {
                obj = null;
            }
            arrayList.add(i7, new n0(p1Var, a3, obj));
            return true;
        }
        n0 n0Var = (n0) arrayList.get(D);
        if (!(obj instanceof e0)) {
            n0Var.f3804c = null;
            return true;
        }
        Object obj2 = n0Var.f3804c;
        if (obj2 == null) {
            n0Var.f3804c = obj;
            return true;
        }
        if (obj2 instanceof i.b0) {
            ((i.b0) obj2).a(obj);
            return true;
        }
        int i8 = i.f0.f4740a;
        i.b0 b0Var = new i.b0(2);
        b0Var.f4722b[b0Var.d(obj2)] = obj2;
        b0Var.f4722b[b0Var.d(obj)] = obj;
        n0Var.f3804c = b0Var;
        return true;
    }

    public final void X(int i7, int i8) {
        if (c0(i7) != i8) {
            if (i7 < 0) {
                i.n nVar = this.f3834o;
                if (nVar == null) {
                    nVar = new i.n();
                    this.f3834o = nVar;
                }
                nVar.f(i7, i8);
                return;
            }
            int[] iArr = this.f3833n;
            if (iArr == null) {
                int i9 = this.F.f3960c;
                int[] iArr2 = new int[i9];
                Arrays.fill(iArr2, 0, i9, -1);
                this.f3833n = iArr2;
                iArr = iArr2;
            }
            iArr[i7] = i8;
        }
    }

    public final void Y(int i7, int i8) {
        int c02 = c0(i7);
        if (c02 != i8) {
            int i9 = i8 - c02;
            f1.g gVar = this.f3827h;
            int size = gVar.f3153f.size() - 1;
            while (i7 != -1) {
                int c03 = c0(i7) + i9;
                X(i7, c03);
                int i10 = size;
                while (true) {
                    if (-1 < i10) {
                        j1 j1Var = (j1) gVar.f3153f.get(i10);
                        if (j1Var != null && j1Var.a(i7, c03)) {
                            size = i10 - 1;
                            break;
                        }
                        i10--;
                    } else {
                        break;
                    }
                }
                if (i7 < 0) {
                    i7 = this.F.f3966i;
                } else if (d.m(this.F.f3959b, i7)) {
                    return;
                } else {
                    i7 = d.p(this.F.f3959b, i7);
                }
            }
        }
    }

    public final o0.d Z(k1 k1Var, o0.d dVar) {
        o0.d dVar2 = (o0.d) k1Var;
        dVar2.getClass();
        o0.c cVar = new o0.c(dVar2);
        cVar.putAll(dVar);
        o0.d a3 = cVar.a();
        O(204, d.f3703d);
        z();
        b0(a3);
        z();
        b0(dVar);
        p(false);
        return a3;
    }

    public final void a() {
        i();
        this.f3827h.f3153f.clear();
        this.f3832m.f3793b = 0;
        this.f3838s.f3793b = 0;
        this.f3842w.f3793b = 0;
        this.f3840u = null;
        h0.c cVar = this.N;
        cVar.f4603h.U();
        cVar.f4602g.U();
        this.P = 0;
        this.f3845z = 0;
        this.f3836q = false;
        this.O = false;
        this.f3843x = false;
        this.E = false;
        this.f3844y = -1;
        x1 x1Var = this.F;
        if (!x1Var.f3963f) {
            x1Var.c();
        }
        if (this.H.f3686w) {
            return;
        }
        u();
    }

    public final void a0(Object obj) {
        int i7;
        x1 x1Var;
        int i8;
        a2 a2Var;
        if (obj instanceof u1) {
            c cVar = null;
            if (this.O) {
                h0.d0 d0Var = this.L.f4590b.f4587g;
                h0.r rVar = h0.r.f4632c;
                int i9 = rVar.f4605b;
                d0Var.a0(rVar);
                j1.c.l0(d0Var, 0, (u1) obj);
                int i10 = d0Var.f4613m;
                int i11 = rVar.f4604a;
                if (i10 != h0.d0.T(d0Var, i11) || d0Var.f4614n != h0.d0.T(d0Var, i9)) {
                    StringBuilder sb = new StringBuilder();
                    int i12 = 0;
                    for (int i13 = 0; i13 < i11; i13++) {
                        if (((1 << i13) & d0Var.f4613m) != 0) {
                            if (i12 > 0) {
                                sb.append(", ");
                            }
                            sb.append(rVar.b(i13));
                            i12++;
                        }
                    }
                    String sb2 = sb.toString();
                    StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                    int i14 = 0;
                    for (int i15 = 0; i15 < i9; i15++) {
                        if (((1 << i15) & d0Var.f4614n) != 0) {
                            if (i12 > 0) {
                                o2.append(", ");
                            }
                            o2.append(rVar.c(i15));
                            i14++;
                        }
                    }
                    String sb3 = o2.toString();
                    r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                    StringBuilder sb4 = new StringBuilder("Error while pushing ");
                    sb4.append(rVar);
                    sb4.append(". Not all arguments were provided. Missing ");
                    a0.m.t(sb4, i12, " int arguments (", sb2, ") and ");
                    a0.m.u(sb4, i14, " object arguments (", sb3, ").");
                    throw null;
                }
            }
            this.f3823d.add(obj);
            u1 u1Var = (u1) obj;
            if (this.O) {
                a2 a2Var2 = this.H;
                int i16 = a2Var2.f3683t;
                if (i16 > a2Var2.f3685v + 1) {
                    int i17 = i16 - 1;
                    int x8 = a2Var2.x(a2Var2.f3665b, i17);
                    while (true) {
                        i8 = i17;
                        i17 = x8;
                        a2Var = this.H;
                        if (i17 == a2Var.f3685v || i17 < 0) {
                            break;
                        } else {
                            x8 = a2Var.x(a2Var.f3665b, i17);
                        }
                    }
                    cVar = a2Var.b(i8);
                }
            } else {
                x1 x1Var2 = this.F;
                int i18 = x1Var2.f3964g;
                if (i18 > x1Var2.f3966i + 1) {
                    int i19 = i18 - 1;
                    int i20 = x1Var2.f3959b[(i19 * 5) + 2];
                    while (true) {
                        i7 = i19;
                        i19 = i20;
                        x1Var = this.F;
                        if (i19 == x1Var.f3966i || i19 < 0) {
                            break;
                        } else {
                            i20 = x1Var.f3959b[(i19 * 5) + 2];
                        }
                    }
                    cVar = x1Var.a(i7);
                }
            }
            v1 v1Var = new v1();
            v1Var.f3952a = u1Var;
            v1Var.f3953b = cVar;
            obj = v1Var;
        }
        b0(obj);
    }

    public final void b(Object obj, q6.e eVar) {
        int i7 = 0;
        if (this.O) {
            h0.d0 d0Var = this.N.f4602g;
            h0.z zVar = h0.z.f4640c;
            int i8 = zVar.f4605b;
            d0Var.a0(zVar);
            j1.c.l0(d0Var, 0, obj);
            r6.k.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
            r6.y.d(2, eVar);
            j1.c.l0(d0Var, 1, eVar);
            int i9 = d0Var.f4613m;
            int i10 = zVar.f4604a;
            if (i9 == h0.d0.T(d0Var, i10) && d0Var.f4614n == h0.d0.T(d0Var, i8)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i11 = 0;
            while (i11 < i10) {
                int i12 = i10;
                if (((1 << i11) & d0Var.f4613m) != 0) {
                    if (i7 > 0) {
                        sb.append(", ");
                    }
                    sb.append(zVar.b(i11));
                    i7++;
                }
                i11++;
                i10 = i12;
            }
            String sb2 = sb.toString();
            StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
            int i13 = 0;
            int i14 = 0;
            while (i14 < i8) {
                int i15 = i8;
                if (((1 << i14) & d0Var.f4614n) != 0) {
                    if (i7 > 0) {
                        o2.append(", ");
                    }
                    o2.append(zVar.c(i14));
                    i13++;
                }
                i14++;
                i8 = i15;
            }
            String sb3 = o2.toString();
            r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(zVar);
            sb4.append(". Not all arguments were provided. Missing ");
            a0.m.t(sb4, i7, " int arguments (", sb2, ") and ");
            a0.m.u(sb4, i13, " object arguments (", sb3, ").");
            throw null;
        }
        h0.b bVar = this.L;
        bVar.b();
        h0.d0 d0Var2 = bVar.f4590b.f4587g;
        h0.z zVar2 = h0.z.f4640c;
        int i16 = zVar2.f4605b;
        d0Var2.a0(zVar2);
        int i17 = 0;
        j1.c.l0(d0Var2, 0, obj);
        r6.k.d(eVar, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function2<kotlin.Any?, kotlin.Any?, kotlin.Unit>");
        r6.y.d(2, eVar);
        j1.c.l0(d0Var2, 1, eVar);
        int i18 = d0Var2.f4613m;
        int i19 = zVar2.f4604a;
        if (i18 == h0.d0.T(d0Var2, i19) && d0Var2.f4614n == h0.d0.T(d0Var2, i16)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        for (int i20 = 0; i20 < i19; i20++) {
            if (((1 << i20) & d0Var2.f4613m) != 0) {
                if (i17 > 0) {
                    sb5.append(", ");
                }
                sb5.append(zVar2.b(i20));
                i17++;
            }
        }
        String sb6 = sb5.toString();
        StringBuilder o6 = a0.m.o(sb6, "StringBuilder().apply(builderAction).toString()");
        int i21 = 0;
        int i22 = 0;
        while (i21 < i16) {
            int i23 = i16;
            if (((1 << i21) & d0Var2.f4614n) != 0) {
                if (i17 > 0) {
                    o6.append(", ");
                }
                o6.append(zVar2.c(i21));
                i22++;
            }
            i21++;
            i16 = i23;
        }
        String sb7 = o6.toString();
        r6.k.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(zVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        a0.m.t(sb8, i17, " int arguments (", sb6, ") and ");
        a0.m.u(sb8, i22, " object arguments (", sb7, ").");
        throw null;
    }

    public final void b0(Object obj) {
        int i7;
        int i8;
        int i9;
        if (this.O) {
            a2 a2Var = this.H;
            if (a2Var.f3677n <= 0 || a2Var.f3672i == a2Var.f3674k) {
                a2Var.y(obj);
                return;
            }
            i.p pVar = a2Var.f3682s;
            if (pVar == null) {
                pVar = new i.p();
            }
            a2Var.f3682s = pVar;
            int i10 = a2Var.f3685v;
            Object f9 = pVar.f(i10);
            if (f9 == null) {
                f9 = new i.v();
                pVar.i(i10, f9);
            }
            ((i.v) f9).a(obj);
            return;
        }
        x1 x1Var = this.F;
        boolean z8 = x1Var.f3971n;
        h0.b bVar = this.L;
        if (!z8) {
            c a3 = x1Var.a(x1Var.f3966i);
            h0.d0 d0Var = bVar.f4590b.f4587g;
            h0.e eVar = h0.e.f4615c;
            int i11 = eVar.f4605b;
            d0Var.a0(eVar);
            j1.c.l0(d0Var, 0, a3);
            j1.c.l0(d0Var, 1, obj);
            int i12 = d0Var.f4613m;
            int i13 = eVar.f4604a;
            if (i12 == h0.d0.T(d0Var, i13) && d0Var.f4614n == h0.d0.T(d0Var, i11)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            int i14 = 0;
            for (int i15 = 0; i15 < i13; i15++) {
                if (((1 << i15) & d0Var.f4613m) != 0) {
                    if (i14 > 0) {
                        sb.append(", ");
                    }
                    sb.append(eVar.b(i15));
                    i14++;
                }
            }
            String sb2 = sb.toString();
            StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
            int i16 = 0;
            int i17 = 0;
            while (i17 < i11) {
                int i18 = i11;
                if (((1 << i17) & d0Var.f4614n) != 0) {
                    if (i14 > 0) {
                        o2.append(", ");
                    }
                    o2.append(eVar.c(i17));
                    i16++;
                }
                i17++;
                i11 = i18;
            }
            String sb3 = o2.toString();
            r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(eVar);
            sb4.append(". Not all arguments were provided. Missing ");
            a0.m.t(sb4, i14, " int arguments (", sb2, ") and ");
            a0.m.u(sb4, i16, " object arguments (", sb3, ").");
            throw null;
        }
        int r8 = (x1Var.f3969l - d.r(x1Var.f3959b, x1Var.f3966i)) - 1;
        if (bVar.f4589a.F.f3966i - bVar.f4594f >= 0) {
            bVar.d(true);
            h0.d0 d0Var2 = bVar.f4590b.f4587g;
            h0.m mVar = h0.m.f4626g;
            d0Var2.a0(mVar);
            j1.c.l0(d0Var2, 0, obj);
            j1.c.k0(d0Var2, 0, r8);
            if (d0Var2.f4613m == h0.d0.T(d0Var2, 1) && d0Var2.f4614n == h0.d0.T(d0Var2, 1)) {
                return;
            }
            StringBuilder sb5 = new StringBuilder();
            if ((d0Var2.f4613m & 1) != 0) {
                sb5.append(mVar.b(0));
                i7 = 1;
            } else {
                i7 = 0;
            }
            String sb6 = sb5.toString();
            StringBuilder o6 = a0.m.o(sb6, "StringBuilder().apply(builderAction).toString()");
            if ((d0Var2.f4614n & 1) != 0) {
                if (i7 > 0) {
                    o6.append(", ");
                }
                o6.append(mVar.c(0));
                i8 = 1;
            } else {
                i8 = 0;
            }
            String sb7 = o6.toString();
            r6.k.e(sb7, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb8 = new StringBuilder("Error while pushing ");
            sb8.append(mVar);
            sb8.append(". Not all arguments were provided. Missing ");
            a0.m.t(sb8, i7, " int arguments (", sb6, ") and ");
            a0.m.u(sb8, i8, " object arguments (", sb7, ").");
            throw null;
        }
        x1 x1Var2 = this.F;
        c a9 = x1Var2.a(x1Var2.f3966i);
        h0.d0 d0Var3 = bVar.f4590b.f4587g;
        h0.m mVar2 = h0.m.f4625f;
        d0Var3.a0(mVar2);
        j1.c.l0(d0Var3, 0, obj);
        j1.c.l0(d0Var3, 1, a9);
        j1.c.k0(d0Var3, 0, r8);
        if (d0Var3.f4613m == h0.d0.T(d0Var3, 1) && d0Var3.f4614n == h0.d0.T(d0Var3, 2)) {
            return;
        }
        StringBuilder sb9 = new StringBuilder();
        if ((d0Var3.f4613m & 1) != 0) {
            sb9.append(mVar2.b(0));
            i9 = 1;
        } else {
            i9 = 0;
        }
        String sb10 = sb9.toString();
        StringBuilder o8 = a0.m.o(sb10, "StringBuilder().apply(builderAction).toString()");
        int i19 = 0;
        int i20 = 0;
        for (int i21 = 2; i20 < i21; i21 = 2) {
            if (((1 << i20) & d0Var3.f4614n) != 0) {
                if (i9 > 0) {
                    o8.append(", ");
                }
                o8.append(mVar2.c(i20));
                i19++;
            }
            i20++;
        }
        String sb11 = o8.toString();
        r6.k.e(sb11, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb12 = new StringBuilder("Error while pushing ");
        sb12.append(mVar2);
        sb12.append(". Not all arguments were provided. Missing ");
        a0.m.t(sb12, i9, " int arguments (", sb10, ") and ");
        a0.m.u(sb12, i19, " object arguments (", sb11, ").");
        throw null;
    }

    public final boolean c(float f9) {
        Object z8 = z();
        if ((z8 instanceof Float) && f9 == ((Number) z8).floatValue()) {
            return false;
        }
        b0(Float.valueOf(f9));
        return true;
    }

    public final int c0(int i7) {
        int i8;
        if (i7 >= 0) {
            int[] iArr = this.f3833n;
            return (iArr == null || (i8 = iArr[i7]) < 0) ? d.o(this.F.f3959b, i7) : i8;
        }
        i.n nVar = this.f3834o;
        if (nVar == null || nVar.c(i7) < 0) {
            return 0;
        }
        return nVar.d(i7);
    }

    public final boolean d(int i7) {
        Object z8 = z();
        if ((z8 instanceof Integer) && i7 == ((Number) z8).intValue()) {
            return false;
        }
        b0(Integer.valueOf(i7));
        return true;
    }

    public final void d0() {
        if (!this.f3836q) {
            d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f3836q = false;
        if (this.O) {
            d.w("useNode() called while inserting");
            throw null;
        }
        x1 x1Var = this.F;
        Object i7 = x1Var.i(x1Var.f3966i);
        h0.b bVar = this.L;
        bVar.c();
        bVar.f4596h.f3153f.add(i7);
        if (this.f3843x && (i7 instanceof j)) {
            bVar.b();
            bVar.f4590b.f4587g.Z(h0.b0.f4601c);
        }
    }

    public final boolean e(long j8) {
        Object z8 = z();
        if ((z8 instanceof Long) && j8 == ((Number) z8).longValue()) {
            return false;
        }
        b0(Long.valueOf(j8));
        return true;
    }

    public final boolean f(Object obj) {
        if (r6.k.a(z(), obj)) {
            return false;
        }
        b0(obj);
        return true;
    }

    public final boolean g(boolean z8) {
        Object z9 = z();
        if ((z9 instanceof Boolean) && z8 == ((Boolean) z9).booleanValue()) {
            return false;
        }
        b0(Boolean.valueOf(z8));
        return true;
    }

    public final boolean h(Object obj) {
        if (z() == obj) {
            return false;
        }
        b0(obj);
        return true;
    }

    public final void i() {
        this.f3828i = null;
        this.f3829j = 0;
        this.f3830k = 0;
        this.P = 0;
        this.f3836q = false;
        h0.b bVar = this.L;
        bVar.f4591c = false;
        bVar.f4592d.f3793b = 0;
        bVar.f4594f = 0;
        this.D.f3153f.clear();
        this.f3833n = null;
        this.f3834o = null;
    }

    public final int j(int i7, int i8, int i9, int i10) {
        int hashCode;
        Object b9;
        if (i7 == i9) {
            return i10;
        }
        x1 x1Var = this.F;
        int[] iArr = x1Var.f3959b;
        if (d.l(iArr, i7)) {
            Object j8 = x1Var.j(iArr, i7);
            hashCode = j8 != null ? j8 instanceof Enum ? ((Enum) j8).ordinal() : j8.hashCode() : 0;
        } else {
            int i11 = x1Var.f3959b[i7 * 5];
            hashCode = (i11 != 207 || (b9 = x1Var.b(iArr, i7)) == null || b9.equals(l.f3784a)) ? i11 : b9.hashCode();
        }
        if (hashCode == 126665345) {
            return hashCode;
        }
        int i12 = this.F.f3959b[(i7 * 5) + 2];
        if (i12 != i9) {
            i10 = j(i12, A(i12), i9, i10);
        }
        if (d.l(this.F.f3959b, i7)) {
            i8 = 0;
        }
        return Integer.rotateLeft(Integer.rotateLeft(i10, 3) ^ hashCode, 3) ^ i8;
    }

    public final Object k(m1 m1Var) {
        return d.K(m(), m1Var);
    }

    public final void l(q6.a aVar) {
        int i7;
        int i8;
        int i9;
        int i10;
        if (!this.f3836q) {
            d.w("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw null;
        }
        this.f3836q = false;
        if (!this.O) {
            d.w("createNode() can only be called when inserting");
            throw null;
        }
        m0 m0Var = this.f3832m;
        int i11 = m0Var.f3792a[m0Var.f3793b - 1];
        a2 a2Var = this.H;
        c b9 = a2Var.b(a2Var.f3685v);
        this.f3830k++;
        h0.c cVar = this.N;
        h0.d0 d0Var = cVar.f4602g;
        h0.m mVar = h0.m.f4623d;
        d0Var.a0(mVar);
        j1.c.l0(d0Var, 0, aVar);
        j1.c.k0(d0Var, 0, i11);
        j1.c.l0(d0Var, 1, b9);
        if (d0Var.f4613m != h0.d0.T(d0Var, 1) || d0Var.f4614n != h0.d0.T(d0Var, 2)) {
            StringBuilder sb = new StringBuilder();
            if ((1 & d0Var.f4613m) != 0) {
                i7 = 0;
                sb.append(mVar.b(0));
                i8 = 1;
            } else {
                i7 = 0;
                i8 = 0;
            }
            String sb2 = sb.toString();
            StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
            int i12 = i7;
            while (i7 < 2) {
                if (((1 << i7) & d0Var.f4614n) != 0) {
                    if (i8 > 0) {
                        o2.append(", ");
                    }
                    o2.append(mVar.c(i7));
                    i12++;
                }
                i7++;
            }
            String sb3 = o2.toString();
            r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
            StringBuilder sb4 = new StringBuilder("Error while pushing ");
            sb4.append(mVar);
            sb4.append(". Not all arguments were provided. Missing ");
            a0.m.t(sb4, i8, " int arguments (", sb2, ") and ");
            a0.m.u(sb4, i12, " object arguments (", sb3, ").");
            throw null;
        }
        h0.d0 d0Var2 = cVar.f4603h;
        h0.m mVar2 = h0.m.f4624e;
        d0Var2.a0(mVar2);
        j1.c.k0(d0Var2, 0, i11);
        j1.c.l0(d0Var2, 0, b9);
        if (d0Var2.f4613m == h0.d0.T(d0Var2, 1) && d0Var2.f4614n == h0.d0.T(d0Var2, 1)) {
            return;
        }
        StringBuilder sb5 = new StringBuilder();
        if ((d0Var2.f4613m & 1) != 0) {
            sb5.append(mVar2.b(0));
            i9 = 1;
        } else {
            i9 = 0;
        }
        String sb6 = sb5.toString();
        StringBuilder o6 = a0.m.o(sb6, "StringBuilder().apply(builderAction).toString()");
        if ((d0Var2.f4614n & 1) != 0) {
            if (i9 > 0) {
                o6.append(", ");
            }
            o6.append(mVar2.c(0));
            i10 = 1;
        } else {
            i10 = 0;
        }
        String sb7 = o6.toString();
        r6.k.e(sb7, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb8 = new StringBuilder("Error while pushing ");
        sb8.append(mVar2);
        sb8.append(". Not all arguments were provided. Missing ");
        a0.m.t(sb8, i9, " int arguments (", sb6, ") and ");
        a0.m.u(sb8, i10, " object arguments (", sb7, ").");
        throw null;
    }

    public final k1 m() {
        k1 k1Var;
        Object obj;
        Object obj2;
        int i7;
        k1 k1Var2 = this.J;
        if (k1Var2 != null) {
            return k1Var2;
        }
        int i8 = this.F.f3966i;
        a1 a1Var = d.f3702c;
        if (this.O && this.I) {
            int i9 = this.H.f3685v;
            while (i9 > 0) {
                a2 a2Var = this.H;
                if (a2Var.f3665b[a2Var.p(i9) * 5] == 202) {
                    a2 a2Var2 = this.H;
                    int p6 = a2Var2.p(i9);
                    int i10 = 0;
                    if (d.l(a2Var2.f3665b, p6)) {
                        Object[] objArr = a2Var2.f3666c;
                        int[] iArr = a2Var2.f3665b;
                        int i11 = p6 * 5;
                        int i12 = iArr[i11 + 4];
                        switch (iArr[i11 + 1] >> 30) {
                            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                i7 = 0;
                                break;
                            case 1:
                            case 2:
                            case 4:
                                i7 = 1;
                                break;
                            case 3:
                            case 5:
                            case 6:
                                i7 = 2;
                                break;
                            default:
                                i7 = 3;
                                break;
                        }
                        obj = objArr[i7 + i12];
                    } else {
                        obj = null;
                    }
                    if (r6.k.a(obj, a1Var)) {
                        a2 a2Var3 = this.H;
                        int p8 = a2Var3.p(i9);
                        if (d.k(a2Var3.f3665b, p8)) {
                            Object[] objArr2 = a2Var3.f3666c;
                            int[] iArr2 = a2Var3.f3665b;
                            int f9 = a2Var3.f(iArr2, p8);
                            switch (iArr2[(p8 * 5) + 1] >> 29) {
                                case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                                    break;
                                case 1:
                                case 2:
                                case 4:
                                    i10 = 1;
                                    break;
                                case 3:
                                case 5:
                                case 6:
                                    i10 = 2;
                                    break;
                                default:
                                    i10 = 3;
                                    break;
                            }
                            obj2 = objArr2[i10 + f9];
                        } else {
                            obj2 = l.f3784a;
                        }
                        r6.k.d(obj2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        k1 k1Var3 = (k1) obj2;
                        this.J = k1Var3;
                        return k1Var3;
                    }
                }
                a2 a2Var4 = this.H;
                i9 = a2Var4.x(a2Var4.f3665b, i9);
            }
        }
        if (this.F.f3960c > 0) {
            while (i8 > 0) {
                x1 x1Var = this.F;
                int[] iArr3 = x1Var.f3959b;
                int i13 = i8 * 5;
                if (iArr3[i13] == 202 && r6.k.a(x1Var.j(iArr3, i8), a1Var)) {
                    b6.c cVar = this.f3840u;
                    if (cVar == null || (k1Var = (k1) ((SparseArray) cVar.f1394g).get(i8)) == null) {
                        x1 x1Var2 = this.F;
                        Object b9 = x1Var2.b(x1Var2.f3959b, i8);
                        r6.k.d(b9, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
                        k1Var = (k1) b9;
                    }
                    this.J = k1Var;
                    return k1Var;
                }
                i8 = this.F.f3959b[i13 + 2];
            }
        }
        k1 k1Var4 = this.f3839t;
        this.J = k1Var4;
        return k1Var4;
    }

    public final void n(b6.c cVar, o0.a aVar) {
        long[] jArr;
        Object obj;
        long[] jArr2;
        int i7;
        a1 a1Var = d.f3700a;
        Object obj2 = null;
        if (this.E) {
            d.w("Reentrant composition is not supported");
            throw null;
        }
        Trace.beginSection("Compose:recompose");
        try {
            this.A = q0.n.k().d();
            this.f3840u = null;
            i.x xVar = (i.x) cVar.f1394g;
            Object[] objArr = xVar.f4813b;
            Object[] objArr2 = xVar.f4814c;
            long[] jArr3 = xVar.f4812a;
            int length = jArr3.length - 2;
            ArrayList arrayList = this.f3837r;
            if (length >= 0) {
                int i8 = 0;
                while (true) {
                    long j8 = jArr3[i8];
                    if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i9 = 8;
                        int i10 = 8 - ((~(i8 - length)) >>> 31);
                        obj = obj2;
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j8 & 255) < 128) {
                                int i12 = (i8 << 3) + i11;
                                Object obj3 = objArr[i12];
                                Object obj4 = objArr2[i12];
                                i7 = i9;
                                r6.k.d(obj3, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
                                c cVar2 = ((p1) obj3).f3852c;
                                if (cVar2 != null) {
                                    int i13 = cVar2.f3695a;
                                    p1 p1Var = (p1) obj3;
                                    jArr2 = jArr3;
                                    if (obj4 == t0.f3902j) {
                                        obj4 = obj;
                                    }
                                    arrayList.add(new n0(p1Var, i13, obj4));
                                } else {
                                    jArr2 = jArr3;
                                }
                            } else {
                                jArr2 = jArr3;
                                i7 = i9;
                            }
                            j8 >>= i7;
                            i11++;
                            i9 = i7;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        if (i10 != i9) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        obj = obj2;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    obj2 = obj;
                    jArr3 = jArr;
                }
            }
            e6.q.b0(arrayList, d.f3705f);
            this.f3829j = 0;
            this.E = true;
            try {
                V();
                Object z8 = z();
                if (z8 != aVar && aVar != null) {
                    b0(aVar);
                }
                o oVar = this.C;
                i0.d B = d.B();
                try {
                    B.b(oVar);
                    if (aVar != null) {
                        O(200, a1Var);
                        d.F(this, aVar);
                        p(false);
                    } else if (!this.f3841v || z8 == null || z8.equals(l.f3784a)) {
                        J();
                    } else {
                        O(200, a1Var);
                        r6.y.d(2, z8);
                        d.F(this, (q6.e) z8);
                        p(false);
                    }
                    B.o(B.f4842h - 1);
                    s();
                    this.E = false;
                    arrayList.clear();
                    d.O(this.H.f3686w);
                    u();
                    Trace.endSection();
                } finally {
                    B.o(B.f4842h - 1);
                }
            } catch (Throwable th) {
                this.E = false;
                arrayList.clear();
                a();
                d.O(this.H.f3686w);
                u();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    public final void o(int i7, int i8) {
        if (i7 <= 0 || i7 == i8) {
            return;
        }
        o(this.F.f3959b[(i7 * 5) + 2], i8);
        if (d.m(this.F.f3959b, i7)) {
            Object i9 = this.F.i(i7);
            h0.b bVar = this.L;
            bVar.c();
            bVar.f4596h.f3153f.add(i9);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0618  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x079d  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0806  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x0923  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x094d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void p(boolean z8) {
        int hashCode;
        m0 m0Var;
        int i7;
        int i8;
        Throwable th;
        int i9;
        x1 x1Var;
        boolean z9;
        boolean z10;
        int i10;
        p pVar;
        h0.d0 d0Var;
        h0.x xVar;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        j1 j1Var;
        int i16;
        int i17;
        int i18;
        y1 y1Var;
        h0.c cVar;
        h0.d0 d0Var2;
        h0.o oVar;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        p pVar2;
        y1 y1Var2;
        h0.d0 d0Var3;
        h0.n nVar;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        m0 m0Var2;
        int i30;
        int i31;
        j1 j1Var2;
        HashSet hashSet;
        int i32;
        int i33;
        int i34;
        ArrayList arrayList;
        int i35;
        LinkedHashSet linkedHashSet;
        int i36;
        int i37;
        Object[] objArr;
        int i38;
        int i39;
        Object[] objArr2;
        long[] jArr;
        long j8;
        long[] jArr2;
        Object obj;
        Object obj2;
        int hashCode2;
        int i40;
        int i41;
        m0 m0Var3 = this.f3832m;
        int i42 = 2;
        int i43 = m0Var3.f3792a[m0Var3.f3793b - 2] - 1;
        boolean z11 = this.O;
        t0 t0Var = l.f3784a;
        if (z11) {
            a2 a2Var = this.H;
            int i44 = a2Var.f3685v;
            int i45 = a2Var.f3665b[a2Var.p(i44) * 5];
            a2 a2Var2 = this.H;
            int p6 = a2Var2.p(i44);
            if (d.l(a2Var2.f3665b, p6)) {
                Object[] objArr3 = a2Var2.f3666c;
                int[] iArr = a2Var2.f3665b;
                int i46 = p6 * 5;
                int i47 = iArr[i46 + 4];
                switch (iArr[i46 + 1] >> 30) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        i41 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i41 = 1;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i41 = 2;
                        break;
                    default:
                        i41 = 3;
                        break;
                }
                obj = objArr3[i41 + i47];
            } else {
                obj = null;
            }
            a2 a2Var3 = this.H;
            int p8 = a2Var3.p(i44);
            if (d.k(a2Var3.f3665b, p8)) {
                Object[] objArr4 = a2Var3.f3666c;
                int[] iArr2 = a2Var3.f3665b;
                int f9 = a2Var3.f(iArr2, p8);
                switch (iArr2[(p8 * 5) + 1] >> 29) {
                    case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                        i40 = 0;
                        break;
                    case 1:
                    case 2:
                    case 4:
                        i40 = 1;
                        break;
                    case 3:
                    case 5:
                    case 6:
                        i40 = 2;
                        break;
                    default:
                        i40 = 3;
                        break;
                }
                obj2 = objArr4[i40 + f9];
            } else {
                obj2 = t0Var;
            }
            if (obj != null) {
                hashCode2 = Integer.hashCode(obj instanceof Enum ? ((Enum) obj).ordinal() : obj.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (obj2 == null || i45 != 207 || obj2.equals(t0Var)) {
                hashCode2 = Integer.rotateRight(i43 ^ this.P, 3) ^ Integer.hashCode(i45);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i43 ^ this.P, 3) ^ Integer.hashCode(obj2.hashCode()), 3);
            }
            this.P = Integer.rotateRight(hashCode2, 3);
        } else {
            x1 x1Var2 = this.F;
            int i48 = x1Var2.f3966i;
            int[] iArr3 = x1Var2.f3959b;
            int i49 = iArr3[i48 * 5];
            Object j9 = x1Var2.j(iArr3, i48);
            x1 x1Var3 = this.F;
            Object b9 = x1Var3.b(x1Var3.f3959b, i48);
            if (j9 != null) {
                hashCode = Integer.hashCode(j9 instanceof Enum ? ((Enum) j9).ordinal() : j9.hashCode()) ^ Integer.rotateRight(this.P, 3);
            } else if (b9 == null || i49 != 207 || b9.equals(t0Var)) {
                hashCode = Integer.rotateRight(i43 ^ this.P, 3) ^ Integer.hashCode(i49);
            } else {
                this.P = Integer.rotateRight(Integer.rotateRight(i43 ^ this.P, 3) ^ Integer.hashCode(b9.hashCode()), 3);
            }
            this.P = Integer.rotateRight(hashCode, 3);
        }
        int i50 = this.f3830k;
        j1 j1Var3 = this.f3828i;
        ArrayList arrayList2 = this.f3837r;
        h0.b bVar = this.L;
        if (j1Var3 != null) {
            i.p pVar3 = j1Var3.f3763e;
            int i51 = j1Var3.f3760b;
            ArrayList arrayList3 = j1Var3.f3759a;
            if (arrayList3.size() > 0) {
                ArrayList arrayList4 = j1Var3.f3762d;
                i8 = -1;
                th = null;
                HashSet hashSet2 = new HashSet(arrayList4.size());
                int size = arrayList4.size();
                int i52 = 0;
                while (i52 < size) {
                    hashSet2.add(arrayList4.get(i52));
                    i52++;
                    i42 = i42;
                }
                i7 = i42;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                int size2 = arrayList4.size();
                int size3 = arrayList3.size();
                int i53 = 0;
                int i54 = 0;
                int i55 = 0;
                while (i53 < size3) {
                    p0 p0Var = (p0) arrayList3.get(i53);
                    if (hashSet2.contains(p0Var)) {
                        m0Var2 = m0Var3;
                        i30 = i53;
                        if (!linkedHashSet2.contains(p0Var)) {
                            int i56 = i54;
                            if (i56 < size2) {
                                p0 p0Var2 = (p0) arrayList4.get(i56);
                                if (p0Var2 != p0Var) {
                                    j0 j0Var = (j0) pVar3.f(p0Var2.f3848c);
                                    int i57 = j0Var != null ? j0Var.f3757b : -1;
                                    linkedHashSet2.add(p0Var2);
                                    i31 = i56;
                                    i35 = i55;
                                    linkedHashSet = linkedHashSet2;
                                    if (i57 != i35) {
                                        j0 j0Var2 = (j0) pVar3.f(p0Var2.f3848c);
                                        int i58 = j0Var2 != null ? j0Var2.f3758c : p0Var2.f3849d;
                                        j1Var2 = j1Var3;
                                        int i59 = i57 + i51;
                                        hashSet = hashSet2;
                                        int i60 = i35 + i51;
                                        if (i58 > 0) {
                                            i32 = size2;
                                            int i61 = bVar.f4600l;
                                            if (i61 > 0) {
                                                i33 = size3;
                                                if (bVar.f4598j == i59 - i61 && bVar.f4599k == i60 - i61) {
                                                    bVar.f4600l = i61 + i58;
                                                }
                                            } else {
                                                i33 = size3;
                                            }
                                            bVar.c();
                                            bVar.f4598j = i59;
                                            bVar.f4599k = i60;
                                            bVar.f4600l = i58;
                                        } else {
                                            i32 = size2;
                                            i33 = size3;
                                            bVar.getClass();
                                        }
                                        if (i57 > i35) {
                                            Object[] objArr5 = pVar3.f4772c;
                                            long[] jArr3 = pVar3.f4770a;
                                            int length = jArr3.length - 2;
                                            if (length >= 0) {
                                                int i62 = i58;
                                                int i63 = 0;
                                                while (true) {
                                                    long j10 = jArr3[i63];
                                                    i34 = i51;
                                                    arrayList = arrayList3;
                                                    if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i64 = 8 - ((~(i63 - length)) >>> 31);
                                                        int i65 = 0;
                                                        while (i65 < i64) {
                                                            if ((j10 & 255) < 128) {
                                                                j8 = j10;
                                                                j0 j0Var3 = (j0) objArr5[(i63 << 3) + i65];
                                                                int i66 = j0Var3.f3757b;
                                                                jArr2 = jArr3;
                                                                if (i57 <= i66 && i66 < i57 + i62) {
                                                                    j0Var3.f3757b = (i66 - i57) + i35;
                                                                } else if (i35 <= i66 && i66 < i57) {
                                                                    j0Var3.f3757b = i66 + i62;
                                                                }
                                                            } else {
                                                                j8 = j10;
                                                                jArr2 = jArr3;
                                                            }
                                                            j10 = j8 >> 8;
                                                            i65++;
                                                            jArr3 = jArr2;
                                                        }
                                                        jArr = jArr3;
                                                        if (i64 != 8) {
                                                        }
                                                    } else {
                                                        jArr = jArr3;
                                                    }
                                                    if (i63 != length) {
                                                        i63++;
                                                        i51 = i34;
                                                        arrayList3 = arrayList;
                                                        jArr3 = jArr;
                                                    }
                                                }
                                            }
                                        } else {
                                            int i67 = i58;
                                            i34 = i51;
                                            arrayList = arrayList3;
                                            if (i35 > i57) {
                                                Object[] objArr6 = pVar3.f4772c;
                                                long[] jArr4 = pVar3.f4770a;
                                                int length2 = jArr4.length - 2;
                                                if (length2 >= 0) {
                                                    int i68 = 0;
                                                    while (true) {
                                                        long j11 = jArr4[i68];
                                                        Object[] objArr7 = objArr6;
                                                        long[] jArr5 = jArr4;
                                                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i69 = 8 - ((~(i68 - length2)) >>> 31);
                                                            int i70 = 0;
                                                            while (i70 < i69) {
                                                                if ((j11 & 255) < 128) {
                                                                    i38 = i70;
                                                                    j0 j0Var4 = (j0) objArr7[(i68 << 3) + i70];
                                                                    objArr2 = objArr7;
                                                                    int i71 = j0Var4.f3757b;
                                                                    i39 = i57;
                                                                    if (i57 <= i71 && i71 < i39 + i67) {
                                                                        j0Var4.f3757b = (i71 - i39) + i35;
                                                                    } else if (i39 + 1 <= i71 && i71 < i35) {
                                                                        j0Var4.f3757b = i71 - i67;
                                                                    }
                                                                } else {
                                                                    i38 = i70;
                                                                    i39 = i57;
                                                                    objArr2 = objArr7;
                                                                }
                                                                j11 >>= 8;
                                                                i70 = i38 + 1;
                                                                objArr7 = objArr2;
                                                                i57 = i39;
                                                            }
                                                            i37 = i57;
                                                            objArr = objArr7;
                                                            if (i69 != 8) {
                                                            }
                                                        } else {
                                                            i37 = i57;
                                                            objArr = objArr7;
                                                        }
                                                        if (i68 != length2) {
                                                            i68++;
                                                            jArr4 = jArr5;
                                                            objArr6 = objArr;
                                                            i57 = i37;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        i36 = i30;
                                    } else {
                                        j1Var2 = j1Var3;
                                        hashSet = hashSet2;
                                        i32 = size2;
                                        i33 = size3;
                                    }
                                    i34 = i51;
                                    arrayList = arrayList3;
                                    i36 = i30;
                                } else {
                                    i31 = i56;
                                    j1Var2 = j1Var3;
                                    hashSet = hashSet2;
                                    i32 = size2;
                                    i33 = size3;
                                    i34 = i51;
                                    arrayList = arrayList3;
                                    i35 = i55;
                                    linkedHashSet = linkedHashSet2;
                                    i36 = i30 + 1;
                                }
                                i54 = i31 + 1;
                                j0 j0Var5 = (j0) pVar3.f(p0Var2.f3848c);
                                int i72 = i35 + (j0Var5 != null ? j0Var5.f3758c : p0Var2.f3849d);
                                i53 = i36;
                                linkedHashSet2 = linkedHashSet;
                                j1Var3 = j1Var2;
                                hashSet2 = hashSet;
                                size2 = i32;
                                size3 = i33;
                                i51 = i34;
                                arrayList3 = arrayList;
                                i55 = i72;
                                m0Var3 = m0Var2;
                            } else {
                                i54 = i56;
                                m0Var3 = m0Var2;
                                i53 = i30;
                            }
                        }
                    } else {
                        m0Var2 = m0Var3;
                        j0 j0Var6 = (j0) pVar3.f(p0Var.f3848c);
                        int i73 = j0Var6 != null ? j0Var6.f3757b : -1;
                        int i74 = p0Var.f3848c;
                        i30 = i53;
                        bVar.e(i73 + i51, p0Var.f3849d);
                        j1Var3.a(i74, 0);
                        bVar.f4594f = (i74 - bVar.f4589a.F.f3964g) + bVar.f4594f;
                        this.F.k(i74);
                        D();
                        this.F.l();
                        d.q(arrayList2, i74, this.F.f3959b[(i74 * 5) + 3] + i74);
                    }
                    i53 = i30 + 1;
                    m0Var3 = m0Var2;
                }
                m0Var = m0Var3;
                bVar.c();
                if (arrayList3.size() > 0) {
                    x1 x1Var4 = this.F;
                    bVar.f4594f = (x1Var4.f3965h - bVar.f4589a.F.f3964g) + bVar.f4594f;
                    x1Var4.m();
                }
                i9 = this.f3829j;
                while (true) {
                    x1Var = this.F;
                    if (x1Var.f3968k <= 0 && (i29 = x1Var.f3964g) != x1Var.f3965h) {
                        D();
                        bVar.e(i9, this.F.l());
                        d.q(arrayList2, i29, this.F.f3964g);
                        i50 = i50;
                    }
                }
                z9 = this.O;
                if (z9) {
                    z10 = z9;
                    if (z8) {
                        bVar.a();
                    }
                    x1 x1Var5 = this.F;
                    int i75 = x1Var5.f3970m - x1Var5.f3969l;
                    if (i75 <= 0) {
                        i10 = i50;
                    } else {
                        if (i75 > 0) {
                            bVar.d(false);
                            m0 m0Var4 = bVar.f4592d;
                            x1 x1Var6 = bVar.f4589a.F;
                            if (x1Var6.f3960c > 0) {
                                int i76 = x1Var6.f3966i;
                                int i77 = m0Var4.f3793b;
                                if ((i77 > 0 ? m0Var4.f3792a[i77 - 1] : -2) != i76) {
                                    if (bVar.f4591c || !bVar.f4593e) {
                                        i10 = i50;
                                    } else {
                                        bVar.d(false);
                                        i10 = i50;
                                        bVar.f4590b.f4587g.Z(h0.l.f4622c);
                                        bVar.f4591c = true;
                                    }
                                    if (i76 > 0) {
                                        c a3 = x1Var6.a(i76);
                                        m0Var4.b(i76);
                                        bVar.d(false);
                                        h0.d0 d0Var4 = bVar.f4590b.f4587g;
                                        h0.k kVar = h0.k.f4621c;
                                        int i78 = kVar.f4605b;
                                        d0Var4.a0(kVar);
                                        j1.c.l0(d0Var4, 0, a3);
                                        int i79 = d0Var4.f4613m;
                                        int i80 = kVar.f4604a;
                                        if (i79 != h0.d0.T(d0Var4, i80) || d0Var4.f4614n != h0.d0.T(d0Var4, i78)) {
                                            int i81 = 1;
                                            StringBuilder sb = new StringBuilder();
                                            int i82 = 0;
                                            int i83 = 0;
                                            while (i82 < i80) {
                                                if (((i81 << i82) & d0Var4.f4613m) != 0) {
                                                    if (i83 > 0) {
                                                        sb.append(", ");
                                                    }
                                                    sb.append(kVar.b(i82));
                                                    i83++;
                                                }
                                                i82++;
                                                i81 = 1;
                                            }
                                            String sb2 = sb.toString();
                                            StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                                            int i84 = 0;
                                            int i85 = 0;
                                            while (i84 < i78) {
                                                int i86 = i78;
                                                if (((1 << i84) & d0Var4.f4614n) != 0) {
                                                    if (i83 > 0) {
                                                        o2.append(", ");
                                                    }
                                                    o2.append(kVar.c(i84));
                                                    i85++;
                                                }
                                                i84++;
                                                i78 = i86;
                                            }
                                            String sb3 = o2.toString();
                                            r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                                            sb4.append(kVar);
                                            sb4.append(". Not all arguments were provided. Missing ");
                                            a0.m.t(sb4, i83, " int arguments (", sb2, ") and ");
                                            a0.m.u(sb4, i85, " object arguments (", sb3, ").");
                                            throw th;
                                        }
                                        bVar.f4591c = true;
                                    }
                                    d0Var = bVar.f4590b.f4587g;
                                    xVar = h0.x.f4638c;
                                    i11 = xVar.f4605b;
                                    d0Var.a0(xVar);
                                    j1.c.k0(d0Var, 0, i75);
                                    i12 = d0Var.f4613m;
                                    i13 = xVar.f4604a;
                                    if (i12 == h0.d0.T(d0Var, i13) || d0Var.f4614n != h0.d0.T(d0Var, i11)) {
                                        StringBuilder sb5 = new StringBuilder();
                                        i14 = 0;
                                        int i87 = 0;
                                        while (i14 < i13) {
                                            int i88 = i13;
                                            if ((d0Var.f4613m & (1 << i14)) != 0) {
                                                if (i87 > 0) {
                                                    sb5.append(", ");
                                                }
                                                sb5.append(xVar.b(i14));
                                                i87++;
                                            }
                                            i14++;
                                            i13 = i88;
                                        }
                                        String sb6 = sb5.toString();
                                        StringBuilder o6 = a0.m.o(sb6, "StringBuilder().apply(builderAction).toString()");
                                        i15 = 0;
                                        int i89 = 0;
                                        while (i15 < i11) {
                                            int i90 = i11;
                                            if (((1 << i15) & d0Var.f4614n) != 0) {
                                                if (i87 > 0) {
                                                    o6.append(", ");
                                                }
                                                o6.append(xVar.c(i15));
                                                i89++;
                                            }
                                            i15++;
                                            i11 = i90;
                                        }
                                        String sb7 = o6.toString();
                                        r6.k.e(sb7, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb8 = new StringBuilder("Error while pushing ");
                                        sb8.append(xVar);
                                        sb8.append(". Not all arguments were provided. Missing ");
                                        a0.m.t(sb8, i87, " int arguments (", sb6, ") and ");
                                        a0.m.u(sb8, i89, " object arguments (", sb7, ").");
                                        throw th;
                                    }
                                }
                            }
                            i10 = i50;
                            d0Var = bVar.f4590b.f4587g;
                            xVar = h0.x.f4638c;
                            i11 = xVar.f4605b;
                            d0Var.a0(xVar);
                            j1.c.k0(d0Var, 0, i75);
                            i12 = d0Var.f4613m;
                            i13 = xVar.f4604a;
                            if (i12 == h0.d0.T(d0Var, i13)) {
                            }
                            StringBuilder sb52 = new StringBuilder();
                            i14 = 0;
                            int i872 = 0;
                            while (i14 < i13) {
                            }
                            String sb62 = sb52.toString();
                            StringBuilder o62 = a0.m.o(sb62, "StringBuilder().apply(builderAction).toString()");
                            i15 = 0;
                            int i892 = 0;
                            while (i15 < i11) {
                            }
                            String sb72 = o62.toString();
                            r6.k.e(sb72, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb82 = new StringBuilder("Error while pushing ");
                            sb82.append(xVar);
                            sb82.append(". Not all arguments were provided. Missing ");
                            a0.m.t(sb82, i872, " int arguments (", sb62, ") and ");
                            a0.m.u(sb82, i892, " object arguments (", sb72, ").");
                            throw th;
                        }
                        i10 = i50;
                        bVar.getClass();
                    }
                    int i91 = bVar.f4589a.F.f3966i;
                    m0 m0Var5 = bVar.f4592d;
                    int i92 = m0Var5.f3793b;
                    if ((i92 > 0 ? m0Var5.f3792a[i92 - 1] : i8) > i91) {
                        d.w("Missed recording an endGroup");
                        throw th;
                    }
                    if ((i92 > 0 ? m0Var5.f3792a[i92 - 1] : i8) == i91) {
                        bVar.d(false);
                        m0Var5.a();
                        bVar.f4590b.f4587g.Z(h0.i.f4619c);
                    }
                    pVar = this;
                    int i93 = pVar.F.f3966i;
                    int i94 = i10;
                    if (i94 != pVar.c0(i93)) {
                        pVar.Y(i93, i94);
                    }
                    i50 = z8 ? 1 : i94;
                    pVar.F.d();
                    bVar.c();
                } else {
                    if (z8) {
                        h0.c cVar2 = this.N;
                        h0.d0 d0Var5 = cVar2.f4603h;
                        if (!d0Var5.X()) {
                            d.w("Cannot end node insertion, there are no pending operations that can be realized.");
                            throw th;
                        }
                        h0.d0 d0Var6 = cVar2.f4602g;
                        if (d0Var5.W()) {
                            throw new NoSuchElementException("Cannot pop(), because the stack is empty.");
                        }
                        h0.c0[] c0VarArr = d0Var5.f4607g;
                        int i95 = d0Var5.f4608h - 1;
                        d0Var5.f4608h = i95;
                        h0.c0 c0Var = c0VarArr[i95];
                        r6.k.c(c0Var);
                        int i96 = c0Var.f4604a;
                        i16 = -2;
                        int i97 = c0Var.f4605b;
                        z10 = z9;
                        d0Var5.f4607g[d0Var5.f4608h] = th;
                        d0Var6.a0(c0Var);
                        int i98 = d0Var5.f4612l;
                        int i99 = d0Var6.f4612l;
                        int i100 = i98;
                        int i101 = 0;
                        while (i101 < i97) {
                            i99--;
                            int i102 = i100 - 1;
                            int i103 = i101;
                            Object[] objArr8 = d0Var6.f4611k;
                            Object[] objArr9 = d0Var5.f4611k;
                            objArr8[i99] = objArr9[i102];
                            objArr9[i102] = th;
                            i101 = i103 + 1;
                            i100 = i102;
                        }
                        int i104 = d0Var5.f4610j;
                        int i105 = d0Var6.f4610j;
                        int i106 = i104;
                        int i107 = 0;
                        while (i107 < i96) {
                            i105--;
                            int i108 = i106 - 1;
                            int i109 = i107;
                            int[] iArr4 = d0Var6.f4609i;
                            int[] iArr5 = d0Var5.f4609i;
                            iArr4[i105] = iArr5[i108];
                            iArr5[i108] = 0;
                            i107 = i109 + 1;
                            i106 = i108;
                        }
                        d0Var5.f4612l -= i97;
                        d0Var5.f4610j -= i96;
                        i50 = 1;
                    } else {
                        z10 = z9;
                        i16 = -2;
                    }
                    x1 x1Var7 = this.F;
                    int i110 = x1Var7.f3968k;
                    if (i110 <= 0) {
                        d.R("Unbalanced begin/end empty");
                        throw th;
                    }
                    x1Var7.f3968k = i110 - 1;
                    a2 a2Var4 = this.H;
                    int i111 = a2Var4.f3685v;
                    a2Var4.i();
                    if (this.F.f3968k > 0) {
                        pVar2 = this;
                    } else {
                        int i112 = (-2) - i111;
                        this.H.j();
                        this.H.e(true);
                        c cVar3 = this.M;
                        if (this.N.f4602g.W()) {
                            y1 y1Var3 = this.G;
                            bVar.b();
                            bVar.d(false);
                            m0 m0Var6 = bVar.f4592d;
                            x1 x1Var8 = bVar.f4589a.F;
                            i17 = i50;
                            if (x1Var8.f3960c > 0) {
                                int i113 = x1Var8.f3966i;
                                i18 = i112;
                                int i114 = m0Var6.f3793b;
                                if ((i114 > 0 ? m0Var6.f3792a[i114 - 1] : i16) != i113) {
                                    if (!bVar.f4591c && bVar.f4593e) {
                                        bVar.d(false);
                                        bVar.f4590b.f4587g.Z(h0.l.f4622c);
                                        bVar.f4591c = true;
                                    }
                                    if (i113 > 0) {
                                        c a9 = x1Var8.a(i113);
                                        m0Var6.b(i113);
                                        bVar.d(false);
                                        h0.d0 d0Var7 = bVar.f4590b.f4587g;
                                        h0.k kVar2 = h0.k.f4621c;
                                        int i115 = kVar2.f4605b;
                                        d0Var7.a0(kVar2);
                                        j1.c.l0(d0Var7, 0, a9);
                                        int i116 = d0Var7.f4613m;
                                        int i117 = kVar2.f4604a;
                                        y1Var2 = y1Var3;
                                        if (i116 != h0.d0.T(d0Var7, i117) || d0Var7.f4614n != h0.d0.T(d0Var7, i115)) {
                                            int i118 = 1;
                                            StringBuilder sb9 = new StringBuilder();
                                            int i119 = 0;
                                            int i120 = 0;
                                            while (i119 < i117) {
                                                if (((i118 << i119) & d0Var7.f4613m) != 0) {
                                                    if (i120 > 0) {
                                                        sb9.append(", ");
                                                    }
                                                    sb9.append(kVar2.b(i119));
                                                    i120++;
                                                }
                                                i119++;
                                                i118 = 1;
                                            }
                                            String sb10 = sb9.toString();
                                            StringBuilder o8 = a0.m.o(sb10, "StringBuilder().apply(builderAction).toString()");
                                            int i121 = 0;
                                            int i122 = 0;
                                            while (i121 < i115) {
                                                int i123 = i115;
                                                if (((1 << i121) & d0Var7.f4614n) != 0) {
                                                    if (i120 > 0) {
                                                        o8.append(", ");
                                                    }
                                                    o8.append(kVar2.c(i121));
                                                    i122++;
                                                }
                                                i121++;
                                                i115 = i123;
                                            }
                                            String sb11 = o8.toString();
                                            r6.k.e(sb11, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb12 = new StringBuilder("Error while pushing ");
                                            sb12.append(kVar2);
                                            sb12.append(". Not all arguments were provided. Missing ");
                                            a0.m.t(sb12, i120, " int arguments (", sb10, ") and ");
                                            a0.m.u(sb12, i122, " object arguments (", sb11, ").");
                                            throw th;
                                        }
                                        bVar.f4591c = true;
                                        bVar.c();
                                        d0Var3 = bVar.f4590b.f4587g;
                                        nVar = h0.n.f4628c;
                                        i24 = nVar.f4605b;
                                        d0Var3.a0(nVar);
                                        j1.c.l0(d0Var3, 0, cVar3);
                                        j1.c.l0(d0Var3, 1, y1Var2);
                                        i25 = d0Var3.f4613m;
                                        i26 = nVar.f4604a;
                                        if (i25 == h0.d0.T(d0Var3, i26) || d0Var3.f4614n != h0.d0.T(d0Var3, i24)) {
                                            StringBuilder sb13 = new StringBuilder();
                                            i27 = 0;
                                            int i124 = 0;
                                            while (i27 < i26) {
                                                int i125 = i26;
                                                if ((d0Var3.f4613m & (1 << i27)) != 0) {
                                                    if (i124 > 0) {
                                                        sb13.append(", ");
                                                    }
                                                    sb13.append(nVar.b(i27));
                                                    i124++;
                                                }
                                                i27++;
                                                i26 = i125;
                                            }
                                            String sb14 = sb13.toString();
                                            StringBuilder o9 = a0.m.o(sb14, "StringBuilder().apply(builderAction).toString()");
                                            i28 = 0;
                                            int i126 = 0;
                                            while (i28 < i24) {
                                                int i127 = i24;
                                                if (((1 << i28) & d0Var3.f4614n) != 0) {
                                                    if (i124 > 0) {
                                                        o9.append(", ");
                                                    }
                                                    o9.append(nVar.c(i28));
                                                    i126++;
                                                }
                                                i28++;
                                                i24 = i127;
                                            }
                                            String sb15 = o9.toString();
                                            r6.k.e(sb15, "StringBuilder().apply(builderAction).toString()");
                                            StringBuilder sb16 = new StringBuilder("Error while pushing ");
                                            sb16.append(nVar);
                                            sb16.append(". Not all arguments were provided. Missing ");
                                            a0.m.t(sb16, i124, " int arguments (", sb14, ") and ");
                                            a0.m.u(sb16, i126, " object arguments (", sb15, ").");
                                            throw th;
                                        }
                                        pVar2 = this;
                                    }
                                }
                            } else {
                                i18 = i112;
                            }
                            y1Var2 = y1Var3;
                            bVar.c();
                            d0Var3 = bVar.f4590b.f4587g;
                            nVar = h0.n.f4628c;
                            i24 = nVar.f4605b;
                            d0Var3.a0(nVar);
                            j1.c.l0(d0Var3, 0, cVar3);
                            j1.c.l0(d0Var3, 1, y1Var2);
                            i25 = d0Var3.f4613m;
                            i26 = nVar.f4604a;
                            if (i25 == h0.d0.T(d0Var3, i26)) {
                            }
                            StringBuilder sb132 = new StringBuilder();
                            i27 = 0;
                            int i1242 = 0;
                            while (i27 < i26) {
                            }
                            String sb142 = sb132.toString();
                            StringBuilder o92 = a0.m.o(sb142, "StringBuilder().apply(builderAction).toString()");
                            i28 = 0;
                            int i1262 = 0;
                            while (i28 < i24) {
                            }
                            String sb152 = o92.toString();
                            r6.k.e(sb152, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb162 = new StringBuilder("Error while pushing ");
                            sb162.append(nVar);
                            sb162.append(". Not all arguments were provided. Missing ");
                            a0.m.t(sb162, i1242, " int arguments (", sb142, ") and ");
                            a0.m.u(sb162, i1262, " object arguments (", sb152, ").");
                            throw th;
                        }
                        i17 = i50;
                        i18 = i112;
                        y1 y1Var4 = this.G;
                        h0.c cVar4 = this.N;
                        bVar.b();
                        bVar.d(false);
                        m0 m0Var7 = bVar.f4592d;
                        x1 x1Var9 = bVar.f4589a.F;
                        if (x1Var9.f3960c > 0) {
                            int i128 = x1Var9.f3966i;
                            int i129 = m0Var7.f3793b;
                            if ((i129 > 0 ? m0Var7.f3792a[i129 - 1] : i16) != i128) {
                                if (bVar.f4591c || !bVar.f4593e) {
                                    cVar = cVar4;
                                } else {
                                    bVar.d(false);
                                    cVar = cVar4;
                                    bVar.f4590b.f4587g.Z(h0.l.f4622c);
                                    bVar.f4591c = true;
                                }
                                if (i128 > 0) {
                                    c a10 = x1Var9.a(i128);
                                    m0Var7.b(i128);
                                    bVar.d(false);
                                    h0.d0 d0Var8 = bVar.f4590b.f4587g;
                                    h0.k kVar3 = h0.k.f4621c;
                                    int i130 = kVar3.f4605b;
                                    d0Var8.a0(kVar3);
                                    j1.c.l0(d0Var8, 0, a10);
                                    int i131 = d0Var8.f4613m;
                                    int i132 = kVar3.f4604a;
                                    y1Var = y1Var4;
                                    if (i131 != h0.d0.T(d0Var8, i132) || d0Var8.f4614n != h0.d0.T(d0Var8, i130)) {
                                        int i133 = 1;
                                        StringBuilder sb17 = new StringBuilder();
                                        int i134 = 0;
                                        int i135 = 0;
                                        while (i134 < i132) {
                                            if (((i133 << i134) & d0Var8.f4613m) != 0) {
                                                if (i135 > 0) {
                                                    sb17.append(", ");
                                                }
                                                sb17.append(kVar3.b(i134));
                                                i135++;
                                            }
                                            i134++;
                                            i133 = 1;
                                        }
                                        String sb18 = sb17.toString();
                                        StringBuilder o10 = a0.m.o(sb18, "StringBuilder().apply(builderAction).toString()");
                                        int i136 = 0;
                                        int i137 = 0;
                                        while (i136 < i130) {
                                            int i138 = i130;
                                            if (((1 << i136) & d0Var8.f4614n) != 0) {
                                                if (i135 > 0) {
                                                    o10.append(", ");
                                                }
                                                o10.append(kVar3.c(i136));
                                                i137++;
                                            }
                                            i136++;
                                            i130 = i138;
                                        }
                                        String sb19 = o10.toString();
                                        r6.k.e(sb19, "StringBuilder().apply(builderAction).toString()");
                                        StringBuilder sb20 = new StringBuilder("Error while pushing ");
                                        sb20.append(kVar3);
                                        sb20.append(". Not all arguments were provided. Missing ");
                                        a0.m.t(sb20, i135, " int arguments (", sb18, ") and ");
                                        a0.m.u(sb20, i137, " object arguments (", sb19, ").");
                                        throw th;
                                    }
                                    bVar.f4591c = true;
                                } else {
                                    y1Var = y1Var4;
                                }
                                bVar.c();
                                d0Var2 = bVar.f4590b.f4587g;
                                oVar = h0.o.f4629c;
                                i19 = oVar.f4605b;
                                d0Var2.a0(oVar);
                                j1.c.l0(d0Var2, 0, cVar3);
                                j1.c.l0(d0Var2, 1, y1Var);
                                j1.c.l0(d0Var2, i7, cVar);
                                i20 = d0Var2.f4613m;
                                i21 = oVar.f4604a;
                                if (i20 == h0.d0.T(d0Var2, i21) || d0Var2.f4614n != h0.d0.T(d0Var2, i19)) {
                                    StringBuilder sb21 = new StringBuilder();
                                    i22 = 0;
                                    int i139 = 0;
                                    while (i22 < i21) {
                                        int i140 = i21;
                                        if (((1 << i22) & d0Var2.f4613m) != 0) {
                                            if (i139 > 0) {
                                                sb21.append(", ");
                                            }
                                            sb21.append(oVar.b(i22));
                                            i139++;
                                        }
                                        i22++;
                                        i21 = i140;
                                    }
                                    String sb22 = sb21.toString();
                                    StringBuilder o11 = a0.m.o(sb22, "StringBuilder().apply(builderAction).toString()");
                                    i23 = 0;
                                    int i141 = 0;
                                    while (i23 < i19) {
                                        int i142 = i19;
                                        if (((1 << i23) & d0Var2.f4614n) != 0) {
                                            if (i139 > 0) {
                                                o11.append(", ");
                                            }
                                            o11.append(oVar.c(i23));
                                            i141++;
                                        }
                                        i23++;
                                        i19 = i142;
                                    }
                                    String sb23 = o11.toString();
                                    r6.k.e(sb23, "StringBuilder().apply(builderAction).toString()");
                                    StringBuilder sb24 = new StringBuilder("Error while pushing ");
                                    sb24.append(oVar);
                                    sb24.append(". Not all arguments were provided. Missing ");
                                    a0.m.t(sb24, i139, " int arguments (", sb22, ") and ");
                                    a0.m.u(sb24, i141, " object arguments (", sb23, ").");
                                    throw th;
                                }
                                pVar2 = this;
                                pVar2.N = new h0.c();
                            }
                        }
                        y1Var = y1Var4;
                        cVar = cVar4;
                        bVar.c();
                        d0Var2 = bVar.f4590b.f4587g;
                        oVar = h0.o.f4629c;
                        i19 = oVar.f4605b;
                        d0Var2.a0(oVar);
                        j1.c.l0(d0Var2, 0, cVar3);
                        j1.c.l0(d0Var2, 1, y1Var);
                        j1.c.l0(d0Var2, i7, cVar);
                        i20 = d0Var2.f4613m;
                        i21 = oVar.f4604a;
                        if (i20 == h0.d0.T(d0Var2, i21)) {
                        }
                        StringBuilder sb212 = new StringBuilder();
                        i22 = 0;
                        int i1392 = 0;
                        while (i22 < i21) {
                        }
                        String sb222 = sb212.toString();
                        StringBuilder o112 = a0.m.o(sb222, "StringBuilder().apply(builderAction).toString()");
                        i23 = 0;
                        int i1412 = 0;
                        while (i23 < i19) {
                        }
                        String sb232 = o112.toString();
                        r6.k.e(sb232, "StringBuilder().apply(builderAction).toString()");
                        StringBuilder sb242 = new StringBuilder("Error while pushing ");
                        sb242.append(oVar);
                        sb242.append(". Not all arguments were provided. Missing ");
                        a0.m.t(sb242, i1392, " int arguments (", sb222, ") and ");
                        a0.m.u(sb242, i1412, " object arguments (", sb232, ").");
                        throw th;
                        pVar2.O = false;
                        if (pVar2.f3822c.f3975g == 0) {
                            i50 = i17;
                        } else {
                            int i143 = i18;
                            pVar2.X(i143, 0);
                            i50 = i17;
                            pVar2.Y(i143, i50);
                        }
                    }
                    pVar = pVar2;
                }
                j1Var = (j1) pVar.f3827h.f3153f.remove(r1.size() - 1);
                if (j1Var != null && !z10) {
                    j1Var.f3761c++;
                }
                pVar.f3828i = j1Var;
                pVar.f3829j = m0Var.a() + i50;
                pVar.f3831l = m0Var.a();
                pVar.f3830k = m0Var.a() + i50;
            }
        }
        m0Var = m0Var3;
        i7 = 2;
        i8 = -1;
        th = null;
        i9 = this.f3829j;
        while (true) {
            x1Var = this.F;
            if (x1Var.f3968k <= 0) {
                D();
                bVar.e(i9, this.F.l());
                d.q(arrayList2, i29, this.F.f3964g);
                i50 = i50;
            }
        }
        z9 = this.O;
        if (z9) {
        }
        j1Var = (j1) pVar.f3827h.f3153f.remove(r1.size() - 1);
        if (j1Var != null) {
            j1Var.f3761c++;
        }
        pVar.f3828i = j1Var;
        pVar.f3829j = m0Var.a() + i50;
        pVar.f3831l = m0Var.a();
        pVar.f3830k = m0Var.a() + i50;
    }

    public final void q() {
        p(false);
        p1 v5 = v();
        if (v5 != null) {
            int i7 = v5.f3850a;
            if ((i7 & 1) != 0) {
                v5.f3850a = i7 | 2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v12 */
    /* JADX WARN: Type inference failed for: r16v4, types: [java.lang.Throwable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p1 r() {
        p1 p1Var;
        ?? r16;
        p1 p1Var2;
        c a3;
        o1 o1Var;
        o1 o1Var2;
        f1.g gVar = this.D;
        if (gVar.f3153f.isEmpty()) {
            p1Var = null;
        } else {
            ArrayList arrayList = gVar.f3153f;
            p1Var = (p1) arrayList.remove(arrayList.size() - 1);
        }
        if (p1Var != null) {
            p1Var.f3850a &= -9;
        }
        if (p1Var != null) {
            int i7 = this.A;
            i.u uVar = p1Var.f3855f;
            if (uVar != null && (p1Var.f3850a & 16) == 0) {
                Object[] objArr = uVar.f4799b;
                int[] iArr = uVar.f4800c;
                long[] jArr = uVar.f4798a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i8 = 0;
                    loop0: while (true) {
                        long j8 = jArr[i8];
                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i9 = 8 - ((~(i8 - length)) >>> 31);
                            o1Var = null;
                            r16 = 0;
                            o1Var = null;
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j8 & 255) < 128) {
                                    int i11 = (i8 << 3) + i10;
                                    Object obj = objArr[i11];
                                    if (iArr[i11] != i7) {
                                        o1Var2 = new o1(i7, 0, p1Var, uVar);
                                        break loop0;
                                    }
                                }
                                j8 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        } else {
                            o1Var = null;
                        }
                        if (i8 == length) {
                            break;
                        }
                        i8++;
                    }
                    if (o1Var2 != null) {
                        h0.d0 d0Var = this.L.f4590b.f4587g;
                        h0.h hVar = h0.h.f4618c;
                        int i12 = hVar.f4605b;
                        d0Var.a0(hVar);
                        j1.c.l0(d0Var, 0, o1Var2);
                        j1.c.l0(d0Var, 1, this.f3826g);
                        int i13 = d0Var.f4613m;
                        int i14 = hVar.f4604a;
                        if (i13 != h0.d0.T(d0Var, i14) || d0Var.f4614n != h0.d0.T(d0Var, i12)) {
                            StringBuilder sb = new StringBuilder();
                            int i15 = 0;
                            for (int i16 = 0; i16 < i14; i16++) {
                                if (((1 << i16) & d0Var.f4613m) != 0) {
                                    if (i15 > 0) {
                                        sb.append(", ");
                                    }
                                    sb.append(hVar.b(i16));
                                    i15++;
                                }
                            }
                            String sb2 = sb.toString();
                            StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
                            int i17 = 0;
                            for (int i18 = 0; i18 < i12; i18++) {
                                if (((1 << i18) & d0Var.f4614n) != 0) {
                                    if (i15 > 0) {
                                        o2.append(", ");
                                    }
                                    o2.append(hVar.c(i18));
                                    i17++;
                                }
                            }
                            String sb3 = o2.toString();
                            r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
                            StringBuilder sb4 = new StringBuilder("Error while pushing ");
                            sb4.append(hVar);
                            sb4.append(". Not all arguments were provided. Missing ");
                            a0.m.t(sb4, i15, " int arguments (", sb2, ") and ");
                            a0.m.u(sb4, i17, " object arguments (", sb3, ").");
                            throw r16;
                        }
                    }
                }
            }
            o1Var = null;
            o1Var2 = o1Var;
            r16 = o1Var;
            if (o1Var2 != null) {
            }
        } else {
            r16 = 0;
        }
        if (p1Var != null) {
            int i19 = p1Var.f3850a;
            if ((i19 & 16) == 0 && ((i19 & 1) != 0 || this.f3835p)) {
                if (p1Var.f3852c == null) {
                    if (this.O) {
                        a2 a2Var = this.H;
                        a3 = a2Var.b(a2Var.f3685v);
                    } else {
                        x1 x1Var = this.F;
                        a3 = x1Var.a(x1Var.f3966i);
                    }
                    p1Var.f3852c = a3;
                }
                p1Var.f3850a &= -5;
                p1Var2 = p1Var;
                p(false);
                return p1Var2;
            }
        }
        p1Var2 = r16;
        p(false);
        return p1Var2;
    }

    public final void s() {
        p(false);
        this.f3821b.b();
        p(false);
        h0.b bVar = this.L;
        if (bVar.f4591c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f4590b.f4587g.Z(h0.i.f4619c);
            bVar.f4591c = false;
        }
        bVar.b();
        if (bVar.f4592d.f3793b != 0) {
            d.w("Missed recording an endGroup()");
            throw null;
        }
        if (!this.f3827h.f3153f.isEmpty()) {
            d.w("Start/end imbalance");
            throw null;
        }
        i();
        this.F.c();
        this.f3841v = this.f3842w.a() != 0;
    }

    public final void t(boolean z8, j1 j1Var) {
        this.f3827h.f3153f.add(this.f3828i);
        this.f3828i = j1Var;
        int i7 = this.f3830k;
        m0 m0Var = this.f3832m;
        m0Var.b(i7);
        m0Var.b(this.f3831l);
        m0Var.b(this.f3829j);
        if (z8) {
            this.f3829j = 0;
        }
        this.f3830k = 0;
        this.f3831l = 0;
    }

    public final void u() {
        y1 y1Var = new y1();
        if (this.B) {
            y1Var.g();
        }
        if (this.f3821b.c()) {
            y1Var.f3983o = new i.p();
        }
        this.G = y1Var;
        a2 w4 = y1Var.w();
        w4.e(true);
        this.H = w4;
    }

    public final p1 v() {
        if (this.f3845z != 0) {
            return null;
        }
        f1.g gVar = this.D;
        if (gVar.f3153f.isEmpty()) {
            return null;
        }
        return (p1) gVar.f3153f.get(r0.size() - 1);
    }

    public final boolean w() {
        if (!x() || this.f3841v) {
            return true;
        }
        p1 v5 = v();
        return (v5 == null || (v5.f3850a & 4) == 0) ? false : true;
    }

    public final boolean x() {
        p1 v5;
        return (this.O || this.f3843x || this.f3841v || (v5 = v()) == null || (v5.f3850a & 8) != 0) ? false : true;
    }

    public final void y(ArrayList arrayList) {
        h0.a aVar = this.f3825f;
        h0.b bVar = this.L;
        h0.a aVar2 = bVar.f4590b;
        try {
            bVar.f4590b = aVar;
            aVar.f4587g.Z(h0.u.f4635c);
            if (arrayList.size() <= 0) {
                bVar.f4590b.f4587g.Z(h0.j.f4620c);
                bVar.f4594f = 0;
            } else {
                d6.j jVar = (d6.j) arrayList.get(0);
                x0 x0Var = (x0) jVar.f2618f;
                x0Var.getClass();
                throw null;
            }
        } finally {
            bVar.f4590b = aVar2;
        }
    }

    public final Object z() {
        if (!this.O) {
            Object h3 = this.F.h();
            if (!this.f3843x || (h3 instanceof m)) {
                return h3;
            }
        } else if (this.f3836q) {
            d.w("A call to createNode(), emitNode() or useNode() expected");
            throw null;
        }
        return l.f3784a;
    }
}
