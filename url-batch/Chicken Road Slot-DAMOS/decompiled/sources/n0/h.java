package n0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final x0.d f6685a = new x0.d(954879418, false, new m2.t(24));

    /* renamed from: b, reason: collision with root package name */
    public static final x0.d f6686b = new x0.d(1918065384, false, new m2.t(25));

    /* renamed from: c, reason: collision with root package name */
    public static final Object f6687c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public static final b0 f6688d = new b0();

    /* renamed from: e, reason: collision with root package name */
    public static final c2.y f6689e = new c2.y(2);

    public static final x0.h A(q1[] q1VarArr, x0.h hVar, x0.h hVar2) {
        x0.g gVar = new x0.g(x0.h.f10234u);
        for (q1 q1Var : q1VarArr) {
            p1 p1Var = q1Var.f6793a;
            if (q1Var.f6798f || !hVar.containsKey(p1Var)) {
                gVar.put(p1Var, p1Var.c(q1Var, (p2) hVar2.get(p1Var)));
            }
        }
        return gVar.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(q1 q1Var, x0.d dVar, i0 i0Var, int i3) {
        p2 p2Var;
        boolean z10;
        s1 r9;
        i0Var.X(-149765515);
        c2.r rVar = i0Var.f6719x;
        x0.h l10 = i0Var.l();
        i0Var.U(201, m.f6752b);
        Object L = i0Var.L();
        if (Intrinsics.a(L, k.f6729a)) {
            p2Var = null;
        } else {
            L.getClass();
            p2Var = (p2) L;
        }
        p1 p1Var = q1Var.f6793a;
        p2 c10 = p1Var.c(q1Var, p2Var);
        boolean equals = c10.equals(p2Var);
        if (!equals) {
            i0Var.g0(c10);
        }
        if (i0Var.S) {
            if (q1Var.f6798f || !l10.containsKey(p1Var)) {
                l10 = l10.g(p1Var, c10);
            }
            i0Var.J = true;
        } else {
            q0.g gVar = i0Var.G;
            Object b10 = gVar.b(gVar.f7735b, gVar.g);
            b10.getClass();
            x0.h hVar = (x0.h) b10;
            if (!(i0Var.A() && equals) && (q1Var.f6798f || !l10.containsKey(p1Var))) {
                l10 = l10.g(p1Var, c10);
            } else if ((equals && !i0Var.f6718w) || !i0Var.f6718w) {
                l10 = hVar;
            }
            if (i0Var.f6720y || hVar != l10) {
                z10 = true;
                if (z10 && !i0Var.S) {
                    i0Var.J(l10);
                }
                rVar.c(i0Var.f6718w ? 1 : 0);
                i0Var.f6718w = z10;
                i0Var.K = l10;
                i0Var.S(202, 0, m.f6753c, l10);
                dVar.invoke(i0Var, Integer.valueOf((i3 >> 3) & 14));
                i0Var.p(false);
                i0Var.p(false);
                i0Var.f6718w = rVar.b() != 0;
                i0Var.K = null;
                r9 = i0Var.r();
                if (r9 == null) {
                    r9.f6812d = new r(q1Var, dVar, i3, 0);
                    return;
                }
                return;
            }
        }
        z10 = false;
        if (z10) {
            i0Var.J(l10);
        }
        rVar.c(i0Var.f6718w ? 1 : 0);
        i0Var.f6718w = z10;
        i0Var.K = l10;
        i0Var.S(202, 0, m.f6753c, l10);
        dVar.invoke(i0Var, Integer.valueOf((i3 >> 3) & 14));
        i0Var.p(false);
        i0Var.p(false);
        i0Var.f6718w = rVar.b() != 0;
        i0Var.K = null;
        r9 = i0Var.r();
        if (r9 == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(q1[] q1VarArr, Function2 function2, i0 i0Var, int i3) {
        x0.h f02;
        boolean z10;
        s1 r9;
        i0Var.X(415205898);
        c2.r rVar = i0Var.f6719x;
        x0.h l10 = i0Var.l();
        i0Var.U(201, m.f6752b);
        if (i0Var.S) {
            f02 = i0Var.f0(l10, A(q1VarArr, l10, x0.h.f10234u));
            i0Var.J = true;
        } else {
            q0.g gVar = i0Var.G;
            Object h10 = gVar.h(gVar.g, 0);
            h10.getClass();
            x0.h hVar = (x0.h) h10;
            q0.g gVar2 = i0Var.G;
            Object h11 = gVar2.h(gVar2.g, 1);
            h11.getClass();
            x0.h hVar2 = (x0.h) h11;
            x0.h A = A(q1VarArr, l10, hVar2);
            if (i0Var.A() && !i0Var.f6720y && hVar2.equals(A)) {
                i0Var.f6707l = i0Var.G.s() + i0Var.f6707l;
                f02 = hVar;
            } else {
                f02 = i0Var.f0(l10, A);
                if (i0Var.f6720y || !Intrinsics.a(f02, hVar)) {
                    z10 = true;
                    if (z10 && !i0Var.S) {
                        i0Var.J(f02);
                    }
                    rVar.c(i0Var.f6718w ? 1 : 0);
                    i0Var.f6718w = z10;
                    i0Var.K = f02;
                    i0Var.S(202, 0, m.f6753c, f02);
                    function2.invoke(i0Var, Integer.valueOf((i3 >> 3) & 14));
                    i0Var.p(false);
                    i0Var.p(false);
                    i0Var.f6718w = rVar.b() != 0;
                    i0Var.K = null;
                    r9 = i0Var.r();
                    if (r9 == null) {
                        r9.f6812d = new r(q1VarArr, function2, i3, 1);
                        return;
                    }
                    return;
                }
            }
        }
        z10 = false;
        if (z10) {
            i0Var.J(f02);
        }
        rVar.c(i0Var.f6718w ? 1 : 0);
        i0Var.f6718w = z10;
        i0Var.K = f02;
        i0Var.S(202, 0, m.f6753c, f02);
        function2.invoke(i0Var, Integer.valueOf((i3 >> 3) & 14));
        i0Var.p(false);
        i0Var.p(false);
        i0Var.f6718w = rVar.b() != 0;
        i0Var.K = null;
        r9 = i0Var.r();
        if (r9 == null) {
        }
    }

    public static final void c(Object obj, Object obj2, Function1 function1, i0 i0Var) {
        boolean f3 = i0Var.f(obj) | i0Var.f(obj2);
        Object L = i0Var.L();
        if (f3 || L == k.f6729a) {
            L = new z(function1);
            i0Var.g0(L);
        }
    }

    public static final void d(Object obj, Function1 function1, i0 i0Var) {
        boolean f3 = i0Var.f(obj);
        Object L = i0Var.L();
        if (f3 || L == k.f6729a) {
            L = new z(function1);
            i0Var.g0(L);
        }
    }

    public static final void e(Object obj, Object obj2, Function2 function2, i0 i0Var) {
        CoroutineContext coroutineContext = i0Var.R;
        boolean f3 = i0Var.f(obj) | i0Var.f(obj2);
        Object L = i0Var.L();
        if (f3 || L == k.f6729a) {
            L = new q0(coroutineContext, function2);
            i0Var.g0(L);
        }
    }

    public static final void f(Object obj, Function2 function2, i0 i0Var) {
        CoroutineContext coroutineContext = i0Var.R;
        boolean f3 = i0Var.f(obj);
        Object L = i0Var.L();
        if (f3 || L == k.f6729a) {
            L = new q0(coroutineContext, function2);
            i0Var.g0(L);
        }
    }

    public static final void g(Function0 function0, i0 i0Var) {
        r0.k0 k0Var = i0Var.M.f8085b.f8082a;
        k0Var.l0(r0.a0.f8083c);
        z4.w.N(k0Var, 0, function0);
    }

    public static final void h(List list, int i3, int i10) {
        int p4 = p(i3, list);
        if (p4 < 0) {
            p4 = -(p4 + 1);
        }
        while (p4 < list.size() && ((n0) list.get(p4)).f6763b < i10) {
        }
    }

    public static void i(q0.k kVar, List list, q qVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i3 = 0; i3 < size; i3++) {
            int c10 = kVar.c((q0.b) list.get(i3));
            int N = kVar.N(kVar.f7761b, kVar.r(c10));
            Object obj = N < kVar.g(kVar.f7761b, kVar.r(c10 + 1)) ? kVar.f7762c[kVar.h(N)] : k.f6729a;
            s1 s1Var = obj instanceof s1 ? (s1) obj : null;
            if (s1Var != null) {
                s1Var.f6809a = qVar;
            }
        }
    }

    public static final z0 k(je.j0 j0Var, i0 i0Var) {
        Object obj = kotlin.coroutines.g.f5592d;
        Object value = j0Var.getValue();
        boolean h10 = i0Var.h(obj) | i0Var.h(j0Var);
        Object L = i0Var.L();
        ld.a aVar = null;
        Object obj2 = k.f6729a;
        if (h10 || L == obj2) {
            L = new b5.t(obj, j0Var, aVar, 6);
            i0Var.g0(L);
        }
        Function2 function2 = (Function2) L;
        Object L2 = i0Var.L();
        if (L2 == obj2) {
            L2 = r(value);
            i0Var.g0(L2);
        }
        z0 z0Var = (z0) L2;
        boolean h11 = i0Var.h(function2);
        Object L3 = i0Var.L();
        if (h11 || L3 == obj2) {
            L3 = new k2(function2, z0Var, aVar, 1);
            i0Var.g0(L3);
        }
        e(j0Var, obj, (Function2) L3, i0Var);
        return z0Var;
    }

    public static final void l(q0.g gVar, ArrayList arrayList, int i3) {
        boolean l10 = gVar.l(i3);
        int[] iArr = gVar.f7735b;
        if (l10) {
            arrayList.add(gVar.n(i3));
            return;
        }
        int i10 = iArr[(i3 * 5) + 3] + i3;
        for (int i11 = i3 + 1; i11 < i10; i11 += iArr[(i11 * 5) + 3]) {
            l(gVar, arrayList, i11);
        }
    }

    public static final ge.x m(kotlin.coroutines.g gVar, i0 i0Var) {
        gVar.getClass();
        return new c2(i0Var.R, gVar);
    }

    public static final o0.e n() {
        p.e eVar = j2.f6728b;
        o0.e eVar2 = (o0.e) eVar.get();
        if (eVar2 != null) {
            return eVar2;
        }
        o0.e eVar3 = new o0.e(new b1.z[0]);
        eVar.j(eVar3);
        return eVar3;
    }

    public static final y o(Function0 function0) {
        p.e eVar = j2.f6727a;
        return new y(function0);
    }

    public static final int p(int i3, List list) {
        int size = list.size() - 1;
        int i10 = 0;
        while (i10 <= size) {
            int i11 = (i10 + size) >>> 1;
            int b10 = Intrinsics.b(((n0) list.get(i11)).f6763b, i3);
            if (b10 < 0) {
                i10 = i11 + 1;
            } else {
                if (b10 <= 0) {
                    return i11;
                }
                size = i11 - 1;
            }
        }
        return -(i10 + 1);
    }

    public static final s0 q(CoroutineContext coroutineContext) {
        s0 s0Var = (s0) coroutineContext.m(e.f6659i);
        if (s0Var != null) {
            return s0Var;
        }
        kotlin.collections.i0.l("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static j1 r(Object obj) {
        return new j1(obj, e.f6663u);
    }

    public static final Object s(x0.h hVar, p1 p1Var) {
        p1Var.getClass();
        Object obj = hVar.get(p1Var);
        if (obj == null) {
            obj = p1Var.b();
        }
        return ((p2) obj).a(hVar);
    }

    public static final void t(i0 i0Var, Function1 function1) {
        i0Var.b(Unit.f5554a, new b1.y(7, function1));
    }

    public static final h0 u(i0 i0Var) {
        i0 i0Var2;
        i0Var.U(206, m.f6755e);
        if (i0Var.S) {
            q0.k.z(i0Var.I);
        }
        Object D = i0Var.D();
        l0 l0Var = D instanceof l0 ? (l0) D : null;
        if (l0Var == null) {
            i0Var2 = i0Var;
            l0Var = new d2(new g0(new h0(i0Var2, i0Var.T, i0Var.f6712q, i0Var.C, i0Var.f6704h.F)), -1);
            i0Var2.h0(l0Var);
        } else {
            i0Var2 = i0Var;
        }
        a2 a2Var = l0Var.f6745a;
        a2Var.getClass();
        h0 h0Var = ((g0) a2Var).f6682d;
        h0Var.f6695f.setValue(i0Var2.l());
        i0Var2.p(false);
        return h0Var;
    }

    public static final z0 v(Object obj, i0 i0Var) {
        Object L = i0Var.L();
        if (L == k.f6729a) {
            L = r(obj);
            i0Var.g0(L);
        }
        z0 z0Var = (z0) L;
        z0Var.setValue(obj);
        return z0Var;
    }

    public static final void w(q0.k kVar, int i3, Object obj) {
        int h10 = kVar.h(i3);
        Object[] objArr = kVar.f7762c;
        Object obj2 = objArr[h10];
        objArr[h10] = k.f6729a;
        if (obj == obj2) {
            return;
        }
        m.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final void y(Object obj, Function2 function2, i0 i0Var) {
        if (i0Var.S || !Intrinsics.a(i0Var.L(), obj)) {
            i0Var.g0(obj);
            i0Var.b(obj, function2);
        }
    }

    public static final int z(int i3) {
        int i10 = 306783378 & i3;
        int i11 = 613566756 & i3;
        return (i3 & (-920350135)) | (i11 >> 1) | i10 | ((i10 << 1) & i11);
    }

    public abstract void j();

    public abstract void x(a2.r rVar);
}
