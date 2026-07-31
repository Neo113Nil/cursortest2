package v1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import n2.g0;
import n2.h0;
import o2.m0;
import o2.r;
import r0.j3;
import r0.s1;
import r0.t1;
import t1.e0;
import t1.p0;
import t1.q;
import t1.q0;
import t1.r0;
import t1.t;
import v0.w;
import v0.y;
import v1.j;

/* loaded from: classes.dex */
public class i<T extends j> implements q0, r0, h0.b<f>, h0.f {
    private v1.a A;
    boolean B;

    /* renamed from: f, reason: collision with root package name */
    public final int f22758f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f22759g;

    /* renamed from: h, reason: collision with root package name */
    private final s1[] f22760h;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f22761i;

    /* renamed from: j, reason: collision with root package name */
    private final T f22762j;

    /* renamed from: k, reason: collision with root package name */
    private final r0.a<i<T>> f22763k;

    /* renamed from: l, reason: collision with root package name */
    private final e0.a f22764l;

    /* renamed from: m, reason: collision with root package name */
    private final g0 f22765m;

    /* renamed from: n, reason: collision with root package name */
    private final h0 f22766n;

    /* renamed from: o, reason: collision with root package name */
    private final h f22767o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<v1.a> f22768p;

    /* renamed from: q, reason: collision with root package name */
    private final List<v1.a> f22769q;

    /* renamed from: r, reason: collision with root package name */
    private final p0 f22770r;

    /* renamed from: s, reason: collision with root package name */
    private final p0[] f22771s;

    /* renamed from: t, reason: collision with root package name */
    private final c f22772t;

    /* renamed from: u, reason: collision with root package name */
    private f f22773u;

    /* renamed from: v, reason: collision with root package name */
    private s1 f22774v;

    /* renamed from: w, reason: collision with root package name */
    private b<T> f22775w;

    /* renamed from: x, reason: collision with root package name */
    private long f22776x;

    /* renamed from: y, reason: collision with root package name */
    private long f22777y;

    /* renamed from: z, reason: collision with root package name */
    private int f22778z;

    public final class a implements q0 {

        /* renamed from: f, reason: collision with root package name */
        public final i<T> f22779f;

        /* renamed from: g, reason: collision with root package name */
        private final p0 f22780g;

        /* renamed from: h, reason: collision with root package name */
        private final int f22781h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f22782i;

        public a(i<T> iVar, p0 p0Var, int i7) {
            this.f22779f = iVar;
            this.f22780g = p0Var;
            this.f22781h = i7;
        }

        private void a() {
            if (this.f22782i) {
                return;
            }
            i.this.f22764l.i(i.this.f22759g[this.f22781h], i.this.f22760h[this.f22781h], 0, null, i.this.f22777y);
            this.f22782i = true;
        }

        @Override // t1.q0
        public void b() {
        }

        public void c() {
            o2.a.f(i.this.f22761i[this.f22781h]);
            i.this.f22761i[this.f22781h] = false;
        }

        @Override // t1.q0
        public int d(long j7) {
            if (i.this.I()) {
                return 0;
            }
            int E = this.f22780g.E(j7, i.this.B);
            if (i.this.A != null) {
                E = Math.min(E, i.this.A.i(this.f22781h + 1) - this.f22780g.C());
            }
            this.f22780g.e0(E);
            if (E > 0) {
                a();
            }
            return E;
        }

        @Override // t1.q0
        public boolean i() {
            return !i.this.I() && this.f22780g.K(i.this.B);
        }

        @Override // t1.q0
        public int j(t1 t1Var, u0.g gVar, int i7) {
            if (i.this.I()) {
                return -3;
            }
            if (i.this.A != null && i.this.A.i(this.f22781h + 1) <= this.f22780g.C()) {
                return -3;
            }
            a();
            return this.f22780g.S(t1Var, gVar, i7, i.this.B);
        }
    }

    public interface b<T extends j> {
        void d(i<T> iVar);
    }

    public i(int i7, int[] iArr, s1[] s1VarArr, T t6, r0.a<i<T>> aVar, n2.b bVar, long j7, y yVar, w.a aVar2, g0 g0Var, e0.a aVar3) {
        this.f22758f = i7;
        int i8 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f22759g = iArr;
        this.f22760h = s1VarArr == null ? new s1[0] : s1VarArr;
        this.f22762j = t6;
        this.f22763k = aVar;
        this.f22764l = aVar3;
        this.f22765m = g0Var;
        this.f22766n = new h0("ChunkSampleStream");
        this.f22767o = new h();
        ArrayList<v1.a> arrayList = new ArrayList<>();
        this.f22768p = arrayList;
        this.f22769q = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f22771s = new p0[length];
        this.f22761i = new boolean[length];
        int i9 = length + 1;
        int[] iArr2 = new int[i9];
        p0[] p0VarArr = new p0[i9];
        p0 k7 = p0.k(bVar, yVar, aVar2);
        this.f22770r = k7;
        iArr2[0] = i7;
        p0VarArr[0] = k7;
        while (i8 < length) {
            p0 l7 = p0.l(bVar);
            this.f22771s[i8] = l7;
            int i10 = i8 + 1;
            p0VarArr[i10] = l7;
            iArr2[i10] = this.f22759g[i8];
            i8 = i10;
        }
        this.f22772t = new c(iArr2, p0VarArr);
        this.f22776x = j7;
        this.f22777y = j7;
    }

