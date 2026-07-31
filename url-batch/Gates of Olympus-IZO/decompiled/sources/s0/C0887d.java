package s0;

import U.k;
import e2.AbstractC0381e;
import java.util.HashSet;
import r1.r;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.C0895c;
import t0.D;
import u0.C0997t;

/* renamed from: s0.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0887d {

    /* renamed from: a, reason: collision with root package name */
    public final C0997t f7503a;

    /* renamed from: b, reason: collision with root package name */
    public final K.d f7504b = new K.d(new C0895c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final K.d f7505c = new K.d(new h[16]);

    /* renamed from: d, reason: collision with root package name */
    public final K.d f7506d = new K.d(new D[16]);

    /* renamed from: e, reason: collision with root package name */
    public final K.d f7507e = new K.d(new h[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f7508f;

    public C0887d(C0997t c0997t) {
        this.f7503a = c0997t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [U.k] */
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
    public static void b(k kVar, h hVar, HashSet hashSet) {
        k kVar2 = kVar.f3303d;
        if (!kVar2.p) {
            AbstractC0381e.N("visitSubtreeIf called on an unattached node");
            throw null;
        }
        K.d dVar = new K.d(new k[16]);
        k kVar3 = kVar2.f3308i;
        if (kVar3 == null) {
            AbstractC0898f.b(dVar, kVar2);
        } else {
            dVar.b(kVar3);
        }
        while (dVar.m()) {
            k kVar4 = (k) dVar.o(dVar.f2642f - 1);
            if ((kVar4.f3306g & 32) != 0) {
                for (k kVar5 = kVar4; kVar5 != null; kVar5 = kVar5.f3308i) {
                    if ((kVar5.f3305f & 32) != 0) {
                        ?? r6 = 0;
                        AbstractC0905m abstractC0905m = kVar5;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof e) {
                                e eVar = (e) abstractC0905m;
                                if (eVar instanceof C0895c) {
                                    C0895c c0895c = (C0895c) eVar;
                                    if ((c0895c.f7891q instanceof InterfaceC0886c) && c0895c.f7893s.contains(hVar)) {
                                        hashSet.add(eVar);
                                    }
                                }
                                if (eVar.i().K(hVar)) {
                                    break;
                                }
                            } else if ((abstractC0905m.f3305f & 32) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                k kVar6 = abstractC0905m.f7937r;
                                int i3 = 0;
                                abstractC0905m = abstractC0905m;
                                r6 = r6;
                                while (kVar6 != null) {
                                    if ((kVar6.f3305f & 32) != 0) {
                                        i3++;
                                        r6 = r6;
                                        if (i3 == 1) {
                                            abstractC0905m = kVar6;
                                        } else {
                                            if (r6 == 0) {
                                                r6 = new K.d(new k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r6.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r6.b(kVar6);
                                        }
                                    }
                                    kVar6 = kVar6.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r6 = r6;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0905m = AbstractC0898f.f(r6);
                        }
                    }
                }
            }
            AbstractC0898f.b(dVar, kVar4);
        }
    }

    public final void a() {
        if (this.f7508f) {
            return;
        }
        this.f7508f = true;
        r rVar = new r(1, this);
        K.d dVar = this.f7503a.f8460r0;
        if (dVar.i(rVar)) {
            return;
        }
        dVar.b(rVar);
    }
}
