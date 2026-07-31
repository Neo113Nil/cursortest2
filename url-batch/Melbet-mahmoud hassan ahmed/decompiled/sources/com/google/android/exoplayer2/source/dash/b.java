package com.google.android.exoplayer2.source.dash;

import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import m2.t;
import n2.g0;
import n2.i0;
import n2.p0;
import o2.m0;
import r0.j3;
import r0.s1;
import s0.u1;
import t1.e0;
import t1.n;
import t1.q0;
import t1.r0;
import t1.u;
import t1.x0;
import t1.z0;
import v0.w;
import v0.y;
import v1.i;
import x1.f;
import x1.g;
import x1.j;

/* loaded from: classes.dex */
final class b implements u, r0.a<i<com.google.android.exoplayer2.source.dash.a>>, i.b<com.google.android.exoplayer2.source.dash.a> {
    private static final Pattern D = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern E = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");
    private x1.c A;
    private int B;
    private List<f> C;

    /* renamed from: f, reason: collision with root package name */
    final int f2253f;

    /* renamed from: g, reason: collision with root package name */
    private final a.InterfaceC0044a f2254g;

    /* renamed from: h, reason: collision with root package name */
    private final p0 f2255h;

    /* renamed from: i, reason: collision with root package name */
    private final y f2256i;

    /* renamed from: j, reason: collision with root package name */
    private final g0 f2257j;

    /* renamed from: k, reason: collision with root package name */
    private final w1.b f2258k;

    /* renamed from: l, reason: collision with root package name */
    private final long f2259l;

    /* renamed from: m, reason: collision with root package name */
    private final i0 f2260m;

    /* renamed from: n, reason: collision with root package name */
    private final n2.b f2261n;

    /* renamed from: o, reason: collision with root package name */
    private final z0 f2262o;

    /* renamed from: p, reason: collision with root package name */
    private final a[] f2263p;

    /* renamed from: q, reason: collision with root package name */
    private final t1.i f2264q;

    /* renamed from: r, reason: collision with root package name */
    private final e f2265r;

    /* renamed from: t, reason: collision with root package name */
    private final e0.a f2267t;

    /* renamed from: u, reason: collision with root package name */
    private final w.a f2268u;

    /* renamed from: v, reason: collision with root package name */
    private final u1 f2269v;

    /* renamed from: w, reason: collision with root package name */
    private u.a f2270w;

    /* renamed from: z, reason: collision with root package name */
    private r0 f2273z;

    /* renamed from: x, reason: collision with root package name */
    private i<com.google.android.exoplayer2.source.dash.a>[] f2271x = F(0);

    /* renamed from: y, reason: collision with root package name */
    private d[] f2272y = new d[0];

    /* renamed from: s, reason: collision with root package name */
    private final IdentityHashMap<i<com.google.android.exoplayer2.source.dash.a>, e.c> f2266s = new IdentityHashMap<>();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int[] f2274a;

        /* renamed from: b, reason: collision with root package name */
        public final int f2275b;

        /* renamed from: c, reason: collision with root package name */
        public final int f2276c;

        /* renamed from: d, reason: collision with root package name */
        public final int f2277d;

        /* renamed from: e, reason: collision with root package name */
        public final int f2278e;

        /* renamed from: f, reason: collision with root package name */
        public final int f2279f;

        /* renamed from: g, reason: collision with root package name */
        public final int f2280g;

        private a(int i7, int i8, int[] iArr, int i9, int i10, int i11, int i12) {
            this.f2275b = i7;
            this.f2274a = iArr;
            this.f2276c = i8;
            this.f2278e = i9;
            this.f2279f = i10;
            this.f2280g = i11;
            this.f2277d = i12;
        }

        public static a a(int[] iArr, int i7) {
            return new a(3, 1, iArr, i7, -1, -1, -1);
        }

        public static a b(int[] iArr, int i7) {
            return new a(5, 1, iArr, i7, -1, -1, -1);
        }

        public static a c(int i7) {
            return new a(5, 2, new int[0], -1, -1, -1, i7);
        }

