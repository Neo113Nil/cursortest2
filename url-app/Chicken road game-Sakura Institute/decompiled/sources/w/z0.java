package w;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.h0 f9471a;

    /* renamed from: b, reason: collision with root package name */
    public p1.p f9472b = null;

    /* renamed from: c, reason: collision with root package name */
    public p1.p f9473c;

    public z0(a2.h0 h0Var, p1.p pVar) {
        this.f9471a = h0Var;
        this.f9473c = pVar;
    }

    public final long a(long j8) {
        y0.d dVar;
        p1.p pVar = this.f9472b;
        y0.d dVar2 = y0.d.f9779e;
        if (pVar != null) {
            if (pVar.O()) {
                p1.p pVar2 = this.f9473c;
                dVar = pVar2 != null ? pVar2.h(pVar, true) : null;
            } else {
                dVar = dVar2;
            }
            if (dVar != null) {
                dVar2 = dVar;
            }
        }
        float d8 = y0.c.d(j8);
        float f9 = dVar2.f9780a;
        if (d8 >= f9) {
            float d9 = y0.c.d(j8);
            f9 = dVar2.f9782c;
            if (d9 <= f9) {
                f9 = y0.c.d(j8);
            }
        }
        float e9 = y0.c.e(j8);
        float f10 = dVar2.f9781b;
        if (e9 >= f10) {
            float e10 = y0.c.e(j8);
            f10 = dVar2.f9783d;
            if (e10 <= f10) {
                f10 = y0.c.e(j8);
            }
        }
        return u3.r.a(f9, f10);
    }

    public final int b(long j8, boolean z8) {
        if (z8) {
            j8 = a(j8);
        }
        return this.f9471a.f389b.e(d(j8));
    }

    public final boolean c(long j8) {
        long d8 = d(a(j8));
        float e9 = y0.c.e(d8);
        a2.h0 h0Var = this.f9471a;
        int c4 = h0Var.f389b.c(e9);
        return y0.c.d(d8) >= h0Var.f(c4) && y0.c.d(d8) <= h0Var.g(c4);
    }

    public final long d(long j8) {
        p1.p pVar;
        p1.p pVar2 = this.f9472b;
        if (pVar2 == null) {
            return j8;
        }
        if (!pVar2.O()) {
            pVar2 = null;
        }
        if (pVar2 == null || (pVar = this.f9473c) == null) {
            return j8;
        }
        p1.p pVar3 = pVar.O() ? pVar : null;
        return pVar3 == null ? j8 : pVar2.u(pVar3, j8);
    }

    public final long e(long j8) {
        p1.p pVar;
        p1.p pVar2 = this.f9472b;
        if (pVar2 == null) {
            return j8;
        }
        if (!pVar2.O()) {
            pVar2 = null;
        }
        if (pVar2 == null || (pVar = this.f9473c) == null) {
            return j8;
        }
        p1.p pVar3 = pVar.O() ? pVar : null;
        return pVar3 == null ? j8 : pVar3.u(pVar2, j8);
    }
}
