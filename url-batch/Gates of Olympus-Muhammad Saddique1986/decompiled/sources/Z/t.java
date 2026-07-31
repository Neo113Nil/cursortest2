package Z;

import B.U;
import B.f0;
import I.C0174t;
import j.C0550x;
import n.z0;
import s0.InterfaceC0959e;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.E;
import t0.InterfaceC0998k;
import t0.b0;
import t0.d0;
import t0.p0;
import u0.C1123s;

/* loaded from: classes.dex */
public final class t extends U.p implements InterfaceC0998k, d0, InterfaceC0959e {

    /* renamed from: q, reason: collision with root package name */
    public boolean f4706q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4707r;

    /* renamed from: s, reason: collision with root package name */
    public s f4708s;

    public static final boolean A0(t tVar) {
        U.p pVar = tVar.f4489d;
        if (!pVar.f4501p) {
            z0.o("visitSubtreeIf called on an unattached node");
            throw null;
        }
        K.d dVar = new K.d(new U.p[16]);
        U.p pVar2 = pVar.f4494i;
        if (pVar2 == null) {
            AbstractC0993f.b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        while (dVar.m()) {
            U.p pVar3 = (U.p) dVar.o(dVar.f3216f - 1);
            if ((pVar3.f4492g & 1024) != 0) {
                for (U.p pVar4 = pVar3; pVar4 != null; pVar4 = pVar4.f4494i) {
                    if ((pVar4.f4491f & 1024) != 0) {
                        K.d dVar2 = null;
                        U.p pVar5 = pVar4;
                        while (pVar5 != null) {
                            if (pVar5 instanceof t) {
                                t tVar2 = (t) pVar5;
                                if (tVar2.f4708s != null) {
                                    int ordinal = tVar2.z0().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal == 3) {
                                        return false;
                                    }
                                    throw new C1.c();
                                }
                            } else if ((pVar5.f4491f & 1024) != 0 && (pVar5 instanceof AbstractC1000m)) {
                                int i3 = 0;
                                for (U.p pVar6 = ((AbstractC1000m) pVar5).f8771r; pVar6 != null; pVar6 = pVar6.f4494i) {
                                    if ((pVar6.f4491f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            pVar5 = pVar6;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.p[16]);
                                            }
                                            if (pVar5 != null) {
                                                dVar2.b(pVar5);
                                                pVar5 = null;
                                            }
                                            dVar2.b(pVar6);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            pVar5 = AbstractC0993f.f(dVar2);
                        }
                    }
                }
            }
            AbstractC0993f.b(dVar, pVar3);
        }
        return false;
    }

    public static final boolean B0(t tVar) {
        C0174t c0174t;
        U.p pVar = tVar.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar2 = pVar.f4493h;
        E t3 = AbstractC0993f.t(tVar);
        while (t3 != null) {
            if ((((U.p) t3.f8561y.f2915f).f4492g & 1024) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f4491f & 1024) != 0) {
                        U.p pVar3 = pVar2;
                        K.d dVar = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof t) {
                                t tVar2 = (t) pVar3;
                                if (tVar2.f4708s != null) {
                                    int ordinal = tVar2.z0().ordinal();
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    if (ordinal == 1) {
                                        return true;
                                    }
                                    if (ordinal == 2 || ordinal == 3) {
                                        return false;
                                    }
                                    throw new C1.c();
                                }
                            } else if ((pVar3.f4491f & 1024) != 0 && (pVar3 instanceof AbstractC1000m)) {
                                int i3 = 0;
                                for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new K.d(new U.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                dVar.b(pVar3);
                                                pVar3 = null;
                                            }
                                            dVar.b(pVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            pVar3 = AbstractC0993f.f(dVar);
                        }
                    }
                    pVar2 = pVar2.f4493h;
                }
            }
            t3 = t3.s();
            pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
        return false;
    }

