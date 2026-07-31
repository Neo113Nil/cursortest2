package m2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m2.t;
import m4.q;
import o2.m0;
import r0.r3;
import r0.s1;
import t1.x;
import t1.x0;

/* loaded from: classes.dex */
public class a extends c {

    /* renamed from: h, reason: collision with root package name */
    private final n2.f f18905h;

    /* renamed from: i, reason: collision with root package name */
    private final long f18906i;

    /* renamed from: j, reason: collision with root package name */
    private final long f18907j;

    /* renamed from: k, reason: collision with root package name */
    private final long f18908k;

    /* renamed from: l, reason: collision with root package name */
    private final int f18909l;

    /* renamed from: m, reason: collision with root package name */
    private final int f18910m;

    /* renamed from: n, reason: collision with root package name */
    private final float f18911n;

    /* renamed from: o, reason: collision with root package name */
    private final float f18912o;

    /* renamed from: p, reason: collision with root package name */
    private final m4.q<C0098a> f18913p;

    /* renamed from: q, reason: collision with root package name */
    private final o2.d f18914q;

    /* renamed from: r, reason: collision with root package name */
    private float f18915r;

    /* renamed from: s, reason: collision with root package name */
    private int f18916s;

    /* renamed from: t, reason: collision with root package name */
    private int f18917t;

    /* renamed from: u, reason: collision with root package name */
    private long f18918u;

    /* renamed from: v, reason: collision with root package name */
    private v1.n f18919v;

    /* renamed from: m2.a$a, reason: collision with other inner class name */
    public static final class C0098a {

        /* renamed from: a, reason: collision with root package name */
        public final long f18920a;

        /* renamed from: b, reason: collision with root package name */
        public final long f18921b;

