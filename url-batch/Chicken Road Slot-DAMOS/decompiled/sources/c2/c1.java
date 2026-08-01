package c2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class c1 implements e1 {
    @Override // c2.e1
    public final void a(g0 g0Var, long j, o oVar, int i3, boolean z10) {
        g0Var.x(j, oVar, i3, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r8v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // c2.e1
    public final boolean b(d1.k kVar) {
        ?? r12 = 0;
        while (true) {
            int i3 = 0;
            if (kVar == 0) {
                return false;
            }
            if (kVar instanceof t1) {
                ((t1) kVar).s();
            } else if ((kVar.f3307i & 16) != 0 && (kVar instanceof j)) {
                d1.k kVar2 = kVar.D;
                r12 = r12;
                kVar = kVar;
                while (kVar2 != null) {
                    if ((kVar2.f3307i & 16) != 0) {
                        i3++;
                        r12 = r12;
                        if (i3 == 1) {
                            kVar = kVar2;
                        } else {
                            if (r12 == 0) {
                                r12 = new o0.e(new d1.k[16]);
                            }
                            if (kVar != 0) {
                                r12.b(kVar);
                                kVar = 0;
                            }
                            r12.b(kVar2);
                        }
                    }
                    kVar2 = kVar2.f3310t;
                    r12 = r12;
                    kVar = kVar;
                }
                if (i3 == 1) {
                }
            }
            kVar = k.e(r12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
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
    @Override // c2.e1
    public final boolean c(o oVar, g0 g0Var) {
        i1 i1Var = (i1) g0Var.S.f1494e;
        i1Var.getClass();
        d1.k F0 = i1Var.F0(j1.g(16));
        if (F0 != null && F0.B) {
            if (!F0.f3305d.B) {
                z1.a.b("visitLocalDescendants called on an unattached node");
            }
            d1.k kVar = F0.f3305d;
            if ((kVar.f3308r & 16) != 0) {
                while (kVar != null) {
                    if ((kVar.f3307i & 16) != 0) {
                        j jVar = kVar;
                        ?? r42 = 0;
                        while (jVar != 0) {
                            if (jVar instanceof t1) {
                                if (((t1) jVar).k()) {
                                    oVar.f1630i = oVar.f1628d.f8285b - 1;
                                    return true;
                                }
                            } else if ((jVar.f3307i & 16) != 0 && (jVar instanceof j)) {
                                d1.k kVar2 = jVar.D;
                                int i3 = 0;
                                jVar = jVar;
                                r42 = r42;
                                while (kVar2 != null) {
                                    if ((kVar2.f3307i & 16) != 0) {
                                        i3++;
                                        r42 = r42;
                                        if (i3 == 1) {
                                            jVar = kVar2;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new o0.e(new d1.k[16]);
                                            }
                                            if (jVar != 0) {
                                                r42.b(jVar);
                                                jVar = 0;
                                            }
                                            r42.b(kVar2);
                                        }
                                    }
                                    kVar2 = kVar2.f3310t;
                                    jVar = jVar;
                                    r42 = r42;
                                }
                                if (i3 == 1) {
                                }
                            }
                            jVar = k.e(r42);
                        }
                    }
                    kVar = kVar.f3310t;
                }
            }
        }
        return false;
    }

    @Override // c2.e1
    public final int d() {
        return 16;
    }

    @Override // c2.e1
    public final boolean e(g0 g0Var) {
        return true;
    }
}
