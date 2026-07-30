package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u91 implements eq2 {
    public final an1 a;
    public final /* synthetic */ v91 b;
    public final /* synthetic */ Object c;

    public u91(v91 v91Var, Object obj) {
        this.b = v91Var;
        this.c = obj;
        int[] iArr = w31.a;
        this.a = new an1();
    }

    @Override // defpackage.eq2
    public final void a() {
        v91 v91Var = this.b;
        i91 i91Var = v91Var.m;
        v91Var.d();
        i91 i91Var2 = (i91) v91Var.v.k(this.c);
        if (i91Var2 != null) {
            if (v91Var.A <= 0) {
                h21.b("No pre-composed items to dispose");
            }
            int j = ((bo1) i91Var.o()).m.j(i91Var2);
            if (j < ((bo1) i91Var.o()).m.o - v91Var.A) {
                h21.b("Item is not in pre-composed item range");
            }
            v91Var.z++;
            v91Var.A--;
            int i = (((bo1) i91Var.o()).m.o - v91Var.A) - v91Var.z;
            v91Var.f(j, i);
            v91Var.c(i);
        }
    }

    @Override // defpackage.eq2
    public final int b() {
        i91 i91Var = (i91) this.b.v.g(this.c);
        if (i91Var != null) {
            return ((bo1) i91Var.n()).m.o;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [m7] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    @Override // defpackage.eq2
    public final void c(m7 m7Var) {
        fs1 fs1Var;
        ul1 ul1Var;
        qz2 qz2Var;
        i91 i91Var = (i91) this.b.v.g(this.c);
        if (i91Var == null || (fs1Var = i91Var.P) == null || (ul1Var = fs1Var.f) == null) {
            return;
        }
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
            if ((ul1Var4.p & 262144) != 0) {
                for (ul1 ul1Var5 = ul1Var4; ul1Var5 != null; ul1Var5 = ul1Var5.r) {
                    if ((ul1Var5.o & 262144) != 0) {
                        p90 p90Var = ul1Var5;
                        ?? r6 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof rz2) {
                                rz2 rz2Var = (rz2) p90Var;
                                if ("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(rz2Var.r())) {
                                    m7Var.invoke(rz2Var);
                                    qz2Var = qz2.n;
                                } else {
                                    qz2Var = qz2.m;
                                }
                                if (qz2Var == qz2.o) {
                                    return;
                                }
                                if (qz2Var == qz2.n) {
                                    break;
                                }
                            } else if ((p90Var.o & 262144) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var6 = p90Var.B;
                                int i2 = 0;
                                p90Var = p90Var;
                                r6 = r6;
                                while (ul1Var6 != null) {
                                    if ((ul1Var6.o & 262144) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            p90Var = ul1Var6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r6.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r6.b(ul1Var6);
                                        }
                                    }
                                    ul1Var6 = ul1Var6.r;
                                    p90Var = p90Var;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            p90Var = s03.c(r6);
                        }
                    }
                }
            }
            s03.b(eo1Var, ul1Var4);
        }
    }

    @Override // defpackage.eq2
    public final void d(long j, int i) {
        v91 v91Var = this.b;
        i91 i91Var = (i91) v91Var.v.g(this.c);
        if (i91Var == null || !i91Var.I()) {
            return;
        }
        int i2 = ((bo1) i91Var.n()).m.o;
        if (i < 0 || i >= i2) {
            h21.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (i91Var.J()) {
            h21.a("Pre-measure called on node that is not placed");
        }
        i91 i91Var2 = v91Var.m;
        i91Var2.A = true;
        ((t7) l91.a(i91Var)).w((i91) ((bo1) i91Var.n()).get(i), j);
        Unit unit = Unit.a;
        i91Var2.A = false;
        this.a.a(i);
    }
}
