package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class tu0 {
    public String a;
    public th1 b;
    public v10 c;
    public int d;
    public boolean e;
    public int f;
    public int g;
    public nr i;
    public x5 j;
    public boolean k;
    public vl0 m;
    public su0 n;
    public vc0 o;
    public long q;
    public long h = s80.a;
    public long l = 0;
    public long p = nm.g(0, 0, 0, 0);

    public tu0(String str, th1 th1Var, v10 v10Var, int i, boolean z, int i2, int i3) {
        this.a = str;
        this.b = th1Var;
        this.c = v10Var;
        this.d = i;
        this.e = z;
        this.f = i2;
        this.g = i3;
    }

    public final boolean a(long j, vc0 vc0Var) {
        long j2;
        su0 su0Var;
        int i;
        this.q = (this.q << 2) | 3;
        boolean z = false;
        boolean z2 = true;
        if (this.g > 1) {
            th1 th1Var = this.b;
            vl0 vl0Var = this.m;
            nr nrVar = this.i;
            nrVar.getClass();
            v10 v10Var = this.c;
            if ((vl0Var == null || vc0Var != vl0Var.a || !gb0.K(th1Var, vc0Var).equals(vl0Var.b) || nrVar.k() != vl0Var.c.d || v10Var != vl0Var.d) && ((vl0Var = vl0.h) == null || vc0Var != vl0Var.a || !gb0.K(th1Var, vc0Var).equals(vl0Var.b) || nrVar.k() != vl0Var.c.d || v10Var != vl0Var.d)) {
                vl0Var = new vl0(vc0Var, gb0.K(th1Var, vc0Var), new or(nrVar.k(), nrVar.f()), v10Var);
                vl0.h = vl0Var;
            }
            this.m = vl0Var;
            int i2 = this.g;
            or orVar = vl0Var.c;
            float f = vl0Var.g;
            float f2 = vl0Var.f;
            if (Float.isNaN(f) || Float.isNaN(f2)) {
                float b = t90.b(wl0.a, vl0Var.e, nm.b(0, 0, 15), orVar, vl0Var.d, 1).b();
                f2 = t90.b(wl0.b, vl0Var.e, nm.b(0, 0, 15), orVar, vl0Var.d, 2).b() - b;
                vl0Var.g = b;
                vl0Var.f = f2;
                f = b;
            }
            if (i2 != 1) {
                i = Math.round((f2 * (i2 - 1)) + f);
                if (i < 0) {
                    i = 0;
                }
                int g = mm.g(j);
                if (i > g) {
                    i = g;
                }
            } else {
                i = mm.i(j);
            }
            j2 = nm.a(mm.j(j), mm.h(j), i, mm.g(j));
        } else {
            j2 = j;
        }
        x5 x5Var = this.j;
        if (x5Var != null && (su0Var = this.n) != null && !su0Var.c() && vc0Var == this.o && (mm.b(j2, this.p) || (mm.h(j2) == mm.h(this.p) && mm.j(j2) == mm.j(this.p) && mm.g(j2) >= x5Var.b() && !x5Var.d.d))) {
            if (!mm.b(j2, this.p)) {
                x5 x5Var2 = this.j;
                x5Var2.getClass();
                this.l = nm.d(j2, (t90.f(Math.min(x5Var2.a.m.c(), x5Var2.c())) << 32) | (t90.f(x5Var2.b()) & 4294967295L));
                if (this.d == 3 || (((int) (r12 >> 32)) >= x5Var2.c() && ((int) (r12 & 4294967295L)) >= x5Var2.b())) {
                    z2 = false;
                }
                this.k = z2;
                this.p = j2;
            }
            return false;
        }
        su0 su0Var2 = this.n;
        if (su0Var2 == null || vc0Var != this.o || su0Var2.c()) {
            this.o = vc0Var;
            String str = this.a;
            th1 K = gb0.K(this.b, vc0Var);
            nv nvVar = nv.d;
            nr nrVar2 = this.i;
            nrVar2.getClass();
            su0Var2 = new b6(str, K, nvVar, nvVar, this.c, nrVar2);
        }
        this.n = su0Var2;
        boolean z3 = this.e;
        int i3 = this.d;
        float d = su0Var2.d();
        int h = ((z3 || i3 == 2 || i3 == 4 || i3 == 5) && mm.d(j2)) ? mm.h(j2) : Integer.MAX_VALUE;
        if (mm.j(j2) != h) {
            h = b11.c(t90.f(d), mm.j(j2), h);
        }
        long E = la0.E(0, h, 0, mm.g(j2));
        boolean z4 = this.e;
        int i4 = this.d;
        int i5 = this.f;
        x5 x5Var3 = new x5((b6) su0Var2, ((z4 || !(i4 == 2 || i4 == 4 || i4 == 5)) && i5 >= 1) ? i5 : 1, i4, E);
        this.p = j2;
        this.l = nm.d(j2, (t90.f(x5Var3.c()) << 32) | (t90.f(x5Var3.b()) & 4294967295L));
        if (this.d != 3 && (((int) (r6 >> 32)) < x5Var3.c() || ((int) (r6 & 4294967295L)) < x5Var3.b())) {
            z = true;
        }
        this.k = z;
        this.j = x5Var3;
        return true;
    }

    public final void b() {
        this.j = null;
        this.n = null;
        this.o = null;
        this.p = nm.g(0, 0, 0, 0);
        this.l = 0L;
        this.k = false;
    }

    public final void c(nr nrVar) {
        long j;
        nr nrVar2 = this.i;
        if (nrVar != null) {
            int i = s80.b;
            j = s80.a(nrVar.k(), nrVar.f());
        } else {
            j = s80.a;
        }
        if (nrVar2 == null) {
            this.i = nrVar;
            this.h = j;
        } else if (nrVar == null || this.h != j) {
            this.i = nrVar;
            this.h = j;
            this.q = (this.q << 2) | 1;
            b();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ParagraphLayoutCache(paragraph=");
        sb.append(this.j != null ? "<paragraph>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) s80.b(this.h));
        sb.append(", history=");
        sb.append(this.q);
        sb.append(", constraints=$)");
        return sb.toString();
    }
}
