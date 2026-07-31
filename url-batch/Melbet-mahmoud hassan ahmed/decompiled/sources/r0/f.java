package r0;

/* loaded from: classes.dex */
public abstract class f implements e3, g3 {

    /* renamed from: f, reason: collision with root package name */
    private final int f20585f;

    /* renamed from: h, reason: collision with root package name */
    private h3 f20587h;

    /* renamed from: i, reason: collision with root package name */
    private int f20588i;

    /* renamed from: j, reason: collision with root package name */
    private s0.u1 f20589j;

    /* renamed from: k, reason: collision with root package name */
    private int f20590k;

    /* renamed from: l, reason: collision with root package name */
    private t1.q0 f20591l;

    /* renamed from: m, reason: collision with root package name */
    private s1[] f20592m;

    /* renamed from: n, reason: collision with root package name */
    private long f20593n;

    /* renamed from: o, reason: collision with root package name */
    private long f20594o;

    /* renamed from: q, reason: collision with root package name */
    private boolean f20596q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f20597r;

    /* renamed from: g, reason: collision with root package name */
    private final t1 f20586g = new t1();

    /* renamed from: p, reason: collision with root package name */
    private long f20595p = Long.MIN_VALUE;

    public f(int i7) {
        this.f20585f = i7;
    }

    private void S(long j7, boolean z6) {
        this.f20596q = false;
        this.f20594o = j7;
        this.f20595p = j7;
        M(j7, z6);
    }

    @Override // r0.e3
    public /* synthetic */ void A(float f7, float f8) {
        d3.a(this, f7, f8);
    }

    @Override // r0.e3
    public final void B() {
        o2.a.f(this.f20590k == 2);
        this.f20590k = 1;
        P();
    }

    protected final r C(Throwable th, s1 s1Var, int i7) {
        return D(th, s1Var, false, i7);
    }

    protected final r D(Throwable th, s1 s1Var, boolean z6, int i7) {
        int i8;
        if (s1Var != null && !this.f20597r) {
            this.f20597r = true;
            try {
                int f7 = f3.f(b(s1Var));
                this.f20597r = false;
                i8 = f7;
            } catch (r unused) {
                this.f20597r = false;
            } catch (Throwable th2) {
                this.f20597r = false;
                throw th2;
            }
            return r.g(th, h(), G(), s1Var, i8, z6, i7);
        }
        i8 = 4;
        return r.g(th, h(), G(), s1Var, i8, z6, i7);
    }

    protected final h3 E() {
        return (h3) o2.a.e(this.f20587h);
    }

    protected final t1 F() {
        this.f20586g.a();
        return this.f20586g;
    }

    protected final int G() {
        return this.f20588i;
    }

    protected final s0.u1 H() {
        return (s0.u1) o2.a.e(this.f20589j);
    }

    protected final s1[] I() {
        return (s1[]) o2.a.e(this.f20592m);
    }

    protected final boolean J() {
        return k() ? this.f20596q : ((t1.q0) o2.a.e(this.f20591l)).i();
    }

    protected abstract void K();

    protected void L(boolean z6, boolean z7) {
    }

    protected abstract void M(long j7, boolean z6);

    protected void N() {
    }

    protected void O() {
    }

    protected void P() {
    }

    protected abstract void Q(s1[] s1VarArr, long j7, long j8);

    protected final int R(t1 t1Var, u0.g gVar, int i7) {
        int j7 = ((t1.q0) o2.a.e(this.f20591l)).j(t1Var, gVar, i7);
        if (j7 == -4) {
            if (gVar.m()) {
                this.f20595p = Long.MIN_VALUE;
                return this.f20596q ? -4 : -3;
            }
            long j8 = gVar.f22413j + this.f20593n;
            gVar.f22413j = j8;
            this.f20595p = Math.max(this.f20595p, j8);
        } else if (j7 == -5) {
            s1 s1Var = (s1) o2.a.e(t1Var.f21040b);
            if (s1Var.f20960u != Long.MAX_VALUE) {
                t1Var.f21040b = s1Var.b().i0(s1Var.f20960u + this.f20593n).E();
            }
        }
        return j7;
    }

    protected int T(long j7) {
        return ((t1.q0) o2.a.e(this.f20591l)).d(j7 - this.f20593n);
    }

    @Override // r0.e3
    public final void a() {
        o2.a.f(this.f20590k == 0);
        this.f20586g.a();
        N();
    }

    @Override // r0.e3
    public final void f() {
        o2.a.f(this.f20590k == 1);
        this.f20590k = 2;
        O();
    }

    @Override // r0.e3
    public final void g() {
        o2.a.f(this.f20590k == 1);
        this.f20586g.a();
        this.f20590k = 0;
        this.f20591l = null;
        this.f20592m = null;
        this.f20596q = false;
        K();
    }

    @Override // r0.e3
    public final int getState() {
        return this.f20590k;
    }

    @Override // r0.e3, r0.g3
    public final int j() {
        return this.f20585f;
    }

    @Override // r0.e3
    public final boolean k() {
        return this.f20595p == Long.MIN_VALUE;
    }

    @Override // r0.e3
    public final void l(s1[] s1VarArr, t1.q0 q0Var, long j7, long j8) {
        o2.a.f(!this.f20596q);
        this.f20591l = q0Var;
        if (this.f20595p == Long.MIN_VALUE) {
            this.f20595p = j7;
        }
        this.f20592m = s1VarArr;
        this.f20593n = j8;
        Q(s1VarArr, j7, j8);
    }

    @Override // r0.e3
    public final void m(h3 h3Var, s1[] s1VarArr, t1.q0 q0Var, long j7, boolean z6, boolean z7, long j8, long j9) {
        o2.a.f(this.f20590k == 0);
        this.f20587h = h3Var;
        this.f20590k = 1;
        L(z6, z7);
        l(s1VarArr, q0Var, j8, j9);
        S(j7, z6);
    }

    public int n() {
        return 0;
    }

    @Override // r0.z2.b
    public void p(int i7, Object obj) {
    }

    @Override // r0.e3
    public final t1.q0 q() {
        return this.f20591l;
    }

    @Override // r0.e3
    public final void r() {
        this.f20596q = true;
    }

    @Override // r0.e3
    public final void s() {
        ((t1.q0) o2.a.e(this.f20591l)).b();
    }

    @Override // r0.e3
    public final long t() {
        return this.f20595p;
    }

    @Override // r0.e3
    public final void u(long j7) {
        S(j7, false);
    }

    @Override // r0.e3
    public final boolean v() {
        return this.f20596q;
    }

    @Override // r0.e3
    public o2.t w() {
        return null;
    }

    @Override // r0.e3
    public final void x(int i7, s0.u1 u1Var) {
        this.f20588i = i7;
        this.f20589j = u1Var;
    }

    @Override // r0.e3
    public final g3 y() {
        return this;
    }
}
