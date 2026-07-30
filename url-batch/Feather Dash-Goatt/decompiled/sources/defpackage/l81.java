package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l81 {
    public final zl0 a;
    public final boolean b;
    public final jd0 c;
    public final h81 d;
    public boolean e;
    public l81 f;
    public final int g;

    public l81(zl0 zl0Var, boolean z, jd0 jd0Var, h81 h81Var) {
        this.a = zl0Var;
        this.b = z;
        this.c = jd0Var;
        this.d = h81Var;
        this.g = jd0Var.e;
    }

    public static /* synthetic */ List j(int i, l81 l81Var) {
        return l81Var.i((i & 1) != 0 ? !l81Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [zl0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final s11 a(qp0 qp0Var) {
        zq zqVar;
        l81 l = l();
        if (l == null) {
            return s11.e;
        }
        zl0 zl0Var = (zl0) l.c.J.g;
        if ((zl0Var.h & 8) != 0) {
            loop0: while (zl0Var != null) {
                if ((zl0Var.g & 8) != 0) {
                    zqVar = zl0Var;
                    ?? r5 = 0;
                    while (zqVar != 0) {
                        if (zqVar instanceof j81) {
                            if (zqVar.b()) {
                                break loop0;
                            }
                        } else if ((zqVar.g & 8) != 0 && (zqVar instanceof zq)) {
                            zl0 zl0Var2 = zqVar.t;
                            int i = 0;
                            zqVar = zqVar;
                            r5 = r5;
                            while (zl0Var2 != null) {
                                if ((zl0Var2.g & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        zqVar = zl0Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new eo0(new zl0[16]);
                                        }
                                        if (zqVar != 0) {
                                            r5.b(zqVar);
                                            zqVar = 0;
                                        }
                                        r5.b(zl0Var2);
                                    }
                                }
                                zl0Var2 = zl0Var2.j;
                                zqVar = zqVar;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        zqVar = op.o(r5);
                    }
                }
                if ((zl0Var.h & 8) == 0) {
                    break;
                }
                zl0Var = zl0Var.j;
            }
        }
        zqVar = 0;
        j81 j81Var = (j81) zqVar;
        qp0 G = j81Var != null ? op.G(j81Var, 8) : null;
        return G == null ? l.a(qp0Var) : G.J(qp0Var, true);
    }

    public final l81 b(e41 e41Var, Function1 function1) {
        h81 h81Var = new h81();
        h81Var.g = false;
        h81Var.h = false;
        function1.invoke(h81Var);
        l81 l81Var = new l81(new k81(function1), false, new jd0(this.g + (e41Var != null ? 1000000000 : 2000000000), true), h81Var);
        l81Var.e = true;
        l81Var.f = this;
        return l81Var;
    }

    public final void c(jd0 jd0Var, ArrayList arrayList) {
        eo0 w = jd0Var.w();
        Object[] objArr = w.d;
        int i = w.g;
        for (int i2 = 0; i2 < i; i2++) {
            jd0 jd0Var2 = (jd0) objArr[i2];
            if (jd0Var2.F() && !jd0Var2.U) {
                if (jd0Var2.J.g(8)) {
                    arrayList.add(xa0.d(jd0Var2, this.b));
                } else {
                    c(jd0Var2, arrayList);
                }
            }
        }
    }

    public final qp0 d() {
        if (!this.e) {
            j81 f = f();
            return f != null ? op.G(f, 8) : (v80) this.c.J.d;
        }
        l81 l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            l81 l81Var = (l81) arrayList.get(size2);
            if (l81Var.m()) {
                arrayList2.add(l81Var);
            } else if (!l81Var.d.h) {
                l81Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v14, types: [j81] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public final j81 f() {
        zl0 zl0Var;
        boolean z = this.d.g;
        Object obj = null;
        jd0 jd0Var = this.c;
        if (!z) {
            zl0 zl0Var2 = (zl0) jd0Var.J.g;
            if ((zl0Var2.h & 8) != 0) {
                loop3: while (zl0Var2 != null) {
                    if ((zl0Var2.g & 8) != 0) {
                        zl0Var = zl0Var2;
                        eo0 eo0Var = null;
                        while (zl0Var != null) {
                            if (zl0Var instanceof j81) {
                                if (((j81) zl0Var).b()) {
                                    obj = zl0Var;
                                }
                            } else if ((zl0Var.g & 8) != 0 && (zl0Var instanceof zq)) {
                                int i = 0;
                                for (zl0 zl0Var3 = ((zq) zl0Var).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                    if ((zl0Var3.g & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            zl0Var = zl0Var3;
                                        } else {
                                            if (eo0Var == null) {
                                                eo0Var = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var != null) {
                                                eo0Var.b(zl0Var);
                                                zl0Var = null;
                                            }
                                            eo0Var.b(zl0Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            zl0Var = op.o(eo0Var);
                        }
                    }
                    if ((zl0Var2.h & 8) == 0) {
                        break;
                    }
                    zl0Var2 = zl0Var2.j;
                }
            }
            return (j81) obj;
        }
        zl0 zl0Var4 = (zl0) jd0Var.J.g;
        if ((zl0Var4.h & 8) != 0) {
            zl0Var = null;
            while (zl0Var4 != null) {
                if ((zl0Var4.g & 8) != 0) {
                    zq zqVar = zl0Var4;
                    ?? r6 = 0;
                    while (zqVar != 0) {
                        if (zqVar instanceof j81) {
                            ?? r5 = (j81) zqVar;
                            if (r5.b()) {
                                if (r5.Z()) {
                                    return r5;
                                }
                                if (zl0Var == null) {
                                    zl0Var = r5;
                                }
                            }
                        } else if ((zqVar.g & 8) != 0 && (zqVar instanceof zq)) {
                            zl0 zl0Var5 = zqVar.t;
                            int i2 = 0;
                            zqVar = zqVar;
                            r6 = r6;
                            while (zl0Var5 != null) {
                                if ((zl0Var5.g & 8) != 0) {
                                    i2++;
                                    r6 = r6;
                                    if (i2 == 1) {
                                        zqVar = zl0Var5;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new eo0(new zl0[16]);
                                        }
                                        if (zqVar != 0) {
                                            r6.b(zqVar);
                                            zqVar = 0;
                                        }
                                        r6.b(zl0Var5);
                                    }
                                }
                                zl0Var5 = zl0Var5.j;
                                zqVar = zqVar;
                                r6 = r6;
                            }
                            if (i2 == 1) {
                            }
                        }
                        zqVar = op.o(r6);
                    }
                }
                if ((zl0Var4.h & 8) == 0) {
                    break;
                }
                zl0Var4 = zl0Var4.j;
            }
            obj = zl0Var;
        }
        return (j81) obj;
    }

    public final s11 g() {
        qp0 d = d();
        if (d != null) {
            if (!d.J0().r) {
                d = null;
            }
            if (d != null) {
                return t80.n(d).J(d, true);
            }
        }
        return s11.e;
    }

    public final s11 h() {
        qp0 d = d();
        if (d != null) {
            if (!d.J0().r) {
                d = null;
            }
            if (d != null) {
                return t80.g(d, true);
            }
        }
        return s11.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.h) {
            return nv.d;
        }
        ArrayList arrayList = new ArrayList();
        if (!m()) {
            return p(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final h81 k() {
        boolean m = m();
        h81 h81Var = this.d;
        if (!m) {
            return h81Var;
        }
        h81 b = h81Var.b();
        o(new ArrayList(), b);
        return b;
    }

    public final l81 l() {
        jd0 jd0Var;
        l81 l81Var = this.f;
        if (l81Var != null) {
            return l81Var;
        }
        jd0 jd0Var2 = this.c;
        boolean z = this.b;
        if (z) {
            jd0Var = jd0Var2.s();
            while (jd0Var != null) {
                h81 v = jd0Var.v();
                if (v != null && v.g) {
                    break;
                }
                jd0Var = jd0Var.s();
            }
        }
        jd0Var = null;
        if (jd0Var == null) {
            jd0 s = jd0Var2.s();
            while (true) {
                if (s == null) {
                    jd0Var = null;
                    break;
                }
                if (s.J.g(8)) {
                    jd0Var = s;
                    break;
                }
                s = s.s();
            }
        }
        if (jd0Var == null) {
            return null;
        }
        return xa0.d(jd0Var, z);
    }

    public final boolean m() {
        return this.b && this.d.g;
    }

    public final boolean n() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        jd0 s = this.c.s();
        while (true) {
            if (s == null) {
                s = null;
                break;
            }
            h81 v = s.v();
            if (v != null && v.g) {
                break;
            }
            s = s.s();
        }
        return s == null;
    }

    public final void o(ArrayList arrayList, h81 h81Var) {
        if (this.d.h) {
            return;
        }
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            l81 l81Var = (l81) arrayList.get(size2);
            if (!l81Var.m()) {
                h81Var.e(l81Var.d);
                l81Var.o(arrayList, h81Var);
            }
        }
    }

    public final List p(ArrayList arrayList, boolean z) {
        if (this.e) {
            return nv.d;
        }
        c(this.c, arrayList);
        if (z) {
            h81 h81Var = this.d;
            vn0 vn0Var = h81Var.d;
            Object g = vn0Var.g(p81.w);
            if (g == null) {
                g = null;
            }
            e41 e41Var = (e41) g;
            if (e41Var != null && h81Var.g && !arrayList.isEmpty()) {
                arrayList.add(b(e41Var, new h41(e41Var)));
            }
            t81 t81Var = p81.a;
            if (vn0Var.c(t81Var) && !arrayList.isEmpty() && h81Var.g) {
                Object g2 = vn0Var.g(t81Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) CollectionsKt.firstOrNull(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new a3(21, str)));
                }
            }
        }
        return arrayList;
    }
}
