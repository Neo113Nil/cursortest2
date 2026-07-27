package D;

import B1.C0097d;
import Z.C0310g;
import Z.C0316m;
import b0.InterfaceC0496d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import l.C0778d;
import l.C0789o;
import p0.AbstractC0953N;
import p0.AbstractC0954O;
import w2.C1294c;

/* loaded from: classes.dex */
public final class Q1 extends M2.p implements Function1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1609d = 2;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f1610e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f1611i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f1612j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(float f4, C0310g c0310g, C0316m c0316m) {
        super(1);
        this.f1610e = f4;
        this.f1611i = c0310g;
        this.f1612j = c0316m;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f1609d) {
            case 0:
                AbstractC0953N abstractC0953N = (AbstractC0953N) obj;
                C0778d c0778d = ((S1) this.f1612j).f1622w;
                AbstractC0953N.f(abstractC0953N, (AbstractC0954O) this.f1611i, (int) (c0778d != null ? ((Number) c0778d.d()).floatValue() : this.f1610e), 0);
                return Unit.f7487a;
            case 1:
                long longValue = ((Number) obj).longValue();
                o.U0 u02 = (o.U0) this.f1611i;
                if (u02.f8724b == Long.MIN_VALUE) {
                    u02.f8724b = longValue;
                }
                float f4 = u02.f8727e;
                C0789o c0789o = new C0789o(f4);
                float f5 = this.f1610e;
                C0789o c0789o2 = o.U0.f8722f;
                long b4 = f5 == 0.0f ? u02.f8723a.b(new C0789o(f4), c0789o2, u02.f8725c) : O2.c.b((longValue - u02.f8724b) / f5);
                float f6 = ((C0789o) u02.f8723a.f(b4, c0789o, c0789o2, u02.f8725c)).f7819a;
                u02.f8725c = (C0789o) u02.f8723a.g(b4, c0789o, c0789o2, u02.f8725c);
                u02.f8724b = longValue;
                float f7 = u02.f8727e - f6;
                u02.f8727e = f6;
                ((Function1) this.f1612j).invoke(Float.valueOf(f7));
                return Unit.f7487a;
            default:
                r0.G g4 = (r0.G) obj;
                g4.a();
                float f8 = this.f1610e;
                C0310g c0310g = (C0310g) this.f1611i;
                C0316m c0316m = (C0316m) this.f1612j;
                C0097d c0097d = g4.f9624d.f5603e;
                long s4 = c0097d.s();
                c0097d.k().g();
                try {
                    C1294c c1294c = (C1294c) c0097d.f987e;
                    c1294c.r(f8, 0.0f);
                    Z.r k4 = ((C0097d) c1294c.f11388d).k();
                    k4.q(Y.c.d(0L), Y.c.e(0L));
                    k4.r();
                    k4.q(-Y.c.d(0L), -Y.c.e(0L));
                    InterfaceC0496d.C(g4, c0310g, c0316m);
                    c0097d.k().b();
                    c0097d.G(s4);
                    return Unit.f7487a;
                } catch (Throwable th) {
                    c0097d.k().b();
                    c0097d.G(s4);
                    throw th;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(o.U0 u02, float f4, Function1 function1) {
        super(1);
        this.f1611i = u02;
        this.f1610e = f4;
        this.f1612j = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Q1(AbstractC0954O abstractC0954O, S1 s12, float f4) {
        super(1);
        this.f1611i = abstractC0954O;
        this.f1612j = s12;
        this.f1610e = f4;
    }
}
