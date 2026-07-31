package v1;

import d1.o;
import java.util.HashSet;
import o.e0;
import w1.f0;
import x1.t;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final t f7450a;

    /* renamed from: b, reason: collision with root package name */
    public final o0.e f7451b = new o0.e(new w1.c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final o0.e f7452c = new o0.e(new g[16]);

    /* renamed from: d, reason: collision with root package name */
    public final o0.e f7453d = new o0.e(new f0[16]);

    /* renamed from: e, reason: collision with root package name */
    public final o0.e f7454e = new o0.e(new g[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f7455f;

    public d(t tVar) {
        this.f7450a = tVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static void b(l lVar, g gVar, HashSet hashSet) {
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new l[16]);
        l lVar2 = lVar.f8706d;
        l lVar3 = lVar2.i;
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
            l lVar4 = (l) eVar.k(i - 1);
            if ((lVar4.f8709g & 32) != 0) {
                for (l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.i) {
                    if ((lVar5.f8708f & 32) != 0) {
                        w1.l lVar6 = lVar5;
                        ?? r52 = 0;
                        while (lVar6 != 0) {
                            if (lVar6 instanceof e) {
                                e eVar2 = (e) lVar6;
                                if (eVar2 instanceof w1.c) {
                                    w1.c cVar = (w1.c) eVar2;
                                    if ((cVar.f7604r instanceof c) && cVar.f7606t.contains(gVar)) {
                                        hashSet.add(eVar2);
                                    }
                                }
                                if (eVar2.g().q(gVar)) {
                                    break;
                                }
                            } else if ((lVar6.f8708f & 32) != 0 && (lVar6 instanceof w1.l)) {
                                l lVar7 = lVar6.f7707s;
                                int i8 = 0;
                                lVar6 = lVar6;
                                r52 = r52;
                                while (lVar7 != null) {
                                    if ((lVar7.f8708f & 32) != 0) {
                                        i8++;
                                        r52 = r52;
                                        if (i8 == 1) {
                                            lVar6 = lVar7;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new o0.e(new l[16]);
                                            }
                                            if (lVar6 != 0) {
                                                r52.b(lVar6);
                                                lVar6 = 0;
                                            }
                                            r52.b(lVar7);
                                        }
                                    }
                                    lVar7 = lVar7.i;
                                    lVar6 = lVar6;
                                    r52 = r52;
                                }
                                if (i8 == 1) {
                                }
                            }
                            lVar6 = w1.f.f(r52);
                        }
                    }
                }
            }
            w1.f.b(eVar, lVar4);
        }
    }

    public final void a() {
        if (this.f7455f) {
            return;
        }
        this.f7455f = true;
        o oVar = new o(10, this);
        e0 e0Var = this.f7450a.f8582w0;
        if (e0Var.f(oVar) >= 0) {
            return;
        }
        e0Var.a(oVar);
    }
}
