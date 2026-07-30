package defpackage;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class wi {
    public static final yi a = new yi(yr1.c, j50.s);

    public static final yi a(j9 j9Var, id idVar, hl hlVar, int i) {
        if (j9Var.equals(yr1.c) && idVar.equals(j50.s)) {
            hlVar.W(-1446604504);
            hlVar.p(false);
            return a;
        }
        hlVar.W(-1446550657);
        boolean z = true;
        boolean z2 = (((i & 14) ^ 6) > 4 && hlVar.f(j9Var)) || (i & 6) == 4;
        if ((((i & 112) ^ 48) <= 32 || !hlVar.f(idVar)) && (i & 48) != 32) {
            z = false;
        }
        boolean z3 = z2 | z;
        Object L = hlVar.L();
        if (z3 || L == bl.a) {
            L = new yi(j9Var, idVar);
            hlVar.h0(L);
        }
        yi yiVar = (yi) L;
        hlVar.p(false);
        return yiVar;
    }
}
