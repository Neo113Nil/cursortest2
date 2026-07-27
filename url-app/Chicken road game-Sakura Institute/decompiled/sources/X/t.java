package X;

import A.V;
import A.f0;
import G.C0223t;
import i.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import n.AbstractC0864b;
import q0.InterfaceC1052e;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.E;
import r0.InterfaceC1071l;
import r0.a0;
import r0.c0;
import r0.o0;
import s0.C1166s;
import y2.C1338m;

/* loaded from: classes.dex */
public final class t extends S.n implements InterfaceC1071l, c0, InterfaceC1052e {

    /* renamed from: t, reason: collision with root package name */
    public boolean f4352t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f4353u;

    /* renamed from: v, reason: collision with root package name */
    public s f4354v;

    public static final boolean D0(t tVar) {
        S.n nVar = tVar.f3978d;
        if (!nVar.f3990s) {
            AbstractC0864b.D("visitSubtreeIf called on an unattached node");
            throw null;
        }
        I.d dVar = new I.d(new S.n[16]);
        S.n nVar2 = nVar.f3983l;
        if (nVar2 == null) {
            AbstractC1065f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        while (dVar.l()) {
            S.n nVar3 = (S.n) dVar.n(dVar.f3332i - 1);
            if ((nVar3.f3981j & 1024) != 0) {
                for (S.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f3983l) {
                    if ((nVar4.f3980i & 1024) != 0) {
                        I.d dVar2 = null;
                        S.n nVar5 = nVar4;
                        while (nVar5 != null) {
                            if (nVar5 instanceof t) {
                                t tVar2 = (t) nVar5;
                                if (tVar2.f4354v != null) {
                                    int ordinal = tVar2.C0().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal == 3) {
                                        return false;
                                    }
                                    throw new C1338m();
                                }
                            } else if ((nVar5.f3980i & 1024) != 0 && (nVar5 instanceof AbstractC1073n)) {
                                int i2 = 0;
                                for (S.n nVar6 = ((AbstractC1073n) nVar5).f9826u; nVar6 != null; nVar6 = nVar6.f3983l) {
                                    if ((nVar6.f3980i & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar5 = nVar6;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new I.d(new S.n[16]);
                                            }
                                            if (nVar5 != null) {
                                                dVar2.b(nVar5);
                                                nVar5 = null;
                                            }
                                            dVar2.b(nVar6);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar5 = AbstractC1065f.f(dVar2);
                        }
                    }
                }
            }
            AbstractC1065f.b(dVar, nVar3);
        }
        return false;
    }

    public static final boolean E0(t tVar) {
        C0223t c0223t;
        S.n nVar = tVar.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar2 = nVar.f3982k;
        E v4 = AbstractC1065f.v(tVar);
        while (v4 != null) {
            if ((((S.n) v4.B.f2912f).f3981j & 1024) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f3980i & 1024) != 0) {
                        S.n nVar3 = nVar2;
                        I.d dVar = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof t) {
                                t tVar2 = (t) nVar3;
                                if (tVar2.f4354v != null) {
                                    int ordinal = tVar2.C0().ordinal();
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    if (ordinal == 1) {
                                        return true;
                                    }
                                    if (ordinal == 2 || ordinal == 3) {
                                        return false;
                                    }
                                    throw new C1338m();
                                }
                            } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                int i2 = 0;
                                for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                    if ((nVar4.f3980i & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new I.d(new S.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar.b(nVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar3 = AbstractC1065f.f(dVar);
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [I.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [I.d] */
    public final l B0() {
        C0223t c0223t;
        l lVar = new l();
        lVar.f4332a = true;
        p pVar = p.f4344b;
        lVar.f4333b = pVar;
        lVar.f4334c = pVar;
        lVar.f4335d = pVar;
        lVar.f4336e = pVar;
        lVar.f4337f = pVar;
        lVar.f4338g = pVar;
        lVar.f4339h = pVar;
        lVar.f4340i = pVar;
        lVar.f4341j = i.f4325i;
        lVar.f4342k = i.f4326j;
        S.n nVar = this.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        E v4 = AbstractC1065f.v(this);
        S.n nVar2 = nVar;
        loop0: while (v4 != null) {
            if ((((S.n) v4.B.f2912f).f3981j & 3072) != 0) {
                while (nVar2 != null) {
                    int i2 = nVar2.f3980i;
                    if ((i2 & 3072) != 0) {
                        if (nVar2 != nVar && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            AbstractC1073n abstractC1073n = nVar2;
                            ?? r7 = 0;
                            while (abstractC1073n != 0) {
                                if (abstractC1073n instanceof n) {
                                    ((n) abstractC1073n).n0(lVar);
                                } else if ((abstractC1073n.f3980i & 2048) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                    S.n nVar3 = abstractC1073n.f9826u;
                                    int i4 = 0;
                                    abstractC1073n = abstractC1073n;
                                    r7 = r7;
                                    while (nVar3 != null) {
                                        if ((nVar3.f3980i & 2048) != 0) {
                                            i4++;
                                            r7 = r7;
                                            if (i4 == 1) {
                                                abstractC1073n = nVar3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new I.d(new S.n[16]);
                                                }
                                                if (abstractC1073n != 0) {
                                                    r7.b(abstractC1073n);
                                                    abstractC1073n = 0;
                                                }
                                                r7.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f3983l;
                                        abstractC1073n = abstractC1073n;
                                        r7 = r7;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC1073n = AbstractC1065f.f(r7);
                            }
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
        return lVar;
    }

    public final s C0() {
        s sVar;
        E e4;
        C1166s c1166s;
        h focusOwner;
        a0 a0Var = this.f3978d.f3985n;
        V v4 = (a0Var == null || (e4 = a0Var.f9762r) == null || (c1166s = e4.f9602o) == null || (focusOwner = c1166s.getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.b) focusOwner).f5181h;
        if (v4 != null && (sVar = (s) ((y) v4.f62c).e(this)) != null) {
            return sVar;
        }
        s sVar2 = this.f4354v;
        return sVar2 == null ? s.f4350i : sVar2;
    }

    public final void F0() {
        s sVar = this.f4354v;
        if (sVar == null) {
            if (sVar != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            V F3 = d.F(this);
            try {
                if (F3.f61b) {
                    V.a(F3);
                }
                F3.f61b = true;
                G0((E0(this) && D0(this)) ? s.f4349e : s.f4350i);
                Unit unit = Unit.f7487a;
                V.b(F3);
            } catch (Throwable th) {
                V.b(F3);
                throw th;
            }
        }
        int ordinal = C0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            M2.E e4 = new M2.E();
            AbstractC1065f.s(this, new f0(e4, 3, this));
            Object obj = e4.f3580d;
            if (obj == null) {
                Intrinsics.g("focusProperties");
                throw null;
            }
            if (((k) obj).a()) {
                return;
            }
            ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(this)).getFocusOwner()).a(8, true, true);
        }
    }

    public final void G0(s sVar) {
        ((y) d.F(this).f62c).i(this, sVar);
    }

    @Override // r0.c0
    public final void l0() {
        s C02 = C0();
        F0();
        if (C02 != C0()) {
            d.A(this);
        }
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // S.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void u0() {
        int ordinal = C0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                V F3 = d.F(this);
                try {
                    if (F3.f61b) {
                        V.a(F3);
                    }
                    F3.f61b = true;
                    G0(s.f4350i);
                    Unit unit = Unit.f7487a;
                    V.b(F3);
                } catch (Throwable th) {
                    V.b(F3);
                    throw th;
                }
            }
            this.f4354v = null;
        }
        ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(this)).getFocusOwner()).a(8, true, false);
        d.q(this);
        this.f4354v = null;
    }
}
