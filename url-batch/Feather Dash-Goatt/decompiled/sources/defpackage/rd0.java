package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class rd0 implements ef1 {
    public vc0 d = vc0.e;
    public float e;
    public float g;
    public final /* synthetic */ xd0 h;

    public rd0(xd0 xd0Var) {
        this.h = xd0Var;
    }

    @Override // defpackage.xk0
    public final wk0 D(int i, int i2, Map map, Function1 function1, Function1 function12) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            o80.b("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new qd0(i, i2, map, function1, this, this.h, function12);
    }

    @Override // defpackage.nr
    public final float f() {
        return this.g;
    }

    @Override // defpackage.xk0
    public final vc0 getLayoutDirection() {
        return this.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    @Override // defpackage.ef1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List i(Object obj, Function2 function2) {
        Object obj2;
        xd0 xd0Var = this.h;
        xd0Var.h();
        jd0 jd0Var = xd0Var.d;
        fd0 fd0Var = jd0Var.K.d;
        fd0 fd0Var2 = fd0.d;
        if (fd0Var != fd0Var2 && fd0Var != fd0.g && fd0Var != fd0.e && fd0Var != fd0.h) {
            o80.b("subcompose can only be used inside the measure or layout blocks");
        }
        vn0 vn0Var = xd0Var.k;
        Object g = vn0Var.g(obj);
        if (g == null) {
            g = (jd0) xd0Var.n.k(obj);
            if (g != null) {
                if (xd0Var.s <= 0) {
                    o80.b("Check failed.");
                }
                xd0Var.s--;
            } else {
                g = xd0Var.n(obj);
                if (g == null) {
                    int i = xd0Var.h;
                    jd0 jd0Var2 = new jd0(2);
                    jd0Var.v = true;
                    jd0Var.z(i, jd0Var2);
                    jd0Var.v = false;
                    g = jd0Var2;
                }
            }
            vn0Var.m(obj, g);
        }
        jd0 jd0Var3 = (jd0) g;
        List n = jd0Var.n();
        int i2 = xd0Var.h;
        if (i2 >= 0) {
            bo0 bo0Var = (bo0) n;
            if (i2 < bo0Var.d.g) {
                obj2 = bo0Var.get(i2);
                if (obj2 != jd0Var3) {
                    int i3 = ((bo0) jd0Var.n()).d.i(jd0Var3);
                    if (i3 < xd0Var.h) {
                        o80.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    }
                    int i4 = xd0Var.h;
                    if (i4 != i3) {
                        xd0Var.j(i3, i4);
                    }
                }
                xd0Var.h++;
                xd0Var.m(jd0Var3, obj, false, function2);
                return (fd0Var != fd0Var2 || fd0Var == fd0.g) ? jd0Var3.K.p.d0() : jd0Var3.l();
            }
        }
        obj2 = null;
        if (obj2 != jd0Var3) {
        }
        xd0Var.h++;
        xd0Var.m(jd0Var3, obj, false, function2);
        if (fd0Var != fd0Var2) {
        }
    }

    @Override // defpackage.nr
    public final float k() {
        return this.e;
    }

    @Override // defpackage.xk0
    public final boolean m() {
        fd0 fd0Var = this.h.d.K.d;
        return fd0Var == fd0.h || fd0Var == fd0.e;
    }
}
