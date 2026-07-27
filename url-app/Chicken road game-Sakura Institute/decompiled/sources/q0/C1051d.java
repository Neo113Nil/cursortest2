package q0;

import S.n;
import java.util.HashSet;
import n.AbstractC0864b;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.C1062c;
import r0.E;
import s0.C1166s;

/* renamed from: q0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1051d {

    /* renamed from: a, reason: collision with root package name */
    public final C1166s f9354a;

    /* renamed from: b, reason: collision with root package name */
    public final I.d f9355b = new I.d(new C1062c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final I.d f9356c = new I.d(new C1055h[16]);

    /* renamed from: d, reason: collision with root package name */
    public final I.d f9357d = new I.d(new E[16]);

    /* renamed from: e, reason: collision with root package name */
    public final I.d f9358e = new I.d(new C1055h[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f9359f;

    public C1051d(C1166s c1166s) {
        this.f9354a = c1166s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(n nVar, C1055h c1055h, HashSet hashSet) {
        n nVar2 = nVar.f3978d;
        if (!nVar2.f3990s) {
            AbstractC0864b.D("visitSubtreeIf called on an unattached node");
            throw null;
        }
        I.d dVar = new I.d(new n[16]);
        n nVar3 = nVar2.f3983l;
        if (nVar3 == null) {
            AbstractC1065f.b(dVar, nVar2);
        } else {
            dVar.b(nVar3);
        }
        while (dVar.l()) {
            n nVar4 = (n) dVar.n(dVar.f3332i - 1);
            if ((nVar4.f3981j & 32) != 0) {
                for (n nVar5 = nVar4; nVar5 != null; nVar5 = nVar5.f3983l) {
                    if ((nVar5.f3980i & 32) != 0) {
                        ?? r6 = 0;
                        AbstractC1073n abstractC1073n = nVar5;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof InterfaceC1052e) {
                                InterfaceC1052e interfaceC1052e = (InterfaceC1052e) abstractC1073n;
                                if (interfaceC1052e instanceof C1062c) {
                                    C1062c c1062c = (C1062c) interfaceC1052e;
                                    if ((c1062c.f9774t instanceof InterfaceC1050c) && c1062c.f9776v.contains(c1055h)) {
                                        hashSet.add(interfaceC1052e);
                                    }
                                }
                                if (interfaceC1052e.k().n(c1055h)) {
                                    break;
                                }
                            } else if ((abstractC1073n.f3980i & 32) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                n nVar6 = abstractC1073n.f9826u;
                                int i2 = 0;
                                abstractC1073n = abstractC1073n;
                                r6 = r6;
                                while (nVar6 != null) {
                                    if ((nVar6.f3980i & 32) != 0) {
                                        i2++;
                                        r6 = r6;
                                        if (i2 == 1) {
                                            abstractC1073n = nVar6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new I.d(new n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r6.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r6.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r6 = r6;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1073n = AbstractC1065f.f(r6);
                        }
                    }
                }
            }
            AbstractC1065f.b(dVar, nVar4);
        }
    }

    public final void a() {
        if (this.f9359f) {
            return;
        }
        this.f9359f = true;
        A3.e eVar = new A3.e(23, this);
        I.d dVar = this.f9354a.f10376v0;
        if (dVar.h(eVar)) {
            return;
        }
        dVar.b(eVar);
    }
}
