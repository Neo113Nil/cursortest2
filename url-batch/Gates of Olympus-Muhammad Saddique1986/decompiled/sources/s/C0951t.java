package s;

import C0.C0025a;
import E.F;
import I.C0143d;
import I.C0150g0;
import I.C0156j0;
import I.InterfaceC0142c0;
import I.W;
import R1.y;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import m.C0628m;
import m.C0629n;
import m.v0;
import m.y0;
import n.e0;
import n0.C0710h;
import p.C0783q;
import p.InterfaceC0778n0;
import q2.AbstractC0837y;
import r0.C0929z;
import t.C0971A;
import t.C0976d;
import t.C0979g;
import t.J;
import t.L;
import t.x;
import t.z;
import t0.E;
import z.C1256t;

/* renamed from: s.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0951t implements InterfaceC0778n0 {

    /* renamed from: w, reason: collision with root package name */
    public static final C1256t f8316w;

    /* renamed from: a, reason: collision with root package name */
    public final C0932a f8317a = new C0932a(2);

    /* renamed from: b, reason: collision with root package name */
    public boolean f8318b;

    /* renamed from: c, reason: collision with root package name */
    public C0943l f8319c;

    /* renamed from: d, reason: collision with root package name */
    public final F f8320d;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f8321e;

    /* renamed from: f, reason: collision with root package name */
    public final q.k f8322f;

    /* renamed from: g, reason: collision with root package name */
    public float f8323g;

    /* renamed from: h, reason: collision with root package name */
    public final C0783q f8324h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f8325i;

    /* renamed from: j, reason: collision with root package name */
    public E f8326j;

    /* renamed from: k, reason: collision with root package name */
    public final C0946o f8327k;

    /* renamed from: l, reason: collision with root package name */
    public final C0976d f8328l;

    /* renamed from: m, reason: collision with root package name */
    public final androidx.compose.foundation.lazy.layout.a f8329m;

    /* renamed from: n, reason: collision with root package name */
    public final C0710h f8330n;

    /* renamed from: o, reason: collision with root package name */
    public final C0971A f8331o;

    /* renamed from: p, reason: collision with root package name */
    public final y0 f8332p;

    /* renamed from: q, reason: collision with root package name */
    public final x f8333q;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC0142c0 f8334r;

    /* renamed from: s, reason: collision with root package name */
    public final C0156j0 f8335s;

    /* renamed from: t, reason: collision with root package name */
    public final C0156j0 f8336t;

    /* renamed from: u, reason: collision with root package name */
    public final InterfaceC0142c0 f8337u;

    /* renamed from: v, reason: collision with root package name */
    public C0628m f8338v;

    static {
        C0945n c0945n = C0945n.f8301e;
        C0942k c0942k = C0942k.f8266g;
        C0025a c0025a = new C0025a(c0945n);
        f2.x.d(1, c0942k);
        C1256t c1256t = R.o.f4037a;
        f8316w = new C1256t(c0025a, 6, c0942k);
    }

    public C0951t(int i3, int i4) {
        F f3 = new F();
        f3.f923b = C0143d.J(i3);
        f3.f924c = C0143d.J(i4);
        f3.f926e = new t.v(i3);
        this.f8320d = f3;
        C0943l c0943l = AbstractC0954w.f8342b;
        W w2 = W.f2780f;
        this.f8321e = C0143d.K(c0943l, w2);
        this.f8322f = new q.k();
        this.f8324h = new C0783q(new C0929z(1, this));
        this.f8325i = true;
        this.f8327k = new C0946o(this);
        this.f8328l = new C0976d();
        this.f8329m = new androidx.compose.foundation.lazy.layout.a();
        this.f8330n = new C0710h(2);
        this.f8331o = new C0971A(new S.s(i3, 2, this));
        this.f8332p = new y0(this);
        this.f8333q = new x();
        y yVar = y.f4171a;
        this.f8334r = C0143d.K(yVar, w2);
        Boolean bool = Boolean.FALSE;
        W w3 = W.f2783i;
        this.f8335s = C0143d.K(bool, w3);
        this.f8336t = C0143d.K(bool, w3);
        this.f8337u = C0143d.K(yVar, w2);
        this.f8338v = new C0628m(v0.f6899a, Float.valueOf(0.0f), new C0629n(0.0f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    @Override // p.InterfaceC0778n0
    public final boolean a() {
        return ((Boolean) this.f8335s.getValue()).booleanValue();
    }

    @Override // p.InterfaceC0778n0
    public final float b(float f3) {
        return this.f8324h.b(f3);
    }

    @Override // p.InterfaceC0778n0
    public final boolean c() {
        return ((Boolean) this.f8336t.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0062 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // p.InterfaceC0778n0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(e0 e0Var, InterfaceC0426e interfaceC0426e, X1.c cVar) {
        C0947p c0947p;
        W1.a aVar;
        int i3;
        C0951t c0951t;
        C0783q c0783q;
        if (cVar instanceof C0947p) {
            c0947p = (C0947p) cVar;
            int i4 = c0947p.f8308l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c0947p.f8308l = i4 - Integer.MIN_VALUE;
                Object obj = c0947p.f8306j;
                aVar = W1.a.f4608d;
                i3 = c0947p.f8308l;
                if (i3 != 0) {
                    R1.a.e(obj);
                    c0947p.f8303g = this;
                    c0947p.f8304h = e0Var;
                    c0947p.f8305i = interfaceC0426e;
                    c0947p.f8308l = 1;
                    if (this.f8328l.l(c0947p) == aVar) {
                        return aVar;
                    }
                    c0951t = this;
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        R1.a.e(obj);
                        return y.f4171a;
                    }
                    interfaceC0426e = c0947p.f8305i;
                    e0Var = c0947p.f8304h;
                    c0951t = c0947p.f8303g;
                    R1.a.e(obj);
                }
                c0783q = c0951t.f8324h;
                c0947p.f8303g = null;
                c0947p.f8304h = null;
                c0947p.f8305i = null;
                c0947p.f8308l = 2;
                if (c0783q.d(e0Var, interfaceC0426e, c0947p) == aVar) {
                    return aVar;
                }
                return y.f4171a;
            }
        }
        c0947p = new C0947p(this, cVar);
        Object obj2 = c0947p.f8306j;
        aVar = W1.a.f4608d;
        i3 = c0947p.f8308l;
        if (i3 != 0) {
        }
        c0783q = c0951t.f8324h;
        c0947p.f8303g = null;
        c0947p.f8304h = null;
        c0947p.f8305i = null;
        c0947p.f8308l = 2;
        if (c0783q.d(e0Var, interfaceC0426e, c0947p) == aVar) {
        }
        return y.f4171a;
    }

    @Override // p.InterfaceC0778n0
    public final boolean e() {
        return this.f8324h.e();
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    public final void f(C0943l c0943l, boolean z3, boolean z4) {
        if (!z3 && this.f8318b) {
            this.f8319c = c0943l;
            return;
        }
        if (z3) {
            this.f8318b = true;
        }
        C0944m c0944m = c0943l.f8268a;
        this.f8336t.setValue(Boolean.valueOf(((c0944m != null ? c0944m.f8285a : 0) == 0 && c0943l.f8269b == 0) ? false : true));
        this.f8335s.setValue(Boolean.valueOf(c0943l.f8270c));
        this.f8323g -= c0943l.f8271d;
        this.f8321e.setValue(c0943l);
        m.r rVar = null;
        F f3 = this.f8320d;
        if (z4) {
            int i3 = c0943l.f8269b;
            if (i3 < 0.0f) {
                f3.getClass();
                throw new IllegalStateException(("scrollOffset should be non-negative (" + i3 + ')').toString());
            }
            ((C0150g0) f3.f924c).h(i3);
        } else {
            f3.getClass();
            f3.f925d = c0944m != null ? c0944m.f8292h : null;
            if (f3.f922a || c0943l.f8280m > 0) {
                f3.f922a = true;
                int i4 = c0943l.f8269b;
                if (i4 < 0.0f) {
                    throw new IllegalStateException(("scrollOffset should be non-negative (" + i4 + ')').toString());
                }
                f3.i(c0944m != null ? c0944m.f8285a : 0, i4);
            }
            if (this.f8325i) {
                C0932a c0932a = this.f8317a;
                if (c0932a.f8210b != -1) {
                    ?? r4 = c0943l.f8277j;
                    if (!r4.isEmpty()) {
                        if (c0932a.f8210b != (c0932a.f8212d ? ((C0944m) S1.l.Q0(r4)).f8285a + 1 : ((C0944m) S1.l.K0(r4)).f8285a - 1)) {
                            c0932a.f8210b = -1;
                            z zVar = c0932a.f8211c;
                            if (zVar != null) {
                                zVar.cancel();
                            }
                            c0932a.f8211c = null;
                        }
                    }
                }
            }
        }
        if (z3) {
            float J3 = c0943l.f8275h.J(AbstractC0954w.f8341a);
            float f4 = c0943l.f8272e;
            if (f4 <= J3) {
                return;
            }
            S.i c2 = S.u.c();
            InterfaceC0424c f5 = c2 != null ? c2.f() : null;
            S.i d3 = S.u.d(c2);
            try {
                float floatValue = ((Number) this.f8338v.f6849e.getValue()).floatValue();
                C0628m c0628m = this.f8338v;
                boolean z5 = c0628m.f6853i;
                v2.c cVar = c0943l.f8274g;
                if (z5) {
                    this.f8338v = new C0628m(c0628m.f6848d, Float.valueOf(floatValue - f4), new C0629n(((C0629n) c0628m.f6850f).f6855a), c0628m.f6851g, c0628m.f6852h, z5);
                    AbstractC0837y.r(cVar, null, null, new C0949r(this, null), 3);
                } else {
                    this.f8338v = new C0628m(v0.f6899a, Float.valueOf(-f4), rVar, 60);
                    AbstractC0837y.r(cVar, null, null, new C0950s(this, null), 3);
                }
                S.u.f(c2, d3, f5);
            } catch (Throwable th) {
                S.u.f(c2, d3, f5);
                throw th;
            }
        }
    }

    public final C0943l g() {
        return (C0943l) this.f8321e.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    public final void h(float f3, C0943l c0943l) {
        z zVar;
        z zVar2;
        C0979g c0979g;
        z zVar3;
        if (this.f8325i) {
            C0932a c0932a = this.f8317a;
            if (c0943l.f8277j.isEmpty()) {
                return;
            }
            boolean z3 = f3 < 0.0f;
            ?? r3 = c0943l.f8277j;
            int i3 = z3 ? ((C0944m) S1.l.Q0(r3)).f8285a + 1 : ((C0944m) S1.l.K0(r3)).f8285a - 1;
            if (i3 < 0 || i3 >= c0943l.f8280m) {
                return;
            }
            if (i3 != c0932a.f8210b) {
                if (c0932a.f8212d != z3 && (zVar3 = c0932a.f8211c) != null) {
                    zVar3.cancel();
                }
                c0932a.f8212d = z3;
                c0932a.f8210b = i3;
                C0951t c0951t = (C0951t) this.f8332p.f6913d;
                S.i c2 = S.u.c();
                InterfaceC0424c f4 = c2 != null ? c2.f() : null;
                S.i d3 = S.u.d(c2);
                try {
                    long j3 = ((C0943l) c0951t.f8321e.getValue()).f8276i;
                    S.u.f(c2, d3, f4);
                    C0971A c0971a = c0951t.f8331o;
                    G1.m mVar = c0971a.f8421c;
                    if (mVar != null) {
                        J j4 = new J(mVar, i3, j3, c0971a.f8420b);
                        ((L) mVar.f2118d).d(j4);
                        c0979g = j4;
                    } else {
                        c0979g = C0979g.f8476d;
                    }
                    c0932a.f8211c = c0979g;
                } catch (Throwable th) {
                    S.u.f(c2, d3, f4);
                    throw th;
                }
            }
            if (!z3) {
                if (c0943l.f8278k - ((C0944m) S1.l.K0(r3)).f8295k >= f3 || (zVar = c0932a.f8211c) == null) {
                    return;
                }
                zVar.a();
                return;
            }
            C0944m c0944m = (C0944m) S1.l.Q0(r3);
            if (((c0944m.f8295k + c0944m.f8296l) + c0943l.f8283p) - c0943l.f8279l >= (-f3) || (zVar2 = c0932a.f8211c) == null) {
                return;
            }
            zVar2.a();
        }
    }
}
