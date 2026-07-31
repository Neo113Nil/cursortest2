package s0;

import I.C0174t;
import U.p;
import n.t0;
import n.z0;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.E;
import t0.InterfaceC0999l;
import t0.p0;

/* renamed from: s0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0959e extends InterfaceC0961g, InterfaceC0999l {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [U.p] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [U.p] */
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
    @Override // s0.InterfaceC0961g
    default Object i(C0962h c0962h) {
        C0174t c0174t;
        p pVar = ((p) this).f4489d;
        boolean z3 = pVar.f4501p;
        if (!z3) {
            z0.n("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z3) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        p pVar2 = pVar.f4493h;
        E t3 = AbstractC0993f.t(this);
        while (t3 != null) {
            if ((((p) t3.f8561y.f2915f).f4492g & 32) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f4491f & 32) != 0) {
                        AbstractC1000m abstractC1000m = pVar2;
                        ?? r4 = 0;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof InterfaceC0959e) {
                                InterfaceC0959e interfaceC0959e = (InterfaceC0959e) abstractC1000m;
                                if (interfaceC0959e.m().g(c0962h)) {
                                    return interfaceC0959e.m().j(c0962h);
                                }
                            } else if ((abstractC1000m.f4491f & 32) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                p pVar3 = abstractC1000m.f8771r;
                                int i3 = 0;
                                abstractC1000m = abstractC1000m;
                                r4 = r4;
                                while (pVar3 != null) {
                                    if ((pVar3.f4491f & 32) != 0) {
                                        i3++;
                                        r4 = r4;
                                        if (i3 == 1) {
                                            abstractC1000m = pVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new K.d(new p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r4.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r4.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r4 = r4;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1000m = AbstractC0993f.f(r4);
                        }
                    }
                    pVar2 = pVar2.f4493h;
                }
            }
            t3 = t3.s();
            pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
        return c0962h.f8351a.b();
    }

    default t0 m() {
        return C0956b.f8344a;
    }
}
