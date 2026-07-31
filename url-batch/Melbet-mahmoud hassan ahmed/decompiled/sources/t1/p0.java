package t1;

import r0.s1;
import r0.t1;
import t1.p0;
import v0.o;
import v0.w;
import v0.y;
import w0.e0;

/* loaded from: classes.dex */
public class p0 implements w0.e0 {
    private s1 A;
    private s1 B;
    private int C;
    private boolean D;
    private boolean E;
    private long F;
    private boolean G;

    /* renamed from: a, reason: collision with root package name */
    private final n0 f22150a;

    /* renamed from: d, reason: collision with root package name */
    private final v0.y f22153d;

    /* renamed from: e, reason: collision with root package name */
    private final w.a f22154e;

    /* renamed from: f, reason: collision with root package name */
    private d f22155f;

    /* renamed from: g, reason: collision with root package name */
    private s1 f22156g;

    /* renamed from: h, reason: collision with root package name */
    private v0.o f22157h;

    /* renamed from: p, reason: collision with root package name */
    private int f22165p;

    /* renamed from: q, reason: collision with root package name */
    private int f22166q;

    /* renamed from: r, reason: collision with root package name */
    private int f22167r;

    /* renamed from: s, reason: collision with root package name */
    private int f22168s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f22172w;

    /* renamed from: z, reason: collision with root package name */
    private boolean f22175z;

    /* renamed from: b, reason: collision with root package name */
    private final b f22151b = new b();

    /* renamed from: i, reason: collision with root package name */
    private int f22158i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private int[] f22159j = new int[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f22160k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f22163n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f22162m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f22161l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private e0.a[] f22164o = new e0.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final v0<c> f22152c = new v0<>(new o2.h() { // from class: t1.o0
        @Override // o2.h
        public final void accept(Object obj) {
            p0.L((p0.c) obj);
        }
    });

    /* renamed from: t, reason: collision with root package name */
    private long f22169t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f22170u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f22171v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f22174y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f22173x = true;

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f22176a;

        /* renamed from: b, reason: collision with root package name */
        public long f22177b;

        /* renamed from: c, reason: collision with root package name */
        public e0.a f22178c;

        b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final s1 f22179a;

        /* renamed from: b, reason: collision with root package name */
        public final y.b f22180b;

        private c(s1 s1Var, y.b bVar) {
            this.f22179a = s1Var;
            this.f22180b = bVar;
        }
    }

    public interface d {
        void b(s1 s1Var);
    }

    protected p0(n2.b bVar, v0.y yVar, w.a aVar) {
        this.f22153d = yVar;
        this.f22154e = aVar;
        this.f22150a = new n0(bVar);
    }

    private long B(int i7) {
        long j7 = Long.MIN_VALUE;
        if (i7 == 0) {
            return Long.MIN_VALUE;
        }
        int D = D(i7 - 1);
        for (int i8 = 0; i8 < i7; i8++) {
            j7 = Math.max(j7, this.f22163n[D]);
            if ((this.f22162m[D] & 1) != 0) {
                break;
            }
            D--;
            if (D == -1) {
                D = this.f22158i - 1;
            }
        }
        return j7;
    }

    private int D(int i7) {
        int i8 = this.f22167r + i7;
        int i9 = this.f22158i;
        return i8 < i9 ? i8 : i8 - i9;
    }

