package G;

import I.C0152h0;
import I.C0156j0;
import I.InterfaceC0142c0;
import I.K0;
import a.AbstractC0235a;
import a0.C0241f;
import e2.InterfaceC0424c;
import h2.AbstractC0508a;
import m.l0;

/* loaded from: classes.dex */
public final class n extends f2.k implements InterfaceC0424c {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f2012e = 0;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f2013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f2014g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(float f3, InterfaceC0142c0 interfaceC0142c0) {
        super(1);
        this.f2013f = f3;
        this.f2014g = interfaceC0142c0;
    }

    @Override // e2.InterfaceC0424c
    public final Object n(Object obj) {
        switch (this.f2012e) {
            case 0:
                long j3 = ((C0241f) obj).f4736a;
                float d3 = C0241f.d(j3);
                float f3 = this.f2013f;
                float f4 = d3 * f3;
                float b3 = C0241f.b(j3) * f3;
                InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) this.f2014g;
                if (C0241f.d(((C0241f) interfaceC0142c0.getValue()).f4736a) != f4 || C0241f.b(((C0241f) interfaceC0142c0.getValue()).f4736a) != b3) {
                    interfaceC0142c0.setValue(new C0241f(AbstractC0235a.e(f4, b3)));
                }
                break;
            default:
                long longValue = ((Number) obj).longValue();
                l0 l0Var = (l0) this.f2014g;
                if (!l0Var.g()) {
                    C0152h0 c0152h0 = l0Var.f6842g;
                    if (((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c == Long.MIN_VALUE) {
                        c0152h0.g(longValue);
                        ((C0156j0) l0Var.f6836a.f6877a).setValue(Boolean.TRUE);
                    }
                    long j4 = longValue - ((K0) S.p.t(c0152h0.f2818e, c0152h0)).f2717c;
                    float f5 = this.f2013f;
                    if (f5 != 0.0f) {
                        j4 = AbstractC0508a.R(j4 / f5);
                    }
                    l0Var.o(j4);
                    l0Var.h(j4, f5 == 0.0f);
                }
                break;
        }
        return R1.y.f4171a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(l0 l0Var, float f3) {
        super(1);
        this.f2014g = l0Var;
        this.f2013f = f3;
    }
}
