package a2;

import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class v implements a1 {

    /* renamed from: d, reason: collision with root package name */
    public x2.l f164d = x2.l.f10331e;

    /* renamed from: e, reason: collision with root package name */
    public float f165e;

    /* renamed from: i, reason: collision with root package name */
    public float f166i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c0 f167r;

    public v(c0 c0Var) {
        this.f167r = c0Var;
    }

    @Override // x2.c
    public final float d() {
        return this.f166i;
    }

    @Override // a2.a1
    public final List f(Object obj, Function2 function2) {
        c0 c0Var = this.f167r;
        c0Var.c();
        c2.g0 g0Var = c0Var.f61d;
        c2.c0 c0Var2 = g0Var.T.f1596d;
        c2.c0 c0Var3 = c2.c0.f1505d;
        if (c0Var2 != c0Var3 && c0Var2 != c2.c0.f1507i && c0Var2 != c2.c0.f1506e && c0Var2 != c2.c0.f1508r) {
            z1.a.b("subcompose can only be used inside the measure or layout blocks");
        }
        s.h0 h0Var = c0Var.f66t;
        Object g = h0Var.g(obj);
        if (g == null) {
            g = (c2.g0) c0Var.f69w.k(obj);
            if (g != null) {
                if (c0Var.B <= 0) {
                    z1.a.b("Check failed.");
                }
                c0Var.B--;
            } else {
                g = c0Var.j(obj);
                if (g == null) {
                    int i3 = c0Var.f63i;
                    c2.g0 g0Var2 = new c2.g0(2);
                    g0Var.E = true;
                    g0Var.y(i3, g0Var2);
                    g0Var.E = false;
                    g = g0Var2;
                }
            }
            h0Var.m(obj, g);
        }
        c2.g0 g0Var3 = (c2.g0) g;
        if (CollectionsKt.y(c0Var.f63i, g0Var.m()) != g0Var3) {
            int i10 = ((o0.b) g0Var.m()).f7311d.i(g0Var3);
            if (i10 < c0Var.f63i) {
                z1.a.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i11 = c0Var.f63i;
            if (i11 != i10) {
                c0Var.e(i10, i11);
            }
        }
        c0Var.f63i++;
        c0Var.i(g0Var3, obj, (x0.d) function2);
        return (c0Var2 == c0Var3 || c0Var2 == c2.c0.f1507i) ? g0Var3.T.f1606p.c0() : g0Var3.k();
    }

    @Override // x2.c
    public final float g() {
        return this.f165e;
    }

    @Override // a2.i0
    public final x2.l getLayoutDirection() {
        return this.f164d;
    }

    @Override // a2.i0
    public final boolean j() {
        c2.c0 c0Var = this.f167r.f61d.T.f1596d;
        return c0Var == c2.c0.f1508r || c0Var == c2.c0.f1506e;
    }

    @Override // a2.i0
    public final h0 x(int i3, int i10, Map map, Function1 function1, Function1 function12) {
        if ((i3 & (-16777216)) != 0 || ((-16777216) & i10) != 0) {
            z1.a.b("Size(" + i3 + " x " + i10 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new u(i3, i10, map, function1, this, this.f167r, function12);
    }
}