    private boolean H() {
        return this.f22168s != this.f22165p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void L(c cVar) {
        cVar.f22180b.a();
    }

    private boolean M(int i7) {
        v0.o oVar = this.f22157h;
        return oVar == null || oVar.getState() == 4 || ((this.f22162m[i7] & 1073741824) == 0 && this.f22157h.a());
    }

    private void O(s1 s1Var, t1 t1Var) {
        s1 s1Var2 = this.f22156g;
        boolean z6 = s1Var2 == null;
        v0.m mVar = z6 ? null : s1Var2.f20959t;
        this.f22156g = s1Var;
        v0.m mVar2 = s1Var.f20959t;
        v0.y yVar = this.f22153d;
        t1Var.f21040b = yVar != null ? s1Var.c(yVar.e(s1Var)) : s1Var;
        t1Var.f21039a = this.f22157h;
        if (this.f22153d == null) {
            return;
        }
        if (z6 || !o2.m0.c(mVar, mVar2)) {
            v0.o oVar = this.f22157h;
            v0.o d7 = this.f22153d.d(this.f22154e, s1Var);
            this.f22157h = d7;
            t1Var.f21039a = d7;
            if (oVar != null) {
                oVar.c(this.f22154e);
            }
        }
    }

    private synchronized int P(t1 t1Var, u0.g gVar, boolean z6, boolean z7, b bVar) {
        gVar.f22412i = false;
        if (!H()) {
            if (!z7 && !this.f22172w) {
                s1 s1Var = this.B;
                if (s1Var == null || (!z6 && s1Var == this.f22156g)) {
                    return -3;
                }
                O((s1) o2.a.e(s1Var), t1Var);
                return -5;
            }
            gVar.p(4);
            return -4;
        }
        s1 s1Var2 = this.f22152c.e(C()).f22179a;
        if (!z6 && s1Var2 == this.f22156g) {
            int D = D(this.f22168s);
            if (!M(D)) {
                gVar.f22412i = true;
                return -3;
            }
            gVar.p(this.f22162m[D]);
            long j7 = this.f22163n[D];
            gVar.f22413j = j7;
            if (j7 < this.f22169t) {
                gVar.g(Integer.MIN_VALUE);
            }
            bVar.f22176a = this.f22161l[D];
            bVar.f22177b = this.f22160k[D];
            bVar.f22178c = this.f22164o[D];
            return -4;
        }
        O(s1Var2, t1Var);
        return -5;
    }

    private void U() {
        v0.o oVar = this.f22157h;
        if (oVar != null) {
            oVar.c(this.f22154e);
            this.f22157h = null;
            this.f22156g = null;
        }
    }

    private synchronized void X() {
        this.f22168s = 0;
        this.f22150a.o();
    }

    private synchronized boolean c0(s1 s1Var) {
        this.f22174y = false;
        if (o2.m0.c(s1Var, this.B)) {
            return false;
        }
        if (!this.f22152c.g() && this.f22152c.f().f22179a.equals(s1Var)) {
            s1Var = this.f22152c.f().f22179a;
        }
        this.B = s1Var;
        s1 s1Var2 = this.B;
        this.D = o2.v.a(s1Var2.f20956q, s1Var2.f20953n);
        this.E = false;
        return true;
    }

    private synchronized boolean h(long j7) {
        if (this.f22165p == 0) {
            return j7 > this.f22170u;
        }
        if (A() >= j7) {
            return false;
        }
        t(this.f22166q + j(j7));
        return true;
    }

    private synchronized void i(long j7, int i7, long j8, int i8, e0.a aVar) {
        int i9 = this.f22165p;
        if (i9 > 0) {
            int D = D(i9 - 1);
            o2.a.a(this.f22160k[D] + ((long) this.f22161l[D]) <= j8);
        }
        this.f22172w = (536870912 & i7) != 0;
        this.f22171v = Math.max(this.f22171v, j7);
        int D2 = D(this.f22165p);
        this.f22163n[D2] = j7;
        this.f22160k[D2] = j8;
        this.f22161l[D2] = i8;
        this.f22162m[D2] = i7;
        this.f22164o[D2] = aVar;
        this.f22159j[D2] = this.C;
        if (this.f22152c.g() || !this.f22152c.f().f22179a.equals(this.B)) {
            v0.y yVar = this.f22153d;
            this.f22152c.a(G(), new c((s1) o2.a.e(this.B), yVar != null ? yVar.b(this.f22154e, this.B) : y.b.f22717a));
        }
        int i10 = this.f22165p + 1;
        this.f22165p = i10;
        int i11 = this.f22158i;
        if (i10 == i11) {
            int i12 = i11 + 1000;
            int[] iArr = new int[i12];
            long[] jArr = new long[i12];
            long[] jArr2 = new long[i12];
            int[] iArr2 = new int[i12];
            int[] iArr3 = new int[i12];
            e0.a[] aVarArr = new e0.a[i12];
            int i13 = this.f22167r;
            int i14 = i11 - i13;
            System.arraycopy(this.f22160k, i13, jArr, 0, i14);
            System.arraycopy(this.f22163n, this.f22167r, jArr2, 0, i14);
            System.arraycopy(this.f22162m, this.f22167r, iArr2, 0, i14);
            System.arraycopy(this.f22161l, this.f22167r, iArr3, 0, i14);
            System.arraycopy(this.f22164o, this.f22167r, aVarArr, 0, i14);
            System.arraycopy(this.f22159j, this.f22167r, iArr, 0, i14);
            int i15 = this.f22167r;
            System.arraycopy(this.f22160k, 0, jArr, i14, i15);
            System.arraycopy(this.f22163n, 0, jArr2, i14, i15);
            System.arraycopy(this.f22162m, 0, iArr2, i14, i15);
            System.arraycopy(this.f22161l, 0, iArr3, i14, i15);
            System.arraycopy(this.f22164o, 0, aVarArr, i14, i15);
            System.arraycopy(this.f22159j, 0, iArr, i14, i15);
            this.f22160k = jArr;
            this.f22163n = jArr2;
            this.f22162m = iArr2;
            this.f22161l = iArr3;
            this.f22164o = aVarArr;
            this.f22159j = iArr;
            this.f22167r = 0;
            this.f22158i = i12;
        }
    }

    private int j(long j7) {
        int i7 = this.f22165p;
        int D = D(i7 - 1);
        while (i7 > this.f22168s && this.f22163n[D] >= j7) {
            i7--;
            D--;
            if (D == -1) {
                D = this.f22158i - 1;
            }
        }
        return i7;
    }

    public static p0 k(n2.b bVar, v0.y yVar, w.a aVar) {
        return new p0(bVar, (v0.y) o2.a.e(yVar), (w.a) o2.a.e(aVar));
    }

    public static p0 l(n2.b bVar) {
        return new p0(bVar, null, null);
    }

    private synchronized long m(long j7, boolean z6, boolean z7) {
        int i7;
        int i8 = this.f22165p;
        if (i8 != 0) {
            long[] jArr = this.f22163n;
            int i9 = this.f22167r;
            if (j7 >= jArr[i9]) {
                if (z7 && (i7 = this.f22168s) != i8) {
                    i8 = i7 + 1;
                }
                int v6 = v(i9, i8, j7, z6);
                if (v6 == -1) {
                    return -1L;
                }
                return p(v6);
            }
        }
        return -1L;
    }

    private synchronized long n() {
        int i7 = this.f22165p;
        if (i7 == 0) {
            return -1L;
        }
        return p(i7);
    }

    private long p(int i7) {
        this.f22170u = Math.max(this.f22170u, B(i7));
        this.f22165p -= i7;
        int i8 = this.f22166q + i7;
        this.f22166q = i8;
        int i9 = this.f22167r + i7;
        this.f22167r = i9;
        int i10 = this.f22158i;
        if (i9 >= i10) {
            this.f22167r = i9 - i10;
        }
        int i11 = this.f22168s - i7;
        this.f22168s = i11;
        if (i11 < 0) {
            this.f22168s = 0;
        }
        this.f22152c.d(i8);
        if (this.f22165p != 0) {
            return this.f22160k[this.f22167r];
        }
        int i12 = this.f22167r;
        if (i12 == 0) {
            i12 = this.f22158i;
        }
        return this.f22160k[i12 - 1] + this.f22161l[r6];
    }

    private long t(int i7) {
        int G = G() - i7;
        boolean z6 = false;
        o2.a.a(G >= 0 && G <= this.f22165p - this.f22168s);
        int i8 = this.f22165p - G;
        this.f22165p = i8;
        this.f22171v = Math.max(this.f22170u, B(i8));
        if (G == 0 && this.f22172w) {
            z6 = true;
        }
        this.f22172w = z6;
        this.f22152c.c(i7);
        int i9 = this.f22165p;
        if (i9 == 0) {
            return 0L;
        }
        return this.f22160k[D(i9 - 1)] + this.f22161l[r9];
    }

    private int v(int i7, int i8, long j7, boolean z6) {
        int i9 = -1;
        for (int i10 = 0; i10 < i8; i10++) {
            long[] jArr = this.f22163n;
            if (jArr[i7] > j7) {
                return i9;
            }
            if (!z6 || (this.f22162m[i7] & 1) != 0) {
                if (jArr[i7] == j7) {
                    return i10;
                }
                i9 = i10;
            }
            i7++;
            if (i7 == this.f22158i) {
                i7 = 0;
            }
        }
        return i9;
    }

    public final synchronized long A() {
        return Math.max(this.f22170u, B(this.f22168s));
    }

    public final int C() {
        return this.f22166q + this.f22168s;
    }

    public final synchronized int E(long j7, boolean z6) {
        int D = D(this.f22168s);
        if (H() && j7 >= this.f22163n[D]) {
            if (j7 > this.f22171v && z6) {
                return this.f22165p - this.f22168s;
            }
            int v6 = v(D, this.f22165p - this.f22168s, j7, true);
            if (v6 == -1) {
                return 0;
            }
            return v6;
        }
        return 0;
    }

    public final synchronized s1 F() {
        return this.f22174y ? null : this.B;
    }

    public final int G() {
        return this.f22166q + this.f22165p;
    }

    protected final void I() {
        this.f22175z = true;
    }

    public final synchronized boolean J() {
        return this.f22172w;
    }

    public synchronized boolean K(boolean z6) {
        s1 s1Var;
        boolean z7 = true;
        if (H()) {
            if (this.f22152c.e(C()).f22179a != this.f22156g) {
                return true;
            }
            return M(D(this.f22168s));
        }
        if (!z6 && !this.f22172w && ((s1Var = this.B) == null || s1Var == this.f22156g)) {
            z7 = false;
        }
        return z7;
    }

    public void N() {
        v0.o oVar = this.f22157h;
        if (oVar != null && oVar.getState() == 1) {
            throw ((o.a) o2.a.e(this.f22157h.g()));
        }
    }

    public final synchronized int Q() {
        return H() ? this.f22159j[D(this.f22168s)] : this.C;
    }

    public void R() {
        r();
        U();
    }

    public int S(t1 t1Var, u0.g gVar, int i7, boolean z6) {
        int P = P(t1Var, gVar, (i7 & 2) != 0, z6, this.f22151b);
        if (P == -4 && !gVar.m()) {
            boolean z7 = (i7 & 1) != 0;
            if ((i7 & 4) == 0) {
                n0 n0Var = this.f22150a;
                b bVar = this.f22151b;
                if (z7) {
                    n0Var.f(gVar, bVar);
                } else {
                    n0Var.m(gVar, bVar);
                }
            }
            if (!z7) {
                this.f22168s++;
            }
        }
        return P;
    }

    public void T() {
        W(true);
        U();
    }

    public final void V() {
        W(false);
    }

    public void W(boolean z6) {
        this.f22150a.n();
        this.f22165p = 0;
        this.f22166q = 0;
        this.f22167r = 0;
        this.f22168s = 0;
        this.f22173x = true;
        this.f22169t = Long.MIN_VALUE;
        this.f22170u = Long.MIN_VALUE;
        this.f22171v = Long.MIN_VALUE;
        this.f22172w = false;
        this.f22152c.b();
        if (z6) {
            this.A = null;
            this.B = null;
            this.f22174y = true;
        }
    }

    public final synchronized boolean Y(int i7) {
        boolean z6;
        X();
        int i8 = this.f22166q;
        if (i7 >= i8 && i7 <= this.f22165p + i8) {
            this.f22169t = Long.MIN_VALUE;
            this.f22168s = i7 - i8;
            z6 = true;
        }
        z6 = false;
        return z6;
    }

    public final synchronized boolean Z(long j7, boolean z6) {
        X();
        int D = D(this.f22168s);
        if (H() && j7 >= this.f22163n[D] && (j7 <= this.f22171v || z6)) {
            int v6 = v(D, this.f22165p - this.f22168s, j7, true);
            if (v6 == -1) {
                return false;
            }
            this.f22169t = j7;
            this.f22168s += v6;
            return true;
        }
        return false;
    }

    @Override // w0.e0
    public /* synthetic */ int a(n2.i iVar, int i7, boolean z6) {
        return w0.d0.a(this, iVar, i7, z6);
    }

    public final void a0(long j7) {
        if (this.F != j7) {
            this.F = j7;
            I();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // w0.e0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(long j7, int i7, int i8, int i9, e0.a aVar) {
        int i10;
        if (this.f22175z) {
            e((s1) o2.a.h(this.A));
        }
        int i11 = i7 & 1;
        boolean z6 = i11 != 0;
        if (this.f22173x) {
            if (!z6) {
                return;
            } else {
                this.f22173x = false;
            }
        }
        long j8 = this.F + j7;
        if (this.D) {
            if (j8 < this.f22169t) {
                return;
            }
            if (i11 == 0) {
                if (!this.E) {
                    o2.r.i("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.B);
                    this.E = true;
                }
                i10 = i7 | 1;
                if (this.G) {
                    if (!z6 || !h(j8)) {
                        return;
                    } else {
                        this.G = false;
                    }
                }
                i(j8, i10, (this.f22150a.e() - i8) - i9, i8, aVar);
            }
        }
        i10 = i7;
        if (this.G) {
        }
        i(j8, i10, (this.f22150a.e() - i8) - i9, i8, aVar);
    }

    public final void b0(long j7) {
        this.f22169t = j7;
    }

    @Override // w0.e0
    public final void c(o2.a0 a0Var, int i7, int i8) {
        this.f22150a.q(a0Var, i7);
    }

    @Override // w0.e0
    public /* synthetic */ void d(o2.a0 a0Var, int i7) {
        w0.d0.b(this, a0Var, i7);
    }

    public final void d0(d dVar) {
        this.f22155f = dVar;
    }

    @Override // w0.e0
    public final void e(s1 s1Var) {
        s1 w6 = w(s1Var);
        this.f22175z = false;
        this.A = s1Var;
        boolean c02 = c0(w6);
        d dVar = this.f22155f;
        if (dVar == null || !c02) {
            return;
        }
        dVar.b(w6);
    }

    public final synchronized void e0(int i7) {
        boolean z6;
        if (i7 >= 0) {
            try {
                if (this.f22168s + i7 <= this.f22165p) {
                    z6 = true;
                    o2.a.a(z6);
                    this.f22168s += i7;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        z6 = false;
        o2.a.a(z6);
        this.f22168s += i7;
    }

    @Override // w0.e0
    public final int f(n2.i iVar, int i7, boolean z6, int i8) {
        return this.f22150a.p(iVar, i7, z6);
    }

    public final void f0(int i7) {
        this.C = i7;
    }

    public final void g0() {
        this.G = true;
    }

    public synchronized long o() {
        int i7 = this.f22168s;
        if (i7 == 0) {
            return -1L;
        }
        return p(i7);
    }

    public final void q(long j7, boolean z6, boolean z7) {
        this.f22150a.b(m(j7, z6, z7));
    }

    public final void r() {
        this.f22150a.b(n());
    }

    public final void s() {
        this.f22150a.b(o());
    }

    public final void u(int i7) {
        this.f22150a.c(t(i7));
    }

    protected s1 w(s1 s1Var) {
        return (this.F == 0 || s1Var.f20960u == Long.MAX_VALUE) ? s1Var : s1Var.b().i0(s1Var.f20960u + this.F).E();
    }

    public final int x() {
        return this.f22166q;
    }

    public final synchronized long y() {
        return this.f22165p == 0 ? Long.MIN_VALUE : this.f22163n[this.f22167r];
    }

    public final synchronized long z() {
        return this.f22171v;
    }
}
