package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class mk1 implements b9 {
    public final Object a;
    public final ArrayList b = new ArrayList();
    public Object c;

    public mk1(jd0 jd0Var) {
        this.a = jd0Var;
        this.c = jd0Var;
    }

    @Override // defpackage.b9
    public final void a(int i, Object obj) {
        ((jd0) this.c).z(i, (jd0) obj);
    }

    @Override // defpackage.b9
    public final void b(Object obj) {
        this.b.add(this.c);
        this.c = obj;
    }

    @Override // defpackage.b9
    public final void c() {
        u11 rectManager;
        i3 i3Var;
        u11 rectManager2;
        jd0 jd0Var = (jd0) this.c;
        l7 l7Var = jd0Var.J;
        if (!jd0Var.F()) {
            o80.a("onReuse is only expected on attached node");
        }
        pn1 pn1Var = jd0Var.t;
        if (pn1Var != null) {
            View view = pn1Var.e;
            if (view.getParent() != pn1Var) {
                pn1Var.addView(view);
            } else {
                pn1Var.j.invoke();
            }
        }
        xd0 xd0Var = jd0Var.L;
        if (xd0Var != null) {
            xd0Var.i(false);
        }
        jd0Var.y = false;
        if (jd0Var.U) {
            jd0Var.U = false;
        } else {
            zl0 zl0Var = (ig1) jd0Var.J.f;
            for (zl0 zl0Var2 = zl0Var; zl0Var2 != null; zl0Var2 = zl0Var2.i) {
                if (zl0Var2.r) {
                    zl0Var2.u0();
                }
            }
            for (zl0 zl0Var3 = zl0Var; zl0Var3 != null; zl0Var3 = zl0Var3.i) {
                if (zl0Var3.r) {
                    zl0Var3.w0();
                }
            }
            while (zl0Var != null) {
                if (zl0Var.r) {
                    zl0Var.q0();
                }
                zl0Var = zl0Var.i;
            }
        }
        int i = jd0Var.e;
        eu0 eu0Var = jd0Var.s;
        if (eu0Var != null && (rectManager2 = ((d4) eu0Var).getRectManager()) != null) {
            rectManager2.h(jd0Var);
        }
        jd0Var.e = i81.a.addAndGet(1);
        eu0 eu0Var2 = jd0Var.s;
        if (eu0Var2 != null) {
            d4 d4Var = (d4) eu0Var2;
            d4Var.m13getLayoutNodes().g(i);
            d4Var.m13getLayoutNodes().h(jd0Var.e, jd0Var);
        }
        for (zl0 zl0Var4 = (zl0) l7Var.g; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
            zl0Var4.p0();
        }
        l7Var.h();
        if (l7Var.g(8)) {
            jd0Var.D();
        }
        jd0.U(jd0Var);
        eu0 eu0Var3 = jd0Var.s;
        if (eu0Var3 != null && (i3Var = ((d4) eu0Var3).P) != null) {
            d4 d4Var2 = i3Var.g;
            nq0 nq0Var = i3Var.d;
            fn0 fn0Var = i3Var.k;
            if (fn0Var.e(i)) {
                nq0Var.C(d4Var2, i, false);
            }
            h81 v = jd0Var.v();
            if (v != null && v.d.b(p81.q)) {
                fn0Var.a(jd0Var.e);
                nq0Var.C(d4Var2, jd0Var.e, true);
            }
        }
        eu0 eu0Var4 = jd0Var.s;
        if (eu0Var4 == null || (rectManager = ((d4) eu0Var4).getRectManager()) == null) {
            return;
        }
        rectManager.f(jd0Var, true);
    }

    @Override // defpackage.b9
    public final /* bridge */ /* synthetic */ void d(int i, Object obj) {
    }

    @Override // defpackage.b9
    public final void e() {
        eu0 eu0Var = ((jd0) this.a).s;
        if (eu0Var != null) {
            ((d4) eu0Var).w();
        }
    }

    @Override // defpackage.b9
    public final void f(int i, int i2, int i3) {
        ((jd0) this.c).J(i, i2, i3);
    }

    @Override // defpackage.b9
    public final Object g() {
        return this.c;
    }

    @Override // defpackage.b9
    public final void h(int i, int i2) {
        ((jd0) this.c).O(i, i2);
    }

    @Override // defpackage.b9
    public final void i() {
        this.c = this.b.remove(r0.size() - 1);
    }

    public final void k() {
        this.b.clear();
        this.c = this.a;
        ((jd0) this.a).N();
    }
}
