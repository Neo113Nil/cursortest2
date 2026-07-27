package r0;

import G.C0223t;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import k.C0743i;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l0.C0811i;
import l0.EnumC0812j;
import n.AbstractC0864b;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import p0.InterfaceC0980p;
import p0.InterfaceC0982r;
import q0.C1048a;
import q0.C1049b;
import q0.C1051d;
import q0.C1055h;
import q0.InterfaceC1050c;
import q0.InterfaceC1052e;
import q0.InterfaceC1053f;
import q0.InterfaceC1054g;
import s.C1099c;
import s0.C1166s;
import y0.C1317a;
import y2.AbstractC1341p;
import y2.InterfaceC1332g;

/* renamed from: r0.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1062c extends S.n implements InterfaceC1081w, InterfaceC1074o, n0, l0, InterfaceC1052e, InterfaceC1054g, j0, InterfaceC1080v, InterfaceC1075p, X.c, X.n, X.q, h0, W.a {

    /* renamed from: t, reason: collision with root package name */
    public S.m f9774t;

    /* renamed from: u, reason: collision with root package name */
    public C1048a f9775u;

    /* renamed from: v, reason: collision with root package name */
    public HashSet f9776v;

    public final void B0(boolean z4) {
        if (!this.f3990s) {
            AbstractC0864b.D("initializeModifier called on unattached node");
            throw null;
        }
        S.m mVar = this.f9774t;
        if ((this.f3980i & 32) != 0) {
            if (mVar instanceof InterfaceC1050c) {
                C1061b c1061b = new C1061b(this, 0);
                I.d dVar = ((C1166s) AbstractC1065f.w(this)).f10376v0;
                if (!dVar.h(c1061b)) {
                    dVar.b(c1061b);
                }
            }
            if (mVar instanceof InterfaceC1053f) {
                InterfaceC1053f interfaceC1053f = (InterfaceC1053f) mVar;
                C1048a c1048a = this.f9775u;
                if (c1048a == null || !c1048a.n(interfaceC1053f.getKey())) {
                    C1048a c1048a2 = new C1048a();
                    c1048a2.f9352a = interfaceC1053f;
                    this.f9775u = c1048a2;
                    if (AbstractC1065f.d(this)) {
                        C1051d modifierLocalManager = ((C1166s) AbstractC1065f.w(this)).getModifierLocalManager();
                        C1055h key = interfaceC1053f.getKey();
                        modifierLocalManager.f9355b.b(this);
                        modifierLocalManager.f9356c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    c1048a.f9352a = interfaceC1053f;
                    C1051d modifierLocalManager2 = ((C1166s) AbstractC1065f.w(this)).getModifierLocalManager();
                    C1055h key2 = interfaceC1053f.getKey();
                    modifierLocalManager2.f9355b.b(this);
                    modifierLocalManager2.f9356c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f3980i & 4) != 0 && !z4) {
            AbstractC1065f.t(this, 2).U0();
        }
        if ((this.f3980i & 2) != 0) {
            if (AbstractC1065f.d(this)) {
                a0 a0Var = this.f3985n;
                Intrinsics.c(a0Var);
                ((C1083y) a0Var).l1(this);
                f0 f0Var = a0Var.f9761J;
                if (f0Var != null) {
                    f0Var.invalidate();
                }
            }
            if (!z4) {
                AbstractC1065f.t(this, 2).U0();
                AbstractC1065f.v(this).A();
            }
        }
        if (mVar instanceof r.q) {
            ((r.q) mVar).f9536a.f9560j = AbstractC1065f.v(this);
        }
        if ((this.f3980i & 256) != 0 && (mVar instanceof C1099c) && AbstractC1065f.d(this)) {
            AbstractC1065f.v(this).A();
        }
        if ((this.f3980i & 8) != 0) {
            ((C1166s) AbstractC1065f.w(this)).z();
        }
    }

    public final void C0() {
        if (!this.f3990s) {
            AbstractC0864b.D("unInitializeModifier called on unattached node");
            throw null;
        }
        S.m mVar = this.f9774t;
        if ((this.f3980i & 32) != 0) {
            if (mVar instanceof InterfaceC1053f) {
                C1051d modifierLocalManager = ((C1166s) AbstractC1065f.w(this)).getModifierLocalManager();
                C1055h key = ((InterfaceC1053f) mVar).getKey();
                modifierLocalManager.f9357d.b(AbstractC1065f.v(this));
                modifierLocalManager.f9358e.b(key);
                modifierLocalManager.a();
            }
            if (mVar instanceof InterfaceC1050c) {
                ((InterfaceC1050c) mVar).k(AbstractC1065f.f9795a);
            }
        }
        if ((this.f3980i & 8) != 0) {
            ((C1166s) AbstractC1065f.w(this)).z();
        }
    }

    public final void D0() {
        if (this.f3990s) {
            this.f9776v.clear();
            ((C1166s) AbstractC1065f.w(this)).getSnapshotObserver().a(this, C1064e.f9779e, new C1061b(this, 1));
        }
    }

    @Override // r0.InterfaceC1075p
    public final void H(a0 a0Var) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        C1099c c1099c = (C1099c) mVar;
        if (c1099c.f9925a) {
            return;
        }
        c1099c.f9925a = true;
        C2.c cVar = c1099c.f9926b;
        if (cVar != null) {
            AbstractC1341p.a aVar = AbstractC1341p.f11673d;
            cVar.u(Unit.f7487a);
        }
        c1099c.f9926b = null;
    }

    @Override // r0.h0
    public final boolean N() {
        return this.f3990s;
    }

    @Override // X.c
    public final void Q(X.s sVar) {
        AbstractC0864b.D("onFocusEvent called on wrong node");
        throw null;
    }

    @Override // r0.l0
    public final void S() {
        Intrinsics.d(this.f9774t, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // r0.l0
    public final void Z(C0811i c0811i, EnumC0812j enumC0812j, long j4) {
        Intrinsics.d(this.f9774t, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // r0.InterfaceC1074o
    public final void a(G g4) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((W.e) mVar).a(g4);
    }

    @Override // r0.InterfaceC1081w
    public final int b(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0982r) mVar).b(o4, interfaceC0944E, i2);
    }

    @Override // r0.InterfaceC1081w
    public final int c(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0982r) mVar).c(o4, interfaceC0944E, i2);
    }

    @Override // r0.InterfaceC1081w
    public final int d(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0982r) mVar).d(o4, interfaceC0944E, i2);
    }

    @Override // W.a
    public final M0.b e() {
        return AbstractC1065f.v(this).f9610w;
    }

    @Override // r0.j0
    public final Object e0(Object obj) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (C0743i) mVar;
    }

    @Override // r0.InterfaceC1081w
    public final int f(O o4, InterfaceC0944E interfaceC0944E, int i2) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0982r) mVar).f(o4, interfaceC0944E, i2);
    }

    @Override // r0.InterfaceC1074o
    public final void f0() {
        AbstractC1065f.n(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [M2.p, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // q0.InterfaceC1052e, q0.InterfaceC1054g
    public final Object g(C1055h c1055h) {
        C0223t c0223t;
        this.f9776v.add(c1055h);
        S.n nVar = this.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar2 = nVar.f3982k;
        E v4 = AbstractC1065f.v(this);
        while (v4 != null) {
            if ((((S.n) v4.B.f2912f).f3981j & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f3980i & 32) != 0) {
                        AbstractC1073n abstractC1073n = nVar2;
                        ?? r4 = 0;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof InterfaceC1052e) {
                                InterfaceC1052e interfaceC1052e = (InterfaceC1052e) abstractC1073n;
                                if (interfaceC1052e.k().n(c1055h)) {
                                    return interfaceC1052e.k().r(c1055h);
                                }
                            } else if ((abstractC1073n.f3980i & 32) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                S.n nVar3 = abstractC1073n.f9826u;
                                int i2 = 0;
                                abstractC1073n = abstractC1073n;
                                r4 = r4;
                                while (nVar3 != null) {
                                    if ((nVar3.f3980i & 32) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            abstractC1073n = nVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new I.d(new S.n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r4.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r4.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1073n = AbstractC1065f.f(r4);
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
        return c1055h.f9360a.invoke();
    }

    @Override // r0.l0
    public final boolean g0() {
        Intrinsics.d(this.f9774t, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // W.a
    public final M0.k getLayoutDirection() {
        return AbstractC1065f.v(this).f9611x;
    }

    @Override // W.a
    public final long h() {
        return u3.d.U(AbstractC1065f.t(this, 128).f9007i);
    }

    @Override // r0.InterfaceC1081w
    public final InterfaceC0946G i(InterfaceC0947H interfaceC0947H, InterfaceC0944E interfaceC0944E, long j4) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((InterfaceC0982r) mVar).i(interfaceC0947H, interfaceC0944E, j4);
    }

    @Override // q0.InterfaceC1052e
    public final AbstractC0864b k() {
        C1048a c1048a = this.f9775u;
        return c1048a != null ? c1048a : C1049b.f9353a;
    }

    @Override // X.n
    public final void n0(X.k kVar) {
        AbstractC0864b.D("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        S.m mVar = this.f9774t;
        Intrinsics.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        y0.i j4 = ((y0.j) mVar).j();
        Intrinsics.d(iVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        if (j4.f11577e) {
            iVar.f11577e = true;
        }
        if (j4.f11578i) {
            iVar.f11578i = true;
        }
        for (Map.Entry entry : j4.f11576d.entrySet()) {
            y0.t tVar = (y0.t) entry.getKey();
            Object value = entry.getValue();
            LinkedHashMap linkedHashMap = iVar.f11576d;
            if (!linkedHashMap.containsKey(tVar)) {
                linkedHashMap.put(tVar, value);
            } else if (value instanceof C1317a) {
                Object obj = linkedHashMap.get(tVar);
                Intrinsics.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                C1317a c1317a = (C1317a) obj;
                String str = c1317a.f11535a;
                if (str == null) {
                    str = ((C1317a) value).f11535a;
                }
                InterfaceC1332g interfaceC1332g = c1317a.f11536b;
                if (interfaceC1332g == null) {
                    interfaceC1332g = ((C1317a) value).f11536b;
                }
                linkedHashMap.put(tVar, new C1317a(str, interfaceC1332g));
            }
        }
    }

    @Override // S.n
    public final void t0() {
        B0(true);
    }

    public final String toString() {
        return this.f9774t.toString();
    }

    @Override // S.n
    public final void u0() {
        C0();
    }

    @Override // r0.InterfaceC1080v
    public final void x(InterfaceC0980p interfaceC0980p) {
    }

    @Override // r0.l0
    public final boolean y() {
        Intrinsics.d(this.f9774t, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // r0.InterfaceC1080v
    public final void z(long j4) {
    }
}