        public C0098a(long j7, long j8) {
            this.f18920a = j7;
            this.f18921b = j8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0098a)) {
                return false;
            }
            C0098a c0098a = (C0098a) obj;
            return this.f18920a == c0098a.f18920a && this.f18921b == c0098a.f18921b;
        }

        public int hashCode() {
            return (((int) this.f18920a) * 31) + ((int) this.f18921b);
        }
    }

    public static class b implements t.b {

        /* renamed from: a, reason: collision with root package name */
        private final int f18922a;

        /* renamed from: b, reason: collision with root package name */
        private final int f18923b;

        /* renamed from: c, reason: collision with root package name */
        private final int f18924c;

        /* renamed from: d, reason: collision with root package name */
        private final int f18925d;

        /* renamed from: e, reason: collision with root package name */
        private final int f18926e;

        /* renamed from: f, reason: collision with root package name */
        private final float f18927f;

        /* renamed from: g, reason: collision with root package name */
        private final float f18928g;

        /* renamed from: h, reason: collision with root package name */
        private final o2.d f18929h;

        public b() {
            this(10000, 25000, 25000, 0.7f);
        }

        public b(int i7, int i8, int i9, float f7) {
            this(i7, i8, i9, 1279, 719, f7, 0.75f, o2.d.f19699a);
        }

        public b(int i7, int i8, int i9, int i10, int i11, float f7, float f8, o2.d dVar) {
            this.f18922a = i7;
            this.f18923b = i8;
            this.f18924c = i9;
            this.f18925d = i10;
            this.f18926e = i11;
            this.f18927f = f7;
            this.f18928g = f8;
            this.f18929h = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // m2.t.b
        public final t[] a(t.a[] aVarArr, n2.f fVar, x.b bVar, r3 r3Var) {
            m4.q B = a.B(aVarArr);
            t[] tVarArr = new t[aVarArr.length];
            for (int i7 = 0; i7 < aVarArr.length; i7++) {
                t.a aVar = aVarArr[i7];
                if (aVar != null) {
                    int[] iArr = aVar.f19076b;
                    if (iArr.length != 0) {
                        tVarArr[i7] = iArr.length == 1 ? new u(aVar.f19075a, iArr[0], aVar.f19077c) : b(aVar.f19075a, iArr, aVar.f19077c, fVar, (m4.q) B.get(i7));
                    }
                }
            }
            return tVarArr;
        }

        protected a b(x0 x0Var, int[] iArr, int i7, n2.f fVar, m4.q<C0098a> qVar) {
            return new a(x0Var, iArr, i7, fVar, this.f18922a, this.f18923b, this.f18924c, this.f18925d, this.f18926e, this.f18927f, this.f18928g, qVar, this.f18929h);
        }
    }

    protected a(x0 x0Var, int[] iArr, int i7, n2.f fVar, long j7, long j8, long j9, int i8, int i9, float f7, float f8, List<C0098a> list, o2.d dVar) {
        super(x0Var, iArr, i7);
        n2.f fVar2;
        long j10;
        if (j9 < j7) {
            o2.r.i("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            fVar2 = fVar;
            j10 = j7;
        } else {
            fVar2 = fVar;
            j10 = j9;
        }
        this.f18905h = fVar2;
        this.f18906i = j7 * 1000;
        this.f18907j = j8 * 1000;
        this.f18908k = j10 * 1000;
        this.f18909l = i8;
        this.f18910m = i9;
        this.f18911n = f7;
        this.f18912o = f8;
        this.f18913p = m4.q.t(list);
        this.f18914q = dVar;
        this.f18915r = 1.0f;
        this.f18917t = 0;
        this.f18918u = -9223372036854775807L;
    }

    private int A(long j7, long j8) {
        long C = C(j8);
        int i7 = 0;
        for (int i8 = 0; i8 < this.f18979b; i8++) {
            if (j7 == Long.MIN_VALUE || !i(i8, j7)) {
                s1 a7 = a(i8);
                if (z(a7, a7.f20952m, C)) {
                    return i8;
                }
                i7 = i8;
            }
        }
        return i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static m4.q<m4.q<C0098a>> B(t.a[] aVarArr) {
        q.a aVar;
        ArrayList arrayList = new ArrayList();
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            if (aVarArr[i7] == null || aVarArr[i7].f19076b.length <= 1) {
                aVar = null;
            } else {
                aVar = m4.q.r();
                aVar.a(new C0098a(0L, 0L));
            }
            arrayList.add(aVar);
        }
        long[][] G = G(aVarArr);
        int[] iArr = new int[G.length];
        long[] jArr = new long[G.length];
        for (int i8 = 0; i8 < G.length; i8++) {
            jArr[i8] = G[i8].length == 0 ? 0L : G[i8][0];
        }
        y(arrayList, jArr);
        m4.q<Integer> H = H(G);
        for (int i9 = 0; i9 < H.size(); i9++) {
            int intValue = H.get(i9).intValue();
            int i10 = iArr[intValue] + 1;
            iArr[intValue] = i10;
            jArr[intValue] = G[intValue][i10];
            y(arrayList, jArr);
        }
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            if (arrayList.get(i11) != null) {
                jArr[i11] = jArr[i11] * 2;
            }
        }
        y(arrayList, jArr);
        q.a r7 = m4.q.r();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            q.a aVar2 = (q.a) arrayList.get(i12);
            r7.a(aVar2 == null ? m4.q.x() : aVar2.h());
        }
        return r7.h();
    }

    private long C(long j7) {
        long I = I(j7);
        if (this.f18913p.isEmpty()) {
            return I;
        }
        int i7 = 1;
        while (i7 < this.f18913p.size() - 1 && this.f18913p.get(i7).f18920a < I) {
            i7++;
        }
        C0098a c0098a = this.f18913p.get(i7 - 1);
        C0098a c0098a2 = this.f18913p.get(i7);
        long j8 = c0098a.f18920a;
        float f7 = (I - j8) / (c0098a2.f18920a - j8);
        return c0098a.f18921b + ((long) (f7 * (c0098a2.f18921b - r2)));
    }

    private long D(List<? extends v1.n> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        v1.n nVar = (v1.n) m4.t.c(list);
        long j7 = nVar.f22753g;
        if (j7 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        long j8 = nVar.f22754h;
        if (j8 != -9223372036854775807L) {
            return j8 - j7;
        }
        return -9223372036854775807L;
    }

    private long F(v1.o[] oVarArr, List<? extends v1.n> list) {
        int i7 = this.f18916s;
        if (i7 < oVarArr.length && oVarArr[i7].next()) {
            v1.o oVar = oVarArr[this.f18916s];
            return oVar.a() - oVar.b();
        }
        for (v1.o oVar2 : oVarArr) {
            if (oVar2.next()) {
                return oVar2.a() - oVar2.b();
            }
        }
        return D(list);
    }

    private static long[][] G(t.a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            t.a aVar = aVarArr[i7];
            if (aVar == null) {
                jArr[i7] = new long[0];
            } else {
                jArr[i7] = new long[aVar.f19076b.length];
                int i8 = 0;
                while (true) {
                    if (i8 >= aVar.f19076b.length) {
                        break;
                    }
                    jArr[i7][i8] = aVar.f19075a.b(r5[i8]).f20952m;
                    i8++;
                }
                Arrays.sort(jArr[i7]);
            }
        }
        return jArr;
    }

    private static m4.q<Integer> H(long[][] jArr) {
        m4.z c7 = m4.b0.a().a().c();
        for (int i7 = 0; i7 < jArr.length; i7++) {
            if (jArr[i7].length > 1) {
                int length = jArr[i7].length;
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    double d7 = 0.0d;
                    if (i8 >= jArr[i7].length) {
                        break;
                    }
                    if (jArr[i7][i8] != -1) {
                        d7 = Math.log(jArr[i7][i8]);
                    }
                    dArr[i8] = d7;
                    i8++;
                }
                int i9 = length - 1;
                double d8 = dArr[i9] - dArr[0];
                int i10 = 0;
                while (i10 < i9) {
                    double d9 = dArr[i10];
                    i10++;
                    c7.put(Double.valueOf(d8 == 0.0d ? 1.0d : (((d9 + dArr[i10]) * 0.5d) - dArr[0]) / d8), Integer.valueOf(i7));
                }
            }
        }
        return m4.q.t(c7.values());
    }

    private long I(long j7) {
        long f7 = (long) (this.f18905h.f() * this.f18911n);
        long e7 = this.f18905h.e();
        if (e7 == -9223372036854775807L || j7 == -9223372036854775807L) {
            return (long) (f7 / this.f18915r);
        }
        float f8 = j7;
        return (long) ((f7 * Math.max((f8 / this.f18915r) - e7, 0.0f)) / f8);
    }

    private long J(long j7, long j8) {
        if (j7 == -9223372036854775807L) {
            return this.f18906i;
        }
        if (j8 != -9223372036854775807L) {
            j7 -= j8;
        }
        return Math.min((long) (j7 * this.f18912o), this.f18906i);
    }

    private static void y(List<q.a<C0098a>> list, long[] jArr) {
        long j7 = 0;
        for (long j8 : jArr) {
            j7 += j8;
        }
        for (int i7 = 0; i7 < list.size(); i7++) {
            q.a<C0098a> aVar = list.get(i7);
            if (aVar != null) {
                aVar.a(new C0098a(j7, jArr[i7]));
            }
        }
    }

    protected long E() {
        return this.f18908k;
    }

    protected boolean K(long j7, List<? extends v1.n> list) {
        long j8 = this.f18918u;
        return j8 == -9223372036854775807L || j7 - j8 >= 1000 || !(list.isEmpty() || ((v1.n) m4.t.c(list)).equals(this.f18919v));
    }

    @Override // m2.c, m2.t
    public void g() {
        this.f18919v = null;
    }

    @Override // m2.c, m2.t
    public void k() {
        this.f18918u = -9223372036854775807L;
        this.f18919v = null;
    }

    @Override // m2.c, m2.t
    public int l(long j7, List<? extends v1.n> list) {
        int i7;
        int i8;
        long a7 = this.f18914q.a();
        if (!K(a7, list)) {
            return list.size();
        }
        this.f18918u = a7;
        this.f18919v = list.isEmpty() ? null : (v1.n) m4.t.c(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long e02 = m0.e0(list.get(size - 1).f22753g - j7, this.f18915r);
        long E = E();
        if (e02 < E) {
            return size;
        }
        s1 a8 = a(A(a7, D(list)));
        for (int i9 = 0; i9 < size; i9++) {
            v1.n nVar = list.get(i9);
            s1 s1Var = nVar.f22750d;
            if (m0.e0(nVar.f22753g - j7, this.f18915r) >= E && s1Var.f20952m < a8.f20952m && (i7 = s1Var.f20962w) != -1 && i7 <= this.f18910m && (i8 = s1Var.f20961v) != -1 && i8 <= this.f18909l && i7 < a8.f20962w) {
                return i9;
            }
        }
        return size;
    }

    @Override // m2.t
    public void m(long j7, long j8, long j9, List<? extends v1.n> list, v1.o[] oVarArr) {
        long a7 = this.f18914q.a();
        long F = F(oVarArr, list);
        int i7 = this.f18917t;
        if (i7 == 0) {
            this.f18917t = 1;
            this.f18916s = A(a7, F);
            return;
        }
        int i8 = this.f18916s;
        int d7 = list.isEmpty() ? -1 : d(((v1.n) m4.t.c(list)).f22750d);
        if (d7 != -1) {
            i7 = ((v1.n) m4.t.c(list)).f22751e;
            i8 = d7;
        }
        int A = A(a7, F);
        if (!i(i8, a7)) {
            s1 a8 = a(i8);
            s1 a9 = a(A);
            long J = J(j9, F);
            int i9 = a9.f20952m;
            int i10 = a8.f20952m;
            if ((i9 > i10 && j8 < J) || (i9 < i10 && j8 >= this.f18907j)) {
                A = i8;
            }
        }
        if (A != i8) {
            i7 = 3;
        }
        this.f18917t = i7;
        this.f18916s = A;
    }

    @Override // m2.t
    public int q() {
        return this.f18917t;
    }

    @Override // m2.t
    public int r() {
        return this.f18916s;
    }

    @Override // m2.c, m2.t
    public void s(float f7) {
        this.f18915r = f7;
    }

    @Override // m2.t
    public Object t() {
        return null;
    }

    protected boolean z(s1 s1Var, int i7, long j7) {
        return ((long) i7) <= j7;
    }
}
