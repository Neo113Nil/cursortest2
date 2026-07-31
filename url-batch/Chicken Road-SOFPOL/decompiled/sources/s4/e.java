package s4;

import b.o;
import b.q;
import b.u;
import c5.x;
import d7.n0;
import o4.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public x f6707a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f6708b;

    public final void a() {
        x xVar = this.f6707a;
        if (xVar == null) {
            throw new IllegalStateException("This input is not added to any dispatcher.");
        }
        if (!this.f6708b) {
            xVar.f(this, null);
        }
        f fVar = (f) xVar.f1738e;
        q qVar = (q) xVar.f1737d;
        fVar.getClass();
        if (equals(fVar.f6716h) && -1 == fVar.f6715g) {
            o oVar = fVar.f6714f;
            if (oVar == null) {
                oVar = fVar.c(-1);
            }
            fVar.f6714f = null;
            fVar.f6715g = 0;
            fVar.f6716h = null;
            if (oVar != null) {
                switch (oVar.f1011d) {
                    case 0:
                        u uVar = (u) oVar.f1012e;
                        switch (uVar.f1024d) {
                            case 0:
                                ((u2.a) uVar.f1025e).i(uVar);
                                break;
                            case 1:
                                ((c.d) uVar.f1025e).c();
                                break;
                            case a4.i.FLOAT_FIELD_NUMBER /* 2 */:
                                ((h4.j) uVar.f1025e).i();
                                throw null;
                            default:
                                r4.g gVar = ((t) uVar.f1025e).f5685b;
                                if (!gVar.f6589f.isEmpty()) {
                                    o4.o f6 = gVar.f();
                                    q6.i.b(f6);
                                    if (gVar.m(f6.f5671e.f4348a, true, false)) {
                                        gVar.b();
                                        break;
                                    }
                                }
                                break;
                        }
                    default:
                        ((c.d) oVar.f1012e).c();
                        break;
                }
            } else {
                ((b.t) qVar.f1015a).f1019a.run();
            }
            n0 n0Var = fVar.f6709a;
            n0Var.getClass();
            n0Var.j(null, g.f6722a);
        }
        this.f6708b = false;
    }

    public void b(boolean z3) {
    }
}
