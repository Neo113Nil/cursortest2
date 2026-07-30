package defpackage;

import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class fs1 {
    public final i91 a;
    public final es1 b;
    public final n21 c;
    public ks1 d;
    public final os2 e;
    public ul1 f;
    public eo1 g;
    public eo1 h;
    public final eo1 i;
    public ds1 j;

    public fs1(i91 i91Var) {
        this.a = i91Var;
        es1 es1Var = new es1();
        es1Var.p = -1;
        this.b = es1Var;
        n21 n21Var = new n21(i91Var);
        this.c = n21Var;
        this.d = n21Var;
        os2 os2Var = n21Var.a0;
        this.e = os2Var;
        this.f = os2Var;
        this.i = new eo1(new vl1[16]);
    }

    public static final void a(fs1 fs1Var, ul1 ul1Var, ks1 ks1Var) {
        for (ul1 ul1Var2 = ul1Var.q; ul1Var2 != null; ul1Var2 = ul1Var2.q) {
            if (ul1Var2 == fs1Var.b) {
                i91 u = fs1Var.a.u();
                ks1Var.C = u != null ? u.P.c : null;
                fs1Var.d = ks1Var;
                return;
            } else {
                if ((ul1Var2.o & 2) != 0) {
                    return;
                }
                ul1Var2.F0(ks1Var);
            }
        }
    }

    public static ul1 b(tl1 tl1Var, ul1 ul1Var) {
        ul1 ul1Var2;
        if (tl1Var instanceof cm1) {
            ul1Var2 = ((cm1) tl1Var).i();
            ul1Var2.o = ls1.f(ul1Var2);
        } else {
            fn fnVar = new fn();
            fnVar.o = ls1.d(tl1Var);
            fnVar.A = tl1Var;
            fnVar.C = new HashSet();
            ul1Var2 = fnVar;
        }
        if (ul1Var2.z) {
            h21.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        ul1Var2.u = true;
        ul1 ul1Var3 = ul1Var.r;
        if (ul1Var3 != null) {
            ul1Var3.q = ul1Var2;
            ul1Var2.r = ul1Var3;
        }
        ul1Var.r = ul1Var2;
        ul1Var2.q = ul1Var;
        return ul1Var2;
    }

    public static ul1 c(ul1 ul1Var) {
        boolean z = ul1Var.z;
        if (z) {
            hn1 hn1Var = ls1.a;
            if (!z) {
                h21.b("autoInvalidateRemovedNode called on unattached node");
            }
            ls1.a(ul1Var, -1, 2);
            ul1Var.D0();
            ul1Var.x0();
        }
        ul1 ul1Var2 = ul1Var.r;
        ul1 ul1Var3 = ul1Var.q;
        if (ul1Var2 != null) {
            ul1Var2.q = ul1Var3;
            ul1Var.r = null;
        }
        if (ul1Var3 != null) {
            ul1Var3.r = ul1Var2;
            ul1Var.q = null;
        }
        ul1Var3.getClass();
        return ul1Var3;
    }

    public static void h(tl1 tl1Var, tl1 tl1Var2, ul1 ul1Var) {
        if ((tl1Var instanceof cm1) && (tl1Var2 instanceof cm1)) {
            ul1Var.getClass();
            ((cm1) tl1Var2).m(ul1Var);
            if (ul1Var.z) {
                ls1.c(ul1Var);
                return;
            } else {
                ul1Var.v = true;
                return;
            }
        }
        if (!(ul1Var instanceof fn)) {
            h21.b("Unknown Modifier.Node type");
            return;
        }
        fn fnVar = (fn) ul1Var;
        if (fnVar.z) {
            fnVar.H0();
        }
        fnVar.A = tl1Var2;
        fnVar.o = ls1.d(tl1Var2);
        if (fnVar.z) {
            fnVar.G0(false);
        }
        if (ul1Var.z) {
            ls1.c(ul1Var);
        } else {
            ul1Var.v = true;
        }
    }

    public final boolean d(int i) {
        return (this.f.p & i) != 0;
    }

    public final void e() {
        for (ul1 ul1Var = this.f; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.C0();
            if (ul1Var.u) {
                hn1 hn1Var = ls1.a;
                if (!ul1Var.z) {
                    h21.b("autoInvalidateInsertedNode called on unattached node");
                }
                ls1.a(ul1Var, -1, 1);
            }
            if (ul1Var.v) {
                ls1.c(ul1Var);
            }
            ul1Var.u = false;
            ul1Var.v = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018f, code lost:
    
        r27 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0194, code lost:
    
        r25 = r22 + (r25 & r27);
        r22 = r11;
        r11 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x019e, code lost:
    
        if (r14 <= r7) goto L186;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01a0, code lost:
    
        if (r11 <= r15) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01a2, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01ae, code lost:
    
        if (r0.a(r14 - 1, r27 - 1) == false) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01b0, code lost:
    
        r14 = r14 - 1;
        r11 = r27 - 1;
        r13 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01bb, code lost:
    
        r20[r17 + r28] = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01bf, code lost:
    
        if (r24 == 0) goto L181;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x01c1, code lost:
    
        r11 = r19 - r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01c3, code lost:
    
        if (r11 < r12) goto L182;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c5, code lost:
    
        if (r11 > r3) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01cb, code lost:
    
        if (r16[r17 + r11] < r14) goto L184;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01cd, code lost:
    
        r26[r33] = r14;
        r11 = 1;
        r26[1] = r27;
        r26[r32] = r22;
        r26[3] = r25;
        r26[4] = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0262, code lost:
    
        r13 = r28 + 2;
        r11 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01b7, code lost:
    
        r27 = r11;
        r28 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0192, code lost:
    
        r27 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x018b, code lost:
    
        r25 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0179, code lost:
    
        r11 = r20[(r13 + 1) + r17];
        r14 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x016c, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0177, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0268, code lost:
    
        r3 = r3 + 1;
        r12 = r20;
        r11 = r21;
        r13 = r26;
        r14 = r29;
        r35 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0152, code lost:
    
        r11 = r33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ce, code lost:
    
        if (r16[(r11 + 1) + r17] > r16[(r25 - 1) + r17]) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0148, code lost:
    
        r26 = r13;
        r29 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x014e, code lost:
    
        if ((r19 & 1) != 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0150, code lost:
    
        r11 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0154, code lost:
    
        r13 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0155, code lost:
    
        if (r13 > r3) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0157, code lost:
    
        if (r13 == r12) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0159, code lost:
    
        if (r13 == r3) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x015b, code lost:
    
        r24 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0169, code lost:
    
        if (r20[(r13 + 1) + r17] >= r20[(r13 - 1) + r17]) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x016e, code lost:
    
        r11 = r20[(r13 - 1) + r17];
        r14 = r11 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0180, code lost:
    
        r22 = r10 - ((r6 - r14) - r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0186, code lost:
    
        if (r3 == 0) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0188, code lost:
    
        r25 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x018d, code lost:
    
        if (r14 != r11) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(int i, eo1 eo1Var, eo1 eo1Var2, ul1 ul1Var, boolean z) {
        int i2;
        eo1 eo1Var3;
        eo1 eo1Var4;
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
        ds1 ds1Var = this.j;
        if (ds1Var == null) {
            i2 = i;
            eo1Var3 = eo1Var;
            eo1Var4 = eo1Var2;
            ds1Var = new ds1(this, ul1Var, i2, eo1Var3, eo1Var4, z);
            this.j = ds1Var;
        } else {
            i2 = i;
            eo1Var3 = eo1Var;
            eo1Var4 = eo1Var2;
            ds1Var.a = ul1Var;
            ds1Var.b = i2;
            ds1Var.c = eo1Var3;
            ds1Var.d = eo1Var4;
            ds1Var.e = z;
        }
        fs1 fs1Var = ds1Var.f;
        int i9 = eo1Var3.o - i2;
        int i10 = eo1Var4.o - i2;
        char c3 = 2;
        int i11 = ((i9 + i10) + 1) / 2;
        y31 y31Var = new y31(i11 * 3);
        y31 y31Var2 = new y31(i11 * 4);
        int i12 = 0;
        y31Var2.e(0, i9, 0, i10);
        int i13 = (i11 * 2) + 1;
        int[] iArr3 = new int[i13];
        int[] iArr4 = new int[i13];
        int[] iArr5 = new int[5];
        while (true) {
            int i14 = y31Var2.b;
            if (i14 == 0) {
                break;
            }
            char c4 = c3;
            int[] iArr6 = y31Var2.a;
            int i15 = i12;
            int i16 = i14 - 1;
            y31Var2.b = i16;
            int i17 = iArr6[i16];
            int i18 = i14 - 2;
            y31Var2.b = i18;
            int i19 = iArr6[i18];
            int i20 = i14 - 3;
            y31Var2.b = i20;
            int i21 = iArr6[i20];
            int i22 = i14 - 4;
            y31Var2.b = i22;
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
                            while (i6 < i21 && i7 < i17 && ds1Var.a(i6, i7)) {
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
                        y31Var.d(i42, i43, i45);
                    } else {
                        c2 = c;
                    }
                    y31Var2.e(i23, iArr2[i15], i19, iArr2[c2]);
                    y31Var2.e(iArr2[c4], i21, iArr2[3], i17);
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
        int i55 = y31Var.b;
        if (i55 % 3 != 0) {
            h21.b("Array size not a multiple of 3");
        }
        if (i55 > 3) {
            i3 = i54;
            y31Var.f(i3, i55 - 3);
        } else {
            i3 = i54;
        }
        y31Var.d(i9, i10, i3);
        int i56 = i3;
        int i57 = i56;
        int i58 = i57;
        while (i56 < y31Var.b) {
            int[] iArr8 = y31Var.a;
            int i59 = iArr8[i56];
            int i60 = iArr8[i56 + 2];
            int i61 = i59 - i60;
            int i62 = iArr8[i56 + 1] - i60;
            i56 += 3;
            while (i57 < i61) {
                ul1 ul1Var2 = ds1Var.a.r;
                ul1Var2.getClass();
                if ((ul1Var2.o & 2) != 0) {
                    ks1 ks1Var = ul1Var2.t;
                    ks1Var.getClass();
                    ks1 ks1Var2 = ks1Var.C;
                    ks1 ks1Var3 = ks1Var.B;
                    ks1Var3.getClass();
                    if (ks1Var2 != null) {
                        ks1Var2.B = ks1Var3;
                    }
                    ks1Var3.C = ks1Var2;
                    a(fs1Var, ds1Var.a, ks1Var3);
                }
                ds1Var.a = c(ul1Var2);
                i57++;
            }
            while (i58 < i62) {
                ul1 b = b((tl1) ds1Var.d.m[ds1Var.b + i58], ds1Var.a);
                ds1Var.a = b;
                if (ds1Var.e) {
                    ul1 ul1Var3 = b.r;
                    ul1Var3.getClass();
                    ks1 ks1Var4 = ul1Var3.t;
                    ks1Var4.getClass();
                    a91 d = s03.d(ds1Var.a);
                    if (d != null) {
                        c91 c91Var = new c91(fs1Var.a, d);
                        ds1Var.a.F0(c91Var);
                        a(fs1Var, ds1Var.a, c91Var);
                        c91Var.C = ks1Var4.C;
                        c91Var.B = ks1Var4;
                        ks1Var4.C = c91Var;
                    } else {
                        ds1Var.a.F0(ks1Var4);
                    }
                    ds1Var.a.w0();
                    ds1Var.a.C0();
                    ul1 ul1Var4 = ds1Var.a;
                    hn1 hn1Var = ls1.a;
                    if (!ul1Var4.z) {
                        h21.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    ls1.a(ul1Var4, -1, 1);
                } else {
                    b.u = true;
                }
                i58++;
            }
            while (true) {
                int i63 = i60 - 1;
                if (i60 > 0) {
                    ul1 ul1Var5 = ds1Var.a.r;
                    ul1Var5.getClass();
                    ds1Var.a = ul1Var5;
                    eo1 eo1Var5 = ds1Var.c;
                    int i64 = ds1Var.b;
                    tl1 tl1Var = (tl1) eo1Var5.m[i64 + i57];
                    tl1 tl1Var2 = (tl1) ds1Var.d.m[i64 + i58];
                    if (!Intrinsics.b(tl1Var, tl1Var2)) {
                        h(tl1Var, tl1Var2, ds1Var.a);
                    }
                    i57++;
                    i58++;
                    i60 = i63;
                }
            }
        }
        int i65 = i3;
        for (ul1 ul1Var6 = this.e.q; ul1Var6 != null && ul1Var6 != this.b; ul1Var6 = ul1Var6.q) {
            i65 |= ul1Var6.o;
            ul1Var6.p = i65;
        }
    }

    public final void g() {
        i91 i91Var;
        c91 c91Var;
        ul1 ul1Var = this.e.q;
        ks1 ks1Var = this.c;
        ul1 ul1Var2 = ul1Var;
        while (true) {
            i91Var = this.a;
            if (ul1Var2 == null) {
                break;
            }
            a91 d = s03.d(ul1Var2);
            if (d != null) {
                ks1 ks1Var2 = ul1Var2.t;
                if (ks1Var2 != null) {
                    c91 c91Var2 = (c91) ks1Var2;
                    a91 a91Var = c91Var2.a0;
                    c91Var2.s1(d);
                    c91Var = c91Var2;
                    if (a91Var != ul1Var2) {
                        qx1 qx1Var = c91Var2.U;
                        c91Var = c91Var2;
                        if (qx1Var != null) {
                            ((fw0) qx1Var).c();
                            c91Var = c91Var2;
                        }
                    }
                } else {
                    c91 c91Var3 = new c91(i91Var, d);
                    ul1Var2.F0(c91Var3);
                    c91Var = c91Var3;
                }
                ks1Var.C = c91Var;
                c91Var.B = ks1Var;
                ks1Var = c91Var;
            } else {
                ul1Var2.F0(ks1Var);
            }
            ul1Var2 = ul1Var2.q;
        }
        i91 u = i91Var.u();
        ks1Var.C = u != null ? u.P.c : null;
        this.d = ks1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        ul1 ul1Var = this.f;
        os2 os2Var = this.e;
        if (ul1Var != os2Var) {
            while (true) {
                if (ul1Var == null || ul1Var == os2Var) {
                    break;
                }
                sb.append(String.valueOf(ul1Var));
                if (ul1Var.r == os2Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                ul1Var = ul1Var.r;
            }
        } else {
            sb.append("]");
        }
        return sb.toString();
    }
}
