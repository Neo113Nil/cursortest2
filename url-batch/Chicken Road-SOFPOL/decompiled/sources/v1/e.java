package v1;

import r2.r;
import w1.b1;
import w1.f0;
import w1.k;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public interface e extends f, k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [v1.e, w1.k] */
    @Override // v1.f
    default Object d(g gVar) {
        b1 b1Var;
        l lVar = (l) this;
        if (!lVar.f8706d.f8718q) {
            t1.a.a("ModifierLocal accessed from an unattached node");
        }
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        l lVar2 = lVar.f8706d.f8710h;
        f0 u7 = w1.f.u(this);
        while (u7 != null) {
            if ((u7.F.f7600f.f8709g & 32) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f8708f & 32) != 0) {
                        w1.l lVar3 = lVar2;
                        ?? r42 = 0;
                        while (lVar3 != 0) {
                            if (lVar3 instanceof e) {
                                e eVar = (e) lVar3;
                                if (eVar.g().q(gVar)) {
                                    return eVar.g().w(gVar);
                                }
                            } else if ((lVar3.f8708f & 32) != 0 && (lVar3 instanceof w1.l)) {
                                l lVar4 = lVar3.f7707s;
                                int i = 0;
                                lVar3 = lVar3;
                                r42 = r42;
                                while (lVar4 != null) {
                                    if ((lVar4.f8708f & 32) != 0) {
                                        i++;
                                        r42 = r42;
                                        if (i == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new o0.e(new l[16]);
                                            }
                                            if (lVar3 != 0) {
                                                r42.b(lVar3);
                                                lVar3 = 0;
                                            }
                                            r42.b(lVar4);
                                        }
                                    }
                                    lVar4 = lVar4.i;
                                    lVar3 = lVar3;
                                    r42 = r42;
                                }
                                if (i == 1) {
                                }
                            }
                            lVar3 = w1.f.f(r42);
                        }
                    }
                    lVar2 = lVar2.f8710h;
                }
            }
            u7 = u7.s();
            lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
        return gVar.f7456a.b();
    }

    default r g() {
        return b.f7449a;
    }
}
