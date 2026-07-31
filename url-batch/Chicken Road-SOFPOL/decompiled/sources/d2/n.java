package d2;

import java.util.ArrayList;
import java.util.List;
import o.j0;
import u1.s0;
import w1.d1;
import w1.f0;
import w1.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final y0.l f2156a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f2157b;

    /* renamed from: c, reason: collision with root package name */
    public final f0 f2158c;

    /* renamed from: d, reason: collision with root package name */
    public final j f2159d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f2160e;

    /* renamed from: f, reason: collision with root package name */
    public n f2161f;

    /* renamed from: g, reason: collision with root package name */
    public final int f2162g;

    public n(y0.l lVar, boolean z3, f0 f0Var, j jVar) {
        this.f2156a = lVar;
        this.f2157b = z3;
        this.f2158c = f0Var;
        this.f2159d = jVar;
        this.f2162g = f0Var.f7640e;
    }

    public static /* synthetic */ List j(int i, n nVar) {
        return nVar.i((i & 1) != 0 ? !nVar.f2157b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final e1.c a(d1 d1Var) {
        w1.l lVar;
        n l3 = l();
        if (l3 == null) {
            return e1.c.f2456e;
        }
        y0.l lVar2 = l3.f2158c.F.f7600f;
        if ((lVar2.f8709g & 8) != 0) {
            loop0: while (lVar2 != null) {
                if ((lVar2.f8708f & 8) != 0) {
                    lVar = lVar2;
                    ?? r62 = 0;
                    while (lVar != 0) {
                        if (lVar instanceof s1) {
                            if (lVar.f()) {
                                break loop0;
                            }
                        } else if ((lVar.f8708f & 8) != 0 && (lVar instanceof w1.l)) {
                            y0.l lVar3 = lVar.f7707s;
                            int i = 0;
                            lVar = lVar;
                            r62 = r62;
                            while (lVar3 != null) {
                                if ((lVar3.f8708f & 8) != 0) {
                                    i++;
                                    r62 = r62;
                                    if (i == 1) {
                                        lVar = lVar3;
                                    } else {
                                        if (r62 == 0) {
                                            r62 = new o0.e(new y0.l[16]);
                                        }
                                        if (lVar != 0) {
                                            r62.b(lVar);
                                            lVar = 0;
                                        }
                                        r62.b(lVar3);
                                    }
                                }
                                lVar3 = lVar3.i;
                                lVar = lVar;
                                r62 = r62;
                            }
                            if (i == 1) {
                            }
                        }
                        lVar = w1.f.f(r62);
                    }
                }
                if ((lVar2.f8709g & 8) == 0) {
                    break;
                }
                lVar2 = lVar2.i;
            }
        }
        lVar = 0;
        s1 s1Var = (s1) lVar;
        d1 s5 = s1Var != null ? w1.f.s(s1Var, 8) : null;
        return s5 == null ? l3.a(d1Var) : s5.K(d1Var, true);
    }

    public final n b(g gVar, p6.c cVar) {
        j jVar = new j();
        jVar.f2152f = false;
        jVar.f2153g = false;
        cVar.i(jVar);
        n nVar = new n(new m(cVar), false, new f0(this.f2162g + (gVar != null ? 1000000000 : 2000000000), true), jVar);
        nVar.f2160e = true;
        nVar.f2161f = this;
        return nVar;
    }

    public final void c(f0 f0Var, ArrayList arrayList) {
        o0.e w7 = f0Var.w();
        Object[] objArr = w7.f5578d;
        int i = w7.f5580f;
        for (int i8 = 0; i8 < i; i8++) {
            f0 f0Var2 = (f0) objArr[i8];
            if (f0Var2.G() && !f0Var2.O) {
                if (f0Var2.F.d(8)) {
                    arrayList.add(q.a(f0Var2, this.f2157b));
                } else {
                    c(f0Var2, arrayList);
                }
            }
        }
    }

    public final d1 d() {
        if (!this.f2160e) {
            s1 f6 = f();
            return f6 != null ? w1.f.s(f6, 8) : this.f2158c.F.f7597c;
        }
        n l3 = l();
        if (l3 != null) {
            return l3.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (nVar.n()) {
                arrayList2.add(nVar);
            } else if (!nVar.f2159d.f2153g) {
                nVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v14, types: [w1.s1] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    public final s1 f() {
        y0.l lVar;
        boolean z3 = this.f2159d.f2152f;
        f0 f0Var = this.f2158c;
        Object obj = null;
        if (!z3) {
            y0.l lVar2 = f0Var.F.f7600f;
            if ((lVar2.f8709g & 8) != 0) {
                loop3: while (lVar2 != null) {
                    if ((lVar2.f8708f & 8) != 0) {
                        lVar = lVar2;
                        o0.e eVar = null;
                        while (lVar != null) {
                            if (lVar instanceof s1) {
                                if (((s1) lVar).f()) {
                                    obj = lVar;
                                }
                            } else if ((lVar.f8708f & 8) != 0 && (lVar instanceof w1.l)) {
                                int i = 0;
                                for (y0.l lVar3 = ((w1.l) lVar).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                    if ((lVar3.f8708f & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            lVar = lVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar != null) {
                                                eVar.b(lVar);
                                                lVar = null;
                                            }
                                            eVar.b(lVar3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            lVar = w1.f.f(eVar);
                        }
                    }
                    if ((lVar2.f8709g & 8) == 0) {
                        break;
                    }
                    lVar2 = lVar2.i;
                }
            }
            return (s1) obj;
        }
        y0.l lVar4 = f0Var.F.f7600f;
        if ((lVar4.f8709g & 8) != 0) {
            lVar = null;
            while (lVar4 != null) {
                if ((lVar4.f8708f & 8) != 0) {
                    w1.l lVar5 = lVar4;
                    ?? r7 = 0;
                    while (lVar5 != 0) {
                        if (lVar5 instanceof s1) {
                            ?? r62 = (s1) lVar5;
                            if (r62.f()) {
                                if (r62.U()) {
                                    return r62;
                                }
                                if (lVar == null) {
                                    lVar = r62;
                                }
                            }
                        } else if ((lVar5.f8708f & 8) != 0 && (lVar5 instanceof w1.l)) {
                            y0.l lVar6 = lVar5.f7707s;
                            int i8 = 0;
                            lVar5 = lVar5;
                            r7 = r7;
                            while (lVar6 != null) {
                                if ((lVar6.f8708f & 8) != 0) {
                                    i8++;
                                    r7 = r7;
                                    if (i8 == 1) {
                                        lVar5 = lVar6;
                                    } else {
                                        if (r7 == 0) {
                                            r7 = new o0.e(new y0.l[16]);
                                        }
                                        if (lVar5 != 0) {
                                            r7.b(lVar5);
                                            lVar5 = 0;
                                        }
                                        r7.b(lVar6);
                                    }
                                }
                                lVar6 = lVar6.i;
                                lVar5 = lVar5;
                                r7 = r7;
                            }
                            if (i8 == 1) {
                            }
                        }
                        lVar5 = w1.f.f(r7);
                    }
                }
                if ((lVar4.f8709g & 8) == 0) {
                    break;
                }
                lVar4 = lVar4.i;
            }
            obj = lVar;
        }
        return (s1) obj;
    }

    public final e1.c g() {
        d1 d8 = d();
        if (d8 != null) {
            if (!d8.E0().f8718q) {
                d8 = null;
            }
            if (d8 != null) {
                return s0.g(d8).K(d8, true);
            }
        }
        return e1.c.f2456e;
    }

    public final e1.c h() {
        d1 d8 = d();
        if (d8 != null) {
            if (!d8.E0().f8718q) {
                d8 = null;
            }
            if (d8 != null) {
                return s0.e(d8);
            }
        }
        return e1.c.f2456e;
    }

    public final List i(boolean z3, boolean z7) {
        if (!z3 && this.f2159d.f2153g) {
            return d6.u.f2326d;
        }
        ArrayList arrayList = new ArrayList();
        if (!n()) {
            return q(arrayList, z7);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final j k() {
        boolean n6 = n();
        j jVar = this.f2159d;
        if (!n6) {
            return jVar;
        }
        j a8 = jVar.a();
        p(new ArrayList(), a8);
        return a8;
    }

    public final n l() {
        f0 f0Var;
        n nVar = this.f2161f;
        if (nVar != null) {
            return nVar;
        }
        f0 f0Var2 = this.f2158c;
        boolean z3 = this.f2157b;
        if (z3) {
            f0Var = f0Var2.s();
            while (f0Var != null) {
                j u7 = f0Var.u();
                if (u7 != null && u7.f2152f) {
                    break;
                }
                f0Var = f0Var.s();
            }
        }
        f0Var = null;
        if (f0Var == null) {
            f0 s5 = f0Var2.s();
            while (true) {
                if (s5 == null) {
                    f0Var = null;
                    break;
                }
                if (s5.F.d(8)) {
                    f0Var = s5;
                    break;
                }
                s5 = s5.s();
            }
        }
        if (f0Var == null) {
            return null;
        }
        return q.a(f0Var, z3);
    }

    public final j m() {
        return this.f2159d;
    }

    public final boolean n() {
        return this.f2157b && this.f2159d.f2152f;
    }

    public final boolean o() {
        if (this.f2160e || !j(4, this).isEmpty()) {
            return false;
        }
        f0 s5 = this.f2158c.s();
        while (true) {
            if (s5 == null) {
                s5 = null;
                break;
            }
            j u7 = s5.u();
            if (u7 != null && u7.f2152f) {
                break;
            }
            s5 = s5.s();
        }
        return s5 == null;
    }

    public final void p(ArrayList arrayList, j jVar) {
        if (this.f2159d.f2153g) {
            return;
        }
        q(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            n nVar = (n) arrayList.get(size2);
            if (!nVar.n()) {
                jVar.c(nVar.f2159d);
                nVar.p(arrayList, jVar);
            }
        }
    }

    public final List q(ArrayList arrayList, boolean z3) {
        if (this.f2160e) {
            return d6.u.f2326d;
        }
        c(this.f2158c, arrayList);
        if (z3) {
            j jVar = this.f2159d;
            j0 j0Var = jVar.f2150d;
            Object g3 = j0Var.g(s.f2209w);
            if (g3 == null) {
                g3 = null;
            }
            g gVar = (g) g3;
            if (gVar != null && jVar.f2152f && !arrayList.isEmpty()) {
                arrayList.add(b(gVar, new b1.e(3, gVar)));
            }
            v vVar = s.f2188a;
            if (j0Var.c(vVar) && !arrayList.isEmpty() && jVar.f2152f) {
                Object g7 = j0Var.g(vVar);
                if (g7 == null) {
                    g7 = null;
                }
                List list = (List) g7;
                String str = list != null ? (String) d6.m.S(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new b1.e(4, str)));
                }
            }
        }
        return arrayList;
    }
}