    private void B(int i7) {
        int min = Math.min(O(i7, 0), this.f22778z);
        if (min > 0) {
            m0.M0(this.f22768p, 0, min);
            this.f22778z -= min;
        }
    }

    private void C(int i7) {
        o2.a.f(!this.f22766n.j());
        int size = this.f22768p.size();
        while (true) {
            if (i7 >= size) {
                i7 = -1;
                break;
            } else if (!G(i7)) {
                break;
            } else {
                i7++;
            }
        }
        if (i7 == -1) {
            return;
        }
        long j7 = F().f22754h;
        v1.a D = D(i7);
        if (this.f22768p.isEmpty()) {
            this.f22776x = this.f22777y;
        }
        this.B = false;
        this.f22764l.D(this.f22758f, D.f22753g, j7);
    }

    private v1.a D(int i7) {
        v1.a aVar = this.f22768p.get(i7);
        ArrayList<v1.a> arrayList = this.f22768p;
        m0.M0(arrayList, i7, arrayList.size());
        this.f22778z = Math.max(this.f22778z, this.f22768p.size());
        p0 p0Var = this.f22770r;
        int i8 = 0;
        while (true) {
            p0Var.u(aVar.i(i8));
            p0[] p0VarArr = this.f22771s;
            if (i8 >= p0VarArr.length) {
                return aVar;
            }
            p0Var = p0VarArr[i8];
            i8++;
        }
    }

    private v1.a F() {
        return this.f22768p.get(r0.size() - 1);
    }

    private boolean G(int i7) {
        int C;
        v1.a aVar = this.f22768p.get(i7);
        if (this.f22770r.C() > aVar.i(0)) {
            return true;
        }
        int i8 = 0;
        do {
            p0[] p0VarArr = this.f22771s;
            if (i8 >= p0VarArr.length) {
                return false;
            }
            C = p0VarArr[i8].C();
            i8++;
        } while (C <= aVar.i(i8));
        return true;
    }

    private boolean H(f fVar) {
        return fVar instanceof v1.a;
    }

    private void J() {
        int O = O(this.f22770r.C(), this.f22778z - 1);
        while (true) {
            int i7 = this.f22778z;
            if (i7 > O) {
                return;
            }
            this.f22778z = i7 + 1;
            K(i7);
        }
    }

    private void K(int i7) {
        v1.a aVar = this.f22768p.get(i7);
        s1 s1Var = aVar.f22750d;
        if (!s1Var.equals(this.f22774v)) {
            this.f22764l.i(this.f22758f, s1Var, aVar.f22751e, aVar.f22752f, aVar.f22753g);
        }
        this.f22774v = s1Var;
    }

    private int O(int i7, int i8) {
        do {
            i8++;
            if (i8 >= this.f22768p.size()) {
                return this.f22768p.size() - 1;
            }
        } while (this.f22768p.get(i8).i(0) <= i7);
        return i8 - 1;
    }

    private void R() {
        this.f22770r.V();
        for (p0 p0Var : this.f22771s) {
            p0Var.V();
        }
    }

    public T E() {
        return this.f22762j;
    }

    boolean I() {
        return this.f22776x != -9223372036854775807L;
    }

    @Override // n2.h0.b
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public void m(f fVar, long j7, long j8, boolean z6) {
        this.f22773u = null;
        this.A = null;
        q qVar = new q(fVar.f22747a, fVar.f22748b, fVar.f(), fVar.e(), j7, j8, fVar.b());
        this.f22765m.a(fVar.f22747a);
        this.f22764l.r(qVar, fVar.f22749c, this.f22758f, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h);
        if (z6) {
            return;
        }
        if (I()) {
            R();
        } else if (H(fVar)) {
            D(this.f22768p.size() - 1);
            if (this.f22768p.isEmpty()) {
                this.f22776x = this.f22777y;
            }
        }
        this.f22763k.l(this);
    }

