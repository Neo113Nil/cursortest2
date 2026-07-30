package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ap0 extends zl0 implements kj1, to0 {
    public to0 s;
    public wo0 t;
    public ap0 u;
    public final String v = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public ap0(to0 to0Var, wo0 wo0Var) {
        this.s = to0Var;
        this.t = wo0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r14v16, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [zl0] */
    @Override // defpackage.to0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object C(long j, long j2, dn dnVar) {
        yo0 yo0Var;
        int i;
        long j3;
        long j4;
        long j5;
        boolean z;
        ap0 ap0Var;
        long j6;
        long j7;
        ap0 ap0Var2;
        l7 l7Var;
        int i2;
        int i3;
        if (dnVar instanceof yo0) {
            yo0Var = (yo0) dnVar;
            int i4 = yo0Var.l;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                yo0Var.l = i4 - Integer.MIN_VALUE;
                yo0 yo0Var2 = yo0Var;
                Object obj = yo0Var2.j;
                tn tnVar = tn.d;
                i = yo0Var2.l;
                eo0 eo0Var = null;
                int i5 = 1;
                if (i != 0) {
                    ca0.v(obj);
                    to0 to0Var = this.s;
                    yo0Var2.h = j;
                    yo0Var2.i = j2;
                    yo0Var2.l = 1;
                    obj = to0Var.C(j, j2, yo0Var2);
                    if (obj != tnVar) {
                        j3 = j;
                        j4 = j2;
                    }
                    return tnVar;
                }
                if (i != 1) {
                    if (i != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j7 = yo0Var2.h;
                    ca0.v(obj);
                    j6 = ((xm1) obj).a;
                    j5 = j7;
                    return new xm1(xm1.e(j5, j6));
                }
                j4 = yo0Var2.i;
                j3 = yo0Var2.h;
                ca0.v(obj);
                j5 = ((xm1) obj).a;
                z = this.r;
                if (z) {
                    ap0Var = this.u;
                } else if (z && z) {
                    if (!this.d.r) {
                        o80.b("visitAncestors called on an unattached node");
                    }
                    zl0 zl0Var = this.d.i;
                    jd0 I = op.I(this);
                    loop0: while (true) {
                        if (I == null) {
                            ap0Var2 = null;
                            break;
                        }
                        int i6 = 262144;
                        if ((((zl0) I.J.g).h & 262144) != 0) {
                            while (zl0Var != null) {
                                if ((zl0Var.g & i6) != 0) {
                                    zq zqVar = zl0Var;
                                    eo0 eo0Var2 = eo0Var;
                                    while (zqVar != 0) {
                                        if (zqVar instanceof kj1) {
                                            ?? r14 = (kj1) zqVar;
                                            i2 = i6;
                                            if (Intrinsics.a(h(), r14.h()) && ap0.class == r14.getClass()) {
                                                ap0Var2 = r14;
                                                break loop0;
                                            }
                                        } else {
                                            i2 = i6;
                                            if ((zqVar.g & i2) != 0 && (zqVar instanceof zq)) {
                                                zl0 zl0Var2 = zqVar.t;
                                                int i7 = 0;
                                                zl0 zl0Var3 = zqVar;
                                                while (zl0Var2 != null) {
                                                    if ((zl0Var2.g & i2) != 0) {
                                                        i7++;
                                                        if (i7 == i5) {
                                                            zl0Var3 = zl0Var2;
                                                        } else {
                                                            eo0 eo0Var3 = eo0Var2 == null ? new eo0(new zl0[16]) : eo0Var2;
                                                            if (zl0Var3 != null) {
                                                                eo0Var3.b(zl0Var3);
                                                                zl0Var3 = null;
                                                            }
                                                            eo0Var3.b(zl0Var2);
                                                            eo0Var2 = eo0Var3;
                                                        }
                                                    }
                                                    zl0Var2 = zl0Var2.j;
                                                    i5 = 1;
                                                    zl0Var3 = zl0Var3;
                                                }
                                                i3 = i5;
                                                if (i7 == i3) {
                                                    i6 = i2;
                                                    i5 = i3;
                                                    zqVar = zl0Var3;
                                                }
                                                zl0Var3 = op.o(eo0Var2);
                                                i6 = i2;
                                                i5 = i3;
                                                zqVar = zl0Var3;
                                            }
                                        }
                                        i3 = i5;
                                        zl0Var3 = op.o(eo0Var2);
                                        i6 = i2;
                                        i5 = i3;
                                        zqVar = zl0Var3;
                                    }
                                }
                                zl0Var = zl0Var.i;
                                i6 = i6;
                                i5 = i5;
                                eo0Var = null;
                            }
                        }
                        int i8 = i5;
                        I = I.s();
                        zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
                        i5 = i8;
                        eo0Var = null;
                    }
                    ap0Var = ap0Var2;
                } else {
                    ap0Var = null;
                }
                if (ap0Var != null) {
                    j6 = 0;
                    return new xm1(xm1.e(j5, j6));
                }
                long e = xm1.e(j3, j5);
                long d = xm1.d(j4, j5);
                yo0Var2.h = j5;
                yo0Var2.l = 2;
                obj = ap0Var.C(e, d, yo0Var2);
                if (obj != tnVar) {
                    j7 = j5;
                    j6 = ((xm1) obj).a;
                    j5 = j7;
                    return new xm1(xm1.e(j5, j6));
                }
                return tnVar;
            }
        }
        yo0Var = new yo0(this, (fn) dnVar);
        yo0 yo0Var22 = yo0Var;
        Object obj2 = yo0Var22.j;
        tn tnVar2 = tn.d;
        i = yo0Var22.l;
        eo0 eo0Var4 = null;
        int i52 = 1;
        if (i != 0) {
        }
        j5 = ((xm1) obj2).a;
        z = this.r;
        if (z) {
        }
        if (ap0Var != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.to0
    public final long E(int i, long j, long j2) {
        l7 l7Var;
        long E = this.s.E(i, j, j2);
        boolean z = this.r;
        ap0 ap0Var = null;
        if (z && z) {
            if (!this.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var = this.d.i;
            jd0 I = op.I(this);
            loop0: while (true) {
                if (I == null) {
                    break;
                }
                if ((((zl0) I.J.g).h & 262144) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 262144) != 0) {
                            zq zqVar = zl0Var;
                            ?? r5 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof kj1) {
                                    ?? r3 = (kj1) zqVar;
                                    if (Intrinsics.a(h(), r3.h()) && ap0.class == r3.getClass()) {
                                        ap0Var = r3;
                                        break loop0;
                                    }
                                } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var2 = zqVar.t;
                                    int i2 = 0;
                                    zqVar = zqVar;
                                    r5 = r5;
                                    while (zl0Var2 != null) {
                                        if ((zl0Var2.g & 262144) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                zqVar = zl0Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r5.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r5.b(zl0Var2);
                                            }
                                        }
                                        zl0Var2 = zl0Var2.j;
                                        zqVar = zqVar;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zqVar = op.o(r5);
                            }
                        }
                        zl0Var = zl0Var.i;
                    }
                }
                I = I.s();
                zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
            }
            ap0Var = ap0Var;
        }
        ap0 ap0Var2 = ap0Var;
        return wq0.e(E, ap0Var2 != null ? ap0Var2.E(i, wq0.e(j, E), wq0.d(j2, E)) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00ee, code lost:
    
        if (r15 == r1) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.to0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, dn dnVar) {
        zo0 zo0Var;
        Object obj;
        tn tnVar;
        int i;
        long j2;
        l7 l7Var;
        long j3;
        if (dnVar instanceof zo0) {
            zo0Var = (zo0) dnVar;
            int i2 = zo0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zo0Var.k = i2 - Integer.MIN_VALUE;
                obj = zo0Var.i;
                tnVar = tn.d;
                i = zo0Var.k;
                ap0 ap0Var = null;
                if (i != 0) {
                    ca0.v(obj);
                    boolean z = this.r;
                    if (z && z) {
                        if (!this.d.r) {
                            o80.b("visitAncestors called on an unattached node");
                        }
                        zl0 zl0Var = this.d.i;
                        jd0 I = op.I(this);
                        loop0: while (true) {
                            if (I == null) {
                                break;
                            }
                            if ((((zl0) I.J.g).h & 262144) != 0) {
                                while (zl0Var != null) {
                                    if ((zl0Var.g & 262144) != 0) {
                                        zq zqVar = zl0Var;
                                        ?? r8 = 0;
                                        while (zqVar != 0) {
                                            if (zqVar instanceof kj1) {
                                                ?? r6 = (kj1) zqVar;
                                                if (Intrinsics.a(h(), r6.h()) && ap0.class == r6.getClass()) {
                                                    ap0Var = r6;
                                                    break loop0;
                                                }
                                            } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                                zl0 zl0Var2 = zqVar.t;
                                                int i3 = 0;
                                                zqVar = zqVar;
                                                r8 = r8;
                                                while (zl0Var2 != null) {
                                                    if ((zl0Var2.g & 262144) != 0) {
                                                        i3++;
                                                        r8 = r8;
                                                        if (i3 == 1) {
                                                            zqVar = zl0Var2;
                                                        } else {
                                                            if (r8 == 0) {
                                                                r8 = new eo0(new zl0[16]);
                                                            }
                                                            if (zqVar != 0) {
                                                                r8.b(zqVar);
                                                                zqVar = 0;
                                                            }
                                                            r8.b(zl0Var2);
                                                        }
                                                    }
                                                    zl0Var2 = zl0Var2.j;
                                                    zqVar = zqVar;
                                                    r8 = r8;
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            zqVar = op.o(r8);
                                        }
                                    }
                                    zl0Var = zl0Var.i;
                                }
                            }
                            I = I.s();
                            zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
                        }
                        ap0Var = ap0Var;
                    }
                    if (ap0Var == null) {
                        j2 = 0;
                        to0 to0Var = this.s;
                        long d = xm1.d(j, j2);
                        zo0Var.h = j2;
                        zo0Var.k = 2;
                        obj = to0Var.M(d, zo0Var);
                        if (obj != tnVar) {
                            j3 = j2;
                            return new xm1(xm1.e(j3, ((xm1) obj).a));
                        }
                        return tnVar;
                    }
                    zo0Var.h = j;
                    zo0Var.k = 1;
                    obj = ap0Var.M(j, zo0Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            dd0.j("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = zo0Var.h;
                        ca0.v(obj);
                        return new xm1(xm1.e(j3, ((xm1) obj).a));
                    }
                    j = zo0Var.h;
                    ca0.v(obj);
                }
                j2 = ((xm1) obj).a;
                to0 to0Var2 = this.s;
                long d2 = xm1.d(j, j2);
                zo0Var.h = j2;
                zo0Var.k = 2;
                obj = to0Var2.M(d2, zo0Var);
                if (obj != tnVar) {
                }
                return tnVar;
            }
        }
        zo0Var = new zo0(this, (fn) dnVar);
        obj = zo0Var.i;
        tnVar = tn.d;
        i = zo0Var.k;
        ap0 ap0Var2 = null;
        if (i != 0) {
        }
        j2 = ((xm1) obj).a;
        to0 to0Var22 = this.s;
        long d22 = xm1.d(j, j2);
        zo0Var.h = j2;
        zo0Var.k = 2;
        obj = to0Var22.M(d22, zo0Var);
        if (obj != tnVar) {
        }
        return tnVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r3v9, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    @Override // defpackage.to0
    public final long d0(int i, long j) {
        l7 l7Var;
        boolean z = this.r;
        ap0 ap0Var = null;
        if (z && z) {
            if (!this.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var = this.d.i;
            jd0 I = op.I(this);
            loop0: while (true) {
                if (I == null) {
                    break;
                }
                if ((((zl0) I.J.g).h & 262144) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 262144) != 0) {
                            zq zqVar = zl0Var;
                            ?? r5 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof kj1) {
                                    ?? r3 = (kj1) zqVar;
                                    if (Intrinsics.a(h(), r3.h()) && ap0.class == r3.getClass()) {
                                        ap0Var = r3;
                                        break loop0;
                                    }
                                } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var2 = zqVar.t;
                                    int i2 = 0;
                                    zqVar = zqVar;
                                    r5 = r5;
                                    while (zl0Var2 != null) {
                                        if ((zl0Var2.g & 262144) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                zqVar = zl0Var2;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r5.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r5.b(zl0Var2);
                                            }
                                        }
                                        zl0Var2 = zl0Var2.j;
                                        zqVar = zqVar;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                zqVar = op.o(r5);
                            }
                        }
                        zl0Var = zl0Var.i;
                    }
                }
                I = I.s();
                zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
            }
            ap0Var = ap0Var;
        }
        long d0 = ap0Var != null ? ap0Var.d0(i, j) : 0L;
        return wq0.e(d0, this.s.d0(i, wq0.d(j, d0)));
    }

    @Override // defpackage.kj1
    public final Object h() {
        return this.v;
    }

    @Override // defpackage.zl0
    public final void r0() {
        wo0 wo0Var = this.t;
        wo0Var.a = this;
        wo0Var.b = null;
        this.u = null;
        wo0Var.c = new ce(8, this);
        wo0Var.d = n0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [zl0] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.zl0
    public final void s0() {
        l7 l7Var;
        z11 z11Var = new z11();
        x3 x3Var = new x3(1, z11Var);
        ap0 ap0Var = this;
        if (!ap0Var.d.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var = ap0Var.d.i;
        jd0 I = op.I(this);
        loop0: while (I != null) {
            if ((((zl0) I.J.g).h & 262144) != 0) {
                while (zl0Var != null) {
                    if ((zl0Var.g & 262144) != 0) {
                        zq zqVar = zl0Var;
                        ?? r8 = 0;
                        while (zqVar != 0) {
                            if (zqVar instanceof kj1) {
                                kj1 kj1Var = (kj1) zqVar;
                                if (!((Intrinsics.a(h(), kj1Var.h()) && getClass() == kj1Var.getClass()) ? ((Boolean) x3Var.invoke(kj1Var)).booleanValue() : true)) {
                                    break loop0;
                                }
                            } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                zl0 zl0Var2 = zqVar.t;
                                int i = 0;
                                zqVar = zqVar;
                                r8 = r8;
                                while (zl0Var2 != null) {
                                    if ((zl0Var2.g & 262144) != 0) {
                                        i++;
                                        r8 = r8;
                                        if (i == 1) {
                                            zqVar = zl0Var2;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new eo0(new zl0[16]);
                                            }
                                            if (zqVar != 0) {
                                                r8.b(zqVar);
                                                zqVar = 0;
                                            }
                                            r8.b(zl0Var2);
                                        }
                                    }
                                    zl0Var2 = zl0Var2.j;
                                    zqVar = zqVar;
                                    r8 = r8;
                                }
                                if (i == 1) {
                                }
                            }
                            zqVar = op.o(r8);
                        }
                    }
                    zl0Var = zl0Var.i;
                }
            }
            I = I.s();
            zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
        }
        ap0 ap0Var2 = (ap0) ((kj1) z11Var.d);
        this.u = ap0Var2;
        wo0 wo0Var = this.t;
        wo0Var.b = ap0Var2;
        if (wo0Var.a == this) {
            wo0Var.a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [zl0] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public final sn z0() {
        ap0 ap0Var;
        kj1 kj1Var;
        l7 l7Var;
        if (this.r) {
            if (!this.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var = this.d.i;
            jd0 I = op.I(this);
            loop0: while (true) {
                if (I == null) {
                    kj1Var = null;
                    break;
                }
                if ((((zl0) I.J.g).h & 262144) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 262144) != 0) {
                            zq zqVar = zl0Var;
                            ?? r6 = 0;
                            while (zqVar != 0) {
                                if (zqVar instanceof kj1) {
                                    kj1Var = (kj1) zqVar;
                                    if (Intrinsics.a(h(), kj1Var.h()) && ap0.class == kj1Var.getClass()) {
                                        break loop0;
                                    }
                                } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                    zl0 zl0Var2 = zqVar.t;
                                    int i = 0;
                                    zqVar = zqVar;
                                    r6 = r6;
                                    while (zl0Var2 != null) {
                                        if ((zl0Var2.g & 262144) != 0) {
                                            i++;
                                            r6 = r6;
                                            if (i == 1) {
                                                zqVar = zl0Var2;
                                            } else {
                                                if (r6 == 0) {
                                                    r6 = new eo0(new zl0[16]);
                                                }
                                                if (zqVar != 0) {
                                                    r6.b(zqVar);
                                                    zqVar = 0;
                                                }
                                                r6.b(zl0Var2);
                                            }
                                        }
                                        zl0Var2 = zl0Var2.j;
                                        zqVar = zqVar;
                                        r6 = r6;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                zqVar = op.o(r6);
                            }
                        }
                        zl0Var = zl0Var.i;
                    }
                }
                I = I.s();
                zl0Var = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
            }
            ap0Var = (ap0) kj1Var;
        } else {
            ap0Var = null;
        }
        sn z0 = ap0Var != null ? ap0Var.z0() : null;
        if (z0 != null && la0.L(z0)) {
            return z0;
        }
        sn snVar = this.t.d;
        if (snVar != null) {
            return snVar;
        }
        dd0.j("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