        public static a d(int i7, int[] iArr, int i8, int i9, int i10) {
            return new a(i7, 0, iArr, i8, i9, i10, -1);
        }
    }

    public b(int i7, x1.c cVar, w1.b bVar, int i8, a.InterfaceC0044a interfaceC0044a, p0 p0Var, y yVar, w.a aVar, g0 g0Var, e0.a aVar2, long j7, i0 i0Var, n2.b bVar2, t1.i iVar, e.b bVar3, u1 u1Var) {
        this.f2253f = i7;
        this.A = cVar;
        this.f2258k = bVar;
        this.B = i8;
        this.f2254g = interfaceC0044a;
        this.f2255h = p0Var;
        this.f2256i = yVar;
        this.f2268u = aVar;
        this.f2257j = g0Var;
        this.f2267t = aVar2;
        this.f2259l = j7;
        this.f2260m = i0Var;
        this.f2261n = bVar2;
        this.f2264q = iVar;
        this.f2269v = u1Var;
        this.f2265r = new e(cVar, bVar3, bVar2);
        this.f2273z = iVar.a(this.f2271x);
        g d7 = cVar.d(i8);
        List<f> list = d7.f23129d;
        this.C = list;
        Pair<z0, a[]> v6 = v(yVar, d7.f23128c, list);
        this.f2262o = (z0) v6.first;
        this.f2263p = (a[]) v6.second;
    }

    private static int[][] A(List<x1.a> list) {
        int i7;
        x1.e w6;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i8 = 0; i8 < size; i8++) {
            sparseIntArray.put(list.get(i8).f23081a, i8);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i8));
            arrayList.add(arrayList2);
            sparseArray.put(i8, arrayList2);
        }
        for (int i9 = 0; i9 < size; i9++) {
            x1.a aVar = list.get(i9);
            x1.e y6 = y(aVar.f23085e);
            if (y6 == null) {
                y6 = y(aVar.f23086f);
            }
            if (y6 == null || (i7 = sparseIntArray.get(Integer.parseInt(y6.f23119b), -1)) == -1) {
                i7 = i9;
            }
            if (i7 == i9 && (w6 = w(aVar.f23086f)) != null) {
                for (String str : m0.Q0(w6.f23119b, ",")) {
                    int i10 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i10 != -1) {
                        i7 = Math.min(i7, i10);
                    }
                }
            }
            if (i7 != i9) {
                List list2 = (List) sparseArray.get(i9);
                List list3 = (List) sparseArray.get(i7);
                list3.addAll(list2);
                sparseArray.put(i9, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2][];
        for (int i11 = 0; i11 < size2; i11++) {
            iArr[i11] = o4.d.k((Collection) arrayList.get(i11));
            Arrays.sort(iArr[i11]);
        }
        return iArr;
    }

    private int B(int i7, int[] iArr) {
        int i8 = iArr[i7];
        if (i8 == -1) {
            return -1;
        }
        int i9 = this.f2263p[i8].f2278e;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int i11 = iArr[i10];
            if (i11 == i9 && this.f2263p[i11].f2276c == 0) {
                return i10;
            }
        }
        return -1;
    }

    private int[] C(t[] tVarArr) {
        int[] iArr = new int[tVarArr.length];
        for (int i7 = 0; i7 < tVarArr.length; i7++) {
            if (tVarArr[i7] != null) {
                iArr[i7] = this.f2262o.c(tVarArr[i7].c());
            } else {
                iArr[i7] = -1;
            }
        }
        return iArr;
    }

    private static boolean D(List<x1.a> list, int[] iArr) {
        for (int i7 : iArr) {
            List<j> list2 = list.get(i7).f23083c;
            for (int i8 = 0; i8 < list2.size(); i8++) {
                if (!list2.get(i8).f23144e.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int i7, List<x1.a> list, int[][] iArr, boolean[] zArr, s1[][] s1VarArr) {
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            if (D(list, iArr[i9])) {
                zArr[i9] = true;
                i8++;
            }
            s1VarArr[i9] = z(list, iArr[i9]);
            if (s1VarArr[i9].length != 0) {
                i8++;
            }
        }
        return i8;
    }

    private static i<com.google.android.exoplayer2.source.dash.a>[] F(int i7) {
        return new i[i7];
    }

    private static s1[] H(x1.e eVar, Pattern pattern, s1 s1Var) {
        String str = eVar.f23119b;
        if (str == null) {
            return new s1[]{s1Var};
        }
        String[] Q0 = m0.Q0(str, ";");
        s1[] s1VarArr = new s1[Q0.length];
        for (int i7 = 0; i7 < Q0.length; i7++) {
            Matcher matcher = pattern.matcher(Q0[i7]);
            if (!matcher.matches()) {
                return new s1[]{s1Var};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            s1VarArr[i7] = s1Var.b().S(s1Var.f20945f + ":" + parseInt).F(parseInt).V(matcher.group(2)).E();
        }
        return s1VarArr;
    }

    private void J(t[] tVarArr, boolean[] zArr, q0[] q0VarArr) {
        for (int i7 = 0; i7 < tVarArr.length; i7++) {
            if (tVarArr[i7] == null || !zArr[i7]) {
                if (q0VarArr[i7] instanceof i) {
                    ((i) q0VarArr[i7]).Q(this);
                } else if (q0VarArr[i7] instanceof i.a) {
                    ((i.a) q0VarArr[i7]).c();
                }
                q0VarArr[i7] = null;
            }
        }
    }

    private void K(t[] tVarArr, q0[] q0VarArr, int[] iArr) {
        for (int i7 = 0; i7 < tVarArr.length; i7++) {
            if ((q0VarArr[i7] instanceof n) || (q0VarArr[i7] instanceof i.a)) {
                int B = B(i7, iArr);
                if (!(B == -1 ? q0VarArr[i7] instanceof n : (q0VarArr[i7] instanceof i.a) && ((i.a) q0VarArr[i7]).f22779f == q0VarArr[B])) {
                    if (q0VarArr[i7] instanceof i.a) {
                        ((i.a) q0VarArr[i7]).c();
                    }
                    q0VarArr[i7] = null;
                }
            }
        }
    }

    private void L(t[] tVarArr, q0[] q0VarArr, boolean[] zArr, long j7, int[] iArr) {
        for (int i7 = 0; i7 < tVarArr.length; i7++) {
            t tVar = tVarArr[i7];
            if (tVar != null) {
                if (q0VarArr[i7] == null) {
                    zArr[i7] = true;
                    a aVar = this.f2263p[iArr[i7]];
                    int i8 = aVar.f2276c;
                    if (i8 == 0) {
                        q0VarArr[i7] = o(aVar, tVar, j7);
                    } else if (i8 == 2) {
                        q0VarArr[i7] = new d(this.C.get(aVar.f2277d), tVar.c().b(0), this.A.f23094d);
                    }
                } else if (q0VarArr[i7] instanceof i) {
                    ((com.google.android.exoplayer2.source.dash.a) ((i) q0VarArr[i7]).E()).c(tVar);
                }
            }
        }
        for (int i9 = 0; i9 < tVarArr.length; i9++) {
            if (q0VarArr[i9] == null && tVarArr[i9] != null) {
                a aVar2 = this.f2263p[iArr[i9]];
                if (aVar2.f2276c == 1) {
                    int B = B(i9, iArr);
                    if (B == -1) {
                        q0VarArr[i9] = new n();
                    } else {
                        q0VarArr[i9] = ((i) q0VarArr[B]).T(j7, aVar2.f2275b);
                    }
                }
            }
        }
    }

    private static void j(List<f> list, x0[] x0VarArr, a[] aVarArr, int i7) {
        int i8 = 0;
        while (i8 < list.size()) {
            f fVar = list.get(i8);
            x0VarArr[i7] = new x0(fVar.a() + ":" + i8, new s1.b().S(fVar.a()).e0("application/x-emsg").E());
            aVarArr[i7] = a.c(i8);
            i8++;
            i7++;
        }
    }

    private static int m(y yVar, List<x1.a> list, int[][] iArr, int i7, boolean[] zArr, s1[][] s1VarArr, x0[] x0VarArr, a[] aVarArr) {
        int i8;
        int i9;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i7) {
            int[] iArr2 = iArr[i10];
            ArrayList arrayList = new ArrayList();
            for (int i12 : iArr2) {
                arrayList.addAll(list.get(i12).f23083c);
            }
            int size = arrayList.size();
            s1[] s1VarArr2 = new s1[size];
            for (int i13 = 0; i13 < size; i13++) {
                s1 s1Var = ((j) arrayList.get(i13)).f23141b;
                s1VarArr2[i13] = s1Var.c(yVar.e(s1Var));
            }
            x1.a aVar = list.get(iArr2[0]);
            int i14 = aVar.f23081a;
            String num = i14 != -1 ? Integer.toString(i14) : "unset:" + i10;
            int i15 = i11 + 1;
            if (zArr[i10]) {
                i8 = i15 + 1;
            } else {
                i8 = i15;
                i15 = -1;
            }
            if (s1VarArr[i10].length != 0) {
                i9 = i8 + 1;
            } else {
                i9 = i8;
                i8 = -1;
            }
            x0VarArr[i11] = new x0(num, s1VarArr2);
            aVarArr[i11] = a.d(aVar.f23082b, iArr2, i11, i15, i8);
            if (i15 != -1) {
                String str = num + ":emsg";
                x0VarArr[i15] = new x0(str, new s1.b().S(str).e0("application/x-emsg").E());
                aVarArr[i15] = a.b(iArr2, i11);
            }
            if (i8 != -1) {
                x0VarArr[i8] = new x0(num + ":cc", s1VarArr[i10]);
                aVarArr[i8] = a.a(iArr2, i11);
            }
            i10++;
            i11 = i9;
        }
        return i11;
    }

    private i<com.google.android.exoplayer2.source.dash.a> o(a aVar, t tVar, long j7) {
        x0 x0Var;
        int i7;
        x0 x0Var2;
        int i8;
        int i9 = aVar.f2279f;
        boolean z6 = i9 != -1;
        e.c cVar = null;
        if (z6) {
            x0Var = this.f2262o.b(i9);
            i7 = 1;
        } else {
            x0Var = null;
            i7 = 0;
        }
        int i10 = aVar.f2280g;
        boolean z7 = i10 != -1;
        if (z7) {
            x0Var2 = this.f2262o.b(i10);
            i7 += x0Var2.f22259f;
        } else {
            x0Var2 = null;
        }
        s1[] s1VarArr = new s1[i7];
        int[] iArr = new int[i7];
        if (z6) {
            s1VarArr[0] = x0Var.b(0);
            iArr[0] = 5;
            i8 = 1;
        } else {
            i8 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z7) {
            for (int i11 = 0; i11 < x0Var2.f22259f; i11++) {
                s1VarArr[i8] = x0Var2.b(i11);
                iArr[i8] = 3;
                arrayList.add(s1VarArr[i8]);
                i8++;
            }
        }
        if (this.A.f23094d && z6) {
            cVar = this.f2265r.k();
        }
        e.c cVar2 = cVar;
        i<com.google.android.exoplayer2.source.dash.a> iVar = new i<>(aVar.f2275b, iArr, s1VarArr, this.f2254g.a(this.f2260m, this.A, this.f2258k, this.B, aVar.f2274a, tVar, aVar.f2275b, this.f2259l, z6, arrayList, cVar2, this.f2255h, this.f2269v), this, this.f2261n, j7, this.f2256i, this.f2268u, this.f2257j, this.f2267t);
        synchronized (this) {
            this.f2266s.put(iVar, cVar2);
        }
        return iVar;
    }

    private static Pair<z0, a[]> v(y yVar, List<x1.a> list, List<f> list2) {
        int[][] A = A(list);
        int length = A.length;
        boolean[] zArr = new boolean[length];
        s1[][] s1VarArr = new s1[length][];
        int E2 = E(length, list, A, zArr, s1VarArr) + length + list2.size();
        x0[] x0VarArr = new x0[E2];
        a[] aVarArr = new a[E2];
        j(list2, x0VarArr, aVarArr, m(yVar, list, A, length, zArr, s1VarArr, x0VarArr, aVarArr));
        return Pair.create(new z0(x0VarArr), aVarArr);
    }

    private static x1.e w(List<x1.e> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static x1.e x(List<x1.e> list, String str) {
        for (int i7 = 0; i7 < list.size(); i7++) {
            x1.e eVar = list.get(i7);
            if (str.equals(eVar.f23118a)) {
                return eVar;
            }
        }
        return null;
    }

    private static x1.e y(List<x1.e> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    private static s1[] z(List<x1.a> list, int[] iArr) {
        s1 E2;
        Pattern pattern;
        for (int i7 : iArr) {
            x1.a aVar = list.get(i7);
            List<x1.e> list2 = list.get(i7).f23084d;
            for (int i8 = 0; i8 < list2.size(); i8++) {
                x1.e eVar = list2.get(i8);
                if ("urn:scte:dash:cc:cea-608:2015".equals(eVar.f23118a)) {
                    E2 = new s1.b().e0("application/cea-608").S(aVar.f23081a + ":cea608").E();
                    pattern = D;
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(eVar.f23118a)) {
                    E2 = new s1.b().e0("application/cea-708").S(aVar.f23081a + ":cea708").E();
                    pattern = E;
                }
                return H(eVar, pattern, E2);
            }
        }
        return new s1[0];
    }

    @Override // t1.r0.a
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public void l(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        this.f2270w.l(this);
    }

    public void I() {
        this.f2265r.o();
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f2271x) {
            iVar.Q(this);
        }
        this.f2270w = null;
    }

    public void M(x1.c cVar, int i7) {
        this.A = cVar;
        this.B = i7;
        this.f2265r.q(cVar);
        i<com.google.android.exoplayer2.source.dash.a>[] iVarArr = this.f2271x;
        if (iVarArr != null) {
            for (i<com.google.android.exoplayer2.source.dash.a> iVar : iVarArr) {
                iVar.E().k(cVar, i7);
            }
            this.f2270w.l(this);
        }
        this.C = cVar.d(i7).f23129d;
        for (d dVar : this.f2272y) {
            Iterator<f> it = this.C.iterator();
            while (true) {
                if (it.hasNext()) {
                    f next = it.next();
                    if (next.a().equals(dVar.a())) {
                        dVar.e(next, cVar.f23094d && i7 == cVar.e() - 1);
                    }
                }
            }
        }
    }

    @Override // t1.u, t1.r0
    public boolean a() {
        return this.f2273z.a();
    }

    @Override // t1.u, t1.r0
    public long c() {
        return this.f2273z.c();
    }

    @Override // v1.i.b
    public synchronized void d(i<com.google.android.exoplayer2.source.dash.a> iVar) {
        e.c remove = this.f2266s.remove(iVar);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // t1.u, t1.r0
    public long e() {
        return this.f2273z.e();
    }

    @Override // t1.u
    public long f(long j7, j3 j3Var) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f2271x) {
            if (iVar.f22758f == 2) {
                return iVar.f(j7, j3Var);
            }
        }
        return j7;
    }

    @Override // t1.u, t1.r0
    public boolean g(long j7) {
        return this.f2273z.g(j7);
    }

    @Override // t1.u, t1.r0
    public void h(long j7) {
        this.f2273z.h(j7);
    }

    @Override // t1.u
    public long n() {
        return -9223372036854775807L;
    }

    @Override // t1.u
    public z0 p() {
        return this.f2262o;
    }

    @Override // t1.u
    public void q(u.a aVar, long j7) {
        this.f2270w = aVar;
        aVar.i(this);
    }

    @Override // t1.u
    public long r(t[] tVarArr, boolean[] zArr, q0[] q0VarArr, boolean[] zArr2, long j7) {
        int[] C = C(tVarArr);
        J(tVarArr, zArr, q0VarArr);
        K(tVarArr, q0VarArr, C);
        L(tVarArr, q0VarArr, zArr2, j7, C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (q0 q0Var : q0VarArr) {
            if (q0Var instanceof i) {
                arrayList.add((i) q0Var);
            } else if (q0Var instanceof d) {
                arrayList2.add((d) q0Var);
            }
        }
        i<com.google.android.exoplayer2.source.dash.a>[] F = F(arrayList.size());
        this.f2271x = F;
        arrayList.toArray(F);
        d[] dVarArr = new d[arrayList2.size()];
        this.f2272y = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f2273z = this.f2264q.a(this.f2271x);
        return j7;
    }

    @Override // t1.u
    public void s() {
        this.f2260m.b();
    }

    @Override // t1.u
    public void t(long j7, boolean z6) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f2271x) {
            iVar.t(j7, z6);
        }
    }

    @Override // t1.u
    public long u(long j7) {
        for (i<com.google.android.exoplayer2.source.dash.a> iVar : this.f2271x) {
            iVar.S(j7);
        }
        for (d dVar : this.f2272y) {
            dVar.c(j7);
        }
        return j7;
    }
}
