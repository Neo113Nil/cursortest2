package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class wo0 {
    public ap0 a;
    public ap0 b;
    public Function0 c = new ce(7, this);
    public sn d;

    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ce, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0112, code lost:
    
        if (r1 == r2) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d0, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v19 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v20 */
    /* JADX WARN: Type inference failed for: r12v21 */
    /* JADX WARN: Type inference failed for: r12v22 */
    /* JADX WARN: Type inference failed for: r12v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18, types: [zl0] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r15v10, types: [eo0] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [eo0] */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12, types: [zl0] */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [zl0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, long j2, fn fnVar) {
        uo0 uo0Var;
        int i;
        int i2;
        ap0 ap0Var;
        long j3;
        ap0 ap0Var2;
        ap0 ap0Var3;
        l7 l7Var;
        kj1 kj1Var;
        l7 l7Var2;
        zl0 zl0Var;
        if (fnVar instanceof uo0) {
            uo0Var = (uo0) fnVar;
            int i3 = uo0Var.j;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                uo0Var.j = i3 - Integer.MIN_VALUE;
                uo0 uo0Var2 = uo0Var;
                Object obj = uo0Var2.h;
                tn tnVar = tn.d;
                i = uo0Var2.j;
                Object obj2 = null;
                if (i != 0) {
                    ca0.v(obj);
                    ap0 ap0Var4 = this.a;
                    int i4 = 262144;
                    if (ap0Var4 == null || !ap0Var4.r) {
                        i2 = 262144;
                        ap0Var = null;
                    } else {
                        if (!ap0Var4.d.r) {
                            o80.b("visitAncestors called on an unattached node");
                        }
                        zl0 zl0Var2 = ap0Var4.d.i;
                        jd0 I = op.I(ap0Var4);
                        loop0: while (true) {
                            if (I == null) {
                                i2 = i4;
                                kj1Var = null;
                                break;
                            }
                            if ((((zl0) I.J.g).h & i4) != 0) {
                                while (zl0Var2 != null) {
                                    if ((zl0Var2.g & i4) != 0) {
                                        ?? r15 = obj2;
                                        zq zqVar = zl0Var2;
                                        while (zqVar != 0) {
                                            if (zqVar instanceof kj1) {
                                                kj1Var = (kj1) zqVar;
                                                i2 = i4;
                                                if (Intrinsics.a(ap0Var4.h(), kj1Var.h()) && ap0.class == kj1Var.getClass()) {
                                                    break loop0;
                                                }
                                            } else {
                                                i2 = i4;
                                                if ((zqVar.g & i2) != 0 && (zqVar instanceof zq)) {
                                                    zl0 zl0Var3 = zqVar.t;
                                                    int i5 = 0;
                                                    zl0Var = zqVar;
                                                    r15 = r15;
                                                    while (zl0Var3 != null) {
                                                        if ((zl0Var3.g & i2) != 0) {
                                                            i5++;
                                                            r15 = r15;
                                                            if (i5 == 1) {
                                                                zl0Var = zl0Var3;
                                                            } else {
                                                                if (r15 == 0) {
                                                                    r15 = new eo0(new zl0[16]);
                                                                }
                                                                if (zl0Var != null) {
                                                                    r15.b(zl0Var);
                                                                    zl0Var = null;
                                                                }
                                                                r15.b(zl0Var3);
                                                            }
                                                        }
                                                        zl0Var3 = zl0Var3.j;
                                                        zl0Var = zl0Var;
                                                        r15 = r15;
                                                    }
                                                    if (i5 == 1) {
                                                        i4 = i2;
                                                        zqVar = zl0Var;
                                                        r15 = r15;
                                                    }
                                                }
                                            }
                                            zl0Var = op.o(r15);
                                            i4 = i2;
                                            zqVar = zl0Var;
                                            r15 = r15;
                                        }
                                    }
                                    zl0Var2 = zl0Var2.i;
                                    i4 = i4;
                                    obj2 = null;
                                }
                            }
                            int i6 = i4;
                            I = I.s();
                            zl0Var2 = (I == null || (l7Var2 = I.J) == null) ? null : (ig1) l7Var2.f;
                            i4 = i6;
                            obj2 = null;
                        }
                        ap0Var = (ap0) kj1Var;
                    }
                    j3 = 0;
                    if (ap0Var == null) {
                        ap0 ap0Var5 = this.b;
                        if (ap0Var5 != null) {
                            uo0Var2.j = 1;
                            obj = ap0Var5.C(j, j2, uo0Var2);
                        }
                    } else {
                        ap0 ap0Var6 = this.a;
                        if (ap0Var6 == null || !ap0Var6.r) {
                            ap0Var2 = null;
                        } else {
                            if (!ap0Var6.d.r) {
                                o80.b("visitAncestors called on an unattached node");
                            }
                            zl0 zl0Var4 = ap0Var6.d.i;
                            jd0 I2 = op.I(ap0Var6);
                            loop3: while (true) {
                                if (I2 == null) {
                                    ap0Var3 = null;
                                    break;
                                }
                                if ((((zl0) I2.J.g).h & i2) != 0) {
                                    while (zl0Var4 != null) {
                                        if ((zl0Var4.g & i2) != 0) {
                                            zq zqVar2 = zl0Var4;
                                            ?? r12 = 0;
                                            while (zqVar2 != 0) {
                                                if (zqVar2 instanceof kj1) {
                                                    ?? r9 = (kj1) zqVar2;
                                                    if (Intrinsics.a(ap0Var6.h(), r9.h()) && ap0.class == r9.getClass()) {
                                                        ap0Var3 = r9;
                                                        break loop3;
                                                    }
                                                } else if ((zqVar2.g & i2) != 0 && (zqVar2 instanceof zq)) {
                                                    zl0 zl0Var5 = zqVar2.t;
                                                    int i7 = 0;
                                                    zqVar2 = zqVar2;
                                                    r12 = r12;
                                                    while (zl0Var5 != null) {
                                                        if ((zl0Var5.g & i2) != 0) {
                                                            i7++;
                                                            r12 = r12;
                                                            if (i7 == 1) {
                                                                zqVar2 = zl0Var5;
                                                            } else {
                                                                if (r12 == 0) {
                                                                    r12 = new eo0(new zl0[16]);
                                                                }
                                                                if (zqVar2 != 0) {
                                                                    r12.b(zqVar2);
                                                                    zqVar2 = 0;
                                                                }
                                                                r12.b(zl0Var5);
                                                            }
                                                        }
                                                        zl0Var5 = zl0Var5.j;
                                                        zqVar2 = zqVar2;
                                                        r12 = r12;
                                                    }
                                                    if (i7 == 1) {
                                                    }
                                                }
                                                zqVar2 = op.o(r12);
                                            }
                                        }
                                        zl0Var4 = zl0Var4.i;
                                    }
                                }
                                I2 = I2.s();
                                zl0Var4 = (I2 == null || (l7Var = I2.J) == null) ? null : (ig1) l7Var.f;
                            }
                            ap0Var2 = ap0Var3;
                        }
                        if (ap0Var2 != null) {
                            uo0Var2.j = 2;
                            obj = ap0Var2.C(j, j2, uo0Var2);
                        }
                    }
                } else if (i == 1) {
                    ca0.v(obj);
                    j3 = ((xm1) obj).a;
                } else {
                    if (i != 2) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                    j3 = ((xm1) obj).a;
                }
                return new xm1(j3);
            }
        }
        uo0Var = new uo0(this, fnVar);
        uo0 uo0Var22 = uo0Var;
        Object obj3 = uo0Var22.h;
        tn tnVar2 = tn.d;
        i = uo0Var22.j;
        Object obj22 = null;
        if (i != 0) {
        }
        return new xm1(j3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [zl0] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.lang.Object, kj1] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [eo0] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, fn fnVar) {
        vo0 vo0Var;
        int i;
        long j2;
        l7 l7Var;
        if (fnVar instanceof vo0) {
            vo0Var = (vo0) fnVar;
            int i2 = vo0Var.j;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vo0Var.j = i2 - Integer.MIN_VALUE;
                Object obj = vo0Var.h;
                tn tnVar = tn.d;
                i = vo0Var.j;
                ap0 ap0Var = null;
                if (i != 0) {
                    ca0.v(obj);
                    ap0 ap0Var2 = this.a;
                    if (ap0Var2 != null && ap0Var2.r) {
                        if (!ap0Var2.d.r) {
                            o80.b("visitAncestors called on an unattached node");
                        }
                        zl0 zl0Var = ap0Var2.d.i;
                        jd0 I = op.I(ap0Var2);
                        loop0: while (true) {
                            if (I == null) {
                                break;
                            }
                            if ((((zl0) I.J.g).h & 262144) != 0) {
                                while (zl0Var != null) {
                                    if ((zl0Var.g & 262144) != 0) {
                                        zq zqVar = zl0Var;
                                        ?? r7 = 0;
                                        while (zqVar != 0) {
                                            if (zqVar instanceof kj1) {
                                                ?? r5 = (kj1) zqVar;
                                                if (Intrinsics.a(ap0Var2.h(), r5.h()) && ap0.class == r5.getClass()) {
                                                    ap0Var = r5;
                                                    break loop0;
                                                }
                                            } else if ((zqVar.g & 262144) != 0 && (zqVar instanceof zq)) {
                                                zl0 zl0Var2 = zqVar.t;
                                                int i3 = 0;
                                                zqVar = zqVar;
                                                r7 = r7;
                                                while (zl0Var2 != null) {
                                                    if ((zl0Var2.g & 262144) != 0) {
                                                        i3++;
                                                        r7 = r7;
                                                        if (i3 == 1) {
                                                            zqVar = zl0Var2;
                                                        } else {
                                                            if (r7 == 0) {
                                                                r7 = new eo0(new zl0[16]);
                                                            }
                                                            if (zqVar != 0) {
                                                                r7.b(zqVar);
                                                                zqVar = 0;
                                                            }
                                                            r7.b(zl0Var2);
                                                        }
                                                    }
                                                    zl0Var2 = zl0Var2.j;
                                                    zqVar = zqVar;
                                                    r7 = r7;
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            zqVar = op.o(r7);
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
                        return new xm1(j2);
                    }
                    vo0Var.j = 1;
                    obj = ap0Var.M(j, vo0Var);
                    if (obj == tnVar) {
                        return tnVar;
                    }
                } else {
                    if (i != 1) {
                        dd0.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ca0.v(obj);
                }
                j2 = ((xm1) obj).a;
                return new xm1(j2);
            }
        }
        vo0Var = new vo0(this, fnVar);
        Object obj2 = vo0Var.h;
        tn tnVar2 = tn.d;
        i = vo0Var.j;
        ap0 ap0Var3 = null;
        if (i != 0) {
        }
        j2 = ((xm1) obj2).a;
        return new xm1(j2);
    }

    public final sn c() {
        sn snVar = (sn) this.c.invoke();
        if (snVar != null) {
            return snVar;
        }
        dd0.j("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
