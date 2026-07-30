package q1;

import g0.t;
import r1.d0;
import r1.l;
import r1.m;
import r1.o1;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public interface e extends g, l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [q1.e, r1.l] */
    @Override // q1.g
    default Object g(h hVar) {
        t tVar;
        n nVar = ((n) this).f8104f;
        boolean z8 = nVar.f8116r;
        if (!z8) {
            a.a.L("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z8) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f8108j;
        d0 t2 = r1.f.t(this);
        while (t2 != null) {
            if ((((n) t2.A.f3895f).f8107i & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f8106h & 32) != 0) {
                        m mVar = nVar2;
                        ?? r42 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof e) {
                                e eVar = (e) mVar;
                                if (eVar.j().p(hVar)) {
                                    return eVar.j().v(hVar);
                                }
                            } else if ((mVar.f8106h & 32) != 0 && (mVar instanceof m)) {
                                n nVar3 = mVar.f7853t;
                                int i7 = 0;
                                mVar = mVar;
                                r42 = r42;
                                while (nVar3 != null) {
                                    if ((nVar3.f8106h & 32) != 0) {
                                        i7++;
                                        r42 = r42;
                                        if (i7 == 1) {
                                            mVar = nVar3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new i0.d(new n[16]);
                                            }
                                            if (mVar != 0) {
                                                r42.b(mVar);
                                                mVar = 0;
                                            }
                                            r42.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f8109k;
                                    mVar = mVar;
                                    r42 = r42;
                                }
                                if (i7 == 1) {
                                }
                            }
                            mVar = r1.f.f(r42);
                        }
                    }
                    nVar2 = nVar2.f8108j;
                }
            }
            t2 = t2.s();
            nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
        return hVar.f7488a.a();
    }

    default a.a j() {
        return b.f7481b;
    }
}
