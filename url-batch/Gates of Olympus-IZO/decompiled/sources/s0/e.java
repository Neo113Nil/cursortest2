package s0;

import I.C0120t;
import U.k;
import e2.AbstractC0381e;
import g2.i;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.D;
import t0.InterfaceC0904l;
import t0.o0;

/* loaded from: classes.dex */
public interface e extends g, InterfaceC0904l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [U.k] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [U.k] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [s0.e, t0.l] */
    @Override // s0.g
    default Object e(h hVar) {
        C0120t c0120t;
        k kVar = ((k) this).f3303d;
        boolean z3 = kVar.p;
        if (!z3) {
            AbstractC0381e.M("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z3) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        k kVar2 = kVar.f3307h;
        D t3 = AbstractC0898f.t(this);
        while (t3 != null) {
            if ((((k) t3.f7735x.f2356f).f3306g & 32) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f3305f & 32) != 0) {
                        AbstractC0905m abstractC0905m = kVar2;
                        ?? r4 = 0;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof e) {
                                e eVar = (e) abstractC0905m;
                                if (eVar.i().K(hVar)) {
                                    return eVar.i().N(hVar);
                                }
                            } else if ((abstractC0905m.f3305f & 32) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                k kVar3 = abstractC0905m.f7937r;
                                int i3 = 0;
                                abstractC0905m = abstractC0905m;
                                r4 = r4;
                                while (kVar3 != null) {
                                    if ((kVar3.f3305f & 32) != 0) {
                                        i3++;
                                        r4 = r4;
                                        if (i3 == 1) {
                                            abstractC0905m = kVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new K.d(new k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r4.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r4.b(kVar3);
                                        }
                                    }
                                    kVar3 = kVar3.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r4 = r4;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0905m = AbstractC0898f.f(r4);
                        }
                    }
                    kVar2 = kVar2.f3307h;
                }
            }
            t3 = t3.q();
            kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
        return hVar.f7509a.b();
    }

    default i i() {
        return C0885b.f7502a;
    }
}