    public final void C0() {
        s sVar = this.f4708s;
        if (sVar == null) {
            if (sVar != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            U F3 = d.F(this);
            try {
                if (F3.f318b) {
                    U.a(F3);
                }
                F3.f318b = true;
                D0((B0(this) && A0(this)) ? s.f4703e : s.f4704f);
                U.b(F3);
            } catch (Throwable th) {
                U.b(F3);
                throw th;
            }
        }
        int ordinal = z0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            f2.u uVar = new f2.u();
            AbstractC0993f.q(this, new f0(uVar, 3, this));
            Object obj = uVar.f5832d;
            if (obj == null) {
                f2.j.j("focusProperties");
                throw null;
            }
            if (((k) obj).a()) {
                return;
            }
            ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(this)).getFocusOwner()).a(8, true, true);
        }
    }

    public final void D0(s sVar) {
        ((C0550x) d.F(this).f319c).i(this, sVar);
    }

    @Override // t0.d0
    public final void e0() {
        s z02 = z0();
        C0();
        if (z02 != z0()) {
            d.A(this);
        }
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // U.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void r0() {
        int ordinal = z0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                U F3 = d.F(this);
                try {
                    if (F3.f318b) {
                        U.a(F3);
                    }
                    F3.f318b = true;
                    D0(s.f4704f);
                    U.b(F3);
                } catch (Throwable th) {
                    U.b(F3);
                    throw th;
                }
            }
            this.f4708s = null;
        }
        ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(this)).getFocusOwner()).a(8, true, false);
        d.q(this);
        this.f4708s = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [U.p] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [K.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [K.d] */
    public final l y0() {
        C0174t c0174t;
        l lVar = new l();
        lVar.f4686a = true;
        p pVar = p.f4698b;
        lVar.f4687b = pVar;
        lVar.f4688c = pVar;
        lVar.f4689d = pVar;
        lVar.f4690e = pVar;
        lVar.f4691f = pVar;
        lVar.f4692g = pVar;
        lVar.f4693h = pVar;
        lVar.f4694i = pVar;
        lVar.f4695j = i.f4679g;
        lVar.f4696k = i.f4680h;
        U.p pVar2 = this.f4489d;
        if (!pVar2.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        E t3 = AbstractC0993f.t(this);
        U.p pVar3 = pVar2;
        loop0: while (t3 != null) {
            if ((((U.p) t3.f8561y.f2915f).f4492g & 3072) != 0) {
                while (pVar3 != null) {
                    int i3 = pVar3.f4491f;
                    if ((i3 & 3072) != 0) {
                        if (pVar3 != pVar2 && (i3 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i3 & 2048) != 0) {
                            AbstractC1000m abstractC1000m = pVar3;
                            ?? r7 = 0;
                            while (abstractC1000m != 0) {
                                if (abstractC1000m instanceof n) {
                                    ((n) abstractC1000m).f0(lVar);
                                } else if ((abstractC1000m.f4491f & 2048) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                    U.p pVar4 = abstractC1000m.f8771r;
                                    int i4 = 0;
                                    abstractC1000m = abstractC1000m;
                                    r7 = r7;
                                    while (pVar4 != null) {
                                        if ((pVar4.f4491f & 2048) != 0) {
                                            i4++;
                                            r7 = r7;
                                            if (i4 == 1) {
                                                abstractC1000m = pVar4;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new K.d(new U.p[16]);
                                                }
                                                if (abstractC1000m != 0) {
                                                    r7.b(abstractC1000m);
                                                    abstractC1000m = 0;
                                                }
                                                r7.b(pVar4);
                                            }
                                        }
                                        pVar4 = pVar4.f4494i;
                                        abstractC1000m = abstractC1000m;
                                        r7 = r7;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC1000m = AbstractC0993f.f(r7);
                            }
                        }
                    }
                    pVar3 = pVar3.f4493h;
                }
            }
            t3 = t3.s();
            pVar3 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
        return lVar;
    }

    public final s z0() {
        s sVar;
        E e3;
        C1123s c1123s;
        h focusOwner;
        b0 b0Var = this.f4489d.f4496k;
        U u3 = (b0Var == null || (e3 = b0Var.f8711o) == null || (c1123s = e3.f8548l) == null || (focusOwner = c1123s.getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.b) focusOwner).f4906h;
        if (u3 != null && (sVar = (s) ((C0550x) u3.f319c).e(this)) != null) {
            return sVar;
        }
        s sVar2 = this.f4708s;
        return sVar2 == null ? s.f4704f : sVar2;
    }
}
