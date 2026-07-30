package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aw1 extends pw1 {
    public static final aw1 c = new aw1(0, 3, 1);

    @Override // defpackage.pw1
    public final void a(gn gnVar, rh rhVar, zl2 zl2Var, q82 q82Var, qw1 qw1Var) {
        tt1 tt1Var;
        wl2 wl2Var = (wl2) gnVar.g(1);
        m6 m6Var = (m6) gnVar.g(0);
        nm0 nm0Var = (nm0) gnVar.g(2);
        zl2 d = wl2Var.d();
        if (qw1Var != null) {
            try {
                tt1Var = new tt1(2, qw1Var, zl2Var);
            } catch (Throwable th) {
                d.e(false);
                throw th;
            }
        } else {
            tt1Var = null;
        }
        if (!nm0Var.t.W()) {
            b00.c("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        nm0Var.s.V(rhVar, d, q82Var, tt1Var);
        Unit unit = Unit.a;
        d.e(true);
        zl2Var.d();
        m6Var.getClass();
        zl2Var.z(wl2Var, wl2Var.a(m6Var));
        zl2Var.k();
    }
}
