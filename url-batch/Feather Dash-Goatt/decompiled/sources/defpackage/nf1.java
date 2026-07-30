package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class nf1 {
    public static final zl a = new zl(new dd(21));

    public static final void a(m41 m41Var, long j, hk hkVar, hl hlVar, int i) {
        u91 u91Var = (i & 2) != 0 ? m90.m : m41Var;
        ke1 ke1Var = oi.a;
        hlVar.W(89374938);
        mi miVar = (mi) hlVar.j(oi.a);
        long j2 = miVar.a;
        long j3 = miVar.U;
        long j4 = miVar.Q;
        long j5 = miVar.M;
        long j6 = miVar.q;
        if (hi.c(j, j2)) {
            j3 = miVar.b;
        } else if (hi.c(j, miVar.f)) {
            j3 = miVar.g;
        } else if (hi.c(j, miVar.j)) {
            j3 = miVar.k;
        } else if (hi.c(j, miVar.n)) {
            j3 = miVar.o;
        } else if (hi.c(j, miVar.w)) {
            j3 = miVar.x;
        } else if (hi.c(j, miVar.c)) {
            j3 = miVar.d;
        } else if (hi.c(j, miVar.h)) {
            j3 = miVar.i;
        } else if (hi.c(j, miVar.l)) {
            j3 = miVar.m;
        } else if (hi.c(j, miVar.y)) {
            j3 = miVar.z;
        } else if (hi.c(j, miVar.u)) {
            j3 = miVar.v;
        } else {
            if (!hi.c(j, miVar.p)) {
                if (hi.c(j, miVar.r)) {
                    j3 = miVar.s;
                } else if (!hi.c(j, miVar.D) && !hi.c(j, miVar.F) && !hi.c(j, miVar.G) && !hi.c(j, miVar.H) && !hi.c(j, miVar.I) && !hi.c(j, miVar.J) && !hi.c(j, miVar.E)) {
                    if (hi.c(j, miVar.K) || hi.c(j, miVar.L)) {
                        j3 = j5;
                    } else if (hi.c(j, miVar.O) || hi.c(j, miVar.P)) {
                        j3 = j4;
                    } else if (!hi.c(j, miVar.S) && !hi.c(j, miVar.T)) {
                        j3 = hi.g;
                    }
                }
            }
            j3 = j6;
        }
        if (j3 == 16) {
            j3 = ((hi) hlVar.j(rm.a)).a;
        }
        hlVar.p(false);
        zl zlVar = a;
        float f = ((bt) hlVar.j(zlVar)).d + 0.0f;
        op.b(new n01[]{rm.a.a(new hi(j3)), zlVar.a(new bt(f))}, m90.J(421772006, new mf1(u91Var, j, f, 0.0f, hkVar), hlVar), hlVar, 56);
    }
}