    @Override // n2.h0.b
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public void l(f fVar, long j7, long j8) {
        this.f22773u = null;
        this.f22762j.d(fVar);
        q qVar = new q(fVar.f22747a, fVar.f22748b, fVar.f(), fVar.e(), j7, j8, fVar.b());
        this.f22765m.a(fVar.f22747a);
        this.f22764l.u(qVar, fVar.f22749c, this.f22758f, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h);
        this.f22763k.l(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f1  */
    @Override // n2.h0.b
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h0.c o(f fVar, long j7, long j8, IOException iOException, int i7) {
        h0.c cVar;
        boolean z6;
        long b7 = fVar.b();
        boolean H = H(fVar);
        int size = this.f22768p.size() - 1;
        boolean z7 = (b7 != 0 && H && G(size)) ? false : true;
        q qVar = new q(fVar.f22747a, fVar.f22748b, fVar.f(), fVar.e(), j7, j8, b7);
        g0.c cVar2 = new g0.c(qVar, new t(fVar.f22749c, this.f22758f, fVar.f22750d, fVar.f22751e, fVar.f22752f, m0.Y0(fVar.f22753g), m0.Y0(fVar.f22754h)), iOException, i7);
        if (this.f22762j.i(fVar, z7, cVar2, this.f22765m)) {
            if (z7) {
                cVar = h0.f19436f;
                if (H) {
                    o2.a.f(D(size) == fVar);
                    if (this.f22768p.isEmpty()) {
                        this.f22776x = this.f22777y;
                    }
                }
                if (cVar == null) {
                    long c7 = this.f22765m.c(cVar2);
                    cVar = c7 != -9223372036854775807L ? h0.h(false, c7) : h0.f19437g;
                }
                z6 = !cVar.c();
                this.f22764l.w(qVar, fVar.f22749c, this.f22758f, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h, iOException, z6);
                if (z6) {
                    this.f22773u = null;
                    this.f22765m.a(fVar.f22747a);
                    this.f22763k.l(this);
                }
                return cVar;
            }
            r.i("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
        }
        cVar = null;
        if (cVar == null) {
        }
        z6 = !cVar.c();
        this.f22764l.w(qVar, fVar.f22749c, this.f22758f, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h, iOException, z6);
        if (z6) {
        }
        return cVar;
    }

    public void P() {
        Q(null);
    }

    public void Q(b<T> bVar) {
        this.f22775w = bVar;
        this.f22770r.R();
        for (p0 p0Var : this.f22771s) {
            p0Var.R();
        }
        this.f22766n.m(this);
    }

    public void S(long j7) {
        boolean Z;
        this.f22777y = j7;
        if (I()) {
            this.f22776x = j7;
            return;
        }
        v1.a aVar = null;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            if (i8 >= this.f22768p.size()) {
                break;
            }
            v1.a aVar2 = this.f22768p.get(i8);
            long j8 = aVar2.f22753g;
            if (j8 == j7 && aVar2.f22719k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (j8 > j7) {
                break;
            } else {
                i8++;
            }
        }
        if (aVar != null) {
            Z = this.f22770r.Y(aVar.i(0));
        } else {
            Z = this.f22770r.Z(j7, j7 < c());
        }
        if (Z) {
            this.f22778z = O(this.f22770r.C(), 0);
            p0[] p0VarArr = this.f22771s;
            int length = p0VarArr.length;
            while (i7 < length) {
                p0VarArr[i7].Z(j7, true);
                i7++;
            }
            return;
        }
        this.f22776x = j7;
        this.B = false;
        this.f22768p.clear();
        this.f22778z = 0;
        if (!this.f22766n.j()) {
            this.f22766n.g();
            R();
            return;
        }
        this.f22770r.r();
        p0[] p0VarArr2 = this.f22771s;
        int length2 = p0VarArr2.length;
        while (i7 < length2) {
            p0VarArr2[i7].r();
            i7++;
        }
        this.f22766n.f();
    }

    public i<T>.a T(long j7, int i7) {
        for (int i8 = 0; i8 < this.f22771s.length; i8++) {
            if (this.f22759g[i8] == i7) {
                o2.a.f(!this.f22761i[i8]);
                this.f22761i[i8] = true;
                this.f22771s[i8].Z(j7, true);
                return new a(this, this.f22771s[i8], i8);
            }
        }
        throw new IllegalStateException();
    }

    @Override // t1.r0
    public boolean a() {
        return this.f22766n.j();
    }

    @Override // t1.q0
    public void b() {
        this.f22766n.b();
        this.f22770r.N();
        if (this.f22766n.j()) {
            return;
        }
        this.f22762j.b();
    }

    @Override // t1.r0
    public long c() {
        if (I()) {
            return this.f22776x;
        }
        if (this.B) {
            return Long.MIN_VALUE;
        }
        return F().f22754h;
    }

    @Override // t1.q0
    public int d(long j7) {
        if (I()) {
            return 0;
        }
        int E = this.f22770r.E(j7, this.B);
        v1.a aVar = this.A;
        if (aVar != null) {
            E = Math.min(E, aVar.i(0) - this.f22770r.C());
        }
        this.f22770r.e0(E);
        J();
        return E;
    }

    @Override // t1.r0
    public long e() {
        if (this.B) {
            return Long.MIN_VALUE;
        }
        if (I()) {
            return this.f22776x;
        }
        long j7 = this.f22777y;
        v1.a F = F();
        if (!F.h()) {
            if (this.f22768p.size() > 1) {
                F = this.f22768p.get(r2.size() - 2);
            } else {
                F = null;
            }
        }
        if (F != null) {
            j7 = Math.max(j7, F.f22754h);
        }
        return Math.max(j7, this.f22770r.z());
    }

    public long f(long j7, j3 j3Var) {
        return this.f22762j.f(j7, j3Var);
    }

    @Override // t1.r0
    public boolean g(long j7) {
        List<v1.a> list;
        long j8;
        if (this.B || this.f22766n.j() || this.f22766n.i()) {
            return false;
        }
        boolean I = I();
        if (I) {
            list = Collections.emptyList();
            j8 = this.f22776x;
        } else {
            list = this.f22769q;
            j8 = F().f22754h;
        }
        this.f22762j.h(j7, j8, list, this.f22767o);
        h hVar = this.f22767o;
        boolean z6 = hVar.f22757b;
        f fVar = hVar.f22756a;
        hVar.a();
        if (z6) {
            this.f22776x = -9223372036854775807L;
            this.B = true;
            return true;
        }
        if (fVar == null) {
            return false;
        }
        this.f22773u = fVar;
        if (H(fVar)) {
            v1.a aVar = (v1.a) fVar;
            if (I) {
                long j9 = aVar.f22753g;
                long j10 = this.f22776x;
                if (j9 != j10) {
                    this.f22770r.b0(j10);
                    for (p0 p0Var : this.f22771s) {
                        p0Var.b0(this.f22776x);
                    }
                }
                this.f22776x = -9223372036854775807L;
            }
            aVar.k(this.f22772t);
            this.f22768p.add(aVar);
        } else if (fVar instanceof m) {
            ((m) fVar).g(this.f22772t);
        }
        this.f22764l.A(new q(fVar.f22747a, fVar.f22748b, this.f22766n.n(fVar, this, this.f22765m.d(fVar.f22749c))), fVar.f22749c, this.f22758f, fVar.f22750d, fVar.f22751e, fVar.f22752f, fVar.f22753g, fVar.f22754h);
        return true;
    }

    @Override // t1.r0
    public void h(long j7) {
        if (this.f22766n.i() || I()) {
            return;
        }
        if (!this.f22766n.j()) {
            int g7 = this.f22762j.g(j7, this.f22769q);
            if (g7 < this.f22768p.size()) {
                C(g7);
                return;
            }
            return;
        }
        f fVar = (f) o2.a.e(this.f22773u);
        if (!(H(fVar) && G(this.f22768p.size() - 1)) && this.f22762j.e(j7, fVar, this.f22769q)) {
            this.f22766n.f();
            if (H(fVar)) {
                this.A = (v1.a) fVar;
            }
        }
    }

    @Override // t1.q0
    public boolean i() {
        return !I() && this.f22770r.K(this.B);
    }

    @Override // t1.q0
    public int j(t1 t1Var, u0.g gVar, int i7) {
        if (I()) {
            return -3;
        }
        v1.a aVar = this.A;
        if (aVar != null && aVar.i(0) <= this.f22770r.C()) {
            return -3;
        }
        J();
        return this.f22770r.S(t1Var, gVar, i7, this.B);
    }

    @Override // n2.h0.f
    public void k() {
        this.f22770r.T();
        for (p0 p0Var : this.f22771s) {
            p0Var.T();
        }
        this.f22762j.a();
        b<T> bVar = this.f22775w;
        if (bVar != null) {
            bVar.d(this);
        }
    }

    public void t(long j7, boolean z6) {
        if (I()) {
            return;
        }
        int x6 = this.f22770r.x();
        this.f22770r.q(j7, z6, true);
        int x7 = this.f22770r.x();
        if (x7 > x6) {
            long y6 = this.f22770r.y();
            int i7 = 0;
            while (true) {
                p0[] p0VarArr = this.f22771s;
                if (i7 >= p0VarArr.length) {
                    break;
                }
                p0VarArr[i7].q(y6, z6, this.f22761i[i7]);
                i7++;
            }
        }
        B(x7);
    }
}
