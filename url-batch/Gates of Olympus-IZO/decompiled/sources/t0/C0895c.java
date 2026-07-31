package t0;

import I.C0120t;
import e2.AbstractC0381e;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import l.C0565j;
import r0.InterfaceC0838k;
import r0.InterfaceC0840m;
import s.C0875r;
import s.C0880w;
import s0.C0884a;
import s0.C0885b;
import s0.C0887d;
import s0.InterfaceC0886c;
import u.C0936d;
import u0.C0997t;
import z0.C1076a;

/* renamed from: t0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0895c extends U.k implements InterfaceC0914w, InterfaceC0907o, n0, l0, s0.e, s0.g, j0, InterfaceC0913v, InterfaceC0908p, Z.b, Z.l, Z.o, h0, Y.a {

    /* renamed from: q, reason: collision with root package name */
    public U.j f7891q;

    /* renamed from: r, reason: collision with root package name */
    public C0884a f7892r;

    /* renamed from: s, reason: collision with root package name */
    public HashSet f7893s;

    @Override // t0.h0
    public final boolean H() {
        return this.p;
    }

    @Override // t0.l0
    public final void K() {
        Z1.i.d(this.f7891q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // t0.j0
    public final Object T(Object obj) {
        U.j jVar = this.f7891q;
        Z1.i.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (C0565j) jVar;
    }

    @Override // t0.InterfaceC0907o
    public final void U() {
        AbstractC0898f.m(this);
    }

    @Override // t0.l0
    public final boolean W() {
        Z1.i.d(this.f7891q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // Y.a
    public final M0.b a() {
        return AbstractC0898f.t(this).f7730s;
    }

    @Override // t0.InterfaceC0914w
    public final r0.B b(O o3, r0.z zVar, long j3) {
        U.j jVar = this.f7891q;
        Z1.i.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0840m) jVar).b(o3, zVar, j3);
    }

    @Override // t0.InterfaceC0908p
    public final void b0(a0 a0Var) {
        U.j jVar = this.f7891q;
        Z1.i.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C0936d c0936d = (C0936d) jVar;
        if (c0936d.f8062a) {
            return;
        }
        c0936d.f8062a = true;
        P1.k kVar = c0936d.f8063b;
        if (kVar != null) {
            kVar.resumeWith(L1.z.f2729a);
        }
        c0936d.f8063b = null;
    }

    @Override // Y.a
    public final long c() {
        return I2.l.R(AbstractC0898f.r(this, 128).f7116f);
    }

    @Override // t0.InterfaceC0907o
    public final void d(F f3) {
        U.j jVar = this.f7891q;
        Z1.i.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((Y.e) jVar).d(f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [Y1.a, Z1.j] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [U.k] */
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
    @Override // s0.e, s0.g
    public final Object e(s0.h hVar) {
        C0120t c0120t;
        this.f7893s.add(hVar);
        U.k kVar = this.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.k kVar2 = kVar.f3307h;
        D t3 = AbstractC0898f.t(this);
        while (t3 != null) {
            if ((((U.k) t3.f7735x.f2356f).f3306g & 32) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f3305f & 32) != 0) {
                        AbstractC0905m abstractC0905m = kVar2;
                        ?? r4 = 0;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof s0.e) {
                                s0.e eVar = (s0.e) abstractC0905m;
                                if (eVar.i().K(hVar)) {
                                    return eVar.i().N(hVar);
                                }
                            } else if ((abstractC0905m.f3305f & 32) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                U.k kVar3 = abstractC0905m.f7937r;
                                int i3 = 0;
                                abstractC0905m = abstractC0905m;
                                r4 = r4;
                                while (kVar3 != null) {
                                    if ((kVar3.f3305f & 32) != 0) {
                                        i3++;
                                        r4 = r4;
                                        if (i3 == 1) {
                                            abstractC0905m = kVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new K.d(new U.k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r4.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r4.b(kVar3);
                                        }
                                    }
                                    kVar3 = kVar3.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r4 = r4;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0905m = AbstractC0898f.f(r4);
                        }
                    }
                    kVar2 = kVar2.f3307h;
                }
            }
            t3 = t3.q();
            kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
        return hVar.f7509a.b();
    }

    @Override // Z.l
    public final void e0(Z.i iVar) {
        AbstractC0381e.N("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // t0.l0
    public final void f0(n0.g gVar, n0.h hVar, long j3) {
        Z1.i.d(this.f7891q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // Y.a
    public final M0.j getLayoutDirection() {
        return AbstractC0898f.t(this).f7731t;
    }

    @Override // t0.n0
    public final void h(z0.i iVar) {
        U.j jVar = this.f7891q;
        Z1.i.d(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        z0.i g3 = ((z0.j) jVar).g();
        Z1.i.d(iVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (g3.f8983e) {
            iVar.f8983e = true;
        }
        if (g3.f8984f) {
            iVar.f8984f = true;
        }
        for (Map.Entry entry : g3.f8982d.entrySet()) {
            z0.t tVar = (z0.t) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = iVar.f8982d;
            if (!linkedHashMap.containsKey(tVar)) {
                linkedHashMap.put(tVar, value);
            } else if (value instanceof C1076a) {
                Object obj = linkedHashMap.get(tVar);
                Z1.i.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C1076a c1076a = (C1076a) obj;
                String str = c1076a.f8942a;
                if (str == null) {
                    str = ((C1076a) value).f8942a;
                }
                L1.e eVar = c1076a.f8943b;
                if (eVar == null) {
                    eVar = ((C1076a) value).f8943b;
                }
                linkedHashMap.put(tVar, new C1076a(str, eVar));
            }
        }
    }

    @Override // s0.e
    public final g2.i i() {
        C0884a c0884a = this.f7892r;
        return c0884a != null ? c0884a : C0885b.f7502a;
    }

    @Override // U.k
    public final void n0() {
        v0(true);
    }

    @Override // U.k
    public final void o0() {
        w0();
    }

    @Override // Z.b
    public final void t(Z.p pVar) {
        AbstractC0381e.N("onFocusEvent called on wrong node");
        throw null;
    }

    public final String toString() {
        return this.f7891q.toString();
    }

    public final void v0(boolean z3) {
        if (!this.p) {
            AbstractC0381e.N("initializeModifier called on unattached node");
            throw null;
        }
        U.j jVar = this.f7891q;
        if ((this.f3305f & 32) != 0) {
            if (jVar instanceof InterfaceC0886c) {
                C0894b c0894b = new C0894b(this, 0);
                K.d dVar = ((C0997t) AbstractC0898f.u(this)).f8460r0;
                if (!dVar.i(c0894b)) {
                    dVar.b(c0894b);
                }
            }
            if (jVar instanceof s0.f) {
                s0.f fVar = (s0.f) jVar;
                C0884a c0884a = this.f7892r;
                if (c0884a == null || !c0884a.K(fVar.getKey())) {
                    C0884a c0884a2 = new C0884a();
                    c0884a2.f7501a = fVar;
                    this.f7892r = c0884a2;
                    if (AbstractC0898f.d(this)) {
                        C0887d modifierLocalManager = ((C0997t) AbstractC0898f.u(this)).getModifierLocalManager();
                        s0.h key = fVar.getKey();
                        modifierLocalManager.f7504b.b(this);
                        modifierLocalManager.f7505c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    c0884a.f7501a = fVar;
                    C0887d modifierLocalManager2 = ((C0997t) AbstractC0898f.u(this)).getModifierLocalManager();
                    s0.h key2 = fVar.getKey();
                    modifierLocalManager2.f7504b.b(this);
                    modifierLocalManager2.f7505c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f3305f & 4) != 0 && !z3) {
            AbstractC0898f.r(this, 2).H0();
        }
        if ((this.f3305f & 2) != 0) {
            if (AbstractC0898f.d(this)) {
                a0 a0Var = this.f3310k;
                Z1.i.c(a0Var);
                ((C0916y) a0Var).X0(this);
                f0 f0Var = a0Var.f7876G;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
            }
            if (!z3) {
                AbstractC0898f.r(this, 2).H0();
                AbstractC0898f.t(this).y();
            }
        }
        if (jVar instanceof C0875r) {
            C0875r c0875r = (C0875r) jVar;
            D t3 = AbstractC0898f.t(this);
            switch (c0875r.f7458a) {
                case 0:
                    ((C0880w) c0875r.f7459b).f7483j = t3;
                    break;
                default:
                    ((t.y) c0875r.f7459b).f7695h = t3;
                    break;
            }
        }
        if ((this.f3305f & 256) != 0 && (jVar instanceof C0936d) && AbstractC0898f.d(this)) {
            AbstractC0898f.t(this).y();
        }
        if ((this.f3305f & 8) != 0) {
            ((C0997t) AbstractC0898f.u(this)).A();
        }
    }

    public final void w0() {
        if (!this.p) {
            AbstractC0381e.N("unInitializeModifier called on unattached node");
            throw null;
        }
        U.j jVar = this.f7891q;
        if ((this.f3305f & 32) != 0) {
            if (jVar instanceof s0.f) {
                C0887d modifierLocalManager = ((C0997t) AbstractC0898f.u(this)).getModifierLocalManager();
                s0.h key = ((s0.f) jVar).getKey();
                modifierLocalManager.f7506d.b(AbstractC0898f.t(this));
                modifierLocalManager.f7507e.b(key);
                modifierLocalManager.a();
            }
            if (jVar instanceof InterfaceC0886c) {
                ((InterfaceC0886c) jVar).f(AbstractC0898f.f7911a);
            }
        }
        if ((this.f3305f & 8) != 0) {
            ((C0997t) AbstractC0898f.u(this)).A();
        }
    }

    public final void x0() {
        if (this.p) {
            this.f7893s.clear();
            ((C0997t) AbstractC0898f.u(this)).getSnapshotObserver().a(this, C0897e.f7896f, new C0894b(this, 1));
        }
    }

    @Override // t0.l0
    public final boolean y() {
        Z1.i.d(this.f7891q, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // t0.InterfaceC0913v
    public final void A(long j3) {
    }

    @Override // t0.InterfaceC0913v
    public final void u(InterfaceC0838k interfaceC0838k) {
    }
}
