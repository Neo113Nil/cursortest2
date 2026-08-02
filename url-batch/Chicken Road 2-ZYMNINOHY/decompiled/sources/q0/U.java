package q0;

import T.C0096n;
import T.C0097o;
import W.AbstractC0108a;
import W.C0112e;
import a.AbstractC0124a;
import a0.p0;
import android.net.Uri;
import android.os.Handler;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import t0.C1427b;
import v0.ExecutorC1449a;

/* loaded from: classes.dex */
public final class U implements InterfaceC1383z, y0.p, u0.i, u0.l, Z {

    /* renamed from: Q, reason: collision with root package name */
    public static final Map f14881Q;

    /* renamed from: R, reason: collision with root package name */
    public static final C0097o f14882R;

    /* renamed from: A, reason: collision with root package name */
    public G1.c f14883A;

    /* renamed from: B, reason: collision with root package name */
    public y0.y f14884B;

    /* renamed from: C, reason: collision with root package name */
    public long f14885C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f14886D;

    /* renamed from: E, reason: collision with root package name */
    public int f14887E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f14888F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f14889G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f14890H;

    /* renamed from: I, reason: collision with root package name */
    public int f14891I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f14892J;

    /* renamed from: K, reason: collision with root package name */
    public long f14893K;
    public long L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f14894M;

    /* renamed from: N, reason: collision with root package name */
    public int f14895N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f14896O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f14897P;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f14898a;

    /* renamed from: b, reason: collision with root package name */
    public final Y.h f14899b;

    /* renamed from: c, reason: collision with root package name */
    public final f0.i f14900c;

    /* renamed from: d, reason: collision with root package name */
    public final C1427b f14901d;

    /* renamed from: e, reason: collision with root package name */
    public final f0.e f14902e;

    /* renamed from: f, reason: collision with root package name */
    public final f0.e f14903f;

    /* renamed from: g, reason: collision with root package name */
    public final W f14904g;

    /* renamed from: h, reason: collision with root package name */
    public final B1.j f14905h;

    /* renamed from: i, reason: collision with root package name */
    public final long f14906i;

    /* renamed from: j, reason: collision with root package name */
    public final C0097o f14907j;

    /* renamed from: k, reason: collision with root package name */
    public final long f14908k;

    /* renamed from: l, reason: collision with root package name */
    public final u0.n f14909l;

    /* renamed from: m, reason: collision with root package name */
    public final B1.j f14910m;
    public final C0112e n;
    public final M o;

    /* renamed from: p, reason: collision with root package name */
    public final M f14911p;

    /* renamed from: q, reason: collision with root package name */
    public final Handler f14912q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC1382y f14913r;

    /* renamed from: s, reason: collision with root package name */
    public L0.b f14914s;

    /* renamed from: t, reason: collision with root package name */
    public P[] f14915t;

