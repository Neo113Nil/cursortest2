package s2;

import R1.y;
import e2.InterfaceC0424c;
import q2.w0;

/* loaded from: classes.dex */
public final class r extends g {

    /* renamed from: o, reason: collision with root package name */
    public final EnumC0967a f8415o;

    public r(int i3, EnumC0967a enumC0967a, InterfaceC0424c interfaceC0424c) {
        super(i3, interfaceC0424c);
        this.f8415o = enumC0967a;
        if (enumC0967a != EnumC0967a.f8359d) {
            if (i3 < 1) {
                throw new IllegalArgumentException(A.k.g(i3, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + f2.v.a(g.class).b() + " instead").toString());
        }
    }

    public final Object L(Object obj, boolean z3) {
        o oVar;
        InterfaceC0424c interfaceC0424c;
        C1.c b3;
        EnumC0967a enumC0967a = EnumC0967a.f8361f;
        y yVar = y.f4171a;
        if (this.f8415o == enumC0967a) {
            Object p3 = super.p(obj);
            if (!(p3 instanceof m) || (p3 instanceof l)) {
                return p3;
            }
            if (!z3 || (interfaceC0424c = this.f8386e) == null || (b3 = v2.a.b(interfaceC0424c, obj, null)) == null) {
                return yVar;
            }
            throw b3;
        }
        z1.c cVar = i.f8391d;
        o oVar2 = (o) g.f8380j.get(this);
        while (true) {
            long andIncrement = g.f8376f.getAndIncrement(this);
            long j3 = andIncrement & 1152921504606846975L;
            boolean x3 = x(andIncrement, false);
            int i3 = i.f8389b;
            long j4 = i3;
            long j5 = j3 / j4;
            int i4 = (int) (j3 % j4);
            if (oVar2.f9826c != j5) {
                o b4 = g.b(this, j5, oVar2);
                if (b4 != null) {
                    oVar = b4;
                } else if (x3) {
                    return new l(u());
                }
            } else {
                oVar = oVar2;
            }
            int e3 = g.e(this, oVar, i4, obj, j3, cVar, x3);
            if (e3 == 0) {
                oVar.a();
                return yVar;
            }
            if (e3 == 1) {
                return yVar;
            }
            if (e3 == 2) {
                if (x3) {
                    oVar.h();
                    return new l(u());
                }
                w0 w0Var = cVar instanceof w0 ? (w0) cVar : null;
                if (w0Var != null) {
                    w0Var.a(oVar, i4 + i3);
                }
                n((oVar.f9826c * j4) + i4);
                return yVar;
            }
            if (e3 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (e3 == 4) {
                if (j3 < g.f8377g.get(this)) {
                    oVar.a();
                }
                return new l(u());
            }
            if (e3 == 5) {
                oVar.a();
            }
            oVar2 = oVar;
        }
    }

    @Override // s2.g, s2.w
    public final Object f(V1.d dVar, Object obj) {
        C1.c b3;
        if (!(L(obj, true) instanceof l)) {
            return y.f4171a;
        }
        InterfaceC0424c interfaceC0424c = this.f8386e;
        if (interfaceC0424c == null || (b3 = v2.a.b(interfaceC0424c, obj, null)) == null) {
            throw u();
        }
        R1.a.a(b3, u());
        throw b3;
    }

    @Override // s2.g, s2.w
    public final Object p(Object obj) {
        return L(obj, false);
    }

    @Override // s2.g
    public final boolean z() {
        return this.f8415o == EnumC0967a.f8360e;
    }
}
