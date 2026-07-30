package defpackage;

import java.util.HashSet;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class l7 {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public Object g;
    public Object h;
    public Object i;
    public final Object j;
    public Object k;

    public l7(Object obj, c51 c51Var, Float f, int i) {
        f = (i & 4) != 0 ? null : f;
        this.b = c51Var;
        this.c = f;
        q7 q7Var = new q7(c51Var, obj, null, 60);
        this.d = q7Var;
        this.e = gb0.F(Boolean.FALSE);
        this.f = gb0.F(obj);
        this.g = new mo0();
        new oc1(1500.0f, f);
        v7 v7Var = q7Var.g;
        boolean z = v7Var instanceof r7;
        Object obj2 = z ? la0.e : v7Var instanceof s7 ? la0.f : v7Var instanceof t7 ? la0.g : la0.h;
        this.h = obj2;
        Object obj3 = z ? la0.a : v7Var instanceof s7 ? la0.b : v7Var instanceof t7 ? la0.c : la0.d;
        this.i = obj3;
        this.j = obj2;
        this.k = obj3;
    }

    public static final void a(l7 l7Var) {
        q7 q7Var = (q7) l7Var.d;
        q7Var.g.d();
        q7Var.h = Long.MIN_VALUE;
        ((av0) l7Var.e).setValue(Boolean.FALSE);
    }

    public static final void b(l7 l7Var, zl0 zl0Var, qp0 qp0Var) {
        for (zl0 zl0Var2 = zl0Var.i; zl0Var2 != null; zl0Var2 = zl0Var2.i) {
            if (zl0Var2 == ((lp0) l7Var.c)) {
                jd0 s = ((jd0) l7Var.b).s();
                qp0Var.u = s != null ? (v80) s.J.d : null;
                l7Var.e = qp0Var;
                return;
            } else {
                if ((zl0Var2.g & 2) != 0) {
                    return;
                }
                zl0Var2.y0(qp0Var);
            }
        }
    }

    public static Object c(l7 l7Var, Object obj, p7 p7Var, Function1 function1, sf1 sf1Var, int i) {
        Object invoke = ((Function1) ((c51) l7Var.b).g).invoke(((q7) l7Var.d).g);
        Function1 function12 = (i & 8) != 0 ? null : function1;
        Object f = l7Var.f();
        c51 c51Var = (c51) l7Var.b;
        lg1 lg1Var = new lg1(p7Var, c51Var, f, obj, (v7) ((Function1) c51Var.e).invoke(invoke));
        long j = ((q7) l7Var.d).h;
        mo0 mo0Var = (mo0) l7Var.g;
        k7 k7Var = new k7(l7Var, invoke, lg1Var, j, function12, null);
        ho0 ho0Var = ho0.d;
        mo0Var.getClass();
        return la0.A(new po(mo0Var, k7Var, (dn) null), sf1Var);
    }

    public static zl0 d(yl0 yl0Var, zl0 zl0Var) {
        zl0 zl0Var2;
        if (yl0Var instanceof em0) {
            zl0Var2 = ((em0) yl0Var).d();
            zl0Var2.g = rp0.f(zl0Var2);
        } else {
            xc xcVar = new xc();
            xcVar.g = rp0.d(yl0Var);
            xcVar.s = yl0Var;
            new HashSet();
            zl0Var2 = xcVar;
        }
        if (zl0Var2.r) {
            o80.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        zl0Var2.m = true;
        zl0 zl0Var3 = zl0Var.j;
        if (zl0Var3 != null) {
            zl0Var3.i = zl0Var2;
            zl0Var2.j = zl0Var3;
        }
        zl0Var.j = zl0Var2;
        zl0Var2.i = zl0Var;
        return zl0Var2;
    }

    public static zl0 e(zl0 zl0Var) {
        boolean z = zl0Var.r;
        if (z) {
            ln0 ln0Var = rp0.a;
            if (!z) {
                o80.b("autoInvalidateRemovedNode called on unattached node");
            }
            rp0.a(zl0Var, -1, 2);
            zl0Var.w0();
            zl0Var.q0();
        }
        zl0 zl0Var2 = zl0Var.j;
        zl0 zl0Var3 = zl0Var.i;
        if (zl0Var2 != null) {
            zl0Var2.i = zl0Var3;
            zl0Var.j = null;
        }
        if (zl0Var3 != null) {
            zl0Var3.j = zl0Var2;
            zl0Var.i = null;
        }
        zl0Var3.getClass();
        return zl0Var3;
    }

    public static void k(yl0 yl0Var, yl0 yl0Var2, zl0 zl0Var) {
        if ((yl0Var instanceof em0) && (yl0Var2 instanceof em0)) {
            zl0Var.getClass();
            ((em0) yl0Var2).e(zl0Var);
            if (zl0Var.r) {
                rp0.c(zl0Var);
                return;
            } else {
                zl0Var.n = true;
                return;
            }
        }
        if (!(zl0Var instanceof xc)) {
            o80.b("Unknown Modifier.Node type");
            return;
        }
        xc xcVar = (xc) zl0Var;
        boolean z = xcVar.r;
        if (z) {
            if (!z) {
                o80.b("unInitializeModifier called on unattached node");
            }
            if ((xcVar.g & 8) != 0) {
                ((d4) op.J(xcVar)).A();
            }
        }
        xcVar.s = yl0Var2;
        xcVar.g = rp0.d(yl0Var2);
        if (xcVar.r) {
            xcVar.z0(false);
        }
        if (zl0Var.r) {
            rp0.c(zl0Var);
        } else {
            zl0Var.n = true;
        }
    }

    public Object f() {
        return ((q7) this.d).e.getValue();
    }

    public boolean g(int i) {
        return (((zl0) this.g).h & i) != 0;
    }

    public void h() {
        for (zl0 zl0Var = (zl0) this.g; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.v0();
            if (zl0Var.m) {
                ln0 ln0Var = rp0.a;
                if (!zl0Var.r) {
                    o80.b("autoInvalidateInsertedNode called on unattached node");
                }
                rp0.a(zl0Var, -1, 1);
            }
            if (zl0Var.n) {
                rp0.c(zl0Var);
            }
            zl0Var.m = false;
            zl0Var.n = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0191, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0196, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a0, code lost:
    
        if (r14 <= r7) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a2, code lost:
    
        if (r11 <= r15) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a4, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01b0, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b2, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bd, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01c1, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c3, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c5, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c7, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cd, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cf, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0264, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b9, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0194, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018d, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x017b, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016e, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0179, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x026a, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0154, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00d0, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x014a, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0150, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0156, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0157, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0159, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x015b, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015d, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016b, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0170, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0182, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0188, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x018a, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018f, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(int i, eo0 eo0Var, eo0 eo0Var2, zl0 zl0Var, boolean z) {
        int i2;
        eo0 eo0Var3;
        eo0 eo0Var4;
        int i3;
        int[] iArr;
        int[] iArr2;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        kp0 kp0Var = (kp0) this.k;
        if (kp0Var == null) {
            i2 = i;
            eo0Var3 = eo0Var;
            eo0Var4 = eo0Var2;
            kp0Var = new kp0(this, zl0Var, i2, eo0Var3, eo0Var4, z);
            this.k = kp0Var;
        } else {
            i2 = i;
            eo0Var3 = eo0Var;
            eo0Var4 = eo0Var2;
            kp0Var.a = zl0Var;
            kp0Var.b = i2;
            kp0Var.c = eo0Var3;
            kp0Var.d = eo0Var4;
            kp0Var.e = z;
        }
        l7 l7Var = kp0Var.f;
        int i9 = eo0Var3.g - i2;
        int i10 = eo0Var4.g - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        da0 da0Var = new da0(i11 * 3);
        da0 da0Var2 = new da0(i11 * 4);
        int i12 = 0;
        da0Var2.e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = da0Var2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = da0Var2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            da0Var2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            da0Var2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            da0Var2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            da0Var2.b = i22;
            int i23 = iArr6[i22];
            int i24 = i21 - i23;
            int i25 = i13;
            int i26 = i17 - i19;
            int[] iArr7 = iArr3;
            if (i24 >= 1 && i26 >= 1) {
                int i27 = 1;
                int i28 = ((i24 + i26) + 1) / 2;
                int i29 = i25 / 2;
                int i30 = i29 + 1;
                iArr7[i30] = i23;
                iArr4[i30] = i21;
                int i31 = i15;
                while (i31 < i28) {
                    int i32 = i24 - i26;
                    int i33 = i28;
                    iArr = iArr4;
                    int i34 = -i31;
                    int i35 = (Math.abs(i32) & 1) == i27 ? 1 : i15;
                    int i36 = i34;
                    while (true) {
                        if (i36 > i31) {
                            break;
                        }
                        if (i36 != i34) {
                            if (i36 != i31) {
                                i4 = i36;
                                iArr2 = iArr5;
                            } else {
                                i4 = i36;
                                iArr2 = iArr5;
                            }
                            i5 = iArr7[(i4 - 1) + i29];
                            i6 = i5 + 1;
                            int i37 = ((i6 - i23) + i19) - i4;
                            int i38 = i37 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                            int i39 = i5;
                            i7 = i37;
                            while (i6 < i21 && i7 < i17 && kp0Var.a(i6, i7)) {
                                i6++;
                                i7++;
                            }
                            iArr7[i29 + i4] = i6;
                            if (i35 == 0) {
                                int i40 = i7;
                                int i41 = i32 - i4;
                                i8 = i24;
                                if (i41 >= i34 + 1 && i41 <= i31 - 1 && iArr[i29 + i41] <= i6) {
                                    iArr2[i15] = i39;
                                    iArr2[1] = i38;
                                    iArr2[c4] = i6;
                                    iArr2[3] = i40;
                                    iArr2[4] = i15;
                                    c = 1;
                                    break;
                                }
                            } else {
                                i8 = i24;
                            }
                            i36 = i4 + 2;
                            iArr5 = iArr2;
                            i24 = i8;
                        } else {
                            i4 = i36;
                            iArr2 = iArr5;
                        }
                        i5 = iArr7[i4 + 1 + i29];
                        i6 = i5;
                        int i372 = ((i6 - i23) + i19) - i4;
                        int i382 = i372 - ((i31 == 0 ? 1 : i15) & (i6 != i5 ? 1 : i15));
                        int i392 = i5;
                        i7 = i372;
                        while (i6 < i21) {
                            i6++;
                            i7++;
                        }
                        iArr7[i29 + i4] = i6;
                        if (i35 == 0) {
                        }
                        i36 = i4 + 2;
                        iArr5 = iArr2;
                        i24 = i8;
                    }
                    if (Math.min(iArr2[c4] - iArr2[i15], iArr2[3] - iArr2[c]) > 0) {
                        int i42 = iArr2[i15];
                        int i43 = iArr2[c];
                        int i44 = iArr2[3] - i43;
                        int i45 = iArr2[c4] - i42;
                        if (i44 != i45) {
                            i45 = Math.min(i45, i44);
                            int i46 = iArr2[4];
                            int i47 = i46 != 0 ? 1 : i15;
                            int i48 = iArr2[3];
                            c2 = 1;
                            int i49 = iArr2[1];
                            int i50 = i48 - i49;
                            int i51 = iArr2[c4];
                            int i52 = iArr2[i15];
                            int i53 = i42 + (((i50 > i51 - i52 ? 1 : i15) | i47) ^ 1);
                            i43 += (((i48 - i49 > i51 - i52 ? 1 : i15) ^ 1) | (i46 != 0 ? 1 : i15)) ^ 1;
                            i42 = i53;
                        } else {
                            c2 = 1;
                        }
                        da0Var.d(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    da0Var2.e(i23, iArr2[i15], i19, iArr2[c2]);
                    da0Var2.e(iArr2[c4], i21, iArr2[3], i17);
                    c3 = c4;
                    i12 = i15;
                    i13 = i25;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c3 = c4;
            i12 = i15;
            i13 = i25;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i54 = i12;
        int i55 = da0Var.b;
        if (i55 % 3 != 0) {
            o80.b("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            da0Var.f(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        da0Var.d(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < da0Var.b) {
            int[] iArr8 = da0Var.a;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                zl0 zl0Var2 = kp0Var.a.j;
                zl0Var2.getClass();
                if ((zl0Var2.g & 2) != 0) {
                    qp0 qp0Var = zl0Var2.l;
                    qp0Var.getClass();
                    qp0 qp0Var2 = qp0Var.u;
                    qp0 qp0Var3 = qp0Var.t;
                    qp0Var3.getClass();
                    if (qp0Var2 != null) {
                        qp0Var2.t = qp0Var3;
                    }
                    qp0Var3.u = qp0Var2;
                    b(l7Var, kp0Var.a, qp0Var3);
                }
                kp0Var.a = e(zl0Var2);
                i57++;
            }
            while (i58 < i62) {
                zl0 d = d((yl0) kp0Var.d.d[kp0Var.b + i58], kp0Var.a);
                kp0Var.a = d;
                if (kp0Var.e) {
                    zl0 zl0Var3 = d.j;
                    zl0Var3.getClass();
                    qp0 qp0Var4 = zl0Var3.l;
                    qp0Var4.getClass();
                    ad0 r = op.r(kp0Var.a);
                    if (r != null) {
                        cd0 cd0Var = new cd0((jd0) l7Var.b, r);
                        kp0Var.a.y0(cd0Var);
                        b(l7Var, kp0Var.a, cd0Var);
                        cd0Var.u = qp0Var4.u;
                        cd0Var.t = qp0Var4;
                        qp0Var4.u = cd0Var;
                    } else {
                        kp0Var.a.y0(qp0Var4);
                    }
                    kp0Var.a.p0();
                    kp0Var.a.v0();
                    zl0 zl0Var4 = kp0Var.a;
                    ln0 ln0Var = rp0.a;
                    if (!zl0Var4.r) {
                        o80.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    rp0.a(zl0Var4, -1, 1);
                } else {
                    d.m = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    zl0 zl0Var5 = kp0Var.a.j;
                    zl0Var5.getClass();
                    kp0Var.a = zl0Var5;
                    eo0 eo0Var5 = kp0Var.c;
                    int i64 = kp0Var.b;
                    yl0 yl0Var = (yl0) eo0Var5.d[i64 + i57];
                    yl0 yl0Var2 = (yl0) kp0Var.d.d[i64 + i58];
                    if (!Intrinsics.a(yl0Var, yl0Var2)) {
                        k(yl0Var, yl0Var2, kp0Var.a);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (zl0 zl0Var6 = ((ig1) this.f).i; zl0Var6 != null && zl0Var6 != ((lp0) this.c); zl0Var6 = zl0Var6.i) {
            i65 |= zl0Var6.g;
            zl0Var6.h = i65;
        }
    }

    public void j() {
        cd0 cd0Var;
        jd0 jd0Var = (jd0) this.b;
        qp0 qp0Var = (v80) this.d;
        for (zl0 zl0Var = ((ig1) this.f).i; zl0Var != null; zl0Var = zl0Var.i) {
            ad0 r = op.r(zl0Var);
            if (r != null) {
                qp0 qp0Var2 = zl0Var.l;
                if (qp0Var2 != null) {
                    cd0 cd0Var2 = (cd0) qp0Var2;
                    ad0 ad0Var = cd0Var2.U;
                    cd0Var2.h1(r);
                    cd0Var = cd0Var2;
                    if (ad0Var != zl0Var) {
                        du0 du0Var = cd0Var2.P;
                        cd0Var = cd0Var2;
                        if (du0Var != null) {
                            ((n50) du0Var).c();
                            cd0Var = cd0Var2;
                        }
                    }
                } else {
                    cd0 cd0Var3 = new cd0(jd0Var, r);
                    zl0Var.y0(cd0Var3);
                    cd0Var = cd0Var3;
                }
                qp0Var.u = cd0Var;
                cd0Var.t = qp0Var;
                qp0Var = cd0Var;
            } else {
                zl0Var.y0(qp0Var);
            }
        }
        jd0 s = jd0Var.s();
        qp0Var.u = s != null ? (v80) s.J.d : null;
        this.e = qp0Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                zl0 zl0Var = (zl0) this.g;
                ig1 ig1Var = (ig1) this.f;
                if (zl0Var == ig1Var) {
                    sb.append("]");
                } else {
                    while (true) {
                        if (zl0Var != null && zl0Var != ig1Var) {
                            sb.append(String.valueOf(zl0Var));
                            if (zl0Var.j == ig1Var) {
                                sb.append("]");
                            } else {
                                sb.append(",");
                                zl0Var = zl0Var.j;
                            }
                        }
                    }
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public l7(jd0 jd0Var) {
        this.b = jd0Var;
        lp0 lp0Var = new lp0();
        lp0Var.h = -1;
        this.c = lp0Var;
        v80 v80Var = new v80(jd0Var);
        this.d = v80Var;
        this.e = v80Var;
        ig1 ig1Var = v80Var.U;
        this.f = ig1Var;
        this.g = ig1Var;
        this.j = new eo0(new am0[16]);
    }
}
