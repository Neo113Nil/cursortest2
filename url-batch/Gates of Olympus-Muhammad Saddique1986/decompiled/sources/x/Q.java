package x;

import C0.AbstractC0032h;
import C0.C0031g;
import I.C0143d;
import I.C0156j0;
import I.C0173s0;
import b0.C0339h;
import b0.C0352v;
import e2.InterfaceC0424c;
import r0.InterfaceC0919p;
import u0.K0;
import z.C1256t;

/* loaded from: classes.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    public Y f9975a;

    /* renamed from: b, reason: collision with root package name */
    public final C0173s0 f9976b;

    /* renamed from: c, reason: collision with root package name */
    public final K0 f9977c;

    /* renamed from: d, reason: collision with root package name */
    public final C1256t f9978d;

    /* renamed from: e, reason: collision with root package name */
    public I0.F f9979e;

    /* renamed from: f, reason: collision with root package name */
    public final C0156j0 f9980f;

    /* renamed from: g, reason: collision with root package name */
    public final C0156j0 f9981g;

    /* renamed from: h, reason: collision with root package name */
    public InterfaceC0919p f9982h;

    /* renamed from: i, reason: collision with root package name */
    public final C0156j0 f9983i;

    /* renamed from: j, reason: collision with root package name */
    public C0031g f9984j;

    /* renamed from: k, reason: collision with root package name */
    public final C0156j0 f9985k;

    /* renamed from: l, reason: collision with root package name */
    public final C0156j0 f9986l;

    /* renamed from: m, reason: collision with root package name */
    public final C0156j0 f9987m;

    /* renamed from: n, reason: collision with root package name */
    public final C0156j0 f9988n;

    /* renamed from: o, reason: collision with root package name */
    public final C0156j0 f9989o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f9990p;

    /* renamed from: q, reason: collision with root package name */
    public final C0156j0 f9991q;

    /* renamed from: r, reason: collision with root package name */
    public final G1.m f9992r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0424c f9993s;

    /* renamed from: t, reason: collision with root package name */
    public final C1204q f9994t;

    /* renamed from: u, reason: collision with root package name */
    public final C1204q f9995u;

    /* renamed from: v, reason: collision with root package name */
    public final C0339h f9996v;

    /* renamed from: w, reason: collision with root package name */
    public long f9997w;

    /* renamed from: x, reason: collision with root package name */
    public final C0156j0 f9998x;

    /* renamed from: y, reason: collision with root package name */
    public final C0156j0 f9999y;

    public Q(Y y3, C0173s0 c0173s0, K0 k02) {
        this.f9975a = y3;
        this.f9976b = c0173s0;
        this.f9977c = k02;
        C1256t c1256t = new C1256t(4);
        C0031g c0031g = AbstractC0032h.f600a;
        long j3 = C0.J.f567b;
        I0.z zVar = new I0.z(c0031g, j3, (C0.J) null);
        c1256t.f10466e = zVar;
        c1256t.f10467f = new I0.j(c0031g, zVar.f3098b);
        this.f9978d = c1256t;
        Boolean bool = Boolean.FALSE;
        I.W w2 = I.W.f2783i;
        this.f9980f = C0143d.K(bool, w2);
        this.f9981g = C0143d.K(new O0.e(0), w2);
        this.f9983i = C0143d.K(null, w2);
        this.f9985k = C0143d.K(F.f9944d, w2);
        this.f9986l = C0143d.K(bool, w2);
        this.f9987m = C0143d.K(bool, w2);
        this.f9988n = C0143d.K(bool, w2);
        this.f9989o = C0143d.K(bool, w2);
        this.f9990p = true;
        this.f9991q = C0143d.K(Boolean.TRUE, w2);
        this.f9992r = new G1.m(k02);
        this.f9993s = C1192e.f10077i;
        this.f9994t = new C1204q(this, 5);
        this.f9995u = new C1204q(this, 4);
        this.f9996v = b0.M.g();
        this.f9997w = C0352v.f5439g;
        this.f9998x = C0143d.K(new C0.J(j3), w2);
        this.f9999y = C0143d.K(new C0.J(j3), w2);
    }

    public final F a() {
        return (F) this.f9985k.getValue();
    }

    public final boolean b() {
        return ((Boolean) this.f9980f.getValue()).booleanValue();
    }

    public final InterfaceC0919p c() {
        InterfaceC0919p interfaceC0919p = this.f9982h;
        if (interfaceC0919p == null || !interfaceC0919p.o()) {
            return null;
        }
        return interfaceC0919p;
    }

    public final p0 d() {
        return (p0) this.f9983i.getValue();
    }

    public final void e(long j3) {
        this.f9999y.setValue(new C0.J(j3));
    }

    public final void f(long j3) {
        this.f9998x.setValue(new C0.J(j3));
    }
}
