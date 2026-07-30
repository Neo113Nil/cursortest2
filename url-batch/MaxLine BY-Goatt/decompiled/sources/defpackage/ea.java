package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ea implements i22 {
    public nc1 a;
    public jo2 b;
    public tc1 c;
    public sk2 d;

    @Override // defpackage.i22
    public final void a() {
        j(null);
    }

    @Override // defpackage.i22
    public final void b(nv2 nv2Var, c11 c11Var, oc ocVar, d40 d40Var) {
        j(new aa(nv2Var, this, c11Var, ocVar, d40Var, 0));
    }

    @Override // defpackage.i22
    public final void c(nv2 nv2Var, nv2 nv2Var2) {
        tc1 tc1Var = this.c;
        if (tc1Var != null) {
            boolean z = (jw2.a(tc1Var.h.b, nv2Var2.b) && Intrinsics.b(tc1Var.h.c, nv2Var2.c)) ? false : true;
            tc1Var.h = nv2Var2;
            int size = tc1Var.j.size();
            for (int i = 0; i < size; i++) {
                u72 u72Var = (u72) ((WeakReference) tc1Var.j.get(i)).get();
                if (u72Var != null) {
                    u72Var.g = nv2Var2;
                }
            }
            oc1 oc1Var = tc1Var.m;
            synchronized (oc1Var.c) {
                oc1Var.j = null;
                oc1Var.l = null;
                oc1Var.k = null;
                oc1Var.m = null;
                oc1Var.n = null;
                Unit unit = Unit.a;
            }
            if (Intrinsics.b(nv2Var, nv2Var2)) {
                if (z) {
                    t21 t21Var = tc1Var.b;
                    int e = jw2.e(nv2Var2.b);
                    int d = jw2.d(nv2Var2.b);
                    jw2 jw2Var = tc1Var.h.c;
                    int e2 = jw2Var != null ? jw2.e(jw2Var.a) : -1;
                    jw2 jw2Var2 = tc1Var.h.c;
                    t21Var.y().updateSelection((View) t21Var.n, e, d, e2, jw2Var2 != null ? jw2.d(jw2Var2.a) : -1);
                    return;
                }
                return;
            }
            if (nv2Var != null && (!Intrinsics.b(nv2Var.a.n, nv2Var2.a.n) || (jw2.a(nv2Var.b, nv2Var2.b) && !Intrinsics.b(nv2Var.c, nv2Var2.c)))) {
                t21 t21Var2 = tc1Var.b;
                t21Var2.y().restartInput((View) t21Var2.n);
                return;
            }
            int size2 = tc1Var.j.size();
            for (int i2 = 0; i2 < size2; i2++) {
                u72 u72Var2 = (u72) ((WeakReference) tc1Var.j.get(i2)).get();
                if (u72Var2 != null) {
                    nv2 nv2Var3 = tc1Var.h;
                    t21 t21Var3 = tc1Var.b;
                    if (u72Var2.k) {
                        u72Var2.g = nv2Var3;
                        if (u72Var2.i) {
                            t21Var3.y().updateExtractedText((View) t21Var3.n, u72Var2.h, s93.y(nv2Var3));
                        }
                        jw2 jw2Var3 = nv2Var3.c;
                        long j = nv2Var3.b;
                        int e3 = jw2Var3 != null ? jw2.e(jw2Var3.a) : -1;
                        jw2 jw2Var4 = nv2Var3.c;
                        t21Var3.y().updateSelection((View) t21Var3.n, jw2.e(j), jw2.d(j), e3, jw2Var4 != null ? jw2.d(jw2Var4.a) : -1);
                    }
                }
            }
        }
    }

    @Override // defpackage.i22
    public final void d() {
        kn2 kn2Var;
        nc1 nc1Var = this.a;
        if (nc1Var == null || (kn2Var = (kn2) tk3.J(nc1Var, p00.p)) == null) {
            return;
        }
        ((r90) kn2Var).b();
    }

    @Override // defpackage.i22
    public final void e() {
        kn2 kn2Var;
        nc1 nc1Var = this.a;
        if (nc1Var == null || (kn2Var = (kn2) tk3.J(nc1Var, p00.p)) == null) {
            return;
        }
        ((r90) kn2Var).a();
    }

    @Override // defpackage.i22
    public final void f(nv2 nv2Var, cu1 cu1Var, bw2 bw2Var, s72 s72Var, w72 w72Var, w72 w72Var2) {
        tc1 tc1Var = this.c;
        if (tc1Var != null) {
            oc1 oc1Var = tc1Var.m;
            synchronized (oc1Var.c) {
                try {
                    oc1Var.j = nv2Var;
                    oc1Var.l = cu1Var;
                    oc1Var.k = bw2Var;
                    oc1Var.m = w72Var;
                    oc1Var.n = w72Var2;
                    if (!oc1Var.e) {
                        if (oc1Var.d) {
                        }
                        Unit unit = Unit.a;
                    }
                    oc1Var.a();
                    Unit unit2 = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // defpackage.i22
    public final void g() {
        jo2 jo2Var = this.b;
        if (jo2Var != null) {
            jo2Var.f(null);
        }
        this.b = null;
        xn1 i = i();
        if (i != null) {
            sk2 sk2Var = (sk2) i;
            synchronized (sk2Var) {
                sk2Var.u(sk2Var.o() + sk2Var.w, sk2Var.v, sk2Var.o() + sk2Var.w, sk2Var.o() + sk2Var.w + sk2Var.x);
                Unit unit = Unit.a;
            }
        }
    }

    @Override // defpackage.i22
    public final void h(w72 w72Var) {
        Rect rect;
        tc1 tc1Var = this.c;
        if (tc1Var != null) {
            tc1Var.l = new Rect(si1.b(w72Var.a), si1.b(w72Var.b), si1.b(w72Var.c), si1.b(w72Var.d));
            if (!tc1Var.j.isEmpty() || (rect = tc1Var.l) == null) {
                return;
            }
            tc1Var.a.requestRectangleOnScreen(new Rect(rect));
        }
    }

    public final xn1 i() {
        sk2 sk2Var = this.d;
        if (sk2Var != null) {
            return sk2Var;
        }
        if (!aq2.a) {
            return null;
        }
        sk2 m = s93.m(2, hq.o);
        this.d = m;
        return m;
    }

    public final void j(aa aaVar) {
        nc1 nc1Var = this.a;
        if (nc1Var == null) {
            return;
        }
        jo2 jo2Var = null;
        j5 j5Var = new j5(aaVar, this, nc1Var, jo2Var, 1);
        if (nc1Var.z) {
            a50 u0 = nc1Var.u0();
            d50 d50Var = d50.m;
            jo2Var = z71.H(u0, null, new v(nc1Var, j5Var, jo2Var, 27), 1);
        }
        this.b = jo2Var;
    }

    public final void k(nc1 nc1Var) {
        if (this.a == nc1Var) {
            this.a = null;
            return;
        }
        StringBuilder sb = new StringBuilder("Expected textInputModifierNode to be ");
        sb.append(nc1Var);
        nc1 nc1Var2 = this.a;
        sb.append(" but was ");
        sb.append(nc1Var2);
        throw new IllegalStateException(sb.toString().toString());
    }
}
