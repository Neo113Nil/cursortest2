package defpackage;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface yl1 extends am1, o90 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [o90, yl1] */
    @Override // defpackage.am1
    default Object i(u52 u52Var) {
        fs1 fs1Var;
        ul1 ul1Var = (ul1) this;
        if (!ul1Var.m.z) {
            h21.a("ModifierLocal accessed from an unattached node");
        }
        if (!ul1Var.m.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var2 = ul1Var.m.q;
        i91 J = s03.J(this);
        while (J != null) {
            if ((J.P.f.p & 32) != 0) {
                while (ul1Var2 != null) {
                    if ((ul1Var2.o & 32) != 0) {
                        p90 p90Var = ul1Var2;
                        ?? r3 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof yl1) {
                                yl1 yl1Var = (yl1) p90Var;
                                if (yl1Var.m().r(u52Var)) {
                                    return yl1Var.m().v(u52Var);
                                }
                            } else if ((p90Var.o & 32) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var3 = p90Var.B;
                                int i = 0;
                                p90Var = p90Var;
                                r3 = r3;
                                while (ul1Var3 != null) {
                                    if ((ul1Var3.o & 32) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            p90Var = ul1Var3;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r3.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r3.b(ul1Var3);
                                        }
                                    }
                                    ul1Var3 = ul1Var3.r;
                                    p90Var = p90Var;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            p90Var = s03.c(r3);
                        }
                    }
                    ul1Var2 = ul1Var2.q;
                }
            }
            J = J.u();
            ul1Var2 = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
        return u52Var.a.invoke();
    }

    default yj1 m() {
        return ch0.q;
    }
}
