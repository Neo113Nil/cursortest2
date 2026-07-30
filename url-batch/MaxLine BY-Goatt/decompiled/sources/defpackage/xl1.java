package defpackage;

import java.util.HashSet;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class xl1 {
    public final t7 a;
    public final eo1 b = new eo1(new fn[16]);
    public final eo1 c = new eo1(new u52[16]);
    public final eo1 d = new eo1(new i91[16]);
    public final eo1 e = new eo1(new u52[16]);
    public boolean f;

    public xl1(t7 t7Var) {
        this.a = t7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [ul1] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(ul1 ul1Var, u52 u52Var, HashSet hashSet) {
        if (!ul1Var.m.z) {
            h21.b("visitSubtreeIf called on an unattached node");
        }
        eo1 eo1Var = new eo1(new ul1[16]);
        ul1 ul1Var2 = ul1Var.m;
        ul1 ul1Var3 = ul1Var2.r;
        if (ul1Var3 == null) {
            s03.b(eo1Var, ul1Var2);
        } else {
            eo1Var.b(ul1Var3);
        }
        while (true) {
            int i = eo1Var.o;
            if (i == 0) {
                return;
            }
            ul1 ul1Var4 = (ul1) eo1Var.l(i - 1);
            if ((ul1Var4.p & 32) != 0) {
                for (ul1 ul1Var5 = ul1Var4; ul1Var5 != null; ul1Var5 = ul1Var5.r) {
                    if ((ul1Var5.o & 32) != 0) {
                        p90 p90Var = ul1Var5;
                        ?? r5 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof yl1) {
                                yl1 yl1Var = (yl1) p90Var;
                                if (yl1Var instanceof fn) {
                                    fn fnVar = (fn) yl1Var;
                                    if ((fnVar.A instanceof wl1) && fnVar.C.contains(u52Var)) {
                                        hashSet.add(yl1Var);
                                    }
                                }
                                if (yl1Var.m().r(u52Var)) {
                                    break;
                                }
                            } else if ((p90Var.o & 32) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var6 = p90Var.B;
                                int i2 = 0;
                                p90Var = p90Var;
                                r5 = r5;
                                while (ul1Var6 != null) {
                                    if ((ul1Var6.o & 32) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            p90Var = ul1Var6;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r5.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r5.b(ul1Var6);
                                        }
                                    }
                                    ul1Var6 = ul1Var6.r;
                                    p90Var = p90Var;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            p90Var = s03.c(r5);
                        }
                    }
                }
            }
            s03.b(eo1Var, ul1Var4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        u uVar = new u(18, this);
        jn1 jn1Var = this.a.G0;
        if (jn1Var.f(uVar) >= 0) {
            return;
        }
        jn1Var.a(uVar);
    }
}
