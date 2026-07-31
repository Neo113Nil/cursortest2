package e1;

import android.net.Uri;
import android.util.Pair;
import e1.a;
import j1.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import o2.a0;
import o2.m0;
import o2.w;
import r0.n2;
import r0.s1;
import w0.b0;
import w0.c0;
import w0.e0;
import w0.f0;
import w0.x;

/* loaded from: classes.dex */
public final class k implements w0.l, b0 {

    /* renamed from: y, reason: collision with root package name */
    public static final w0.r f15928y = new w0.r() { // from class: e1.j
        @Override // w0.r
        public final w0.l[] a() {
            w0.l[] t6;
            t6 = k.t();
            return t6;
        }

        @Override // w0.r
        public /* synthetic */ w0.l[] b(Uri uri, Map map) {
            return w0.q.a(this, uri, map);
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final int f15929a;

    /* renamed from: b, reason: collision with root package name */
    private final a0 f15930b;

    /* renamed from: c, reason: collision with root package name */
    private final a0 f15931c;

    /* renamed from: d, reason: collision with root package name */
    private final a0 f15932d;

    /* renamed from: e, reason: collision with root package name */
    private final a0 f15933e;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayDeque<a.C0056a> f15934f;

    /* renamed from: g, reason: collision with root package name */
    private final m f15935g;

    /* renamed from: h, reason: collision with root package name */
    private final List<a.b> f15936h;

    /* renamed from: i, reason: collision with root package name */
    private int f15937i;

    /* renamed from: j, reason: collision with root package name */
    private int f15938j;

    /* renamed from: k, reason: collision with root package name */
    private long f15939k;

    /* renamed from: l, reason: collision with root package name */
    private int f15940l;

    /* renamed from: m, reason: collision with root package name */
    private a0 f15941m;

    /* renamed from: n, reason: collision with root package name */
    private int f15942n;

    /* renamed from: o, reason: collision with root package name */
    private int f15943o;

    /* renamed from: p, reason: collision with root package name */
    private int f15944p;

    /* renamed from: q, reason: collision with root package name */
    private int f15945q;

    /* renamed from: r, reason: collision with root package name */
    private w0.n f15946r;

    /* renamed from: s, reason: collision with root package name */
    private a[] f15947s;

    /* renamed from: t, reason: collision with root package name */
    private long[][] f15948t;

    /* renamed from: u, reason: collision with root package name */
    private int f15949u;

    /* renamed from: v, reason: collision with root package name */
    private long f15950v;

    /* renamed from: w, reason: collision with root package name */
    private int f15951w;

    /* renamed from: x, reason: collision with root package name */
    private p1.b f15952x;

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final o f15953a;

        /* renamed from: b, reason: collision with root package name */
        public final r f15954b;

        /* renamed from: c, reason: collision with root package name */
        public final e0 f15955c;

        /* renamed from: d, reason: collision with root package name */
        public final f0 f15956d;

        /* renamed from: e, reason: collision with root package name */
        public int f15957e;

        public a(o oVar, r rVar, e0 e0Var) {
            this.f15953a = oVar;
            this.f15954b = rVar;
            this.f15955c = e0Var;
            this.f15956d = "audio/true-hd".equals(oVar.f15975f.f20956q) ? new f0() : null;
        }
    }

    public k() {
        this(0);
    }

    public k(int i7) {
        this.f15929a = i7;
        this.f15937i = (i7 & 4) != 0 ? 3 : 0;
        this.f15935g = new m();
        this.f15936h = new ArrayList();
        this.f15933e = new a0(16);
        this.f15934f = new ArrayDeque<>();
        this.f15930b = new a0(w.f19796a);
        this.f15931c = new a0(4);
        this.f15932d = new a0();
        this.f15942n = -1;
        this.f15946r = w0.n.f22959d;
        this.f15947s = new a[0];
    }

    private void A(long j7) {
        if (this.f15938j == 1836086884) {
            int i7 = this.f15940l;
            this.f15952x = new p1.b(0L, j7, -9223372036854775807L, j7 + i7, this.f15939k - i7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean B(w0.m mVar) {
        long p7;
        a.C0056a peek;
        a0 a0Var;
        if (this.f15940l == 0) {
            if (!mVar.e(this.f15933e.d(), 0, 8, true)) {
                x();
                return false;
            }
            this.f15940l = 8;
            this.f15933e.O(0);
            this.f15939k = this.f15933e.E();
            this.f15938j = this.f15933e.m();
        }
        long j7 = this.f15939k;
        if (j7 != 1) {
            if (j7 == 0) {
                long a7 = mVar.a();
                if (a7 == -1 && (peek = this.f15934f.peek()) != null) {
                    a7 = peek.f15839b;
                }
                if (a7 != -1) {
                    p7 = (a7 - mVar.p()) + this.f15940l;
                }
            }
            if (this.f15939k >= this.f15940l) {
                throw n2.d("Atom size less than header length (unsupported).");
            }
            if (F(this.f15938j)) {
                long p8 = mVar.p();
                long j8 = this.f15939k;
                int i7 = this.f15940l;
                long j9 = (p8 + j8) - i7;
                if (j8 != i7 && this.f15938j == 1835365473) {
                    v(mVar);
                }
                this.f15934f.push(new a.C0056a(this.f15938j, j9));
                if (this.f15939k == this.f15940l) {
                    w(j9);
                } else {
                    o();
                }
            } else {
                if (G(this.f15938j)) {
                    o2.a.f(this.f15940l == 8);
                    o2.a.f(this.f15939k <= 2147483647L);
                    a0Var = new a0((int) this.f15939k);
                    System.arraycopy(this.f15933e.d(), 0, a0Var.d(), 0, 8);
                } else {
                    A(mVar.p() - this.f15940l);
                    a0Var = null;
                }
                this.f15941m = a0Var;
                this.f15937i = 1;
            }
            return true;
        }
        mVar.readFully(this.f15933e.d(), 8, 8);
        this.f15940l += 8;
        p7 = this.f15933e.H();
        this.f15939k = p7;
        if (this.f15939k >= this.f15940l) {
        }
    }

    private boolean C(w0.m mVar, w0.a0 a0Var) {
        boolean z6;
        long j7 = this.f15939k - this.f15940l;
        long p7 = mVar.p() + j7;
        a0 a0Var2 = this.f15941m;
        if (a0Var2 != null) {
            mVar.readFully(a0Var2.d(), this.f15940l, (int) j7);
            if (this.f15938j == 1718909296) {
                this.f15951w = y(a0Var2);
            } else if (!this.f15934f.isEmpty()) {
                this.f15934f.peek().e(new a.b(this.f15938j, a0Var2));
            }
        } else {
            if (j7 >= 262144) {
                a0Var.f22873a = mVar.p() + j7;
                z6 = true;
                w(p7);
                return (z6 || this.f15937i == 2) ? false : true;
            }
            mVar.i((int) j7);
        }
        z6 = false;
        w(p7);
        if (z6) {
        }
    }

    private int D(w0.m mVar, w0.a0 a0Var) {
        int i7;
        w0.a0 a0Var2;
        long p7 = mVar.p();
        if (this.f15942n == -1) {
            int r7 = r(p7);
            this.f15942n = r7;
            if (r7 == -1) {
                return -1;
            }
        }
        a aVar = this.f15947s[this.f15942n];
        e0 e0Var = aVar.f15955c;
        int i8 = aVar.f15957e;
        r rVar = aVar.f15954b;
        long j7 = rVar.f16006c[i8];
        int i9 = rVar.f16007d[i8];
        f0 f0Var = aVar.f15956d;
        long j8 = (j7 - p7) + this.f15943o;
        if (j8 < 0) {
            i7 = 1;
            a0Var2 = a0Var;
        } else {
            if (j8 < 262144) {
                if (aVar.f15953a.f15976g == 1) {
                    j8 += 8;
                    i9 -= 8;
                }
                mVar.i((int) j8);
                o oVar = aVar.f15953a;
                if (oVar.f15979j == 0) {
                    if ("audio/ac4".equals(oVar.f15975f.f20956q)) {
                        if (this.f15944p == 0) {
                            t0.c.a(i9, this.f15932d);
                            e0Var.d(this.f15932d, 7);
                            this.f15944p += 7;
                        }
                        i9 += 7;
                    } else if (f0Var != null) {
                        f0Var.d(mVar);
                    }
                    while (true) {
                        int i10 = this.f15944p;
                        if (i10 >= i9) {
                            break;
                        }
                        int a7 = e0Var.a(mVar, i9 - i10, false);
                        this.f15943o += a7;
                        this.f15944p += a7;
                        this.f15945q -= a7;
                    }
                } else {
                    byte[] d7 = this.f15931c.d();
                    d7[0] = 0;
                    d7[1] = 0;
                    d7[2] = 0;
                    int i11 = aVar.f15953a.f15979j;
                    int i12 = 4 - i11;
                    while (this.f15944p < i9) {
                        int i13 = this.f15945q;
                        if (i13 == 0) {
                            mVar.readFully(d7, i12, i11);
                            this.f15943o += i11;
                            this.f15931c.O(0);
                            int m7 = this.f15931c.m();
                            if (m7 < 0) {
                                throw n2.a("Invalid NAL length", null);
                            }
                            this.f15945q = m7;
                            this.f15930b.O(0);
                            e0Var.d(this.f15930b, 4);
                            this.f15944p += 4;
                            i9 += i12;
                        } else {
                            int a8 = e0Var.a(mVar, i13, false);
                            this.f15943o += a8;
                            this.f15944p += a8;
                            this.f15945q -= a8;
                        }
                    }
                }
                int i14 = i9;
                r rVar2 = aVar.f15954b;
                long j9 = rVar2.f16009f[i8];
                int i15 = rVar2.f16010g[i8];
                if (f0Var != null) {
                    f0Var.c(e0Var, j9, i15, i14, 0, null);
                    if (i8 + 1 == aVar.f15954b.f16005b) {
                        f0Var.a(e0Var, null);
                    }
                } else {
                    e0Var.b(j9, i15, i14, 0, null);
                }
                aVar.f15957e++;
                this.f15942n = -1;
                this.f15943o = 0;
                this.f15944p = 0;
                this.f15945q = 0;
                return 0;
            }
            a0Var2 = a0Var;
            i7 = 1;
        }
        a0Var2.f22873a = j7;
        return i7;
    }

    private int E(w0.m mVar, w0.a0 a0Var) {
        int c7 = this.f15935g.c(mVar, a0Var, this.f15936h);
        if (c7 == 1 && a0Var.f22873a == 0) {
            o();
        }
        return c7;
    }

    private static boolean F(int i7) {
        return i7 == 1836019574 || i7 == 1953653099 || i7 == 1835297121 || i7 == 1835626086 || i7 == 1937007212 || i7 == 1701082227 || i7 == 1835365473;
    }

    private static boolean G(int i7) {
        return i7 == 1835296868 || i7 == 1836476516 || i7 == 1751411826 || i7 == 1937011556 || i7 == 1937011827 || i7 == 1937011571 || i7 == 1668576371 || i7 == 1701606260 || i7 == 1937011555 || i7 == 1937011578 || i7 == 1937013298 || i7 == 1937007471 || i7 == 1668232756 || i7 == 1953196132 || i7 == 1718909296 || i7 == 1969517665 || i7 == 1801812339 || i7 == 1768715124;
    }

    private void H(a aVar, long j7) {
        r rVar = aVar.f15954b;
        int a7 = rVar.a(j7);
        if (a7 == -1) {
            a7 = rVar.b(j7);
        }
        aVar.f15957e = a7;
    }

    private static int m(int i7) {
        if (i7 != 1751476579) {
            return i7 != 1903435808 ? 0 : 1;
        }
        return 2;
    }

    private static long[][] n(a[] aVarArr) {
        long[][] jArr = new long[aVarArr.length][];
        int[] iArr = new int[aVarArr.length];
        long[] jArr2 = new long[aVarArr.length];
        boolean[] zArr = new boolean[aVarArr.length];
        for (int i7 = 0; i7 < aVarArr.length; i7++) {
            jArr[i7] = new long[aVarArr[i7].f15954b.f16005b];
            jArr2[i7] = aVarArr[i7].f15954b.f16009f[0];
        }
        long j7 = 0;
        int i8 = 0;
        while (i8 < aVarArr.length) {
            long j8 = Long.MAX_VALUE;
            int i9 = -1;
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                if (!zArr[i10] && jArr2[i10] <= j8) {
                    j8 = jArr2[i10];
                    i9 = i10;
                }
            }
            int i11 = iArr[i9];
            jArr[i9][i11] = j7;
            j7 += aVarArr[i9].f15954b.f16007d[i11];
            int i12 = i11 + 1;
            iArr[i9] = i12;
            if (i12 < jArr[i9].length) {
                jArr2[i9] = aVarArr[i9].f15954b.f16009f[i12];
            } else {
                zArr[i9] = true;
                i8++;
            }
        }
        return jArr;
    }

    private void o() {
        this.f15937i = 0;
        this.f15940l = 0;
    }

    private static int q(r rVar, long j7) {
        int a7 = rVar.a(j7);
        return a7 == -1 ? rVar.b(j7) : a7;
    }

    private int r(long j7) {
        int i7 = -1;
        int i8 = -1;
        int i9 = 0;
        long j8 = Long.MAX_VALUE;
        boolean z6 = true;
        long j9 = Long.MAX_VALUE;
        boolean z7 = true;
        long j10 = Long.MAX_VALUE;
        while (true) {
            a[] aVarArr = this.f15947s;
            if (i9 >= aVarArr.length) {
                break;
            }
            a aVar = aVarArr[i9];
            int i10 = aVar.f15957e;
            r rVar = aVar.f15954b;
            if (i10 != rVar.f16005b) {
                long j11 = rVar.f16006c[i10];
                long j12 = ((long[][]) m0.j(this.f15948t))[i9][i10];
                long j13 = j11 - j7;
                boolean z8 = j13 < 0 || j13 >= 262144;
                if ((!z8 && z7) || (z8 == z7 && j13 < j10)) {
                    z7 = z8;
                    j10 = j13;
                    i8 = i9;
                    j9 = j12;
                }
                if (j12 < j8) {
                    z6 = z8;
                    i7 = i9;
                    j8 = j12;
                }
            }
            i9++;
        }
        return (j8 == Long.MAX_VALUE || !z6 || j9 < j8 + 10485760) ? i8 : i7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ o s(o oVar) {
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ w0.l[] t() {
        return new w0.l[]{new k()};
    }

    private static long u(r rVar, long j7, long j8) {
        int q7 = q(rVar, j7);
        return q7 == -1 ? j8 : Math.min(rVar.f16006c[q7], j8);
    }

    private void v(w0.m mVar) {
        this.f15932d.K(8);
        mVar.n(this.f15932d.d(), 0, 8);
        b.e(this.f15932d);
        mVar.i(this.f15932d.e());
        mVar.h();
    }

    private void w(long j7) {
        while (!this.f15934f.isEmpty() && this.f15934f.peek().f15839b == j7) {
            a.C0056a pop = this.f15934f.pop();
            if (pop.f15838a == 1836019574) {
                z(pop);
                this.f15934f.clear();
                this.f15937i = 2;
            } else if (!this.f15934f.isEmpty()) {
                this.f15934f.peek().d(pop);
            }
        }
        if (this.f15937i != 2) {
            o();
        }
    }

    private void x() {
        if (this.f15951w != 2 || (this.f15929a & 2) == 0) {
            return;
        }
        this.f15946r.d(0, 4).e(new s1.b().X(this.f15952x == null ? null : new j1.a(this.f15952x)).E());
        this.f15946r.j();
        this.f15946r.i(new b0.b(-9223372036854775807L));
    }

    private static int y(a0 a0Var) {
        a0Var.O(8);
        int m7 = m(a0Var.m());
        if (m7 != 0) {
            return m7;
        }
        a0Var.P(4);
        while (a0Var.a() > 0) {
            int m8 = m(a0Var.m());
            if (m8 != 0) {
                return m8;
            }
        }
        return 0;
    }

    private void z(a.C0056a c0056a) {
        j1.a aVar;
        j1.a aVar2;
        List<r> list;
        int i7;
        int i8;
        ArrayList arrayList = new ArrayList();
        boolean z6 = this.f15951w == 1;
        x xVar = new x();
        a.b g7 = c0056a.g(1969517665);
        if (g7 != null) {
            Pair<j1.a, j1.a> B = b.B(g7);
            j1.a aVar3 = (j1.a) B.first;
            j1.a aVar4 = (j1.a) B.second;
            if (aVar3 != null) {
                xVar.c(aVar3);
            }
            aVar = aVar4;
            aVar2 = aVar3;
        } else {
            aVar = null;
            aVar2 = null;
        }
        a.C0056a f7 = c0056a.f(1835365473);
        long j7 = -9223372036854775807L;
        j1.a n7 = f7 != null ? b.n(f7) : null;
        List<r> A = b.A(c0056a, xVar, -9223372036854775807L, null, (this.f15929a & 1) != 0, z6, new l4.f() { // from class: e1.i
            @Override // l4.f
            public final Object apply(Object obj) {
                o s7;
                s7 = k.s((o) obj);
                return s7;
            }
        });
        int size = A.size();
        long j8 = -9223372036854775807L;
        int i9 = 0;
        int i10 = -1;
        while (i9 < size) {
            r rVar = A.get(i9);
            if (rVar.f16005b == 0) {
                list = A;
                i7 = size;
            } else {
                o oVar = rVar.f16004a;
                list = A;
                i7 = size;
                long j9 = oVar.f15974e;
                if (j9 == j7) {
                    j9 = rVar.f16011h;
                }
                long max = Math.max(j8, j9);
                a aVar5 = new a(oVar, rVar, this.f15946r.d(i9, oVar.f15971b));
                int i11 = "audio/true-hd".equals(oVar.f15975f.f20956q) ? rVar.f16008e * 16 : rVar.f16008e + 30;
                s1.b b7 = oVar.f15975f.b();
                b7.W(i11);
                if (oVar.f15971b == 2 && j9 > 0 && (i8 = rVar.f16005b) > 1) {
                    b7.P(i8 / (j9 / 1000000.0f));
                }
                h.k(oVar.f15971b, xVar, b7);
                int i12 = oVar.f15971b;
                j1.a[] aVarArr = new j1.a[2];
                aVarArr[0] = aVar;
                aVarArr[1] = this.f15936h.isEmpty() ? null : new j1.a(this.f15936h);
                h.l(i12, aVar2, n7, b7, aVarArr);
                aVar5.f15955c.e(b7.E());
                if (oVar.f15971b == 2 && i10 == -1) {
                    i10 = arrayList.size();
                }
                arrayList.add(aVar5);
                j8 = max;
            }
            i9++;
            A = list;
            size = i7;
            j7 = -9223372036854775807L;
        }
        this.f15949u = i10;
        this.f15950v = j8;
        a[] aVarArr2 = (a[]) arrayList.toArray(new a[0]);
        this.f15947s = aVarArr2;
        this.f15948t = n(aVarArr2);
        this.f15946r.j();
        this.f15946r.i(this);
    }

    @Override // w0.l
    public void a() {
    }

    @Override // w0.l
    public void b(long j7, long j8) {
        this.f15934f.clear();
        this.f15940l = 0;
        this.f15942n = -1;
        this.f15943o = 0;
        this.f15944p = 0;
        this.f15945q = 0;
        if (j7 == 0) {
            if (this.f15937i != 3) {
                o();
                return;
            } else {
                this.f15935g.g();
                this.f15936h.clear();
                return;
            }
        }
        for (a aVar : this.f15947s) {
            H(aVar, j8);
            f0 f0Var = aVar.f15956d;
            if (f0Var != null) {
                f0Var.b();
            }
        }
    }

    @Override // w0.l
    public void d(w0.n nVar) {
        this.f15946r = nVar;
    }

    @Override // w0.l
    public int e(w0.m mVar, w0.a0 a0Var) {
        while (true) {
            int i7 = this.f15937i;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 == 2) {
                        return D(mVar, a0Var);
                    }
                    if (i7 == 3) {
                        return E(mVar, a0Var);
                    }
                    throw new IllegalStateException();
                }
                if (C(mVar, a0Var)) {
                    return 1;
                }
            } else if (!B(mVar)) {
                return -1;
            }
        }
    }

    @Override // w0.b0
    public boolean g() {
        return true;
    }

    @Override // w0.l
    public boolean h(w0.m mVar) {
        return n.d(mVar, (this.f15929a & 2) != 0);
    }

    @Override // w0.b0
    public b0.a i(long j7) {
        return p(j7, -1);
    }

    @Override // w0.b0
    public long j() {
        return this.f15950v;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b0.a p(long j7, int i7) {
        long j8;
        long j9;
        long j10;
        long j11;
        int b7;
        a[] aVarArr = this.f15947s;
        if (aVarArr.length == 0) {
            return new b0.a(c0.f22878c);
        }
        int i8 = i7 != -1 ? i7 : this.f15949u;
        if (i8 != -1) {
            r rVar = aVarArr[i8].f15954b;
            int q7 = q(rVar, j7);
            if (q7 == -1) {
                return new b0.a(c0.f22878c);
            }
            j9 = rVar.f16009f[q7];
            j8 = rVar.f16006c[q7];
            if (j9 < j7 && q7 < rVar.f16005b - 1 && (b7 = rVar.b(j7)) != -1 && b7 != q7) {
                j11 = rVar.f16009f[b7];
                j10 = rVar.f16006c[b7];
                if (i7 == -1) {
                    int i9 = 0;
                    while (true) {
                        a[] aVarArr2 = this.f15947s;
                        if (i9 >= aVarArr2.length) {
                            break;
                        }
                        if (i9 != this.f15949u) {
                            r rVar2 = aVarArr2[i9].f15954b;
                            j8 = u(rVar2, j9, j8);
                            if (j11 != -9223372036854775807L) {
                                j10 = u(rVar2, j11, j10);
                            }
                        }
                        i9++;
                    }
                }
                c0 c0Var = new c0(j9, j8);
                return j11 != -9223372036854775807L ? new b0.a(c0Var) : new b0.a(c0Var, new c0(j11, j10));
            }
        } else {
            j8 = Long.MAX_VALUE;
            j9 = j7;
        }
        j10 = -1;
        j11 = -9223372036854775807L;
        if (i7 == -1) {
        }
        c0 c0Var2 = new c0(j9, j8);
        if (j11 != -9223372036854775807L) {
        }
    }
}
