package defpackage;

import java.lang.reflect.Type;
import java.util.Map;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fi1 extends l03 {
    public final sw0 a;
    public final sw0 b;
    public final mt1 c;

    public fi1(ov ovVar, uw0 uw0Var, Type type, l03 l03Var, Type type2, l03 l03Var2, mt1 mt1Var) {
        this.a = new sw0(uw0Var, l03Var, type);
        this.b = new sw0(uw0Var, l03Var2, type2);
        this.c = mt1Var;
    }

    @Override // defpackage.l03
    public final Object a(z61 z61Var) {
        l03 l03Var = this.b.b;
        l03 l03Var2 = this.a.b;
        int R = z61Var.R();
        if (R == 9) {
            z61Var.N();
            return null;
        }
        Map map = (Map) this.c.n();
        if (R == 1) {
            z61Var.b();
            while (z61Var.s()) {
                z61Var.b();
                Object a = l03Var2.a(z61Var);
                if (map.put(a, l03Var.a(z61Var)) != null) {
                    throw new a71("duplicate key: " + a);
                }
                z61Var.o();
            }
            z61Var.o();
            return map;
        }
        z61Var.f();
        while (z61Var.s()) {
            u30.n.getClass();
            int i = z61Var.t;
            if (i == 0) {
                i = z61Var.n();
            }
            if (i == 13) {
                z61Var.t = 9;
            } else if (i == 12) {
                z61Var.t = 8;
            } else {
                if (i != 14) {
                    dm0.h(q40.w(z61Var.R()), z61Var.y(), "Expected a name but was ");
                    return null;
                }
                z61Var.t = 10;
            }
            Object a2 = l03Var2.a(z61Var);
            if (map.put(a2, l03Var.a(z61Var)) != null) {
                throw new a71("duplicate key: " + a2);
            }
        }
        z61Var.p();
        return map;
    }
}
