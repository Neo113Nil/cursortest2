package u1;

import w1.w1;
import w1.x1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class z implements u0 {

    /* renamed from: a, reason: collision with root package name */
    public final o.y f7300a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f7301b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7302c;

    public z(a0 a0Var, Object obj) {
        this.f7301b = a0Var;
        this.f7302c = obj;
        int[] iArr = o.n.f5513a;
        this.f7300a = new o.y();
    }

    @Override // u1.u0
    public final void a() {
        a0 a0Var = this.f7301b;
        w1.f0 f0Var = a0Var.f7169d;
        a0Var.e();
        w1.f0 f0Var2 = (w1.f0) a0Var.f7177m.k(this.f7302c);
        if (f0Var2 != null) {
            if (a0Var.f7182r <= 0) {
                t1.a.b("No pre-composed items to dispose");
            }
            int i = ((o0.b) f0Var.n()).f5572d.i(f0Var2);
            if (i < ((o0.b) f0Var.n()).f5572d.f5580f - a0Var.f7182r) {
                t1.a.b("Item is not in pre-composed item range");
            }
            a0Var.f7181q++;
            a0Var.f7182r--;
            t tVar = (t) a0Var.i.g(f0Var2);
            if (tVar != null) {
                a0.c(tVar);
            }
            int i8 = (((o0.b) f0Var.n()).f5572d.f5580f - a0Var.f7182r) - a0Var.f7181q;
            f0Var.f7652r = true;
            f0Var.K(i, i8, 1);
            f0Var.f7652r = false;
            a0Var.d(i8);
        }
    }

    @Override // u1.u0
    public final int b() {
        w1.f0 f0Var = (w1.f0) this.f7301b.f7177m.g(this.f7302c);
        if (f0Var != null) {
            return ((o0.b) f0Var.m()).f5572d.f5580f;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [a0.c1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    @Override // u1.u0
    public final void c(a0.c1 c1Var) {
        w1.b1 b1Var;
        y0.l lVar;
        w1 w1Var;
        w1.f0 f0Var = (w1.f0) this.f7301b.f7177m.g(this.f7302c);
        if (f0Var == null || (b1Var = f0Var.F) == null || (lVar = b1Var.f7600f) == null) {
            return;
        }
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.l[16]);
        y0.l lVar2 = lVar.f8706d;
        y0.l lVar3 = lVar2.i;
        if (lVar3 == null) {
            w1.f.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i = eVar.f5580f;
            if (i == 0) {
                return;
            }
            y0.l lVar4 = (y0.l) eVar.k(i - 1);
            if ((lVar4.f8709g & 262144) != 0) {
                for (y0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.i) {
                    if ((lVar5.f8708f & 262144) != 0) {
                        w1.l lVar6 = lVar5;
                        ?? r7 = 0;
                        while (lVar6 != 0) {
                            if (lVar6 instanceof x1) {
                                x1 x1Var = (x1) lVar6;
                                boolean equals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(x1Var.m());
                                w1 w1Var2 = w1.f7818e;
                                if (equals) {
                                    c1Var.i(x1Var);
                                    w1Var = w1Var2;
                                } else {
                                    w1Var = w1.f7817d;
                                }
                                if (w1Var == w1.f7819f) {
                                    return;
                                }
                                if (w1Var == w1Var2) {
                                    break;
                                }
                            } else if ((lVar6.f8708f & 262144) != 0 && (lVar6 instanceof w1.l)) {
                                y0.l lVar7 = lVar6.f7707s;
                                int i8 = 0;
                                lVar6 = lVar6;
                                r7 = r7;
                                while (lVar7 != null) {
                                    if ((lVar7.f8708f & 262144) != 0) {
                                        i8++;
                                        r7 = r7;
                                        if (i8 == 1) {
                                            lVar6 = lVar7;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar6 != 0) {
                                                r7.b(lVar6);
                                                lVar6 = 0;
                                            }
                                            r7.b(lVar7);
                                        }
                                    }
                                    lVar7 = lVar7.i;
                                    lVar6 = lVar6;
                                    r7 = r7;
                                }
                                if (i8 == 1) {
                                }
                            }
                            lVar6 = w1.f.f(r7);
                        }
                    }
                }
            }
            w1.f.b(eVar, lVar4);
        }
    }

    @Override // u1.u0
    public final void d(int i, long j7) {
        a0 a0Var = this.f7301b;
        w1.f0 f0Var = (w1.f0) a0Var.f7177m.g(this.f7302c);
        if (f0Var == null || !f0Var.G()) {
            return;
        }
        int i8 = ((o0.b) f0Var.m()).f5572d.f5580f;
        if (i < 0 || i >= i8) {
            t1.a.d("Index (" + i + ") is out of bound of [0, " + i8 + ')');
        }
        if (f0Var.H()) {
            t1.a.a("Pre-measure called on node that is not placed");
        }
        w1.f0 f0Var2 = a0Var.f7169d;
        f0Var2.f7652r = true;
        ((x1.t) w1.i0.a(f0Var)).t((w1.f0) ((o0.b) f0Var.m()).get(i), j7);
        f0Var2.f7652r = false;
        this.f7300a.a(i);
    }
}
