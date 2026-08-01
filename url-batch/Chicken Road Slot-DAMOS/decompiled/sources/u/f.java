package u;

import java.util.ListIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n0.j1;
import n0.s1;
import s.p0;
import v.t0;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final long f9507a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f9508b = 0;

    static {
        long j = Integer.MIN_VALUE;
        f9507a = (j & 4294967295L) | (j << 32);
    }

    public static final void a(z0 z0Var, d1.l lVar, Function1 function1, d1.d dVar, Function1 function12, x0.d dVar2, n0.i0 i0Var, int i3) {
        int i10;
        Function1 function13;
        n0.i0 i0Var2;
        c1.b bVar;
        o oVar;
        b1.w wVar;
        o oVar2;
        t0 t0Var;
        Function1 function14 = function1;
        i0Var.X(511725103);
        if ((i3 & 6) == 0) {
            i10 = (i0Var.f(z0Var) ? 4 : 2) | i3;
        } else {
            i10 = i3;
        }
        if ((i3 & 48) == 0) {
            i10 |= i0Var.f(lVar) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i10 |= i0Var.h(function14) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i10 |= i0Var.f(dVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i10 |= i0Var.h(function12) ? 16384 : 8192;
        }
        x0.d dVar3 = dVar2;
        if ((196608 & i3) == 0) {
            i10 |= i0Var.h(dVar3) ? 131072 : 65536;
        }
        if (i0Var.O(i10 & 1, (74899 & i10) != 74898)) {
            int i11 = i10 & 14;
            boolean z10 = i11 == 4;
            Object L = i0Var.L();
            Object obj = n0.k.f6729a;
            if (z10 || L == obj) {
                L = new o(z0Var, dVar);
                i0Var.g0(L);
            }
            o oVar3 = (o) L;
            boolean z11 = i11 == 4;
            Object L2 = i0Var.L();
            Object obj2 = L2;
            if (z11 || L2 == obj) {
                Object[] objArr = {z0Var.f9917a.l()};
                b1.w wVar2 = new b1.w();
                wVar2.addAll(kotlin.collections.w.v(objArr));
                i0Var.g0(wVar2);
                obj2 = wVar2;
            }
            b1.w wVar3 = (b1.w) obj2;
            boolean z12 = i11 == 4;
            Object L3 = i0Var.L();
            if (z12 || L3 == obj) {
                long[] jArr = p0.f8356a;
                L3 = new s.h0();
                i0Var.g0(L3);
            }
            s.h0 h0Var = (s.h0) L3;
            c1.b bVar2 = z0Var.f9917a;
            j1 j1Var = z0Var.f9920d;
            if (!wVar3.contains(bVar2.l())) {
                wVar3.clear();
                wVar3.add(bVar2.l());
            }
            if (Intrinsics.a(bVar2.l(), j1Var.getValue())) {
                if (wVar3.size() != 1 || !Intrinsics.a(wVar3.get(0), bVar2.l())) {
                    wVar3.clear();
                    wVar3.add(bVar2.l());
                }
                if (h0Var.f8316e != 1 || h0Var.c(bVar2.l())) {
                    h0Var.a();
                }
                oVar3.f9537b = dVar;
            }
            if (Intrinsics.a(bVar2.l(), j1Var.getValue()) || wVar3.contains(j1Var.getValue())) {
                bVar = bVar2;
            } else {
                ListIterator listIterator = wVar3.listIterator();
                int i12 = 0;
                while (true) {
                    b1.d0 d0Var = (b1.d0) listIterator;
                    bVar = bVar2;
                    if (!d0Var.hasNext()) {
                        i12 = -1;
                        break;
                    } else {
                        if (Intrinsics.a(function12.invoke(d0Var.next()), function12.invoke(j1Var.getValue()))) {
                            break;
                        }
                        i12++;
                        bVar2 = bVar;
                    }
                }
                if (i12 == -1) {
                    wVar3.add(j1Var.getValue());
                } else {
                    wVar3.set(i12, j1Var.getValue());
                }
            }
            if (h0Var.c(j1Var.getValue()) && h0Var.c(bVar.l())) {
                i0Var.W(1968995539);
                i0Var.p(false);
                function13 = function14;
                oVar = oVar3;
            } else {
                i0Var.W(1966410449);
                h0Var.a();
                int size = wVar3.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj3 = wVar3.get(i13);
                    h0Var.m(obj3, x0.i.d(-23915175, new c(z0Var, obj3, function14, oVar3, wVar3, dVar3), i0Var));
                    i13++;
                    function14 = function14;
                    dVar3 = dVar2;
                }
                function13 = function14;
                oVar = oVar3;
                i0Var.p(false);
            }
            boolean f3 = i0Var.f(z0Var.f()) | i0Var.f(oVar);
            Object L4 = i0Var.L();
            if (f3 || L4 == obj) {
                L4 = (v) function13.invoke(oVar);
                i0Var.g0(L4);
            }
            v vVar = (v) L4;
            z0 z0Var2 = oVar.f9536a;
            boolean f10 = i0Var.f(oVar);
            Object L5 = i0Var.L();
            if (f10 || L5 == obj) {
                L5 = n0.h.r(Boolean.FALSE);
                i0Var.g0(L5);
            }
            n0.z0 z0Var3 = (n0.z0) L5;
            n0.z0 v10 = n0.h.v(vVar.f9554d, i0Var);
            if (Intrinsics.a(z0Var2.f9917a.l(), z0Var2.f9920d.getValue())) {
                z0Var3.setValue(Boolean.FALSE);
            } else if (v10.getValue() != null) {
                z0Var3.setValue(Boolean.TRUE);
            }
            boolean booleanValue = ((Boolean) z0Var3.getValue()).booleanValue();
            d1.l lVar2 = d1.i.f3304a;
            if (booleanValue) {
                i0Var.W(1353077497);
                o oVar4 = oVar;
                wVar = wVar3;
                oVar2 = oVar4;
                i0Var2 = i0Var;
                t0Var = v.c.d(oVar4.f9536a, v.c.f9761r, null, i0Var2, 0, 2);
                boolean f11 = i0Var2.f(t0Var);
                Object L6 = i0Var2.L();
                if (f11 || L6 == obj) {
                    L6 = h1.d.a(lVar2);
                    i0Var2.g0(L6);
                }
                lVar2 = (d1.l) L6;
                i0Var2.p(false);
            } else {
                wVar = wVar3;
                i0Var2 = i0Var;
                oVar2 = oVar;
                i0Var2.W(1353343539);
                i0Var2.p(false);
                t0Var = null;
            }
            d1.l c10 = lVar.c(lVar2.c(new k(t0Var, v10, oVar2)));
            Object L7 = i0Var2.L();
            if (L7 == obj) {
                L7 = new h(oVar2);
                i0Var2.g0(L7);
            }
            h hVar = (h) L7;
            int hashCode = Long.hashCode(i0Var2.T);
            x0.h l10 = i0Var2.l();
            d1.l C = z4.w.C(c10, i0Var2);
            c2.g.f1541a.getClass();
            c2.z zVar = c2.f.f1533b;
            i0Var2.Z();
            if (i0Var2.S) {
                i0Var2.k(zVar);
            } else {
                i0Var2.j0();
            }
            n0.h.y(hVar, c2.f.f1536e, i0Var2);
            n0.h.y(l10, c2.f.f1535d, i0Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            c2.e eVar = c2.f.f1537f;
            if (i0Var2.S) {
                i0Var2.b(valueOf, eVar);
            }
            n0.h.t(i0Var2, c2.f.g);
            n0.h.y(C, c2.f.f1534c, i0Var2);
            i0Var2.W(-860173498);
            int size2 = wVar.size();
            int i14 = 0;
            while (i14 < size2) {
                b1.w wVar4 = wVar;
                Object obj4 = wVar4.get(i14);
                i0Var2.S(-2026002954, 0, function12.invoke(obj4), null);
                Function2 function2 = (Function2) h0Var.g(obj4);
                if (function2 == null) {
                    i0Var2.W(1618454323);
                } else {
                    i0Var2.W(-2026001778);
                    function2.invoke(i0Var2, 0);
                }
                i0Var2.p(false);
                i0Var2.p(false);
                i14++;
                wVar = wVar4;
            }
            i0Var2.p(false);
            i0Var2.p(true);
        } else {
            function13 = function14;
            i0Var2 = i0Var;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new d(z0Var, lVar, function13, dVar, function12, dVar2, i3);
        }
    }
}
