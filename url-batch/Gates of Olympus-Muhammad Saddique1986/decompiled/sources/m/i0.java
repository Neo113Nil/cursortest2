package m;

import I.AbstractC0139b;
import I.C0143d;
import I.C0148f0;
import I.C0152h0;
import I.C0156j0;
import I.K0;
import I.W0;

/* loaded from: classes.dex */
public final class i0 implements W0 {

    /* renamed from: d, reason: collision with root package name */
    public final u0 f6806d;

    /* renamed from: e, reason: collision with root package name */
    public final C0156j0 f6807e;

    /* renamed from: f, reason: collision with root package name */
    public final C0156j0 f6808f;

    /* renamed from: g, reason: collision with root package name */
    public final C0156j0 f6809g;

    /* renamed from: h, reason: collision with root package name */
    public C0614J f6810h;

    /* renamed from: i, reason: collision with root package name */
    public d0 f6811i;

    /* renamed from: j, reason: collision with root package name */
    public final C0156j0 f6812j;

    /* renamed from: k, reason: collision with root package name */
    public final C0148f0 f6813k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f6814l;

    /* renamed from: m, reason: collision with root package name */
    public final C0156j0 f6815m;

    /* renamed from: n, reason: collision with root package name */
    public r f6816n;

    /* renamed from: o, reason: collision with root package name */
    public final C0152h0 f6817o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f6818p;

    /* renamed from: q, reason: collision with root package name */
    public final W f6819q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ l0 f6820r;

    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, java.util.Map] */
    public i0(l0 l0Var, Object obj, r rVar, u0 u0Var) {
        this.f6820r = l0Var;
        this.f6806d = u0Var;
        I.W w2 = I.W.f2783i;
        C0156j0 K3 = C0143d.K(obj, w2);
        this.f6807e = K3;
        Object obj2 = null;
        C0156j0 K4 = C0143d.K(AbstractC0620e.i(0.0f, null, 7), w2);
        this.f6808f = K4;
        this.f6809g = C0143d.K(new d0((InterfaceC0640z) K4.getValue(), u0Var, obj, K3.getValue(), rVar), w2);
        this.f6812j = C0143d.K(Boolean.TRUE, w2);
        this.f6813k = C0143d.I(-1.0f);
        this.f6815m = C0143d.K(obj, w2);
        this.f6816n = rVar;
        long c2 = b().c();
        int i3 = AbstractC0139b.f2792b;
        this.f6817o = new C0152h0(c2);
        Float f3 = (Float) z0.f6914a.get(u0Var);
        if (f3 != null) {
            float floatValue = f3.floatValue();
            r rVar2 = (r) u0Var.f6889a.n(obj);
            int b3 = rVar2.b();
            for (int i4 = 0; i4 < b3; i4++) {
                rVar2.e(floatValue, i4);
            }
            obj2 = this.f6806d.f6890b.n(rVar2);
        }
        this.f6819q = AbstractC0620e.i(0.0f, obj2, 3);
    }

    public final d0 b() {
        return (d0) this.f6809g.getValue();
    }

    public final void c(long j3) {
        if (this.f6813k.g() == -1.0f) {
            this.f6818p = true;
            if (f2.j.a(b().f6769c, b().f6770d)) {
                d(b().f6769c);
            } else {
                d(b().b(j3));
                this.f6816n = b().g(j3);
            }
        }
    }

    public final void d(Object obj) {
        this.f6815m.setValue(obj);
    }

    public final void e(Object obj, boolean z3) {
        d0 d0Var = this.f6811i;
        Object obj2 = d0Var != null ? d0Var.f6769c : null;
        C0156j0 c0156j0 = this.f6807e;
        boolean a3 = f2.j.a(obj2, c0156j0.getValue());
        C0152h0 c0152h0 = this.f6817o;
        C0156j0 c0156j02 = this.f6809g;
        if (a3) {
            c0156j02.setValue(new d0(this.f6819q, this.f6806d, obj, obj, this.f6816n.c()));
            this.f6814l = true;
            c0152h0.g(b().c());
            return;
        }
        C0156j0 c0156j03 = this.f6808f;
        InterfaceC0640z interfaceC0640z = (!z3 || this.f6818p) ? (InterfaceC0640z) c0156j03.getValue() : ((InterfaceC0640z) c0156j03.getValue()) instanceof W ? (InterfaceC0640z) c0156j03.getValue() : this.f6819q;
        l0 l0Var = this.f6820r;
        c0156j02.setValue(new d0(l0Var.e() <= 0 ? interfaceC0640z : new X(interfaceC0640z, l0Var.e()), this.f6806d, obj, c0156j0.getValue(), this.f6816n));
        c0152h0.g(b().c());
        this.f6814l = false;
        Boolean bool = Boolean.TRUE;
        C0156j0 c0156j04 = l0Var.f6843h;
        c0156j04.setValue(bool);
        if (l0Var.g()) {
            S.t tVar = l0Var.f6844i;
            int size = tVar.size();
            long j3 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                i0 i0Var = (i0) tVar.get(i3);
                C0152h0 c0152h02 = i0Var.f6817o;
                j3 = Math.max(j3, ((K0) S.p.t(c0152h02.f2818e, c0152h02)).f2717c);
                i0Var.c(0L);
            }
            c0156j04.setValue(Boolean.FALSE);
        }
    }

    public final void f(Object obj, Object obj2, InterfaceC0640z interfaceC0640z) {
        this.f6807e.setValue(obj2);
        this.f6808f.setValue(interfaceC0640z);
        if (f2.j.a(b().f6770d, obj) && f2.j.a(b().f6769c, obj2)) {
            return;
        }
        e(obj, false);
    }

    public final void g(Object obj, InterfaceC0640z interfaceC0640z) {
        if (this.f6814l) {
            d0 d0Var = this.f6811i;
            if (f2.j.a(obj, d0Var != null ? d0Var.f6769c : null)) {
                return;
            }
        }
        C0156j0 c0156j0 = this.f6807e;
        boolean a3 = f2.j.a(c0156j0.getValue(), obj);
        C0148f0 c0148f0 = this.f6813k;
        if (a3 && c0148f0.g() == -1.0f) {
            return;
        }
        c0156j0.setValue(obj);
        this.f6808f.setValue(interfaceC0640z);
        Object value = c0148f0.g() == -3.0f ? obj : this.f6815m.getValue();
        C0156j0 c0156j02 = this.f6812j;
        e(value, !((Boolean) c0156j02.getValue()).booleanValue());
        c0156j02.setValue(Boolean.valueOf(c0148f0.g() == -3.0f));
        if (c0148f0.g() >= 0.0f) {
            d(b().b((long) (c0148f0.g() * b().c())));
        } else if (c0148f0.g() == -3.0f) {
            d(obj);
        }
        this.f6814l = false;
        c0148f0.h(-1.0f);
    }

    @Override // I.W0
    public final Object getValue() {
        return this.f6815m.getValue();
    }

    public final String toString() {
        return "current value: " + this.f6815m.getValue() + ", target: " + this.f6807e.getValue() + ", spec: " + ((InterfaceC0640z) this.f6808f.getValue());
    }
}
