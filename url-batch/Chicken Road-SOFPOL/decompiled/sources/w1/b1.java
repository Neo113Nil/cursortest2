package w1;

import java.util.HashSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final f0 f7595a;

    /* renamed from: b, reason: collision with root package name */
    public final a1 f7596b;

    /* renamed from: c, reason: collision with root package name */
    public final r f7597c;

    /* renamed from: d, reason: collision with root package name */
    public d1 f7598d;

    /* renamed from: e, reason: collision with root package name */
    public final u1 f7599e;

    /* renamed from: f, reason: collision with root package name */
    public y0.l f7600f;

    /* renamed from: g, reason: collision with root package name */
    public o0.e f7601g;

    /* renamed from: h, reason: collision with root package name */
    public o0.e f7602h;
    public final o0.e i;

    /* renamed from: j, reason: collision with root package name */
    public z0 f7603j;

    public b1(f0 f0Var) {
        this.f7595a = f0Var;
        a1 a1Var = new a1();
        a1Var.f8709g = -1;
        this.f7596b = a1Var;
        r rVar = new r(f0Var);
        this.f7597c = rVar;
        this.f7598d = rVar;
        u1 u1Var = rVar.Q;
        this.f7599e = u1Var;
        this.f7600f = u1Var;
        this.i = new o0.e(new y0.m[16]);
    }

    public static final void a(b1 b1Var, y0.l lVar, d1 d1Var) {
        for (y0.l lVar2 = lVar.f8710h; lVar2 != null; lVar2 = lVar2.f8710h) {
            if (lVar2 == b1Var.f7596b) {
                f0 s5 = b1Var.f7595a.s();
                d1Var.f7616t = s5 != null ? s5.F.f7597c : null;
                b1Var.f7598d = d1Var;
                return;
            } else {
                if ((lVar2.f8708f & 2) != 0) {
                    return;
                }
                lVar2.q0(d1Var);
            }
        }
    }

    public static y0.l b(y0.k kVar, y0.l lVar) {
        y0.l lVar2;
        if (kVar instanceof x0) {
            lVar2 = ((x0) kVar).f();
            lVar2.f8708f = e1.f(lVar2);
        } else {
            c cVar = new c();
            cVar.f8708f = e1.d(kVar);
            cVar.f7604r = kVar;
            cVar.f7606t = new HashSet();
            lVar2 = cVar;
        }
        if (lVar2.f8718q) {
            t1.a.b("A ModifierNodeElement cannot return an already attached node from create() ");
        }
        lVar2.f8713l = true;
        y0.l lVar3 = lVar.i;
        if (lVar3 != null) {
            lVar3.f8710h = lVar2;
            lVar2.i = lVar3;
        }
        lVar.i = lVar2;
        lVar2.f8710h = lVar;
        return lVar2;
    }

    public static y0.l c(y0.l lVar) {
        boolean z3 = lVar.f8718q;
        if (z3) {
            o.d0 d0Var = e1.f7636a;
            if (!z3) {
                t1.a.b("autoInvalidateRemovedNode called on unattached node");
            }
            e1.a(lVar, -1, 2);
            lVar.o0();
            lVar.i0();
        }
        y0.l lVar2 = lVar.i;
        y0.l lVar3 = lVar.f8710h;
        if (lVar2 != null) {
            lVar2.f8710h = lVar3;
            lVar.i = null;
        }
        if (lVar3 != null) {
            lVar3.i = lVar2;
            lVar.f8710h = null;
        }
        q6.i.b(lVar3);
        return lVar3;
    }

    public static void h(y0.k kVar, y0.k kVar2, y0.l lVar) {
        if ((kVar instanceof x0) && (kVar2 instanceof x0)) {
            q6.i.c(lVar, "null cannot be cast to non-null type T of androidx.compose.ui.node.NodeChainKt.updateUnsafe");
            ((x0) kVar2).g(lVar);
            if (lVar.f8718q) {
                e1.c(lVar);
                return;
            } else {
                lVar.f8714m = true;
                return;
            }
        }
        if (!(lVar instanceof c)) {
            t1.a.b("Unknown Modifier.Node type");
            return;
        }
        c cVar = (c) lVar;
        if (cVar.f8718q) {
            cVar.t0();
        }
        cVar.f7604r = kVar2;
        cVar.f8708f = e1.d(kVar2);
        if (cVar.f8718q) {
            cVar.r0(false);
        }
        if (lVar.f8718q) {
            e1.c(lVar);
        } else {
            lVar.f8714m = true;
        }
    }

    public final boolean d(int i) {
        return (i & this.f7600f.f8709g) != 0;
    }

    public final void e() {
        for (y0.l lVar = this.f7600f; lVar != null; lVar = lVar.i) {
            lVar.n0();
            if (lVar.f8713l) {
                o.d0 d0Var = e1.f7636a;
                if (!lVar.f8718q) {
                    t1.a.b("autoInvalidateInsertedNode called on unattached node");
                }
                e1.a(lVar, -1, 1);
            }
            if (lVar.f8714m) {
                e1.c(lVar);
            }
            lVar.f8713l = false;
            lVar.f8714m = false;
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
    public final void f(int i, o0.e eVar, o0.e eVar2, y0.l lVar, boolean z3) {
        int i8;
        o0.e eVar3;
        o0.e eVar4;
        int i9;
        int[] iArr;
        int[] iArr2;
        char c8;
        char c9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        z0 z0Var = this.f7603j;
        if (z0Var == null) {
            i8 = i;
            eVar3 = eVar;
            eVar4 = eVar2;
            z0Var = new z0(this, lVar, i8, eVar3, eVar4, z3);
            this.f7603j = z0Var;
        } else {
            i8 = i;
            eVar3 = eVar;
            eVar4 = eVar2;
            z0Var.f7825a = lVar;
            z0Var.f7826b = i8;
            z0Var.f7827c = eVar3;
            z0Var.f7828d = eVar4;
            z0Var.f7829e = z3;
        }
        b1 b1Var = z0Var.f7830f;
        int i15 = eVar3.f5580f - i8;
        int i16 = eVar4.f5580f - i8;
        char c10 = 2;
        int i17 = ((i15 + i16) + 1) / 2;
        m0.n0 n0Var = new m0.n0(i17 * 3);
        m0.n0 n0Var2 = new m0.n0(i17 * 4);
        int i18 = 0;
        n0Var2.e(0, i15, 0, i16);
        int i19 = (i17 * 2) + 1;
        int[] iArr3 = new int[i19];
        int[] iArr4 = new int[i19];
        int[] iArr5 = new int[5];
        while (true) {
            int i20 = n0Var2.f5021b;
            if (i20 == 0) {
                break;
            }
            char c11 = c10;
            int[] iArr6 = n0Var2.f5020a;
            int i21 = i18;
            int i22 = i20 - 1;
            n0Var2.f5021b = i22;
            int i23 = iArr6[i22];
            int i24 = i20 - 2;
            n0Var2.f5021b = i24;
            int i25 = iArr6[i24];
            int i26 = i20 - 3;
            n0Var2.f5021b = i26;
            int i27 = iArr6[i26];
            int i28 = i20 - 4;
            n0Var2.f5021b = i28;
            int i29 = iArr6[i28];
            int i30 = i27 - i29;
            int i31 = i19;
            int i32 = i23 - i25;
            int[] iArr7 = iArr3;
            if (i30 >= 1 && i32 >= 1) {
                int i33 = 1;
                int i34 = ((i30 + i32) + 1) / 2;
                int i35 = i31 / 2;
                int i36 = i35 + 1;
                iArr7[i36] = i29;
                iArr4[i36] = i27;
                int i37 = i21;
                while (i37 < i34) {
                    int i38 = i30 - i32;
                    int i39 = i34;
                    iArr = iArr4;
                    int i40 = -i37;
                    int i41 = (Math.abs(i38) & 1) == i33 ? 1 : i21;
                    int i42 = i40;
                    while (true) {
                        if (i42 > i37) {
                            break;
                        }
                        if (i42 != i40) {
                            if (i42 != i37) {
                                i10 = i42;
                                iArr2 = iArr5;
                            } else {
                                i10 = i42;
                                iArr2 = iArr5;
                            }
                            i11 = iArr7[(i10 - 1) + i35];
                            i12 = i11 + 1;
                            int i43 = ((i12 - i29) + i25) - i10;
                            int i44 = i43 - ((i37 == 0 ? 1 : i21) & (i12 != i11 ? 1 : i21));
                            int i45 = i11;
                            i13 = i43;
                            while (i12 < i27 && i13 < i23 && z0Var.a(i12, i13)) {
                                i12++;
                                i13++;
                            }
                            iArr7[i35 + i10] = i12;
                            if (i41 == 0) {
                                int i46 = i13;
                                int i47 = i38 - i10;
                                i14 = i30;
                                if (i47 >= i40 + 1 && i47 <= i37 - 1 && iArr[i35 + i47] <= i12) {
                                    iArr2[i21] = i45;
                                    iArr2[1] = i44;
                                    iArr2[c11] = i12;
                                    iArr2[3] = i46;
                                    iArr2[4] = i21;
                                    c8 = 1;
                                    break;
                                }
                            } else {
                                i14 = i30;
                            }
                            i42 = i10 + 2;
                            iArr5 = iArr2;
                            i30 = i14;
                        } else {
                            i10 = i42;
                            iArr2 = iArr5;
                        }
                        i11 = iArr7[i10 + 1 + i35];
                        i12 = i11;
                        int i432 = ((i12 - i29) + i25) - i10;
                        int i442 = i432 - ((i37 == 0 ? 1 : i21) & (i12 != i11 ? 1 : i21));
                        int i452 = i11;
                        i13 = i432;
                        while (i12 < i27) {
                            i12++;
                            i13++;
                        }
                        iArr7[i35 + i10] = i12;
                        if (i41 == 0) {
                        }
                        i42 = i10 + 2;
                        iArr5 = iArr2;
                        i30 = i14;
                    }
                    if (Math.min(iArr2[c11] - iArr2[i21], iArr2[3] - iArr2[c8]) > 0) {
                        int i48 = iArr2[i21];
                        int i49 = iArr2[c8];
                        int i50 = iArr2[3] - i49;
                        int i51 = iArr2[c11] - i48;
                        if (i50 != i51) {
                            i51 = Math.min(i51, i50);
                            int i52 = iArr2[4];
                            int i53 = i52 != 0 ? 1 : i21;
                            int i54 = iArr2[3];
                            c9 = 1;
                            int i55 = iArr2[1];
                            int i56 = i54 - i55;
                            int i57 = iArr2[c11];
                            int i58 = iArr2[i21];
                            int i59 = i48 + (((i56 > i57 - i58 ? 1 : i21) | i53) ^ 1);
                            i49 += (((i54 - i55 > i57 - i58 ? 1 : i21) ^ 1) | (i52 != 0 ? 1 : i21)) ^ 1;
                            i48 = i59;
                        } else {
                            c9 = 1;
                        }
                        n0Var.d(i48, i49, i51);
                    } else {
                        c9 = c8;
                    }
                    n0Var2.e(i29, iArr2[i21], i25, iArr2[c9]);
                    n0Var2.e(iArr2[c11], i27, iArr2[3], i23);
                    c10 = c11;
                    i18 = i21;
                    i19 = i31;
                    iArr3 = iArr7;
                    iArr4 = iArr;
                    iArr5 = iArr2;
                }
            }
            iArr = iArr4;
            iArr2 = iArr5;
            c10 = c11;
            i18 = i21;
            i19 = i31;
            iArr3 = iArr7;
            iArr4 = iArr;
            iArr5 = iArr2;
        }
        int i60 = i18;
        int i61 = n0Var.f5021b;
        if (i61 % 3 != 0) {
            t1.a.b("Array size not a multiple of 3");
        }
        if (i61 > 3) {
            i9 = i60;
            n0Var.f(i9, i61 - 3);
        } else {
            i9 = i60;
        }
        n0Var.d(i15, i16, i9);
        int i62 = i9;
        int i63 = i62;
        int i64 = i63;
        while (i62 < n0Var.f5021b) {
            int[] iArr8 = n0Var.f5020a;
            int i65 = iArr8[i62];
            int i66 = iArr8[i62 + 2];
            int i67 = i65 - i66;
            int i68 = iArr8[i62 + 1] - i66;
            i62 += 3;
            while (i63 < i67) {
                y0.l lVar2 = z0Var.f7825a.i;
                q6.i.b(lVar2);
                if ((lVar2.f8708f & 2) != 0) {
                    d1 d1Var = lVar2.f8712k;
                    q6.i.b(d1Var);
                    d1 d1Var2 = d1Var.f7616t;
                    d1 d1Var3 = d1Var.f7615s;
                    q6.i.b(d1Var3);
                    if (d1Var2 != null) {
                        d1Var2.f7615s = d1Var3;
                    }
                    d1Var3.f7616t = d1Var2;
                    a(b1Var, z0Var.f7825a, d1Var3);
                }
                z0Var.f7825a = c(lVar2);
                i63++;
            }
            while (i64 < i68) {
                y0.l b8 = b((y0.k) z0Var.f7828d.f5578d[z0Var.f7826b + i64], z0Var.f7825a);
                z0Var.f7825a = b8;
                if (z0Var.f7829e) {
                    y0.l lVar3 = b8.i;
                    q6.i.b(lVar3);
                    d1 d1Var4 = lVar3.f8712k;
                    q6.i.b(d1Var4);
                    v g3 = f.g(z0Var.f7825a);
                    if (g3 != null) {
                        x xVar = new x(b1Var.f7595a, g3);
                        z0Var.f7825a.q0(xVar);
                        a(b1Var, z0Var.f7825a, xVar);
                        xVar.f7616t = d1Var4.f7616t;
                        xVar.f7615s = d1Var4;
                        d1Var4.f7616t = xVar;
                    } else {
                        z0Var.f7825a.q0(d1Var4);
                    }
                    z0Var.f7825a.h0();
                    z0Var.f7825a.n0();
                    y0.l lVar4 = z0Var.f7825a;
                    o.d0 d0Var = e1.f7636a;
                    if (!lVar4.f8718q) {
                        t1.a.b("autoInvalidateInsertedNode called on unattached node");
                    }
                    e1.a(lVar4, -1, 1);
                } else {
                    b8.f8713l = true;
                }
                i64++;
            }
            while (true) {
                int i69 = i66 - 1;
                if (i66 > 0) {
                    y0.l lVar5 = z0Var.f7825a.i;
                    q6.i.b(lVar5);
                    z0Var.f7825a = lVar5;
                    o0.e eVar5 = z0Var.f7827c;
                    int i70 = z0Var.f7826b;
                    y0.k kVar = (y0.k) eVar5.f5578d[i70 + i63];
                    y0.k kVar2 = (y0.k) z0Var.f7828d.f5578d[i70 + i64];
                    if (!q6.i.a(kVar, kVar2)) {
                        h(kVar, kVar2, z0Var.f7825a);
                    }
                    i63++;
                    i64++;
                    i66 = i69;
                }
            }
        }
        int i71 = i9;
        for (y0.l lVar6 = this.f7599e.f8710h; lVar6 != null && lVar6 != this.f7596b; lVar6 = lVar6.f8710h) {
            i71 |= lVar6.f8708f;
            lVar6.f8709g = i71;
        }
    }

    public final void g() {
        f0 f0Var;
        x xVar;
        y0.l lVar = this.f7599e.f8710h;
        d1 d1Var = this.f7597c;
        y0.l lVar2 = lVar;
        while (true) {
            f0Var = this.f7595a;
            if (lVar2 == null) {
                break;
            }
            v g3 = f.g(lVar2);
            if (g3 != null) {
                d1 d1Var2 = lVar2.f8712k;
                if (d1Var2 != null) {
                    x xVar2 = (x) d1Var2;
                    v vVar = xVar2.Q;
                    xVar2.e1(g3);
                    xVar = xVar2;
                    if (vVar != lVar2) {
                        j1 j1Var = xVar2.L;
                        xVar = xVar2;
                        if (j1Var != null) {
                            ((x1.j1) j1Var).invalidate();
                            xVar = xVar2;
                        }
                    }
                } else {
                    x xVar3 = new x(f0Var, g3);
                    lVar2.q0(xVar3);
                    xVar = xVar3;
                }
                d1Var.f7616t = xVar;
                xVar.f7615s = d1Var;
                d1Var = xVar;
            } else {
                lVar2.q0(d1Var);
            }
            lVar2 = lVar2.f8710h;
        }
        f0 s5 = f0Var.s();
        d1Var.f7616t = s5 != null ? s5.F.f7597c : null;
        this.f7598d = d1Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        y0.l lVar = this.f7600f;
        u1 u1Var = this.f7599e;
        if (lVar != u1Var) {
            while (true) {
                if (lVar == null || lVar == u1Var) {
                    break;
                }
                sb.append(String.valueOf(lVar));
                if (lVar.i == u1Var) {
                    sb.append("]");
                    break;
                }
                sb.append(",");
                lVar = lVar.i;
            }
        } else {
            sb.append("]");
        }
        String sb2 = sb.toString();
        q6.i.d(sb2, "toString(...)");
        return sb2;
    }
}
