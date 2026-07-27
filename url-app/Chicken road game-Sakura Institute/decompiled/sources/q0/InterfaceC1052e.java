package q0;

import G.C0223t;
import S.n;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.E;
import r0.InterfaceC1072m;
import r0.o0;

/* renamed from: q0.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1052e extends InterfaceC1054g, InterfaceC1072m {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [S.n] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v0, types: [q0.e, r0.m] */
    @Override // q0.InterfaceC1054g
    default Object g(C1055h c1055h) {
        C0223t c0223t;
        n nVar = ((n) this).f3978d;
        boolean z4 = nVar.f3990s;
        if (!z4) {
            AbstractC0864b.C("ModifierLocal accessed from an unattached node");
            throw null;
        }
        if (!z4) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        n nVar2 = nVar.f3982k;
        E v4 = AbstractC1065f.v(this);
        while (v4 != null) {
            if ((((n) v4.B.f2912f).f3981j & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f3980i & 32) != 0) {
                        AbstractC1073n abstractC1073n = nVar2;
                        ?? r4 = 0;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof InterfaceC1052e) {
                                InterfaceC1052e interfaceC1052e = (InterfaceC1052e) abstractC1073n;
                                if (interfaceC1052e.k().n(c1055h)) {
                                    return interfaceC1052e.k().r(c1055h);
                                }
                            } else if ((abstractC1073n.f3980i & 32) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                n nVar3 = abstractC1073n.f9826u;
                                int i2 = 0;
                                abstractC1073n = abstractC1073n;
                                r4 = r4;
                                while (nVar3 != null) {
                                    if ((nVar3.f3980i & 32) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            abstractC1073n = nVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new I.d(new n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r4.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r4.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1073n = AbstractC1065f.f(r4);
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
        return c1055h.f9360a.invoke();
    }

    default AbstractC0864b k() {
        return C1049b.f9353a;
    }
}
