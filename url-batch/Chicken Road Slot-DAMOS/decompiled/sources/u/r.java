package u;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import n0.j1;
import n0.k2;
import n0.s1;
import v.t0;
import v.z0;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class r {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(z0 z0Var, Function1 function1, d1.l lVar, h0 h0Var, i0 i0Var, Function2 function2, x0.d dVar, n0.i0 i0Var2, int i3) {
        x0.d dVar2;
        c1.b bVar;
        i0 i0Var3;
        boolean f3;
        Object L;
        Object L2;
        n0.z0 z0Var2;
        boolean h10;
        Object L3;
        Object l10;
        w wVar;
        boolean z10;
        Object L4;
        Object L5;
        m0 m0Var;
        m0 m0Var2;
        boolean z11;
        t0 t0Var;
        boolean h11;
        Object L6;
        h0 h0Var2;
        i0 i0Var4;
        boolean g;
        Object L7;
        Object L8;
        boolean z12;
        i0Var2.X(1912839215);
        int i10 = i3 | (i0Var2.f(z0Var) ? 4 : 2) | (i0Var2.h(function1) ? 32 : 16) | (i0Var2.f(lVar) ? 256 : 128) | (i0Var2.f(h0Var) ? 2048 : 1024) | (i0Var2.f(i0Var) ? 16384 : 8192) | (i0Var2.h(function2) ? 131072 : 65536) | 1572864;
        if (i0Var2.O(i10 & 1, (4793491 & i10) != 4793490)) {
            j1 j1Var = z0Var.f9920d;
            c1.b bVar2 = z0Var.f9917a;
            if (((Boolean) function1.invoke(j1Var.getValue())).booleanValue() || ((Boolean) function1.invoke(bVar2.l())).booleanValue() || z0Var.g() || z0Var.d()) {
                i0Var2.W(-232386135);
                int i11 = i10 & 14;
                int i12 = i11 | 48;
                int i13 = i12 & 14;
                boolean z13 = ((i13 ^ 6) > 4 && i0Var2.f(z0Var)) || (i12 & 6) == 4;
                Object L9 = i0Var2.L();
                Object obj = n0.k.f6729a;
                if (z13 || L9 == obj) {
                    L9 = bVar2.l();
                    i0Var2.g0(L9);
                }
                if (z0Var.g()) {
                    L9 = bVar2.l();
                }
                i0Var2.W(1844425648);
                w b10 = b(z0Var, function1, L9, i0Var2);
                i0Var2.p(false);
                Object value = z0Var.f9920d.getValue();
                i0Var2.W(1844425648);
                w b11 = b(z0Var, function1, value, i0Var2);
                i0Var2.p(false);
                int i14 = i13 | 3072;
                int i15 = (i14 & 14) ^ 6;
                boolean z14 = (i15 > 4 && i0Var2.f(z0Var)) || (i14 & 6) == 4;
                Object L10 = i0Var2.L();
                if (z14 || L10 == obj) {
                    L10 = new z0(new v.t(b10), z0Var, z0Var.f9919c.concat(" > EnterExitTransition"));
                    i0Var2.g0(L10);
                }
                z0 z0Var3 = (z0) L10;
                boolean f10 = ((i15 > 4 && i0Var2.f(z0Var)) || (i14 & 6) == 4) | i0Var2.f(z0Var3);
                Object L11 = i0Var2.L();
                if (f10 || L11 == obj) {
                    L11 = new b0.l0(20, z0Var, z0Var3);
                    i0Var2.g0(L11);
                }
                n0.h.d(z0Var3, (Function1) L11, i0Var2);
                if (z0Var.g()) {
                    z0Var3.k(b10, b11);
                } else {
                    z0Var3.p(b11);
                    z0Var3.f9925k.setValue(Boolean.FALSE);
                }
                c6.s sVar = d0.f9498a;
                boolean f11 = i0Var2.f(z0Var3);
                Object L12 = i0Var2.L();
                if (f11 || L12 == obj) {
                    L12 = n0.h.r(h0Var);
                    i0Var2.g0(L12);
                }
                n0.z0 z0Var4 = (n0.z0) L12;
                c1.b bVar3 = z0Var3.f9917a;
                c1.b bVar4 = z0Var3.f9917a;
                j1 j1Var2 = z0Var3.f9920d;
                if (bVar3.l() == j1Var2.getValue() && bVar4.l() == w.f9556e) {
                    if (z0Var3.g()) {
                        z0Var4.setValue(h0Var);
                    } else {
                        z0Var4.setValue(h0.f9516b);
                    }
                } else if (j1Var2.getValue() == w.f9556e) {
                    m0 m0Var3 = ((h0) z0Var4.getValue()).f9517a;
                    m0 m0Var4 = h0Var.f9517a;
                    j0 j0Var = m0Var4.f9533a;
                    if (j0Var == null) {
                        j0Var = m0Var3.f9533a;
                    }
                    Map map = m0Var3.f9535c;
                    Map map2 = m0Var4.f9535c;
                    map.getClass();
                    map2.getClass();
                    LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                    linkedHashMap.putAll(map2);
                    z0Var4.setValue(new h0(new m0(j0Var, (r) null, linkedHashMap, 32)));
                }
                h0 h0Var3 = (h0) z0Var4.getValue();
                boolean f12 = i0Var2.f(z0Var3);
                Object L13 = i0Var2.L();
                if (f12 || L13 == obj) {
                    L13 = n0.h.r(i0Var);
                    i0Var2.g0(L13);
                }
                n0.z0 z0Var5 = (n0.z0) L13;
                if (bVar4.l() == j1Var2.getValue() && bVar4.l() == w.f9556e) {
                    if (z0Var3.g()) {
                        z0Var5.setValue(i0Var);
                    } else {
                        z0Var5.setValue(i0.f9518b);
                    }
                } else if (j1Var2.getValue() != w.f9556e) {
                    m0 m0Var5 = ((i0) z0Var5.getValue()).f9520a;
                    m0 m0Var6 = i0Var.f9520a;
                    j0 j0Var2 = m0Var6.f9533a;
                    if (j0Var2 == null) {
                        j0Var2 = m0Var5.f9533a;
                    }
                    boolean z15 = m0Var6.f9534b || m0Var5.f9534b;
                    Map map3 = m0Var5.f9535c;
                    Map map4 = m0Var6.f9535c;
                    map3.getClass();
                    map4.getClass();
                    bVar = bVar4;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(map3);
                    linkedHashMap2.putAll(map4);
                    z0Var5.setValue(new i0(new m0(j0Var2, (r) null, z15, linkedHashMap2)));
                    i0Var3 = (i0) z0Var5.getValue();
                    Object v10 = n0.h.v(function2, i0Var2);
                    Object invoke = function2.invoke(bVar.l(), j1Var2.getValue());
                    f3 = i0Var2.f(z0Var3) | i0Var2.f(v10);
                    L = i0Var2.L();
                    t0 t0Var2 = null;
                    if (!f3 || L == obj) {
                        L = new b5.t(z0Var3, v10, null == true ? 1 : 0, 11);
                        i0Var2.g0(L);
                    }
                    Function2 function22 = (Function2) L;
                    L2 = i0Var2.L();
                    if (L2 == obj) {
                        L2 = n0.h.r(invoke);
                        i0Var2.g0(L2);
                    }
                    z0Var2 = (n0.z0) L2;
                    Unit unit = Unit.f5554a;
                    h10 = i0Var2.h(function22);
                    L3 = i0Var2.L();
                    if (!h10 || L3 == obj) {
                        L3 = new k2(function22, z0Var2, null == true ? 1 : 0, 0);
                        i0Var2.g0(L3);
                    }
                    n0.h.f(unit, (Function2) L3, i0Var2);
                    l10 = bVar.l();
                    wVar = w.f9557i;
                    if (l10 != wVar && j1Var2.getValue() == wVar && ((Boolean) z0Var2.getValue()).booleanValue()) {
                        i0Var2.W(-229368781);
                        z12 = false;
                        i0Var2.p(false);
                        dVar2 = dVar;
                    } else {
                        i0Var2.W(-230699766);
                        z10 = i11 != 4;
                        L4 = i0Var2.L();
                        if (!z10 || L4 == obj) {
                            L4 = new t();
                            i0Var2.g0(L4);
                        }
                        t tVar = (t) L4;
                        L5 = i0Var2.L();
                        if (L5 == obj) {
                            L5 = b0.f9482d;
                            i0Var2.g0(L5);
                        }
                        Function0 function0 = (Function0) L5;
                        i0Var2.W(-167964673);
                        i0Var2.p(false);
                        i0Var2.W(-167961890);
                        i0Var2.p(false);
                        m0Var = h0Var3.f9517a;
                        m0Var2 = i0Var3.f9520a;
                        i0Var2.W(-911382324);
                        i0Var2.p(false);
                        i0Var2.W(-911179709);
                        i0Var2.p(false);
                        i0Var2.W(-910935677);
                        i0Var2.p(false);
                        float[] fArr = l1.d.f5758a;
                        i0Var2.W(-910130296);
                        i0Var2.p(false);
                        c6.s sVar2 = v.c.f9754k;
                        if (m0Var.f9533a == null || m0Var2.f9533a != null) {
                            z11 = false;
                            i0Var2.W(-703709976);
                            i0Var2.p(false);
                            t0Var = null;
                        } else {
                            i0Var2.W(-703879421);
                            Object L14 = i0Var2.L();
                            if (L14 == obj) {
                                L14 = "Built-in alpha";
                                i0Var2.g0("Built-in alpha");
                            }
                            t0Var = v.c.d(z0Var3, sVar2, (String) L14, i0Var2, 384, 0);
                            z11 = false;
                            i0Var2.p(false);
                        }
                        i0Var2.W(-703472888);
                        i0Var2.p(z11);
                        i0Var2.W(-703222904);
                        i0Var2.p(z11);
                        h11 = i0Var2.h(t0Var) | i0Var2.f(h0Var3) | i0Var2.f(i0Var3) | i0Var2.h(null) | i0Var2.f(z0Var3) | i0Var2.h(null);
                        L6 = i0Var2.L();
                        if (!h11 || L6 == obj) {
                            h0Var2 = h0Var3;
                            L6 = new y(t0Var, t0Var2, z0Var3, h0Var2, i0Var3, null == true ? 1 : 0);
                            i0Var4 = i0Var3;
                            i0Var2.g0(L6);
                        } else {
                            h0Var2 = h0Var3;
                            i0Var4 = i0Var3;
                        }
                        y yVar = (y) L6;
                        g = i0Var2.g(true) | i0Var2.f(function0);
                        L7 = i0Var2.L();
                        if (!g || L7 == obj) {
                            L7 = new c0(true, function0);
                            i0Var2.g0(L7);
                        }
                        d1.l c10 = k1.v.j((Function1) L7).c(new x(z0Var3, h0Var2, i0Var4, function0, yVar));
                        d1.i iVar = d1.i.f3304a;
                        d1.l c11 = c10.c(iVar);
                        i0Var2.W(-7404393);
                        i0Var2.p(false);
                        d1.l c12 = lVar.c(c11.c(iVar));
                        L8 = i0Var2.L();
                        if (L8 == obj) {
                            L8 = new p(tVar);
                            i0Var2.g0(L8);
                        }
                        p pVar = (p) L8;
                        int hashCode = Long.hashCode(i0Var2.T);
                        x0.h l11 = i0Var2.l();
                        d1.l C = z4.w.C(c12, i0Var2);
                        c2.g.f1541a.getClass();
                        Function0 function02 = c2.f.f1533b;
                        i0Var2.Z();
                        if (i0Var2.S) {
                            i0Var2.j0();
                        } else {
                            i0Var2.k(function02);
                        }
                        n0.h.y(pVar, c2.f.f1536e, i0Var2);
                        n0.h.y(l11, c2.f.f1535d, i0Var2);
                        Object valueOf = Integer.valueOf(hashCode);
                        Function2 function23 = c2.f.f1537f;
                        if (i0Var2.S) {
                            i0Var2.b(valueOf, function23);
                        }
                        n0.h.t(i0Var2, c2.f.g);
                        n0.h.y(C, c2.f.f1534c, i0Var2);
                        dVar2 = dVar;
                        dVar2.a(tVar, i0Var2, 48);
                        i0Var2.p(true);
                        z12 = false;
                        i0Var2.p(false);
                    }
                    i0Var2.p(z12);
                }
                bVar = bVar4;
                i0Var3 = (i0) z0Var5.getValue();
                Object v102 = n0.h.v(function2, i0Var2);
                Object invoke2 = function2.invoke(bVar.l(), j1Var2.getValue());
                f3 = i0Var2.f(z0Var3) | i0Var2.f(v102);
                L = i0Var2.L();
                t0 t0Var22 = null;
                if (!f3) {
                }
                L = new b5.t(z0Var3, v102, null == true ? 1 : 0, 11);
                i0Var2.g0(L);
                Function2 function222 = (Function2) L;
                L2 = i0Var2.L();
                if (L2 == obj) {
                }
                z0Var2 = (n0.z0) L2;
                Unit unit2 = Unit.f5554a;
                h10 = i0Var2.h(function222);
                L3 = i0Var2.L();
                if (!h10) {
                }
                L3 = new k2(function222, z0Var2, null == true ? 1 : 0, 0);
                i0Var2.g0(L3);
                n0.h.f(unit2, (Function2) L3, i0Var2);
                l10 = bVar.l();
                wVar = w.f9557i;
                if (l10 != wVar) {
                }
                i0Var2.W(-230699766);
                if (i11 != 4) {
                }
                L4 = i0Var2.L();
                if (!z10) {
                }
                L4 = new t();
                i0Var2.g0(L4);
                t tVar2 = (t) L4;
                L5 = i0Var2.L();
                if (L5 == obj) {
                }
                Function0 function03 = (Function0) L5;
                i0Var2.W(-167964673);
                i0Var2.p(false);
                i0Var2.W(-167961890);
                i0Var2.p(false);
                m0Var = h0Var3.f9517a;
                m0Var2 = i0Var3.f9520a;
                i0Var2.W(-911382324);
                i0Var2.p(false);
                i0Var2.W(-911179709);
                i0Var2.p(false);
                i0Var2.W(-910935677);
                i0Var2.p(false);
                float[] fArr2 = l1.d.f5758a;
                i0Var2.W(-910130296);
                i0Var2.p(false);
                c6.s sVar22 = v.c.f9754k;
                if (m0Var.f9533a == null || m0Var2.f9533a != null) {
                }
                i0Var2.W(-703472888);
                i0Var2.p(z11);
                i0Var2.W(-703222904);
                i0Var2.p(z11);
                h11 = i0Var2.h(t0Var) | i0Var2.f(h0Var3) | i0Var2.f(i0Var3) | i0Var2.h(null) | i0Var2.f(z0Var3) | i0Var2.h(null);
                L6 = i0Var2.L();
                if (h11) {
                }
                h0Var2 = h0Var3;
                L6 = new y(t0Var, t0Var22, z0Var3, h0Var2, i0Var3, null == true ? 1 : 0);
                i0Var4 = i0Var3;
                i0Var2.g0(L6);
                y yVar2 = (y) L6;
                g = i0Var2.g(true) | i0Var2.f(function03);
                L7 = i0Var2.L();
                if (!g) {
                }
                L7 = new c0(true, function03);
                i0Var2.g0(L7);
                d1.l c102 = k1.v.j((Function1) L7).c(new x(z0Var3, h0Var2, i0Var4, function03, yVar2));
                d1.i iVar2 = d1.i.f3304a;
                d1.l c112 = c102.c(iVar2);
                i0Var2.W(-7404393);
                i0Var2.p(false);
                d1.l c122 = lVar.c(c112.c(iVar2));
                L8 = i0Var2.L();
                if (L8 == obj) {
                }
                p pVar2 = (p) L8;
                int hashCode2 = Long.hashCode(i0Var2.T);
                x0.h l112 = i0Var2.l();
                d1.l C2 = z4.w.C(c122, i0Var2);
                c2.g.f1541a.getClass();
                Function0 function022 = c2.f.f1533b;
                i0Var2.Z();
                if (i0Var2.S) {
                }
                n0.h.y(pVar2, c2.f.f1536e, i0Var2);
                n0.h.y(l112, c2.f.f1535d, i0Var2);
                Object valueOf2 = Integer.valueOf(hashCode2);
                Function2 function232 = c2.f.f1537f;
                if (i0Var2.S) {
                }
                n0.h.t(i0Var2, c2.f.g);
                n0.h.y(C2, c2.f.f1534c, i0Var2);
                dVar2 = dVar;
                dVar2.a(tVar2, i0Var2, 48);
                i0Var2.p(true);
                z12 = false;
                i0Var2.p(false);
                i0Var2.p(z12);
            } else {
                i0Var2.W(-229362829);
                i0Var2.p(false);
                dVar2 = dVar;
            }
        } else {
            dVar2 = dVar;
            i0Var2.R();
        }
        s1 r9 = i0Var2.r();
        if (r9 != null) {
            r9.f6812d = new q(z0Var, function1, lVar, h0Var, i0Var, function2, dVar2, i3);
        }
    }

    public static final w b(z0 z0Var, Function1 function1, Object obj, n0.i0 i0Var) {
        w wVar;
        i0Var.S(-422486745, 0, z0Var, null);
        boolean g = z0Var.g();
        c1.b bVar = z0Var.f9917a;
        if (g) {
            i0Var.W(-212166497);
            i0Var.p(false);
            wVar = ((Boolean) function1.invoke(obj)).booleanValue() ? w.f9556e : ((Boolean) function1.invoke(bVar.l())).booleanValue() ? w.f9557i : w.f9555d;
        } else {
            i0Var.W(-211892364);
            Object L = i0Var.L();
            if (L == n0.k.f6729a) {
                L = n0.h.r(Boolean.FALSE);
                i0Var.g0(L);
            }
            n0.z0 z0Var2 = (n0.z0) L;
            if (((Boolean) function1.invoke(bVar.l())).booleanValue()) {
                z0Var2.setValue(Boolean.TRUE);
            }
            wVar = ((Boolean) function1.invoke(obj)).booleanValue() ? w.f9556e : ((Boolean) z0Var2.getValue()).booleanValue() ? w.f9557i : w.f9555d;
            i0Var.p(false);
        }
        i0Var.p(false);
        return wVar;
    }
}
