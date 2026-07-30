package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class od0 implements ef1, xk0 {
    public final /* synthetic */ rd0 d;
    public final /* synthetic */ xd0 e;

    public od0(xd0 xd0Var) {
        this.e = xd0Var;
        this.d = xd0Var.l;
    }

    @Override // defpackage.nr
    public final float A(long j) {
        return this.d.A(j);
    }

    @Override // defpackage.xk0
    public final wk0 D(int i, int i2, Map map, Function1 function1, Function1 function12) {
        return this.d.D(i, i2, map, function1, function12);
    }

    @Override // defpackage.nr
    public final int H(float f) {
        return this.d.H(f);
    }

    @Override // defpackage.nr
    public final long Q(long j) {
        return this.d.Q(j);
    }

    @Override // defpackage.nr
    public final float U(long j) {
        return this.d.U(j);
    }

    @Override // defpackage.nr
    public final long a0(float f) {
        return this.d.a0(f);
    }

    @Override // defpackage.nr
    public final float f() {
        return this.d.g;
    }

    @Override // defpackage.xk0
    public final vc0 getLayoutDirection() {
        return this.d.d;
    }

    @Override // defpackage.ef1
    public final List i(Object obj, Function2 function2) {
        xd0 xd0Var = this.e;
        jd0 jd0Var = xd0Var.d;
        vn0 vn0Var = xd0Var.k;
        jd0 jd0Var2 = (jd0) vn0Var.g(obj);
        if (jd0Var2 != null && ((bo0) jd0Var.n()).d.i(jd0Var2) < xd0Var.h) {
            return jd0Var2.K.p.d0();
        }
        vn0 vn0Var2 = xd0Var.p;
        vn0 vn0Var3 = xd0Var.n;
        eo0 eo0Var = xd0Var.q;
        if (eo0Var.g < xd0Var.i) {
            o80.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        jd0 jd0Var3 = (jd0) vn0Var.g(obj);
        int i = eo0Var.g;
        int i2 = xd0Var.i;
        if (i == i2) {
            eo0Var.b(obj);
        } else {
            Object[] objArr = eo0Var.d;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        xd0Var.i++;
        boolean b = vn0Var3.b(obj);
        if (b || jd0Var3 != null) {
            if (!b && jd0Var3 != null) {
                xd0Var.j(((bo0) jd0Var.n()).d.i(jd0Var3), ((bo0) jd0Var.n()).d.g);
                xd0Var.s++;
                vn0Var.k(obj);
                vn0Var3.m(obj, jd0Var3);
                vn0Var2.m(obj, xd0Var.f(obj));
                if (jd0Var.F()) {
                    xd0Var.h();
                }
            }
            jd0 jd0Var4 = (jd0) vn0Var3.g(obj);
            pd0 pd0Var = jd0Var4 != null ? (pd0) xd0Var.j.g(jd0Var4) : null;
            if (pd0Var != null && pd0Var.d) {
                xd0Var.m(jd0Var4, obj, false, function2);
            }
            if ((pd0Var != null ? pd0Var.f : null) != null) {
                xd0Var.d(pd0Var, true);
            }
        } else {
            xd0Var.k(obj, function2, false);
            vn0Var2.m(obj, xd0Var.f(obj));
        }
        jd0 jd0Var5 = (jd0) vn0Var3.g(obj);
        if (jd0Var5 == null) {
            return nv.d;
        }
        List d0 = jd0Var5.K.p.d0();
        bo0 bo0Var = (bo0) d0;
        int i3 = bo0Var.d.g;
        for (int i4 = 0; i4 < i3; i4++) {
            ((uk0) bo0Var.get(i4)).j.b = true;
        }
        return d0;
    }

    @Override // defpackage.nr
    public final float i0(int i) {
        return this.d.i0(i);
    }

    @Override // defpackage.nr
    public final float k() {
        return this.d.e;
    }

    @Override // defpackage.nr
    public final float k0(float f) {
        return f / this.d.k();
    }

    @Override // defpackage.xk0
    public final boolean m() {
        return this.d.m();
    }

    @Override // defpackage.nr
    public final long p(float f) {
        return this.d.p(f);
    }

    @Override // defpackage.nr
    public final float s(float f) {
        return this.d.k() * f;
    }

    @Override // defpackage.xk0
    public final wk0 w(int i, int i2, Map map, Function1 function1) {
        return this.d.D(i, i2, map, null, function1);
    }
}
