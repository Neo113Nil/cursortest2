package m;

import I.AbstractC0085b;
import I.C0089d;
import I.C0094f0;
import I.C0098h0;
import I.C0102j0;
import I.L0;
import I.X0;

/* loaded from: classes.dex */
public final class o0 implements X0 {

    /* renamed from: d, reason: collision with root package name */
    public final y0 f5813d;

    /* renamed from: e, reason: collision with root package name */
    public final C0102j0 f5814e;

    /* renamed from: f, reason: collision with root package name */
    public final C0102j0 f5815f;

    /* renamed from: g, reason: collision with root package name */
    public final C0102j0 f5816g;

    /* renamed from: h, reason: collision with root package name */
    public N f5817h;

    /* renamed from: i, reason: collision with root package name */
    public j0 f5818i;

    /* renamed from: j, reason: collision with root package name */
    public final C0102j0 f5819j;

    /* renamed from: k, reason: collision with root package name */
    public final C0094f0 f5820k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f5821l;

    /* renamed from: m, reason: collision with root package name */
    public final C0102j0 f5822m;

    /* renamed from: n, reason: collision with root package name */
    public r f5823n;

    /* renamed from: o, reason: collision with root package name */
    public final C0098h0 f5824o;
    public boolean p;

    /* renamed from: q, reason: collision with root package name */
    public final C0590b0 f5825q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f5826r;

    public o0(s0 s0Var, Object obj, r rVar, y0 y0Var) {
        this.f5826r = s0Var;
        this.f5813d = y0Var;
        I.X x3 = I.X.f2228i;
        C0102j0 J3 = C0089d.J(obj, x3);
        this.f5814e = J3;
        Object obj2 = null;
        C0102j0 J4 = C0089d.J(AbstractC0595e.h(0.0f, null, 7), x3);
        this.f5815f = J4;
        this.f5816g = C0089d.J(new j0((InterfaceC0615z) J4.getValue(), y0Var, obj, J3.getValue(), rVar), x3);
        this.f5819j = C0089d.J(Boolean.TRUE, x3);
        int i3 = AbstractC0085b.f2235b;
        this.f5820k = new C0094f0(-1.0f);
        this.f5822m = C0089d.J(obj, x3);
        this.f5823n = rVar;
        this.f5824o = new C0098h0(b().c());
        Float f3 = (Float) D0.f5567a.get(y0Var);
        if (f3 != null) {
            float floatValue = f3.floatValue();
            r rVar2 = (r) y0Var.f5883a.j(obj);
            int b2 = rVar2.b();
            for (int i4 = 0; i4 < b2; i4++) {
                rVar2.e(floatValue, i4);
            }
            obj2 = this.f5813d.f5884b.j(rVar2);
        }
        this.f5825q = AbstractC0595e.h(0.0f, obj2, 3);
    }

    public final j0 b() {
        return (j0) this.f5816g.getValue();
    }

    public final void c(long j3) {
        if (this.f5820k.g() == -1.0f) {
            this.p = true;
            if (Z1.i.a(b().f5779c, b().f5780d)) {
                d(b().f5779c);
            } else {
                d(b().b(j3));
                this.f5823n = b().g(j3);
            }
        }
    }

    public final void d(Object obj) {
        this.f5822m.setValue(obj);
    }

    public final void e(Object obj, boolean z3) {
        j0 j0Var = this.f5818i;
        Object obj2 = j0Var != null ? j0Var.f5779c : null;
        C0102j0 c0102j0 = this.f5814e;
        boolean a3 = Z1.i.a(obj2, c0102j0.getValue());
        C0098h0 c0098h0 = this.f5824o;
        C0102j0 c0102j02 = this.f5816g;
        if (a3) {
            c0102j02.setValue(new j0(this.f5825q, this.f5813d, obj, obj, this.f5823n.c()));
            this.f5821l = true;
            c0098h0.g(b().c());
            return;
        }
        C0102j0 c0102j03 = this.f5815f;
        InterfaceC0615z interfaceC0615z = (!z3 || this.p) ? (InterfaceC0615z) c0102j03.getValue() : ((InterfaceC0615z) c0102j03.getValue()) instanceof C0590b0 ? (InterfaceC0615z) c0102j03.getValue() : this.f5825q;
        s0 s0Var = this.f5826r;
        c0102j02.setValue(new j0(s0Var.e() <= 0 ? interfaceC0615z : new C0592c0(interfaceC0615z, s0Var.e()), this.f5813d, obj, c0102j0.getValue(), this.f5823n));
        c0098h0.g(b().c());
        this.f5821l = false;
        Boolean bool = Boolean.TRUE;
        C0102j0 c0102j04 = s0Var.f5848h;
        c0102j04.setValue(bool);
        if (s0Var.g()) {
            S.t tVar = s0Var.f5849i;
            int size = tVar.size();
            long j3 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                o0 o0Var = (o0) tVar.get(i3);
                C0098h0 c0098h02 = o0Var.f5824o;
                j3 = Math.max(j3, ((L0) S.q.t(c0098h02.f2261e, c0098h02)).f2162c);
                o0Var.c(0L);
            }
            c0102j04.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, InterfaceC0615z interfaceC0615z) {
        this.f5814e.setValue(obj2);
        this.f5815f.setValue(interfaceC0615z);
        if (Z1.i.a(b().f5780d, obj) && Z1.i.a(b().f5779c, obj2)) {
            return;
        }
        e(obj, false);
    }

    @Override // I.X0
    public final Object getValue() {
        return this.f5822m.getValue();
    }

    public final String toString() {
        return "current value: " + this.f5822m.getValue() + ", target: " + this.f5814e.getValue() + ", spec: " + ((InterfaceC0615z) this.f5815f.getValue());
    }
}
