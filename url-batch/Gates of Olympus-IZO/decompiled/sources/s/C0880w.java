package s;

import D1.C0014b;
import F.C0036e;
import F.C0047j0;
import F.C0066t0;
import I.C0089d;
import I.C0102j0;
import I.InterfaceC0088c0;
import I.X;
import e2.AbstractC0381e;
import k2.AbstractC0552y;
import m.C0603m;
import m.C0604n;
import m.z0;
import o.h0;
import t0.D;
import u.C0922D;
import u.C0925G;
import u.C0936d;
import u.C0939g;
import u.InterfaceC0924F;
import u.Q;
import u.T;

/* renamed from: s.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0880w implements h0 {

    /* renamed from: w, reason: collision with root package name */
    public static final C2.c f7473w;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7475b;

    /* renamed from: c, reason: collision with root package name */
    public C0871n f7476c;

    /* renamed from: d, reason: collision with root package name */
    public final C0873p f7477d;

    /* renamed from: g, reason: collision with root package name */
    public float f7480g;

    /* renamed from: j, reason: collision with root package name */
    public D f7483j;

    /* renamed from: o, reason: collision with root package name */
    public final C0925G f7488o;

    /* renamed from: s, reason: collision with root package name */
    public final C0102j0 f7491s;

    /* renamed from: t, reason: collision with root package name */
    public final C0102j0 f7492t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0088c0 f7493u;

    /* renamed from: v, reason: collision with root package name */
    public C0603m f7494v;

    /* renamed from: a, reason: collision with root package name */
    public final C0858a f7474a = new C0858a(2, 0);

    /* renamed from: e, reason: collision with root package name */
    public final C0102j0 f7478e = C0089d.J(AbstractC0883z.f7500b, X.f2225f);

    /* renamed from: f, reason: collision with root package name */
    public final q.j f7479f = new q.j();

    /* renamed from: h, reason: collision with root package name */
    public final H2.h f7481h = new H2.h(new C0047j0(29, this));

    /* renamed from: i, reason: collision with root package name */
    public final boolean f7482i = true;

    /* renamed from: k, reason: collision with root package name */
    public final C0875r f7484k = new C0875r(this, 0);

    /* renamed from: l, reason: collision with root package name */
    public final C0936d f7485l = new C0936d();

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f7486m = new androidx.compose.foundation.lazy.layout.a();

    /* renamed from: n, reason: collision with root package name */
    public final n0.f f7487n = new n0.f(2);
    public final n0.o p = new n0.o(this);

    /* renamed from: q, reason: collision with root package name */
    public final C0922D f7489q = new C0922D();

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0088c0 f7490r = AbstractC0381e.v();

    static {
        C0874q c0874q = C0874q.f7457e;
        C0870m c0870m = C0870m.f7416g;
        C0036e c0036e = new C0036e(c0874q);
        Z1.w.d(1, c0870m);
        C2.c cVar = R.o.f3164a;
        f7473w = new C2.c(c0036e, 3, c0870m);
    }

    public C0880w(int i3, int i4) {
        this.f7477d = new C0873p(i3, i4, 0);
        this.f7488o = new C0925G(new C0066t0(this, i3, 2));
        Boolean bool = Boolean.FALSE;
        X x3 = X.f2228i;
        this.f7491s = C0089d.J(bool, x3);
        this.f7492t = C0089d.J(bool, x3);
        this.f7493u = AbstractC0381e.v();
        this.f7494v = new C0603m(z0.f5885a, Float.valueOf(0.0f), new C0604n(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // o.h0
    public final boolean a() {
        return ((Boolean) this.f7491s.getValue()).booleanValue();
    }

    @Override // o.h0
    public final float b(float f3) {
        return this.f7481h.b(f3);
    }

    @Override // o.h0
    public final boolean c() {
        return ((Boolean) this.f7492t.getValue()).booleanValue();
    }

    @Override // o.h0
    public final boolean d() {
        return this.f7481h.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // o.h0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(n.X x3, Y1.e eVar, R1.c cVar) {
        C0876s c0876s;
        Q1.a aVar;
        int i3;
        C0880w c0880w;
        H2.h hVar;
        if (cVar instanceof C0876s) {
            c0876s = (C0876s) cVar;
            int i4 = c0876s.f7465i;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0876s.f7465i = i4 - Integer.MIN_VALUE;
                Object obj = c0876s.f7463g;
                aVar = Q1.a.f3113d;
                i3 = c0876s.f7465i;
                if (i3 != 0) {
                    I2.l.Q(obj);
                    c0876s.f7460d = this;
                    c0876s.f7461e = x3;
                    c0876s.f7462f = eVar;
                    c0876s.f7465i = 1;
                    if (this.f7485l.h(c0876s) == aVar) {
                        return aVar;
                    }
                    c0880w = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        I2.l.Q(obj);
                        return L1.z.f2729a;
                    }
                    eVar = c0876s.f7462f;
                    x3 = c0876s.f7461e;
                    c0880w = c0876s.f7460d;
                    I2.l.Q(obj);
                }
                hVar = c0880w.f7481h;
                c0876s.f7460d = null;
                c0876s.f7461e = null;
                c0876s.f7462f = null;
                c0876s.f7465i = 2;
                if (hVar.e(x3, eVar, c0876s) == aVar) {
                    return aVar;
                }
                return L1.z.f2729a;
            }
        }
        c0876s = new C0876s(this, cVar);
        Object obj2 = c0876s.f7463g;
        aVar = Q1.a.f3113d;
        i3 = c0876s.f7465i;
        if (i3 != 0) {
        }
        hVar = c0880w.f7481h;
        c0876s.f7460d = null;
        c0876s.f7461e = null;
        c0876s.f7462f = null;
        c0876s.f7465i = 2;
        if (hVar.e(x3, eVar, c0876s) == aVar) {
        }
        return L1.z.f2729a;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(C0871n c0871n, boolean z3, boolean z4) {
        if (!z3 && this.f7475b) {
            this.f7476c = c0871n;
            return;
        }
        if (z3) {
            this.f7475b = true;
        }
        C0872o c0872o = c0871n.f7418a;
        this.f7492t.setValue(Boolean.valueOf(((c0872o != null ? c0872o.f7434a : 0) == 0 && c0871n.f7419b == 0) ? false : true));
        this.f7491s.setValue(Boolean.valueOf(c0871n.f7420c));
        this.f7480g -= c0871n.f7421d;
        this.f7478e.setValue(c0871n);
        C0873p c0873p = this.f7477d;
        if (z4) {
            int i3 = c0871n.f7419b;
            if (i3 < 0.0f) {
                c0873p.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i3 + ')').toString());
            }
            c0873p.f7453c.h(i3);
        } else {
            c0873p.getClass();
            c0873p.f7455e = c0872o != null ? c0872o.f7443j : null;
            if (c0873p.f7454d || c0871n.f7430m > 0) {
                c0873p.f7454d = true;
                int i4 = c0871n.f7419b;
                if (i4 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i4 + ')').toString());
                }
                c0873p.a(c0872o != null ? c0872o.f7434a : 0, i4);
            }
            if (this.f7482i) {
                C0858a c0858a = this.f7474a;
                if (c0858a.f7342b != -1) {
                    ?? r4 = c0871n.f7427j;
                    if (!r4.isEmpty()) {
                        if (c0858a.f7342b != (c0858a.f7343c ? ((C0872o) M1.l.s0(r4)).f7434a + 1 : ((C0872o) M1.l.m0(r4)).f7434a - 1)) {
                            c0858a.f7342b = -1;
                            InterfaceC0924F interfaceC0924F = (InterfaceC0924F) c0858a.f7344d;
                            if (interfaceC0924F != null) {
                                interfaceC0924F.cancel();
                            }
                            c0858a.f7344d = null;
                        }
                    }
                }
            }
        }
        if (z3) {
            float F3 = c0871n.f7425h.F(AbstractC0883z.f7499a);
            float f3 = c0871n.f7422e;
            if (f3 <= F3) {
                return;
            }
            S.i c3 = S.u.c();
            Y1.c f4 = c3 != null ? c3.f() : null;
            S.i d3 = S.u.d(c3);
            try {
                float floatValue = ((Number) this.f7494v.f5803e.getValue()).floatValue();
                C0603m c0603m = this.f7494v;
                boolean z5 = c0603m.f5807i;
                p2.c cVar = c0871n.f7424g;
                if (z5) {
                    this.f7494v = new C0603m(c0603m.f5802d, Float.valueOf(floatValue - f3), new C0604n(((C0604n) c0603m.f5804f).f5808a), c0603m.f5805g, c0603m.f5806h, z5);
                    AbstractC0552y.q(cVar, null, null, new C0878u(this, null), 3);
                } else {
                    this.f7494v = new C0603m(z0.f5885a, Float.valueOf(-f3), null, 60);
                    AbstractC0552y.q(cVar, null, null, new C0879v(this, null), 3);
                }
                S.u.f(c3, d3, f4);
            } catch (Throwable th) {
                S.u.f(c3, d3, f4);
                throw th;
            }
        }
    }

    public final C0871n g() {
        return (C0871n) this.f7478e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f3, C0871n c0871n) {
        InterfaceC0924F interfaceC0924F;
        InterfaceC0924F interfaceC0924F2;
        C0939g c0939g;
        InterfaceC0924F interfaceC0924F3;
        if (this.f7482i) {
            C0858a c0858a = this.f7474a;
            if (c0871n.f7427j.isEmpty()) {
                return;
            }
            boolean z3 = f3 < 0.0f;
            ?? r3 = c0871n.f7427j;
            int i3 = z3 ? ((C0872o) M1.l.s0(r3)).f7434a + 1 : ((C0872o) M1.l.m0(r3)).f7434a - 1;
            if (i3 < 0 || i3 >= c0871n.f7430m) {
                return;
            }
            if (i3 != c0858a.f7342b) {
                if (c0858a.f7343c != z3 && (interfaceC0924F3 = (InterfaceC0924F) c0858a.f7344d) != null) {
                    interfaceC0924F3.cancel();
                }
                c0858a.f7343c = z3;
                c0858a.f7342b = i3;
                C0880w c0880w = (C0880w) this.p.f6239a;
                S.i c3 = S.u.c();
                Y1.c f4 = c3 != null ? c3.f() : null;
                S.i d3 = S.u.d(c3);
                try {
                    long j3 = ((C0871n) c0880w.f7478e.getValue()).f7426i;
                    S.u.f(c3, d3, f4);
                    C0925G c0925g = c0880w.f7488o;
                    C0014b c0014b = c0925g.f8010c;
                    if (c0014b != null) {
                        Q q2 = new Q(c0014b, i3, j3, c0925g.f8009b);
                        ((T) c0014b.f538d).d(q2);
                        c0939g = q2;
                    } else {
                        c0939g = C0939g.f8065a;
                    }
                    c0858a.f7344d = c0939g;
                } catch (Throwable th) {
                    S.u.f(c3, d3, f4);
                    throw th;
                }
            }
            if (!z3) {
                if (c0871n.f7428k - ((C0872o) M1.l.m0(r3)).f7446m >= f3 || (interfaceC0924F = (InterfaceC0924F) c0858a.f7344d) == null) {
                    return;
                }
                interfaceC0924F.a();
                return;
            }
            C0872o c0872o = (C0872o) M1.l.s0(r3);
            if (((c0872o.f7446m + c0872o.f7447n) + c0871n.p) - c0871n.f7429l >= (-f3) || (interfaceC0924F2 = (InterfaceC0924F) c0858a.f7344d) == null) {
                return;
            }
            interfaceC0924F2.a();
        }
    }
}
