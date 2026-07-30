package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class q41 {
    public static final r41 a = new r41(yr1.b, j50.p);

    public static final r41 a(g9 g9Var, jd jdVar, hl hlVar, int i) {
        if (g9Var.equals(yr1.b) && jdVar.equals(j50.p)) {
            hlVar.W(-1073830487);
            hlVar.p(false);
            return a;
        }
        hlVar.W(-1073779616);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && hlVar.f(g9Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !hlVar.f(jdVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object L = hlVar.L();
        if (z3 || L == bl.a) {
            L = new r41(g9Var, jdVar);
            hlVar.h0(L);
        }
        r41 r41Var = (r41) L;
        hlVar.p(false);
        return r41Var;
    }
}