    /* renamed from: u, reason: collision with root package name */
    public a0[] f14916u;
    public T[] v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f14917w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f14918x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f14919y;
    public boolean z;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f14881Q = Collections.unmodifiableMap(hashMap);
        C0096n c0096n = new C0096n();
        c0096n.f2819a = "icy";
        c0096n.f2831m = T.F.n("application/x-icy");
        f14882R = new C0097o(c0096n);
    }

    public U(Uri uri, Y.h hVar, B1.j jVar, f0.i iVar, f0.e eVar, C1427b c1427b, f0.e eVar2, W w4, B1.j jVar2, int i4, C0097o c0097o, long j4, ExecutorC1449a executorC1449a) {
        this.f14898a = uri;
        this.f14899b = hVar;
        this.f14900c = iVar;
        this.f14903f = eVar;
        this.f14901d = c1427b;
        this.f14902e = eVar2;
        this.f14904g = w4;
        this.f14905h = jVar2;
        this.f14906i = i4;
        this.f14907j = c0097o;
        this.f14909l = executorC1449a != null ? new u0.n(executorC1449a) : new u0.n("ProgressiveMediaPeriod");
        this.f14910m = jVar;
        this.f14908k = j4;
        this.n = new C0112e();
        this.o = new M(this, 1);
        this.f14911p = new M(this, 2);
        this.f14912q = W.J.o(null);
        this.v = new T[0];
        this.f14916u = new a0[0];
        this.f14915t = new P[0];
        this.L = -9223372036854775807L;
        this.f14887E = 1;
    }

    public final void A() {
        long j4 = this.f14908k;
        if (this.f14897P || this.f14918x || !this.f14917w || this.f14884B == null) {
            return;
        }
        for (a0 a0Var : this.f14916u) {
            if (a0Var.w() == null) {
                return;
            }
        }
        C0112e c0112e = this.n;
        synchronized (c0112e) {
            c0112e.f3303b = false;
        }
        int length = this.f14916u.length;
        T.U[] uArr = new T.U[length];
        boolean[] zArr = new boolean[length];
        for (int i4 = 0; i4 < length; i4++) {
            C0097o w4 = this.f14916u[i4].w();
            w4.getClass();
            String str = w4.n;
            boolean i5 = T.F.i(str);
            boolean z = i5 || T.F.m(str);
            zArr[i4] = z;
            this.f14919y = z | this.f14919y;
            this.z = j4 != -9223372036854775807L && length == 1 && T.F.k(str);
            L0.b bVar = this.f14914s;
            if (bVar != null) {
                int i6 = bVar.f1604a;
                if (i5 || this.v[i4].f14880b) {
                    T.E e4 = w4.f2867l;
                    T.E e5 = e4 == null ? new T.E(bVar) : e4.a(bVar);
                    C0096n a3 = w4.a();
                    a3.f2829k = e5;
                    w4 = new C0097o(a3);
                }
                if (i5 && w4.f2863h == -1 && w4.f2864i == -1 && i6 != -1) {
                    C0096n a4 = w4.a();
                    a4.f2826h = i6;
                    w4 = new C0097o(a4);
                }
            }
            int d4 = this.f14900c.d(w4);
            C0096n a5 = w4.a();
            a5.f2818N = d4;
            C0097o c0097o = new C0097o(a5);
            uArr[i4] = new T.U(Integer.toString(i4), c0097o);
            this.f14890H = c0097o.f2873t | this.f14890H;
        }
        this.f14883A = new G1.c(new j0(uArr), zArr);
        if (this.z && this.f14885C == -9223372036854775807L) {
            this.f14885C = j4;
            this.f14884B = new N(this, this.f14884B);
        }
        this.f14904g.y(this.f14885C, this.f14884B, this.f14886D);
        this.f14918x = true;
        InterfaceC1382y interfaceC1382y = this.f14913r;
        interfaceC1382y.getClass();
        interfaceC1382y.m(this);
    }

    public final void B(int i4) {
        k();
        G1.c cVar = this.f14883A;
        boolean[] zArr = (boolean[]) cVar.f838e;
        if (zArr[i4]) {
            return;
        }
        C0097o c0097o = ((j0) cVar.f835b).a(i4).f2708d[0];
        this.f14902e.b(T.F.h(c0097o.n), c0097o, 0, null, this.f14893K);
        zArr[i4] = true;
    }

    public final void C(int i4) {
        k();
        if (this.f14894M) {
            if ((!this.f14919y || ((boolean[]) this.f14883A.f836c)[i4]) && !this.f14916u[i4].x(false)) {
                this.L = 0L;
                this.f14894M = false;
                this.f14889G = true;
                this.f14893K = 0L;
                this.f14895N = 0;
                for (a0 a0Var : this.f14916u) {
                    a0Var.E(false);
                }
                InterfaceC1382y interfaceC1382y = this.f14913r;
                interfaceC1382y.getClass();
                interfaceC1382y.s(this);
            }
        }
    }

    public final y0.F D(T t4) {
        int length = this.f14916u.length;
        for (int i4 = 0; i4 < length; i4++) {
            if (t4.equals(this.v[i4])) {
                return this.f14916u[i4];
            }
        }
        if (this.f14917w) {
            AbstractC0108a.s("ProgressiveMediaPeriod", "Extractor added new track (id=" + t4.f14879a + ") after finishing tracks.");
            return new y0.m();
        }
        f0.i iVar = this.f14900c;
        iVar.getClass();
        a0 a0Var = new a0(this.f14905h, iVar, this.f14903f);
        P p2 = new P(a0Var);
        a0Var.f14964f = this;
        int i5 = length + 1;
        T[] tArr = (T[]) Arrays.copyOf(this.v, i5);
        tArr[length] = t4;
        this.v = tArr;
        a0[] a0VarArr = (a0[]) Arrays.copyOf(this.f14916u, i5);
        a0VarArr[length] = a0Var;
        this.f14916u = a0VarArr;
        P[] pArr = (P[]) Arrays.copyOf(this.f14915t, i5);
        pArr[length] = p2;
        this.f14915t = pArr;
        return p2;
    }

    public final void E(y0.y yVar) {
        this.f14884B = this.f14914s == null ? yVar : new A0.b(-9223372036854775807L);
        this.f14885C = yVar.g();
        boolean z = !this.f14892J && yVar.g() == -9223372036854775807L;
        this.f14886D = z;
        this.f14887E = z ? 7 : 1;
        if (this.f14918x) {
            this.f14904g.y(this.f14885C, yVar, z);
        } else {
            A();
        }
    }

    public final void F() {
        Q q4 = new Q(this, this.f14898a, this.f14899b, this.f14910m, this, this.n);
        if (this.f14918x) {
            AbstractC0124a.t(y());
            long j4 = this.f14885C;
            if (j4 != -9223372036854775807L && this.L > j4) {
                this.f14896O = true;
                this.L = -9223372036854775807L;
                return;
            }
            y0.y yVar = this.f14884B;
            yVar.getClass();
            long j5 = yVar.e(this.L).f16222a.f16226b;
            long j6 = this.L;
            q4.f14869f.f2881a = j5;
            q4.f14872i = j6;
            q4.f14871h = true;
            q4.f14875l = false;
            for (a0 a0Var : this.f14916u) {
                a0Var.f14976t = this.L;
            }
            this.L = -9223372036854775807L;
        }
        this.f14895N = n();
        this.f14909l.f(q4, this, this.f14901d.g(this.f14887E));
    }

    public final boolean G() {
        return this.f14889G || y();
    }

    @Override // q0.Z
    public final void a() {
        this.f14912q.post(this.o);
    }

    @Override // q0.InterfaceC1383z
    public final long b(long j4, p0 p0Var) {
        k();
        if (!this.f14884B.c()) {
            return 0L;
        }
        y0.x e4 = this.f14884B.e(j4);
        return p0Var.a(j4, e4.f16222a.f16225a, e4.f16223b.f16225a);
    }

    @Override // u0.l
    public final void c() {
        for (a0 a0Var : this.f14916u) {
            a0Var.D();
        }
        B1.j jVar = this.f14910m;
        y0.n nVar = (y0.n) jVar.f202c;
        if (nVar != null) {
            nVar.release();
            jVar.f202c = null;
        }
        jVar.f203d = null;
    }

    @Override // q0.InterfaceC1383z
    public final long d(t0.t[] tVarArr, boolean[] zArr, b0[] b0VarArr, boolean[] zArr2, long j4) {
        t0.t tVar;
        k();
        G1.c cVar = this.f14883A;
        j0 j0Var = (j0) cVar.f835b;
        boolean[] zArr3 = (boolean[]) cVar.f837d;
        int i4 = this.f14891I;
        int i5 = 0;
        for (int i6 = 0; i6 < tVarArr.length; i6++) {
            b0 b0Var = b0VarArr[i6];
            if (b0Var != null && (tVarArr[i6] == null || !zArr[i6])) {
                int i7 = ((S) b0Var).f14877a;
                AbstractC0124a.t(zArr3[i7]);
                this.f14891I--;
                zArr3[i7] = false;
                b0VarArr[i6] = null;
            }
        }
        boolean z = !this.f14888F ? j4 == 0 || this.z : i4 != 0;
        for (int i8 = 0; i8 < tVarArr.length; i8++) {
            if (b0VarArr[i8] == null && (tVar = tVarArr[i8]) != null) {
                AbstractC0124a.t(tVar.length() == 1);
                AbstractC0124a.t(tVar.h(0) == 0);
                int b4 = j0Var.b(tVar.c());
                AbstractC0124a.t(!zArr3[b4]);
                this.f14891I++;
                zArr3[b4] = true;
                this.f14890H = tVar.l().f2873t | this.f14890H;
                b0VarArr[i8] = new S(this, b4);
                zArr2[i8] = true;
                if (!z) {
                    a0 a0Var = this.f14916u[b4];
                    z = (a0Var.t() == 0 || a0Var.G(j4, true)) ? false : true;
                }
            }
        }
        if (this.f14891I == 0) {
            this.f14894M = false;
            this.f14889G = false;
            this.f14890H = false;
            u0.n nVar = this.f14909l;
            if (nVar.d()) {
                a0[] a0VarArr = this.f14916u;
                int length = a0VarArr.length;
                while (i5 < length) {
                    a0VarArr[i5].k();
                    i5++;
                }
                nVar.b();
            } else {
                this.f14896O = false;
                for (a0 a0Var2 : this.f14916u) {
                    a0Var2.E(false);
                }
            }
        } else if (z) {
            j4 = i(j4);
            while (i5 < b0VarArr.length) {
                if (b0VarArr[i5] != null) {
                    zArr2[i5] = true;
                }
                i5++;
            }
        }
        this.f14888F = true;
        return j4;
    }

    @Override // q0.d0
    public final long e() {
        return u();
    }

    @Override // q0.InterfaceC1383z
    public final void f(InterfaceC1382y interfaceC1382y, long j4) {
        this.f14913r = interfaceC1382y;
        C0097o c0097o = this.f14907j;
        if (c0097o == null) {
            this.n.c();
            F();
        } else {
            z(0, 3).d(c0097o);
            E(new y0.v(-9223372036854775807L, new long[]{0}, new long[]{0}));
            r();
            this.L = j4;
        }
    }

    @Override // u0.i
    public final void g(u0.k kVar, long j4, long j5) {
        Q q4 = (Q) kVar;
        if (this.f14885C == -9223372036854775807L && this.f14884B != null) {
            long s4 = s(true);
            long j6 = s4 == Long.MIN_VALUE ? 0L : s4 + 10000;
            this.f14885C = j6;
            this.f14904g.y(j6, this.f14884B, this.f14886D);
        }
        Y.z zVar = q4.f14865b;
        C1377t c1377t = new C1377t(q4.f14873j, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f14901d.getClass();
        this.f14902e.e(c1377t, 1, -1, null, 0, null, q4.f14872i, this.f14885C);
        this.f14896O = true;
        InterfaceC1382y interfaceC1382y = this.f14913r;
        interfaceC1382y.getClass();
        interfaceC1382y.s(this);
    }

    @Override // q0.InterfaceC1383z
    public final void h() {
        int g4 = this.f14901d.g(this.f14887E);
        u0.n nVar = this.f14909l;
        IOException iOException = nVar.f15486c;
        if (iOException != null) {
            throw iOException;
        }
        u0.j jVar = nVar.f15485b;
        if (jVar != null) {
            if (g4 == Integer.MIN_VALUE) {
                g4 = jVar.f15471a;
            }
            IOException iOException2 = jVar.f15475e;
            if (iOException2 != null && jVar.f15476f > g4) {
                throw iOException2;
            }
        }
        if (this.f14896O && !this.f14918x) {
            throw T.G.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        if (r3 != false) goto L51;
     */
    @Override // q0.InterfaceC1383z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long i(long j4) {
        k();
        boolean[] zArr = (boolean[]) this.f14883A.f836c;
        if (!this.f14884B.c()) {
            j4 = 0;
        }
        this.f14889G = false;
        boolean z = true;
        boolean z4 = this.f14893K == j4;
        this.f14893K = j4;
        if (y()) {
            this.L = j4;
            return j4;
        }
        int i4 = this.f14887E;
        u0.n nVar = this.f14909l;
        if (i4 != 7 && (this.f14896O || nVar.d())) {
            int length = this.f14916u.length;
            for (int i5 = 0; i5 < length; i5++) {
                a0 a0Var = this.f14916u[i5];
                if (this.f14915t[i5].f14863d.get() == O.f14856a && (a0Var.t() != 0 || !z4)) {
                    if (!(this.z ? a0Var.F(a0Var.f14973q) : a0Var.G(j4, this.f14896O)) && (zArr[i5] || !this.f14919y)) {
                        z = false;
                        break;
                    }
                }
            }
        }
        this.f14894M = false;
        this.L = j4;
        this.f14896O = false;
        this.f14890H = false;
        if (nVar.d()) {
            for (a0 a0Var2 : this.f14916u) {
                a0Var2.k();
            }
            nVar.b();
            return j4;
        }
        nVar.f15486c = null;
        for (a0 a0Var3 : this.f14916u) {
            a0Var3.E(false);
        }
        return j4;
    }

    @Override // q0.InterfaceC1383z
    public final void j(long j4) {
        if (this.z) {
            return;
        }
        k();
        if (y()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f14883A.f837d;
        int length = this.f14916u.length;
        for (int i4 = 0; i4 < length; i4++) {
            this.f14916u[i4].j(j4, zArr[i4]);
        }
    }

    public final void k() {
        AbstractC0124a.t(this.f14918x);
        this.f14883A.getClass();
        this.f14884B.getClass();
    }

    @Override // q0.d0
    public final boolean l() {
        boolean z;
        if (!this.f14909l.d()) {
            return false;
        }
        C0112e c0112e = this.n;
        synchronized (c0112e) {
            z = c0112e.f3303b;
        }
        return z;
    }

    @Override // u0.i
    public final void m(u0.k kVar, long j4, long j5, boolean z) {
        Q q4 = (Q) kVar;
        Y.z zVar = q4.f14865b;
        C1377t c1377t = new C1377t(q4.f14873j, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        this.f14901d.getClass();
        this.f14902e.c(c1377t, 1, -1, null, 0, null, q4.f14872i, this.f14885C);
        if (z) {
            return;
        }
        for (a0 a0Var : this.f14916u) {
            a0Var.E(false);
        }
        if (this.f14891I > 0) {
            InterfaceC1382y interfaceC1382y = this.f14913r;
            interfaceC1382y.getClass();
            interfaceC1382y.s(this);
        }
    }

    public final int n() {
        int i4 = 0;
        for (a0 a0Var : this.f14916u) {
            i4 += a0Var.f14973q + a0Var.f14972p;
        }
        return i4;
    }

    @Override // u0.i
    public final void o(u0.k kVar, long j4, long j5, int i4) {
        Q q4 = (Q) kVar;
        Y.z zVar = q4.f14865b;
        this.f14902e.h(i4 == 0 ? new C1377t(q4.f14873j, j4) : new C1377t(q4.f14873j, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b), 1, -1, null, 0, null, q4.f14872i, this.f14885C, i4);
    }

    @Override // u0.i
    public final g1.e p(u0.k kVar, long j4, long j5, IOException iOException, int i4) {
        long min;
        g1.e eVar;
        y0.y yVar;
        Q q4 = (Q) kVar;
        Y.z zVar = q4.f14865b;
        C1377t c1377t = new C1377t(q4.f14873j, zVar.f3754c, zVar.f3755d, j4, j5, zVar.f3753b);
        String str = W.J.f3263a;
        this.f14901d.getClass();
        for (Throwable th = iOException; th != null; th = th.getCause()) {
            if ((th instanceof T.G) || (th instanceof FileNotFoundException) || (th instanceof Y.s) || (th instanceof u0.m) || ((th instanceof Y.i) && ((Y.i) th).f3694a == 2008)) {
                min = -9223372036854775807L;
                break;
            }
        }
        min = Math.min((i4 - 1) * AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT, 5000);
        if (min == -9223372036854775807L) {
            eVar = u0.n.f15483f;
        } else {
            int n = n();
            boolean z = false;
            int i5 = n > this.f14895N ? 1 : 0;
            if (this.f14892J || !((yVar = this.f14884B) == null || yVar.g() == -9223372036854775807L)) {
                this.f14895N = n;
            } else if (!this.f14918x || G()) {
                this.f14889G = this.f14918x;
                this.f14893K = 0L;
                this.f14895N = 0;
                for (a0 a0Var : this.f14916u) {
                    a0Var.E(false);
                }
                q4.f14869f.f2881a = 0L;
                q4.f14872i = 0L;
                q4.f14871h = true;
                q4.f14875l = false;
            } else {
                this.f14894M = true;
                eVar = u0.n.f15482e;
            }
            eVar = new g1.e(i5, min, z);
        }
        this.f14902e.f(c1377t, 1, -1, null, 0, null, q4.f14872i, this.f14885C, iOException, !eVar.a());
        return eVar;
    }

    @Override // q0.InterfaceC1383z
    public final long q() {
        if (this.f14890H) {
            this.f14890H = false;
            return this.f14893K;
        }
        if (!this.f14889G) {
            return -9223372036854775807L;
        }
        if (!this.f14896O && n() <= this.f14895N) {
            return -9223372036854775807L;
        }
        this.f14889G = false;
        return this.f14893K;
    }

    @Override // y0.p
    public final void r() {
        this.f14917w = true;
        this.f14912q.post(this.o);
    }

    public final long s(boolean z) {
        int i4;
        long j4 = Long.MIN_VALUE;
        while (i4 < this.f14916u.length) {
            if (!z) {
                G1.c cVar = this.f14883A;
                cVar.getClass();
                i4 = ((boolean[]) cVar.f837d)[i4] ? 0 : i4 + 1;
            }
            j4 = Math.max(j4, this.f14916u[i4].q());
        }
        return j4;
    }

    @Override // q0.InterfaceC1383z
    public final j0 t() {
        k();
        return (j0) this.f14883A.f835b;
    }

    @Override // q0.d0
    public final long u() {
        long j4;
        boolean z;
        k();
        if (this.f14896O || this.f14891I == 0) {
            return Long.MIN_VALUE;
        }
        if (y()) {
            return this.L;
        }
        if (this.f14919y) {
            int length = this.f14916u.length;
            j4 = Long.MAX_VALUE;
            for (int i4 = 0; i4 < length; i4++) {
                G1.c cVar = this.f14883A;
                if (((boolean[]) cVar.f836c)[i4] && ((boolean[]) cVar.f837d)[i4]) {
                    a0 a0Var = this.f14916u[i4];
                    synchronized (a0Var) {
                        z = a0Var.f14978w;
                    }
                    if (!z) {
                        j4 = Math.min(j4, this.f14916u[i4].q());
                    }
                }
            }
        } else {
            j4 = Long.MAX_VALUE;
        }
        if (j4 == Long.MAX_VALUE) {
            j4 = s(false);
        }
        return j4 == Long.MIN_VALUE ? this.f14893K : j4;
    }

    @Override // q0.d0
    public final boolean v(a0.Q q4) {
        if (this.f14896O) {
            return false;
        }
        u0.n nVar = this.f14909l;
        if (nVar.c() || this.f14894M) {
            return false;
        }
        if ((this.f14918x || this.f14907j != null) && this.f14891I == 0) {
            return false;
        }
        boolean c4 = this.n.c();
        if (nVar.d()) {
            return c4;
        }
        F();
        return true;
    }

    @Override // y0.p
    public final void x(y0.y yVar) {
        this.f14912q.post(new g0.p(this, 12, yVar));
    }

    public final boolean y() {
        return this.L != -9223372036854775807L;
    }

    @Override // y0.p
    public final y0.F z(int i4, int i5) {
        return D(new T(i4, false));
    }

    @Override // q0.d0
    public final void w(long j4) {
    }
}
