package q1;

import androidx.lifecycle.r0;
import java.util.HashSet;
import r1.d0;
import r1.m;
import s0.n;
import s1.r;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final r f7482a;

    /* renamed from: b, reason: collision with root package name */
    public final i0.d f7483b = new i0.d(new r1.c[16]);

    /* renamed from: c, reason: collision with root package name */
    public final i0.d f7484c = new i0.d(new h[16]);

    /* renamed from: d, reason: collision with root package name */
    public final i0.d f7485d = new i0.d(new d0[16]);

    /* renamed from: e, reason: collision with root package name */
    public final i0.d f7486e = new i0.d(new h[16]);

    /* renamed from: f, reason: collision with root package name */
    public boolean f7487f;

    public d(r rVar) {
        this.f7482a = rVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(n nVar, h hVar, HashSet hashSet) {
        n nVar2 = nVar.f8104f;
        if (!nVar2.f8116r) {
            a.a.M("visitSubtreeIf called on an unattached node");
            throw null;
        }
        i0.d dVar = new i0.d(new n[16]);
        n nVar3 = nVar2.f8109k;
        if (nVar3 == null) {
            r1.f.b(dVar, nVar2);
        } else {
            dVar.b(nVar3);
        }
        while (dVar.m()) {
            n nVar4 = (n) dVar.o(dVar.f4842h - 1);
            if ((nVar4.f8107i & 32) != 0) {
                for (n nVar5 = nVar4; nVar5 != null; nVar5 = nVar5.f8109k) {
                    if ((nVar5.f8106h & 32) != 0) {
                        ?? r62 = 0;
                        m mVar = nVar5;
                        while (mVar != 0) {
                            if (mVar instanceof e) {
                                e eVar = (e) mVar;
                                if (eVar instanceof r1.c) {
                                    r1.c cVar = (r1.c) eVar;
                                    if ((cVar.f7714s instanceof c) && cVar.f7716u.contains(hVar)) {
                                        hashSet.add(eVar);
                                    }
                                }
                                if (eVar.j().p(hVar)) {
                                    break;
                                }
                            } else if ((mVar.f8106h & 32) != 0 && (mVar instanceof m)) {
                                n nVar6 = mVar.f7853t;
                                int i7 = 0;
                                mVar = mVar;
                                r62 = r62;
                                while (nVar6 != null) {
                                    if ((nVar6.f8106h & 32) != 0) {
                                        i7++;
                                        r62 = r62;
                                        if (i7 == 1) {
                                            mVar = nVar6;
                                        } else {
                                            if (r62 == 0) {
                                                r62 = new i0.d(new n[16]);
                                            }
                                            if (mVar != 0) {
                                                r62.b(mVar);
                                                mVar = 0;
                                            }
                                            r62.b(nVar6);
                                        }
                                    }
                                    nVar6 = nVar6.f8109k;
                                    mVar = mVar;
                                    r62 = r62;
                                }
                                if (i7 == 1) {
                                }
                            }
                            mVar = r1.f.f(r62);
                        }
                    }
                }
            }
            r1.f.b(dVar, nVar4);
        }
    }

    public final void a() {
        if (this.f7487f) {
            return;
        }
        this.f7487f = true;
        r0 r0Var = new r0(25, this);
        i0.d dVar = this.f7482a.f8394u0;
        if (dVar.i(r0Var)) {
            return;
        }
        dVar.b(r0Var);
    }
}
