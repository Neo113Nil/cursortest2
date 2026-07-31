package t0;

import I.C0174t;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import l.C0583i;
import n.t0;
import n.z0;
import n0.C0711i;
import n0.EnumC0712j;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import r0.InterfaceC0919p;
import r0.InterfaceC0921r;
import s.C0946o;
import s0.C0955a;
import s0.C0956b;
import s0.C0958d;
import s0.C0962h;
import s0.InterfaceC0957c;
import s0.InterfaceC0959e;
import s0.InterfaceC0960f;
import s0.InterfaceC0961g;
import t.C0976d;
import u0.C1123s;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990c extends U.p implements InterfaceC1009w, InterfaceC1002o, o0, m0, InterfaceC0959e, InterfaceC0961g, k0, InterfaceC1008v, InterfaceC1003p, Z.c, Z.n, Z.q, i0, Y.a {

    /* renamed from: q, reason: collision with root package name */
    public U.o f8723q;

    /* renamed from: r, reason: collision with root package name */
    public C0955a f8724r;

    /* renamed from: s, reason: collision with root package name */
    public HashSet f8725s;

    public final void A0() {
        if (this.f4501p) {
            this.f8725s.clear();
            ((C1123s) AbstractC0993f.u(this)).getSnapshotObserver().a(this, C0992e.f8728f, new C0989b(this, 1));
        }
    }

    @Override // t0.m0
    public final boolean B() {
        f2.j.d(this.f8723q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // t0.i0
    public final boolean L() {
        return this.f4501p;
    }

    @Override // t0.m0
    public final void N() {
        f2.j.d(this.f8723q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // t0.k0
    public final Object U(Object obj) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (C0583i) oVar;
    }

    @Override // t0.InterfaceC1002o
    public final void V() {
        AbstractC0993f.m(this);
    }

    @Override // t0.m0
    public final boolean W() {
        f2.j.d(this.f8723q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // Y.a
    public final O0.b a() {
        return AbstractC0993f.t(this).f8556t;
    }

    @Override // t0.InterfaceC1009w
    public final int b(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0921r) oVar).b(p3, interfaceC0884F, i3);
    }

    @Override // t0.InterfaceC1009w
    public final int c(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0921r) oVar).c(p3, interfaceC0884F, i3);
    }

    @Override // t0.InterfaceC1003p
    public final void c0(b0 b0Var) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C0976d c0976d = (C0976d) oVar;
        if (c0976d.f8473a) {
            return;
        }
        c0976d.f8473a = true;
        V1.k kVar = c0976d.f8474b;
        if (kVar != null) {
            kVar.u(R1.y.f4171a);
        }
        c0976d.f8474b = null;
    }

    @Override // Y.a
    public final long d() {
        return O2.d.f0(AbstractC0993f.r(this, 128).f8128f);
    }

    @Override // t0.InterfaceC1009w
    public final int e(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0921r) oVar).e(p3, interfaceC0884F, i3);
    }

    @Override // t0.InterfaceC1009w
    public final int f(P p3, InterfaceC0884F interfaceC0884F, int i3) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0921r) oVar).f(p3, interfaceC0884F, i3);
    }

    @Override // Z.n
    public final void f0(Z.k kVar) {
        z0.o("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0921r) oVar).g(interfaceC0887I, interfaceC0884F, j3);
    }

    @Override // t0.m0
    public final void g0(C0711i c0711i, EnumC0712j enumC0712j, long j3) {
        f2.j.d(this.f8723q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // Y.a
    public final O0.k getLayoutDirection() {
        return AbstractC0993f.t(this).f8557u;
    }

    @Override // t0.InterfaceC1002o
    public final void h(G g3) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((Y.e) oVar).h(g3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [e2.a, f2.k] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [U.p] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // s0.InterfaceC0959e, s0.InterfaceC0961g
    public final Object i(C0962h c0962h) {
        C0174t c0174t;
        this.f8725s.add(c0962h);
        U.p pVar = this.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar2 = pVar.f4493h;
        E t3 = AbstractC0993f.t(this);
        while (t3 != null) {
            if ((((U.p) t3.f8561y.f2915f).f4492g & 32) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f4491f & 32) != 0) {
                        AbstractC1000m abstractC1000m = pVar2;
                        ?? r4 = 0;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof InterfaceC0959e) {
                                InterfaceC0959e interfaceC0959e = (InterfaceC0959e) abstractC1000m;
                                if (interfaceC0959e.m().g(c0962h)) {
                                    return interfaceC0959e.m().j(c0962h);
                                }
                            } else if ((abstractC1000m.f4491f & 32) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                U.p pVar3 = abstractC1000m.f8771r;
                                int i3 = 0;
                                abstractC1000m = abstractC1000m;
                                r4 = r4;
                                while (pVar3 != null) {
                                    if ((pVar3.f4491f & 32) != 0) {
                                        i3++;
                                        r4 = r4;
                                        if (i3 == 1) {
                                            abstractC1000m = pVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new K.d(new U.p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r4.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r4.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r4 = r4;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1000m = AbstractC0993f.f(r4);
                        }
                    }
                    pVar2 = pVar2.f4493h;
                }
            }
            t3 = t3.s();
            pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
        return c0962h.f8351a.b();
    }

    @Override // t0.o0
    public final void j(A0.i iVar) {
        U.o oVar = this.f8723q;
        f2.j.d(oVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        A0.i k3 = ((A0.j) oVar).k();
        f2.j.d(iVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (k3.f130e) {
            iVar.f130e = true;
        }
        if (k3.f131f) {
            iVar.f131f = true;
        }
        for (Map.Entry entry : k3.f129d.entrySet()) {
            A0.v vVar = (A0.v) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = iVar.f129d;
            if (!linkedHashMap.containsKey(vVar)) {
                linkedHashMap.put(vVar, value);
            } else if (value instanceof A0.a) {
                Object obj = linkedHashMap.get(vVar);
                f2.j.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                A0.a aVar = (A0.a) obj;
                String str = aVar.f88a;
                if (str == null) {
                    str = ((A0.a) value).f88a;
                }
                R1.e eVar = aVar.f89b;
                if (eVar == null) {
                    eVar = ((A0.a) value).f89b;
                }
                linkedHashMap.put(vVar, new A0.a(str, eVar));
            }
        }
    }

    @Override // s0.InterfaceC0959e
    public final t0 m() {
        C0955a c0955a = this.f8724r;
        return c0955a != null ? c0955a : C0956b.f8344a;
    }

    @Override // U.p
    public final void q0() {
        y0(true);
    }

    @Override // U.p
    public final void r0() {
        z0();
    }

    public final String toString() {
        return this.f8723q.toString();
    }

    @Override // Z.c
    public final void u(Z.s sVar) {
        z0.o("onFocusEvent called on wrong node");
        throw null;
    }

    public final void y0(boolean z3) {
        if (!this.f4501p) {
            z0.o("initializeModifier called on unattached node");
            throw null;
        }
        U.o oVar = this.f8723q;
        if ((this.f4491f & 32) != 0) {
            if (oVar instanceof InterfaceC0957c) {
                C0989b c0989b = new C0989b(this, 0);
                K.d dVar = ((C1123s) AbstractC0993f.u(this)).f9507s0;
                if (!dVar.i(c0989b)) {
                    dVar.b(c0989b);
                }
            }
            if (oVar instanceof InterfaceC0960f) {
                InterfaceC0960f interfaceC0960f = (InterfaceC0960f) oVar;
                C0955a c0955a = this.f8724r;
                if (c0955a == null || !c0955a.g(interfaceC0960f.getKey())) {
                    C0955a c0955a2 = new C0955a();
                    c0955a2.f8343a = interfaceC0960f;
                    this.f8724r = c0955a2;
                    if (AbstractC0993f.d(this)) {
                        C0958d modifierLocalManager = ((C1123s) AbstractC0993f.u(this)).getModifierLocalManager();
                        C0962h key = interfaceC0960f.getKey();
                        modifierLocalManager.f8346b.b(this);
                        modifierLocalManager.f8347c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    c0955a.f8343a = interfaceC0960f;
                    C0958d modifierLocalManager2 = ((C1123s) AbstractC0993f.u(this)).getModifierLocalManager();
                    C0962h key2 = interfaceC0960f.getKey();
                    modifierLocalManager2.f8346b.b(this);
                    modifierLocalManager2.f8347c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f4491f & 4) != 0 && !z3) {
            AbstractC0993f.r(this, 2).Q0();
        }
        if ((this.f4491f & 2) != 0) {
            if (AbstractC0993f.d(this)) {
                b0 b0Var = this.f4496k;
                f2.j.c(b0Var);
                ((C1011y) b0Var).i1(this);
                g0 g0Var = b0Var.f8710G;
                if (g0Var != null) {
                    g0Var.invalidate();
                }
            }
            if (!z3) {
                AbstractC0993f.r(this, 2).Q0();
                AbstractC0993f.t(this).A();
            }
        }
        if (oVar instanceof C0946o) {
            ((C0946o) oVar).f8302a.f8326j = AbstractC0993f.t(this);
        }
        if ((this.f4491f & 256) != 0 && (oVar instanceof C0976d) && AbstractC0993f.d(this)) {
            AbstractC0993f.t(this).A();
        }
        if ((this.f4491f & 8) != 0) {
            ((C1123s) AbstractC0993f.u(this)).A();
        }
    }

    public final void z0() {
        if (!this.f4501p) {
            z0.o("unInitializeModifier called on unattached node");
            throw null;
        }
        U.o oVar = this.f8723q;
        if ((this.f4491f & 32) != 0) {
            if (oVar instanceof InterfaceC0960f) {
                C0958d modifierLocalManager = ((C1123s) AbstractC0993f.u(this)).getModifierLocalManager();
                C0962h key = ((InterfaceC0960f) oVar).getKey();
                modifierLocalManager.f8348d.b(AbstractC0993f.t(this));
                modifierLocalManager.f8349e.b(key);
                modifierLocalManager.a();
            }
            if (oVar instanceof InterfaceC0957c) {
                ((InterfaceC0957c) oVar).j(AbstractC0993f.f8743a);
            }
        }
        if ((this.f4491f & 8) != 0) {
            ((C1123s) AbstractC0993f.u(this)).A();
        }
    }

    @Override // t0.InterfaceC1008v
    public final void C(long j3) {
    }

    @Override // t0.InterfaceC1008v
    public final void v(InterfaceC0919p interfaceC0919p) {
    }
}
