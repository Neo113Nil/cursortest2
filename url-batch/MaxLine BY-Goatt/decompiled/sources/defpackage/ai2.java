package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ai2 {
    public final ul1 a;
    public final boolean b;
    public final i91 c;
    public final sh2 d;
    public boolean e;
    public ai2 f;
    public final int g;

    public ai2(ul1 ul1Var, boolean z, i91 i91Var, sh2 sh2Var) {
        this.a = ul1Var;
        this.b = z;
        this.c = i91Var;
        this.d = sh2Var;
        this.g = i91Var.n;
    }

    public static /* synthetic */ List j(int i, ai2 ai2Var) {
        return ai2Var.i((i & 1) != 0 ? !ai2Var.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [ul1] */
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
    /* JADX WARN: Type inference failed for: r5v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final w72 a(ks1 ks1Var) {
        p90 p90Var;
        ai2 l = l();
        if (l == null) {
            return w72.e;
        }
        ul1 ul1Var = l.c.P.f;
        if ((ul1Var.p & 8) != 0) {
            loop0: while (ul1Var != null) {
                if ((ul1Var.o & 8) != 0) {
                    p90Var = ul1Var;
                    ?? r5 = 0;
                    while (p90Var != 0) {
                        if (p90Var instanceof xh2) {
                            if (p90Var.l()) {
                                break loop0;
                            }
                        } else if ((p90Var.o & 8) != 0 && (p90Var instanceof p90)) {
                            ul1 ul1Var2 = p90Var.B;
                            int i = 0;
                            p90Var = p90Var;
                            r5 = r5;
                            while (ul1Var2 != null) {
                                if ((ul1Var2.o & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        p90Var = ul1Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new eo1(new ul1[16]);
                                        }
                                        if (p90Var != 0) {
                                            r5.b(p90Var);
                                            p90Var = 0;
                                        }
                                        r5.b(ul1Var2);
                                    }
                                }
                                ul1Var2 = ul1Var2.r;
                                p90Var = p90Var;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        p90Var = s03.c(r5);
                    }
                }
                if ((ul1Var.p & 8) == 0) {
                    break;
                }
                ul1Var = ul1Var.r;
            }
        }
        p90Var = 0;
        xh2 xh2Var = (xh2) p90Var;
        ks1 H = xh2Var != null ? s03.H(xh2Var, 8) : null;
        return H == null ? l.a(ks1Var) : H.M(ks1Var, true);
    }

    public final ai2 b(fb2 fb2Var, Function1 function1) {
        sh2 sh2Var = new sh2();
        sh2Var.o = false;
        sh2Var.p = false;
        function1.invoke(sh2Var);
        ai2 ai2Var = new ai2(new zh2(function1), false, new i91(this.g + (fb2Var != null ? 1000000000 : 2000000000), true), sh2Var);
        ai2Var.e = true;
        ai2Var.f = this;
        return ai2Var;
    }

    public final void c(i91 i91Var, ArrayList arrayList) {
        eo1 x = i91Var.x();
        Object[] objArr = x.m;
        int i = x.o;
        for (int i2 = 0; i2 < i; i2++) {
            i91 i91Var2 = (i91) objArr[i2];
            if (i91Var2.I() && !i91Var2.Y) {
                if (i91Var2.P.d(8)) {
                    arrayList.add(ci2.a(i91Var2, this.b));
                } else {
                    c(i91Var2, arrayList);
                }
            }
        }
    }

    public final ks1 d() {
        if (!this.e) {
            xh2 f = f();
            return f != null ? s03.H(f, 8) : this.c.P.c;
        }
        ai2 l = l();
        if (l != null) {
            return l.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ai2 ai2Var = (ai2) arrayList.get(size2);
            if (ai2Var.n()) {
                arrayList2.add(ai2Var);
            } else if (!ai2Var.d.p) {
                ai2Var.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [ul1] */
    /* JADX WARN: Type inference failed for: r5v14, types: [xh2] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [ul1] */
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
    /* JADX WARN: Type inference failed for: r6v15, types: [eo1] */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18, types: [eo1] */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    public final xh2 f() {
        ul1 ul1Var;
        boolean z = this.d.o;
        Object obj = null;
        i91 i91Var = this.c;
        if (!z) {
            ul1 ul1Var2 = i91Var.P.f;
            if ((ul1Var2.p & 8) != 0) {
                loop3: while (ul1Var2 != null) {
                    if ((ul1Var2.o & 8) != 0) {
                        ul1Var = ul1Var2;
                        eo1 eo1Var = null;
                        while (ul1Var != null) {
                            if (ul1Var instanceof xh2) {
                                if (((xh2) ul1Var).l()) {
                                    obj = ul1Var;
                                }
                            } else if ((ul1Var.o & 8) != 0 && (ul1Var instanceof p90)) {
                                int i = 0;
                                for (ul1 ul1Var3 = ((p90) ul1Var).B; ul1Var3 != null; ul1Var3 = ul1Var3.r) {
                                    if ((ul1Var3.o & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            ul1Var = ul1Var3;
                                        } else {
                                            if (eo1Var == null) {
                                                eo1Var = new eo1(new ul1[16]);
                                            }
                                            if (ul1Var != null) {
                                                eo1Var.b(ul1Var);
                                                ul1Var = null;
                                            }
                                            eo1Var.b(ul1Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            ul1Var = s03.c(eo1Var);
                        }
                    }
                    if ((ul1Var2.p & 8) == 0) {
                        break;
                    }
                    ul1Var2 = ul1Var2.r;
                }
            }
            return (xh2) obj;
        }
        ul1 ul1Var4 = i91Var.P.f;
        if ((ul1Var4.p & 8) != 0) {
            ul1Var = null;
            while (ul1Var4 != null) {
                if ((ul1Var4.o & 8) != 0) {
                    p90 p90Var = ul1Var4;
                    ?? r6 = 0;
                    while (p90Var != 0) {
                        if (p90Var instanceof xh2) {
                            ?? r5 = (xh2) p90Var;
                            if (r5.l()) {
                                if (r5.k0()) {
                                    return r5;
                                }
                                if (ul1Var == null) {
                                    ul1Var = r5;
                                }
                            }
                        } else if ((p90Var.o & 8) != 0 && (p90Var instanceof p90)) {
                            ul1 ul1Var5 = p90Var.B;
                            int i2 = 0;
                            p90Var = p90Var;
                            r6 = r6;
                            while (ul1Var5 != null) {
                                if ((ul1Var5.o & 8) != 0) {
                                    i2++;
                                    r6 = r6;
                                    if (i2 == 1) {
                                        p90Var = ul1Var5;
                                    } else {
                                        if (r6 == 0) {
                                            r6 = new eo1(new ul1[16]);
                                        }
                                        if (p90Var != 0) {
                                            r6.b(p90Var);
                                            p90Var = 0;
                                        }
                                        r6.b(ul1Var5);
                                    }
                                }
                                ul1Var5 = ul1Var5.r;
                                p90Var = p90Var;
                                r6 = r6;
                            }
                            if (i2 == 1) {
                            }
                        }
                        p90Var = s03.c(r6);
                    }
                }
                if ((ul1Var4.p & 8) == 0) {
                    break;
                }
                ul1Var4 = ul1Var4.r;
            }
            obj = ul1Var;
        }
        return (xh2) obj;
    }

    public final w72 g() {
        ks1 d = d();
        if (d != null) {
            if (!d.Q0().z) {
                d = null;
            }
            if (d != null) {
                return yk3.D(d).M(d, true);
            }
        }
        return w72.e;
    }

    public final w72 h() {
        ks1 d = d();
        if (d != null) {
            if (!d.Q0().z) {
                d = null;
            }
            if (d != null) {
                return yk3.r(d);
            }
        }
        return w72.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.p) {
            return ah0.m;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final sh2 k() {
        boolean n = n();
        sh2 sh2Var = this.d;
        if (!n) {
            return sh2Var;
        }
        sh2 a = sh2Var.a();
        p(new ArrayList(), a);
        return a;
    }

    public final ai2 l() {
        i91 i91Var;
        ai2 ai2Var = this.f;
        if (ai2Var != null) {
            return ai2Var;
        }
        i91 i91Var2 = this.c;
        boolean z = this.b;
        if (z) {
            i91Var = i91Var2.u();
            while (i91Var != null) {
                sh2 w = i91Var.w();
                if (w != null && w.o) {
                    break;
                }
                i91Var = i91Var.u();
            }
        }
        i91Var = null;
        if (i91Var == null) {
            i91 u = i91Var2.u();
            while (true) {
                if (u == null) {
                    i91Var = null;
                    break;
                }
                if (u.P.d(8)) {
                    i91Var = u;
                    break;
                }
                u = u.u();
            }
        }
        if (i91Var == null) {
            return null;
        }
        return ci2.a(i91Var, z);
    }

    public final sh2 m() {
        return this.d;
    }

    public final boolean n() {
        return this.b && this.d.o;
    }

    public final boolean o() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        i91 u = this.c.u();
        while (true) {
            if (u == null) {
                u = null;
                break;
            }
            sh2 w = u.w();
            if (w != null && w.o) {
                break;
            }
            u = u.u();
        }
        return u == null;
    }

    public final void p(ArrayList arrayList, sh2 sh2Var) {
        if (this.d.p) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            ai2 ai2Var = (ai2) arrayList.get(size2);
            if (!ai2Var.n()) {
                sh2Var.c(ai2Var.d);
                ai2Var.p(arrayList, sh2Var);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z) {
        if (this.e) {
            return ah0.m;
        }
        c(this.c, arrayList);
        if (z) {
            sh2 sh2Var = this.d;
            tn1 tn1Var = sh2Var.m;
            Object g = tn1Var.g(gi2.x);
            if (g == null) {
                g = null;
            }
            fb2 fb2Var = (fb2) g;
            if (fb2Var != null && sh2Var.o && !arrayList.isEmpty()) {
                arrayList.add(b(fb2Var, new s72(5, fb2Var)));
            }
            ji2 ji2Var = gi2.a;
            if (tn1Var.c(ji2Var) && !arrayList.isEmpty() && sh2Var.o) {
                Object g2 = tn1Var.g(ji2Var);
                if (g2 == null) {
                    g2 = null;
                }
                List list = (List) g2;
                String str = list != null ? (String) zv.v(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new b6(str, 3)));
                }
            }
        }
        return arrayList;
    }
}
