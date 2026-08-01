package a2;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s implements a1, i0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v f146d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c0 f147e;

    public s(c0 c0Var) {
        this.f147e = c0Var;
        this.f146d = c0Var.f67u;
    }

    @Override // x2.c
    public final long H(long j) {
        return this.f146d.H(j);
    }

    @Override // x2.c
    public final float I(long j) {
        return this.f146d.I(j);
    }

    @Override // x2.c
    public final long N(float f3) {
        return this.f146d.N(f3);
    }

    @Override // x2.c
    public final float S(int i3) {
        return this.f146d.S(i3);
    }

    @Override // x2.c
    public final float T(float f3) {
        return f3 / this.f146d.g();
    }

    @Override // x2.c
    public final float d() {
        return this.f146d.f166i;
    }

    @Override // a2.a1
    public final List f(Object obj, Function2 function2) {
        c0 c0Var = this.f147e;
        c2.g0 g0Var = c0Var.f61d;
        s.h0 h0Var = c0Var.f66t;
        c2.g0 g0Var2 = (c2.g0) h0Var.g(obj);
        if (g0Var2 != null && ((o0.b) g0Var.m()).f7311d.i(g0Var2) < c0Var.f63i) {
            return g0Var2.T.f1606p.c0();
        }
        s.h0 h0Var2 = c0Var.f71y;
        s.h0 h0Var3 = c0Var.f69w;
        o0.e eVar = c0Var.f72z;
        if (eVar.f7319i < c0Var.f64r) {
            z1.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        c2.g0 g0Var3 = (c2.g0) h0Var.g(obj);
        int i3 = eVar.f7319i;
        int i10 = c0Var.f64r;
        if (i3 == i10) {
            eVar.b(obj);
        } else {
            Object[] objArr = eVar.f7317d;
            Object obj2 = objArr[i10];
            objArr[i10] = obj;
        }
        c0Var.f64r++;
        boolean b10 = h0Var3.b(obj);
        if (b10 || g0Var3 != null) {
            if (!b10 && g0Var3 != null) {
                c0Var.e(((o0.b) g0Var.m()).f7311d.i(g0Var3), ((o0.b) g0Var.m()).f7311d.f7319i);
                c0Var.B++;
                h0Var.k(obj);
                h0Var3.m(obj, g0Var3);
                h0Var2.m(obj, !g0Var.E() ? new y() : new z(c0Var, obj));
                if (g0Var.E()) {
                    c0Var.c();
                }
            }
            c2.g0 g0Var4 = (c2.g0) h0Var3.g(obj);
            t tVar = g0Var4 != null ? (t) c0Var.f65s.g(g0Var4) : null;
            if (tVar != null && tVar.f153d) {
                c0Var.i(g0Var4, obj, (x0.d) function2);
            }
        } else {
            if (g0Var.E()) {
                c0Var.c();
                if (!h0Var.c(obj)) {
                    h0Var2.k(obj);
                    Object g = h0Var3.g(obj);
                    if (g == null) {
                        g = c0Var.j(obj);
                        if (g != null) {
                            c0Var.e(((o0.b) g0Var.m()).f7311d.i(g), ((o0.b) g0Var.m()).f7311d.f7319i);
                            c0Var.B++;
                        } else {
                            int i11 = ((o0.b) g0Var.m()).f7311d.f7319i;
                            c2.g0 g0Var5 = new c2.g0(2);
                            g0Var.E = true;
                            g0Var.y(i11, g0Var5);
                            g0Var.E = false;
                            c0Var.B++;
                            g = g0Var5;
                        }
                        h0Var3.m(obj, g);
                    }
                    c0Var.i((c2.g0) g, obj, (x0.d) function2);
                }
            }
            h0Var2.m(obj, !g0Var.E() ? new y() : new z(c0Var, obj));
        }
        c2.g0 g0Var6 = (c2.g0) h0Var3.g(obj);
        if (g0Var6 == null) {
            return kotlin.collections.j0.f5574d;
        }
        List c02 = g0Var6.T.f1606p.c0();
        o0.b bVar = (o0.b) c02;
        int i12 = bVar.f7311d.f7319i;
        for (int i13 = 0; i13 < i12; i13++) {
            ((c2.w0) bVar.get(i13)).f1687t.f1594b = true;
        }
        return c02;
    }

    @Override // x2.c
    public final float g() {
        return this.f146d.f165e;
    }

    @Override // a2.i0
    public final x2.l getLayoutDirection() {
        return this.f146d.f164d;
    }

    @Override // a2.i0
    public final boolean j() {
        return this.f146d.j();
    }

    @Override // x2.c
    public final long l(float f3) {
        return this.f146d.l(f3);
    }

    @Override // x2.c
    public final long m(long j) {
        return this.f146d.m(j);
    }

    @Override // x2.c
    public final float n(float f3) {
        return this.f146d.g() * f3;
    }

    @Override // a2.i0
    public final h0 t(int i3, int i10, Map map, Function1 function1) {
        return this.f146d.x(i3, i10, map, null, function1);
    }

    @Override // x2.c
    public final float w(long j) {
        return this.f146d.w(j);
    }

    @Override // a2.i0
    public final h0 x(int i3, int i10, Map map, Function1 function1, Function1 function12) {
        return this.f146d.x(i3, i10, map, function1, function12);
    }

    @Override // x2.c
    public final int y(float f3) {
        return this.f146d.y(f3);
    }
}
