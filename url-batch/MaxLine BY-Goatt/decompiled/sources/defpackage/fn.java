package defpackage;

import defpackage.aa2;
import java.util.HashSet;
import kotlin.Unit;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fn extends ul1 implements a91, xd0, xh2, w22, yl1, am1, mz1, r81, iv0, go0, so0, uo0, sx1, sq {
    public tl1 A;
    public dn B;
    public HashSet C;

    @Override // defpackage.sx1
    public final boolean E() {
        return this.z;
    }

    public final void G0(boolean z) {
        if (!this.z) {
            h21.b("initializeModifier called on unattached node");
        }
        tl1 tl1Var = this.A;
        if ((this.o & 32) != 0) {
            if (tl1Var instanceof wl1) {
                en enVar = new en(this, 0);
                jn1 jn1Var = ((t7) s03.K(this)).G0;
                if (jn1Var.f(enVar) < 0) {
                    jn1Var.a(enVar);
                }
            }
            if (tl1Var instanceof zl1) {
                zl1 zl1Var = (zl1) tl1Var;
                dn dnVar = this.B;
                if (dnVar == null || !dnVar.r(zl1Var.getKey())) {
                    dn dnVar2 = new dn();
                    dnVar2.q = zl1Var;
                    this.B = dnVar2;
                    os2 os2Var = s03.J(this).P.e;
                    os2Var.getClass();
                    if (os2Var.A) {
                        xl1 modifierLocalManager = ((t7) s03.K(this)).getModifierLocalManager();
                        u52 key = zl1Var.getKey();
                        modifierLocalManager.b.b(this);
                        modifierLocalManager.c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    dnVar.q = zl1Var;
                    xl1 modifierLocalManager2 = ((t7) s03.K(this)).getModifierLocalManager();
                    u52 key2 = zl1Var.getKey();
                    modifierLocalManager2.b.b(this);
                    modifierLocalManager2.c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.o & 4) != 0 && !z) {
            s03.H(this, 2).X0();
        }
        if ((this.o & 2) != 0) {
            os2 os2Var2 = s03.J(this).P.e;
            os2Var2.getClass();
            if (os2Var2.A) {
                ks1 ks1Var = this.t;
                ks1Var.getClass();
                ((c91) ks1Var).s1(this);
                qx1 qx1Var = ks1Var.U;
                if (qx1Var != null) {
                    ((fw0) qx1Var).c();
                }
            }
            if (!z) {
                s03.H(this, 2).X0();
                s03.J(this).D();
            }
        }
        if (tl1Var instanceof ta1) {
            ta1 ta1Var = (ta1) tl1Var;
            i91 J = s03.J(this);
            switch (ta1Var.a) {
                case 0:
                    ((va1) ta1Var.b).h = J;
                    break;
                default:
                    ((ry1) ta1Var.b).w.setValue(J);
                    break;
            }
        }
        if ((this.o & 256) != 0 && (tl1Var instanceof qm)) {
            os2 os2Var3 = s03.J(this).P.e;
            os2Var3.getClass();
            if (os2Var3.A) {
                s03.J(this).D();
            }
        }
        if ((this.o & 8) != 0) {
            ((t7) s03.K(this)).B();
        }
    }

    public final void H0() {
        if (!this.z) {
            h21.b("unInitializeModifier called on unattached node");
        }
        tl1 tl1Var = this.A;
        if ((this.o & 32) != 0) {
            if (tl1Var instanceof zl1) {
                xl1 modifierLocalManager = ((t7) s03.K(this)).getModifierLocalManager();
                u52 key = ((zl1) tl1Var).getKey();
                modifierLocalManager.d.b(s03.J(this));
                modifierLocalManager.e.b(key);
                modifierLocalManager.a();
            }
            if (tl1Var instanceof wl1) {
                ((wl1) tl1Var).f(bd3.c);
            }
        }
        if ((this.o & 8) != 0) {
            ((t7) s03.K(this)).B();
        }
    }

    public final void I0() {
        if (this.z) {
            this.C.clear();
            ((t7) s03.K(this)).getSnapshotObserver().a(this, o3.y, new en(this, 1));
        }
    }

    @Override // defpackage.w22
    public final void J(m22 m22Var, n22 n22Var, long j) {
        this.A.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        sh2 l = ((vh2) tl1Var).l();
        sh2Var.getClass();
        tn1 tn1Var = sh2Var.m;
        if (l.o) {
            sh2Var.o = true;
        }
        if (l.p) {
            sh2Var.p = true;
        }
        tn1 tn1Var2 = l.m;
        Object[] objArr = tn1Var2.b;
        Object[] objArr2 = tn1Var2.c;
        long[] jArr = tn1Var2.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        ji2 ji2Var = (ji2) obj;
                        if (!tn1Var.b(ji2Var)) {
                            tn1Var.m(ji2Var, obj2);
                        } else if (obj2 instanceof r1) {
                            Object g = tn1Var.g(ji2Var);
                            g.getClass();
                            r1 r1Var = (r1) g;
                            String str = r1Var.a;
                            if (str == null) {
                                str = ((r1) obj2).a;
                            }
                            tt0 tt0Var = r1Var.b;
                            if (tt0Var == null) {
                                tt0Var = ((r1) obj2).b;
                            }
                            tn1Var.m(ji2Var, new r1(str, tt0Var));
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // defpackage.so0
    public final void T(qo0 qo0Var) {
        tl1 tl1Var = this.A;
        h21.b("applyFocusProperties called on wrong node");
        tl1Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.go0
    public final void X(xo0 xo0Var) {
        tl1 tl1Var = this.A;
        h21.b("onFocusEvent called on wrong node");
        tl1Var.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.a91
    public final int a(qg1 qg1Var, jj1 jj1Var, int i) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        return ((y81) tl1Var).a(qg1Var, jj1Var, i);
    }

    @Override // defpackage.w22
    public final boolean a0() {
        this.A.getClass();
        throw new ClassCastException();
    }

    @Override // defpackage.a91
    public final int c(qg1 qg1Var, jj1 jj1Var, int i) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        return ((y81) tl1Var).c(qg1Var, jj1Var, i);
    }

    @Override // defpackage.sq
    public final ca0 d() {
        return s03.J(this).I;
    }

    @Override // defpackage.a91
    public final int e(qg1 qg1Var, jj1 jj1Var, int i) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        return ((y81) tl1Var).e(qg1Var, jj1Var, i);
    }

    @Override // defpackage.sq
    public final long f() {
        return zm3.Q(s03.H(this, 128).o);
    }

    @Override // defpackage.xd0
    public final void g(k91 k91Var) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        ((wd0) tl1Var).g(k91Var);
    }

    @Override // defpackage.sq
    public final u81 getLayoutDirection() {
        return s03.J(this).J;
    }

    @Override // defpackage.a91
    public final int h(qg1 qg1Var, jj1 jj1Var, int i) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        return ((y81) tl1Var).h(qg1Var, jj1Var, i);
    }

    @Override // defpackage.w22
    public final void h0() {
        this.A.getClass();
        throw new ClassCastException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [ul1] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [eo1] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [eo1] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // defpackage.yl1, defpackage.am1
    public final Object i(u52 u52Var) {
        fs1 fs1Var;
        this.C.add(u52Var);
        if (!this.m.z) {
            h21.b("visitAncestors called on an unattached node");
        }
        ul1 ul1Var = this.m.q;
        i91 J = s03.J(this);
        while (J != null) {
            if ((J.P.f.p & 32) != 0) {
                while (ul1Var != null) {
                    if ((ul1Var.o & 32) != 0) {
                        p90 p90Var = ul1Var;
                        ?? r3 = 0;
                        while (p90Var != 0) {
                            if (p90Var instanceof yl1) {
                                yl1 yl1Var = (yl1) p90Var;
                                if (yl1Var.m().r(u52Var)) {
                                    return yl1Var.m().v(u52Var);
                                }
                            } else if ((p90Var.o & 32) != 0 && (p90Var instanceof p90)) {
                                ul1 ul1Var2 = p90Var.B;
                                int i = 0;
                                p90Var = p90Var;
                                r3 = r3;
                                while (ul1Var2 != null) {
                                    if ((ul1Var2.o & 32) != 0) {
                                        i++;
                                        r3 = r3;
                                        if (i == 1) {
                                            p90Var = ul1Var2;
                                        } else {
                                            if (r3 == 0) {
                                                r3 = new eo1(new ul1[16]);
                                            }
                                            if (p90Var != 0) {
                                                r3.b(p90Var);
                                                p90Var = 0;
                                            }
                                            r3.b(ul1Var2);
                                        }
                                    }
                                    ul1Var2 = ul1Var2.r;
                                    p90Var = p90Var;
                                    r3 = r3;
                                }
                                if (i == 1) {
                                }
                            }
                            p90Var = s03.c(r3);
                        }
                    }
                    ul1Var = ul1Var.q;
                }
            }
            J = J.u();
            ul1Var = (J == null || (fs1Var = J.P) == null) ? null : fs1Var.e;
        }
        return u52Var.a.invoke();
    }

    @Override // defpackage.a91
    public final pj1 j(qj1 qj1Var, jj1 jj1Var, long j) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        return ((y81) tl1Var).j(qj1Var, jj1Var, j);
    }

    @Override // defpackage.yl1
    public final yj1 m() {
        dn dnVar = this.B;
        return dnVar != null ? dnVar : ch0.q;
    }

    @Override // defpackage.mz1
    public final Object m0(Object obj) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        return (wc) tl1Var;
    }

    @Override // defpackage.xd0
    public final void n0() {
        z71.F(this);
    }

    @Override // defpackage.w22
    public final boolean o0() {
        this.A.getClass();
        throw new ClassCastException();
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // defpackage.iv0
    public final void y(ks1 ks1Var) {
        tl1 tl1Var = this.A;
        tl1Var.getClass();
        qm qmVar = (qm) tl1Var;
        if (qmVar.a) {
            return;
        }
        qmVar.a = true;
        yc2 yc2Var = qmVar.b;
        if (yc2Var != null) {
            aa2.a aVar = aa2.m;
            yc2Var.resumeWith(Unit.a);
        }
        qmVar.b = null;
    }

    @Override // defpackage.ul1
    public final void y0() {
        G0(true);
    }

    @Override // defpackage.ul1
    public final void z0() {
        H0();
    }

    @Override // defpackage.o90, defpackage.w22
    public final void b() {
    }

    @Override // defpackage.r81
    public final void q(t81 t81Var) {
    }

    @Override // defpackage.r81
    public final void v(long j) {
    }
}
