package c2;

import android.view.View;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final m1 f1592a = new m1(1);

    public static final long a(float f3, boolean z10, boolean z11) {
        return (((z10 ? 1L : 0L) | (z11 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32);
    }

    public static final void b(o0.e eVar, d1.k kVar) {
        o0.e w6 = u(kVar).w();
        int i3 = w6.f7319i - 1;
        Object[] objArr = w6.f7317d;
        if (i3 < objArr.length) {
            while (i3 >= 0) {
                eVar.b((d1.k) ((g0) objArr[i3]).S.g);
                i3--;
            }
        }
    }

    public static final int c(o0 o0Var, a2.a aVar) {
        o0 h0 = o0Var.h0();
        if (h0 == null) {
            z1.a.b("Child of " + o0Var + " cannot be null when calculating alignment line");
        }
        if (o0Var.l0().a().containsKey(aVar)) {
            Integer num = (Integer) o0Var.l0().a().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int g02 = h0.g0(aVar);
            if (g02 != Integer.MIN_VALUE) {
                h0.f1634w = true;
                o0Var.f1635x = true;
                o0Var.r0();
                h0.f1634w = false;
                o0Var.f1635x = false;
                return g02 + ((int) (aVar instanceof a2.i ? h0.n0() & 4294967295L : h0.n0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final d1.k d(i iVar, int i3) {
        d1.k kVar = ((d1.k) iVar).f3305d.f3310t;
        if (kVar == null || (kVar.f3308r & i3) == 0) {
            return null;
        }
        while (kVar != null) {
            int i10 = kVar.f3307i;
            if ((i10 & 2) != 0) {
                return null;
            }
            if ((i10 & i3) != 0) {
                return kVar;
            }
            kVar = kVar.f3310t;
        }
        return null;
    }

    public static final d1.k e(o0.e eVar) {
        int i3;
        if (eVar == null || (i3 = eVar.f7319i) == 0) {
            return null;
        }
        return (d1.k) eVar.l(i3 - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v f(d1.k kVar) {
        if ((kVar.f3307i & 2) != 0) {
            if (kVar instanceof v) {
                return (v) kVar;
            }
            if (kVar instanceof j) {
                d1.k kVar2 = ((j) kVar).D;
                while (kVar2 != 0) {
                    if (kVar2 instanceof v) {
                        return (v) kVar2;
                    }
                    kVar2 = (!(kVar2 instanceof j) || (kVar2.f3307i & 2) == 0) ? kVar2.f3310t : ((j) kVar2).D;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j3) {
        boolean p4 = p(j);
        if (p4 != p(j3)) {
            return p4 ? -1 : 1;
        }
        return (Math.min(k(j), k(j3)) >= 0.0f && o(j) != o(j3)) ? o(j) ? -1 : 1 : (int) Math.signum(k(j) - k(j3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(h hVar, n0.p1 p1Var) {
        if (!((d1.k) hVar).f3305d.B) {
            z1.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        x0.h hVar2 = (x0.h) u(hVar).O;
        hVar2.getClass();
        return n0.h.s(hVar2, p1Var);
    }

    public static final j1.c i(d1.k kVar, boolean z10, boolean z11) {
        if (!kVar.f3305d.B) {
            return j1.c.f4915e;
        }
        if (z10) {
            return s(kVar, 8).Y0();
        }
        i1 s3 = s(kVar, 8);
        return a2.q.h(s3).p(s3, z11);
    }

    public static final c2 j(j jVar, Object obj) {
        b1 b1Var;
        if (!jVar.f3305d.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar = jVar.f3305d.f3309s;
        g0 u2 = u(jVar);
        while (u2 != null) {
            if ((((d1.k) u2.S.g).f3308r & 262144) != 0) {
                while (kVar != null) {
                    if ((kVar.f3307i & 262144) != 0) {
                        d1.k kVar2 = kVar;
                        o0.e eVar = null;
                        while (kVar2 != null) {
                            if (kVar2 instanceof c2) {
                                c2 c2Var = (c2) kVar2;
                                if (obj.equals(c2Var.d())) {
                                    return c2Var;
                                }
                            }
                            if ((kVar2.f3307i & 262144) != 0 && (kVar2 instanceof j)) {
                                int i3 = 0;
                                for (d1.k kVar3 = ((j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                    if ((kVar3.f3307i & 262144) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar2 = kVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new d1.k[16]);
                                            }
                                            if (kVar2 != null) {
                                                eVar.b(kVar2);
                                                kVar2 = null;
                                            }
                                            eVar.b(kVar3);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar2 = e(eVar);
                        }
                    }
                    kVar = kVar.f3309s;
                }
            }
            u2 = u2.s();
            kVar = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
        }
        return null;
    }

    public static final float k(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(l lVar) {
        if (((d1.k) lVar).f3305d.B) {
            s(lVar, 1).K0();
        }
    }

    public static final void m(v vVar) {
        u(vVar).B();
    }

    public static final void n(x1 x1Var) {
        u(x1Var).C();
    }

    public static final boolean o(long j) {
        return (j & 2) != 0;
    }

    public static final boolean p(long j) {
        return (j & 1) != 0;
    }

    public static final boolean q(g0 g0Var) {
        if (g0Var.f1556v == null) {
            return false;
        }
        g0 s3 = g0Var.s();
        return (s3 != null ? s3.f1556v : null) == null || g0Var.T.f1594b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(d1.k kVar, Function0 function0) {
        l1 l1Var = kVar.f3311u;
        if (l1Var == null) {
            l1Var = new l1((k1) kVar);
            kVar.f3311u = l1Var;
        }
        q1 snapshotObserver = v(kVar).getSnapshotObserver();
        snapshotObserver.f1645a.c(l1Var, d.f1515t, function0);
    }

    public static final i1 s(i iVar, int i3) {
        i1 i1Var = ((d1.k) iVar).f3305d.f3312v;
        i1Var.getClass();
        if (i1Var.D0() != iVar || !j1.g(i3)) {
            return i1Var;
        }
        i1 i1Var2 = i1Var.C;
        i1Var2.getClass();
        return i1Var2;
    }

    public static final i1 t(i iVar) {
        if (!((d1.k) iVar).f3305d.B) {
            z1.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        i1 s3 = s(iVar, 2);
        if (!s3.D0().B) {
            z1.a.b("LayoutCoordinates is not attached.");
        }
        return s3;
    }

    public static final g0 u(i iVar) {
        i1 i1Var = ((d1.k) iVar).f3305d.f3312v;
        if (i1Var != null) {
            return i1Var.B;
        }
        throw v4.a.h("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final d2.v v(i iVar) {
        d2.v vVar = u(iVar).B;
        if (vVar != null) {
            return vVar;
        }
        throw v4.a.h("This node does not have an owner.");
    }

    public static final View w(i iVar) {
        if (!((d1.k) iVar).f3305d.B) {
            z1.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return j0.a(u(iVar));
    }

    public static final void x(d1.k kVar, Object obj, Function1 function1) {
        b1 b1Var;
        boolean z10;
        if (!kVar.f3305d.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar2 = kVar.f3305d.f3309s;
        g0 u2 = u(kVar);
        while (u2 != null) {
            if ((((d1.k) u2.S.g).f3308r & 262144) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f3307i & 262144) != 0) {
                        d1.k kVar3 = kVar2;
                        o0.e eVar = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof c2) {
                                c2 c2Var = (c2) kVar3;
                                if (!(obj.equals(c2Var.d()) ? ((Boolean) function1.invoke(c2Var)).booleanValue() : true)) {
                                    return;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                if (((kVar3.f3307i & 262144) != 0) && (kVar3 instanceof j)) {
                                    int i3 = 0;
                                    for (d1.k kVar4 = ((j) kVar3).D; kVar4 != null; kVar4 = kVar4.f3310t) {
                                        if ((kVar4.f3307i & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                kVar3 = kVar4;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar3 != null) {
                                                    eVar.b(kVar3);
                                                    kVar3 = null;
                                                }
                                                eVar.b(kVar4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                            }
                            kVar3 = e(eVar);
                        }
                    }
                    kVar2 = kVar2.f3309s;
                }
            }
            u2 = u2.s();
            kVar2 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [c2.c2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void y(c2 c2Var, Function1 function1) {
        d1.k kVar = (d1.k) c2Var;
        if (!kVar.f3305d.B) {
            z1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new d1.k[16]);
        d1.k kVar2 = kVar.f3305d;
        d1.k kVar3 = kVar2.f3310t;
        if (kVar3 == null) {
            b(eVar, kVar2);
        } else {
            eVar.b(kVar3);
        }
        while (true) {
            int i3 = eVar.f7319i;
            if (i3 == 0) {
                return;
            }
            d1.k kVar4 = (d1.k) eVar.l(i3 - 1);
            if ((kVar4.f3308r & 262144) != 0) {
                for (d1.k kVar5 = kVar4; kVar5 != null && kVar5.B; kVar5 = kVar5.f3310t) {
                    if ((kVar5.f3307i & 262144) != 0) {
                        j jVar = kVar5;
                        ?? r72 = 0;
                        while (jVar != 0) {
                            if (jVar instanceof c2) {
                                c2 c2Var2 = (c2) jVar;
                                b2 b2Var = (Intrinsics.a(c2Var.d(), c2Var2.d()) && c2Var.getClass() == c2Var2.getClass()) ? (b2) function1.invoke(c2Var2) : b2.f1499d;
                                if (b2Var == b2.f1501i) {
                                    return;
                                }
                                if (b2Var == b2.f1500e) {
                                    break;
                                }
                            } else if ((jVar.f3307i & 262144) != 0 && (jVar instanceof j)) {
                                d1.k kVar6 = jVar.D;
                                int i10 = 0;
                                jVar = jVar;
                                r72 = r72;
                                while (kVar6 != null) {
                                    if ((kVar6.f3307i & 262144) != 0) {
                                        i10++;
                                        r72 = r72;
                                        if (i10 == 1) {
                                            jVar = kVar6;
                                        } else {
                                            if (r72 == 0) {
                                                r72 = new o0.e(new d1.k[16]);
                                            }
                                            if (jVar != 0) {
                                                r72.b(jVar);
                                                jVar = 0;
                                            }
                                            r72.b(kVar6);
                                        }
                                    }
                                    kVar6 = kVar6.f3310t;
                                    jVar = jVar;
                                    r72 = r72;
                                }
                                if (i10 == 1) {
                                }
                            }
                            jVar = e(r72);
                        }
                    }
                }
            }
            b(eVar, kVar4);
        }
    }
}
