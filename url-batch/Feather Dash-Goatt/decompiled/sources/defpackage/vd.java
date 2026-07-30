package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class vd {
    public static final vn0 a = c(true);
    public static final vn0 b = c(false);
    public static final ud c = ud.b;

    public static final void a(am0 am0Var, hl hlVar, int i) {
        int i2;
        hlVar.Y(-211209833);
        if ((i & 6) == 0) {
            i2 = (hlVar.f(am0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (hlVar.O(i2 & 1, (i2 & 3) != 2)) {
            int hashCode = Long.hashCode(hlVar.T);
            am0 N = p4.N(hlVar, am0Var);
            kw0 l = hlVar.l();
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, c, xk.e);
            ka0.C(hlVar, l, xk.d);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r = hlVar.r();
        if (r != null) {
            r.d = new td(am0Var, i);
        }
    }

    public static final void b(yw0 yw0Var, zw0 zw0Var, qk0 qk0Var, vc0 vc0Var, int i, int i2, kd kdVar) {
        kd kdVar2;
        Object h = qk0Var.h();
        sd sdVar = h instanceof sd ? (sd) h : null;
        yw0.l(yw0Var, zw0Var, ((sdVar == null || (kdVar2 = sdVar.s) == null) ? kdVar : kdVar2).a((zw0Var.d << 32) | (zw0Var.e & 4294967295L), (i << 32) | (i2 & 4294967295L), vc0Var));
    }

    public static final vn0 c(boolean z) {
        vn0 vn0Var = new vn0(9);
        kd kdVar = j50.g;
        vn0Var.m(kdVar, new yd(kdVar, z));
        kd kdVar2 = j50.h;
        vn0Var.m(kdVar2, new yd(kdVar2, z));
        kd kdVar3 = j50.i;
        vn0Var.m(kdVar3, new yd(kdVar3, z));
        kd kdVar4 = j50.j;
        vn0Var.m(kdVar4, new yd(kdVar4, z));
        kd kdVar5 = j50.k;
        vn0Var.m(kdVar5, new yd(kdVar5, z));
        kd kdVar6 = j50.l;
        vn0Var.m(kdVar6, new yd(kdVar6, z));
        kd kdVar7 = j50.m;
        vn0Var.m(kdVar7, new yd(kdVar7, z));
        kd kdVar8 = j50.n;
        vn0Var.m(kdVar8, new yd(kdVar8, z));
        kd kdVar9 = j50.o;
        vn0Var.m(kdVar9, new yd(kdVar9, z));
        return vn0Var;
    }

    public static final vk0 d(kd kdVar, boolean z) {
        vk0 vk0Var = (vk0) (z ? a : b).g(kdVar);
        return vk0Var == null ? new yd(kdVar, z) : vk0Var;
    }
}
