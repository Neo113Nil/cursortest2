package n;

import I.C0143d;
import I.C0150g0;
import e2.InterfaceC0426e;
import p.C0783q;
import p.InterfaceC0778n0;
import z.C1256t;

/* loaded from: classes.dex */
public final class y0 implements InterfaceC0778n0 {

    /* renamed from: i, reason: collision with root package name */
    public static final C1256t f7241i;

    /* renamed from: a, reason: collision with root package name */
    public final C0150g0 f7242a;

    /* renamed from: e, reason: collision with root package name */
    public float f7246e;

    /* renamed from: b, reason: collision with root package name */
    public final C0150g0 f7243b = C0143d.J(0);

    /* renamed from: c, reason: collision with root package name */
    public final q.k f7244c = new q.k();

    /* renamed from: d, reason: collision with root package name */
    public final C0150g0 f7245d = C0143d.J(Integer.MAX_VALUE);

    /* renamed from: f, reason: collision with root package name */
    public final C0783q f7247f = new C0783q(new A0.l(24, this));

    /* renamed from: g, reason: collision with root package name */
    public final I.F f7248g = C0143d.D(new x0(this, 1));

    /* renamed from: h, reason: collision with root package name */
    public final I.F f7249h = C0143d.D(new x0(this, 0));

    static {
        w0 w0Var = w0.f7218e;
        C0691q c0691q = C0691q.f7190i;
        C1256t c1256t = R.o.f4037a;
        f7241i = new C1256t(w0Var, 6, c0691q);
    }

    public y0(int i3) {
        this.f7242a = C0143d.J(i3);
    }

    @Override // p.InterfaceC0778n0
    public final boolean a() {
        return ((Boolean) this.f7248g.getValue()).booleanValue();
    }

    @Override // p.InterfaceC0778n0
    public final float b(float f3) {
        return this.f7247f.b(f3);
    }

    @Override // p.InterfaceC0778n0
    public final boolean c() {
        return ((Boolean) this.f7249h.getValue()).booleanValue();
    }

    @Override // p.InterfaceC0778n0
    public final Object d(e0 e0Var, InterfaceC0426e interfaceC0426e, X1.c cVar) {
        Object d3 = this.f7247f.d(e0Var, interfaceC0426e, cVar);
        return d3 == W1.a.f4608d ? d3 : R1.y.f4171a;
    }

    @Override // p.InterfaceC0778n0
    public final boolean e() {
        return this.f7247f.e();
    }
}
