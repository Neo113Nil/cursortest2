package s0;

import U.p;
import java.util.HashSet;
import n.z0;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.C0990c;
import t0.E;
import u0.C1123s;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0958d {

    /* renamed from: a, reason: collision with root package name */
    public final C1123s f8345a;

    /* renamed from: b, reason: collision with root package name */
    public final K.d f8346b = new K.d(new C0990c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final K.d f8347c = new K.d(new C0962h[16]);

    /* renamed from: d, reason: collision with root package name */
    public final K.d f8348d = new K.d(new E[16]);

    /* renamed from: e, reason: collision with root package name */
    public final K.d f8349e = new K.d(new C0962h[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f8350f;

    public C0958d(C1123s c1123s) {
        this.f8345a = c1123s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(p pVar, C0962h c0962h, HashSet hashSet) {
        p pVar2 = pVar.f4489d;
        if (!pVar2.f4501p) {
            z0.o("visitSubtreeIf called on an unattached node");
            throw null;
        }
        K.d dVar = new K.d(new p[16]);
        p pVar3 = pVar2.f4494i;
        if (pVar3 == null) {
            AbstractC0993f.b(dVar, pVar2);
        } else {
            dVar.b(pVar3);
        }
        while (dVar.m()) {
            p pVar4 = (p) dVar.o(dVar.f3216f - 1);
            if ((pVar4.f4492g & 32) != 0) {
                for (p pVar5 = pVar4; pVar5 != null; pVar5 = pVar5.f4494i) {
                    if ((pVar5.f4491f & 32) != 0) {
                        ?? r6 = 0;
                        AbstractC1000m abstractC1000m = pVar5;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof InterfaceC0959e) {
                                InterfaceC0959e interfaceC0959e = (InterfaceC0959e) abstractC1000m;
                                if (interfaceC0959e instanceof C0990c) {
                                    C0990c c0990c = (C0990c) interfaceC0959e;
                                    if ((c0990c.f8723q instanceof InterfaceC0957c) && c0990c.f8725s.contains(c0962h)) {
                                        hashSet.add(interfaceC0959e);
                                    }
                                }
                                if (interfaceC0959e.m().g(c0962h)) {
                                    break;
                                }
                            } else if ((abstractC1000m.f4491f & 32) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                p pVar6 = abstractC1000m.f8771r;
                                int i3 = 0;
                                abstractC1000m = abstractC1000m;
                                r6 = r6;
                                while (pVar6 != null) {
                                    if ((pVar6.f4491f & 32) != 0) {
                                        i3++;
                                        r6 = r6;
                                        if (i3 == 1) {
                                            abstractC1000m = pVar6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new K.d(new p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r6.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r6.b(pVar6);
                                        }
                                    }
                                    pVar6 = pVar6.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r6 = r6;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1000m = AbstractC0993f.f(r6);
                        }
                    }
                }
            }
            AbstractC0993f.b(dVar, pVar4);
        }
    }

    public final void a() {
        if (this.f8350f) {
            return;
        }
        this.f8350f = true;
        A.h hVar = new A.h(28, this);
        K.d dVar = this.f8345a.f9507s0;
        if (dVar.i(hVar)) {
            return;
        }
        dVar.b(hVar);
    }
}
